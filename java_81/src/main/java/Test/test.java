
package Test;

import Model.CounterModel;
import View.CounterView;


public class test {
    public static void main(String[] args) {
        CounterModel ct= new CounterModel();
        ct.increment();
        ct.increment();
        ct.increment();
        System.out.println(ct.getValue());
        ct.decrement();
        System.out.println(ct.getValue());
        CounterView ctv =new CounterView();
    }
}
