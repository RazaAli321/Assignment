class QNode {
    int data;
    QNode next;
    QNode(int d) { data = d; }
}

public class LinkedQueueDemo {
    static QNode front, rear;

    static void enqueue(int x) {
        QNode n = new QNode(x);
        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
    }

    static int dequeue() {
        if (front == null) return -1;
        int v = front.data;
        front = front.next;
        if (front == null) rear = null;
        return v;
    }

    static void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        QNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Queue before enqueue:");
        displayQueue();

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        System.out.println("Queue after enqueue:");
        displayQueue();

        int removed = dequeue();
        System.out.println("Dequeued element: " + removed);

        System.out.println("Queue after dequeue:");
        displayQueue();
    }
}
