package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

final class m83 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final Handler f10770a;

    /* renamed from: b */
    final /* synthetic */ ab3 f10771b;

    public m83(ab3 ab3, Handler handler) {
        this.f10771b = ab3;
        this.f10770a = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f10770a.post(new m73(this, i));
    }
}
