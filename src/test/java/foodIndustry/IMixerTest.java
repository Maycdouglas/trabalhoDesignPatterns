package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMixerTest {
    @Test
    public void deveRetornarMisturandoSalgadinho(){
        SnackMixer snackMixer = new SnackMixer ();
        assertEquals("Misturando salgadinho...", snackMixer.mix());
    }

    @Test
    public void deveRetornarMisturandoChocolate(){
        ChocolateMixer chocolateMixer  = new ChocolateMixer ();
        assertEquals("Misturando chocolate...", chocolateMixer.mix());
    }

    @Test
    public void deveRetornarMisturandoBiscoito(){
        BiscuitMixer biscuitMixer  = new BiscuitMixer ();
        assertEquals("Misturando biscoito...", biscuitMixer.mix());
    }

}