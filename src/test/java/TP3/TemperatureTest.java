package TP3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TemperatureTest {
    @Test
    public void temperature_proche_de_0() {
        // Given
        Temperature temperature = new Temperature();
        // When
        String result = temperature.say(0);
        // Then
        assertEquals("0", result);
    }
}
