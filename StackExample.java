package day3;
interface StackInterface {
    public void push();
    public void pop();
}

public class StackExample {

	public static void main(String[] args) {
		StackInterface stack1 = new FixedStack();
        stack1.push();
        stack1.pop();
        StackInterface stack2 = new DynamicStack();
        stack2.push();
        stack2.pop();
	}

}
class FixedStack implements StackInterface {

    @Override
    public void push() {
        System.out.println("Fixed Stack push method");
    }

    @Override
    public void pop() {
        System.out.println("Fixed Stack pop method");

    }
}
class DynamicStack implements StackInterface{
    @Override
    public void push() {
        System.out.println("Dynamic stack push method");
    }

    @Override
    public void pop() {
        System.out.println("Dynamic stack pop method");

    }
}
