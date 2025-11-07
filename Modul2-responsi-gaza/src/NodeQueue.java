public class NodeQueue {
    String nama;
    NodeQueue next;
    ListStack listStack;

    public NodeQueue(String nama) {
        this.nama = nama;
        this.next = null;
        this.listStack = new ListStack();
    }
}
