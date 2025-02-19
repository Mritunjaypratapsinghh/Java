package namingConventions;

public class NamingConventions {

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();

//        Vehicle vehicles = new Vehicle(); // Not recommended (should be singular unless it holds multiple)

        System.out.println("Max speed limit: " + Car.MAX_SPEED);
        System.out.println("Is running: " + car.isRunning());
    }
}

// 1. Class Names (Use Singular)
class Car {  //  Singular (Represents a single entity)

    // 2. Constants (Use Uppercase with Underscores)
    public static final int MAX_SPEED = 200;  //  Constant should be UPPER_CASE

    // 3. Variable Names (Use camelCase, Singular for Single Value, Plural for Collections)
    private String engineType;  //  Singular (holds one value)
    private int numberOfWheels; //  Singular with descriptor (improves clarity)
    private boolean running;    //  Boolean variable follows "is" prefix

    // List or array should be plural
    private String[] passengers; //  Plural (holds multiple values)

    // Constructor
    public Car() {
        this.engineType = "V8";
        this.numberOfWheels = 4;
        this.running = false;
        this.passengers = new String[]{"Alice", "Bob"};
    }

    // 4. Method Names (Use camelCase, Singular for Actions)
    public void startEngine() {  //  Verb-based, singular (Represents one action)
        System.out.println("Engine started");
        running = true;
    }

    public void stopEngine() {  //  Verb-based, singular
        System.out.println("Engine stopped");
        running = false;
    }

    // Boolean Getter (Use "is" prefix)
    public boolean isRunning() {  //  Uses "is" for boolean
        return running;
    }

    // 5. Plural in Methods (Only When Returning Multiple Items)
    public String[] getPassengers() {  //  Plural (Returns multiple passengers)
        return passengers;
    }
}

// Interface Naming (Singular, Like a Role or Ability)
interface Drivable {  //  Singular (Represents capability)
    void drive();
}

// Exception Naming (Use Singular and End with "Exception")
class InvalidSpeedException extends Exception {  //  Singular
    public InvalidSpeedException(String message) {
        super(message);
    }
}
