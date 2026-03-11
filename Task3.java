Q1) Hillstation


package Hill;
class HillStations {
    void location() {
        System.out.println("Location of hill station");
    }

    void famousFor() {
        System.out.println("Famous for");
    }
}

class Manali extends HillStations {
    
    void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    
    void famousFor() {
        System.out.println("Manali is famous for Snow and Adventure Sports.");
    }
}

class Mussoorie extends HillStations {
    
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    
    void famousFor() {
        System.out.println("Mussoorie is famous for Scenic Beauty.");
    }
}

class Gulmarg extends HillStations {
    
    void location() {
        System.out.println("Gulmarg is located in Jammu & Kashmir.");
    }

    
    void famousFor() {
        System.out.println("Gulmarg is famous for Skiing.");
    }
}

public class Task {

    public static void main(String[] args) {

        HillStations hs;

       
        hs = new Manali();
        hs.location();
        hs.famousFor();

        hs = new Mussoorie();
        hs.location();
        hs.famousFor();

        hs = new Gulmarg();
        hs.location();
        hs.famousFor();

        System.out.println("------------");


        Manali m = new Manali();
        Mussoorie ms = new Mussoorie();
        Gulmarg g = new Gulmarg();

        m.location();
        m.famousFor();

        ms.location();
        ms.famousFor();

        g.location();
        g.famousFor();
    }
}

Output:
Manali is famous for Snow and Adventure Sports.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for Scenic Beauty.
Gulmarg is located in Jammu & Kashmir.
Gulmarg is famous for Skiing.

Q2)Animal Demo 


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