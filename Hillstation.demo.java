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