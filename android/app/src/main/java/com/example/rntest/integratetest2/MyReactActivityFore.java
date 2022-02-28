package com.example.rntest.integratetest2;



import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactNativeHost;


public class MyReactActivityFore extends ReactActivity {
    private static final String MAIN_COMPONENT = "MyReactNativeApp";

    /** * 返回在index.js 中注册的组件名
     * @return
     */ @Nullable
    @Override
    protected String getMainComponentName() {
        return MAIN_COMPONENT;
    }

    /**
     * 通过重写createReactActivityDelegate方式可以加载不同bundle下面的不同页面组件
     * @return
     */
    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
         //自定义加载新的bundle
        return new ReactActivityDelegate(this, getMainComponentName()){

            protected ReactNativeHost getReactNativeHost() {
                return ((MyApp)this.getPlainActivity().getApplication()).getReactNativeHost2();
            }

            @Nullable
            @Override
            protected Bundle getLaunchOptions() {
                return generateBundle();
            }
        };
    }

    private Bundle generateBundle(){
        Intent intent = getIntent();
        if(intent != null){
            return intent.getExtras();
        }else{
            return  null;
        }
    }

}

