package jxt.dao.impl;

import jxt.dao.FinanceDAO;
import jxt.model.Finance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: karl
 * Date: 5/5/13
 * Time: 7:06 PM
 * To change this template use File | Settings | File Templates.
 */
@Component("dao")
public class FinanceDAOImpl implements FinanceDAO{

    private SessionFactory sessionFactory;
    Session session ;
    @Override
    public void addIncident(Finance finance) {
        //To change body of implemented methods use File | Settings | File Templates.
        session = sessionFactory.getCurrentSession();
        session.save(finance);
    }

    /**
     *
     * 查询支出支入
     */
    @Override
    public List<Finance> queryList(String startDate, String endDate) {
        StringBuffer sqlBuffer = new StringBuffer("select * from Finance where 1=1 ");
        if(startDate!=null && endDate!=null){
            sqlBuffer.append("addTime BETWEEN '"+startDate+" ' and '"+endDate+"'");
        }
        String sql = sqlBuffer.toString();
        List<Finance> list = session.createQuery(sql).list();
        return list;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Resource(name = "mySessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
