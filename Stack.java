package sasidhar_1;

class Stack_1 {
	String str[];
	int top;
	int size;

	public Stack_1() {

		top = -1;
		size = 10;
		str = new String[10];
	}

	public Stack_1(int i) {
		str = new String[i];
		top = -1;
		this.size = i;

	}

	public boolean push(String value) {
		if (isempty()) {
			top = top + 1;
			str[top] = value;
			return true;
		} else {
			if (!isfull()) {
				top = top + 1;
				str[top] = value;
				return true;
			} else {
				System.out.println("stack is full");
			}

		}
		return false;

	}

	public boolean isempty() {
		if (top == -1) {
			return true;

		} else {
			if (size > top) {
				return false;
			} else {
				return true;
			}
		}
	}

	public boolean isfull() {
		if (top < size) {

			return false;
		}

		return true;
	}

	public String pop() {
		if (isempty()) {
			System.out.println("stack is empty");
			return null;
		} else {
			String value;
			value = str[top];
			top = top - 1;
			return value;
		}

	}

	public String peek() {
		if (top == -1) {
			System.out.println("stack is empty");
			return null;
		} else {
			return str[top];
		}

	}
}

public class Stack {
	public static void main(String[] args) {
		Stack_1 stk = new Stack_1();
		stk.push("Sasi");
		stk.push("raj");
		//stk.push("giri");
		//System.out.println(stk.pop());
		System.out.println("peek:" + stk.peek());

	//	System.out.println(stk.pop());

	//	System.out.println(stk.pop());

	//	System.out.println(stk.pop());

	}
}
