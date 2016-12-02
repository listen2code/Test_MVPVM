package com.listen.test_mvpvm.model.viewmodel;

import com.listen.test_mvpvm.model.data.TestMvpvmModel;

public class TestMvpvmViewModel implements ITestMvpvmViewModel {

    private TestMvpvmModel mModel;

    public TestMvpvmViewModel(TestMvpvmModel model) {
        mModel = model;
    }

    public TestMvpvmModel getModel() {
        return mModel;
    }

    public String getText() {
        return mModel.mTest;
    }

    public String getButtonText() {
        return mModel.mTest;
    }
}