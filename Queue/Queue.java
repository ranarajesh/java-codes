package Queue;

public class Queue<V> {
    public int maxSize;
    public int front;
    public int back;
    public int currentSize;
    public V arr[];

    @SuppressWarnings("unchecked")
    public Queue(int maxSize){
        this.maxSize = maxSize;
        this.front = 0;
        this.back = -1;
        this.currentSize = 0;
        arr = (V[])new Object[maxSize];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }
    public boolean isFull(){
        return currentSize == maxSize ;
    }
    public boolean isEmpty(){
        return this.currentSize == 0;
    }
    public V top(){
        return arr[front];
    }
    
    public void enqueue(V element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        back = (back + 1) % maxSize; //to keep the index in range
        arr[back] = element;
        currentSize++;

    }

    public V dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        V element = arr[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;
        return element;
    }

}   
