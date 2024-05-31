package P14.treearray;

public class binarytreearray18 {
    int[] data;
    int idxlast;
    public binarytreearray18() {
        data = new int[10];
    }
    void populatedata(int data[], int idxlast){
        this.data = data;
        this.idxlast = idxlast;
    }
    void traverseinorder(int idxstart){
        if (idxstart <= idxlast){
            traverseinorder(2*idxstart+1);
            System.out.print(data[idxstart]+" ");
            traverseinorder(2*idxstart+2);
        }
    }
}
