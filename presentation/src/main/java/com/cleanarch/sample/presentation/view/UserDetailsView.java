package com.cleanarch.sample.presentation.view;

import com.cleanarch.sample.presentation.model.UserModel;

/**
 * Interface representing a View in a model view presenter (MVP) pattern.
 * In this case is used as a view representing a user profile.
 */
public interface UserDetailsView extends LoadDataView {
    /**
     * Render a user in the UI.
     *
     * @param user The {@link UserModel} that will be shown.
     */
    void renderUser(UserModel user);
}
