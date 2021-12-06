package HW_GB;


import Triangl.Triangle;
import lombok.val;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest
{
    @Test
    void isThisTriangle() {
        Triangle triangle = new Triangle(4, 5, 6);
        int actualResult = triangle.calculatePerimeter();
        assertEquals(15, actualResult);
    }

    @Test
    void isHighValid() {
        Triangle triangle = new Triangle(4, 5, 6);
        int actualResult = (int) triangle.calculateHigh();
        assertEquals(4.96078, actualResult);
    }

    @Test
    void isAreaValid() {
        Triangle triangle = new Triangle(4, 5, 6);
        int actualResult = (int) triangle.calculateArea();
        assertEquals(7, actualResult);
    }
}
