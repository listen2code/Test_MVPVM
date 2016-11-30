package com.listen.test_mvpvm.http;

import android.os.Handler;

import com.listen.test_mvpvm.model.data.MyDepositModel;

public abstract class HttpTask {

    private String mPath;
    private Handler mHandler = new Handler();

    public HttpTask path(String path) {
        this.mPath = path;
        return this;
    }

    public HttpTask execute() {
        // 模拟网络请求
        new Thread(new Runnable() {
            @Override
            public void run() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        onRequestSuccess(MyDepositModel.mock());
                    }
                });
            }
        }).start();
        return this;
    }

    public abstract void onRequestSuccess(MyDepositModel model);

}
