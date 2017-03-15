package com.swordartist.yusukesmallmvp.view;

import com.swordartist.yusukesmallmvp.presenter.IHomeFragmentPresenter;

/**
 * Created by Yusuke Yanai on 2017-03-15.
 */

public interface IHomeFragmentView {

    // All view should have a reference to its presenter.
    // It should be called in a construction of a presenter.
    void setPresenter(IHomeFragmentPresenter homeFragmentPresenter);
    
    void showClickCountTextView(int number);
}
