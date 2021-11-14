class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends  Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.x = 10;
        d.y = 20;
        System.out.println(b.getX());
        System.out.println(d.getX()); // set in b not d
        d.x = 100;
        System.out.println(d.getX());
    }
}
