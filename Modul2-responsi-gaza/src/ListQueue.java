public class ListQueue {
    NodeQueue front;
    NodeQueue rear;

    public ListQueue(){
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String nama){
        NodeQueue baru = new NodeQueue(nama);
        if(front == null){
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
    }

    public void dequeue(){
        if(front == null){
            System.out.println("Antrian Kosong.");
        } else {
            front = front.next;
            if(front == null){
                rear = null;
            }
        }
    }

    public void displayQueue(){
        NodeQueue current = front;
        if(current != null){
            int i = 1;
            while(current != null){
                System.out.println("\n" +current.nama + "-" + i);
                i++;
                current.listStack.displayStack();
                current = current.next;
            }
        } else {
            System.out.println("Queue Kosong.");
        }
    }
}
