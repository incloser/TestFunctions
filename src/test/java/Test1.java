import org.junit.Test;
import package1.New;

import static org.junit.Assert.assertEquals;

public class Test1 {

    @Test
    public void testRandomConstructor() throws Exception {
        New test = new New();
        assertEquals(3, test.add(1, 2));
    }
}
