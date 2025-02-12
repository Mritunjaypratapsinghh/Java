package basics1;

public class Datatypes {

    public static void main(String[] args){

        boolean isPassed = true;// By default stores false if not assigned
        byte marks = 127; // RANGE -128 to 127
        short num = 1234; // RANGE -32768 to 32767
        int count = 10; // RANGE -2^31 to 2^31
        long big = 2345678; // To Store very large number
        float pi = 3.14f; // for storing 6 to 7 decimal digits and have to use f explicitly
        double secondPi = 3.143456789567; // for precision of decimal numbers, can handle 15 decimal digits
        char myLetter = 'A'; //ony contain single character withing single quotes


        System.out.println(pi);
        System.out.println(secondPi);
        System.out.println(myLetter);

        //Implicit Conversion

        //byte can be converted to short,int,long,double,float
        //short can be converted to int,long,float,double
        //int can be converted to long, float and double
        //long can be converted to float and double
        //char can be converted to int

        byte first = 12;
        short second = first;
        int third = second;
        long fourth = third;
        float fifth = fourth;
        double sixth = fifth;
        char seventh = 'A';

        System.out.println(first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth);

        //Explicit conversion

        //data can be lost in this process suppose there is a number of long
        //which exceeds the range of int, and it is converted from long to int explicitly then data can be lost

        long six = 21456;
        int newone = (int)six;//Explicit Conversion known as type casting

        System.out.println(six+"-long  "+newone+"-int");

        int age = 150;
        byte newage = (byte)age;// type casting
        System.out.println(newage);//-106: due to loss 8 bits got reversed

    }
}
