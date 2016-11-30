package com.listen.test_mvpvm.model.viewmodel;

import com.listen.test_mvpvm.model.data.MyDepositModel;

/**
 * @author listen
 */
public class MyDepositNoPayViewModel extends MyDepositBaseViewModel {

    public MyDepositNoPayViewModel(MyDepositModel model) {
        super(model);
    }

    @Override
    public String getTitle() {
        return "您需要缴纳押金";
    }

    @Override
    public String getMoney() {
        return "¥ " + getModel().moneyNeed;
    }

    @Override
    public boolean isMoneyTextVisible() {
        return true;
    }

    @Override
    public boolean isMoneyTextColorHightLight() {
        return false;
    }

    @Override
    public boolean isMoneyTextSizeLarge() {
        return false;
    }

    @Override
    public boolean isButtonVisible() {
        return true;
    }

    @Override
    public boolean isTipsVisible() {
        return true;
    }

    @Override
    public String getTips() {
        return "押金随时可退";
    }

    @Override
    public String getButtonText() {
        return "缴纳押金";
    }
}
