/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

/**
 *
 * @author Mahakit
 */
public class NewEmptyJUnitTest {

    @Test
    public void CheckReport() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.testcheck2("2024","02"));}

    @Test
    public void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testcheck() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void twoPlusTwoShouldEqual5() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void twoPlusTwoShouldEqual6() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
//        System.out.println("");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
