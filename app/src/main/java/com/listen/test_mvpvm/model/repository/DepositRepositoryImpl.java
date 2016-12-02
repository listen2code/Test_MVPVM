package com.listen.test_mvpvm.model.repository;

import com.listen.test_mvpvm.http.HttpTask;
import com.listen.test_mvpvm.model.data.MyDepositModel;
import com.listen.test_mvpvm.model.listener.OnDepositLoadListener;

/**
 * @author listen
 * @desc 我的押金信息-数据中心
 */
public class DepositRepositoryImpl implements IDepositRepository {

    private OnDepositLoadListener mOnDepositLoadListener;

    public DepositRepositoryImpl(OnDepositLoadListener onDepositLoadListener) {
        mOnDepositLoadListener = onDepositLoadListener;
    }

    public void getDepositInfo() {
        // from server
        // from sharePreference
        // from sqlite
        new HttpTask() {
            @Override
            public void onRequestSuccess(MyDepositModel model) {
                mOnDepositLoadListener.onLoadDepositSuccess(model);
            }
        }.path("http://xxxx/getMydeposit").execute();
    }
}
