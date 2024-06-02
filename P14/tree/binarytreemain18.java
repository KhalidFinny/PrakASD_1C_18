package P14.tree;

public class binarytreemain18 {
    public static void main(String[] args) {
        binarytree18 bt = new binarytree18();
        bt.addrec(6);
        bt.addrec(4);
        bt.addrec(8);
        bt.addrec(3);
        bt.addrec(5);
        bt.addrec(7);
        bt.addrec(9);
        bt.addrec(10);
        bt.addrec(15);
        System.out.print("PreOrder Traversal: ");
        bt.traversepreorder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal: ");
        bt.traverseinorder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal: ");
        bt.traversepostorder(bt.root);
        System.out.println("");
        System.out.println("Find Node: " +bt.find(5));
        System.out.println("Delete node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal: " );
        bt.traversepreorder(bt.root);
        System.out.println("");
    }
}
