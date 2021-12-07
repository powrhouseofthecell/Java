import java.util.Scanner;

class Circle {

  static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    System.out.print("Enter the radius: ");
    double radius = sc.nextDouble();
    double area = Math.PI * (radius * radius);
    System.out.println("The area of circle is: " + area);
  }
}
