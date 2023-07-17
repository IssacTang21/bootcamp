public class Loop2 {
  public static void main(String[] args) {
    // break
    for (int i = 0; i < 6; i++) { // 0, 1, 2, 3, 4, 5
      for (int j = 0; j < 3; j++) { // 0, 1, 2
        System.out.println("i=" + i + "j=" + j);
        if (i == j) {
          break; // this break statment just break the inner loop
        }
      }
      // here
    }

    // continue
    for (int i = 0; i < 6; i++) { // 0, 1, 2, 3, 4, 5
      for (int j = 0; j < 3; j++) { // 0, 1, 2
        if (i == j) {
          continue; // skip the rest in inner loop, go to next iteration
        }
        System.out.println("i=" + i + ", j=" + j);
      }
    }
    // i = 0, j = 1
    // i = 0, j = 2
    // i = 1, j = 0
    // i = 1, j = 2
    // i = 2, j = 0
    // i = 2, j = 1
    // i = 3, j = 0
    // i = 3, j = 1

    String str = "I love programming, i love java.";
    System.out.println("str length=" + str.length());
    // for loop iteration times, based on the length of the string
    for (int i = 0; i < str.length(); i++) { // i < 32, (0-31)
      System.out.println("hello.");
    }
    // print the index of the character, the first time of the character 'e'
    // str.charAt(int index)
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        System.out.println("the index of first character of 'e' is " + i);
        break;
      }
    }

    // check if 'y' exists in the string
    // found or not found
    boolean isYExist = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'y') {
        isYExist = true;
      }
    }
    if (isYExist) { // if (isYExist) = if (isYExist == true)
      System.out.println("the string exist 'y'");
    } else {
      System.out.println("the string doesn't exist 'y'");
    }

    // if the number of occurrance of target >= 3, print yes
    // otherwise, print no
    char target = 'o';
    int count = 0;
    boolean found = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        count++;
      }
      // nice to have
      if (count >= 3){ 
        found = true;
        break;
      }
    }
    if (found){
      System.out.println("yes");
    } else {
      System.out.println("No");
    }

  }
}
