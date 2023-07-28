package APIRequest;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateNestedJsonFromPOJOClasses {

	public static void main(String[] args) {
		
		NestedPOJO nestedPojo=new NestedPOJO();
		nestedPojo.setCompanyName("MSE");
		nestedPojo.setCompanyHOCity("Benagluru");
		nestedPojo.setcompanyCEO("Amod");
		
		List<String> addsupportedBanks=new ArrayList<String>();
		addsupportedBanks.add("HDFC");
		addsupportedBanks.add("ICICI");
		addsupportedBanks.add("AXIS");
		nestedPojo.setSupportedSalaryBanks(addsupportedBanks);
		
		List<Integer> allPincode=new ArrayList<Integer>();
		allPincode.add(560037);
		allPincode.add(360034);
		allPincode.add(456343);
		nestedPojo.setPincodesOfCityOffice(allPincode);
		
// Adding Employee		
		Employee Amod=new Employee();
		Amod.setFirstName("Amod");
		Amod.setLastName("Mahajan");
		Amod.setGender("Male");
	    Amod.setAge(20);
	    Amod.setMarriage(false);
	    Amod.setSalary(20000.00);
	    
	    Employee Animesh=new Employee();
	    Animesh.setFirstName("Animesh");
	    Animesh.setLastName("Prashant");
	    Animesh.setGender("Male");
	    Animesh.setAge(30);
	    Animesh.setMarriage(false);
	    Animesh.setSalary(30000.06);
	    
	    Employee Kitty=new Employee();
	    Kitty.setFirstName("Kitty");
	    Kitty.setLastName("Gupta");
	    Kitty.setGender("Female");
	    Kitty.setAge(20);
	    Kitty.setMarriage(true);
	    Kitty.setSalary(40000.50);
	    
	    List<Employee> allEmployee=new ArrayList<Employee>();
	     allEmployee.add(Amod);
	     allEmployee.add(Animesh);
	     allEmployee.add(Kitty);
	     
	     nestedPojo.setEmployee(allEmployee);
	     
//Adding Contractor	     
	     Contractor Seema=new Contractor();
	     Seema.setFirstName("Seema");
	     Seema.setLastName("Singh");
	     Seema.setContractFrom("Jan-2019");
	     Seema.setContractTo("JAN-2025");
	     
	     Contractor Hari=new Contractor();
	     Hari.setFirstName("Hari");
	     Hari.setLastName("Prasad");
	     Hari.setContractFrom("Jan-2017");
	     Hari.setContractTo("JAN-2030");
	     
	     List<Contractor> allContrator=new ArrayList<Contractor>();
	     allContrator.add(Seema);
	     allContrator.add(Hari);
	     nestedPojo.setContractor(allContrator);
	     
//Adding Company Details	     
	     CompanyPFDetails companyPFDetails=new CompanyPFDetails();
	     companyPFDetails.setPfName("XYZ");
	     companyPFDetails.setPfCity("Benagluru");
	     companyPFDetails.setPfYear(2012);
	     companyPFDetails.setNoOfEmployees(10);
	     nestedPojo.setCompanyPfDetails(companyPFDetails);
	     
	     ObjectMapper objectMapper= new ObjectMapper();
	     try {
			String jsonString=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(nestedPojo);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
	     
	     
	     
	     
	     

	}

}
