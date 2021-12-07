import java.util.*;

class max {

  public static void main(String ar[]) {
    int num1, num2;
    System.out.println("Enter any two numbers");
    Scanner sc = new Scanner(System.in);
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if (num1 > num2) {
      System.out.println(num1 + " is a maximum number");
    } else if (num2 > num1) {
      System.out.println(num2 + " is a maximum number");
    } else {
      System.out.println(num1 + " and " + num2 + " are equal");
    }
    sc.close();
  }
}
