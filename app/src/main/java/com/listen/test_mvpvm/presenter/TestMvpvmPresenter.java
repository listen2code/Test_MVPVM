package com.listen.test_mvpvm.presenter;

import android.view.View;

import com.listen.test_mvpvm.model.data.TestMvpvmModel;
import com.listen.test_mvpvm.model.listener.OnTestMvpvmListener;
import com.listen.test_mvpvm.model.viewmodel.TestMvpvmViewModel;
import com.listen.test_mvpvm.model.repository.ITestMvpvmRepository;
import com.listen.test_mvpvm.model.repository.TestMvpvmRepositoryImpl;
import com.listen.test_mvpvm.view.ITestMvpvmView;

public class TestMvpvmPresenter implements OnTestMvpvmListener, ITestMvpvmPresenter {

    private ITestMvpvmView mITestMvpvmView;
    private ITestMvpvmRepository mTestMvpvmRepository;

    public TestMvpvmPresenter(ITestMvpvmView iTestMvpvmView) {
        this.mITestMvpvmView = iTestMvpvmView;
        this.mTestMvpvmRepository = new TestMvpvmRepositoryImpl(this);
    }

    public void onClickAction(View v) {
        mTestMvpvmRepository.method("");
    }

    public void onTestMvpvmLoadSuccess(TestMvpvmModel data) {
        mITestMvpvmView.updateView(new TestMvpvmViewModel(data));
    }

    public void onTestMvpvmLoadFail(String errorMessage) {
    }

}
