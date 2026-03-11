
import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal: 1-Animal 2-Dog 3-Cat");
        int choice = sc.nextInt();

        Animal a;

        switch (choice) {
            case 1:
                a = new Animal();
                break;
            case 2:
                a = new Dog();
                break;
            case 3:
                a = new Cat();
                break;
            default:
                System.out.println("Invalid choice, defaulting to Animal.");
                a = new Animal();
        }

        a.makeSound();
        sc.close();
    }
}