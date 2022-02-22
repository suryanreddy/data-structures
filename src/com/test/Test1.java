package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
	
	public static void main(String...args){
	    Student raoul = new Student("Raoul", "Cambridge");
	    Student mario = new Student("Mario","Milan");
	    Student alan = new Student("Alan","Cambridge");
	    Student brian = new Student("Brian","Cambridge");
	    
	    List<Graduate> transactions = Arrays.asList(
	        new Graduate(brian, 2011, 300), 
	        new Graduate(raoul, 2012, 1000),
	        new Graduate(raoul, 2011, 400),
	        new Graduate(mario, 2012, 710),  
	        new Graduate(mario, 2012, 700),
	        new Graduate(alan, 2012, 950)
	    ); 
	    
//	    Predicate<Graduate> anyStudentMatch = (g) -> g.getTrader().getCity().equals("Milan");
	    Predicate<Graduate> filterGraduate = (g) -> (g.getYear() == 2012);
	    
	    System.out.println(transactions.stream().filter(filterGraduate).map(t -> t.getTrader()).collect(Collectors.toMap(Student::getName, Student::getCity, (existing, replacement) -> existing)));
	    
//	    boolean milanBased =
//	        transactions.stream()
//	                    .anyMatch(transaction -> transaction.getTrader()
//	                                                        .getCity()
//	                                                        .equals("Milan")
//	                             );
//	    System.out.println(milanBased);
	    
	  }
	}
	class Student{
	  
	  private String name;
	  private String city;

	  public Student(String n, String c){
	      this.name = n;
	      this.city = c;
	  }

	  public String getName(){
	      return this.name;
	  }

	  public String getCity(){
	      return this.city;
	  }

	  public void setCity(String newCity){
	      this.city = newCity;
	  }

	  public String toString(){
	      return "Student:"+this.name + " in " + this.city;
	  }
	}

	class Graduate{

	  private Student trader;
	  private int year;
	  private int value;

	  public Graduate(Student trader, int year, int value)
	  {
	      this.trader = trader;
	      this.year = year;
	      this.value = value;
	  }

	  public Student getTrader(){ 
	      return this.trader;
	  }

	  public int getYear(){
	      return this.year;
	  }

	  public int getValue(){
	      return this.value;
	  }
	  
	  public String toString(){
	      return "{" + this.trader + ", " +
	             "year: "+this.year+", " +
	             "value:" + this.value +"}";
	  }
	}
