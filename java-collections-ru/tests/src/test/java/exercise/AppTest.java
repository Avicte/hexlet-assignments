package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual = App.take(expected, 2);
        assertThat(actual.size()).isEqualTo(2);
        assertThat(actual.get(0)).isEqualTo(1);
        assertThat(actual.get(1)).isEqualTo(2);
        // END
    }
}
