package jxt.action;

import com.opensymphony.xwork2.ActionSupport;
import jxt.dto.FinanceDTO;
import jxt.model.Finance;
import jxt.service.FinanceManager;
import jxt.service.impl.FinanceManagerImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: karl
 * Date: 5/5/13
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class FinanceActions extends ActionSupport {

    private FinanceManager financeManager;
    private FinanceDTO financeDTO = new FinanceDTO();
    private List<Finance> list = new ArrayList<Finance>();
    private Finance finance = new Finance();

    /**
     * 添加
     *
     * @return
     */
    public String addAction() {
        Finance finance = new Finance();
        finance.setInCome(financeDTO.getInCome());
        finance.setOutCome(financeDTO.getOutCome());
        finance.setReason(financeDTO.getReason());
        financeManager.saveIncident(finance);
        System.out.print(finance.getReason());
        return "success";
    }

    /**
     * 删除
     */

    public String singDeleteAcion(){
        financeManager.singleDelete(financeDTO.getId());
        return "success";
    }
    /**
     * 修改
     */
    public String querySingleAction(){
        finance = financeManager.singleQury(financeDTO.getId());
        System.out.print(finance.getInCome());
        return "success";
    }

    public String editAction(){
        financeManager.editQuery(financeDTO.getId());
        return "success";
    }

    /**
     * 查询
     *
     * @return
     */

    public String queryAction() {
        list = financeManager.queryFinance(financeDTO.getStatrTime(), financeDTO.getEndTime());
        return "success";

    }

    public FinanceManager getFinanceManager() {
        return financeManager;
    }

    @Resource(name = "service")
    public void setFinanceManager(FinanceManager financeManager) {
        this.financeManager = financeManager;
    }

    public FinanceDTO getFinanceDTO() {
        return financeDTO;
    }

    public void setFinanceDTO(FinanceDTO financeDTO) {
        this.financeDTO = financeDTO;
    }

    public List<Finance> getList() {
        return list;
    }

    public void setList(List<Finance> list) {
        this.list = list;

    }

    public Finance getFinance() {
        return finance;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }
}
