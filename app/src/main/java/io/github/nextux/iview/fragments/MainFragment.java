package io.github.nextux.iview.fragments;

import android.support.v17.leanback.widget.BrowseFrameLayout;
import android.view.View;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.iview.R;
import io.github.nextux.iview.activities.CategoryActivity;
import io.github.nextux.iview.activities.DetailsActivity;
import io.github.nextux.iview.activities.SearchActivity;
import io.github.nextux.iview.content.ContentManager;

public class MainFragment extends io.github.nextux.base.fragments.MainFragment {

    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected void setupHeader() {
        setBadgeDrawable(getResources().getDrawable(R.mipmap.logo));
        setSearchAffordanceColor(getResources().getColor(R.color.brand_color));
    }

    @Override
    protected BrowseFrameLayout getBrowseFrame(View root) {
        return (BrowseFrameLayout) root.findViewById(android.support.v17.leanback.R.id.browse_frame);
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
    protected Class<?> getCategoryActivityClass() {
        return CategoryActivity.class;
    }
}
