class Student {

  private String name;
  private int roll;

  public String getName() {
    return name;
  }

  public int getRoll() {
    return roll;
  }

  public void setName(String nameVal) {
    name = nameVal;
  }

  public void setRoll(int rollVal) {
    roll = rollVal;
  }
}

public class GettersAndSetters {

  public static void main(String[] args) {
    System.out.println("Hello");
    Student stu1 = new Student();
    stu1.setName("Zuhaib");
    stu1.setRoll(29);
    System.out.println(stu1.getName());
    System.out.println(stu1.getRoll());
    //
    //    stu1.roll = 1;
    //    stu1.name = "ABCDEF";
    //    System.out.println(stu1.name);
    //    System.out.println(stu1.roll);
    //
  }
}
