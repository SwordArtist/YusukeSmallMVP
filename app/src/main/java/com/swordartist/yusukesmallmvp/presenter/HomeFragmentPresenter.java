package com.swordartist.yusukesmallmvp.presenter;

import android.content.Context;

import com.swordartist.yusukesmallmvp.model.ModelManager;
import com.swordartist.yusukesmallmvp.view.IHomeFragmentView;

import static com.swordartist.yusukesmallmvp.model.ModelManager.getAppStatusModel;

/**
 * Created by Yusuke Yanai on 2017-03-15.
 */

public class HomeFragmentPresenter implements IHomeFragmentPresenter {

    private Context mContext;
    private IHomeFragmentView homeFragmentView;

    public HomeFragmentPresenter(Context mContext, IHomeFragmentView homeFragmentView) {
        this.mContext = mContext;
        this.homeFragmentView = homeFragmentView;
        
        this.homeFragmentView.setPresenter(this);
    }

    @Override
    public void imageViewPressed() {
        getAppStatusModel().inclimentImageViewClickNumber();
        int number = ModelManager.getAppStatusModel().getImageViewClickNumber();
        homeFragmentView.showClickCountTextView(number);
    }
}
