import java.util.Scanner;

public class Inputs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num1: ");
    int a8 = sc.nextInt();
    System.out.println("Enter num2: ");
    int a10 = sc.nextInt();
    System.out.println(a8 + a10);
    // String str33 = sc.next(); // a single word
    // String str34 = sc.nextLine(); // whole line
    sc.close();
  }
}
