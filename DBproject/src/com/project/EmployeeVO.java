package com.project;

//모델에 해당함
/*
 * 	 vo = 데이터를 담는 컨테이너 역할을 함 
 *  데이터 전달을 함 
 *  입출력 정보를 전달 
 *  속성, 셋*겟터 로 구성되어있음 
 *  
 *  속성 = 필드 , setter,getter 로 구성돼있음 
 *  DAO 클래스 date access object  = 데이터를 접근하기 위한 클래스 
 * 
 * */

public class EmployeeVO {
	
	// 필드 선언 
	
	private int no;
	private String name;
	private String jobGrade;
	private int department; // 데이터베이스 넘버는 자바의 인트랑 맞는 것임 
	private String email;
	private String status;
	
	
	public EmployeeVO(int no, String name,String jobGrade,int department, String email) {
		this.no=no;
		this.name = name;
		this.jobGrade=jobGrade;
		this.department = department;
		this.email = email;

		
	}
	
	public EmployeeVO(int no, String name,String jobGrade,int department, String email,String status) {
		this.no=no;
		this.name = name;
		this.jobGrade=jobGrade;
		this.department = department;
		this.email = email;
		this.status=status;
	}
	
	
	public EmployeeVO() {
		// TODO Auto-generated constructor stub
	}

	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public  String toString() {
		return getNo()+","+getName();
	}
	
	

}
