package P14.tree;

public class binarytreemain18 {
    public static void main(String[] args) {
        binarytree18 bt = new binarytree18();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
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
