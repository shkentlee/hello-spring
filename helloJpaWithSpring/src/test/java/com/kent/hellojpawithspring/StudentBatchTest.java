package com.kent.hellojpawithspring;

import com.kent.hellojpawithspring.model.Student;
import com.kent.hellojpawithspring.repository.IssueRepository;
import com.kent.hellojpawithspring.repository.StudentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.TransactionManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:student-test-context.xml")
public class StudentBatchTest {
    @Autowired
    StudentRepository studentRepository;

    /*@PersistenceContext
    private EntityManager entityManager;*/

    @Autowired
    SessionFactory sessionFactory;

    @Test
    public void test() throws Exception {
        studentRepository.save(new Student(1l, "kent"));

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        transaction.begin();
        studentRepository.save(new Student(2l, "kim"));
        studentRepository.save(new Student(3l, "lee"));
        transaction.commit();

        System.out.println("end");
    }
}
