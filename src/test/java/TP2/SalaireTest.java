package TP2;

import TP1.exercice1Moyenne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaireTest {
    private Salaire payer;
    private double heuresTravaille;

    @BeforeEach
    public void setUp() {

        payer = new Salaire();
    }

    @Test
    public void Test151heures(){
        double heuresTravaille=151.67;
        double result = payer.payer(heuresTravaille);
        assertEquals(1398.40, result);
    }


    @Test
    public void Test172heures(){
        double heuresTravaille=172;
        double result = payer.payer(heuresTravaille);
        assertEquals(1632.80, result);
    }


}



