package P3.ArrayBalok;

public class sgArray18 {
    public static void main(String[] args) {

        segitiga18[] sgArray = new segitiga18[4];

        sgArray[0] = new segitiga18(10, 4);
        sgArray[1] = new segitiga18(20, 10);
        sgArray[2] = new segitiga18(15, 6);
        sgArray[3] = new segitiga18(25, 10);

        for (int i = 0; i < 3; i++) {
            System.out.println("Luas segitiga ke " + i + " adalah: " + sgArray[i].hitungLuas());
            System.out.println("Keliling segitiga ke " + i + " adalah: " + sgArray[i].hitungKeliling());
            System.out.println("");

        }

    }

}
