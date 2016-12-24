package io.github.nextux.iview.content;

import android.database.Cursor;

import io.github.nextux.base.content.SearchProviderBase;

public class SearchContentProvider extends SearchProviderBase {

    public static String AUTHORITY = "io.github.nextux.iview.search";

    @Override
    protected String getAuthority() {
        return AUTHORITY;
    }

    @Override
    protected Cursor getSuggestions(String query) {
        return ContentManager.getInstance().searchShowsCursor(query);
    }
}
