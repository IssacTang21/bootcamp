public class Demo {
    // static final (constant) (0-2)
    // Instance variable
    // static variable
    // constructors
    // public instance method // main logic
    // static method // tools
    // private method
    public static void main(String[] args) throws Exception {
        System.out.println(90);
        Weekday weekday = Weekday.TUE;

        // Approach 1
        int result = switch (weekday) {
            case MON, TUE -> 1;
            case WED -> 3;
            case THU -> 4;
            case FRI -> 5;
            // default -> -1;
        };

        // Approach 2
        int result3 = switch (weekday) {
            case MON, TUE: // condition is not allowed in Java 17
                System.out.println("Monday or Tuesday");
                yield 1; // yield means "return" + break
            case WED:
                System.out.println("Monday or Tuesday");
                yield 3;
            case THU:
                System.out.println("Monday or Tuesday");
                yield 4;
            case FRI:
                System.out.println("Monday or Tuesday");
                yield 5;
            // default -> -1;
        };


        // String str = "hello world";
        // String result2 = switch (str){
        // case str.length() -> "length > 5";
        // case str.contains("world") -> "contains world";
        // default -> "unknown";
        // }
    }

    public static int getWeekDay(Weekday weekday) {
        switch (weekday) { // enum
            case MON:
                return 1;
            case TUE:
                return 2;
            case WED:
                return 3;
            case THU:
                return 4;
            case FRI:
                return 5;
            default:
                return 0;
        }
    }

    public static char grade(int score) {
        char grade = ' ';
        switch (score) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 70:
                grade = 'C';
                break;
        }
        return grade;
    }
}
