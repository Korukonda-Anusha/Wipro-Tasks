package dayFive;
interface A{
	default void show() {
		System.out.println("Method A");
	}
}
interface B{
	default void show() {
		System.out.println("method B");
	}
}
interface C{
	default void show() {
		System.out.println("method C");
	}
}
class Myclass implements A,B,C{
	public void show() {
		A.super.show();
		B.super.show();
		C.super.show();
	}
}
public class Clac {

	public static void main(String[] args) {
		Myclass obj = new Myclass();
		obj.show();
	}

}
