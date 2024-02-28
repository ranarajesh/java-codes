package Stack;

public class StackDemoRunner {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(10);
        System.out.println(stack.getCapacity());
        System.out.println(stack.top);
        if(stack.isEmpty())
        System.out.print("Stack is empty");
        else
        System.out.print("Stack is not empty");
        
        if(stack.isFull())
        System.out.println("Stack is full");
        else
        System.out.println("Stack is not full");

        stack.push(333);
        stack.push(900);
        stack.push(767);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());

    }
}
