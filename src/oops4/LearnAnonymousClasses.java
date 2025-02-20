package oops4;

public class LearnAnonymousClasses {

    // Anonymous inner class extending OuterClass
    OuterClass obj = new OuterClass() {
        void sing() {
            // Implementation here
        }

        @Override
        public void outerMethod() {
            // Implementation here
        }

        // Anonymous inner class implementing SuperInterface
        SuperInterface obj2 = new SuperInterface() {
            @Override
            public void interfaceMethod() {
                // Implementation here
            }
        };
    };
}

// Outer class definition
class OuterClass {
    public void outerMethod() {
        // Implementation here
    }
}

// Interface definition
interface SuperInterface {
    void interfaceMethod();
}
