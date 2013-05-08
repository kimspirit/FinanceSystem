package jxt.dao.impl;

import jxt.dao.FinanceDAO;
import jxt.model.Finance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
    @Override
    public void addIncident(Finance finance) {
        //To change body of implemented methods use File | Settings | File Templates.
        Session session = sessionFactory.getCurrentSession();
        session.save(finance);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Resource(name = "mySessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
