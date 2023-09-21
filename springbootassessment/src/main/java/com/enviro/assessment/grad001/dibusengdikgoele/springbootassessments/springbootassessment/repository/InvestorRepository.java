package com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.entity.Investor;

@Repository
public interface InvestorRepository extends CrudRepository<Investor, Integer>{

}
