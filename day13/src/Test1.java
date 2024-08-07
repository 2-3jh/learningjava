import java.time.ZoneId;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds().size());
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of("America/Marigot"));
        System.out.println(ZoneId.systemDefault());
    }
}
