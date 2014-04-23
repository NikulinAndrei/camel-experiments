package ee.kemit.cameltest;

import org.apache.camel.spring.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 21.04.14
 */
public class SpringRunner {

  public static void main(String[] args) throws Exception {
    Main main = new Main();
    main.setApplicationContextUri("/ApplicationContext.xml");
    main.enableHangupSupport();
    main.run();
  }
}
