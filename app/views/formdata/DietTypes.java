package views.formdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A helper class to manage diet types.
 */
public class DietTypes {

  private static String[] types = {"Chicken", "Fish", "Beef", "Dairy", "Gluten"};


  /**
   * Gets a map of diet types initialized to false.
   * @return A map of diet types.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> dietTypes = new HashMap<>();
    for (String type : types) {
      dietTypes.put(type, false);
    }
    return dietTypes;
  }

  /**
   * Tests if the given type is a valid diet type.
   * @param type The diet type to test.
   * @return True if valid diet type, false otherwise.
   */
  public static boolean isType(String type) {
    return getTypes().containsKey(type);
  }


  /**
   * Gets a map of diet types with the specified diet types selected.
   * @param selectedTypes A list of the selected diet types.
   * @return A map of diet types.
   */
  public static Map<String, Boolean> getTypes(List<String> selectedTypes) {
    Map<String, Boolean> dietTypes = getTypes();
    for (String type : selectedTypes) {
      if (isType(type)) {
        dietTypes.put(type, true);
      }
    }
    return dietTypes;
  }
}
