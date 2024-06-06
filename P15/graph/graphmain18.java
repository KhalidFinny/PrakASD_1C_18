package P15.graph;

public class graphmain18 {
    public static void main(String[] args) throws Exception {
        graph18 gedung = new graph18(6);
        gedung.addedge(0, 1, 50, true);
        gedung.addedge(0, 2, 100, true);
        gedung.addedge(1, 3, 70, true);
        gedung.addedge(2, 3, 40, true);
        gedung.addedge(3, 4, 60, true);
        gedung.addedge(4, 5, 80, true);
        gedung.degree(0, true);
        gedung.printgraph();
    }
}
