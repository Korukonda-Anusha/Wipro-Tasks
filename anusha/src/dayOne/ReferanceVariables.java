package dayOne;

public class ReferanceVariables {
	    public static void changeName(person p) {
	        p.name = "Changed";
	    }
	    public static void main(String[] args) {
	        int x = 10;
	        int y = x;
	        y = 20;
	        System.out.println("x = " + x); // stays 10
	        person p1 = new person("ayz");
	        person p2 = p1;
	        p2.name = "abc";
	        System.out.println("p1 = " + p1); //
	        changeName(p1);
	        System.out.println("p1 after changeName = " + p1);
	    }


	}


