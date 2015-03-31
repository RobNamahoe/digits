package views.formdata;

import java.util.HashMap;
import java.util.Map;

/**
 * A helper class to manage telephone types.
 */
public class TelephoneTypes {

  private static String[] types = {"Home", "Work", "Mobile"};

  /**
   * Get a map of the telephone types initialized to false.
   * @return A map of telephone types.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> telephoneTypeMap = new HashMap<>();
    for (String type : types) {
      telephoneTypeMap.put(type, false);
    }
    return telephoneTypeMap;
  }

  /**
   * Tests if the given type is a valid telephone type.
   * @param type The telephone type to test.
   * @return True if valid telephone type, false otherwise.
   */
  public static boolean isType(String type) {
    return getTypes().containsKey(type);
  }

  /**
   * Gets a map of the telephone types with the specified type selected.
   * @param type The selected type.
   * @return A map of telephone types.
   */
  public static Map<String, Boolean> getTypes(String type) {
    Map<String, Boolean> telephoneTypeMap = getTypes();
    if (isType(type)) {
      telephoneTypeMap.put(type, true);
    }
    return telephoneTypeMap;
  }

}
