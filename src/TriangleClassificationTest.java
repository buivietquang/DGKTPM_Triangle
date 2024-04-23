import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleClassificationTest {

    @Test
    public void testInvalidInputNegativeNumbers() {
        assertEquals("InvalidInput", TriangleClassification.classifyTriangle(-1, 5, 10));
        assertEquals("InvalidInput", TriangleClassification.classifyTriangle(5, -1, 10));
        assertEquals("InvalidInput", TriangleClassification.classifyTriangle(5, 10, -1));
    }

    @Test
    public void testInvalidInputZero() {
        assertEquals("InvalidInput", TriangleClassification.classifyTriangle(0, 5, 10));
        assertEquals("InvalidInput", TriangleClassification.classifyTriangle(5, 0, 10));
        assertEquals("InvalidInput", TriangleClassification.classifyTriangle(5, 10, 0));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle - Khong phai la tam giac", TriangleClassification.classifyTriangle(1, 2, 3));
        assertEquals("NotATriangle - Khong phai la tam giac", TriangleClassification.classifyTriangle(1, 10, 12));
        assertEquals("NotATriangle - Khong phai la tam giac", TriangleClassification.classifyTriangle(10, 2, 5));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("Right - Tam giac vuong", TriangleClassification.classifyTriangle(3, 4, 5));
        assertEquals("Right - Tam giac vuong", TriangleClassification.classifyTriangle(5, 3, 4));
        assertEquals("Right - Tam giac vuong", TriangleClassification.classifyTriangle(5, 12, 13));
    }
    @Test
    public void testProcessInputInvalidNumberOfValues() {
        assertEquals("Invalid input: Please enter exactly three values.", TriangleClassification.processInput(new String[] {"5", "10"}));
        assertEquals("Invalid input: Please enter exactly three values.", TriangleClassification.processInput(new String[] {"5"}));
        assertEquals("Invalid input: Please enter exactly three values.", TriangleClassification.processInput(new String[] {}));
    }
    
    @Test
    public void testProcessInputInvalidIntegers() {
        assertEquals("Invalid input: Please enter valid integers.", TriangleClassification.processInput(new String[] {"a", "b", "c"}));
        assertEquals("Invalid input: Please enter valid integers.", TriangleClassification.processInput(new String[] {"5.5", "7.2", "9.8"}));
        assertEquals("Invalid input: Please enter valid integers.", TriangleClassification.processInput(new String[] {"5", "ten", "15"}));
    }
}
