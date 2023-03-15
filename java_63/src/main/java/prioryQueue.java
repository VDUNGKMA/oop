
import java.util.PriorityQueue;
import java.util.Queue;





public class prioryQueue {
    public static void main(String[] args) {
        Queue<String> danhsachsv =new PriorityQueue<>();
        danhsachsv.offer("zung ng");
        danhsachsv.offer("zung nv");
        danhsachsv.offer("zung nguyen");
        danhsachsv.offer("zung v");
        while (true) {            
            String ten=danhsachsv.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }
    }
}
