package comparator;

import java.util.Comparator;

public class SortByNumber implements Comparator<Paper>{
 
  @Override
  public int compare(Paper a1, Paper a2){
    return a2.size > a1.size ? 1: -1;
  }
}
