package jxt.service;

import jxt.model.Finance;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: karl
 * Date: 5/5/13
 * Time: 7:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface FinanceManager {

    public void saveIncident(Finance finance);

    public List<Finance> queryFinance(String startDate, String endDate);

    public void singleDelete(Finance finance);
}
