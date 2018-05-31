package com.example.lenovo.lijingqiatext.component;



import com.example.lenovo.lijingqiatext.MainActivity;
import com.example.lenovo.lijingqiatext.module.HttpModule;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(MainActivity mainActivity);
}
