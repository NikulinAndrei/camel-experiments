package ee.anikulin.cameltest.cxfsrv;

import org.apache.camel.spring.Main;

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
