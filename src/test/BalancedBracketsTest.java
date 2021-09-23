package test;


import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void  onlyBalancedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void  leftBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void rightBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void wordBetweenBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launched]"));
    }

    @Test
    public void wordBetweenTurnedBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("]launched["));
    }

    @Test
    public void wordBetweenInnerBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("land[]lock"));
    }

    @Test
    public void wordAfterBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]launched"));
    }

    @Test
    public void wordFrontBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("launched[]"));
    }

    @Test
    public void wordAfterABracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launched"));
    }

    @Test
    public void wordBeforeABracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("launched]"));
    }
}


