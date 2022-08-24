package Assigment_4;
import java.util.Stack;


public class Stack_1 {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		stk.push("mick");
		stk.push("start");
		stk.push("go");
		stk.push("end");
		System.out.println(stk);
		int i=stk.size();
		System.out.println(i);
		stk.pop();
		System.out.println(stk);
		stk.peek();
		System.out.println(stk.peek());
		
		

	}

}
