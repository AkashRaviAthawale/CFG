interface A {
    void show();

    void config();
}

interface C {

    void run();
}

interface D extends A {
    void play();
}

class B implements D, C {
    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }

    public void play() {
        System.out.println("In show");
    }

    public void run() {
        System.out.println("Running");
    }
}

public class Interface {
    public static void main(String[] args) {
        B obj = new B();

        obj.run();
    }

}
