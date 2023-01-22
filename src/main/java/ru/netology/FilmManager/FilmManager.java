package ru.netology.FilmManager;

public class FilmManager {

    private Film[] items = new Film[0];
    private int limit;

    public FilmManager() {
        limit = 10;
    }
    public FilmManager (int limit) {
        this.limit = limit;
    }
    public void save(Film item) {
        Film[] tmp = new Film[items.length +1];
        for (int i = 0; i < items.length; i++) {
            tmp [i] = items[i];
        }
        tmp[tmp.length -1] = item;
        items = tmp;
    }

    public Film[] findAll() {
        return items;
    }

    public Film[] findLast() {
        int resultLength = limit < items.length ? limit : items.length;
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;

    }
}
