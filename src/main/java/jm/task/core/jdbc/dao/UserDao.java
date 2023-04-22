package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserDao {
    void createUsersTable(); //создание таблицы для юзеров

    void dropUsersTable(); //удаление таблицы юзеров

    void saveUser(String name, String lastName, byte age); //- добавление юзеров в таблицу

    void removeUserById(long id); // удаление юзеров из таблицы

    List<User> getAllUsers(); //- получение всех юзеров из таблицы

    void cleanUsersTable(); // очистка содержания таблицы
}
