import java.util.ArrayList;
import java.util.List;

public class Company2 {
  Staff[] staffs;
  int counter= 0;

  public Company2(Staff[] staffs){
    this.staffs = staffs;
  }

  public Company2(){
    staffs = new Staff[0];
  }
  
  public void add(Staff staff){
    Staff[] original = this.staffs; // reference
    this.staffs = new Staff[this.staffs.length+1];
    for (int i = 0; i < original.length; i++){
      this.staffs[i] = original[i];
    }
    this.staffs[this.staffs.length -1] = staff;
  }
  public void remove(Staff staff){
    // found, resize array and remove
    int idx = -1;
    for (int i = 0; i < this.staffs.length; i++){
      if (staffs[i].equals(staff))
        idx = 1; // the index going to remove
    }
     // not found, do nothing
    if (idx == -1)
    return ;
    // found, resize array and remove
    Staff[] original = this.staffs; // reference
    this.staffs = new Staff[this.staffs.length-1];
    for (int i = idx; i < this.staffs.length; i++){
      if ( i == idx) // 
      continue;
      this.staffs[i] = original[i];
    } 
   
    
  }
}


