import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetTest {

    @Test
    public void testIsEmpty() {
        Set set = new Set();
        assertEquals(set.isEmpty(), true);
    }

}
