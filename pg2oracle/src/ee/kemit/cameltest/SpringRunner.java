package ee.kemit.cameltest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 21.04.14
 */
public class SpringRunner {

  public static void main(String[] args) throws InterruptedException {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    Thread.sleep(300000);
  }
}
