package methods;

public class LearnMath {
    public static void main(String[] args) {
        int a =2;
        int b=5;
        System.out.println(args[0]);
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a,b));
        System.out.println(Math.abs(-3));
        System.out.println(getRandom());// We are calling getRandom() Function which will give random number from 0 to 100
        System.out.println(getRandomAToB(10,50));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.floor(3.8));
        System.out.println(Math.round(3.6));


    }

    public static int getRandomAToB(int a, int b){
        return (int)(Math.random()*(b-a+1)+a);
    }

    public static int getRandom(){
        return (int)(Math.random()*100); //Here we are multiplying by 100 so that random number range from 0 to 100
    }

    public int max(int a,int b){
        return Math.max(a,b);
    }
}