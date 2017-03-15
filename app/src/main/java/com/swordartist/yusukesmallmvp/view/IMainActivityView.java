package com.swordartist.yusukesmallmvp.view;

import android.view.MenuItem;

import com.swordartist.yusukesmallmvp.presenter.IMainActivityPresenter;

/**
 * Created by Yusuke Yanai on 2017-03-07.
 */

public interface IMainActivityView extends IBaseView {
    // All view should have a reference to its presenter.
    // It should be called in a construction of a presenter.
    void setPresenter(IMainActivityPresenter mainActivityPresenter);

    void setActionBarTitle(String title);

    void onMainActivityNavigationItemSelected(MenuItem menuItem);
}
