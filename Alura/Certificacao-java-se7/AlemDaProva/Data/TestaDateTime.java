import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class TestaDateTime {
  public static void main(String[] args) {
    /*
     * LocalDate = Data sem hora
     * LocalTime = Hora
     * LocalDateTime = Data com hora
     * MonthDay = dia de um mes
     * YearMonth = Mes e ano
     */

    LocalDate localDate = LocalDate.now();
    LocalTime localDate2 = LocalTime.now();
    LocalDateTime localDate3 = LocalDateTime.now();

    System.out.println(localDate);
    System.out.println(localDate2);
    System.out.println(localDate3);

    LocalTime l1 = LocalTime.now(ZoneId.of("America/Chicago"));
    LocalTime l2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));

    System.out.println(l1);
    System.err.println(l2);

    LocalTime t1 = LocalTime.of(12, 34, 30);
    System.out.println(t1);
    LocalDate ld1 = LocalDate.of(2012, 12, 31);
    System.out.println(ld1);

    LocalDateTime ldt1 = LocalDateTime.of(1997, 04, 28, 23, 59, 0);
    System.out.println(ldt1);

    System.out.println(ldt1.getYear());
    System.out.println(ldt1.getMonthValue());
    System.out.println(ldt1.getDayOfMonth());
    System.out.println(ldt1.getHour());
    System.out.println(ldt1.get(ChronoField.DAY_OF_YEAR));

    MonthDay day1 = MonthDay.of(1, 1);
    MonthDay day2 = MonthDay.of(1, 2);

    System.out.println("Se o dia " + day1 + "vem depois do dia " + day2 + "?" + day1.isBefore(day2));

    LocalDate n = LocalDate.of(1997, 4, 28);
    System.out.println(n);
    System.out.println(n.withMonth(5).withYear(1899));
    System.out.println(n);

    LocalDate d3 = n.minusDays(4).minusMonths(1).minusYears(3);
    System.out.println(d3);

    // LocalDate d4 = n.minus(3, ChronoField.MONTH_OF_YEAR);
    // System.out.println(d4);

    LocalDateTime ldt2 = LocalDateTime.now();
    LocalDate ld5 = ldt2.toLocalDate();
    LocalTime lt1 = ldt2.toLocalTime();

    LocalDateTime tdt4 = ld5.atTime(lt1);
    LocalDateTime ldt5 = lt1.atDate(ld5);

    System.out.println(ldt2);
    System.out.println(ld5);
    System.out.println(lt1);
    System.out.println(tdt4);
    System.out.println(ldt5);

    System.out.println("____ conversao com a api velha de data =====");

    Date d = new Date();
    Instant i = d.toInstant();

    LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());

    Calendar c = Calendar.getInstance();
    Instant i2 = c.toInstant();
    LocalDateTime ldt6 = LocalDateTime.ofInstant(i2, ZoneId.systemDefault());

    Instant i1 = ldt6.toInstant(ZoneOffset.UTC);
    System.out.println(i1);
    Date d2 = Date.from(i1);
    System.out.println(d2);
    Calendar c2 = Calendar.getInstance();
    c2.setTime(d2);
    System.out.println(c2);
  }
}