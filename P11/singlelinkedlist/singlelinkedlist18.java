package P11.singlelinkedlist;

public class singlelinkedlist18 {
    node18 head, tail;

    boolean isempty() {
        return head == null;
    }

    void print() {
        if (!isempty()) {
            node18 tmp = head;
            System.out.print("Isi linked list" + "\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("linked list kosong");
        }
    }

    void addfirst(int input) {
        node18 ndinput = new node18(input, head);
        if (isempty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            head = ndinput;
        }
    }

    void addlast(int input) {
        node18 ndinput = new node18(input, null);
        if (isempty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            tail.next = ndinput;
            tail = ndinput;
        }
    }

    void insertafter(int key, int input) {
        node18 ndinput = new node18(input, head);
        node18 temp = head;
        do {
            if (temp.data == key) {
                ndinput.next = temp.next;
                temp.next = ndinput;
                if (ndinput.next != null) {
                    tail = ndinput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index, int input) {
        if (index == 0) {
            addfirst(input);
        } else {
            node18 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                node18 ndinput = new node18(input, temp.next);
                temp.next = ndinput;
                if (ndinput.next == null) {
                    tail = ndinput;
                }
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }

    int getdata(int index) {
        node18 tmp = head;
        for (int i = 0; i < index ; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    int indexof(int key) {
        node18 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return -1;
        } else {
            return index;
        }
    }
    void removefirst() {
        if (head == null) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    void removelast() {
        if (head == null) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            node18 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }
    void remove(int key) {
        if (head == null) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            if (head.data == key) {
                removefirst();
            } else {
                node18 temp = head;
                while (temp.next != null && temp.next.data != key) {
                    temp = temp.next;
                }
                if (temp.next != null) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                }
            }
        }
    }

    public void removeat(int index) {
        if (index == 0) {
            removefirst();
        } else {
            node18 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }
    }
}
