package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	static ArrayList<Staff> staff1 = new ArrayList<Staff>();
	static Staff Staff1;
	
	public static Date newDate(int year, int month, int day) {
		Calendar data = Calendar.getInstance();
		data.set(year, month, day);
		return data.getTime();
	}
	
	@BeforeClass
	public static void setup() throws PersonException {
		staff1.add( new Staff("Jayci", "Ann", "Smitch", newDate(1997, 2, 1), "Bethlehem", "(610)-666-1000",
				"jayfal@gmail.com", "T",  9,000, newDate(2018, 1, 1), eTitle.MR));

		staff1.add(new Staff("Lauren", "Audrey", "Rep", newDate(1999, 11, 11), "Ellicot City", "(201)-333-2222",
				"arepp@udel.edu", "T",  10,000, newDate(2017, 3, 3), eTitle.MR));

		staff1.add(new Staff("Amy", "Yung", "Well", newDate(1999, 10, 10), "Easton", "(215)-654-0001",
				"aysrxo@udel.edu", "T",  315,000, newDate(2018, 2, 1), eTitle.MR));

		staff1.add(new Staff("Nomerra", "Lee", "Brown", newDate(1998, 2, 8), "Bear", "(302)-215-9089",
				"nomBrown@gmail.com", "T",  25,000, newDate(2018, 2, 2), eTitle.MR));


		staff1.add(new Staff("Michelle", "Liz", "Ann", newDate(1996, 13, 12), "Queens", "(917)-111-1111",
				"myue@udel.edu", "T",  44,000, newDate(2018, 1, 2), eTitle.MR));
		
	}
	
	@Test
	public void test() {
			double total = 0;
			for (Staff avgStaff : staff1) {
				total += avgStaff.getSalary();
			}
			double average = total / staff1.size();
			extracted(average);
		}

	private void extracted(double average) {
		assertEquals(average, 80600);
	}
	
	

}
