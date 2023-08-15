import java.util.Comparator;

public class SortByDescending implements Comparator<String>{
  
  @Override
  public int compare(String a , String a2){
    return a.charAt(0) < a2.charAt(0) ? 1 : -1;
  }

}
