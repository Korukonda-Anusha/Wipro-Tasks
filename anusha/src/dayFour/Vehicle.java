package dayFour;

 abstract public class Vehicle {
	abstract void speed(); 
	abstract void brand();
}
	class Car extends Vehicle{
		void speed() {
			System.out.println("Speed of vehicle:40km/hr");
		}
		void brand() {
			System.out.println("audi");
			
		}	
	public static class Bike extends Vehicle{
		void speed() {
			System.out.println("Speed of vehicle:50km/hr");
		}
		void brand() {
			System.out.println("RX100)");
			
		}	
}
}

