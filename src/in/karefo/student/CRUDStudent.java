package in.karefo.student;

import java.util.ArrayList;
import java.util.List;

public class CRUDStudent {


    List<Student> studentList = new ArrayList<>();

    public void createStudent(Student student){
        studentList.add(student);
    }

    public void print(){
        for (Student student:studentList){
            System.out.println(student.getName());
        }
    }

    public static void main(String[] args) {
        CRUDStudent crudStudent = new CRUDStudent();
        Student student = new Student();
        student.setName("karthikeyan");
        student.setAge(40);
        student.setGender("male");
        student.setAddress("test");
        crudStudent.createStudent(student);

        Student student1 = new Student();
        student1.setName("sibi");
        student1.setAge(27);
        student1.setGender("male");
        student1.setAddress("test");
        crudStudent.createStudent(student1);

        crudStudent.print();
    }
}
