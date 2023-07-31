

public class Machine {

    private double weight;

    public Machine() {

    }

    public Machine(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void start() {
        System.out.println("start..");
    }

    public void stop() {
        System.out.println("stop..");
    }

    public final static String staticMethod(String x, String y) {
        return x + y;
    }

    // cannot override the final method in superclass

    public static Machine produce(int code) {
        switch (code) {
            case 1:
                return new Machine();
            case 2:
                return new Laptop();
        }
        return new Machine();
    }

    public static void stop(int code){ // what 
        Machine machine = Machine.produce(code);
        machine.stop(); // difference child class will have different implementation
    }

    public static void main(String[] args) {
        int pockeyMoney = 100;
        boolean stopCondition = pockeyMoney < 0; // ???
        int code = 1;

        if (stopCondition) {
            Machine.stop(code);
        }

        Machine machine1 = Machine.produce(1); // Machine
        machine1.stop(); // Machine stop..
        Machine machine2 = Machine.produce(2); // Laptop
        machine2.stop(); // Laptop stop..
    }
}
