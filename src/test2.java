import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test2 {
    @Test
    public void Test1() {
        double height = 145;
        double weight = 35;
        assertEquals("invalid input", Main.bmiTest(height, weight));
    }
    public void Test2(){
        double height = 175;
        double weight = 65;
        assertEquals("Normal",Main.bmiTest(height,weight));
    }
    public void Test3(){
        double height = 201;
        double weight = 201;
        assertEquals("invalid value",Main.bmiTest(height,weight));
    }
}
