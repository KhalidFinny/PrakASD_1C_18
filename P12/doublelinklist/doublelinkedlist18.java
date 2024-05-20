package P12.doublelinklist;

public class doublelinkedlist18 {
    node18 head;
    int size;

    public doublelinkedlist18() {
        head = null;
        size = 0;
    }
    public boolean isempty(){
        return  head == null;
    }
    public void addfirst(int item) {
        if (isempty()) {
            head = new node18(null, item, null);
        } else {
            node18 newnode = new node18(null, item, head);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }
    public void addlast (int item) {
        if (isempty()) {
            addfirst(item);
        } else {
            node18 current = head;
            while (current.next != null) {
                current = current.next;
            }
            node18 newnode = new node18(current, item, null);
            current.next = newnode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception {
        if (isempty()) {
            addfirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            node18 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node18 newnode = new node18(null, item, current);
                current.prev = newnode;
                head = newnode;
            } else {
                node18 newnode = new node18(current.prev, item, current);
                newnode.prev = current.prev;
                newnode.next = current;
                current.prev.next = newnode;
                current.prev = newnode;
            }
            size++;
        }
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public void print() {
        if (!isempty()) {
            node18 tmp = head;
            while ((tmp != null)){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("linked list kosong");
        }
    }
}
