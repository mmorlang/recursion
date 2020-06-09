package edu.cnm.deepdive;

public class Factorials {

  public static long computeRecursive(int i) {
    long result;
    if(i < 0 )  {
      throw new IllegalArgumentException();
    }
    if(i == 0) {
      result = 1;
    } else {
      result = i * computeRecursive(i -1);
    }
    return result;
  }

}
