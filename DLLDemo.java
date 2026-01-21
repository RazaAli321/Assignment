class DLLNode {
    int data;
    DLLNode prev, next;
    DLLNode(int data) { this.data = data; }
}

public class DLLDemo {
    static DLLNode head, tail;

    static void insertAtBeginning(int data) {
        DLLNode node = new DLLNode(data);
        if (head == null) head = tail = node;
        else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    static void insertAtEnd(int data) {
        DLLNode node = new DLLNode(data);
        if (tail == null) head = tail = node;
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    static void displayForward() {
        for (DLLNode t = head; t != null; t = t.next)
            System.out.print(t.data + " ");
        System.out.println();
    }

    static void displayBackward() {
        for (DLLNode t = tail; t != null; t = t.prev)
            System.out.print(t.data + " ");
        System.out.println();
    }

    static void deleteByValue(int val) {
        DLLNode t = head;
        while (t != null && t.data != val) t = t.next;
        if (t == null) return;
        if (t == head) head = head.next;
        else if (t == tail) tail = tail.prev;
        else {
            t.prev.next = t.next;
            t.next.prev = t.prev;
        }
    }

    static void minMax() {
        int min = head.data, max = head.data;
        for (DLLNode t = head; t != null; t = t.next) {
            if (t.data < min) min = t.data;
            if (t.data > max) max = t.data;
        }
        System.out.println("Min=" + min + " Max=" + max);
    }

    public static void main(String[] args) {
        insertAtBeginning(10);
        insertAtBeginning(20);
        insertAtEnd(30);
        insertAtEnd(40);
        insertAtEnd(5);
        insertAtEnd(50);

        displayForward();
        displayBackward();
        deleteByValue(20);
        displayForward();
        minMax();
    }
}