package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

public final class yy2 extends ContentObserver {

    /* renamed from: a */
    private final Context f17938a;

    /* renamed from: b */
    private final AudioManager f17939b;

    /* renamed from: c */
    private final wy2 f17940c;

    /* renamed from: d */
    private float f17941d;

    /* renamed from: e */
    private final hz2 f17942e;

    public yy2(Handler handler, Context context, wy2 wy2, hz2 hz2, byte[] bArr) {
        super(handler);
        this.f17938a = context;
        this.f17939b = (AudioManager) context.getSystemService("audio");
        this.f17940c = wy2;
        this.f17942e = hz2;
    }

    /* renamed from: c */
    private final float m20355c() {
        int streamVolume = this.f17939b.getStreamVolume(3);
        int streamMaxVolume = this.f17939b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: d */
    private final void m20356d() {
        this.f17942e.mo8047d(this.f17941d);
    }

    /* renamed from: a */
    public final void mo12107a() {
        this.f17941d = m20355c();
        m20356d();
        this.f17938a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo12108b() {
        this.f17938a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m20355c();
        if (c != this.f17941d) {
            this.f17941d = c;
            m20356d();
        }
    }
}
