public class App {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello"); // Constructor
        // s = address (reference)
        s.append(" world"); // append() is faster than "+" in string
        s.append(1.3f);
        System.out.println(s.toString());

        System.out.println(s.append(true).append(1345).length());

        String str = " hello";
        String[] strs =  str.trim().replace('k' ,'e').split(" ");
        System.out.println(strs.length);

        StringBuilder s2 = new StringBuilder("start");
        // apporach 1
        System.out.println(s2.append('a').toString().charAt(3));
        // approach 2
        StringBuilder s3 = s2.append('a');
        String s4 = s3.toString();
        s4.charAt(3); // r

        // insert
        String s10 = "hello"; // how to insert a " " between ll
        StringBuilder s11 = new StringBuilder("hello");
        s11.insert(3, ' ');
        System.out.println(s11);

        s11.insert(5, "world").append("world");
        System.out.println(s11);
        
        System.out.println(s11.deleteCharAt(3));
        s11.setCharAt(4, 'j');
        System.out.println(s11.toString());

        StringBuilder str12 = new StringBuilder("hello");
        StringBuilder str13 = new StringBuilder("hello");
        System.out.println(str12 == str13); // false
    }
}