package org.credex.pojo;
import java.util.List;
import org.json.JSONPropertyName;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Employees {
	@JsonProperty("Employee")
	public List<Employee> listOfEmp;
	
	
	
	public List<Employee> getListOfEmp() {
		return listOfEmp;
	}
	public void setListOfEmp(List<Employee> listOfEmp) {
		this.listOfEmp = listOfEmp;
	}
	public static class Employee {
		@JsonProperty("EmpId")
		private int EmpId;
		@JsonProperty("Name")
		private String Name;
		@JsonProperty("Notes")
		private String Notes;	
	    public void setEmpId(int EmpId) {
	        this.EmpId = EmpId;
	    }
	    public int getEmpId() {
	        return EmpId;
	    }
	    public String getName() {
	        return Name;
	    }
	    public void setName(String Name) {
	        this.Name = Name;
	    }
	    public String getNotes() {
	        return Notes;
	    }
	    public void setNotes(String Notes) {
	        this.Notes = Notes;
	    }
		@Override
		public String toString() {
			return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", Notes=" + Notes + "]";
		}
	   
	
}
	@Override
	public String toString() {
		return "Employees [listOfEmp=" + listOfEmp + "]";
	}
	
}