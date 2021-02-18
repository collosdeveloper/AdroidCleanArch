package com.cleanarch.sample.presentation.internal.di.modules;

import android.content.Context;

import com.cleanarch.sample.data.cache.UserCache;
import com.cleanarch.sample.data.cache.UserCacheImpl;
import com.cleanarch.sample.data.executor.JobExecutor;
import com.cleanarch.sample.data.repository.UserDataRepository;
import com.cleanarch.sample.domain.executor.PostExecutionThread;
import com.cleanarch.sample.domain.executor.ThreadExecutor;
import com.cleanarch.sample.domain.repository.UserRepository;
import com.cleanarch.sample.presentation.AndroidApplication;
import com.cleanarch.sample.presentation.UIThread;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 */
@Module
public class ApplicationModule {
    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    @Provides
    @Singleton
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }

    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }

    @Provides
    @Singleton
    UserCache provideUserCache(UserCacheImpl userCache) {
        return userCache;
    }

    @Provides
    @Singleton
    UserRepository provideUserRepository(UserDataRepository userDataRepository) {
        return userDataRepository;
    }
}
