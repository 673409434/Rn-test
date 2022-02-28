package com.example.rntest.integratetest2;



import androidx.annotation.Nullable;
import com.facebook.react.ReactActivity;


public class MyReactActivityThree extends ReactActivity {
    private static final String MAIN_COMPONENT = "MyReactNativeApp";

    /** * 返回在index.js 中注册的组件名，默认使用的MyApp中封装
     * @return
     */ @Nullable
    @Override
    protected String getMainComponentName() {
        return MAIN_COMPONENT;
    }

}

