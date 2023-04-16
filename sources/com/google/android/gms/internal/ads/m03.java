package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class m03 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f10228a = "ExoPlayer:Loader:ProgressiveMediaPeriod";

    public /* synthetic */ m03(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f10228a);
    }
}
