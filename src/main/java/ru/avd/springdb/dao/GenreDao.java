package ru.avd.springdb.dao;

import ru.avd.springdb.models.Genre;

public interface GenreDao {
    Genre getById(long id);
    void create(Genre genre);
}
