package com.kent.hellojpawithspring.repository;

import com.kent.hellojpawithspring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Naver on 2016-11-28.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}

