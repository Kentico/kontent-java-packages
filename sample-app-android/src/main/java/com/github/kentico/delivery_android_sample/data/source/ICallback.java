package com.github.kentico.delivery_android_sample.data.source;

public interface ICallback {

    void onDataNotAvailable();

    void onError(Throwable e);
}
