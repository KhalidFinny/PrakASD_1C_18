package P12.tugas2;
public class dll18 {
    tugas218 head;
    int size;

    public dll18() {
        head = null;
        size = 0;
    }
    public boolean isempty(){
        return head == null;
    }
    public void addfirst(film18 item){
        if (isempty()) {
            head = new tugas218(null, item, null);
        } else {
            tugas218 newnode = new tugas218(null, item, head);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }
    public void addlast(film18 item){
        if (isempty()) {
            addfirst(item);
        } else {
            tugas218 current = head;
            while (current.next != null) {
                current = current.next;
            }
            tugas218 newnode = new tugas218(current, item, null);
            current.next = newnode;
            size++;
        }
    }
    public void add(film18 item, int posisi) throws Exception {
        if (posisi < 0 || posisi > size) {
            throw new Exception("nilai index diluar batas");
        }
        if (isempty() || posisi == 0) {
            addfirst(item);
        } else {
            tugas218 current = head;
            for (int i = 0; i < posisi - 1; i++) {
                current = current.next;
            }
            tugas218 newNodeFilm20 = new tugas218(current, item, current.next);
            if (current.next != null) {
                current.next.prev = newNodeFilm20;
            }
            current.next = newNodeFilm20;
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
    public void removefirst() {
        tugas218 tmp = head;
        if (!isempty()) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            System.out.println( tmp.data.judul + " telah dihapus");
        }else {
            System.out.println("Linked list kosong");
        }
    }
    public void removelast() {
        if (!isempty()) {
            if (head.next == null) {
                head = null;
            } else {
                tugas218 current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
                System.out.println( current.data.judul + " telah dihapus");
            }
            size--;
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void remove (int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("nilai indeks diluar batas");
        }else if (index == 0) {
            removefirst();
        }else {
            tugas218 current = head;
            for (int i = 0; i< index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next != null) {
                current.next.prev = current;
                System.out.println( current.data.judul + " telah dihapus");
            }
            size--;

        }
    }
    public void print() {
        tugas218 tmp = head;
        System.out.println("Daftar film");
        System.out.println("====================");
        while (tmp != null) {
            System.out.println("ID: " + tmp.data.id);
            System.out.println("Judul: " + tmp.data.judul);
            System.out.println("Rating: " + tmp.data.rating);
            System.out.println("-----------------------------");
            tmp = tmp.next;
        }
    }
    public film18 carifilm(int id) {
        tugas218 current = head;
        while (current != null) {
            if (current.data.id == id) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
    public void sortrating () {
        if (size > 1) {
            tugas218 current;
            boolean swapped;
            do {
                swapped = false;
                current = head;
                while (current.next != null) {
                    if (current.data.rating < current.next.data.rating) {
                        film18 temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped) ;
        }
    }
    public void printfilmnemu(film18 film) {
        System.out.println("ID: " + film.id);
        System.out.println("Judul: " + film.judul);
        System.out.println("Rating: " + film.rating);
        System.out.println("-----------------------------");
    }
}
