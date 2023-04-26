


public class LinkedListQueueTester {

    public static void main(String[] args){
        LinkedListQueue queue1 = new LinkedListQueue();
        System.out.println("\nPart1\n");
        queue1.enqueue("Tom");
        queue1.enqueue("Jane");
        queue1.enqueue("Beth");
        System.out.println(queue1.displayQueue());
        System.out.println("\nPart2\n");
        queue1.enqueue("John");
        queue1.enqueue("Mary");
        System.out.println(queue1.displayQueue());
        System.out.println("\nPart3\n");//using queue1
        System.out.println("Queue is Empty: "+queue1.isEmpty());
        System.out.println("Amount of items in queue is: "+queue1.size());
        System.out.println("The Head of the Queue is: "+queue1.peek());
        queue1.dequeue();
        System.out.println("\nPart4\n");
        System.out.println(queue1.displayQueue());
        System.out.println("\nPart5\n");
        System.out.println("Queue is Empty: "+queue1.isEmpty());
        System.out.println("Amount of items in queue is: "+queue1.size());
        System.out.println("The Head of the Queue is: "+queue1.peek());
        System.out.println("\nPart6\n");
        queue1.dequeue();
        System.out.println("The Head of the Queue is: "+queue1.peek());
        System.out.println("\nPart7\n");
        queue1.dequeue();
        System.out.println("The Head of the Queue is: "+queue1.peek());
        System.out.println("\nPart8\n");
        queue1.dequeue();
        System.out.println("The Head of the Queue is: "+queue1.peek());
        System.out.println("\nPart9\n");
        queue1.dequeue();
        System.out.println("Amount of items in queue is: "+queue1.size());
        System.out.println("The Head of the Queue is: "+queue1.peek());
        System.out.println("\nPart10\n");
        System.out.println("Queue is Empty: "+queue1.isEmpty());
    }

}
