package com.kent.hellojpawithspring;

import com.kent.hellojpawithspring.model.Issue;
import com.kent.hellojpawithspring.service.IssueService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:issue-test-context.xml")
public class IssueServiceTest {
    @Autowired
    IssueService issueService;

    @Test
    public void test() {
        Issue issue = issueService.getIssue(1l);
        System.out.println("================>" + issue);

    }
}
