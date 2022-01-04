package com.company.dao;

import java.util.List;

public class UserDao {
    private List<User> users;

    public UserDao(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;

    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users ;
    }
}