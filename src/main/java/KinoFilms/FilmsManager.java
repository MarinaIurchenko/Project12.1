package KinoFilms;

public class FilmsManager {
    private FilmsInformation[] films = new FilmsInformation[0];
    private int Limit;

    public FilmsManager() {
        this.Limit = 5;

    }

    public int getLimit() {
        return Limit;
    }

    public void addFilm(FilmsInformation film) {
        FilmsInformation[] tmp = new FilmsInformation[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmsInformation[] findAll() {
        return films;
    }

    public FilmsInformation[] findLast() {
        int resultLength;
        if (films.length < Limit) {
            resultLength = films.length;
        } else {
            resultLength = Limit;
        }
        FilmsInformation[] tmp = new FilmsInformation[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
