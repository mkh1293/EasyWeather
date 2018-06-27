package com.genesoft.easyweather.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import com.genesoft.easyweather.R;
import com.genesoft.easyweather.model.WeatherBean;
import com.genesoft.easyweather.test.GsonTest;
import com.genesoft.easyweather.util.RetrofitFactory;
import com.genesoft.easyweather.util.RxScheduler;
import com.google.gson.Gson;

import static com.genesoft.easyweather.R.id.searchView;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.drawerLayout)
    DrawerLayout mDrawerLayout;

    @BindView(searchView)
    SearchView mSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        initToolbar();

        initDrawerLayout();

//        GsonTest dataSource = new GsonTest();
//        dataSource.runTest();
//        WeatherBean data = new Gson().fromJson(dataSource.getResponse().toString(), WeatherBean.class);

        RetrofitFactory.getInstance().getRetrofit().getWeather("北京", "5d0ef9815bab88eb4c790460b7e98065")
                .compose(RxScheduler.<WeatherBean>scheduler())
                .subscribe(new Observer<WeatherBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull WeatherBean weatherBean) {
                        Log.i("test", weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getAir().getTxt());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void initToolbar(){
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initDrawerLayout(){
        ActionBarDrawerToggle mActionBarDrawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        mActionBarDrawerToggle.syncState();
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);

        mSearchView.setQueryHint("请输入城市名称");
        mSearchView.setIconified(false);
        mSearchView.onActionViewExpanded();
    }

}
