package org.fundacionjala.coding.marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/22/2017.
 */
public class MultiplesTest {

    private Multiples multiples;

    /**
     * Setup.
     */
    @Before
    public void setUp() {
        multiples = new Multiples();
    }

    /**
     * Testing test For Three Numbers.
     */
    @Test
    public void testMultiplesScenario1() {
        final int number = 10;
        final int expectedResult = 23;
        assertEquals(expectedResult, multiples.multipleThreeAndFive(number));
    }

    /**
     * Testing test For Three Numbers.
     */
    @Test
    public void testMultiplesScenario2() {
        final int number = 20;
        final int expectedResult = 78;
        assertEquals(expectedResult, multiples.multipleThreeAndFive(number));
    }

    /**
     * Testing test For Three Numbers.
     */
    @Test
    public void testMultiplesScenario3() {
        final int number = 200;
        final int expectedResult = 9168;
        assertEquals(expectedResult, multiples.multipleThreeAndFive(number));
    }

}
