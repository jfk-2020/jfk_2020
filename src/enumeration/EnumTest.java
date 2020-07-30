package enumeration;

/**
 * @author William Arustamyan
 */

public class EnumTest {

    public static void main(String[] args) {

        Seasons season = Seasons.findSeason(Month.November);
        System.out.println(season);

    }
}
