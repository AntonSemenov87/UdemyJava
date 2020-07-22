package Section8;

import java.util.ArrayList;

//manually wrapping int as a class:
//class IntClass {
//    private int myValue;
//
//    public IntClass(int myValue) {
//        this.myValue = myValue;
//    }
//
//    public int getMyValue() {
//        return myValue;
//    }
//    public void setMyValue(int myValue) {
//        this.myValue = myValue;
//    }
//}


public class AutoboxingUnboxing {
    public static void main(String[] args) {
        String [] strArray = new String[10];
        int [] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        // ArrayList <int> intArrayList = new ArrayList<int>(); WRONG --> primitive type is not a class!
//        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
//        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(34);
        Double doubleValue = new Double(3.5);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myInt.intValue()





        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl < 10.0; dbl+=0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }


    }
}
