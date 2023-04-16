package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

final class ab3 {

    /* renamed from: a */
    private final AudioManager f4052a;

    /* renamed from: b */
    private final m83 f4053b;

    /* renamed from: c */
    private n93 f4054c;

    /* renamed from: d */
    private int f4055d;

    /* renamed from: e */
    private float f4056e = 1.0f;

    public ab3(Context context, Handler handler, n93 n93) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f4052a = audioManager;
        this.f4054c = n93;
        this.f4053b = new m83(this, handler);
        this.f4055d = 0;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m6001c(ab3 ab3, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                ab3.m6004g(3);
                return;
            }
            ab3.m6003f(0);
            ab3.m6004g(2);
        } else if (i == -1) {
            ab3.m6003f(-1);
            ab3.m6002e();
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
        } else {
            ab3.m6004g(1);
            ab3.m6003f(1);
        }
    }

    /* renamed from: e */
    private final void m6002e() {
        if (this.f4055d != 0) {
            if (n13.f11236a < 26) {
                this.f4052a.abandonAudioFocus(this.f4053b);
            }
            m6004g(0);
        }
    }

    /* renamed from: f */
    private final void m6003f(int i) {
        n93 n93 = this.f4054c;
        if (n93 != null) {
            dy3 dy3 = (dy3) n93;
            boolean Q = dy3.f5989f.mo7748Q();
            dy3.f5989f.m10113X(Q, i, gy3.m10107R(Q, i));
        }
    }

    /* renamed from: g */
    private final void m6004g(int i) {
        if (this.f4055d != i) {
            this.f4055d = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f4056e != f) {
                this.f4056e = f;
                n93 n93 = this.f4054c;
                if (n93 != null) {
                    ((dy3) n93).f5989f.m10111V();
                }
            }
        }
    }

    /* renamed from: a */
    public final float mo5217a() {
        return this.f4056e;
    }

    /* renamed from: b */
    public final int mo5218b(boolean z, int i) {
        m6002e();
        return z ? 1 : -1;
    }

    /* renamed from: d */
    public final void mo5219d() {
        this.f4054c = null;
        m6002e();
    }
}
