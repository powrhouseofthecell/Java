class Base {

  public int x;

  Base() {
    System.out.println("Base class no args constructor");
  }

  Base(int a) {
    System.out.println("Base constructor with args a = " + a);
  }

  public int getX() {
    return x;
  }

  public void setX(int xVal) {
    x = xVal;
  }
}

class Derived extends Base {

  public int y;

  Derived() {
    super(10);
    System.out.println("Derived class not args constructor");
  }

  public int getY() {
    return y;
  }

  public void setY(int yVal) {
    y = yVal;
  }
}

public class Inheritance {

  public static void main(String[] args) {
    //Base b = new Base();
    Derived d = new Derived();
    System.out.println(d.getY());
    //
    //b.x = 10;
    //d.y = 20;
    //System.out.println(b.getX());
    //System.out.println(d.getX()); // set in b not d
    //d.x = 100;
    //System.out.println(d.getX());
    //

  }
}
