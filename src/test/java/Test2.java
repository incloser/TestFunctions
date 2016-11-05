import org.junit.Test;
import package1.TestMethods;

import static org.junit.Assert.assertEquals;

public class Test2 {
    @Test
    public void testSubstracting() {
        TestMethods test = new TestMethods();
        try {
            assertEquals(1, test.sub(3, 2));
            System.out.println("Начало сна нити.");
            //Добавляем явное ожидание
            Thread.sleep(5000);
            System.out.println("Вычитание работает верно.");
        } catch (Exception e) {
            System.out.println("Вычитание не верно.");
        }
    }
}
