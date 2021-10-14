package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDk as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("uN0J4IAM98BhV3VsPGZHK4NCViGY31gQLPrEexxL")
                .clientKey("2hIRZjPUeuSuYyly10wKuZkMKwA9QjTWjZQFCxX0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
