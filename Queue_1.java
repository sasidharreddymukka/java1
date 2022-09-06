package sasidhar_1;

class Queue {
	int arr[] = new int[10];
	int size;
	int front;
	int rear;
	int data;

	public void enqueue(int data) {
		if (!isfull()) {
			arr[rear] = data;
			rear = (rear + 1) ;
			size = size + 1;
		} else {
			System.out.println("queue is full");
		}
	}

	public void dequeue() {
		//arr[front] = data;
		if (!isempty()) {
			arr[front] = data;
			
			front = (front + 1) ;
			size = size - 1;
		} else {
			System.out.println("queue is empty");
		}

	}

	public void Show() {
		System.out.print("Element: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[(front + i) ] + " ");
		}
		System.out.println();
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

	public int getSize() {
		return size;

	}

	public boolean isempty() {
		return getSize() == 0;
	}

	public boolean isfull() {
		return getSize() == 10;

	}

}

public class Queue_1 {
	public static void main(String[] args) {
		Queue Q = new Queue();
		Q.enqueue(4);
		Q.enqueue(6);
		Q.enqueue(7);
		Q.enqueue(9);
        Q.Show();
		Q.dequeue();
//		Q.dequeue();
         Q.Show();
		Q.enqueue(54);
		Q.enqueue(65);
        Q.enqueue(43);
        Q.enqueue(90);
        Q.enqueue(58);
	
	//	System.out.println(Q.isfull());

//		System.out.println("size:" + Q.getSize());
	//	System.out.println(Q.isempty());
		//Q.Show();

	}
}
