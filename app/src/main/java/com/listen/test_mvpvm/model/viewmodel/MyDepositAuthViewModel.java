package com.listen.test_mvpvm.model.viewmodel;

import com.listen.test_mvpvm.model.data.MyDepositModel;

/**
 * @author listen
 */
public class MyDepositAuthViewModel extends MyDepositBaseViewModel {

    public MyDepositAuthViewModel(MyDepositModel model) {
        super(model);
    }

    @Override
    public String getTitle() {
        return "您已享受免押金服务";
    }

    @Override
    public boolean isTipsVisible() {
        return true;
    }

    @Override
    public String getTips() {
        return "您已完成实名认证";
    }

}
