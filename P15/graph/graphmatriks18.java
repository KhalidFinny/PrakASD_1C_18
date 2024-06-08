package P15.graph;

public class graphmatriks18 {
    int vertex;
    int[][] matriks;

    public graphmatriks18(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makedege(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeedge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printgraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int outDegree(int node) {
        int outDegreeCount = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[node][i] != 0) {
                outDegreeCount++;
            }
        }
        return outDegreeCount;
    }

    public int inDegree(int node) {
        int inDegreeCount = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != 0) {
                inDegreeCount++;
            }
        }
        return inDegreeCount;
    }

    public int degree(int node) {
        return inDegree(node) + outDegree(node);
    }
}

