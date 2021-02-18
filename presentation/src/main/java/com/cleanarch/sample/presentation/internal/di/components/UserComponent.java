package com.cleanarch.sample.presentation.internal.di.components;

import com.cleanarch.sample.presentation.internal.di.PerActivity;
import com.cleanarch.sample.presentation.internal.di.modules.ActivityModule;
import com.cleanarch.sample.presentation.internal.di.modules.UserModule;
import com.cleanarch.sample.presentation.view.fragment.UserDetailsFragment;
import com.cleanarch.sample.presentation.view.fragment.UserListFragment;

import dagger.Component;

/**
 * A scope {@link com.cleanarch.sample.presentation.internal.di.PerActivity} component.
 * Injects user specific Fragments.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, UserModule.class})
public interface UserComponent extends ActivityComponent {
    void inject(UserListFragment userListFragment);

    void inject(UserDetailsFragment userDetailsFragment);
}
