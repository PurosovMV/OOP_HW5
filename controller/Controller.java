package controller;

import Model.*;

import service.*;

import java.util.List;

public class Controller {
    StudyGroupServiceImpl studyGroupServiceImpl = new StudyGroupServiceImpl();
    StudentServiceImpl dataService = new StudentServiceImpl();

    public StudyGroup createGroup(List<Student> studentList, Teacher teacher) throws Exception {
        return studyGroupServiceImpl.createGroup(studentList, teacher);
    }

    public Student addStudent(String name, Integer yearBorn){
        return this.dataService.addStudent(name, yearBorn);
    }
    public void read(StudyGroup group) {
        studyGroupServiceImpl.readGroup(group);
    }

}