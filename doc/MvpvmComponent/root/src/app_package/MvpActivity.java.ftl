package  ${packageName}.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ${packageName}.R;
import ${packageName}.databinding.Activity${activityClass}Binding;
import ${packageName}.model.viewmodel.I${activityClass}ViewModel;
import ${packageName}.presenter.I${activityClass}Presenter;
import ${packageName}.presenter.${activityClass}Presenter;


public class ${activityClass}Activity extends AppCompatActivity implements I${activityClass}View {

    private Activity${activityClass}Binding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.${activityLayoutName});
        mBinding.setPresenter(new ${activityClass}Presenter(this));
    }

    @Override
    public void updateView(I${activityClass}ViewModel viewModel) {
        mBinding.setData(viewModel);
    }
}
