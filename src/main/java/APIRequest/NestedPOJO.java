package APIRequest;

import java.util.List;

public class NestedPOJO {
	
	List<Employee> employee;
	List<Contractor> contractor;
	CompanyPFDetails companyPfDetails;
	private String companyName;
	private String companyHOCity;
	private String companyCEO;
	private List<String> supportedSalaryBanks;
	private List<Integer> pincodesOfCityOffice;
	
	public String getCompanyName()
	{
		return companyName;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	public String getCompanyHOCity()
	{
		return companyHOCity;
	}
	public void setCompanyHOCity(String companyHOCity)
	{
		this.companyHOCity=companyHOCity;
	}
	public String getcompanyCEO()
	{
		return companyCEO;
	}
	public void setcompanyCEO(String companyCEO)
	{
		this.companyCEO=companyCEO;		
	}
	public List<String> getSupportedSalaryBanks()
	{
		return supportedSalaryBanks;
	}
	public void setSupportedSalaryBanks(List<String> supportedSalaryBanks)
	{
		this.supportedSalaryBanks=supportedSalaryBanks;
	}
	public List<Integer> getPincodesOfCityOffice()
	{
		return pincodesOfCityOffice;
	}
	public void setPincodesOfCityOffice(List<Integer> pincodesOfCityOffice)
	{
		this.pincodesOfCityOffice=pincodesOfCityOffice;
	}
	
	public CompanyPFDetails getCompanyPfDetails()
	{
		return companyPfDetails;
	}
	public void setCompanyPfDetails(CompanyPFDetails companyPfDetails)
	{
		this.companyPfDetails=companyPfDetails;
	}
	public List<Contractor> getContractor()
	{
		return contractor;
	}
	public void setContractor(List<Contractor> contractor)
	{
		this.contractor=contractor;
	}
	public List<Employee> getEmployee()
	{
		return employee;
	}
	public void setEmployee(List<Employee> employee)
	{
		this.employee=employee;
	}

}
