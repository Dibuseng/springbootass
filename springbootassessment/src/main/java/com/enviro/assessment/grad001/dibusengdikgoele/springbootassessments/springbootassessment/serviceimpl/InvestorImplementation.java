package com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.entity.Investor;
import com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.repository.InvestorRepository;
import com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.serviceinterface.InvestorInterface;

@Service
public class InvestorImplementation implements InvestorInterface{
	
	@Autowired
	private InvestorRepository investorRepository;

	@Override
	public void saveInvestor(Investor investor) {
		investorRepository.save(investor);
		
	}

	@Override
	public Investor updateInvestor(Investor investor) {
		// TODO Auto-generated method stub
		return investorRepository.save(investor);
		}

	@Override
	public void deleteInvestor(int id) {
		// TODO Auto-generated method stub
		investorRepository.deleteById(id);
		
	}

	@Override
	public List<Investor> getAllInvest() {
		// TODO Auto-generated method stub
		return (List<Investor>) investorRepository.findAll();
	}
	
}
