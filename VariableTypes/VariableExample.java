public class VariableExample{
	int myVariable;//instance variable->They hold values that must be referenced by more than one method/constructor/block
	static int data = 30;//static variable -> Theres only one copy of each static variables per class

	public static void main( String args[]){
		int a = 100;//local variable->created when the method/constructor or block is entered and destroyed once exited
		VariableExample obj = new VariableExample();

		System.out.println("Value of instance variable myVariable: "+ obj.myVariable);
		System.out.println("Value of static variable data: "+ VariableExample.data);
		System.out.println("Value of local variable a: "+a);
	}
}