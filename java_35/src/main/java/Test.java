
public class Test {

    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(30, 3, 2001);
        Ngay ngay2 = new Ngay(10, 3, 2001);
        Ngay ngay3 = new Ngay(30, 3, 2041);

        TacGia tacGia1 = new TacGia("mycon 1", ngay1);
        TacGia tacGia2 = new TacGia("mycon 2", ngay2);
        TacGia tacGia3 = new TacGia("mycon 3", ngay3);

        Sach sach1 = new Sach("dsfld", 3, 3451, tacGia1);
        Sach sach2 = new Sach("ld", 3, 3450, tacGia2);
        Sach sach3 = new Sach("ddsdd", 3, 3450, tacGia3);

        sach1.intensach();
        sach2.intensach();
        sach3.intensach();
        System.out.println("so sanh nam xb cua sach1 va sach2" + sach1.equals(sach2));
        System.out.println("so sanh nam xb cua sach2 va sach3" + sach2.equals(sach3));
        System.out.println("so sanh nam xb cua sach1 va sach3" + sach1.equals(sach3));
        System.out.println("so sanh namxb sach1 va 3"+sach1.sosanhnamxb(sach3));
        System.out.println("gia sau khi giam 10% sach1 "+sach1.giasaukhigiam(10));
        System.out.println("gia sau khi giam 20% sach2 "+sach2.giasaukhigiam(20));
        System.out.println("gia sau khi giam 30% sach3 "+sach3.giasaukhigiam(30));

    }
}
