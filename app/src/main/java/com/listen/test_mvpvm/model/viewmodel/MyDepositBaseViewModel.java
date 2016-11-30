package com.listen.test_mvpvm.model.viewmodel;

import com.listen.test_mvpvm.model.data.MyDepositModel;

/**
 * @author listen
 */
public abstract class MyDepositBaseViewModel implements IMyDepositViewModel {

    private MyDepositModel mModel;

    public MyDepositBaseViewModel(MyDepositModel model) {
        mModel = model;
    }

    public MyDepositModel getModel() {
        return mModel;
    }

    @Override
    public String getTitle() {
        return "";
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
    public boolean isMoneyTextVisible() {
        return false;
    }

    @Override
    public String getMoney() {
        return "";
    }

    @Override
    public boolean isTipsVisible() {
        return false;
    }

    @Override
    public String getTips() {
        return "";
    }

    @Override
    public boolean isButtonVisible() {
        return false;
    }

    @Override
    public String getButtonText() {
        return "";
    }
}
