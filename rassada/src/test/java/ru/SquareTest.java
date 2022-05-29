package ru;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
    @Test
    public void testArea(){
        Square a = new Square(5);
        Assert.assertEquals(a.S(),5.0);
    }
}
