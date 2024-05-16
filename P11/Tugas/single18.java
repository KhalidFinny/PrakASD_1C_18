package P11.Tugas;
public class single18 {
    sll18 head;
    int size;
    public single18() {
        head = null;
        size = 0;
    }
    boolean isempty() {
        return head == null;
    }
    public void addfirst(mahasiswa18 item) {
        head = new sll18(item, head);
        size++;
    }
    public void addlast(mahasiswa18 item) {
        if (isempty()){
            addfirst(item);
        } else {
            sll18 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new sll18(item, null);
            size++;
        }
    }
    public void insertAfter(int key, mahasiswa18 item) {
        sll18 tmp = head;
        while (tmp != null && tmp.data.nim != key) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            tmp.next = new sll18(item, tmp.next);
            size++;
        }
    }
    public void insertAt(int index, mahasiswa18 item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addfirst(item);
        } else {
            sll18 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new sll18(item, tmp.next);
            size++;
        }
    }
    public void print() {
        sll18 tmp = head;
        while (tmp != null) {
            System.out.println("NIM: " + tmp.data.nim + ", Nama: " + tmp.data.nama);
            tmp = tmp.next;
        }
    }
}

