package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        ATM atm = context.getBean(ATM.class);

        Bank bank = context.getBean(Bank.class);
        System.out.println( bank.getName());

        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}
