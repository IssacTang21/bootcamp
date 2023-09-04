
class Solution {
    public static String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder();
        int slength = 0;
        char[] arr = s.toCharArray();
        for(char car: arr){
            if(slength >0 && car == sb.charAt(slength - 1)){
                sb.deleteCharAt(slength-- - 1);
                
            }else{
                sb.append(car);
                slength++;
                System.out.println(sb.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbacca"));
    }
}