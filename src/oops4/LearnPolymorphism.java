package oops4;

class Data {
    int value;
}

public class LearnPolymorphism {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Inside Main Method number : " + number);

        Data dataObject = new Data();
        dataObject.value = 1;
        System.out.println("Before changeValue call, object value: " + dataObject.value);

        changeValue(number, dataObject);
        System.out.println("Inside Main Method, After changeValue call, number : " + number);
        System.out.println("After changeValue call, object value: " + dataObject.value);
    }

    static void changeValue(int number, Data dataObject) {
        number = 10;
        dataObject.value = 100;
        System.out.println("Inside changeValue Method, local number: " + number);
    }
}
