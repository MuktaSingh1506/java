package assignment4;

class ABC {
    public void show() {
        System.out.println("Show() coming from ABC");
    }
    public void show(int a) {
        System.out.println("Show() overloaded with "+a+" from ABC");
    }
}

class inheritABC extends ABC {
    @Override
    public void show() {
        System.out.println("Over-rided show() in inherited ABC");
    }
}
public class methodOverloadOverride {
    public static void main(String[] args) {
        inheritABC obj = new inheritABC();
        obj.show();
        obj.show(3);
    }
}
