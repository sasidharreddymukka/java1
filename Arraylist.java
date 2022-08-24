package Assigment_4;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		ArrayList<Integer> arr=new  ArrayList<Integer>();
		arr.add(1);
		arr.add(30);
		arr.add(5);
		arr.add(4);
		arr.add(90);
		
		System.out.println("before:"+arr);
		int i=arr.size();
		System.out.println(i);
		System.out.println("enter index:");
		int n=Sc.nextInt();
		System.out.println("enter value:");
		int k=Sc.nextInt();
		arr.add(n,k);
		System.out.println("after:"+arr);
		 i= arr.size();
		System.out.println("index:"+i);
		int j=arr.indexOf(4);
		System.out.println("index of:"+j);
		
		
	}

}
