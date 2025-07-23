package dayOne;

class vehicle{
	void start() {
		System.out.println("vehicle is started");
	}
}
class car extends vehicle{
	void stop() {
		System.out.println("vehicle stopped");
	}
}
public class First {
	
		public static void main(String[] args) {
	      car c = new car();
	      c.start();
	      c.stop();
	   }
	


}
