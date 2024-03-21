package P5.SumArrray;

public class sum18 {
    int element;
    double keuntungan[], total;
    sum18( int element){
        this.element = element;
        this.keuntungan = new double[element];
        this.total = 0;
    }
    double totalBF (double array[]){
        for (int i = 0; i < element; i++) {
            total = total + array[i];

        }
        return total;
    }
    double totalDC(double array[], int l, int r){
        if (l == r){
            return array[l];
        } else if (l < r){
            int mid = (l + r) / 2;
            double lsum = totalDC(array, l, mid);
            double rsum = totalDC(array, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
