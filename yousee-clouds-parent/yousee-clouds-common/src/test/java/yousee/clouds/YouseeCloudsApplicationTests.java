package yousee.clouds;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import yousee.clouds.util.CommonDateUtil;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YouseeCloudsApplicationTests {

    @Test
    public void contextLoads() {


        Date date = new Date();
        long time = date.getTime();

        System.out.println(time);
    }

}

