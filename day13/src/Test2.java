import java.time.Instant;
import java.time.ZonedDateTime;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        Instant i1=Instant.ofEpochMilli(1324560);
        System.out.println(i1);
        Instant i2=Instant.ofEpochMilli(132L);
        System.out.println(i1.isBefore(i2));
    }
}
