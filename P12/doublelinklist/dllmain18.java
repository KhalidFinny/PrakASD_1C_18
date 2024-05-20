package P12.doublelinklist;

public class dllmain18 {
    public static void main(String[] args) throws Exception {
        doublelinkedlist18 dll = new doublelinkedlist18();
        System.out.println("Size: "+dll.size());
        System.out.println("====================");
        dll.addfirst(3);
        dll.addlast(4);
        dll.addfirst(7);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("====================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("===================");
        System.out.println("Data awal pada linked list adalah: " + dll.getfirst());
        System.out.println("Data akhir pada linked list adalah: " + dll.getlast());
        System.out.println("Data pada indeks ke-1 adalah: " + dll.get(1));
    }
}
