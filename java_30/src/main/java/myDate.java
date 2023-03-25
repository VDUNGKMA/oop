
public class myDate {
    private int month;
    private int day;
    private int year;
    //phương thức khởi tạo(constructer)
    public myDate(int day,int month,int year){
       this.day=day;
       this.month=month;
       this.year=year;
    }
    public void printDay(){
        System.out.println("day:"+this.day);
    }
    public void printMonth(){
        System.out.println("month:"+this.month);
    }
    public void printYear(){
        System.out.println("year:"+this.year);
    }
    public void printDate(){
        System.out.println("date:"+this.day+"/"+this.month+"/"+this.year);
    }
}
