package Assigment_4;
import java .util.Stack;
import java.util.Scanner;

public class Stack_n {
	 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Stack <Character>stack = new Stack<Character>();
         System.out.println("Enter Characters :");
         String str = sc.next();
         
         for(int i=0;i<str.length();i++) {
          if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='<') {
                 stack.push(str.charAt(i));
             }
             else if (str.charAt(i)=='}'||str.charAt(i)==')'||str.charAt(i)==']'||str.charAt(i)=='>') {
                 stack.push(str.charAt(i));
             }
             else if(str.charAt(i)=='}') {
                 if(stack.peek()=='{') {}
               //  stack.pop();
                 else {
                     System.out.println(" Balanced");
                     System.exit(0);
                 }
             }
             else if(str.charAt(i)==')') {
                 if(stack.peek()=='(') {}
               //      stack.pop();
                 else {
                     System.out.println("Not Balanced");
                     System.exit(0);
                 }
             }
             else if(str.charAt(i)==']') {
                 if(stack.peek()=='[') {}
               //      stack.pop();
                 else {
                     System.out.println("Not Balanced");
                     System.exit(0);
                 }
             }
             else if(str.charAt(i)=='>') {
                 if(stack.peek()=='<') {}
              //       stack.pop();
                 else {
                     System.out.println("Not Balanced");
                     System.exit(0);
                 }
             }
         }
         if(stack.size()==0) {
             System.out.println("Balanced");
         }
         
         else {
             System.out.println("Not Balanced:");
         }
  }


}
