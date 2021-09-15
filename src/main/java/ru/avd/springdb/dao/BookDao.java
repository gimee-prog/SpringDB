package ru.avd.springdb.dao;

import ru.avd.springdb.models.Book;

import java.util.List;

public interface BookDao {
    Book getById(long id);
    void create(Book book);
    void update(Book book);
    void deleteById(long id);
    List<Book> getAll();
}
