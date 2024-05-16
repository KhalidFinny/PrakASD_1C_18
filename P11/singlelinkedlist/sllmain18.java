package P11.singlelinkedlist;

public class sllmain18 {
    public static void main(String[] args) {
        singlelinkedlist18 singll = new singlelinkedlist18();

        singll.print();
        singll.addfirst(890);
        singll.print();
        singll.addlast(760);
        singll.print();
        singll.addfirst(700);
        singll.print();
        singll.insertafter(700, 999);
        singll.print();
        singll.insertAt(3, 833);
        singll.print();

        System.out.println("data pada index ke-1 = " +singll.getdata(1));
        System.out.println("data 3 berada pada index ke - " +singll.indexof(760));

        singll.remove(999);
        singll.print();
        singll.removeat(0);
        singll.print();
        singll.removefirst();
        singll.print();
        singll.removelast();
        singll.print();

    }
}
