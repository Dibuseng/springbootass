package com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.serviceinterface;

import java.util.List;

import com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.entity.Investor;

public interface InvestorInterface {
	public void saveInvestor(Investor investor);
	public Investor updateInvestor(Investor investor);
	public void deleteInvestor(int id);
	public List<Investor> getAllInvest();

}
