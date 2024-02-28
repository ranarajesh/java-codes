package Queue;

public class QueueDemoRunner {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>(5);
        if(queue.isEmpty())
        System.out.print("Queue is empty.");
        else
        System.out.print("Queue is not empty.");
        
        System.out.printf("%n");
        
        if(queue.isFull())
        System.out.print("Queue is full.");
        else
        System.out.print("Queue is not full.");

        queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);
		queue.enqueue(10);
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
