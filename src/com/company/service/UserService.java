package com.company.service;

public interface UserService {
    void addUsers(List<User> users, User user);

    void findWithit(List<User>users, Long id);

    void removeWithit(List<User>users, Long id);

    void getAllUsers(List<User> users, Object userDao);
}


}
