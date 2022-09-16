/**
 * 
 */
package edu.lernia.labb4;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Simon
 *
 */

@DisplayName("Testing TollFeeCalculator")
public class TollFeeCalculatorTest {

	/**
	 * Test method for {@link TollFeeCalculator#TollFeeCalculator(String)}.
	 */
	@Test
	void testTollFeeCalculator() {
	
	}

	/**
	 * Test method for {@link TollFeeCalculator#getTotalFeeCost(LocalDateTime[])}.
	 */
	@DisplayName("Testing total amount from 2 different times")
	@Test
	void testGetTotalFeeCost() {
		LocalDateTime[] date = new LocalDateTime[2];
		date[0] = LocalDateTime.of(2020, Month.JUNE, 30, 07, 30);
		date[1] = LocalDateTime.of(2020, Month.JUNE, 30, 15, 35);
				
		assertEquals(36, TollFeeCalculator.getTotalFeeCost(date));
	}

	/**
	 * Test method for {@link TollFeeCalculator#getTollFeePerPassing(LocalDateTime)}.
	 */
	@DisplayName("Testing 2 different date and see if the amount is right")
	@Test
	void testGetTollFeePerPassing() {
		LocalDateTime testDate1 = LocalDateTime.parse("2020-06-30 07:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));		
		int result1 = TollFeeCalculator.getTollFeePerPassing(testDate1);
	    assertEquals(18, result1);
		
	    LocalDateTime testDate2 = LocalDateTime.parse("2020-06-30 17:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		
		int result2 = TollFeeCalculator.getTollFeePerPassing(testDate2);
	    assertEquals(13, result2);
		
		
	}

	/**
	 * Test method for {@link TollFeeCalculator#isTollFreeDate(LocalDateTime)}.
	 */
	@DisplayName("Test to see if i get my free pass")
	@Test
	void testIsTollFreeDate() {
		LocalDateTime[] date = new LocalDateTime[3];
		date[0] = LocalDateTime.of(2020, Month.JULY, 15, 15, 30);
		date[1] = LocalDateTime.of(2020, Month.JULY, 30, 00, 30);
		date[2] = LocalDateTime.of(2020, Month.JUNE, 30, 01, 35);
		
		assertEquals(true, TollFeeCalculator.isTollFreeDate(date[0]));
		assertEquals(true, TollFeeCalculator.isTollFreeDate(date[1]));
	}

	/**
	 * Test method for {@link TollFeeCalculator#main(String[])}.
	 */
	@Test
	void testMain() {
	
	}

}
