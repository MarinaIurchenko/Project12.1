package KinoFilms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    FilmsInformation film1 = new FilmsInformation(123, "Весна", "фантастика");
    FilmsInformation film2 = new FilmsInformation(124, "Город звука", "документальный");
    FilmsInformation film3 = new FilmsInformation(125, "Могила светлячков", "мультфильм");
    FilmsInformation film4 = new FilmsInformation(126, "Зов предков", "приключения");
    FilmsInformation film5 = new FilmsInformation(127, "Шоу Грэма Нортона", "ток-шоу");

    @Test
    public void shouldAddFilm() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm(film3);

        FilmsInformation[] expected = {film3};
        FilmsInformation[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmTestAll() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        FilmsInformation[] expected = {film1, film2, film3, film4, film5};
        FilmsInformation[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmTestFindLast() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);


        FilmsInformation[] expected = {film5, film4, film3, film2, film1};
        FilmsInformation[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmTestMinimumLimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);



        FilmsInformation[] expected = {film3, film2, film1};
        FilmsInformation[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmTestLimit() {
        FilmsManager manager = new FilmsManager();

        int expected = 5;
        int actual = manager.getLimit();

        Assertions.assertEquals(expected, actual);
    }

}
