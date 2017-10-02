package com;

//	Variable Stack Class implementing Stack interface
public class VariableStack implements Stack {
	int stk[]; 						// stack
	int tos; 						// top of stack

	VariableStack() { 				// constructor that creates a variable stack of initial length 4 and assigns the value of tos
		stk = new int[4];
		tos = -1;
	}

	public void push(int i) {
		if (tos == stk.length - 1) { 						// checks the overflow condition
			System.out.println("Stack overflow");
			int temp[] = new int[stk.length * 2]; 			// create a temporary stack with stk_length * 2
			for (int j = 0; j < stk.length; j++) {			// loop that copies the content of stk[] to temp[]
				temp[j] = stk[j];
			}
			stk = temp; 									// reassign the stk[] with the temp[]
			System.out.println("Stack size is doubled.");
			stk[++tos] = i; 								// push the item to top of the stack
			System.out.println("Item inserted");
		} else {
			stk[++tos] = i; 								// push the item to top of the stack
		}
	}

	public int pop() {
		if (tos < 0) { 										// checks the underflow condition
			System.out.println("Stack underflow");
			return 0;
		} else {
			return stk[tos--]; 								// pops the top element of the stack
		}
	}
}