package org.credex.activity;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import org.credex.jdbc.connection.ConnectionBuild;
import org.credex.jdbc.operations.InsertRecords;
import org.credex.json.ReadJsonToPojo;
import org.credex.pojo.Employees;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class InsertActivity {
   public static void main(String args[]) {
      try {
    	 Employees emp =  ReadJsonToPojo.mapJsonUsingJackson();
    	 InsertRecords records = new InsertRecords();
    	 records.insertEmpRecords(emp);
    	 
    	  System.out.println(emp.toString());
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}