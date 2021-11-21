package com.aditi;

public class StudentDao {
	
	public String getResult(IStudent std,int rno) {
		if(std.getMarks(rno)> 70)
			return "Pass";
		return "Fail";
	}

}
