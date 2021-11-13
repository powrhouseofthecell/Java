public class HereAndThere {

  static int sum(int... args) {
    // args will be an array
    int res = 0;
    for (int el : args) {
      // args array can be empty as well
      res += el;
    }
    return res;
  }

  public static void main(String[] args) {
    // Parsing string to int
    // String numStr = "123";
    // int numInt = 7;
    // int numInt2 = Integer.parseInt(numStr);
    // System.out.println(numInt2 + numInt);

    // using VarArgs
    // int a1 = sum(1);
    // int a2 = sum(4, 5, 6, 12341224);
    // int a3 = sum(7, 8, 9, 10, 11, 12);
    // int a4 = sum(300, 200, 100, 50, 10);
    // int a5 = sum();
    // System.out.printf("The results are %d %d %d %d", a1, a2, a3, a4);
  }
}
