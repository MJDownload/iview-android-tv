package io.github.nextux.iview;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

import io.github.nextux.iview.IApplication;
import io.github.nextux.iview.content.ContentManager;

public class MainApplication extends Application implements IApplication {
    private static final String TAG = "MainApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
        new ContentManager(this).fetchShowList(true);
    }

    @Override
    public int getImageCardViewContentTextResId() {
        return android.support.v17.leanback.R.id.content_text;
    }

    @Override
    public int getImageCardViewInfoFieldResId() {
        return android.support.v17.leanback.R.id.info_field;
    }

    @Override
    public int getImageCardViewTitleTextResId() {
        return android.support.v17.leanback.R.id.title_text;
    }
}
