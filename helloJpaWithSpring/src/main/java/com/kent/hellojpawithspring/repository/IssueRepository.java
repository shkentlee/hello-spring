package com.kent.hellojpawithspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kent.hellojpawithspring.model.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
