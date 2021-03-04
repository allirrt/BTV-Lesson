package com.irrt.generic;

import java.util.List;

public class BoxNambers<N extends Number> {
    private N[] boxNambers;

    public BoxNambers(N... boxNambers) {
        this.boxNambers = boxNambers;
    }

    public double average() {
        double avg = 0.0;
        for (int i = 0; i < boxNambers.length; i++) {
            avg += (double)boxNambers[i];
        }
        avg /= boxNambers.length;
        return  avg;
    }
    public boolean compareAverage(BoxNambers<N> another){
        return Math.abs(this.average() - another.average()) < 0.00001;
    }
public static <T> T getFerstElement (List<T> list){
        return list.get(0);
};
    public static void doSomething(BoxNambers<? extends Number> box){};

    public static void doSomething1(BoxNambers<Number> box){};


    public static void main(String[] args) {
        BoxNambers<Double> integerBoxNambers = new BoxNambers<Double>(2.4d,1.6d,3.8d,4.23d);
        BoxNambers<Double> integerBoxNambers1 = new BoxNambers<Double>(2.4d,1.6d,3.8d,4.2301d);
        System.out.println(integerBoxNambers.average());
        System.out.println(integerBoxNambers.compareAverage(integerBoxNambers1));

        BoxNambers<Number> gbn = new BoxNambers<>(1);
        BoxNambers<Integer> gbn1 = new BoxNambers<>(1);
        doSomething(gbn);
        doSomething(gbn1);
        doSomething1(gbn);
      //  doSomething1(gbn1);

    }
}
