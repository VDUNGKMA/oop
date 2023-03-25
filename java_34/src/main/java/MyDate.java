
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (year >= 0) {
            this.year = year;
        } else {
            this.year = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return "MyDate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

   
    //để so sánh giữa 2 đối tượng ta có 2 cách dùng là equanls or hascode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyDate other = (MyDate) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        return this.year == other.year;
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.day;
        hash = 31 * hash + this.month;
        hash = 31 * hash + this.year;
        return hash;
    }
    

    
    
    
}
