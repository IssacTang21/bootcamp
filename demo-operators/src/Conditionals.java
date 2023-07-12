public class Conditionals {
  public static void main(String[] args) {
    // if , else if, else
    int i = 10;
    if (i > 9) { // asking if i >9 , if yes, execute the block of the codes
      System.out.println("i=" + i); // i=10
    }
    // flow control, if-else
    if (i < 8) {
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i is larger than or equals to 8");
    }

    // else-if
    if (i > 12) {
      System.out.println("i >12"); // not executed
    } else if (i <= 12 && i > 0) {
      System.out.println("i <= 12 and i >= 0"); // executed
    } else {
      System.out.println("i is negative"); // not executed
    }

    int a = 2;
    int b = 5;
    int box = 0;
    if (a > b) {
      box = 10;
    } else {
      box = 19;
    } // box = 19

    String day = "Saturday";
    if (day.equals("Sunday") || day.equals("Saturday")) {
      System.out.println("it's a weekend!");
    } else {
      System.out.println("it's a weekday!");
    }

    int prize = 20;
    if (prize < 10) {
      System.out.println("buy!");
    } else {
      System.out.println("Don't buy!");
    }

    int number = 11;
    if (number % 2 == 1) {
      System.out.println("the number is an odd number");
    } else {
      System.out.println("the number is an even number");
    }
    // string
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }
    if (str.charAt(4) == 'd') { // false, charAt(4) -> 'a'
      System.out.println("yes");
    }
    if (str.length() > 10) { // false
      System.out.println("length > 10");
    }
    if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("what is the result now?");
    }

    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else if (score >= 50) {
      grade = 'E';
    } else {
      grade = 'F';
    }

    int age = 65;
    boolean isElderly = age >= 65;
    // if (age >= 65) {
    if (isElderly) { // true or false
      System.out.println("yes he is elderly");
    }

    // switch
    // simple Version
    int DayOfWeek = 3;
    String DayName = " ";
    switch (DayOfWeek) { // event
      case 1:
        DayName = "Monday";
        break; // exit
      case 2:
        DayName = "Tuesday";
        break; // exit
      case 3:
        DayName = "Wednesday";
        break; // exit
      case 4:
        DayName = "Thursday";
        break; // exit
      case 5:
        DayName = "Friday";
        break; // exit
      case 6:
        DayName = "Saturday";
        break; // exit
      case 7:
        DayName = "Sunday";
        break; // exit
      // default
    }
  }

}
