package dayThree;

public class saleSystemoop2 {
	public static void main(String[] args) {
	       saleItem[] items = {
	           new saleItem("Laptop", 50000, 1),
	           new saleItem("Mouse", 500, 2),
	           new saleItem("Keyboard", 1000, 1)
	       };
	       double grandTotal = 0;
	       System.out.println("Product\tPrice\tQty\tTotal");
	       System.out.println("--------------------------");
	       for (saleItem item : items) {
	           item.displayItem();
	           grandTotal += item.getTotalPrice();
	       }
	       System.out.println("------------------------");
	       System.out.println("Grand Total: " + grandTotal);
	   }
	}


