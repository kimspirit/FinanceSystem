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
    @Override
    public void addIncident(Finance finance) {
        //To change body of implemented methods use File | Settings | File Templates.
        Session session = sessionFactory.getCurrentSession();
        session.save(finance);
    }

    /**
     * 查询支出支入
     */
    @Override
    public List<Finance> queryList(String startDate, String endDate) {

        Session session = sessionFactory.getCurrentSession();
        StringBuffer sqlBuffer = new StringBuffer("from FinanceSystem ");
        if(startDate!=null && endDate!=null && startDate != "" && endDate != ""){
            sqlBuffer.append(" where addTime BETWEEN '"+startDate+" ' and '"+endDate+"'");
        }
        String sql = sqlBuffer.toString();
        List<Finance> list = session.createQuery(sql).list();
        return list;  //To change body of implemented methods use File | Settings | File Templates.
    }

/**
 * 删除操作
 * @param id
 */
    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Finance finance = (Finance)session.load(Finance.class,id);
        session.delete(finance);
//        session.createQuery("delete from FinanceSystem where id=:id").setParameter("id",id);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Finance queryById(int id) {
        //To change body of implemented methods use File | Settings | File Templates.
        Session session = sessionFactory.getCurrentSession();
        Finance finance = (Finance)session.get(Finance.class,id);
        return finance;
    }

    /**
 * 修改
 * @param finance
 */
    @Override
    public void edit(Finance finance) {

    }


    /**
     * getter & setter
     * @return
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Resource(name = "mySessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
