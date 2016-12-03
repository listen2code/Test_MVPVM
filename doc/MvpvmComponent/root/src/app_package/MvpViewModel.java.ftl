package ${packageName}.model.viewmodel;

import ${packageName}.model.data.${activityClass}Model;

public class ${activityClass}ViewModel implements I${activityClass}ViewModel {

    private ${activityClass}Model mModel;

    public ${activityClass}ViewModel(${activityClass}Model model) {
        mModel = model;
    }

    public ${activityClass}Model getModel() {
        return mModel;
    }

    public String getText() {
    	return mModel.mTest;
    }

    public String getButtonText() {
    	return mModel.mTest;
    }
}