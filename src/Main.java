import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Weekday week = Weekday.valueOf(scanner.nextLine().toUpperCase());
        switch (week){
            case MONDAY -> Weekday.MONDAY.method();
            case TUESDAY -> Weekday.TUESDAY.method();
            case WEDNESDAY -> Weekday.WEDNESDAY.method();
            case THURSDAY -> Weekday.THURSDAY.method();
            case FRIDAY -> Weekday.FRIDAY.method();
            case SATURDAY -> Weekday.SATURDAY.method();
            case SUNDAY -> Weekday.SUNDAY.method();
        }
    }
}