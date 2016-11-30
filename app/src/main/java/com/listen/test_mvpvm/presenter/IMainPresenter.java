package com.listen.test_mvpvm.presenter;


import android.view.View;

public interface IMainPresenter {

    /**
     * @desc 进入页面后请求数据
     */
    void requestData();

    /**
     * @desc 点击按钮
     */
    void onButtonClickAction(View v);
}
