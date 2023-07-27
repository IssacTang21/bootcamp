public class Stringbox {

  private String string;

  public Stringbox() {

  }

  public Stringbox(String string) {
    if (string == null)
      this.string = "";
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public String toString1() {
    return this.string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public char[] toCharArray() {
    char[] arr = new char[this.string.length()];
    for (int i = 0; i < this.string.length(); i++) {
      arr[i] = this.string.charAt(i);
    }
    return arr;
  }

  public Stringbox append(String str) {
    if (str == null)
      return this;
    this.string = this.string + str;
    return this; // return Stringbox, object reference
  }

  public Stringbox insert(int idx, String x) {
    // idx = range?
    if (idx < 0 && idx > this.string.length())
      return this;
    if (x == null || "".equals(x)) {
      return this;
    }
    // s = null?
    this.string = this.string.substring(0, idx) + this.string.substring(idx, this.string.length());
    return this;
  }

  public static void main(String[] args) {
    Stringbox stringbox = new Stringbox();
    stringbox.setString("java");
    System.out.println(stringbox.append("Python"));
    System.out.println(stringbox.append("JavaScript").append("html"));
    System.out.println(stringbox.insert(2, "null"));
    char[] result = stringbox.toCharArray();
    System.out.println(result);

    // Stringbox s3 = new Stringbox(); // this.string -> null
    // s3.insert(3, "java"); // program down

  }
}
