package com.swordartist.yusukesmallmvp.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.swordartist.yusukesmallmvp.R;
import com.swordartist.yusukesmallmvp.presenter.IMainActivityPresenter;
import com.swordartist.yusukesmallmvp.presenter.MainActivityPresenter;
import com.swordartist.yusukesmallmvp.util.ActivityUtil;

public class MainActivity extends AppCompatActivity implements IMainActivityView {

    private ActionBar mActionBar;
    private IMainActivityPresenter mainActivityPresenter;


    @Override
    public void setPresenter(IMainActivityPresenter mainActivityPresenter) {
        this.mainActivityPresenter = mainActivityPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create presenter, 
        // the created presenter is assigned to "mainActivityPresenter" in MainActivityPresenter's construction
        new MainActivityPresenter(this, this);

        mActionBar = getSupportActionBar();

        mActionBar.setTitle(getText(R.string.title_home));
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                onMainActivityNavigationItemSelected(item);
                return true;
            }

        });

        // create HomeFragment
        HomeFragment homefragment = HomeFragment.newInstance();
        ActivityUtil.addFragmentToActivity(getSupportFragmentManager(), homefragment, R.id.activity_main_content);

        if (savedInstanceState != null) {
            savedInstanceState.keySet();
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    @Override
    public void setActionBarTitle(String title) {
        mActionBar.setTitle(title);
    }

    @Override
    public void onMainActivityNavigationItemSelected(MenuItem menuItem) {
        mainActivityPresenter.onNavigationSelected(menuItem);
    }

}
