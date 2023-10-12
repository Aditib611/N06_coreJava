package org.tnsif.jdbc.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService{
	static Connection cn;
	Statement st;
	PreparedStatement pst;
	public StudentServiceImpl() throws SQLException{
		cn = DBUtil.getCn();
		
			st = cn.createStatement();
		}
	@Override
	public void addStudent(Student student) throws SQLException{
		// TODO Auto-generated method stub
		//String sql= "INSERT INTO STUDENT VALUES("+student.getRollno()+",'"+student.getSname()+"'"+student.getPer()+")";
		//int n = st.executeUpdate(sql);
		pst = cn.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");//? is called placeholder
		pst.setInt(1, student.getRollno());
		pst.setString(2, student.getSname());
		pst.setFloat(3, student.getPer());
		int n = pst.executeUpdate();
		//pst.close();
		return;
	}

	@Override
	public List<Student> getAllStudents() throws SQLException{
		List<Student> studList = new ArrayList<Student>();
		ResultSet rs = st.executeQuery("SELECT * FROM student");
		while(rs.next()) {
			Student st = new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
			studList.add(st);
		}
		rs.close();
		return studList;
	}

	@Override
	public List<Student> getStudentsByPer(float value)throws SQLException {
		
		List<Student> studList = new ArrayList<Student>();
		//ResultSet rs = st.executeQuery("SELECT * FROM student where per>=" + value);
		pst = cn.prepareStatement("SELECT * FROM student where per>=?");//? is called placeholder
		pst.setFloat(1, value);
		ResultSet rs = pst.executeQuery();
	
		while(rs.next()) {
			Student st = new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
			studList.add(st);
		}
		pst.close();
		return studList;
	}

	@Override
	public List<Student> getStudentsNameStartsWith(String str) throws SQLException{
		List<Student> studList = new ArrayList<Student>();
		//ResultSet rs = st.executeQuery("SELECT * FROM student where per>=" + value);
				pst = cn.prepareStatement("SELECT * FROM student where sname LIKE ?");//? is called placeholder
				pst.setString(1, str);
				ResultSet rs = pst.executeQuery();
			
				while(rs.next()) {
					Student st = new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
					studList.add(st);
				}
				rs.close();
				pst.close();
				return studList;
		
	}

	@Override
	public int deleteAllStudents() throws SQLException{
		int n = st.executeUpdate("DELETE FROM STUDENT");
		return n;
	}

	@Override
	public int deleteByRollNo(int value)  throws SQLException{
		int n = st.executeUpdate("DELETE FROM STUDENT where rollno= "+ value);
	
		return n;
	}

	

	@Override
	public int updateStudentPerByRollNo(int rvalue, float pvalue) throws SQLException {
		pst = cn.prepareStatement("UPDATE STUDENT SET per=? WHERE rollno=?");
		pst.setFloat(1, pvalue);
		pst.setInt(2, rvalue);
		int n = pst.executeUpdate();
		return n;
		
	}
	
	@Override
	public int updateStudentPer(float value) throws SQLException {
		pst =cn.prepareStatement("UPDATE STUDENT SET per=per+? WHERE per<=?");
		pst.setFloat(1, value);
		pst.setFloat(2, 100-value);
		int n = pst.executeUpdate();
		return n;
	}
	
	@Override
	protected void finalize() throws SQLException {
		cn.close();
	}

}
