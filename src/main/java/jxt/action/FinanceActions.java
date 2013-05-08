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
}
