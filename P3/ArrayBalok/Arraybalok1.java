package P3.ArrayBalok;

public class Arraybalok1 {
    public static void main(String[] args) {
        Balok18[] blArray = new Balok18[3];
        Balok18[] blArray2 = new Balok18[3];
        Balok18[] blArray3 = new Balok18[3];

        blArray[0] = new Balok18(100, 30, 12);
        blArray[1] = new Balok18(120, 40, 15);
        blArray[2] = new Balok18(210, 50, 25);

        blArray2[0] = new Balok18();
        blArray2[1] = new Balok18();
        blArray2[2] = new Balok18();

        blArray3[0] = new Balok18(120, 15);
        blArray3[1] = new Balok18(12, 5);
        blArray3[2] = new Balok18(10, 50);

        System.out.println("Konstruktor 1");
        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray2[i].hitungVolume());

        }
        System.out.println("");
        System.out.println("Konstruktor 2");
        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());

        }
        System.out.println("");
        System.out.println("Konstruktor 3");
        for (int i = 0; i < 3; i++) {

            System.out.println("Volume balok ke " + i + ": " + blArray3[i].hitungVolume());

        }
        System.out.println("");
    }

}
