package ${packageName}.presenter;

import android.view.View;

import ${packageName}.model.data.${activityClass}Model;
import ${packageName}.model.listener.On${activityClass}Listener;
import ${packageName}.model.viewmodel.${activityClass}ViewModel;
import ${packageName}.model.repository.I${activityClass}Repository;
import ${packageName}.model.repository.${activityClass}RepositoryImpl;
import ${packageName}.view.I${activityClass}View;

public class ${activityClass}Presenter implements On${activityClass}Listener, I${activityClass}Presenter {

    private I${activityClass}View mI${activityClass}View;
    private I${activityClass}Repository m${activityClass}Repository;

    public ${activityClass}Presenter(I${activityClass}View i${activityClass}View) {
        this.mI${activityClass}View = i${activityClass}View;
        this.m${activityClass}Repository = new ${activityClass}RepositoryImpl(this);
    }

    public void onClickAction(View v) {
        m${activityClass}Repository.method("");
    }

    public void on${activityClass}LoadSuccess(${activityClass}Model data) {
        mI${activityClass}View.updateView(new ${activityClass}ViewModel(data));
    }

    public void on${activityClass}LoadFail(String errorMessage) {
    }

}
