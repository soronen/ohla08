import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {

    @ParameterizedTest(name = "Seconds {0} to time {1}")
    @CsvSource({ "0, '0:00:00'", "3665, '1:01:05'", "7200, '2:00:00'", "32000, '-1'",
                 "31999, '8:53:19'", "-1, '-1'" })
    public void testSecToTime(int seconds, String expectedTime) {
        assertEquals(expectedTime, TimeUtils.secToTime(seconds));
    }
}
