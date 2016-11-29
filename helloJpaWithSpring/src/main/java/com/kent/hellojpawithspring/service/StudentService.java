package com.kent.hellojpawithspring.service;

import com.kent.hellojpawithspring.model.Issue;
import com.kent.hellojpawithspring.repository.IssueRepository;
import com.kent.hellojpawithspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Naver on 2016-11-28.
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
}
