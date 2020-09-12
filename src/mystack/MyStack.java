/**
 * 
 */
package mystack;

/**
 * @author Naglis Bukauskas
 *
 */

// Stack using generics
// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;


	public MyStack() {
		
	}

	public T pop() throws Exception {
		if(theStack == null) {
			throw new Exception("The stack is empty"); 
		} else {
			T retData = theStack.val;
			MyNode<T> tempNode = theStack;
			theStack = theStack.next;
			tempNode.next = null;
			return retData;
		}
	}

	public void push(T v) {
		
	MyNode<T> pushNode = new MyNode<T>(v, theStack);
	theStack = pushNode;
		 
	}
	
	public String toString() {
		while (theStack != null) {
			System.out.println(theStack.val);
			theStack = theStack.next;
		}
		return null;
	}

	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO To complete COMPLETED
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> integerStack = new MyStack<Integer>();
		integerStack.push(1);
		integerStack.push(2);
		integerStack.pop();
		integerStack.push(5);
		System.out.println("Integer Stack: ");
		integerStack.toString();
		
		
		
		// TODO To complete COMPLETED
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> personStack = new MyStack<Person>();
		Person p1 = new Person("Naglis", "Bukauskas");
		Person p2 = new Person("Dr. Christelle", "Scharff");
		personStack.push(p1);
		personStack.push(p2);
		/*
		 * System.out.println("Person Stack");
		 * System.out.println(personStack.theStack.val.getFname());
		 * personStack.toString();
		 */
	}

}
