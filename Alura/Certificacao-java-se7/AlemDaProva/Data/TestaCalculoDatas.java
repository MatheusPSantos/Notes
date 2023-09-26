import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.text.DateFormatter;

public class TestaCalculoDatas {
  public static void main(String[] args) {
    Instant i = Instant.now();
    System.out.println(i);
    Duration dezSec = Duration.ofSeconds(10);
    Instant i2 = i.plus(dezSec);
    System.out.println(dezSec);
    System.out.println(i2);

    Instant m1 = Instant.EPOCH;
    Instant m2 = Instant.now();

    long segundos = Duration.between(m1, m2).getSeconds();
    System.out.println(segundos);

    LocalDate  aniversario = LocalDate.of(1997, 04, 28);
    LocalDate agora = LocalDate.now();
    System.out.println(ChronoUnit.YEARS.between(aniversario, agora));
    System.out.println(ChronoUnit.MONTHS.between(aniversario, agora));
    System.out.println(ChronoUnit.DAYS.between(aniversario, agora));

    Period tempoDeVida = Period.between(aniversario, agora);
    System.out.println(tempoDeVida.getYears());
    System.err.println(tempoDeVida.getMonths());
    System.out.println(tempoDeVida.getDays());

    LocalDateTime agora2 = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
    System.out.println(formatter.format(agora2));
    System.out.println(agora2.format(formatter));

    String dataString = "1998/09/23";
    System.out.println(LocalDate.parse(dataString, DateTimeFormatter.ofPattern("yyyy/MM/dd")));

    
    
  }
}