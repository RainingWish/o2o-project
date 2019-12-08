//Qinyao Zhang 12.6.2019
package o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

//Install spring and junit together
//when junit open, also open springIOC


@RunWith(SpringJUnit4ClassRunner.class)
//tell junit where the spring is
@ContextConfiguration(locations = {"classpath*:spring/spring-dao.xml","classpath*:spring/spring-service.xml"})

public class BaseTest {

}
