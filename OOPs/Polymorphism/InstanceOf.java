class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        String name = "Java";
        System.out.println("name instanceof String => " + (name instanceof String));

        Animal animal = new Animal();   // Animal reference and object
        System.out.println("animal instanceof Animal => " + (animal instanceof Animal));
        System.out.println("animal instanceof Dog => " + (animal instanceof Dog));

        Animal dog = new Dog(); //Upcasting
        System.out.println("dog instanceof Animal => " + (dog instanceof Animal));
        System.out.println("dog instanceof Dog => " + (dog instanceof Dog));

        // dog.sleep();
    }
}
