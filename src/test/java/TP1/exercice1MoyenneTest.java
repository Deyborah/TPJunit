package TP1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
class exercice1MoyenneTest {
    private exercice1Moyenne moyenne;
    private int notes;

    @BeforeEach
    public void setUp() {
        moyenne = new exercice1Moyenne();
    }

    @Test
    @DisplayName("test de moyenne")
    public void testMoyenne(){
        int[] note={11,12,13};
        int result = moyenne.moyenne(note);
        assertEquals(12, result);
    }

    @Test
    public void testNotesIncorrect(){

        int[] note={-11,112,153};

        assertThrows(IllegalArgumentException.class,
                ()->moyenne.moyenne(note));
    }


    @Test
    public void testTailleNotes(){
        int[] notes={10,20};

        assertThrows(IllegalArgumentException.class,
                ()->moyenne.moyenne(notes));
    }

}