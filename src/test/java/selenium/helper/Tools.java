package selenium.helper;

import selenium.drivers.DriverFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Tools extends DriverFactory {
    public void driverWait(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public int select(int size){
        Random random= new Random();
        return random.nextInt(size -1);

    }

}
