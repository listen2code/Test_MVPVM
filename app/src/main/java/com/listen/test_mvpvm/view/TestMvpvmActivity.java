package com.listen.test_mvpvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.listen.test_mvpvm.R;
import com.listen.test_mvpvm.databinding.ActivityTestMvpvmBinding;
import com.listen.test_mvpvm.model.viewmodel.ITestMvpvmViewModel;
import com.listen.test_mvpvm.presenter.TestMvpvmPresenter;


public class TestMvpvmActivity extends AppCompatActivity implements ITestMvpvmView {

    private ActivityTestMvpvmBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_test_mvpvm);
        mBinding.setPresenter(new TestMvpvmPresenter(this));
    }

    @Override
    public void updateView(ITestMvpvmViewModel viewModel) {
        mBinding.setData(viewModel);
    }
}
