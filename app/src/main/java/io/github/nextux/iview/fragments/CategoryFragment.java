package io.github.nextux.iview.fragments;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.iview.R;
import io.github.nextux.iview.activities.DetailsActivity;
import io.github.nextux.iview.activities.SearchActivity;
import io.github.nextux.iview.content.ContentManager;

public class CategoryFragment extends io.github.nextux.base.fragments.CategoryFragment {
    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected Class<?> getSearchActivityClass() {
        return SearchActivity.class;
    }

    @Override
    protected Class<?> getDetailsActivityClass() {
        return DetailsActivity.class;
    }

    @Override
    protected void setupHeader() {
        setSearchAffordanceColor(getResources().getColor(R.color.brand_color));
    }
}
