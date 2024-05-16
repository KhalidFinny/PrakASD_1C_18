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
    }
}
