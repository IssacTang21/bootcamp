import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Company {
  List<Staff> staffs;
  int counter= 0;

  public Company(List<Staff> staffs){
    this.staffs = staffs;
  }

  public Company(){
    staffs = new ArrayList<>();
  }
  
  public void add(Staff staff){
    this.staffs.add(staff);
    counter++;
  }

  public List<Staff> geStaffs(){
    return this.staffs;
  }

/**
 * Get Staff name by staff id
 * @param staffId
 * @return
 */

  public String getStaff(int staffId){
    return this.staffs.stream().filter(s -> s.getId() == staffId) // List<Staff>
  .map(s -> s.getName()).findAny() // Optional<String>
  .orElse(null); // String
}

  public static void main(String[] args) {
    Company company = new Company();
    company.geStaffs().add(new Staff(1, 2000, "John"));
    company.add(new Staff(2, 10000, "Peter"));
    company.getStaff(1); // John
  }
}
