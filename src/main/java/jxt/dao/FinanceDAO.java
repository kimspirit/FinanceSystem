package jxt.dao;

import jxt.model.Finance;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: karl
 * Date: 5/5/13
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface FinanceDAO {

    public void addIncident(Finance finance);

    public List<Finance> queryList(String startDate,String endDate);

    public void  delete(Finance finance);

    public void edit(int id);
}
