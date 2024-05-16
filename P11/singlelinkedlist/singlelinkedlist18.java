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
}
