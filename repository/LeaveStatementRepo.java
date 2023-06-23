package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entitiy.LeaveStatement;

@Repository
public interface LeaveStatementRepo extends JpaRepository<LeaveStatement, Integer>{

}
