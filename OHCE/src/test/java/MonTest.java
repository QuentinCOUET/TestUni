import org.example.Main;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class MonTest {


    @Test
    public void testPalindromeOK() throws Exception {
        boolean pal = Main.pal("kayak");

        // Bloc assert
        assertTrue(pal);
    }

    @Test
    public void testPalindromeKO() throws Exception {
        boolean pal = Main.pal("salut");

        // Bloc assert
        assertFalse(pal);
    }

    @Test
    public void testStartingBjr() throws Exception {
        java.util.GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.set(Calendar.HOUR, 10);

        // Bloc assert
        assertEquals(Main.starting("fr", calendar), "Bonjour");
    }

    @Test
    public void testStartingBsr() throws Exception {
        java.util.GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.set(Calendar.HOUR, 20);

        // Bloc assert
        assertEquals(Main.starting("fr", calendar), "Bonsoir");
    }

    @Test
    public void testStartingGm() throws Exception {
        java.util.GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.set(Calendar.HOUR, 10);

        // Bloc assert
        assertEquals(Main.starting("en", calendar), "good morning");
    }

    @Test
    public void testStartingGan() throws Exception {
        java.util.GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.set(Calendar.HOUR, 20);

        // Bloc assert
        assertEquals(Main.starting("en", calendar), "good afternoon");
    }

    @Test
    public void testEndingBn() throws Exception {
        java.util.GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.set(Calendar.HOUR, 3);

        // Bloc assert
        assertEquals(Main.ending("fr", calendar), "bonne nuit");
    }

    @Test
    public void testEndingAr() throws Exception {
        java.util.GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.set(Calendar.HOUR, 10);

        // Bloc assert
        assertEquals(Main.ending("fr", calendar), "Au revoir");
    }

    @Test
    public void testEndingGn() throws Exception {
        java.util.GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.set(Calendar.HOUR, 23);

        // Bloc assert
        assertEquals(Main.ending("en", calendar), "good night");
    }

    @Test
    public void testEndingGb() throws Exception {
        java.util.GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.set(Calendar.HOUR, 10);

        // Bloc assert
        assertEquals(Main.ending("en", calendar), "good bye");
    }

}
