package jxt.dto;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: karl
 * Date: 5/5/13
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class FinanceDTO {

    private int id;
    private int inCome;
    private int outCome;
    private String reason;
    private String statrTime;
    private String endTime;
    private Date addTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInCome() {
        return inCome;
    }

    public void setInCome(int inCome) {
        this.inCome = inCome;
    }

    public int getOutCome() {
        return outCome;
    }

    public void setOutCome(int outCome) {
        this.outCome = outCome;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatrTime() {
        return statrTime;
    }

    public void setStatrTime(String statrTime) {
        this.statrTime = statrTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
