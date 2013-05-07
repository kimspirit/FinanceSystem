package jxt.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: karl
 * Date: 5/5/13
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name = "FinanceSystem")
public class Finance {

    private int id;
    private int inCome;
    private int outCome;
    private String reason;
    private Date addTime = new Date();

    @Id
    @GeneratedValue
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

    public Date getAddTime() {
        return addTime;
    }

    @Temporal(TemporalType.DATE)
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
