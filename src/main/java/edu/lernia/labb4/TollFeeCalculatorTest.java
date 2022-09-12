/**
 * 
 */
package edu.lernia.labb4;



import static org.junit.jupiter.api.Assertions.assertEquals;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author simon
 *
 */

@DisplayName("Testing TollFeeCalculator")
public class TollFeeCalculatorTest {

	/**
	 * Test method for {@link edu.lernia.labb4.TollFeeCalculator#TollFeeCalculator(java.lang.String)}.
	 */
	@Test
	void testTollFeeCalculator() {
	
	}

	/**
	 * Test method for {@link edu.lernia.labb4.TollFeeCalculator#getTotalFeeCost(java.time.LocalDateTime[])}.
	 */
	@Test
	void testGetTotalFeeCost() {
	
	}

	/**
	 * Test method for {@link edu.lernia.labb4.TollFeeCalculator#getTollFeePerPassing(java.time.LocalDateTime)}.
	 */
	@Test
	void testGetTollFeePerPassing() {
		LocalDateTime testDate1 = LocalDateTime.parse("2020-06-30 07:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));		
		int result1 = TollFeeCalculator.getTollFeePerPassing(testDate1);
	    assertEquals(18, result1);
		
	    LocalDateTime testDate2 = LocalDateTime.parse("2020-06-30 17:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		
		int result2 = TollFeeCalculator.getTollFeePerPassing(testDate2);
	    assertEquals(13, result2);
		
		
	}

	/**
	 * Test method for {@link edu.lernia.labb4.TollFeeCalculator#isTollFreeDate(java.time.LocalDateTime)}.
	 */
	@Test
	void testIsTollFreeDate() {
		
	}

	/**
	 * Test method for {@link edu.lernia.labb4.TollFeeCalculator#main(java.lang.String[])}.
	 */
	@Test
	void testMain() {
	
	}

}
