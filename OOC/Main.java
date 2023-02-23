
public class Main {
	public static void main(String[]args) {
		
	Customer c = new Customer();
	c.setInfo("Rasel","Dhaka", 1757930344, 21);
	c.showInfo();
	Product p = new Product();
	p.setInfo1("Chips,", 1, 20);
	
	Product p1 = new Product();
	p1.setInfo1("cocacola", 1, 30);
	
	Product p2  = new Product();
	p2.setInfo1("Chocolate", 2, 5);
	
	p.showInfo1();
	p1.showInfo1();
    p2.showInfo1();
  

    double price = ( p.TotalPrice()+p1.TotalPrice()+p2.TotalPrice());
    System.out.println("Total Price: "+price);
    
   double vat = (p.Vat()+p1.Vat()+p2.Vat());
   System.out.println("Total Price including 10% vat: "+vat);
   double Scharge = (p.ServiceCharge()+p1.ServiceCharge()+p2.ServiceCharge());
System.out.println("Total Price including vat+ service charge: "+(Scharge+vat));

	}

}
