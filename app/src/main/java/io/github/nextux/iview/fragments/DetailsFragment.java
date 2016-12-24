package io.github.nextux.iview.fragments;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.iview.activities.VideoPlayerActivity;
import io.github.nextux.iview.content.ContentManager;

public class DetailsFragment extends io.github.nextux.base.fragments.DetailsFragment {

    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected Class<?> getPlayerActivityClass() {
        return VideoPlayerActivity.class;
    }
}
