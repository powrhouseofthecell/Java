import java.util.Scanner;

class GreetWithMarks {

  public static void main(String[] args) {
    int num;
    System.out.println("Enter the marks of student");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    if (num > 1 && num <= 34) {
      System.out.println("Fail");
    } else if (num > 35 && num <= 60) {
      System.out.println("U have got C grade");
    } else if (num > 61 && num <= 70) {
      System.out.println("U have got B grade");
    } else if (num > 71 && num <= 80) {
      System.out.println("U have got A grade");
    } else if (num > 81 && num < 100) {
      System.out.println("U have got A+ grade");
    } else {
      System.out.println("You have enter wrong value");
    }
    sc.close();
  }
}
