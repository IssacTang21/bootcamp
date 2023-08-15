// outer class
// can access static nested class attribute

import java.util.List;

public class Student {
    String name;
    Bag bag;

    // constructor
    // getter, setter
    // static method & variable
    // method -> bag.method, instance variable
    public void setName(String name) {
        this.name = name;
    }

    // method -> Bag.method, instance variable
    public int getBagSize() {
        return this.bag.size;
    }

    public String getName() {
        return this.name;
    }

    public Student(String anme, Bag bag) {
        this.name = name;
        bag = new Student.Bag();
    }

    public Student() {

    }   

    public void clearBag(){
        // Outer class access "static nested class" static method
        Bag.clear(this.bag);
    }

    public String toString(){
        return "["+this.name+"grade["+this.bag+"]";
    }


    // static nested class
    // cannot access outer class attribute
    private static class Bag {
        int size;
        List<String> strings;

        public Bag() {

        }

        public Bag(int size) {
            this.size = size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getSize() {
            return this.size = size;
        }
        // constructor
        // getter, setter
        // static method & variable

        public static void clear(Bag bag){
            bag.strings.clear();
            // add(1+3); compile error
        }

       
        @Override
        public String toString(){
            return "bag[size"+this.size+"strings="+this.strings+"]";
        }
    }

    public class Grade{
     private int score;
     
     public Grade(int score){
        this.score = score;
     }


     public int getScore(){
        return this.score;
     }
     //isMale()
     //isElder()
     public char getGrade(){
        switch(this.score){
            case 90:
             return 'A';
             case 80:
             return 'B';
             case 70:
             return 'C';
             default:
             return 'F';
        }
     }

     public void printStudentName(){
        System.out.println(Student.this.getName());
     }

     public static void printHello(){
        Grade.printHello();
     }
     
    }
    // Inner class (non-static nested class)

    public static void main(String[] args) {
        Student student = new Student(); // student's constructor
        Student.Bag bag = new Student.Bag(); // bag's constructor
        Student.Grade grade = new Student().new Grade(70);
        Student.Grade grade2 = student.new Grade(60);

        System.out.println();
        
    }
}
