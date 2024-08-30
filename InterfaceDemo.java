interface Computer {
    void code();
}

class Desktop implements Computer {

    public void code() {
        System.out.println("Code compile run fast");
    }

}

class Laptop implements Computer {

    public void code() {
        System.out.println("Code compile run test");
    }

}

class Developer {
    public void devApplication(Computer comp) {
        comp.code();
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer akash = new Developer();

        akash.devApplication(desk);
        akash.devApplication(lap);
    }
}
