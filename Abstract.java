abstract class Parent {

  public abstract int func();

  public abstract String func1();

  public int meth() {
    return 1110010;
  }
}

abstract class Child extends Parent {

  public int func() {
    return 10;
  }
}

class Child2 extends Child {

  public String func1() {
    return "Implemented func 1 in Child2";
  }
}

public class Abstract {

  public static void main(String[] args) {
    //  Child c = new Child();
    // Parent p = new Parent();
    //  c.func2();
    Child2 c2 = new Child2();
    System.out.println(c2.func());
    System.out.println(c2.func1());
    System.out.println(c2.meth());
  }
}
