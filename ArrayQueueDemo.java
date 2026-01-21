public class ArrayQueueDemo {
    static int[] q = new int[3];
    static int front = 0, rear = 0, size = 0;

    static void enqueue(int x) {
        if (size == q.length) resize();
        q[rear] = x;
        rear = (rear + 1) % q.length;
        size++;
    }

    static void resize() {
        int[] newQ = new int[q.length * 2];
        for (int i = 0; i < size; i++)
            newQ[i] = q[(front + i) % q.length];
        q = newQ;
        front = 0;
        rear = size;
    }

    static int dequeue() {
        if (size == 0) return -1;
        int val = q[front];
        front = (front + 1) % q.length;
        size--;
        return val;
    }

    static void displayQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++)
            System.out.print(q[(front + i) % q.length] + " ");
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