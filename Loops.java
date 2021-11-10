public class Loops {

  public static void main(String[] args) {
    //int i = 0;
    //while (i < 10) {
    //System.out.println(i);
    //i++;
    //}

    for (int i = 0; i < 10; i++) {
      if (i == 2) {
        System.out.println("Continue here");
        continue;
      } else if (i == 5) {
        System.out.println("Breaking here");
        break;
      } else System.out.println(i);
    }
    //int i = 0;
    //do {
    //System.out.println(i);
    //i++;
    //} while (i < 10);

  }
}
