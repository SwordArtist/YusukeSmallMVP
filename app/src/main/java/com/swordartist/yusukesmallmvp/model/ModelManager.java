package com.swordartist.yusukesmallmvp.model;

/**
 * Created by Yusuke Yanai on 2017-03-15.
 */

public class ModelManager {

    static AppStatusModel appStatusModel = new AppStatusModel();

    public static AppStatusModel getAppStatusModel() {
        return appStatusModel;
    }

    public static void setAppStatusModel(AppStatusModel appStatusModel) {
        ModelManager.appStatusModel = appStatusModel;
    }

}
