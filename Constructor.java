class Student2 {

  private String name;
  private int roll;

  public Student2() {
    name = "No name given";
    roll = 00000;
  }

  // Constructor Overloading

  public Student2(String nameVal, int rollVal) {
    name = nameVal;
    roll = rollVal;
  }

  public String getName() {
    return name;
  }

  public int getRoll() {
    return roll;
  }
}

public class Constructor {

  public static void main(String[] args) {
    Student2 stu2 = new Student2("Otir", 52);
    Student2 stu21 = new Student2();
    System.out.println(stu2.getName());
    System.out.println(stu2.getRoll());
    System.out.println("=== === ===");
    System.out.println(stu21.getName());
    System.out.println(stu21.getRoll());
  }
}
