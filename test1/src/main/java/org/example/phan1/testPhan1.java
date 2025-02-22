package org.example.phan1;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

public class testPhan1 {
    private final soLe sl = new soLe();

    @Test
    public void test01() {
        assertEquals(9, soLe.tongSole(6));
    }

    @Test
    public void test02() {
        assertEquals(16, soLe.tongSole(9));
    }

    @Test
    public void test03() {
        assertEquals(0, soLe.tongSole(0));
    }

    @Test
    public void test04() {
        assertEquals(1, soLe.tongSole(1));
    }

    @Test
    public void test05() {
        assertEquals(25, soLe.tongSole(10));
    }
}
