package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		SalesClass obj=new SalesClass();
		obj.display();
		greetings();
	}
	
	public static void greetings(){
		System.out.println("Hello");
	}
	
	public static void addNumbers(int num1,int num2){
		System.out.println("Sum:" + num1+num2);
	}

}
