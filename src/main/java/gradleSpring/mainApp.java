package gradleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        Vehicle obj = (Vehicle)ctx.getBean("bike");
//        obj.drive();
        Tyre t = (Tyre)ctx.getBean("tyre");
        System.out.println(t);
    }
}
