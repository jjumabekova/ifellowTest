import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RunTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }
    @Test
    public void test1(){
        System.out.println("1");
        Assertions.assertEquals("AW", "AW");
    }
    @Test
    public void test2(){
        System.out.println("2");
        Assertions.assertEquals("AW","A@W");
    }

}
