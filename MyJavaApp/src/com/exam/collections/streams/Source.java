package com.exam.collections.streams;
import java.util.*;
import java.util.stream.*;


class Candidate{
	private String name;
	private int id;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	//Exam Tip: always create default constructor
	Candidate(){ }
	
	Candidate(int id,String name,int age,String gender,String department,int yearOfJoining,double salary){
		this.id = id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	/* ME(coder): if I get value from you, I will SET 
	 * 			  if I have to give you the value, I will return in GET	  
	   YOU:       IF you give the value to me, You expect the coder to SET
	   			  If you want to GET a value, you expect the coder to return the value	
	*/
	//getters and setters
	int getId(){
		return id; 
	}
	
	void setId(int id){
		this.id = id; 
	}
	
	String getName(){
		return name;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	int getAge(){
		return age;
	}
	
	void setAge(int age){
		this.age=age;
	}
	
	String getGender(){
		return gender;
	}
	
	void setGender(String gender){
		this.gender=gender;
	}

	String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	int getYearOfJoining() {
		return yearOfJoining;
	}

	void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
}

public class Source {
	public static void main(String[] args) {
			
			List<Candidate> list = new ArrayList<>();
			  list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
			  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
			  //list.add(new Candidate(188, "Anna Scott", 26, "Female", "Product Development", 2014, 32500.0));
			  
			  System.out.println(Implementation.getCount(list));
			  System.out.println(Implementation.getAverageAge(list));
			  System.out.println(Implementation.getYoungestCandidateDetails(list));
	}
}

class Implementation{
	public static  Map<String,Long> getCount(List<Candidate> list){  //{Male=1, Female=1}
		Map<String,Long> map = new HashMap<>();
		long femaleCount = list.stream() 
								.filter(c->c.getGender().equalsIgnoreCase("female"))
								.count();
		
		long maleCount = list.stream() 
				.filter(c->c.getGender().equalsIgnoreCase("male"))
				.count();
		
		map.put("Male",maleCount);
		map.put("Female",femaleCount);
		
		return map; 
	}
	
	public static Map<String,Double> getAverageAge(List<Candidate> list){
		List<Candidate> listMale =  list.stream()  
										.filter(c->c.getGender().equalsIgnoreCase("male"))
										.collect(Collectors.toList());
		
		double sumMaleAge = 0; 
		for( Candidate c: listMale) {
			sumMaleAge = sumMaleAge + c.getAge();
		}
		
		double totalMale = listMale.size();
		
		double AvgMaleAge = sumMaleAge / totalMale;
		
		List<Candidate> listFemale =  list.stream()  
				.filter(c->c.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.toList());
		
		double sumFemaleAge = 0; 
		for( Candidate c: listFemale) {
			sumFemaleAge = sumFemaleAge + c.getAge();
		}
		
		double totalFemale = listFemale.size();
		
		double AvgFemaleAge = sumFemaleAge / totalFemale;
		
		Map<String,Double> map = new HashMap<>();
		map.put("Male", AvgMaleAge);
		map.put("Female", AvgFemaleAge);
		return map;
	}
	
	public Map<String,Long> countCandidatesDepartmentWise(List<Candidate> list){
		return null;
	}
	
	public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
		List<Candidate> filteredList 
					= list.stream()
							.filter(c->c.getGender().equalsIgnoreCase("male"))
							.filter(c->c.getDepartment().equalsIgnoreCase("Product Development"))
							.collect(Collectors.toList());
		
		List<Candidate> sortedList =   
				filteredList.stream()
					.sorted(Comparator.comparing(c->c.getAge()))
					.collect(Collectors.toList());
		Candidate c = sortedList.get(0);
		//Wrap it in Optional
		Optional<Candidate> optional = Optional.of(c);
		return optional;
	}
}
/* 
  	Comparator interface allows us to define the sorting criteria. we use comparing method
 */


















