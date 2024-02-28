package Stack;

public class Stack<V> {
    public int maxSize;
    public int top;
    public V arr[];

    @SuppressWarnings("unchecked")
    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
        this.arr = (V[]) new Object[maxSize];
    }
    public int getCapacity(){
        return this.maxSize;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }
    public boolean isFull(){
        return this.top == this.maxSize-1;
    }
    //returns the value at top of Stack
    public V top(){
        if(isEmpty()) return null;
        
        return arr[top];
    }

    //inserts a value to the top of Stack
    public void push(V element){
        if(isFull()){
            System.out.println("Stack is full ");
            return;
        }
        arr[++top] = element;
    }

    //removes a value from top of Stack and returns
    public V pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return arr[top--];

    }

}
