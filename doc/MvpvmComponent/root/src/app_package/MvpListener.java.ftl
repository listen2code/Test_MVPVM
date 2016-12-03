package ${packageName}.model.listener;

import ${packageName}.model.data.${activityClass}Model;

public interface On${activityClass}Listener {

    void on${activityClass}LoadSuccess(${activityClass}Model model);

    void on${activityClass}LoadFail(String errorMessage);
}
