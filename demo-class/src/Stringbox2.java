import java.util.Arrays;

public class Stringbox2 {
  private char[] string;

  public Stringbox2(char[] source) {
    this.string = new char[source.length];
    // approach 1
    // for (int i = 0; i < source.length; i++){
    // string[i] = source[i];
    // }

    // approach 2
    // copyOf() ->new array object, and with the copy value of the original array
    this.string = Arrays.copyOf(source, source.length);
  }

  public Stringbox2 append(String x){
 char[] res = new char[this.string.length + x.length()];
 int idx = 0;
 int j = 0;
  while (idx < this.string.length){
res[idx] = this.string[j];
idx++;
j++;
  }
  j = 0;
  while (j < x.length()){
    res[idx] = x.charAt(j);
    idx++;
    j++;
  }
  this.string = res;
  return this;
 }

  public char[] getStringbox2() {
    return this.string;
  }

  public String toString() {
    return Arrays.toString(this.string); // a, c, b
  }

  public static void main(String[] args) {
    char[] chars = new char[] { 'a', 'c', 'b' };
    Stringbox2 box2 = new Stringbox2(chars);
    System.out.println(box2.toString()); // a, c, b

    chars[1] = 'x';
    System.out.println(Arrays.toString(chars));
    System.out.println(box2.toString());// a, x, b

    System.out.println(box2.append("d"));// a, c, b, d
  }

}
