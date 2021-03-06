package com.test.onepluswatermark.edit;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

import com.test.onepluswatermark.BasePresenter;
import com.test.onepluswatermark.BaseView;
import com.test.onepluswatermark.data.ImageInfo;

/**
 * Created by zhaolin on 17-6-11.
 */

public interface EditContract {

    interface Presenter extends BasePresenter {

        void saveImage(Context context);

        void showImage(ImageInfo imageInfo);

        void showImage(String path);
    }

    interface View extends BaseView<Presenter> {

        void showImage(Uri uri);

        void showImage(String path);

        void showSaveTip();

        void showSaveSuccess(String path);

        void showNotEditTip();

        Bitmap getBitmap();
    }
}
