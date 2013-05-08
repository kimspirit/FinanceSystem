import jxt.model.Finance;
import jxt.service.FinanceManager;
import jxt.service.impl.FinanceManagerImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
