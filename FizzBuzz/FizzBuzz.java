
/**
 * Klasse FizzBuzz.
 * 
 * @author (Josef Grohsebner) 
 * @version (05.12.24)
 */
public class FizzBuzz
{
    public static void fizzBuzz () {
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
