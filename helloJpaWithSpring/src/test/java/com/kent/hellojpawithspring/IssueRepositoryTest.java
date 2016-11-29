package com.kent.hellojpawithspring;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kent.hellojpawithspring.model.Issue;
import com.kent.hellojpawithspring.repository.IssueRepository;

import javax.transaction.TransactionManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:issue-test-context.xml")
public class IssueRepositoryTest {
	private static final Logger logger =LoggerFactory.getLogger(IssueRepositoryTest.class);

	@Autowired
	IssueRepository issueRepository;

	@Test
	public void test() {
		logger.error("test =========>");
		List<Issue> issues = issueRepository.findAll();
		
		System.out.println(issues);
	}
	
}
