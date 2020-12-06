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

    if (str.equals("")) {

      return str;

    }else {

      return "x3.14x";

    }

    }

}
