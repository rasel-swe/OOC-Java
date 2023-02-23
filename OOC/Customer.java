

public class Customer {
	String name;
	String address;
	int phone;
	int age;
	
	void setInfo(String n, String a, int p, int ag){
		
		name = n;
		address  = a;
		phone = p;
		age = ag;
		
	}
	
	void showInfo() {
		
		System.out.println("Customer name; "+name);
		System.out.println("Customer Adresss; "+address);
		System.out.println("Customer Phone number: "+phone);
		System.out.println("Customer age: "+age);
		
	}

}

