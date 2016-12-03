package ${packageName}.model.repository;

import com.listen.test_mvpvm.http.HttpTask;
import com.listen.test_mvpvm.model.data.${activityClass}Model;
import com.listen.test_mvpvm.model.listener.On${activityClass}Listener;


public class ${activityClass}RepositoryImpl implements I${activityClass}Repository{

    private On${activityClass}Listener mOn${activityClass}Listener;

    public ${activityClass}RepositoryImpl(On${activityClass}Listener on${activityClass}Listener) {
        this.mOn${activityClass}Listener = on${activityClass}Listener;
    }

    public void method(String param) {
        new HttpTask() {
            @Override
            public void onRequestSuccess(${activityClass}Model model) {
                mOn${activityClass}Listener.on${activityClass}LoadSuccess(model);
            }
        }.path("http://xxxx/getMydeposit").execute();
    }
}