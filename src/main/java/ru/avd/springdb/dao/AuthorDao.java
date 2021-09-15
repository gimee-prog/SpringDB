package ru.avd.springdb.dao;

import ru.avd.springdb.models.Author;

public interface AuthorDao {
    Author getById(long id);
    Author getByFio(String name);
    void create(Author author);
}
