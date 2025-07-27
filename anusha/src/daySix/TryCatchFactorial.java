package daySix;
import java.util.Scanner;

public class TryCatchFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		long factorial = 1;
		
		try {
			System.out.print("Enter a non-negative integer: ");
			number = sc.nextInt();
			
			if(number<0) {
				throw new IllegalArgumentException("Factorial is not defined for negative numbers");
			}
			for(int i=1;i<=number;i++) {
				factorial*=i;
			}
			System.out.println("Factorial of"+ number + "is" +factorial);
			
		}catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}finally {
			System.out.println("program executed with try-catch-finally");
			sc.close();
		}

	}

}
