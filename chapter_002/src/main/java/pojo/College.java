package pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Norozov");
        student.setName("Viktor");
        student.setPatronymic("Vladimirovich");
        student.setGroup("Navigator");
        student.setCreated(new Date());

        System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic() + " " + student.getGroup() + " " + student.getCreated());
    }
}
