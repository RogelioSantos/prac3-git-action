import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.matematicas.Operacion;

public class OperacionTest {
    
    @Test
    public void testSumar() {
        Operacion operacion = new Operacion(5, 3);
        assertEquals(8, operacion.sumar());
    }

    @Test
    public void testRestar() {
        Operacion operacion = new Operacion(5, 3);
        assertEquals(2, operacion.restar());
    }

    @Test
    public void testMultiplicar() {
        Operacion operacion = new Operacion(5, 3);
        assertEquals(15, operacion.multiplicar());
    }

    @Test
    public void testDividir() {
        Operacion operacion = new Operacion(10, 2);
        assertEquals(5, operacion.dividir());
    }

    @Test
    public void testDividirPorCero() {
        Operacion operacion = new Operacion(10, 0);
        assertThrows(ArithmeticException.class, () -> operacion.dividir());
    }
}