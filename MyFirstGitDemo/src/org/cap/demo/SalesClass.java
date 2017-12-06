package org.cap.demo;

public class SalesClass {
	
	int[] arr={1,2,3,4,5,-45};
	
	
	public void display(){
		int sum=0;
		for(int n:arr){
			System.out.println(n);
			sum+=n;
		}
		System.out.println("Sum:" + sum);
	}
	
	public void sayHello(){
		System.out.println("Hello - Good Afternoon!");
	}

}
