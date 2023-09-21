package com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.entity.Investor;
import com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.serviceimpl.InvestorImplementation;


@RestController
@CrossOrigin("*")

public class InvestorController {
	
	@Autowired
	private InvestorImplementation investorImpl;

	@PostMapping(value = "/saveInvestor")
	   public String addNewInvestor(@RequestBody Investor investor) {
		System.out.println("At Controller Add");
		investorImpl.saveInvestor(investor);
		return "Added Successfully";
	   }
	
	@PutMapping(value = "/updateInvestor")
	public Investor updateInvst(@RequestBody Investor investor) {
		return investorImpl.updateInvestor(investor);
	}
	
	@DeleteMapping(value = "/deleteInvestor")
		public String deleteInvst(@RequestBody Integer id) {
		System.out.println("At Delete Investor");
		investorImpl.deleteInvestor(id);
		return "Investor Deleted";
	}
	
	@GetMapping(value = "/findAllInvst")
	public List<Investor> findAllInvestors(){
		return investorImpl.getAllInvest();
	}
}
