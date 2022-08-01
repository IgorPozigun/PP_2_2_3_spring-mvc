package web.service;

import org.springframework.stereotype.Component;

import web.model.User;

import java.util.List;
@Component
public interface UserService {
    public List<User> allUser();//показать юзеров
    public void  addUser(User user);//добавить юзеров
    public void deleteUser(User user);//удалить юзеров
    public void updateUser(User user);//изменить юзеров
    public User getIdUser(int id);//получить по id юзеров
}
