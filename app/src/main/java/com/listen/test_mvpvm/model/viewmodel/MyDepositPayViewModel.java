package com.listen.test_mvpvm.model.viewmodel;

import com.listen.test_mvpvm.model.data.MyDepositModel;

/**
 * @author listen
 */
public class MyDepositPayViewModel extends MyDepositBaseViewModel {

    public MyDepositPayViewModel(MyDepositModel model) {
        super(model);
    }

    @Override
    public String getTitle() {
        return "您当前押金";
    }

    @Override
    public String getMoney() {
        return "¥ " + getModel().moneyPaied;
    }

    @Override
    public boolean isMoneyTextVisible() {
        return true;
    }

    @Override
    public boolean isMoneyTextColorHightLight() {
        return true;
    }

    @Override
    public boolean isMoneyTextSizeLarge() {
        return true;
    }

    @Override
    public boolean isButtonVisible() {
        return true;
    }

    @Override
    public String getButtonText() {
        return "退还押金";
    }
}
