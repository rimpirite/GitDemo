package APIRequest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import io.github.bonigarcia.wdm.WebDriverManager;

 @JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class APIAutomation {

	@Test
	public void test1() throws IOException, CsvException, InterruptedException 
	{
	 Scanner scan= new Scanner(System.in);
	 System.out.println("Enter the value");
	  int value=scan.nextInt();
	  int remainder,reverse=0;
	  int temp=value;
	  while(value!=0)
	  {
		  remainder=value%10;
		  reverse=reverse*10+remainder;
		  value/=10;
	  }
	  if(temp==reverse)
	  {
		  System.out.println("Number is palindrome "+reverse);
	  }
	  else
	  {
		  System.out.println("Not a palindrome");
	  }
	 
	 
	/*	BufferedReader br;
		boolean flag=false;
		Runtime runtime=Runtime.getRuntime();
		runtime.exec("cmd /c start dockerUp.bat");
		String filePath=System.getProperty("user.dir")+"//output.txt";
		Calendar cal=Calendar.getInstance(); //get current time
		cal.add(Calendar.SECOND,50); //adding 50 sec to current line
		long stopnow=cal.getTimeInMillis();
		System.out.println(stopnow);
		Thread.sleep(3000);
	     while(System.currentTimeMillis()<stopnow)
	     {
	    	 if(flag)
	    	 {
	    		 break;
	    	 }
	    	 br=new BufferedReader(new FileReader(filePath));
	    	 String currentline=br.readLine();
	    	 while(currentline!=null && !flag)
	    	 {
	    		 if(currentline.contains("Node has been added"))
	    		 {
	    			System.out.println("Found my text"); 
	    			flag=true;
	    			break;
	    		 }
	    		 currentline=br.readLine();
	    	 }
	    	 br.close();
	     }
		Assert.assertTrue(flag);
		Thread.sleep(5000);
		runtime.exec("cmd /c start scaleUpChrome.bat");
		Thread.sleep(5000); */
		
/*		boolean flag=false;
		BufferedReader br;
		Runtime runtime=Runtime.getRuntime();
		runtime.exec("cmd /c start stopDocker.bat");
		String FilePath=System.getProperty("user.dir"+"//output.txt");
		Calendar cal=Calendar.getInstance(); //getting the current time.
		cal.add(Calendar.SECOND, 50); //adding 50 sec to the current time.
		long stoptime=cal.getTimeInMillis();// 
		Thread.sleep(3000);
		while(System.currentTimeMillis()<stoptime)
		{
			if(flag)
			{
				break;
			}
			br=new BufferedReader(new FileReader(FilePath));
			String currentline=br.readLine();
			while(currentline!=null && !flag)
			{
				if(currentline.contains("exited with 403"))
				{
					System.out.println("Found the Required text");
					flag=true;
					break;
				}
				currentline=br.readLine();
			}
			br.close();
		}
		Assert.assertTrue(flag);
		Thread.sleep(10000);
		File file= new File(FilePath);
		boolean b=file.delete();
		Assert.assertTrue(b,"File not deleted");
		System.out.println("File Deleted Successfully"); */
		
/*		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value");
		String value=scan.nextLine();
		System.out.println(value);
		String StringWithoutSpaces=value.replaceAll("\\s","");
		System.out.println(StringWithoutSpaces); */
		
   /* 	Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value");
		String value=scan.nextLine();
		String str="";
		char[] arr=value.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ' && arr[i]!='\t')
			{
				str=str+arr[i];
			}
		}
		System.out.println(str);
		scan.close(); */
		
	/*	Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value");
		String value=scan.nextLine();
		char[] arr=value.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		*/
		
		
//		ObjectMapper objectMapper = new ObjectMapper();
//		String jsonString=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
//		System.out.println(jsonString);
	//	String jsonObject = "{\r\n" + "  \"firstName\": \"Animesh\",\r\n" + "  \"lastName\": \"Prashant\"\r\n" + "}";
		
		/*	Map<String,String>parsedJsonObject=objectMapper.readValue(jsonString, new TypeReference<Map<String,String>>(){});
		Set<String>allkeys= parsedJsonObject.keySet();
		allkeys.stream().forEach(k->System.out.println(k)); 
		
		JsonNode parsedJsonObjects=objectMapper.readTree(jsonString);
		Iterator<String>allkey= parsedJsonObjects.fieldNames();
		allkey.forEachRemaining(k->System.out.println(k));*/
		// Deserializing into a Map
		/*
		 * Map<String, String> parsedJsonObject = objectMapper.readValue(jsonObject, new
		 * TypeReference<Map<String, String>>() { }); // Get all keys Set<String>
		 * allKeys = parsedJsonObject.keySet(); System.out.println("All keys are : ");
		 * allKeys.stream().forEach(k ->System.out.println(k));
		 */
		
		
	/*	String jsonObject = "{\r\n" + 
				"  \"firstName\": \"Animesh\",\r\n" + 
				"  \"lastName\": \"Prashant\",\r\n" + 
				"  \"address\": {\r\n" + 
				"    \"city\": \"Katihar\",\r\n" + 
				"    \"State\": \"Bihar\"\r\n" + 
				"  }\r\n" + 
				"}";
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode parsedJsonObject = objectMapper.readTree(jsonObject);
		Iterator<String> allKeys= parsedJsonObject.fieldNames();
		allKeys.forEachRemaining(k -> {
			Object value = parsedJsonObject.get(k);
			// TextNode can be related to String from previous example
			// You may need to add IntNode or BooleanNode for different types of values
			if(value instanceof TextNode)
				System.out.println(k);
			// ObjectNode can be related to LinkedHashMap from previous example
			else if(value instanceof ObjectNode)
			{
				Iterator<String> keyss = ((ObjectNode)value).fieldNames();
				keyss.forEachRemaining(ke -> System.out.println(ke));
			}
	
	}); */
		
	/*	File empjson=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\employee.json");
		ObjectMapper objectmapper=new ObjectMapper();
		Employee emp=objectmapper.readValue(empjson, Employee.class);
		String firstName=emp.getFirstName();
		String lastName=emp.getLastName();
		int age=emp.getAge();
		String gender=emp.getGender();
		boolean isMarried=emp.getMarriage();
		double salary=emp.getSalary();
		System.out.println("-------->>>>");
		System.out.println("FirstName "+firstName);
		System.out.println("LastName "+lastName);
		System.out.println("Age "+age);
		System.out.println("Gender "+gender);
		System.out.println("isMarried "+isMarried);
		System.out.println("Salary "+salary); */
		/*
		 * Employee Amod=new Employee(); Amod.setFirstName("Amod");
		 * Amod.setLastName("Mahajan"); Amod.setGender("Male"); Amod.setAge(20);
		 * 
		 * ObjectMapper objectMapper=new ObjectMapper();
		 */
		
	  /* String userDir=System.getProperty("user.dir");
	   System.out.println(userDir);
	   File targetFile=new File(userDir+"//src//main/resources//employee.json");
		
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			 empDetails=objectMapper.readValue(targetFile, Employee.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String firstName=empDetails.getFirstName();
		String lastName=empDetails.getLastName();
		int age=empDetails.getAge();
		String gender=empDetails.getGender();
		boolean isMarried=empDetails.getMarriage();
		double salary=empDetails.getSalary();
		System.out.println("_>>>>>>>>>>>>>>>>");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(salary); */
		
		
	 /*	Employee Amod=new Employee();
		Amod.setFirstName("Amod");
		Amod.setLastName("Mahajan");
		Amod.setGender("Male");
		Amod.setAge(20);
		Amod.setSalary(10000);
		Amod.setMarriage(true);
		
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			 jsonString=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(Amod);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   String userDir=System.getProperty("user.dir");
		   System.out.println(userDir);
		   File targetFile=new File(userDir+"//src//main/resources//employee.json");
		   try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(targetFile, Amod);
			System.out.println("File Created");
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		   
		
		/* ObjectMapper objectmapper=new ObjectMapper();
		ArrayNode parentAary=objectmapper.createArrayNode();
		
		ObjectNode RiteshDetail=objectmapper.createObjectNode();
		RiteshDetail.put("firstname","Ritesh");
		RiteshDetail.put("lastname","Kumar");
		RiteshDetail.put("totalprice",111);
		RiteshDetail.put("depositpaid", true);
		RiteshDetail.put("additionalneeds","Lunch");
		ObjectNode RiteshBookingDetails=objectmapper.createObjectNode();
		RiteshBookingDetails.put("checkin","2021-07-01");
		RiteshBookingDetails.put("checkout","2021-07-01");
		RiteshDetail.set("Bookingdates",RiteshBookingDetails);
		try {
			String riteshJson=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(RiteshDetail);
			System.out.println(riteshJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<<-------->>>");
		ObjectNode AbhishekDetail=objectmapper.createObjectNode();
		AbhishekDetail.put("firstname","Abhishek");
		AbhishekDetail.put("lastname","Kumar");
		AbhishekDetail.put("totalprice",222);
		AbhishekDetail.put("depositpaid", true);
		AbhishekDetail.put("additionalneeds","Dinner");
		ObjectNode AbhishekBookingDetails=objectmapper.createObjectNode();
		AbhishekBookingDetails.put("checkin","2022-07-01");
		AbhishekBookingDetails.put("checkout","2022-07-01");
		AbhishekDetail.set("Bookingdates",AbhishekBookingDetails);
	  try {
		String abhishekJson=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(AbhishekDetail);
		System.out.println(abhishekJson);
		System.out.println("<<-------->>>");
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  parentAary.add(RiteshDetail);
	  parentAary.add(AbhishekDetail);
	 try {
		String jsonArrayAsString= objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(parentAary);
		System.out.println(jsonArrayAsString);
		System.out.println("<-------->>>>");
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 JsonNode first=parentAary.get(0);
	 try {
		System.out.println(objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(first));
		System.out.println("<<<=========>>>>");
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int size=parentAary.size();
	System.out.println("Size is "+size);
	System.out.println("<<<=========>>>>");
	Iterator<JsonNode> allelements= parentAary.iterator();
	while(allelements.hasNext())
	{
		JsonNode node=allelements.next();
		try {
			System.out.println(objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(node));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	System.out.println("<<<<------>>>>");
		parentAary.remove(0);
		try {
			System.out.println(objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(parentAary));
			System.out.println("<<<<------>>>>");
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		parentAary.removeAll();
		try {
			System.out.println(objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(parentAary));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<<<<------>>>>"); */
	
	/*	ObjectMapper objectMapper= new ObjectMapper();
		ObjectNode bookingDetails=objectMapper.createObjectNode();
		bookingDetails.put("firstname","Jim");
		bookingDetails.put("lastname","Brown");
		bookingDetails.put("totalprice",111);
		bookingDetails.put("depositpaid", true);
		bookingDetails.put("additionalneeds","Lunch");
		try {
			String json=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ObjectNode bookingDetailsDates=objectMapper.createObjectNode();
		bookingDetailsDates.put("checkin","2021-07-01");
		bookingDetailsDates.put("checkout","2021-07-01");
		bookingDetails.set("bookingdates", bookingDetailsDates);
		
		try {
			String bookingDeatils=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
			System.out.println(bookingDeatils);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Retrive value 
	    String firstName=bookingDetails.get("firstname").asText();
		System.out.println(firstName);
		String lastName=bookingDetails.get("lastname").asText();
		System.out.println(lastName);
		int price=bookingDetails.get("totalprice").asInt();
		System.out.println(price);
		boolean depositpaid=bookingDetails.get("depositpaid").asBoolean();
		System.out.println(depositpaid); 
		System.out.println("----->");
		
		//Retrive Fields.
		System.out.println("Size is "+bookingDetails.size());
		Iterator<String> fields=bookingDetails.fieldNames();
		while(fields.hasNext())
		{
			System.out.println(fields.next());
		}
		System.out.println("----->");
		//Retrive values 	
	Iterator<JsonNode> values=	bookingDetails.elements();
	while(values.hasNext())
	{
		
		System.out.println(values.next());
	}
	System.out.println("----->");	
	// Retrive all key and values
	Iterator <Entry<String,JsonNode>> nodes=bookingDetails.fields();
	while(nodes.hasNext())
	{
		Entry<String,JsonNode> value=nodes.next();
		System.out.println(value.getKey()+" "+value.getValue());
	}
	System.out.println("----->");	
	//Delete Field
	String name=bookingDetails.remove("firstname").asText();
	System.out.println("Delete field value is "+name);
	try {
		String afterremove=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
		System.out.println("AFter Remove "+afterremove);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("----->");
	
	//Update Json Object Payload
	bookingDetails.put("firstname","Jim");
	bookingDetails.put("firstname","Ritesh");
	try {
		String updaterequestPayload=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
		System.out.println(updaterequestPayload);
		System.out.println("----->");
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	RestAssured
	   .given()
		  .baseUri("https://restful-booker.herokuapp.com/booking")
		  .contentType(ContentType.JSON)
		  // Pass JSON pay load directly
		  .body(bookingDetails)
		  .log()
		  .all()
	// WHEN
	   .when()
		   .post()
	// THEN
	   .then()
		   .assertThat()
		   .statusCode(200)
		   .log()
		   .all();
	*/
	
		
		//Amod Detail
	/*	Map<String,Object> AmodDetail=new HashMap<String,Object>();
		AmodDetail.put("firstname", "Amod");
		AmodDetail.put("lastname", "Mahajan");
		AmodDetail.put("totalprice", 222);
		AmodDetail.put("depositpaid",true);
		Map<String,String> bookingDates=new HashMap<String,String>();
		bookingDates.put("checkin", "2018-01-01");
		bookingDates.put("checkout", "2019-01-01");
		AmodDetail.put("bookingdates", bookingDates);
		AmodDetail.put("additionalneeds", "Breakfast");
		
//Animesh Detail
		Map<String,Object> AnimeshDetail=new HashMap<String,Object>();
		AnimeshDetail.put("firstname", "Amod");
		AnimeshDetail.put("lastname", "Mahajan");
		AnimeshDetail.put("totalprice", 222);
		AmodDetail.put("depositpaid",true);
		Map<String,String> BookingDates=new HashMap<String,String>();
		BookingDates.put("checkin", "2018-01-01");
		BookingDates.put("checkout", "2019-01-01");
		AnimeshDetail.put("bookingdates", BookingDates);
		AnimeshDetail.put("additionalneeds", "Breakfast");
		
		List<Map<String,Object>> payload=new ArrayList();
		payload.add(AmodDetail);
		payload.add(AnimeshDetail);
		
		
		System.out.println(AmodDetail);
		RestAssured
		   .given()
			  .baseUri("https://restful-booker.herokuapp.com/booking")
			  .contentType(ContentType.JSON)
			  .body(payload)
			  .log()
			  .all()
		// WHEN
		   .when()
			   .post()
		// THEN
		   .then()
			   .assertThat()
			   .statusCode(500)
			   .log()
			   .all();  */
		
					//	.baseUri("https://restful-booker.herokuapp.com/auth")
						// Since I am passing payload as xml. Anyway it is optional as Rest Assured automatically identifies.
				
		
		
	/*	// Hitting a GET request without setting any base URI and Path
				RestAssured
				   .given()
				   // Logging all details
				   .log()
				   .all()
				.when()
				   .get();  */
	/*	// Creating an object of RequestSpecBuilder
				RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
				// Setting Base URI
				reqBuilder.setBaseUri("https://restful-booker.herokuapp.com");
				// Setting Base Path
				reqBuilder.setBasePath("/booking");
				// Getting RequestSpecification reference using builder() method
				RequestSpecification reqSpec = reqBuilder.build();
				
				// Usage in different styles
				// We can directly call http verbs on RequestSpecification
		//		Response res1= reqSpec.get();
		//		System.out.println(res1.asString());
				System.out.println("======================");
				
				// We can also pass RequestSpecification reference variable in overloaded given() method
				Response res2 = RestAssured.given(reqSpec).get();
				System.out.println(res2.asString());
				System.out.println("======================");
						
				// We can also pass RequestSpecification using spec() method
				Response res3 = RestAssured.given().spec(reqSpec).get();
				System.out.println(res3.asString());
				*/
		 
		
	/*	String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		RequestSpecification request=RestAssured.given();
				request.baseUri("https://restful-booker.herokuapp.com")
				.contentType(ContentType.JSON)
				.body(jsonString)
			    .when()
			    .post("/auth");
		Response response=request.post("/auth");
		System.out.println(response.asString());
		
		String token=response.asString();
		byte[] bytearray=token.getBytes();
		File file=new File("./src/main/resources/response.json");
		try {
			Files.write(bytearray, file);
			System.out.println("File Created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InputStream input=response.asInputStream();
		byte[] bytestream=null;
		File targetInput=null;
		try {
			bytestream=new byte[input.available()];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			input.read(bytestream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 targetInput=new File("./src/main/resources/inputstream.json");
		try {
			Files.write(bytestream, targetInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    byte[] arrayBytes=response.asByteArray();
		    File file2=new File("./src/main/resources/bytesresponse.json");
		    try {
				Files.write(arrayBytes, file2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
		
		/*String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.contentType(ContentType.JSON)
		.body(jsonString)
	    .when()
	    .post("/auth")
	    .then()
	    .statusCode(200)
		.body("token", Matchers.notNullValue())
		.body("token.length()", Matchers.is(15))
		.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
		*/
		
		
		
		
	/*	String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		RequestSpecification request=RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com");
		request.contentType(ContentType.JSON);
		request.body(jsonString);
		Response response=request.post("/auth");
		System.out.println(response.asString());
        ValidatableResponse validatableResponse = response.then();
        //JSON Representation from Response Body
        JsonPath jsnPath = response.jsonPath();
        //Get value of Location Key
        String token = jsnPath.get("token");
          System.out.println(token);
		// Validate status code as 200
		validatableResponse.statusCode(200);
		// Validate token field is null
		// SInce response is one to one mapping so passing key name will give you value.
		// Below method validates that value of token is not null.
		validatableResponse.body("token", Matchers.notNullValue());
		// Validate token length is 15
		validatableResponse.body("token.length()", Matchers.is(15));
		// Validate token is an alphanumeric value
		validatableResponse.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
		
		 String jsonUpdate = "{\r\n" + 
					"    \"firstname\" : \"Amod\",\r\n" + 
					"    \"lastname\" : \"Mahajan\"}";
	 
		 
		 RestAssured.given()
				 .baseUri("https://restful-booker.herokuapp.com/booking/1")
				 .contentType(ContentType.JSON)
				 .cookie("token",token)
				 .body(jsonUpdate)
				 .when()
				 .patch()
				 .then()
					.assertThat()
					.statusCode(200)
					.body("firstname", Matchers.equalTo("Amod"))
					.body("lastname", Matchers.equalTo("Mahajan"));
 
		System.out.println("Update Successfully"); */
		
		
	/*	RequestSpecification request = RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com");
		Response response=request.get("/booking");
		System.out.println(response.asString());
		ValidatableResponse vaildation=response.then();
		vaildation.statusCode(429);
		System.out.println("Verified Successfully");
		*/
		
		
	/*	RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.when()
		.get("/booking")
		.then()
		.statusLine("HTTP/1.1 200 OK")
		.statusCode(200);
		// To verify booking id at index 3
		//.body("bookingid[3]", Matchers.equalTo(219));
		System.out.println("Verified successfully"); 8/
		
	/*	Map<String,Object> empDetailPayload=new HashMap<String,Object>();
		empDetailPayload.put("firstname", "Jim");
		empDetailPayload.put("lastname", "Brown");
		empDetailPayload.put("totalprice", 111);
		empDetailPayload.put("depositpaid", true);
		
		Map<String,String> bookingdates=new HashMap<String,String>();
		bookingdates.put("checkin", "2018-01-01");
		bookingdates.put("checkout", "2019-01-01");
		
		empDetailPayload.put("bookingdates", bookingdates);
		empDetailPayload.put("additionalneeds", "Breakfast");
		
		 for (Entry<String, Object> entry : empDetailPayload.entrySet()) 
	            System.out.println(" " + entry.getKey() +
	                             " : " + entry.getValue());
		 
			 
			 RestAssured.given()
			 .baseUri("https://restful-booker.herokuapp.com")
			 .contentType(ContentType.JSON)
			 .body(empDetailPayload)
			 .when()
			 .post("/booking")
			 .then()
			 .assertThat()
			 .statusCode(200);
			 
			 */
		
	/*	String json="{\"username\" : \"admin\",\"password\" : \"password123\"}";
		RequestSpecification request=RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("/booking")
				.body(json)
				.contentType(ContentType.JSON)
				.param("FirstName","Ritesh")
				.param("LastName", "Kumar");
		QueryableRequestSpecification query= SpecificationQuerier.query(request);
		String baseUri=query.getBaseUri();
		System.out.println("BaseUri : "+baseUri);
		String basePath=query.getBasePath();
		System.out.println("BasePath : "+basePath);
		String body=query.getBody();
		System.out.println("Body : "+body);
		String conentType=query.getContentType();
		System.out.println("ContentType: "+conentType); 
		*/
	/*	File file=new File("src/main/resources/Authpayload.json");
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.contentType(ContentType.JSON)
		.body(file)
		.when()
		.post("/auth")
		.then()
		.assertThat()
		.statusCode(200)
		.body("token", Matchers.notNullValue())
		.body("token.length()", Matchers.is(15))
		.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
		*/
		
	/*	File file=new File("src/main/resources/AuthpayLoad.xml");
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.contentType(ContentType.XML)
		.body(file)
		.when()
		.post("/auth")
		.then()
		.assertThat()
		.statusCode(200);
		*/
	/*	Map<String,String> authpayLoad=new HashMap<String,String>();
		authpayLoad.put("username","admin");
		authpayLoad.put("password","password123");
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.contentType(ContentType.JSON)
		.body(authpayLoad)
		.log()
		.all()
		.when()
		.post("/auth")
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
		*/
		
		
		
	}
	
	
	/* @Test
	public void CreatingNestedJsonObjectTest()
	{
	ObjectMapper objectMapper=new ObjectMapper();
	
	ArrayNode parentArray=objectMapper.createArrayNode();
	
	ObjectNode firstBookingDetails=objectMapper.createObjectNode();
	firstBookingDetails.put("firstname", "Jim");
	firstBookingDetails.put("lastname", "Brown");
	// integer as field value
	firstBookingDetails.put("totalprice", 111);
	// boolean as field value
	firstBookingDetails.put("depositpaid", true);
	firstBookingDetails.put("additionalneeds", "Breakfast");
	
	// Since requirement is to create a nested JSON Object
	ObjectNode firstBookingDateDetails = objectMapper.createObjectNode();
	firstBookingDateDetails.put("checkin", "2021-07-01");
	firstBookingDateDetails.put("checkout", "2021-07-01");
	
	firstBookingDetails.set("bookingdates", firstBookingDateDetails);
	
	ObjectNode secondBookingDetails = objectMapper.createObjectNode();
	
	// It is similar to map put method. put method is overloaded to accept different types of data
	// String as field value
	secondBookingDetails.put("firstname", "Amod");
	secondBookingDetails.put("lastname", "Mahajan");
	// integer as field value
	secondBookingDetails.put("totalprice", 222);
	// boolean as field value
	secondBookingDetails.put("depositpaid", true);
	secondBookingDetails.put("additionalneeds", "Breakfast");
	
	// Since requirement is to create a nested JSON Object
	ObjectNode secondBookingDateDetails = objectMapper.createObjectNode();
	secondBookingDateDetails.put("checkin", "2022-07-01");
	secondBookingDateDetails.put("checkout", "2022-07-01");
	
	secondBookingDetails.set("bookingdates", secondBookingDateDetails);
	
	parentArray.addAll(Arrays.asList(firstBookingDetails,secondBookingDetails));
	
	try {
		String json=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(parentArray);
		System.out.println("Array Node "+json);
		System.out.println("<--------------->");
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	JsonNode zeroElement=parentArray.get(0);
	try {
		System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(zeroElement));
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("<-------------->");
	System.out.println("Size is : "+parentArray.size());
	System.out.println("<-------------->");
	 Iterator<JsonNode> I1=parentArray.iterator();
	 while(I1.hasNext())
	 {
		 JsonNode currentnode=I1.next();
		 try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(currentnode));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //Remove element from JsonNode.
		 System.out.println("After Removing");
		  parentArray.remove(0);
		  try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(parentArray));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  parentArray.removeAll();
		  System.out.println("----------->>  After removing All->>>>>.");
		  try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(parentArray));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			System.out.println("All Element Deleted");
		}
	 }
	
	
	} */
	
/*	@Test
	public void CreatingNestedJsonObjectTest()
	{
		ObjectMapper objectMapper=new ObjectMapper();
		ObjectNode bookingDetails=objectMapper.createObjectNode();
		// It is similar to map put method. put method is overloaded to accept different types of data
		// String as field value
		bookingDetails.put("firstname", "Jim");
		bookingDetails.put("lastname", "Brown");
		// integer as field value
		bookingDetails.put("totalprice", 111);
		// boolean as field value
		bookingDetails.put("depositpaid", true);
		bookingDetails.put("additionalneeds", "Breakfast");
		// Duplicate field name. Will override value
		bookingDetails.put("additionalneeds", "Lunch");
		
		// Since requirement is to create a nested JSON Object
				ObjectNode bookingDateDetails = objectMapper.createObjectNode();
				bookingDateDetails.put("checkin", "2021-07-01");
				bookingDateDetails.put("checkout", "2021-07-01");
				
		
	}  */

	/*
@Test
public void CreatingNestedJsonObjectTest()
{
	ObjectMapper objectmapper=new ObjectMapper();
	ObjectNode objectnode=objectmapper.createObjectNode();
	objectnode.put("firstname", "Jim");
	objectnode.put("lastname","Brown");
	objectnode.put("totalprice", 111);
	objectnode.put("depositpaid", true);
	objectnode.put("additionalneeds","Lunch");
	try {
		String json=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectnode);
		System.out.println(json);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ObjectNode bookingdates=objectmapper.createObjectNode();
	bookingdates.put("checkin","2021-07-01");
	bookingdates.put("checkout", "2021-08-02");
	objectnode.set("bookingdates", bookingdates);
	
	try {
		String nested=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectnode);
		System.out.println(nested);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Get all the Fields in Json Object
	System.out.println("Count of Json Object is "+objectnode.size());
	Iterator<String> I1=objectnode.fieldNames();
	while(I1.hasNext())
	{
		System.out.println(I1.next());
	}
	
	//Get all the value in Json Object
	System.out.println("Values of Json Object Is ");
	Iterator<JsonNode> I2=objectnode.elements();
	while(I2.hasNext())
	{
		System.out.println(I2.next());
	}
	//Retrive all the key value pair
	System.out.println("Retrive all the value from the JsonObject");
	Iterator <Entry<String,JsonNode>> allvalues=objectnode.fields();
	while(allvalues.hasNext())
	{
		Entry<String,JsonNode> node=allvalues.next();
		System.out.println(node.getKey()+": "+node.getValue());
	}
	 //Remove the field from the Json Object.
	
	String removeField=objectnode.remove("firstname").asText();
	System.out.println("Removed Field "+removeField);
	try {
		String updateAfterRemove=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectnode);
		System.out.println(updateAfterRemove);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Replace the value in JsonOne
	objectnode.put("firstname", "Jim");
	objectnode.put("firstname","Ritesh");
	try {
		String afterReplace=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectnode);
		System.out.println(afterReplace);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}  */
	
	/*	@Test
	public void CreatingNestedJsonObjectTest()
	{
		Map<String,Object> Detail1=new HashMap<String,Object>();
		Detail1.put("firstname", "Amod");
		Detail1.put("additionalneeds", "Breakfast");
		Map<String,Object> BookingDeatil1=new HashMap<String,Object>();
		BookingDeatil1.put("checkin", "2021-08-01");
		BookingDeatil1.put("checkout", "2021-08-02");
		Detail1.put("bookingdates", BookingDeatil1);
		
		Detail1.put("totalprice", 222);
		Detail1.put("depositpaid", true);
		Detail1.put("lastname", "Mahajan");
		
		Map<String,Object>Detail2=new HashMap<String,Object>();
		Detail2.put("firstname", "Animesh");
		Detail2.put("additionalneeds","Breakfast");
		
		Map<String, Object> BookingDetail2=new HashMap<String,Object>();
		BookingDetail2.put("checkin","2021-07-01");
		BookingDetail2.put("checkout","2021-07-01");
		
		Detail2.put("bookingdates", BookingDetail2);
		Detail2.put("totalprice", 111);
		Detail2.put("depositpaid", true);
		Detail2.put("lastname", "Prashant");
		
		List <Map<String,Object>> payload=new ArrayList<Map<String,Object>>();
		payload.add(Detail1);
		payload.add(Detail2);
		
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.contentType(ContentType.JSON)
		.body(payload)
		.log()
		.all()
		.when()
		.post()
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(500);
		
	}  */
	
	
	
/*	@Test
	public void CreatingNestedJsonObjectTest()
	{
		Map<String,Object> jsonBodyUsingMap=new HashMap<String,Object>();
		jsonBodyUsingMap.put("firstname", "Jim");
		jsonBodyUsingMap.put("lastname", "Brown");
		jsonBodyUsingMap.put("totalprice", 111);
		jsonBodyUsingMap.put("depositpaid", true);
		
		Map<String,Object> bookingdates=new HashMap<String,Object>();
		bookingdates.put("checkin", 2018-01-01);
		bookingdates.put("checkout", 2019-01-01);
		
		jsonBodyUsingMap.put("bookingdates", bookingdates);
		jsonBodyUsingMap.put("additionalneeds","Breakfast");
		
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.contentType(ContentType.JSON)
		.body(jsonBodyUsingMap)
		.log()
		.all()
		
		//When
		.when()
		.post()
		
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
		
		
		
	}  */
	
/*	@Test
	public void passBodyAsMap()
	{
		Map<String,String> authpayload=new HashMap<String,String>();
		authpayload.put("username", "admin");
		authpayload.put("password", "password123");
		
		RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com")
				.contentType(ContentType.JSON)
				.body(authpayload)
				.log()
				.all()
			//	
				.when()
				.post("/auth")
			//
				.then()
				.assertThat()
				.statusCode(200)
				.log()
				.all();
		
	}  */
	
/*	@Test
	public void mesaureResponseTimeUsingResponseOptionsMethods()
	{
		// There is no need to add escape character manually. Just paste string within double 
		// quotes. It will automatically add escape sequence as required. 
		String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		
		// Create a request specification 
		RequestSpecification request= RestAssured.given();
		
		// Setting content type to specify format in which request payload will be sent.
		// ContentType is an ENUM. 
		request.contentType(ContentType.JSON);
		//Adding URI
		request.baseUri("https://restful-booker.herokuapp.com/auth");
		// Adding body as string
		request.body(jsonString);
		
		// Calling POST method on URI. After hitting we get Response
		Response response = request.post();
		
		// By default response time is given in milliseconds
		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():"+responseTime1);
		
		// we can get response time in other format as well
		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():"+responseTimeInSeconds);
		
		
		// Similar methods 
		long responseTime2 = response.time();
		System.out.println("Response time in ms using time():"+responseTime2);
		
		long responseTimeInSeconds1 = response.timeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using timeIn():"+responseTimeInSeconds1);
		
		ValidatableResponse valRes = response.then();
		// Asserting response time is less than 2000 milliseconds
		// L just represent long. It is in millisecond by default.
		valRes.time(Matchers.lessThan(2000L));
		// Asserting response time is greater than 2000 milliseconds
	//	valRes.time(Matchers.greaterThan(2000L));
		// Asserting response time in between some values
	//	valRes.time(Matchers.both(Matchers.greaterThanOrEqualTo(2000L)).and(Matchers.lessThanOrEqualTo(1000L)));
 
		// If we want to assert in different time units
		valRes.time(Matchers.lessThan(2L), TimeUnit.SECONDS);
		
	} */
	
	/*
	 * @Test public void authFromFile() { File file=new
	 * File("./src/main/resources/AuthpayLoad.xml"); RequestSpecification
	 * request=RestAssured.given() .baseUri("https://restful-booker.herokuapp.com")
	 * .contentType(ContentType.XML) .body(file); Response
	 * response=request.post("/auth"); response.then() .assertThat()
	 * .statusCode(200); System.out.println("Response "+response.asPrettyString());
	 * 
	 * 
	 * }
	 */
	
	/*RequestSpecification requestSpecification=RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking")
				.log()
				.all();
		
		Response r1=requestSpecification.get();
		System.out.println("First "+r1.asString());
		*/
	
/*	public static void main(String...string)
	{
		String json="{\"firstName\":\"Amod\"}";
		RequestSpecification request=RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("/booking")
		.header("header1", "headerValue1")
		.header("header2", "headerValue2")
		.body(json);
		
		QueryableRequestSpecification queryRequest=SpecificationQuerier.query(request);
		String baseUrl=queryRequest.getBaseUri();
		System.out.println("BaseUrl "+baseUrl);
		String basePath=queryRequest.getBasePath();
		System.out.println("BasePath "+basePath);
		String body=queryRequest.getBody();
		System.out.println("Body "+body);
		Headers headers=queryRequest.getHeaders();
		for(Header h:headers)
		{
			System.out.println("Header Name "+h.getName()+" Header Value "+h.getValue());
		}
		
		
	} */
	
	/* @BeforeClass
	public void setupDefaultRequestSpecification()
	{
		// Creating request specification using given()
		RequestSpecification request1= RestAssured.given();
		// Setting Base URI
		request1.baseUri("https://restful-booker.herokuapp.com");
		// Setting Base Path
		request1.basePath("/booking");
		
		RestAssured.requestSpecification = request1;
	}
	
	
	@Test
	public void useDefaultRequestSpecification()
	{
		// It will use default RequestSpecification
		Response res = RestAssured.when().get();
		System.out.println("Response for default: "+res.asString());
	}
	
	@Test
	public void overrideDefaultRequestSpecification()
	{
		// Creating request specification using with()
		RequestSpecification request2= RestAssured.with();
		// Setting Base URI
		request2.baseUri("https://restful-booker.herokuapp.com");
		// Setting Base Path
		request2.basePath("/ping");
		// Overriding default request specification
		Response res = RestAssured.given().spec(request2).get();
		System.out.println("Response for overriding: "+res.asString());
	}
	*/
	
	
/*	public static void main(String[] args)
	{
		// I am adding dummy request details for example
				String JsonBody = "{\"firstName\":\"Amod\"}";
				
				// Creating request specification using given()
				RequestSpecification request1= RestAssured.given();
				// Setting Base URI
				request1.baseUri("https://restful-booker.herokuapp.com")
				// Setting Base Path
				.basePath("/booking")
				.body(JsonBody)
				.header("header1", "headerValue1")
				.header("header2", "headerValue2");
				
				// Querying RequestSpecification
				// Use query() method of SpecificationQuerier class to query 
				QueryableRequestSpecification queryRequest = SpecificationQuerier.query(request1);
				
				// get base URI
				String retrieveURI = queryRequest.getBaseUri();
				System.out.println("Base URI is : "+retrieveURI);
				
				// get base Path
				String retrievePath = queryRequest.getBasePath();
				System.out.println("Base PATH is : "+retrievePath);
				
				// get Body
				String retrieveBody = queryRequest.getBody();
				System.out.println("Body is : "+retrieveBody);
				
				// Get Headers
				Headers allHeaders = queryRequest.getHeaders();
				System.out.println("Printing all headers: ");
				for(Header h : allHeaders)
				{
					System.out.println("Header name : "+ h.getName()+" Header value is : "+h.getValue());
				}*/
		
	/*	RequestSpecification requestSpecification=RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking");
		
		Response r1=requestSpecification.get();
		System.out.println("First "+r1.asString());
		
		Response response=RestAssured.given().spec(requestSpecification).get();
		System.out.println("Second "+response.asString());
		
		Response response1=RestAssured.given(requestSpecification).get();
		System.out.println("Thrid "+response1.asString());
		*/
		// Creating an object of RequestSpecBuilder
	/*	RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		// Setting Base URI
		reqBuilder.setBaseUri("https://restful-booker.herokuapp.com");
		// Setting Base Path
		reqBuilder.setBasePath("/booking");
		// Getting RequestSpecification reference using builder() method
		RequestSpecification reqSpec = reqBuilder.build();
		
		// Usage in different styles
		// We can directly call http verbs on RequestSpecification
		/*
		 * Response res1= reqSpec.get(); System.out.println(res1.asString());
		 * System.out.println("======================");
		 */
		// We can also pass RequestSpecification reference variable in overloaded given() method
	/*	Response res2 = RestAssured.given(reqSpec).get();
		System.out.println(res2.asString());
		System.out.println("======================");
				
		// We can also pass RequestSpecification using spec() method
		Response res3 = RestAssured.given().spec(reqSpec).get();
		System.out.println(res3.asString());  */
		
		
	}
	
