package TP1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercice2Test {

    private Exercice2 HtToTtc;

    private double TVA;

    private int prixHT;

    @BeforeEach
    public void setUp() {
        HtToTtc = new Exercice2();
    }

    @Test
    @DisplayName("Test conversion prix TTC")
    public void testTva(){
        int prixHT= 75;
        double result = HtToTtc.HtToTtc(prixHT);
        assertEquals(90, result);
    }

    @Test
    @DisplayName("Test Prix est négatif ou null")
    public void testPrixNegatif(){
        int pxHT=0;
        assertThrows(IllegalArgumentException.class,
                ()->HtToTtc.HtToTtc(pxHT));
    }

    @ParameterizedTest(name="Test {index} : {0}")
    @CsvSource({
            "10,12",
            "20,24",
            "100,120"
    })
    @DisplayName("Test prix HT multiple paramétré")
    public void testPrixHtParametre(int prixht,int prixttc){
        double result = HtToTtc.HtToTtc(prixht);
        assertEquals(prixttc, result);
    }
}
