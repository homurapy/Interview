package l5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
//generatorStudent(100);
        StudentDao studentDao = new StudentDao();
//        studentDao.findAll().forEach(t -> System.out.println(t));
//        studentDao.deleteAll();
//        studentDao.findAll().forEach(t -> System.out.println(t));
        System.out.println(studentDao.findById(648L));
    }

    public static void generatorStudent (Integer quentity) {
List<Student> students = new ArrayList<>();
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Serg", "Maks", "Iogan", "Katya", "Petr", "Fedor", "Emelya", "Vitya", "Aleks", "Masha"));
        StudentDao studentDao = new StudentDao();
        for (int i = 0; i < quentity; i++) {
            Student student = new Student();
            student.setName(names.get((int) (Math.random() * 10)));
            student.setMark((int) (Math.random() * 10));

            students.add(student);
        }
        studentDao.saveAll(students);

    }
}

