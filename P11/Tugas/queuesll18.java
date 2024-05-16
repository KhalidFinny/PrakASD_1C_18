package P11.Tugas;
public class queuesll18 {
    nd18 front, rear;
    int size;
    public queuesll18() {
        front = rear = null;
        size = 0;
    }
    public boolean isempty() {
        return front == null;
    }
    public void enqueue(tugas218 item) {
        nd18 newNode = new nd18(item, null);
        if (isempty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public tugas218 dequeue() {
        if (isempty()) {
            return null;
        }
        tugas218 item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }
    public tugas218 peek() {
        if (isempty()) {
            return null;
        }
        return front.data;
    }

    public void print() {
        nd18 tmp = front;
        while (tmp != null) {
            System.out.println("NIM: " + tmp.data.nim + ", Nama: " +
                    tmp.data.nama);
            tmp = tmp.next;
        }
    }
}
