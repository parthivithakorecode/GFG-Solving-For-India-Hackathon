package p069j1;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: j1.g */
public final class C3160g {

    /* renamed from: a */
    private boolean f20460a = false;

    /* renamed from: b */
    private float f20461b = 1.0f;

    /* renamed from: b */
    public static float m23896b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    /* renamed from: f */
    private final synchronized boolean m23897f() {
        return this.f20461b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float mo14013a() {
        if (!m23897f()) {
            return 1.0f;
        }
        return this.f20461b;
    }

    /* renamed from: c */
    public final synchronized void mo14014c(boolean z) {
        this.f20460a = z;
    }

    /* renamed from: d */
    public final synchronized void mo14015d(float f) {
        this.f20461b = f;
    }

    /* renamed from: e */
    public final synchronized boolean mo14016e() {
        return this.f20460a;
    }
}
