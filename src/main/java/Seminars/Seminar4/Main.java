package Seminars.Seminar4;

import Seminars.Seminar4.controllers.GroupController;
import Seminars.Seminar4.controllers.StudentController;
import Seminars.Seminar4.controllers.TeacherController;
import Seminars.Seminar4.repositories.StudentRepository;
import Seminars.Seminar4.repositories.TeacherRepository;
import Seminars.Seminar4.services.GroupService;
import Seminars.Seminar4.services.StudentService;
import Seminars.Seminar4.services.TeacherService;
import Seminars.Seminar4.view.GroupView;
import Seminars.Seminar4.view.SortType;
import Seminars.Seminar4.view.StudentView;
import Seminars.Seminar4.view.TeacherView;

public class Main {
    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;
    private static TeacherService teacherService;
    private static TeacherController teacherController;
    private static TeacherRepository teacherRepository;

    public static void main(String[] args) {
        StudentView view = getStudentController();
        TeacherView view1 = getTeacherController();
        GroupView groupView = getGroupView();
//        -------------------------------------------------------------------------

        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "10А");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11А");
        view1.create("Egor Egorov", 36, "154", "11Б");
        view1.create("Artem Vasechkin", 68, "888", "10А");
        view1.create("Dmitriy Kostenkov", 45, "696", "11А");

        view1.sendOnConsole(SortType.ID);
        groupView.printAllFromGroup("11А");
        view.sendOnConsole();
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.ID);

        view.removeUser("Ivan Morozov");

        view.sendOnConsole();

    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static TeacherView getTeacherController() {
        teacherRepository = new TeacherRepository();
        teacherService = new TeacherService(teacherRepository);
        teacherController= new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService, teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }
}
