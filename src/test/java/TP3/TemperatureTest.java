package TP3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TemperatureTest {
    @Test
    public void temperature_proche_de_0() {
        int[] temperature={};
        // Given
        Temperature thermometre = new Temperature();
        // When
        String result = thermometre.say(temperature);
        // Then
        assertEquals("0", result);
    }
}
