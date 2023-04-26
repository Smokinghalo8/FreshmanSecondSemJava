public class LinkedListQueue {

    private class Node{
        public Object data;
        public Node next;
        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private Node head =null;
    private Node tail = null;

    public void enqueue(Object item){
        Node newNode = new Node(item, null);
        if(isEmpty()){
            head=newNode;
        } else{
            tail.next=newNode;
        }
        tail=newNode;
    }

    public Object dequeue(){
        if(isEmpty()){
            System.err.println("Queue is empty:(");
            return null;
        }
        Object item = head.data;
        if(head==tail){
            tail=null;
        }
        head=head.next;
        System.out.println("Removed: "+item);
        return item;
    }

    public Object peek(){
        if(head==null){
            //System.err.println("Queue is empty:(");
            return null;
        }
        return head.data;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        int count = 0;
        for(Node node = head; node!=null;node=node.next){
            count++;
        }
        return count;
    }

    public String displayQueue(){
        String queuedElements = "";
        for(Node node = head; node!=null;node=node.next){
            queuedElements+=String.format("%s%n", node.data);
        }
        return queuedElements;
    }

}
