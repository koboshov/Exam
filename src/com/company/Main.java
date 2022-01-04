package com.company;

import com.company.dao.UserDao;
import com.company.madel.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



//        Практикалык тапшырма
//        1) Жаны проект тузунуз.
//        2) company деген пакеттин ичине 3 жаны пакет тузунуз - model, service, dao.
//        3) model пакеттин ичине User деген класс тузунуз, свойствалары - id, name, age, Gender, Genderди enum кылып башка пакетке тузуп койсонуз болот. id бул жон эле userдин уникалдуу свойствасы болот.
//        4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер, бул класс биздин база данныхыбыз болот.
//        5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
//        6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык userлерди алуу.
//        7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин ишке ашырат жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
//        8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
//        9) Main методдо 3 user тузунуз idлери 1,2,3 болсун.
//        10) Аларды биздин базага кошунуз.
//        11) 1 деген id менен userди таап консольго чыгарыныз.
//        12) Баардык userлерди консольго чыгарыныз.
//        13) 2 деген id менен userди очурунуз.
//        14) Баардык userлерди консольго чыгарыныз.




        List<User>listOfUsers=new ArrayList<>();

        listOfUsers.add(new User(1L, "Joomart",18,'M'));
        listOfUsers.add(new User(2L, "Nurisa",17,'J'));
        listOfUsers.add(new User(3L, "Adilet",20,'M'));

        UserDao userDao=new UserDao(listOfUsers);
        userDao.getUsers();
        UserServiceImpl service=new UserServiceImpl(userDao);
        service.findWithit(listOfUsers,1L);
        service.getAllUsers(listOfUsers,userDao);
        service.removeWithit(listOfUsers, 2L);
        service.getAllUsers(listOfUsers, userDao);






    }
}
