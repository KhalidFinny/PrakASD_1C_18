package P12.doublelinklist;

public class dllmain18 {
    public static void main(String[] args) throws Exception {
        doublelinkedlist18 dll = new doublelinkedlist18();
        dll.addlast(50);
        dll.addlast(40);
        dll.addlast(10);
        dll.addlast(20);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("====================");
        dll.removefirst();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("====================");
        dll.removelast();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("===================");
        dll.remove(1);
        dll.print();
        System.out.println("Size: "+dll.size());
    }
}
