
public class Product {
	String Pname;
	int quantity;
	int PpP;
	double totalPrice;
	double vat;
	double Scharge;
	
	
	
	void setInfo1(String pn, int q, int ppp) {
		
		Pname = pn;
		quantity = q;
		PpP = ppp;
	}
	
	double TotalPrice() {
		return totalPrice = quantity * PpP;
		
		
		
	}
	double Vat() {
		
	 return vat = totalPrice +(totalPrice *.10 );
	 
	 
	}
	
	double ServiceCharge() {
		
		return Scharge = (totalPrice *.07);
	}
	
	void showInfo1() {
		
		System.out.println("Product name: "+Pname);
		System.out.println("Product Quantity: "+quantity);
		System.out.println("Price per pice: "+PpP);
	}
	
	

}
