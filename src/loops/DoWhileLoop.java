package loops;

public class DoWhileLoop {
    public static void main(String[] args){
        //Do While Loop
        //SYNTAX - do{}while() //do block will execute first always then it will check while loop condition if true then do block will execute again
        int i = 0;
        do{//First do block will execute
            System.out.println(i);
            i++;
        }
        while(i<3);//then it will check the case and if true it will again go to the do block

    }
}
