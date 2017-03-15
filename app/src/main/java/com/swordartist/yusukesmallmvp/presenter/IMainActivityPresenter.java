package com.swordartist.yusukesmallmvp.presenter;

import android.view.MenuItem;

/**
 * Created by Yusuke Yanai on 2017-03-07.
 */

public interface IMainActivityPresenter extends IBasePresenter {
    
    void onNavigationSelected(MenuItem item);
    
}
