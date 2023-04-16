package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

public final class v34 {

    /* renamed from: a */
    public final z34 f15899a;

    /* renamed from: b */
    public final MediaFormat f15900b;

    /* renamed from: c */
    public final C1574c0 f15901c;

    /* renamed from: d */
    public final Surface f15902d;

    /* renamed from: e */
    public final MediaCrypto f15903e = null;

    private v34(z34 z34, MediaFormat mediaFormat, C1574c0 c0Var, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.f15899a = z34;
        this.f15900b = mediaFormat;
        this.f15901c = c0Var;
        this.f15902d = surface;
    }

    /* renamed from: a */
    public static v34 m18327a(z34 z34, MediaFormat mediaFormat, C1574c0 c0Var, MediaCrypto mediaCrypto) {
        return new v34(z34, mediaFormat, c0Var, (Surface) null, (MediaCrypto) null, 0, false);
    }

    /* renamed from: b */
    public static v34 m18328b(z34 z34, MediaFormat mediaFormat, C1574c0 c0Var, Surface surface, MediaCrypto mediaCrypto) {
        return new v34(z34, mediaFormat, c0Var, surface, (MediaCrypto) null, 0, false);
    }
}
