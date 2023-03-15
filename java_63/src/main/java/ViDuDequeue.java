
import java.util.ArrayDeque;
import java.util.Deque;



public class ViDuDequeue {
    public static void main(String[] args) {
        Deque<String> danhsachsv =new ArrayDeque<>();
        danhsachsv.offerFirst("hello");
        danhsachsv.offerFirst("zalo");
        danhsachsv.offerLast("yuped");
        danhsachsv.offerLast("haah");
        int n=danhsachsv.size();
        for(int i=0;i<n;i++){
            System.out.println(danhsachsv.poll());
        }
    }
}
