public class Methods {

  static int sum(int x, int y) {
    return x + y;
  }

  //static float sum(int a, int b) {
  //System.out.println("This is an overloaded function");
  //return 10.04F;
  //}

  static float sum(int x) {
    return x;
  }

  public static void main(String[] args) {
    System.out.println(sum(10, 20));
  }
}
