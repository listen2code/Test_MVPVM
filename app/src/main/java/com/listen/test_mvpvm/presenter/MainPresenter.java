package com.listen.test_mvpvm.presenter;

import android.view.View;

import com.listen.test_mvpvm.model.data.MyDepositModel;
import com.listen.test_mvpvm.model.listener.OnDepositLoadListener;
import com.listen.test_mvpvm.model.repository.DepositRepositoryImpl;
import com.listen.test_mvpvm.model.repository.IDepositRepository;
import com.listen.test_mvpvm.model.viewmodel.MyDepositAuthViewModel;
import com.listen.test_mvpvm.model.viewmodel.MyDepositNoPayViewModel;
import com.listen.test_mvpvm.model.viewmodel.MyDepositPayViewModel;
import com.listen.test_mvpvm.view.IMainView;

/**
 * @author listen
 * @desc 主页面的presenter
 */
public class MainPresenter implements IMainPresenter, OnDepositLoadListener {

    private IMainView mIMainView;
    private IDepositRepository mIDepositRepositoryImpl;
    private MyDepositModel mModel;

    public MainPresenter(IMainView iMainView) {
        mIMainView = iMainView;
        mIDepositRepositoryImpl = new DepositRepositoryImpl(this);
    }

    @Override
    public void requestData() {
        mIDepositRepositoryImpl.getDepositInfo();
    }

    @Override
    public void onLoadDepositSuccess(MyDepositModel model) {
        mModel = model;
        if (mModel.isAuth()) {
            mIMainView.updateData(new MyDepositAuthViewModel(model));
        } else if (mModel.isDepositPay()) {
            mIMainView.updateData(new MyDepositPayViewModel(model));
        } else {
            mIMainView.updateData(new MyDepositNoPayViewModel(model));
        }
    }

    @Override
    public void onButtonClickAction(View v) {
        if (mModel.isDepositPay()) {
            mIMainView.showToast("退还押金");
        } else {
            mIMainView.showToast("缴纳押金");
        }
    }
}
