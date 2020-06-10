package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive(String input) {

    /** @return command returns the length of the current string after it has been evaluated by its conditions.*/

     return input.length() <= 1
        || (
        input.charAt(0) == input.charAt(input.length() - 1)
            && testRecursive(input.substring(1, input.length() - 1))
    );
  }

/** @testDenormalized modifies current string by removing all white space and all uppercase */
/** @return returns a string that has been modified so that it may be processed by the testRecursive method*/

public static boolean testDenormalized(String input) {
  String normalized = input.replaceAll("[\\W_]+", "").toLowerCase();
  return testRecursive(normalized);
}

  public static boolean testIterative(String input) {
  boolean isPalindrome = true;
  double x = 0, y;
  for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
    if (input.charAt(j) != input.charAt(j)) {
      isPalindrome = false;
      break;
    }
  }
  return isPalindrome;
  }

}
