import org.junit.Test; 
import static org.junit.Assert.*; 
package com.example;
 
public class LibraryTest         { 
 
    @Test 
    public void testFineCalculation() { 
        int allowedDays = 14; 
        int finePerDay = 5; 
 
        int days = 20; 
        int expectedFine = (days - allowedDays) * finePerDay; 
 
        int actualFine = (days > allowedDays) ?  
                         (days - allowedDays) * finePerDay : 0; 
 
        assertEquals(expectedFine, actualFine); 
    } 
 
    @Test 
    public void testNoFine() { 
        int days = 10; 
        int allowedDays = 14; 
 
        int fine = (days > allowedDays) ? (days - allowedDays) * 5 : 0; 
 
        assertEquals(0, fine); 
    }}