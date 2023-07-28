package APIRequest;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class EmployeeDetails {
	
	public static void main(String[] args)
	{
		Employee RiteshDetails;
		Employee AbishekDetails;
		Employee AaravDetail;
		String allempJson = null;
		
		 RiteshDetails=new Employee();
		 RiteshDetails.setFirstName("Ritesh");
		 RiteshDetails.setLastName("Kumar");
		 RiteshDetails.setAge(33);
		 RiteshDetails.setGender("Male");
		 RiteshDetails.setMarriage(true);
		 
		 
		 AbishekDetails=new Employee();
		 AbishekDetails.setFirstName("Abhshek");
		 AbishekDetails.setLastName("Jain");
		 AbishekDetails.setAge(22);
		 AbishekDetails.setGender("Male");
		 AbishekDetails.setMarriage(false);
		 
		 AaravDetail=new Employee();
		 AaravDetail.setFirstName("Aarav");
		 AaravDetail.setLastName("Kumar");
		 AaravDetail.setAge(2);
		 AaravDetail.setGender("Male");
		 AaravDetail.setMarriage(false);
		 
		 List<Employee> allEmployee=new ArrayList<Employee>();
		 allEmployee.add(RiteshDetails);
		 allEmployee.add(AbishekDetails);
		 allEmployee.add(AaravDetail);
		 
		 
		 System.out.println("Detail of employees------>>>>");
		 System.out.println("FirstName "+RiteshDetails.getFirstName());
		 System.out.println("LastName "+RiteshDetails.getLastName());
		 System.out.println("Age "+RiteshDetails.getAge());
		 System.out.println("Gender "+RiteshDetails.getGender());
		 System.out.println("Marriage Status "+RiteshDetails.getMarriage());
		 
		 System.out.println("Detail of employees------>>>>");
		 System.out.println("FirstName "+AbishekDetails.getFirstName());
		 System.out.println("LastName "+AbishekDetails.getLastName());
		 System.out.println("Age "+AbishekDetails.getAge());
		 System.out.println("Gender "+AbishekDetails.getGender());
		 System.out.println("Marriage Status "+AbishekDetails.getMarriage());
		
		 ObjectMapper objectmapper = new ObjectMapper();
		 String Riteshjson=null;
		 try {
			 Riteshjson=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(RiteshDetails);
			System.out.println(Riteshjson);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 try {
			Employee RiteshData=objectmapper.readValue(Riteshjson, Employee.class);
			System.out.println("Name is "+RiteshData.getFirstName());
			System.out.println("Last Name is "+RiteshData.getLastName());
			System.out.println("Gender is "+RiteshData.getGender());
			System.out.println("Age is "+RiteshData.getAge());
			System.out.println("Marriage status "+RiteshData.getMarriage());
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		try {
			 allempJson=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(allEmployee);
			System.out.println(allempJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			List<Employee> allEmploeesDetails = objectmapper.readValue(allempJson,
					new TypeReference<List<Employee>>(){});
			for(Employee e:allEmploeesDetails)
			{
				System.out.println("FirstName is "+e.getFirstName());
				System.out.println("LastName is "+e.getLastName());
				System.out.println("Age is "+e.getAge());
				System.out.println("Gender is "+e.getGender());
				System.out.println("Marriage status "+e.getMarriage());
				System.out.println("------>>>>");
				
			}
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
	/*
	 * RequestSpecification request=null;
	 * 
	 * @BeforeClass public void setUpRequestSpecification() {
	 * request=RestAssured.given()
	 * .baseUri("https://restful-booker.herokuapp.com").basePath("/booking");
	 * 
	 * }
	 * 
	 * @Test public void getAllBookings() { String
	 * response=RestAssured.given(request) .when().get() .asString();
	 * System.out.println(response); }
	 * 
	 * @Test public void getBookingDetailsWithInvalidFirstName() { // Given
	 * RestAssured .given(request).basePath("booking") .param("firstName", "Rahul")
	 * // When .when() // Then .then() .statusLine("HTTP/1.1 200 OK"); }
	 */

}
