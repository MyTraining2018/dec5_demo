package org.cap.demo;

public class SalesClass {
	
	int[] arr={1,2,3,4,5,-45};
	
	
	public void display(){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			sum+=arr[i];
		}
	}
	
	public void sayHello(){
		System.out.println("Hello - Good Afternoon!");
	}

}
