import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Base64.Decoder;

public class Birth {
  public static void main(String[] args) {
   LocalDate today = LocalDate.now();
   System.out.println(today);
   LocalDate specLocalDate = LocalDate.of(2023, Month.FEBRUARY, 28);
   System.out.println(specLocalDate);
   System.out.println(LocalDate.parse("2023-12-30"));

   LocalDate d1 = LocalDate.parse("2023-12-30");
   System.out.println(d1.getYear());// 2023
   System.out.println(d1.getMonth());// DECEMBER
   Month result = d1.getMonth();
   System.out.println(result.getValue()); // 12
   System.out.println(d1.getDayOfMonth()); // 30
   System.out.println(d1.getDayOfWeek()); //SATURDAY (DayOfWeek)
   System.out.println(d1.getDayOfYear()); // 364

   System.out.println(d1.plusMonths(1L)); // 2024-1-30
   System.out.println(d1.plusDays(8)); // 2024-1-07

   boolean expiry = false;
   LocalDate effectiveDate = LocalDate.of(2023, 7, 20);
   if (LocalDate.now().isAfter(effectiveDate.plusMonths(3L))){
    expiry = true;
   }
  }
}
