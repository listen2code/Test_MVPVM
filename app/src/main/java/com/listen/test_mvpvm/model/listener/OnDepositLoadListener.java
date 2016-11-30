package com.listen.test_mvpvm.model.listener;

import com.listen.test_mvpvm.model.data.MyDepositModel;

/**
 * @author listen
 * @desc
 */
public interface OnDepositLoadListener {

    void onLoadDepositSuccess(MyDepositModel model);
}
