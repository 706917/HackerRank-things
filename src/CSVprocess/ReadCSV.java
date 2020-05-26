package CSVprocess;

/*
 * You are given a data.csv file in the /root/customers/ directory containing information about your customers.

It has the following columns:

ID,NAME,CITY,COUNTRY,CPERSON,EMPLCNT,CONTRCNT,CONTRCOST
where

ID: Unique id of the customer
NAME: Official customer company name
CITY: Location city name
COUNTRY: Location country name
CPERSON: Email of the customer company contact person
EMPLCNT: Customer company employees number
CONTRCNT: Number of contracts signed with the customer
CONTRCOST: Total amount of money paid by customer (float in format dollars.cents)
Read and analyze the data.csv file, and output the answers to these questions:

How many total customers are in this data set?
How many customers are in each city?
How many customers are in each country?
Which country has the largest number of customers' contracts signed in it? How many contracts does it have?
How many unique cities have at least one customer in them?
The answers should be formatted as:

Total customers:
<number>
Customers by city:
<CITY>: <number>
<CITY>: <number>
...
Customers by country:
<COUNTRY>: <number>
<COUNTRY>: <number>
...
Country with the largest number of customers' contracts:
<country> (<number> contracts)
Unique cities with at least one customer:
<number>
The answers for Customers by city and Customers by country must be sorted by CITY and COUNTRY respectively, in ascending order. 
If there are several cities that are tied for having the most customers' contracts, print the lexicographically bigger one.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class ReadCSV {

	    public static void main(String[] args) throws FileNotFoundException {
	        System.out.println("Hello, World");

	        // Create HashMap
			HashMap<String, Integer> city = new HashMap<>();
	        HashMap<String, Integer> country = new HashMap<>();

	        File file = new File("/root/customers/data.csv");

	        Scanner scan = new Scanner(file);

	        scan.nextLine();

	        
	        int totalCustomers = 0;

	        while(scan.hasNextLine()){
	        	// count total customers
	            totalCustomers++;
	            
	            String [] line = scan.nextLine().split(",");
	            
	            // count ppl in the city
	            if(city.containsKey(line[2])){
	                city.replace(line[2], city.get(line[2])+1);
	            }
	            else{
	                city.put(line[2], 1);
	            }
	            
	            // count ppl in the country
	            if(country.containsKey(line[3])){
	                country.replace(line[3], country.get(line[2])+1);
	            }
	            else{
	                country.put(line[3], 1);
	            }
	        }
	        
	        scan.close();

	    


	System.out.println("Total customers:");
	System.out.println(totalCustomers);
	
	System.out.println("Customers by city:");
	List<String> cityList = new ArrayList<>(city.keySet());
	Collections.sort(cityList);
	for(String el: cityList) {
		System.out.println(el + ": " + city.get(el));
	}
	
	
	System.out.println("Customers by country:");
	List<String> contryList = new ArrayList<>(country.keySet());
	Collections.sort(contryList);
	for(String el: contryList) {
		System.out.println(el + ": " + country.get(el));
	}
	
	System.out.println("Country with the largest number of customers' contracts: ");
	int maxValue = Collections.max(country.values());
	String countryMax = "";
	for ( Entry<String, Integer> entry: country.entrySet()){
		if( entry.getValue() == maxValue) countryMax = entry.getKey();
	}
	System.out.println(countryMax + ": " + maxValue + " contracts");
	
	
	System.out.println("Unique cities with at least one customer:");
	System.out.println(city.size());
	

	    }
}
