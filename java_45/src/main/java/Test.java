
public class Test {

    public static void main(String[] args) {
        HangSanXuat hangSanXuat1 = new HangSanXuat("doll", "UK");
        HangSanXuat hangSanXuat2 = new HangSanXuat("dollA", "US");
        Phuongtiendichuyen p1 = new Maybay("xang", "xe tang", hangSanXuat2);
        Phuongtiendichuyen p2 = new Maybay("xang", "xe may", hangSanXuat1);
        Phuongtiendichuyen p3 = new Oto("xang", "xe O TO", hangSanXuat1);
        Phuongtiendichuyen p4 = new Xedap("Xe dap", hangSanXuat2);
        System.out.println("maybay1 "+p1.layvantoc());
        System.out.println("maybay2 "+p2.layvantoc());
         System.out.println("Oto "+p3.layvantoc());

    }
}
