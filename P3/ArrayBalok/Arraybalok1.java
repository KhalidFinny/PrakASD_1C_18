package P3.ArrayBalok;

public class Arraybalok1 {
    public static void main(String[] args) {
        Balok18[] blArray = new Balok18[3];

        blArray[0] = new Balok18(100, 30, 12);
        blArray[1] = new Balok18(120, 40, 15);
        blArray[2] = new Balok18(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());

        }
    }

}
