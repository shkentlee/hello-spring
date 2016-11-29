package com.kent.hellojpawithspring.repository;

import com.kent.hellojpawithspring.model.Issue;
import com.kent.hellojpawithspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
