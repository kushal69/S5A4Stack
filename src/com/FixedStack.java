package com;

//	Fixed Stack Class implementing Stack interface
public class FixedStack implements Stack {
	int stk[]; 							// stack
	int tos; 							// top of the stack

	FixedStack() { 						// constructor that creates a fixed stack of length 4 and assigns tos value
		stk = new int[4];
		tos = -1;
	}

	public void push(int i) {
		if (tos == stk.length - 1) { 	// checks overflow condition
			System.out.println("Stack overflow");
		} else {
			stk[++tos] = i; 			// pushes the item to the tos position
		}
	}

	public int pop() {
		if (tos < 0) { 					// checks the underflow condition
			System.out.println("Stack underflow");
			return 0;
		} else {
			return stk[tos--]; 			// pops the top element
		}
	}
}