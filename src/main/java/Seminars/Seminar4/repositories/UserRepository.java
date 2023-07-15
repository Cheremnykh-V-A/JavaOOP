package Seminars.Seminar4.repositories;

import Seminars.Seminar4.models.Student;
import Seminars.Seminar4.models.Teacher;
import Seminars.Seminar4.models.User;

import java.util.List;

public interface UserRepository <T extends User> {
    void create(T user);
    List<T> getAll();
    int remove(String fullName);
    List<T> getAllByGroupTitle(String groupTitle);
}
