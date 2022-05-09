


    /***
     * Rules
     * 1. Arguments List: Arguments list in the overriding method should be same as the parent class overridden method
     * 2. Access Modifier: Access modifier of the overriding method cannot be more restrictive than the overridden method
     * 3. private, static and final methods cannot be overridden as they are local to the class
     */
    public class OverRidingDemo extends OverRideDemoTester {

        public static void main(String[] args) {
            OverRideDemoTester c1 = new OverRidingDemo();
            c1.increaseSpeed();
            c1.engineStart(2);
        }

        @Override
        public void engineStart(int cyl) {
            // super.engineStart(2);
            System.out.println("I am from the child class");
        }

        public static void staticExample() {
            System.out.println("I am the static method from the child class");
        }
    }
