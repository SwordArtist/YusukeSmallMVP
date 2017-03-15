package com.swordartist.yusukesmallmvp.presenter;

import android.content.Context;
import android.view.MenuItem;

import com.swordartist.yusukesmallmvp.view.IMainActivityView;
import com.swordartist.yusukesmallmvp.R;
import com.swordartist.yusukesmallmvp.YusukeApp;

/**
 * Created by Yusuke Yanai on 2017-03-07.
 */

public class MainActivityPresenter implements IMainActivityPresenter {
    
    private Context mContext;
    private IMainActivityView mMainActivityView;

    public MainActivityPresenter(Context context, IMainActivityView mainActivityView) {
        this.mContext = context;
        this.mMainActivityView = mainActivityView;
        mMainActivityView.setPresenter(this);
    }

    @Override
    public void onNavigationSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                mMainActivityView.setActionBarTitle(YusukeApp.getContext().getString(R.string.title_home));
                break;
            case R.id.navigation_dashboard:
                mMainActivityView.setActionBarTitle(YusukeApp.getContext().getString(R.string.title_dashboard));
                break;
            case R.id.navigation_notifications:
                mMainActivityView.setActionBarTitle(YusukeApp.getContext().getString(R.string.title_notifications));
                break;
        }

    }

}
