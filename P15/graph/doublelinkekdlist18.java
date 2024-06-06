package P15.graph;

public class doublelinkekdlist18 {
    node18 head;
    int size;

    public doublelinkekdlist18() {
        head = null;
        size = 0;
    }
    public boolean isempty() {
        return head == null;
    }
    public void addfirst(int item, int jarak) {
        if (isempty()) {
            head = new node18(null, item, jarak, null);
        } else {
            node18 newNode = new node18(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public int getjarak(int index) throws Exception {
        if (isempty() || index >= size) {
            throw new Exception("Linked list kosong atau indeks di luar batas");
        }
        node18 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    public int get(int index) throws Exception {
        if (isempty() || index >= size) {
            throw new Exception("Linked list kosong atau indeks di luar batas");
        }
        node18 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                throw new Exception("Indeks di luar batas");
            }
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void remove(int index) {
        node18 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }
    public void clear() {
        head = null;
        size = 0;
    }
}


