//Extending a Thread
//class MyThread extends Thread {

//public void run() {
//int i = 0;
//while (i < 100) {
//System.out.println("Hello World");
//i++;
//}
//}
//}

//class MyThread1 extends Thread {

//public void run() {
//int i = 0;
//while (i < 100) {
//System.out.println("Bye World");
//i++;
//}
//}
//}

//public class Threads {

//public static void main(String[] args) {
//MyThread t1 = new MyThread();
//MyThread1 t2 = new MyThread1();
//t1.start();
//t2.start();
//}
//}

// Implementing a runnable

class MyThread1 implements Runnable {

  public void run() {
    int i = 0;
    while (i < 100) {
      System.out.println("Hello world");
      i++;
    }
  }
}

class MyThread2 implements Runnable {

  public void run() {
    int i = 0;
    while (i < 100) {
      System.out.println("Bye World");
      i++;
    }
  }
}

public class Threads {

  public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    Thread tt1 = new Thread(t1);
    MyThread2 t2 = new MyThread2();
    Thread tt2 = new Thread(t2);
    tt1.start();
    tt2.start();
  }
}
