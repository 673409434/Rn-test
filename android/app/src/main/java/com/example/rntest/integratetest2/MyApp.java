package com.example.rntest.integratetest2;

import android.app.Application;

import com.example.rntest.BuildConfig;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

public class MyApp extends Application implements ReactApplication {


    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {

        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected String getJSMainModuleName() {
            return "index";
        }

        @Override
        protected List getPackages() {
            return Arrays.<ReactPackage>asList(new MainReactPackage());
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }


    private final ReactNativeHost mReactNativeHost2 = new ReactNativeHost(this) {

        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected String getJSMainModuleName() {
            return "index1";
        }

        protected String getBundleAssetName() {
            return "index.android.bundle";
        }

        @Override
        protected List getPackages() {
            return Arrays.<ReactPackage>asList(new MainReactPackage());
        }
    };

    public ReactNativeHost getReactNativeHost2() {
        return mReactNativeHost2;
    }

}