/*	RequestSpecification requestSpecification;
	
	@BeforeClass
	public void setUpRequestSepcification()
	{
		requestSpecification=RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("/booking");
		
	}
	
	@Test
	public void getAllBookings()
	{
		RestAssured.given().spec(requestSpecification)
		// When
		   .when()
		// Then
		   .then()
		   .statusLine("HTTP/1.1 200 OK");
	}
	
	@Test
	public void getBookingDetailsWithInvalidFirstName()
	{
		// Given
		RestAssured
		  .given(requestSpecification)
			 .param("firstName", "Rahul")
		// When
		   .when()
		// Then
		   .then()
		   .statusLine("HTTP/1.1 200 OK");		
	}  */

	/*	@Test
	public void firstPostRequest() throws IOException {
		
		//Send the Post Request
		String authString="{\"username\" : \"admin\",\"password\" : \"password123\"}";
		RequestSpecification request=RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com");
		request.contentType(ContentType.JSON);
		request.body(authString);
		Response response=request.post("/auth");
		
		//Response in getBytes.
		String json=response.asString();
		byte[] asbyte=json.getBytes();
		File target=new File("./src/main/resources/Token.json");
		Files.write(asbyte, target);
		
		//Reading the Input as InputStream
		InputStream responseAsInputStream=response.asInputStream();
		byte[] responseAsByte=new byte[responseAsInputStream.available()];
		responseAsInputStream.read(responseAsByte);
		File targetFile=new File("./src/main/resources/InputStreamToken.json");
		Files.write(responseAsByte, targetFile);
		 
		//Directly Getting Bytes
		byte[] asbyte1=response.asByteArray();
		File file=new File("./src/main/resources/InputStreamToken1.json");
		Files.write(asbyte1, file);
		
	*/	
		
		
		
		
	/*	String authresponse=response.asString();
		//By Using the byte and create a json file of response.
		byte[] byteArrayresponse=authresponse.getBytes();
		File targetPath=new File("./src/main/resources/Token.json");
		try {
			Files.write(byteArrayresponse, targetPath);
		} catch (IOException e) {
			System.out.println("File is not created");
			e.printStackTrace();
		} */
		
		/*
		 * InputStream responseAsInputStream=response.asInputStream(); byte[]
		 * responseAsInputStreamByte = new byte[responseAsInputStream.available()]; //
		 * Reads number of bytes from the input stream and stores them into the byte
		 * array responseAsInputStreamByte.
		 * responseAsInputStream.read(responseAsInputStreamByte); // Creating a target
		 * file File targetFileForInputStream = new
		 * File("./src/main/resources/InputStreamToken.json"); // Writing into files
		 * Files.write(responseAsInputStreamByte, targetFileForInputStream);
		 */
		
		
		
		
		
		
		
		
		
		/*
		 * JsonPath jsonPath = new JsonPath(response.asString()); String token =
		 * jsonPath.getString("token"); System.out.println("Token is "+token);
		 */
		  
	//Update Request	 
			/*	String jsonString = "{\r\n" + "    \"firstname\" : \"Ritesh\",\r\n" + "    \"lastname\" : \"Kumar\",\r\n"
						+ "    \"totalprice\" : 111,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
						+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
						+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";  */
		    
		/*
		 * // Update Request String jsonString="{\r\n" +
		 * "    \"firstname\" : \"Abishek\",\r\n" + "    \"lastname\" : \"Mahajan\"}";
		 */
		 
		/*
		 * // Create a request specification RequestSpecification UpdateRequest =
		 * RestAssured.given();
		 * 
		 * // Setting content type to specify format in which request payload will be
		 * sent. // ContentType is an ENUM. UpdateRequest.contentType(ContentType.JSON);
		 * // Setting a cookie for authentication as per API documentation
		 * UpdateRequest.cookie("token", token); // Adding URI
		 * UpdateRequest.baseUri("https://restful-booker.herokuapp.com/booking"); //
		 * Adding body as string UpdateRequest.body(jsonString);
		 * 
		 * // Calling PUT method on URI. After hitting we get Response Response
		 * Updateresponse = UpdateRequest.patch("/3772");
		 * 
		 * // Printing Response as string
		 * System.out.println(Updateresponse.asPrettyString());
		 * 
		 * ValidatableResponse validatableResponse = Updateresponse.then();
		 * 
		 * // Validate status code as 200 validatableResponse.statusCode(200);
		 * 
		 * // Validate value of firstName is updated
		 * validatableResponse.body("firstname", Matchers.equalTo("Abishek"));
		 * 
		 * // Validate value of lastName is updated validatableResponse.body("lastname",
		 * Matchers.equalTo("Mahajan"));
		 * 
		 * //Delete
		 * 
		 * RequestSpecification deleteRequest=RestAssured.given();
		 * deleteRequest.baseUri("https://restful-booker.herokuapp.com/booking");
		 * deleteRequest.contentType(ContentType.JSON); deleteRequest.cookie("token",
		 * token);
		 * 
		 * Response DeleteResponse=deleteRequest.delete("/3772"); String
		 * delete=DeleteResponse.asString();
		 * System.out.println("Delete Response "+delete);
		 * 
		 * RequestSpecification verifyDelete=RestAssured.given();
		 * verifyDelete.baseUri("https://restful-booker.herokuapp.com/booking");
		 * verifyDelete.contentType(ContentType.JSON); verifyDelete.cookie("token",
		 * token); Response afterDeteleResponse=verifyDelete.get("/3772");
		 * System.out.println("After detele Response " +afterDeteleResponse);
		 * 
		 * RequestSpecification getRequestSpec = RestAssured.given();
		 * 
		 * // Adding URI
		 * getRequestSpec.baseUri("https://restful-booker.herokuapp.com/booking/1");
		 * 
		 * // Calling GET request Response res = getRequestSpec.get();
		 * 
		 * // Get Validatable response to perform validation ValidatableResponse valRes
		 * = res.then();
		 * 
		 * // It will check if status code is 404 as booking id should not be found
		 * valRes.statusCode(404);
		 */
			
				
		  
		 
		/*
		 * RestAssured.given() .baseUri("https://restful-booker.herokuapp.com")
		 * .contentType(ContentType.JSON) .body(jsonString) .when() .post("/auth")
		 * .then() .assertThat() .statusCode(200) .body("token",
		 * Matchers.notNullValue()) .body("token.length()", Matchers.is(15))
		 * .body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
		 */
		/*
		 * String jsonrequest="{\"userId\" : \"TQ123\",\"isbn\" : \"9781449325862\"}";
		 * 
		 * RequestSpecification request=RestAssured.given();
		 * request.accept(ContentType.JSON);
		 * request.baseUri("https://demoqa.com/BookStore/v1/Books");
		 * request.body(jsonrequest); Response
		 * response=request.post("/BookStoreV1BooksPost");
		 */
		// System.out.println(response.asPrettyString());
		/*
		 * ValidatableResponse validatableResponse = response.then();
		 * validatableResponse.statusCode(200); validatableResponse.body("token",
		 * Matchers.notNullValue());
		 * 
		 * // Validate token length is 15 validatableResponse.body("token.length()",
		 * Matchers.is(15));
		 * 
		 * // Validate token is an alphanumeric value validatableResponse.body("token",
		 * Matchers.matchesRegex("^[a-z0-9]+$"));
		 */

	

	/*
	 * @Test public void GetBookingIds_VerifyStatusCode() { //Given
	 * RestAssured.given() .baseUri("https://restful-booker.herokuapp.com") //When
	 * .when() .get("/booking")
	 * 
	 * //Then .then() .statusCode(200) .statusLine("HTTP/1.1 200 OK") // To verify
	 * booking count // .body("bookingid.sum()", Matchers.hasSize(100)) // To verify
	 * booking id at index 3 .body("bookingid[3]", Matchers.equalTo(6888)) ;
	 */

	/*
	 * // Without static import and builder pattern
	 * 
	 * @Test public void GetBookingIds_VerifyStatusCode() { // Create a request
	 * specification RequestSpecification request= RestAssured.given();
	 * 
	 * //Adding URI request.baseUri("https://restful-booker.herokuapp.com/booking");
	 * 
	 * // Calling GET method on URI. After hitting we get Response Response response
	 * = request.get();
	 * 
	 * // Let's print response body. String resString = response.asString();
	 * System.out.println("Respnse Details : " + resString);
	 * 
	 * 
	 * To perform validation on response like status code or value, we need to get
	 * ValidatableResponse type of response using then() method of Response
	 * interface. ValidatableResponse is also an interface.
	 * 
	 * ValidatableResponse valRes = response.then(); // It will check if status code
	 * is 200 valRes.statusCode(200); // It will check if status line is as expected
	 * valRes.statusLine("HTTP/1.1 200 OK"); }
	 */





	
