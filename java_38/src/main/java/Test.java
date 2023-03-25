
public class Test {

    public static void main(String[] args) {
        QuocGia quocGia1 = new QuocGia("0024", "us");
        QuocGia quocGia2 = new QuocGia("0025", "uk");
        HangSanXuat hangSanXuat1 = new HangSanXuat("airbus", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("bamboo", quocGia2);
        NgaySanXuat ngaySanXuat1 = new NgaySanXuat(04, 9, 2021);
        NgaySanXuat ngaySanXuat2 = new NgaySanXuat(06, 9, 2031);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngaySanXuat1, 30.5f, 12);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngaySanXuat2, 305.6, 24);
        System.out.println("may tinh 1 re hon may tinh 2 :" + mayTinh1.kiemtragiabanco1maytinhcothaphonkhong(mayTinh2));
        System.out.println("may tinh 2 re hon may tinh 1:" + mayTinh2.kiemtragiabanco1maytinhcothaphonkhong(mayTinh1));

        System.out.println("ten quoc gia maytinh1" + mayTinh1.intenquocgia());
        System.out.println("ten quoc gia maytinh2" + mayTinh2.intenquocgia());
       

    }
}
