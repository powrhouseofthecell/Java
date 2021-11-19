class SuperClass {

  public void a1() {
    System.out.println("A1, Method of SuperClass");
  }

  public void a2() {
    System.out.println("A2, Method of SuperClass");
  }
}

class SubClass extends SuperClass {

  public void a3() {
    System.out.println("A2, Method of SubClass");
  }

  public void a4() {
    System.out.println("A2, Method of SubClass");
  }
}

public class DynamicMethodDispatch {

  public static void main(String[] args) {
    SuperClass obj = new SubClass();
    //SubClass obj2 = new SuperClass();

    //Methods that are in SuperClass only.
    obj.a1();
    obj.a2();
    //obj.a3(); // undefined for the type SuperClass.
  }
}
