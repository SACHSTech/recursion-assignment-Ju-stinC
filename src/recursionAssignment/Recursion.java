package recursionAssignment;

public class Recursion {

  public static int count7(int n) {

    // base case
    if (n < 0 || n == 0) {

      return 0;
      
    }else if (n % 10 == 7) {
      // recursive case
      return 1 + Recursion.count7(n / 10);

    }else {
      
      return 0 + Recursion.count7(n / 10);

    }

  }

  public static String changePi(String str) {

    // base case
    if (str.length() < 2) {

      return str;

    }else if (str.substring(0, 2).equals("pi")) {
      // recursive case
      return "3.14" + Recursion.changePi(str.substring(2)); 

    }else {

      return str.charAt(0) + Recursion.changePi(str.substring(1));

    }

    }

  public static boolean array220(int[] intNums, int index) {

    return true;

  }

}
