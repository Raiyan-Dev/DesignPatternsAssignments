package net.media.training.designpattern.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 5:51:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalaryDisberser {
    private final ThirdPartyLeaveRecordAdapter leaveRecord;
    private int SALARY = 15000;
    public SalaryDisberser(ThirdPartyLeaveRecordAdapter leaveRecordAdapter) {
        this.leaveRecord = leaveRecordAdapter;
    }
    public int salary(String employeeName) {
        return SALARY - leaveRecord.getEmployeeAbsences(employeeName) * 1000;
    }
}