package us.jlp.test;

import org.junit.jupiter.api.Test;
import us.jlp.TimeHelper;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeHelperTest {

    @Test
    void getTime() { //Test to make sure random gen is within bounds
        TimeHelper testTimer = new TimeHelper();
        LocalTime givenTime = testTimer.getTime();

        int lowerBound = 1;
        int upperBound = 22;

        assertTrue(givenTime.getHour() < upperBound && givenTime.getHour() > lowerBound,"Time not within bounds of less than "+upperBound+"00 and more than "+lowerBound+"00"); //Time should be more than 0100 and less than 2200
    }
}