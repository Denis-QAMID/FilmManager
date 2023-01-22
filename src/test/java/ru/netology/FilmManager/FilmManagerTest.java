package ru.netology.FilmManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    Film item1 = new Film(1, "https://", "Бладшот", "боевик");
    Film item2 = new Film(2, "https://", "Вперед", "мультфильм");
    Film item3 = new Film(3, "https://", "Отель", "комедия");
    Film item4 = new Film(4, "https://", "Джентельмены", "боевик");
    Film item5 = new Film(5, "https://", "Человек невидимка", "ужасы");
    Film item6 = new Film(6, "https://", "Троли.Мировой тур", "мультик");
    Film item7 = new Film(7, "https://", "Номер один", "комедия");
    Film item8 = new Film(8, "https://", "Гари Поттер", "приключения");
    Film item9 = new Film(9, "https://", "Человек-паук", "боевик");
    Film item10 = new Film(10, "https://", "Титаник", "драмма");
    Film item11 = new Film(11, "https://", "Молчание ягнят", "триллер");

    @Test
    public void shouldSave() {
        FilmManager poster = new FilmManager();
        poster.save(item1);
        poster.save(item2);
        poster.save(item3);
        poster.save(item4);

        Film[] expected = {item1, item2, item3, item4};
        Film[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void ShouldGetAll() {
        FilmManager poster = new FilmManager();
        poster.save(item1);
        poster.save(item2);

        Film[] expected = {item1, item2};
        Film[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldGetLastDef() {
        FilmManager poster = new FilmManager();
        poster.save(item1);
        poster.save(item2);
        poster.save(item3);

        Film[] expected = {item3, item2, item1};
        Film[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldGetLastDefIfFilmMoreThanTen() {
        FilmManager poster = new FilmManager();
        poster.save(item1);
        poster.save(item2);
        poster.save(item3);
        poster.save(item4);
        poster.save(item5);
        poster.save(item6);
        poster.save(item7);
        poster.save(item8);
        poster.save(item9);
        poster.save(item10);
        poster.save(item11);

        Film[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        Film[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldGetLastIfFilmLessThanLimit() {
        FilmManager poster = new FilmManager(4);
        poster.save(item1);
        poster.save(item2);
        poster.save(item3);

        Film[] expected = {item3, item2, item1};
        Film[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldGetLastIfFilmMoreThanLimit() {
        FilmManager poster = new FilmManager(2);
        poster.save(item1);
        poster.save(item2);
        poster.save(item3);

        Film[] expected = {item3, item2};
        Film[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
