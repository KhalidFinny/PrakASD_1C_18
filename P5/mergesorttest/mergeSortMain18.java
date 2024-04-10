package P5.mergesorttest;

public class mergeSortMain18 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        mergesorting18 msort = new mergesorting18();
        System.out.println("Data awal");
        msort.printArray(data);
        msort.sort(data, 0, data.length - 1 );
        System.out.println("Setelah diurutkan");
        msort.printArray(data);
    }
}
