package TP1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercice3Test {
    private Exercice3 estUnPalindrome;
    private long nombre;


    @BeforeEach
    public void setUp() {

        estUnPalindrome = new Exercice3();
    }

    @Test
    @DisplayName("Renversement Nombre")
    public void renversementNombre(){
        long nombre= 11;
        boolean result = estUnPalindrome.estUnPalindrome(nombre);
        assertEquals(true, result);
    }


    @ParameterizedTest(name="Test {index} : {0}")
    @CsvSource({
            "11,11",
            "22,22",
            "111,111"
    })
    @DisplayName("Palindrome multiple paramétré")
    public void testPalindromeParametre(long nombre){
        boolean result = estUnPalindrome.estUnPalindrome(nombre);
        assertEquals(true, result);
    }


    @Test
    @DisplayName(" Test nombre inférieur à 10")
    public void testNombreInferieur(){
        long nombre= 9;
        assertThrows(IllegalArgumentException.class,
                ()->estUnPalindrome.estUnPalindrome(nombre));
    }


    @Test
    @DisplayName("Nombre n'est pas un palindrome")
    public void testNonPalindrome(){
        long nombre= 10;
        boolean result = estUnPalindrome.estUnPalindrome(nombre);
        assertEquals(false, result);
    }

}
