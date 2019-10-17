


class Animal {
    public String color;
    public String name;

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void makeSound() {
        System.out.println(this.name + " makes sound like an Animal");
    }
}


class Dog extends Animal {

    public Dog(String name, String color) {

        super(color, name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " sounds wuf wuf wuf");
    }
}

class Cat extends Animal {

    public Cat(String name, String color) {

        super(color, name);
    }

    @java.lang.Override
    public void makeSound() {
        System.out.println(this.name + " sounds meo meo");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Animal dog = new Dog("Tommy", "white");
        dog.makeSound();

        Animal cat = new Cat("Tina", "gray");
        cat.makeSound();
    }
}