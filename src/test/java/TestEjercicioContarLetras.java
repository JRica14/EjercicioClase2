import com.sun.nio.sctp.SctpSocketOption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarLetras {

        @Test
        public void testContarLetrasNoIguales(){
            char [] input ={'h','o','l','a'};
            String outputEsperdo="{a=1, h=1, l=1, o=1}";
            String outputActual = EjercicioContarLetras.contarRepeticiones(input);
            Assertions.assertEquals(outputEsperdo, outputActual);
        }

    @Test
    public void testContarLetrasIguales(){
        char [] input ={'a','a','a','a'};
        String outputEsperdo="{a=4}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperdo, outputActual);
    }


        @Test
        public void testContarLetrasMixtas(){
            char [] input ={'h','o','l','a','a','a','!'};
            String outputEsperdo="{a=3, !=1, h=1, l=1, o=1}";
            String outputActual = EjercicioContarLetras.contarRepeticiones(input);
            Assertions.assertEquals(outputEsperdo, outputActual);
        }

        @Test
        public void testContarLetrasVacio(){
            char [] input ={};
            String outputEsperdo="{}";
            String outputActual = EjercicioContarLetras.contarRepeticiones(input);
            Assertions.assertEquals(outputEsperdo, outputActual);
        }

    @Test
    public void testContarLetrasNull(){
        char [] input =null;
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertNull(outputActual);
    }
}
