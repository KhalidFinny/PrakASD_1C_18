package P14.treearray;

public class binarytreearraymain18 {
    public static void main(String[] args) {
        binarytreearray18 bta = new binarytreearray18();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxlast = 6;
        bta.populatedata(data, idxlast);
        System.out.println("\nInOrder Traversal : ");
        bta.traverseinorder(0);
        System.out.println("\n");
    }

}
