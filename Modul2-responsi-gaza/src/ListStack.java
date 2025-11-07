public class ListStack {
    NodeStack top;

    public ListStack(){
        this.top = null;
    }

    public void push(String buku){
        NodeStack baru = new NodeStack(buku);
        if(top==null){
            top = baru;
        }
        else{
            baru.next = top;
            top = baru;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("Box Kosong.");
        } else {
            top = top.next;
        }
    }

    public void displayStack(){
        NodeStack current = top;
        if(current != null){
            while(current != null){
                System.out.println("  - " + current.buku);
                current = current.next;
            }
        } else {
            System.out.println("Stack Kosong.");
        }
    }
}
