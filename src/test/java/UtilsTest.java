import com.company.LinkUtils;
import com.company.model.Device;
import com.company.model.Point;
import com.company.model.Station;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UtilsTest {
    @Test
    public void zeroDistance() {

        assertEquals(0,LinkUtils.calculateDistance(new Point(0,0), new Point(0,0)), 0.1);

    }

    @Test
    public void nonZeroDistance() {

        assertEquals(5.83,LinkUtils.calculateDistance(new Point(-3,2), new Point(0,-3)), 0.1);

    }

    @Test
    public void nonZeroPower() {
        Station dummyStation = new Station(new Point(0,0),10);
        Device testDevice = new Device(new Point(2,2));

        assertEquals(51.43,LinkUtils.calculatePower(testDevice, dummyStation), 0.1);

    }

    @Test
    public void zeroPower() {
        Station dummyStation = new Station(new Point(0,0),10);
        Device testDevice = new Device(new Point(20,20));

        assertEquals(0,LinkUtils.calculatePower(testDevice, dummyStation), 0.1);

    }



}