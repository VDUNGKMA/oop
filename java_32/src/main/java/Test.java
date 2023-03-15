
public class Test {
    public static void main(String[] args) {
        MyDate myDate =new MyDate(23, 4, 2022);
        System.out.println("ngay:"+myDate.getDay());
        myDate.setDay(30);
        System.out.println("ngay"+myDate.getDay());
        myDate.setMonth(8);
        System.out.println("thang"+myDate.getMonth());
        myDate.setMonth(13);
        System.out.println("thang"+myDate.getMonth());
        
    }
}
