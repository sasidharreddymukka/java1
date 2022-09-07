package sasidhar_1;

class Node {
	int data;
	Node nextNode;

	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}
}
class SingleLL {

	Node head = null;
	Node tail = null;
	int size = 0;
	
	public void insert(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head = n;
		
		} else if (size > 0) {
			tail.nextNode = n;
		}
		tail = n;
		size++;
		
	}
	public void addfirst() {
		
	}

	public void delete(int data) {

		if (size == 0) {
			System.out.println("List is empty");
			return;
		} else {

			if (head.data == data) {
				head = head.nextNode;
				return;
			}

			Node prevNode = null;
			Node curNode = head;

			while (curNode.nextNode != null) {

				if (curNode.data == data) {
					prevNode.nextNode = curNode.nextNode;
					size--;
					return;
				} else {
					prevNode = curNode;
					curNode = curNode.nextNode;
				}
			}

			if (curNode.data == tail.data) {
				size--;
				tail = prevNode;
				tail.nextNode = null;
				if (size == 1) {
					head.nextNode = null;
				}
			}
		}

	}

	public void getHead() {
		if (size == 0) {
			System.out.println("List is empty");
		}
			else {
			System.out.println("\nhead : "+head.data);
			}
	}

	public void getTail() {
		if (size == 0) {
			System.out.println("List is empty");
		}
		
		else{
				System.out.println("\ntail: "+tail.data);
				}
		
                 
			
			}
	 public int getsize()
	    {
	        Node curNode = head;
	           int size=0;
	        while (curNode.nextNode != null)
	        {
	            size++;
	            curNode = curNode.nextNode;
	        }
	       return size;
	      
	    }
	  

	public void display() {
		if (size > 0) {
			Node curNode = head;
			while (curNode.nextNode != null) {
				System.out.println(curNode.data);
				curNode = curNode.nextNode;
			}
			System.out.println(curNode.data);
		} else {
			System.out.println("List is empty");
		}

	}


	  public  void find(int data) {  
	        Node curNode = head;  
	        int i = 1;  
	        boolean j = false;  
	       
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            while(curNode != null) {  
	              
	                if(curNode.data == data) {  
	                    j = true;  
	                    break;  
	                }  
	                i++;  
	                curNode = curNode.nextNode;  
	            }  
	        }  
	        if(j)  
	             System.out.println("Element is present in the list at the position : " + i);  
	        else  
	             System.out.println("Element is not present in the list");   
	}
}
public class Linkedlist {
	public static void main(String[] args) {
		SingleLL obj = new SingleLL();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		//obj.insert(4);
//	obj.display();
		//obj.delete(2);
	//	obj.display();
		//System.out.print("head value:" + obj.getHead(3));
	//	obj.getTail();
      
    //    System.out.println(obj.getsize());
    //    obj.getsize();
         //obj.getCount();
       //  obj.getHead();
       //  obj.getTail();
       //  obj.find(4);
	   obj.delete(3);
	   obj.display();
	  // System.out.println(obj.getsize());
       //  obj.getTail();
      //   System.out.println("Count of nodes is " + obj.getsize());
	}
}
