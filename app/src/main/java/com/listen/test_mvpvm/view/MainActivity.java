package com.listen.test_mvpvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.listen.test_mvpvm.R;
import com.listen.test_mvpvm.databinding.ActivityMainBinding;
import com.listen.test_mvpvm.model.viewmodel.IMyDepositViewModel;
import com.listen.test_mvpvm.presenter.IMainPresenter;
import com.listen.test_mvpvm.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainView {

    private IMainPresenter mPresenter;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mPresenter = new MainPresenter(this);
        mBinding.setPresenter(mPresenter);
        mPresenter.requestData();
    }

    @Override
    public void updateData(IMyDepositViewModel viewModel) {
        mBinding.setData(viewModel);
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
