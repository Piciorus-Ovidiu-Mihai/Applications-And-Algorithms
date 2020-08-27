package aut.utcluj.isp.ex2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * @author stefan
 */
public class NotebookTest {
    @Test
    public void testCreate() {
        final Notebook firstNotebook = new Notebook("Dell", "SN123", "Ubuntu 18.04");
        assertEquals("OS Version should be 'Ubuntu 18.04'", "Ubuntu 18.04", firstNotebook.getOsVersion());
        assertEquals("Should display 'Notebook Dell started'", "Notebook Dell started", firstNotebook.start());
        assertThat("Instance should be 'Equipment'", firstNotebook, instanceOf(Equipment.class));

        final Notebook secondNotebook = new Notebook("HP", "SN124", "Ubuntu 18.10");
        assertEquals("OS Version should be 'Ubuntu 18.10'", "Ubuntu 18.10", secondNotebook.getOsVersion());
        assertEquals("Should display 'Notebook Dell started'", "Notebook HP started", secondNotebook.start());
        assertThat("Instance should be 'Equipment'", secondNotebook, instanceOf(Equipment.class));
    }
}