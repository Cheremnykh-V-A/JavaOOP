package Seminars.Seminar4.controllers;

import Seminars.Seminar4.models.Teacher;
import Seminars.Seminar4.services.UserService;

import java.util.List;

public class TeacherController implements UserController{
    private final UserService<Teacher> userService;

    public TeacherController(UserService<Teacher> userService) {
        this.userService = userService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        userService.create(fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public List<Teacher> getAll() {
        return userService.getAll();
    }

    @Override
    public int remove(String fullName) {
        return userService.remove(fullName);
    }

    @Override
    public List<Teacher> getAllSortByFullName() {
        return userService.getAllSortByFullName();
    }

    @Override
    public List<Teacher> getAllSortById() {
        return userService.getAllSortById();
    }
}


