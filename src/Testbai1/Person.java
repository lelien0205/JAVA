package Testbai1;


public class Person {
	protected String id;
	protected String name;
	protected int age;
	protected String address;
	
	public Person() {
		
	}
	
	public Person(String id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void seAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String toStrinng() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
