package oops;

import static java.awt.AWTEventMulticaster.add;

public class polymorphismMethodprogram {
    public static void main(String[] args) {
        //method call for method addition integer
        int result = add(4,5);
        double resultvalue = add(5.5,6.6);
        System.out.println("M1"+ result+"M2"+resultvalue);

    }

    private static int add(int v , int v1){
        return v+v1;
    }

    private static double add(double v,double v1){
        return v + v1;

    }

}

