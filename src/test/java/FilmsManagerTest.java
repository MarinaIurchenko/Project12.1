import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void filmTestAll(){
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");

        String[] expected = {"Film1","Film2","Film3","Film4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void filmTestFindLast(){
        FilmsManager manager = new FilmsManager(5);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");




        String[] expected = {"Film5","Film4","Film3","Film2","Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
}}
