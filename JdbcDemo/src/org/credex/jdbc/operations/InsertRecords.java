package org.credex.jdbc.operations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.credex.jdbc.connection.ConnectionBuild;
import org.credex.pojo.Employees;
import org.credex.pojo.Employees.Employee;
import org.credex.activity.InsertActivity;
public class InsertRecords {
ConnectionBuild obj=new ConnectionBuild();
	public boolean insertEmpRecords (Employees emps) throws Exception {
		List<Employee> empList = emps.getListOfEmp();
	Connection con= obj.ConnectToDB();
		
		for (Employee emp : empList) {
				
		
			// create preparedStmt for insert
			PreparedStatement pstmt =con.prepareStatement("insert into emp values(?,?,?)");
			
			//pstmt.setInt(emp.getEmpId());
			
			pstmt.setInt(1,emp.getEmpId());
            pstmt.setString(2,emp.getName());
            pstmt.setString(3,emp.getNotes());
			
            emp.getEmpId();
			emp.getName();
			emp.getNotes();
           pstmt.executeUpdate();
		}
		
		return false;
	}
}