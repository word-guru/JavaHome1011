package top.popov.testSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Warehouse warehouse = context.getBean("warehouse", Warehouse.class);


        warehouse.showContent();
        context.close();
    }
}
