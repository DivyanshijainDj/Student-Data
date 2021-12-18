package com.company;

public class StudentDetails {
private String name,STUDENT_NO,STUDENT_DOB,STUDENT_DOJ;

StudentDetails(String name,String STUDENT_NO,String STUDENT_DOB,String STUDENT_DOJ,String dept_id){
	this.name=name;
	this.STUDENT_NO=STUDENT_NO;
	this.STUDENT_DOB=STUDENT_DOB;
	this.STUDENT_DOJ=STUDENT_DOJ;

}

String getname()
{
	return name;
}
String getSTUDENT_NO()
{
	return STUDENT_NO;
}
String getSTUDENT_DOB()
{
	return STUDENT_DOB;
}
String geteno()
{
	return STUDENT_DOJ;
}


}