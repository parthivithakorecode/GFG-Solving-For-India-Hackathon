package p101n5;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import kotlin.jvm.internal.C3357i;

/* renamed from: n5.a */
public final class C3785a {

    /* renamed from: a */
    private final boolean f21693a;

    /* renamed from: b */
    private final boolean f21694b;

    /* renamed from: c */
    private final int f21695c;

    /* renamed from: d */
    private final int f21696d;

    /* renamed from: e */
    private final Integer f21697e;

    @SuppressLint({"InlinedApi"})
    public C3785a() {
        this(false, false, 2, 1, (Integer) null);
    }

    public C3785a(boolean z, boolean z2, int i, int i2, Integer num) {
        this.f21693a = z;
        this.f21694b = z2;
        this.f21695c = i;
        this.f21696d = i2;
        this.f21697e = num;
    }

    /* renamed from: c */
    public static /* synthetic */ C3785a m25612c(C3785a aVar, boolean z, boolean z2, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = aVar.f21693a;
        }
        if ((i3 & 2) != 0) {
            z2 = aVar.f21694b;
        }
        boolean z3 = z2;
        if ((i3 & 4) != 0) {
            i = aVar.f21695c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = aVar.f21696d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            num = aVar.f21697e;
        }
        return aVar.mo15021b(z, z3, i4, i5, num);
    }

    /* renamed from: f */
    private final int m25613f() {
        int i = this.f21696d;
        if (i != 2) {
            return i != 6 ? 3 : 2;
        }
        return 0;
    }

    /* renamed from: a */
    public final AudioAttributes mo15020a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f21696d).setContentType(this.f21695c).build();
        C3357i.m24507d(build, "Builder()\n            .s…ype)\n            .build()");
        return build;
    }

    /* renamed from: b */
    public final C3785a mo15021b(boolean z, boolean z2, int i, int i2, Integer num) {
        return new C3785a(z, z2, i, i2, num);
    }

    /* renamed from: d */
    public final Integer mo15022d() {
        return this.f21697e;
    }

    /* renamed from: e */
    public final boolean mo15023e() {
        return this.f21694b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3785a)) {
            return false;
        }
        C3785a aVar = (C3785a) obj;
        return this.f21693a == aVar.f21693a && this.f21694b == aVar.f21694b && this.f21695c == aVar.f21695c && this.f21696d == aVar.f21696d && C3357i.m24504a(this.f21697e, aVar.f21697e);
    }

    /* renamed from: g */
    public final boolean mo15025g() {
        return this.f21693a;
    }

    /* renamed from: h */
    public final void mo15026h(MediaPlayer mediaPlayer) {
        C3357i.m24508e(mediaPlayer, "player");
        if (Build.VERSION.SDK_INT >= 21) {
            mediaPlayer.setAudioAttributes(mo15020a());
        } else {
            mediaPlayer.setAudioStreamType(m25613f());
        }
    }

    public int hashCode() {
        boolean z = this.f21693a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f21694b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (((((i + (z2 ? 1 : 0)) * 31) + this.f21695c) * 31) + this.f21696d) * 31;
        Integer num = this.f21697e;
        return i2 + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f21693a + ", stayAwake=" + this.f21694b + ", contentType=" + this.f21695c + ", usageType=" + this.f21696d + ", audioFocus=" + this.f21697e + ')';
    }
}
