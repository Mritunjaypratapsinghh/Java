package loops;

public class breakAndContinue {
    public static void main(String[] args) {
        //To print only even numbers till 10
        for (int i = 0; i <=20 ; i+=2) {

            if(i==0){
                continue;
            }
            else if(i>10){
                break;
            }
            System.out.println(i);

        }

        for (int i = 0; i <=20; i++) {
            if(i==2 || i==8){
                continue;
            }
            if(i>=15){
                break;
            }
            System.out.println("gave toffee to: "+i);
        }


    }
}
