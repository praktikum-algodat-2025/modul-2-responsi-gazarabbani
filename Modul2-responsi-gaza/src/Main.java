public class Main {
    public static void main(String[] args) {
        ListQueue queue = new ListQueue();
        
        queue.enqueue("Pelanggan ke");
        queue.front.listStack.push("Technical Analysis");
        queue.front.listStack.push("Fundamental Analysis");
        queue.front.listStack.push("Data Analysis");

        queue.enqueue("Pelanggan ke");
        queue.front.next.listStack.push("Clean Code");
        queue.front.next.listStack.push("The Pragmatic Programmer");
        queue.front.next.listStack.push("Design Patterns");

        queue.enqueue("Pelanggan ke");
        queue.front.next.next.listStack.push("Dune");
        queue.front.next.next.listStack.push("Foundation");
        queue.front.next.next.listStack.push("Hyperion");
        queue.front.next.next.listStack.push("Neuromancer");

        queue.enqueue("Pelanggan ke");
        queue.front.next.next.next.listStack.push("Sapiens: A Brief History of Humankind");
        queue.front.next.next.next.listStack.push("Guns, Germs, and Steel");
        queue.front.next.next.next.listStack.push("The Silk Roads");

        System.out.println("\nDaftar Antrian Pelanggan:");
        queue.displayQueue();

        System.out.println("\nDaftar Antrian Pelanggan Setelah Melayani:");
        queue.dequeue();
        queue.displayQueue();

        System.out.println("\nDaftar Antrian Pelanggan Setelah Menambah Antrian:");
        queue.enqueue("Pelanggan ke");
        queue.front.next.next.next.listStack.push("Tangkuban Perahu");
        queue.front.next.next.next.listStack.push("Timun Mas");
        queue.front.next.next.next.listStack.push("Resep Ayam Goyeng Upin Ipin");
        queue.displayQueue();

        System.out.println("\nDaftar Antrian Pelanggan Setelah Pop Buku Pelangggan ke-1:");
        queue.front.listStack.pop();
        queue.front.listStack.pop();
        queue.displayQueue();
    }
}
