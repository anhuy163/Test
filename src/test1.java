import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test1 {
    @Test
    public void Test1() {
        double height = 160;
        double weight = 200;
        assertEquals("Obese Class III", Main.bmiTest(height, weight));
    }



    @Test
    public void Test2() {
        double height = 160;
        double weight = 199;
        assertEquals("Obese Class III", Main.bmiTest(height, weight));
    }

    @Test
    public void Test3() {
        double height = 160;
        double weight = 40;
        assertEquals("Severe Thinness", Main.bmiTest(height, weight));
    }

    @Test
    public void Test4() {
        double height = 160;
        double weight = 41;
        assertEquals("Severe Thinness", Main.bmiTest(height, weight));
    }

    @Test
    public void Test5() {
        double height = 200;
        double weight = 55;
        assertEquals("Severe Thinness", Main.bmiTest(height, weight));
    }

    @Test
    public void Test6() {
        double height = 199;
        double weight = 55;
        assertEquals("Severe Thinness", Main.bmiTest(height, weight));
    }

    @Test
    public void Test7() {
        double height = 150;
        double weight = 55;
        assertEquals("Normal", Main.bmiTest(height, weight));
    }

    @Test
    public void Test8() {
        double height = 151;
        double weight = 55;
        assertEquals("Normal", Main.bmiTest(height, weight));
    }

    @Test
    public void Test9() {
        double height = 160;
        double weight = 55;
        assertEquals("Nomarl", Main.bmiTest(height, weight));
    }
}
