package daySix;

public class Array_6th_Element {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		try {
			System.out.println("6th Element"+arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught"+e);
		}finally {
			System.out.println("Finally block executed");
		}

	}

}
