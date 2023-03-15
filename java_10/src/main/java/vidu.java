
public class vidu {
    public static void main(String[] args) {
        int a=1000;
        int b=20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        //ép kiểu ngầm định (từ kiểu dữ liệu thấp lên kiểu cao
        float c=a;
        float d=b;
        System.out.println("d="+c);
        System.out.println("c="+d);
        float e =3.5f;
        float f= 45.7f;
        //ép kiểu tường minh (từ kiểu dữ liệu cao về kiểu dữ liệu thấp
        int g= (int )e;
        int t =(int)f;
        System.out.println("g="+g); 
        //ép kiểu dữ liệu nguyên thủy và đối tượng
        int x =new Integer(32);
        System.out.println("x="+x);
        
    }
}
