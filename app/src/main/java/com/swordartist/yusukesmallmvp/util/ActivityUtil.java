package com.swordartist.yusukesmallmvp.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import static android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE;

/**
 * Created by Yusuke Yanai on 2017-03-15.
 */

public class ActivityUtil {

    public static void addFragmentToActivity(FragmentManager fragmentManager, Fragment fragment, int frameId) {
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.setTransition(TRANSIT_FRAGMENT_FADE);
        ft.replace(frameId, fragment);
        ft.commit();
    }
}
