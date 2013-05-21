import jxt.model.Finance;
import jxt.service.FinanceManager;
import jxt.service.impl.FinanceManagerImpl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: karl
 * Date: 5/6/13
 * Time: 1:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class FinanceTest {

    @Test
    public void testDAO(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        FinanceManager manager = (FinanceManager)ctx.getBean("service");
        Finance finance = new Finance();
        finance.setOutCome(1);
        finance.setInCome(1);
        finance.setReason("asd");
        manager.saveIncident(finance);
    }

    @Test
    public void testQuery(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        FinanceManager manager = (FinanceManager)ctx.getBean("service");
        List<Finance> list = manager.queryFinance("20130508","20130509");
        for(int i= 0;i<list.size();i++){
            System.out.println(list.get(i).getId());
        }
    }
    @Test
    public void testDelete(){
        Finance finance = new Finance();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        FinanceManager manager = (FinanceManager)ctx.getBean("service");
        manager.singleDelete(20);
    }

    @Test
    public void testEdit(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        FinanceManager manager = (FinanceManager)ctx.getBean("service");
        Finance finance = manager.singleQury(46);
        System.out.println(finance.getInCome()+"  bofore");
        System.out.println(finance.getOutCome()+"  bofore");
        System.out.println(finance.getReason()+"  bofore");
        finance.setInCome(400);
        finance.setId(44);
        finance.setOutCome(400);
        System.out.println(finance.getInCome()+" after");
        System.out.println(finance.getOutCome()+" after");
        System.out.println(finance.getReason()+" after");
        manager.editQuery(46);
    }
}
