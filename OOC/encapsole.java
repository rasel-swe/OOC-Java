
public class encapsole {
	
	private String name;
	private int age;
	
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	public int getAge() {
		
		return age;
	}
	
	void showInfo() {
		
		System.out.println("Name is : "+ name);
		System.out.println("Age is : "+ age);
		
	}

}
