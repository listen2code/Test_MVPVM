package com.listen.test_mvpvm.model.viewmodel;

/**
 * @author listen
 */
public interface IMyDepositViewModel {

    String getTitle();

    boolean isMoneyTextColorHightLight();
    boolean isMoneyTextSizeLarge();
    boolean isMoneyTextVisible();
    String getMoney();

    boolean isTipsVisible();
    String getTips();

    boolean isButtonVisible();
    String getButtonText();
}
