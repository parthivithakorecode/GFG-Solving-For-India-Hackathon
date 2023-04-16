package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;

public final class g54 implements e64 {

    /* renamed from: a */
    private final gd1 f7275a;

    /* renamed from: b */
    private final SparseArray<e64> f7276b;

    /* renamed from: c */
    private final int[] f7277c;

    public g54(Context context, vc4 vc4) {
        Class<gd1> cls = gd1.class;
        Class<e64> cls2 = e64.class;
        k94 k94 = new k94(context);
        this.f7275a = k94;
        SparseArray<e64> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (e64) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{k94}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (e64) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{k94}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (e64) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{k94}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (e64) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new x64(k94, vc4));
        this.f7276b = sparseArray;
        this.f7277c = new int[sparseArray.size()];
        for (int i = 0; i < this.f7276b.size(); i++) {
            this.f7277c[i] = this.f7276b.keyAt(i);
        }
    }
}
