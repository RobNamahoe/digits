package views.formdata;

import java.util.HashMap;
import java.util.Map;

/**
 * A class that represents telephone types.
 */
public class TelephoneTypes {

  private static Map<String, Boolean> types = new HashMap<>();

  /**
   * Returns a map where the strings indicate acceptable telephone types and the booleans are all false.
   * @return A map of telephone types with boolean values set to false.
   */
  public static Map<String, Boolean> getTypes() {
    types.put("Home", false);
    types.put("Mobile", false);
    return types;
  }


  /**
   * Checks if the given type is an acceptable telephone type.
   * @param type The type.
   * @return True if it is a valid telephone type, false otherwise.
   */
  public static boolean isType(String type) {
    return types.containsKey(type);
  }

  /**
   * Returns a map where the strings indicate acceptable telephone types and the boolean of the passed string is true.
   * @param type The type to select.
   * @return A map of telephone types with the selected type selected true.
   */
  public static Map<String, Boolean> getTypes(String type) {
    types.put("Home", type.equals("Home"));
    types.put("Mobile", type.equals("Mobile"));
    return types;
  }


}
