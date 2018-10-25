package com.hostel.mgt.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hostel.mgt.bean.StudentBean;

public class StudentModel {
    MyDb db = new MyDb();
   
   
	public void insertStudentData(StudentBean studentBean) {
		Connection con = db.getCon();
		
		try {
			Statement stmt = con.createStatement();
     		stmt.executeUpdate("insert into student(name,email,phoneNumber,gender,password,joinDate) values('"+studentBean.getName()+"','"+studentBean.getEmail()+"','"+studentBean.getPhoneNumber()+"','"+studentBean.getGender()+"','"+studentBean.getPassword()+"','"+studentBean.getJoinDate()+"')");
		   // System.out.println("fine"+studentBean.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String login(StudentBean studentBean) throws SQLException {
		Connection con = db.getCon();
		Statement stmt = null;
		try {
			 stmt = con.createStatement();
     	
		   // System.out.println("fine"+studentBean.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs  = stmt.executeQuery("select email,password from student where email='"+studentBean.getEmail()+"' and password='"+studentBean.getPassword()+"'");
 		if(rs.next()) {
 			return "sucess";
 		}else {
 			return "wrong";
 		}
		
		
	}
	
	public StudentBean studentData() throws SQLException {
		StudentBean sb = new StudentBean();
		Connection con = db.getCon();
		Statement stmt = null;
		try {
			 stmt = con.createStatement();
     	
		   // System.out.println("fine"+studentBean.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs  = stmt.executeQuery("select * from student");
 		rs.next();
 		sb.setName(rs.getString("name"));
 		sb.setEmail(rs.getString("email"));
 		sb.setPhoneNumber(rs.getString("phoneNumber"));
 		sb.setGender(rs.getString("gender"));
 		
 		sb.setPassword(rs.getString("password"));
 	
 		return sb;
	}
	
	
}
