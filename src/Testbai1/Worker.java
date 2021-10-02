package Testbai1;

import java.util.Scanner;
import java.lang.Override;

public class Worker extends Person {
	private String position;
	private int numberProduct;
	
	public Worker() {
		super();
	}
	
	public Worker(String id, String name, int age, String address ) {
		super(id, name, age, address);
	}
	
	public Worker(String position, int numberProduct) {
		this.position = position;
		this.numberProduct = numberProduct;
	}
	
	public Worker(String id, String name, int age, String address, String position, int numberProduct) {
		super(id, name, age, address);
		this.position = position;
		this.numberProduct = numberProduct;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getNumberProduct() {
		return numberProduct;
	}
	
	public void setNumberProduct(int numberProduct) {
		this.numberProduct = numberProduct;
	}
	
	public int money() {
		return this.numberProduct * 120;
	}
	
	
	public void input(Scanner scanner, int index) {
		
		System.out.println("\n - Cong nhan thu "+ (index +1) + "la: ");
		System.out.println("\t  Ten: ");
		this.setName(scanner.nextLine());
		System.out.println("\t  ID: ");
		this.setId(scanner.nextLine());
		do {
			System.out.println("\t Tuoi: ");
			this.seAge(scanner.nextInt());
			if(this.getAge() <= 0 ) {
				System.out.println(" Nhap lai!!!");
			}
		}while( this.getAge() <= 0);
		scanner.nextLine();
		System.out.println("\t  Dia chi: ");
		this.setAddress(scanner.nextLine());
		System.out.println("\t Chuc vu: ");
		this.setPosition(scanner.nextLine());
		do {
			System.out.println("\t So luong san pham: ");
			this.setNumberProduct(scanner.nextInt());
			if(this.getNumberProduct() <= 0) {
				System.out.println(" Nhap lai!!!");
			}
		}while(this.getNumberProduct() <= 0);
		scanner.nextLine();
	}
	
	
	/*@Override
	public  String toStrinng() {
		
		return "Worker {" +
		"Ten: '" + name + '\'' +
		", ID: " + id + '\'' +
		", Tuoi: " + age + '\'' +
		", Dia chi:  " + address + '\'' +
		", Chuc vu:  " + position + '\'' +
		", So luong san pham: " + numberProduct + '\'' +
		'}';
		*/
	
	public void output(int index) {
		System.out.println("=== Cong nhan thu "+(index + 1)+": ===");
		System.out.println("\t ID: " + this.getId());
		System.out.println("\t Ten: " + this.getName());
		System.out.println("\t Tuoi: " + this.getAge());
		System.out.println("\t Dia chi: " + this.getAddress());
		System.out.println("\t Chuc vu: " + this.getPosition());
		System.out.println("\t So luong san pham: " + this.getNumberProduct());
		System.out.println("\t Tien: " + this.money());
	}
	
}
