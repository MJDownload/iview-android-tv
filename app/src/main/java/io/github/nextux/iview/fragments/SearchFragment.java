package io.github.nextux.iview.fragments;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.iview.activities.DetailsActivity;
import io.github.nextux.iview.content.ContentManager;

public class SearchFragment extends io.github.nextux.base.fragments.SearchFragment {

    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected Class<?> getDetailsActivityClass() {
        return DetailsActivity.class;
    }
}