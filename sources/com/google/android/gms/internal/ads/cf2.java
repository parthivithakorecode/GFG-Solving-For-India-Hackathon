package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import p054h1.C2694t;

public final class cf2 implements ij2<df2> {

    /* renamed from: a */
    private final dc3 f5411a;

    /* renamed from: b */
    private final Context f5412b;

    public cf2(dc3 dc3, Context context) {
        this.f5411a = dc3;
        this.f5412b = context;
    }

    /* renamed from: a */
    public final cc3<df2> mo5813a() {
        return this.f5411a.mo6445C(new bf2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ df2 mo6188b() {
        AudioManager audioManager = (AudioManager) this.f5412b.getSystemService("audio");
        return new df2(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), C2694t.m21610s().mo14013a(), C2694t.m21610s().mo14016e());
    }
}
