package prac2;

public class constructor2 {
	
	  String name;
	    int age;

	   
	    constructor2() {
	        name = "Piyush";
	        age = 24;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	       constructor2 s1 = new constructor2(); 
	        s1.display();
	    }
	}
														

Output : 
Name:Piyush
Age:24

package prac2;

public class Constructorssss {
	
	String name;
	int age;
	
	


	public Constructorssss(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorssss con=new Constructorssss("Piyush", 24);
		con.display();
		}

}


output:

Name=Piyush
Age=24
