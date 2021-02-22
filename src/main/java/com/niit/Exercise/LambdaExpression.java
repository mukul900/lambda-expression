package com.niit.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LambdaExpression {
	static List<String> countryNames=new ArrayList<String>();
	static Map<String,String> countryCapital=new LinkedHashMap<String,String>();
	static {
		countryNames.add("India");
		countryNames.add("Japan");
		countryNames.add("Germany");
		countryNames.add("Canada");
		countryNames.add("Dominican Republic");
		countryNames.add("China");
		countryNames.add("Central African Republic");
		countryNames.add("Brazil");
		countryNames.add("Cambodia");
		countryNames.add("United States of America");
		countryCapital.put("India", "New Delhi");
		countryCapital.put("Japan", "Tokyo");
		countryCapital.put("Germany", "Bonn");
		countryCapital.put("Canada", "Ottawa");
		countryCapital.put("Dominican Republic", "Santo Domingo");
		countryCapital.put("China", "Beijing");
		countryCapital.put("Central African Republic", "Bangui");
		countryCapital.put("Brazil", "Brasilia");
		countryCapital.put("Cambodia", "Phnom Penh");
		countryCapital.put("United States of America", "Washington, D.C.");
	}
	static void displayCountries()
	{
		countryNames.forEach(list-> System.out.println(list));
	}
	static void displayCountryCapitals()
	{
		countryCapital.forEach((s1,s2)->System.out.println(s1+"----"+s2));
	}
	static void sortCountriesByName()
	{
		Comparator<String> countryComparator=(String s1,String s2)->s2.compareTo(s1);
		Collections.sort(countryNames,countryComparator);
		countryNames.forEach(list->System.out.println(list));
	}
	static void sortCountriesBylength()
	{
		Comparator<String> countryCompartorLength=(s1, s2)->Integer.compare(s1.length(),s2.length());
		Comparator<String> countryComparatorAlphabet=(s1,s2)->s1.compareTo(s2);
		Comparator<String> countryLengthThenAlphabet=countryCompartorLength.thenComparing(countryComparatorAlphabet);
		Collections.sort(countryNames,countryLengthThenAlphabet);
		countryNames.forEach(list->System.out.println(list));
	}
	static void removeCountry()
	{
		System.out.println(countryNames.size());
//		for(int i=0;i<countryNames.size();i++)
//		{
//			System.out.println("i="+i);
//			System.out.println(countryNames.get(i)+"---"+countryNames.get(i).length());
//			if(((countryNames.get(i)).length())>6)
//				countryNames.remove(i);
//		}
//		for(String s:countryNames)
//		{
//			if(s.length()>6)
//			{
//				int index=countryNames.indexOf(s);
//				countryNames.remove(index);
//			}
//	
//		}
		Iterator<String> iter = countryNames.iterator();
		while(iter.hasNext()){
		    if(iter.next().length()>6)
		        iter.remove();
		}

		countryNames.forEach(list->System.out.println(list));
	}
}

