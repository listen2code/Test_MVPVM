package com.listen.test_mvpvm.model.repository;

import com.listen.test_mvpvm.http.HttpTask;
import com.listen.test_mvpvm.model.data.TestMvpvmModel;
import com.listen.test_mvpvm.model.listener.OnTestMvpvmListener;


public class TestMvpvmRepositoryImpl implements ITestMvpvmRepository {

    private OnTestMvpvmListener mOnTestMvpvmListener;

    public TestMvpvmRepositoryImpl(OnTestMvpvmListener onTestMvpvmListener) {
        this.mOnTestMvpvmListener = onTestMvpvmListener;
    }

    public void method(String param) {
        new HttpTask() {
            @Override
            public void onRequestSuccess(TestMvpvmModel model) {
                mOnTestMvpvmListener.onTestMvpvmLoadSuccess(model);
            }
        }.path("http://xxxx/getMydeposit").execute();
    }
}