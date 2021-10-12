package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    // Initializes Parse SDk as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("uN0J4IAM98BhV3VsPGZHK4NCViGY31gQLPrEexxL")
                .clientKey("2hIRZjPUeuSuYyly10wKuZkMKwA9QjTWjZQFCxX0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
