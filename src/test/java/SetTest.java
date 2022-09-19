import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetTest {

    @Test
    public void testIsEmpty() {
        Set set = new Set();
        assertTrue(set.isEmpty());
    }

}
