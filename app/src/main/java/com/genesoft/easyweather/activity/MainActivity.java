package com.genesoft.easyweather.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

import com.genesoft.easyweather.R;
import com.genesoft.easyweather.model.WeatherBean;
import com.genesoft.easyweather.util.RetrofitFactory;
import com.genesoft.easyweather.util.RxScheduler;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.drawerLayout)
    DrawerLayout mDrawerLayout;

    @BindView(R.id.searchView)
    SearchView mSearchView;

    @BindView(R.id.refreshLayout)
    RefreshLayout mRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        initToolbar();
        initDrawerLayout();
        initRefreshLayout();

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

    private void initRefreshLayout() {
        mRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                mRefreshLayout.finishRefresh(2000);
            }
        });

        mRefreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                mRefreshLayout.finishLoadmore(2000);
            }
        });

        mRefreshLayout.setRefreshHeader(new BezierRadarHeader(this));
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initDrawerLayout() {
        ActionBarDrawerToggle mActionBarDrawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        mActionBarDrawerToggle.syncState();
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);

        mSearchView.setQueryHint("请输入城市名称");
        mSearchView.setIconified(false);
        mSearchView.onActionViewExpanded();
    }
}
