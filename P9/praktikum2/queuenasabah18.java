package P9.praktikum2;

public class queuenasabah18 {
    nasabah18[] data;
    int front;
    int rear;
    int size;
    int max;

    public queuenasabah18(int n) {
        max = n;
        data = new nasabah18[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isempty() {
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean isfull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if (!isempty()){
            System.out.println("Elemen terdepan adalah: " + data[front].norek + ""+ data[front].nama
            + " " + data[front].alamat+ " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print() {
        if (isempty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println(data[i].norek + " " + data[i].nama
                + " " + data[i].alamat + " " + data[i].umur + " " +data[i].saldo);
                i= (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama
                    + " " + data[i].alamat + " " + data[i].umur + " " +data[i].saldo );
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void clear() {
        if (!isempty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void enqueue(nasabah18 dt) {
        if (isfull()){
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (isempty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public nasabah18 dequeue() {
        nasabah18 dt = new nasabah18();
        if (isempty()){
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (isempty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
    public void peekrear() {
        if (!isempty()) {
            System.out.println("Antrian paling belakang adalah: " + data[rear].norek + " " + data[rear].nama
                    + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }


}
