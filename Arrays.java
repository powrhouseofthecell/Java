public class Arrays {

  public static void main(String[] args) {
    //int[] marks0 = new int[5];
    //marks0[0] = 100;
    //marks0[1] = 90;
    //marks0[2] = 80;
    //marks0[3] = 65;
    //marks0[4] = 70;
    //System.out.println(marks0[0]);
    // int[] marks1 = { 90, 80, 98, 70, 75 };
    //System.out.println(marks1[3]);

    //System.out.println("Printing with for each loop");
    //for (int el : marks1) {
    //System.out.println(el);
    //}

    //System.out.println("2-D arrays");

    int[][] arr = new int[2][3];

    arr[0][0] = 10;
    arr[0][1] = 20;
    arr[0][2] = 30;
    arr[1][0] = 100;
    arr[1][1] = 200;
    arr[1][2] = 300;

    int[][] arr2 = { { 01, 02, 03 }, { 1, 12, 13 } };

    for (int i = 0; i < arr2.length; i++) {
      // System.out.println(arr[i]);
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.println(arr2[i][j]);
      }
    }
  }
}
