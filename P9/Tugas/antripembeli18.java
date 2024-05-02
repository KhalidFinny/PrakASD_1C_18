package P9.Tugas;
public class antripembeli18 {
    pembeli18[] data;
    int front;
    int rear;
    int size;
    int max;

    public antripembeli18(int n) {
        max = n;
        data = new pembeli18[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isempty() {
        if (size == 0) {
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
        if (!isempty()) {
            System.out.println("Elemen terdepan adalah: " + data[front].nama + "" + data[front].nohp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print() {
        if (isempty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + "  " + data[i].nohp);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].nohp);
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

    public void enqueue(pembeli18 dt) {
        if (isfull()) {
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

    public pembeli18 dequeue() {
        pembeli18 dt = new pembeli18();
        if (isempty()) {
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
            System.out.println("Antrian paling belakang adalah: " + data[rear].nama + "" + data[rear].nohp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public String peekposition(String nama){
        String hasil = "Antrian tidak ditemukan";
        for (int i = 0; i < data.length; i++) {
            if (data[i].nama.equalsIgnoreCase(nama)) {
                hasil = data[i].nama + data[i].nohp;
            }
        }
        return hasil;
    }
    public void datapembeli() {
        if (isempty()) {
            System.out.println("Masih ada yang mengantri");
        } else {
            System.out.println("Data pembeli: ");
            for (pembeli18 pembeli : data) {
                System.out.println(pembeli.nama + " " + pembeli.nohp);
            }
        }
    }

}

