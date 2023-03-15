
public class Test {

    public static void main(String[] args) {
        MayTinhCasio casio = new MayTinhCasio();
        MayTinhVinacal vinacal = new MayTinhVinacal();
        System.out.println("casio " + casio.cong(3, 5));
        System.out.println("vinacal " + vinacal.tru(3, -1));
        System.out.println("vinacal " + vinacal.chia(3, 0));
        double[] arr = new double[]{1, 9, 5, 6, 3, 2};
        
        SapXepChen sapXepChen=new SapXepChen();
        SapXepChon sapXepChon =new SapXepChon();
        sapXepChon.sapxepgiam(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        double[] arr2 = new double[]{1, 8, 5, 6, 3, 4};
        phanmemmaytinh phanmecomputer= new phanmemmaytinh();
        phanmecomputer.cong(3, 4);
        phanmecomputer.sapxepgiam(arr2);
       for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println("\n");
        phanmecomputer.sapxeptang(arr2);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
