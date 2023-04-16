package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class aa4 {

    /* renamed from: d */
    public static final t94 f4041d = new t94(0, -9223372036854775807L, (s94) null);

    /* renamed from: e */
    public static final t94 f4042e = new t94(1, -9223372036854775807L, (s94) null);

    /* renamed from: f */
    public static final t94 f4043f = new t94(2, -9223372036854775807L, (s94) null);

    /* renamed from: g */
    public static final t94 f4044g = new t94(3, -9223372036854775807L, (s94) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f4045a = n13.m13639l("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public u94<? extends v94> f4046b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f4047c;

    public aa4(String str) {
    }

    /* renamed from: b */
    public static t94 m5985b(boolean z, long j) {
        return new t94(z ? 1 : 0, j, (s94) null);
    }

    /* renamed from: a */
    public final <T extends v94> long mo5204a(T t, r94<T> r94, int i) {
        Looper myLooper = Looper.myLooper();
        wu1.m19203b(myLooper);
        this.f4047c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new u94(this, myLooper, t, r94, i, elapsedRealtime).mo11198c(0);
        return elapsedRealtime;
    }

    /* renamed from: g */
    public final void mo5205g() {
        u94<? extends v94> u94 = this.f4046b;
        wu1.m19203b(u94);
        u94.mo11196a(false);
    }

    /* renamed from: h */
    public final void mo5206h() {
        this.f4047c = null;
    }

    /* renamed from: i */
    public final void mo5207i(int i) {
        IOException iOException = this.f4047c;
        if (iOException == null) {
            u94<? extends v94> u94 = this.f4046b;
            if (u94 != null) {
                u94.mo11197b(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: j */
    public final void mo5208j(x94 x94) {
        u94<? extends v94> u94 = this.f4046b;
        if (u94 != null) {
            u94.mo11196a(true);
        }
        this.f4045a.execute(new y94(x94));
        this.f4045a.shutdown();
    }

    /* renamed from: k */
    public final boolean mo5209k() {
        return this.f4047c != null;
    }

    /* renamed from: l */
    public final boolean mo5210l() {
        return this.f4046b != null;
    }
}
