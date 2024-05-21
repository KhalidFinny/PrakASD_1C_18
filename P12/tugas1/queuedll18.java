package P12.tugas1;

public class queuedll18 {
    nodeddl18 front, rear;
    int size;

    public queuedll18() {
        front = rear = null;
        size = 0;
    }
    public boolean isempty() {
        return front == null;
    }
    public void enqueue(int antri, String nama) {
        nodeddl18 newnode = new nodeddl18(null, new tugas118(antri, nama), null);
        if (isempty()) {
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            newnode.prev = rear;
            rear = newnode;
        }
        size++;
    }
    public tugas118 dequeue() {
        if (isempty()) {
            return null;
        }
        tugas118 item = front.data;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }
        size--;
        System.out.println(item.nama + " telah selesai divaksinasi");
        return item;
    }
    public tugas118 peek() {
        if (isempty()) {
            return null;
        }
        return front.data;
    }

    public void print() {
        nodeddl18 tmp = front;
        System.out.println("Antrian vaksin");
        System.out.println("====================");
        while (tmp != null) {
            System.out.println("Antrian: " + tmp.data.antri);
            System.out.println("Nama: " + tmp.data.nama);
            System.out.println("-----------------------------");
            tmp = tmp.next;
        }
        System.out.println("Sisa antrian: " + size);
    }
}
