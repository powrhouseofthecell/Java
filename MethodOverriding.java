class A {

  public String meth() {
    return "This is the method of A class";
  }

  public int someMeth() {
    return 123;
  }
}

class B extends A {

  // method overriding
  public String meth() {
    return "This is the method of B class";
  }

  public int meth1() {
    return 1;
  }
}

public class MethodOverriding {

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    System.out.println(a.meth());
    System.out.println(b.meth());
  }
}
