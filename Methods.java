public class Methods {

  static int sum(int x, int y) {
    return x + y;
  }

  // static float sum(int a, int b) {
  // System.out.println("This is an overloaded function");
  // return 10.04F;
  // }

  float sum(int x) {
    return x;
  }

  public static void main(String[] args) {
    System.out.println(sum(10, 20));
    // System.out.println(sum(10)); // cannot make a static refrence to a non static method
    Methods obj0 = new Methods();
    // the float sum method will be created as many times we create a new instance of the Methods class
    // but the static int sum class will only be created once
    // Methods obj1 = new Methods();
    // Methods obj2 = new Methods();
    System.out.println(obj0.sum(10));
  }
}
