class myClass {

  int id;
  String name;

  public String details() {
    return "The name under the id " + id + " is " + name;
  }
}

public class OOP {

  public static void main(String[] args) {
    myClass obj = new myClass();
    obj.name = "Zuhaib";
    obj.id = 12;
    System.out.println(obj.id);
    System.out.println(obj.name);
  }
}
