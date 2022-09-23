package files;

public class Expection_Demo {
	public static void main(String []args) {
		Hello hl=new Hello();
		try {
			hl.go();
		} catch (Exception e) {
			System.out.println("cannot divide by zero");
			e.hashCode();
		}
	}

}
class Hello{
	public void go() throws Exception {
	//try {
		
			int i=7;
			int n=0;
			int m=i/n;
			System.out.println(m);
		//}	
		
//		//catch(Exception e)
//		{
//			System.out.println("cannot divide by 0");
//			
//		}
//		finally {
//			System.out.println("bye");
//			
		}
	
}