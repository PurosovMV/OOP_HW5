import controller.Controller;
import Model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        Teacher oneteacher = new Teacher("Никита Зимин", 1973, Disciple.MATH);
        Student student1 = new Student("Юрий Николаев", 1999);
        Student student2 = new Student("Александр Серов", 2000);
        Student student3 = new Student("Кристина Клименко", 2001);
        List<Student> firstGroup = new ArrayList<>(Arrays.asList(student1, student2, student3));

        Teacher teacher2 = new Teacher("Виктор Гаврилов", 1959, Disciple.PROGRAMMING);
        Student student4 = new Student("Галина Ковальская", 2000);
        Student student5 = new Student("Сергей Федюков", 2003);
        Student student6 = new Student("Сергей Чижиков", 2002);
        List<Student> secondGroup = new ArrayList<>(Arrays.asList(student4, student5, student6));

        StudyGroup group1 = controller.createGroup(firstGroup, oneteacher);
        controller.read(group1);
        StudyGroup group2 = controller.createGroup(secondGroup, teacher2);
        controller.read(group2);

    }
}