package P15.graph;

public class graph18 {
    int vertex;
    doublelinkekdlist18 list[];
    private int a;


    public graph18(int v){
        vertex = v;
        list = new doublelinkekdlist18[v];
        for (int i = 0; i < v; i++) {
            list[i] = new doublelinkekdlist18();
        }
    }
    public void addedge(int asal, int tujuan, int jarak, boolean isdirected){
        if (isdirected){
            list[asal].addfirst(tujuan, jarak);
        } else {
            list[tujuan].addfirst(asal, jarak);
        }
    }
    public void degree(int asal, boolean isdirected) throws Exception{
        int k, totalin = 0, totalout = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size; j++) {
                if (list[i].get(j) == asal){
                    ++totalin;
                }
            }

            for (a = 0; a < list[asal].size; a++) {
                list[asal].get(a);
            }
            totalout = a;
        }
        if (isdirected){
            System.out.println("InDegree dari gedung " + (char) ('A' +asal) + ": " + totalin);
            System.out.println("OutDegree dari gedung " + (char) ('A' +asal) + ": " + totalout);
            System.out.println("Degree dari gedung " + (char) ('A' +asal) + ": " + (totalin + totalout));
        }else {
            System.out.println("Degree dari gedung" + (char) ('A' + asal) + ": " + list[asal].size);
        }
    }
    public void removeedge(int asal, int tujuan) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan){
                list[asal].remove(tujuan);
            }
        }
    }
    public void removealledges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }
    public void printgraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size > 0){
                System.out.println("Gedung " + (char) ('A' + i) + " Terhubung dengan");
                for (int j = 0; j < list[i].size; j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" +list[i].getjarak(j) + " m),");
                }
                System.out.println("");
            }

        }
        System.out.println("");
    }
}
