package org.credex.json;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import org.credex.pojo.Employees;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ReadJsonToPojo {
	
	private final static String JSON_PATH = "deekshaagrawal\\Documents\\cp\\employ.json";
	public static Employees mapJsonUsingJackson() throws Exception {
		 ObjectMapper mapper = new ObjectMapper();
         //Parsing the contents of the JSON file
    	  Employees emp = mapper.readValue(new File(JSON_PATH), Employees.class);
		return emp;
	}
}