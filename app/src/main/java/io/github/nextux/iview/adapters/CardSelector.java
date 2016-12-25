package io.github.nextux.iview.adapters;

import android.support.v17.leanback.widget.Presenter;
import android.support.v17.leanback.widget.PresenterSelector;

import io.github.nextux.iview.api.CategoryModel;
import io.github.nextux.iview.api.EpisodeBaseModel;

public class CardSelector extends PresenterSelector {
    final EpisodePresenter card = new EpisodePresenter();
    final CategoryPresenter cat = new CategoryPresenter();
    final FilmPresenter film = new FilmPresenter();

    @Override
    public Presenter getPresenter(Object item) {
        if (item instanceof CategoryModel) {
            return cat;
        }
        if (item instanceof EpisodeBaseModel) {
            EpisodeBaseModel model = (EpisodeBaseModel) item;
            if (model.hasCover()) {
                return film;
            }
        }
        return card;
    }
}
