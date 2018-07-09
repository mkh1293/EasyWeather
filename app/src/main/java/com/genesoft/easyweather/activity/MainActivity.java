package com.genesoft.easyweather.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

import com.genesoft.easyweather.R;
import com.genesoft.easyweather.model.WeatherBean;
import com.genesoft.easyweather.util.RetrofitFactory;
import com.genesoft.easyweather.util.RxScheduler;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.lang.ref.WeakReference;


public class MainActivity extends AppCompatActivity {

    private Unbinder unbinder;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.drawerLayout)
    DrawerLayout mDrawerLayout;

    @BindView(R.id.searchView)
    SearchView mSearchView;

    @BindView(R.id.refreshLayout)
    RefreshLayout mRefreshLayout;

    private boolean isExit = false;

    private static class ExitHandler extends Handler {

        private final WeakReference<MainActivity> activityReference;

        public ExitHandler(MainActivity activity) {
            activityReference = new WeakReference<MainActivity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            MainActivity mainActivityRef = activityReference.get();
            if(mainActivityRef != null) {
                mainActivityRef.isExit = false;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unbinder = ButterKnife.bind(this);

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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            if(!isExit) {
                isExit = true;
                Toast.makeText(getApplicationContext(), "再按一次退出", Toast.LENGTH_SHORT).show();
                new ExitHandler(this).sendEmptyMessageDelayed(0, 2000);
            }else {
                System.exit(0);
            }
            return false;
        }else {
            return super.onKeyDown(keyCode, event);
        }
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

        mRefreshLayout.setRefreshHeader(new ClassicsHeader(this));
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
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
