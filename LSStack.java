import java.util.ArrayList;

public class LSStack {
	public static ArrayList<Float> stack = new ArrayList<Float>();
	
	public static void main(String[] args) {
		push(10f);
		push(12f);
		push(52f);
		System.out.println("popping... " + pop());
		System.out.println("popping... " + pop());
		push(99f);
		System.out.println("Stack:");
		printStack();
	}
	
	public static void push(float num) {
		stack.add(0, num);
	}
	
	public static float pop() {
		float i = stack.get(0);
		stack.remove(0);
		return i;
	}
	
	public static void printStack() {
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
	}
}
