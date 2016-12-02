package com.listen.test_mvpvm.model.listener;

import com.listen.test_mvpvm.model.data.TestMvpvmModel;

public interface OnTestMvpvmListener {

    void onTestMvpvmLoadSuccess(TestMvpvmModel model);

    void onTestMvpvmLoadFail(String errorMessage);
}
