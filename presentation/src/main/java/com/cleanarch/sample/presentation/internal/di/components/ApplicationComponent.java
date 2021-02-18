package com.cleanarch.sample.presentation.internal.di.components;

import android.content.Context;

import com.cleanarch.sample.domain.executor.PostExecutionThread;
import com.cleanarch.sample.domain.executor.ThreadExecutor;
import com.cleanarch.sample.domain.repository.UserRepository;
import com.cleanarch.sample.presentation.internal.di.modules.ApplicationModule;
import com.cleanarch.sample.presentation.view.activity.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    //Exposed to sub-graphs.
    Context context();

    ThreadExecutor threadExecutor();

    PostExecutionThread postExecutionThread();

    UserRepository userRepository();
}
