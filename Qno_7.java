package new_assigment;
//Overloading

class car{
	public void go(int a,int b) {
		System.out.println(a+b);
	}
	
	public void go(int a,double b) {
		System.out.println(a+b);
	}
	public void go(int a,int c,double b) {
		System.out.println(a+b+c);
	}
}
//overriding
class parent extends car{
	public void go(int a,int c,double b) {
		System.out.println("hi");
	}
}
public class Qno_7 {
public static void main(String[]args ) {
 car c= new car();
  c.go(2, 3);
  c.go(3, 2.5);
  parent p=new parent();
  p.go(5,6 ,8.0);
	
}
}
