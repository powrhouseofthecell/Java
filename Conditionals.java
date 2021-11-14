import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {
    System.out.print("Enter your age: ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    // switch (age) {
    //    case 18:
    //       System.out.println("You can vote");
    //       break;
    //    case 40:
    //       System.out.println("Get serious");
    //       break;
    //    default:
    //       System.out.println("Nothing here");
    //       break;
    // }

    // Enhanced switch
    switch (age) {
      case 18 -> System.out.println("You can vote");
      case 40 -> System.out.println("Get serious");
      default -> System.out.println("Nothing here");
    }

    // if (true) {
    // System.out.println("Sorry");
    // } else if (1 < 2) {
    // System.out.println("IDK why I am doing this");
    // } else {
    // System.out.println("Too many warnings");
    // }

    sc.close();
  }
}
