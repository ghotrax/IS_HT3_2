import org.junit.*;
import static org.junit.Assert.*;
public class PalindromesTest {
    public PalindromesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void simpleInput_normalOutput() {
        System.out.println("TEST #1 - whenBasicInput_thenBasicOutput");

        // given
        String input = "anona";
        Boolean expectedResult = true;

        // when
        Object actualResult = Palindromos.evaluate(input);

        // then
        assertEquals("Test #1 FAILED!!!",actualResult instanceof Boolean, expectedResult);
    }

    @Test
    public void nullInput_nullOutput(){
        System.out.println("TEST #2 - nullInput_nullOutput");

        // given
        String input = null;
        String expectedResult = null;

        // when
        Object actualResult = Palindromos.evaluate(input);

        // then
        assertEquals("Test #2 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void emptyInput_emptyOutput(){
        System.out.println("TEST #3 - emptyInput_emptyOutput");

        // given
        String input = "";
        String expectedResult = "";

        // when
        Object actualResult = Palindromos.evaluate(input);

        // then
        assertEquals("Test #3 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void tooShortInput_tooShortOutput(){
        System.out.println("TEST #4 - tooShortInput_tooShortOutput");

        // given
        String input = "as";
        String expectedResult = "as";

        // when
        Object actualResult = Palindromos.evaluate(input);

        // then
        assertEquals("Test #4 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void withSpacesInput_emptyOutput(){
        System.out.println("TEST #5 - withSpacesInput_emptyOutput");

        // given
        String input = "aba ";
        String expectedResult = "";

        // when
        Object actualResult = Palindromos.evaluate(input);

        // then
        assertEquals("Test #5 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void tooLongInput_emptyOutput(){
        System.out.println("TEST #6 - tooLongInput_emptyOutput");

        // given
        String input = "holaestoesunapruebadetextoparacomprobarsitienemasde200letrasysilotieneestapruebavaafallarasiqueespero" +
                "holaestoesunapruebadetextoparacomprobarsitienemasde200letrasysilotieneestapruebavaafallarasiqueespero";
        String expectedResult = "";

        // when
        Object actualResult = Palindromos.evaluate(input);

        // then
        assertEquals("Test #6 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void nonOnlyLettersNumbersInput_messageOutput(){
        System.out.println("TEST #7 - nonOnlyLettersNumbersInput_messageOutput");

        // given
        String input = "anona.";
        String expectedResult = "solo letras o numeros";

        // when
        Object actualResult = Palindromos.evaluate(input);

        // then
        assertEquals("Test #7 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void parLengthInput_zeroOutput(){
        System.out.println("TEST #8 - parLengthInput_zeroOutput");

        // given
        String input = "anonan";
        int expectedResult = 0;

        // when
        Object actualResult = Palindromos.evaluate(input);

        // then
        assertEquals("Test #7 FAILED!!!",actualResult, expectedResult);
    }
}
