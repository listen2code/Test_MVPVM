package com.listen.test_mvpvm.view;

import com.listen.test_mvpvm.model.viewmodel.IMyDepositViewModel;

/**
 * @author listen
 * @desc 主页面view层接口
 */
public interface IMainView {
    void updateData(IMyDepositViewModel viewModel);

    void showToast(String text);
}
