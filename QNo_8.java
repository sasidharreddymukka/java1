package new_assigment;



class Threads extends Thread{
    public void run() {
        for (int j = 1;j<=10;j++) {
            System.out.println(j);
            System.out.println(Thread.currentThread().getName());
            try{Thread.sleep(2000);}catch(Exception e) {}
        }
    }
}
public class QNo_8 { 

    public static void main(String[] args) {
        Threads th = new Threads();
        
        
        th.start();
        Threads tr = new Threads();
        tr.start();    }


		
	}


