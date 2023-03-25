
public class Test {

    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(23, 4, 2022);
        MyDate myDate2 = new MyDate(13, 4, 2022);
        MyDate myDate3 = new MyDate(23, 4, 2022);
        System.out.println("so sanh mydate1 voi mydate3:"+myDate1.equals(myDate3));
        System.out.println("so sanh mydate1 voi mydate2:"+myDate1.equals(myDate2));

        System.out.println(" hascode mydate1 "+myDate1.hashCode());
        System.out.println(" hascode mydate2 "+myDate2.hashCode());
        System.out.println(" hascode mydate3 "+myDate3.hashCode());

        
            }
}
