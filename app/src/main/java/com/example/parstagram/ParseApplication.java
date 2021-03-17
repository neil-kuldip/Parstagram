package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bmdUQjMUPp7arzTCklRi75KqAub94FueEAe8enLU")
                .clientKey("d3G6LWhC95RwMREjkcG8lIl3adAKGx9lhDNQWZ4H")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
