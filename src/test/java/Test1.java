import org.junit.*;
import package1.New;

import static org.junit.Assert.assertEquals;

public class Test1{
    @BeforeClass
    public static void mainSetUp() {
        System.out.println("Начало всех тестов.");
    }

    @Before
    public void setUp() {
        System.out.println("Начало теста.");
    }

    @Test(timeout = 1000)
    public void testRandomConstructor() {
        New test = new New();
        try {
            assertEquals(3, test.add(1, 2));
            System.out.println("Сложение работает верно.");
        } catch (Exception e) {
            System.out.println("Сложение не верно.");
        }
    }

    @Ignore("Тест на стадии разработки.")
    public void ignoreTest() {
        System.out.println("Этого никто не увидит в тестах.");
    }

    @Test
    public void test() {
        System.out.println("Второй тест, не далающий ничего.");
    }

    @After
    public void after() {
        System.out.println("Конец теста.");
    }

    @AfterClass
    public static void mainAfter() {
        System.out.println("Конец всех тестов.");
    }
}