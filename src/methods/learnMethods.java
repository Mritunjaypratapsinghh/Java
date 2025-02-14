package methods;

public class learnMethods {
    public static void main(String[] args){
        System.out.println(args[0]);// this args can be passed in configuration as string array parameters
        for(String arg: args){
            System.out.println("This is parameter of main method: "+arg);
        }

        greet();// Only static Methods can be called from static method
        double ans = average(2,3);
        System.out.println(ans);
    }

    public static void greet(){
        System.out.println("Inside Static Method greet");
    }

    public static double average(double a, double b){
        return (a+b)/2;

    }

}
