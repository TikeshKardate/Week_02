
// Superclass: Animal
class Animal {
    // Attributes for name and age
    String name;
    String age;

    // Constructor to initialize the attributes
    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details of the animal
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Animal makes a sound\n");
    }
}

// Subclass: Dog
class Dog extends Animal {
    // Constructor to initialize Dog with default values
    public Dog() {
        super("Dog", "5");
    }

    // Overriding makeSound() method for Dog
    @Override
    public void makeSound() {
        super.displayDetails();
        System.out.println("Dog barks\n");
    }
}

// Subclass: Cat
class Cat extends Animal {
   
    // Constructor to initialize Cat with default values
    public Cat() {
        super("Cat", "8");
    }

    // Overriding makeSound() method for Cat
    @Override
    public void makeSound() {
        super.displayDetails();
        System.out.println("Cat meows\n");
    }
}

// Subclass: Bird
class Birds extends Animal {

    // Constructor to initialize Bird with default values
    public Birds() {
        super("Bird", "8");
    }

    // Overriding makeSound() method for Bird
    @Override
    public void makeSound() {
        super.displayDetails();
        System.out.println("Bird chirps\n");
    }
}

// Main class to test the hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {

        // Create an instance of Animal and call its methods
        Animal a = new Animal("Animal", "10");
        a.displayDetails();
        a.makeSound();

        // Create instances of Dog, Cat, and Bird and call their makeSound() methods
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

        Animal bird = new Birds();
        bird.makeSound();
    }
}



