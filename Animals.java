class Animal {

    public void makeSound() {
        System.out.println("The animals make Sound");
    }
}

class Dog extends Animal {

    public void dogSound() {
        System.out.println("The Dog Barks...");
    }
}

class Cat extends Animal {

    public void catSound() {
        System.out.println("The Cat Purring...");
    }
}

class Lion extends Animal {

    public void lionSound() {
        System.out.println("The Lion Roar...");
    }
}

class Tiger extends Animal {

    public void tigerSound() {
        System.out.println("The Tiger Growls...");
    }
}

class Elephant extends Animal {

    public void elephantSound() {
        System.out.println("The elephant Rumbles...");
    }
}

class Squirrel extends Animal {

    public void squirrelSound() {
        System.out.println("The squirrel Squeaks...");
    }
}

class Fox extends Animal {

    public void foxSound() {
        System.out.println("The fox Howls...");
    }
}

class Cow extends Animal {

    public void cowSound() {
        System.out.println("The cow Mooing...");
    }
}

public class Animals {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();

        Cat cat = new Cat();
        cat.catSound();

        Cow cow = new Cow();
        cow.cowSound();

        Dog dog = new Dog();
        dog.dogSound();

        Lion lion = new Lion();
        lion.lionSound();

        Tiger tiger = new Tiger();
        tiger.tigerSound();

        Squirrel squirrel = new Squirrel();
        squirrel.squirrelSound();
    }
}
