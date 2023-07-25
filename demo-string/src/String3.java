public class String3 {

    //String Literal Pool <- String is immutable
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abc";
        System.out.println(str.equals(str2)); // true
        System.out.println(str == str2); // true, address same?

        // string literal pool -> "abc"
        String str3 = "abcd";
        System.out.println(str.equals(str3)); // false
        System.out.println(str == str3); // false, thier address are not same

        str = "abc100"; // because "abc100" is not equal to "abc" -> immutable -> create another object
        System.out.println(str == str2); // false

        String temp = str;
        str = new String("abc100"); // new object
        System.out.println(temp == str); // same value, but false

        
        

    }
}
