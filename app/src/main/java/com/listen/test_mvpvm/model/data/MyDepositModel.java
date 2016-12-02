package com.listen.test_mvpvm.model.data;

/**
 * @author listen
 */
public class MyDepositModel {

    public String moneyPaied;// 已经缴纳押金时，该字段表示已经缴纳的金额
    public String moneyNeed; // 未缴纳押金时，该字段表示需要缴纳的金额
    public String isDepositPay;// 是否缴纳押金，1：是，0：否
    public String isAuth; // 是否实名认证，1：是，0：否

    public boolean isDepositPay() {
        return "1".equals(isDepositPay);
    }

    public boolean isAuth() {
        return "1".equals(isAuth);
    }


    public static MyDepositModel mock() {
        MyDepositModel model = new MyDepositModel();
        model.moneyPaied = "200.00";
        model.moneyNeed = "300.00";
        model.isDepositPay = "1";
        model.isAuth = "0";
        return model;
    }

}
