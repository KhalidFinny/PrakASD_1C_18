package P11.Tugas;

public class main18 {
    public static void main(String[] args) {
        single18 sll = new single18();
        mahasiswa18 mhs = new mahasiswa18(111, "Anton");
        mahasiswa18 mhs1 = new mahasiswa18(112, "Prita");
        mahasiswa18 mhs2 = new mahasiswa18(113, "Yusuf");
        mahasiswa18 mhs3 = new mahasiswa18(114, "Doni");
        mahasiswa18 mhs4 = new mahasiswa18(115, "Sari");
        sll.addfirst(mhs);
        sll.insertAfter(111, mhs1);
        sll.addlast(mhs2);
        sll.addlast(mhs3);
        sll.insertAt(4, mhs4);
        sll.print();
    }
}
