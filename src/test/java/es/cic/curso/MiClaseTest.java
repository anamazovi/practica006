package es.cic.curso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MiClaseTest {

    @Test
    void testMiMetodo() {
        // Crear un mock de MiDependencia
        MiDependencia mockDependencia = Mockito.mock(MiDependencia.class);

        // Definir el comportamiento del mock
        when(mockDependencia.metodo()).thenReturn("Valor esperado");

        // Crear la instancia de MiClase con el mock
        MiClase instancia = new MiClase(mockDependencia);

        // Ejecutar el método que estamos probando
        String resultado = instancia.miMetodo();

        // Verificar el resultado
        assertEquals("Valor esperado", resultado);

        // Verificar que el método del mock fue llamado
        verify(mockDependencia).metodo();
    }
}
