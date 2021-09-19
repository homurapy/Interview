package l5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {
    private SessionFactory sessionFactory;

    public StudentDao () {
        this.sessionFactory = SessionFactoryUtil.getSessionFactory();
    }


    public void save (Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete (Student student) {
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(student.getName(), student);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update (Student student) {
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAll (List<Student> students) {
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            students.forEach(t -> session.save(t));
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> findAll () {
        java.util.List<Student> studentList = SessionFactoryUtil.getSessionFactory().openSession().createQuery("From Student").list();
        return studentList;

    }

    public void deleteAll () {
        List<Student> students = findAll();
        students.forEach(t -> delete(t));
    }

    public Student findById (Long id) {
        Student student = new Student();
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()) {
            student = session.get(Student.class, id);
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }
}
