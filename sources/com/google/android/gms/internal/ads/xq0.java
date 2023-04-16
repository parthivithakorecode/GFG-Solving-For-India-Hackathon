package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
public final class xq0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f17304a;

    /* renamed from: b */
    private final wq0 f17305b;

    /* renamed from: c */
    private boolean f17306c;

    /* renamed from: d */
    private boolean f17307d;

    /* renamed from: e */
    private boolean f17308e;

    /* renamed from: f */
    private float f17309f = 1.0f;

    public xq0(Context context, wq0 wq0) {
        this.f17304a = (AudioManager) context.getSystemService("audio");
        this.f17305b = wq0;
    }

    /* renamed from: f */
    private final void m19623f() {
        boolean z = false;
        if (!this.f17307d || this.f17308e || this.f17309f <= 0.0f) {
            if (this.f17306c) {
                AudioManager audioManager = this.f17304a;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                }
                this.f17305b.mo8759m();
            }
            return;
        } else if (!this.f17306c) {
            AudioManager audioManager2 = this.f17304a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
            }
            this.f17305b.mo8759m();
        } else {
            return;
        }
        this.f17306c = z;
        this.f17305b.mo8759m();
    }

    /* renamed from: a */
    public final float mo11897a() {
        float f = this.f17308e ? 0.0f : this.f17309f;
        if (this.f17306c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo11898b() {
        this.f17307d = true;
        m19623f();
    }

    /* renamed from: c */
    public final void mo11899c() {
        this.f17307d = false;
        m19623f();
    }

    /* renamed from: d */
    public final void mo11900d(boolean z) {
        this.f17308e = z;
        m19623f();
    }

    /* renamed from: e */
    public final void mo11901e(float f) {
        this.f17309f = f;
        m19623f();
    }

    public final void onAudioFocusChange(int i) {
        this.f17306c = i > 0;
        this.f17305b.mo8759m();
    }
}
