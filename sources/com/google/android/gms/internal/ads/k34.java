package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

final class k34 implements x34 {

    /* renamed from: a */
    private final MediaCodec f9382a;

    /* renamed from: b */
    private final p34 f9383b;

    /* renamed from: c */
    private final n34 f9384c;

    /* renamed from: d */
    private boolean f9385d;

    /* renamed from: e */
    private int f9386e = 0;

    /* synthetic */ k34(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, j34 j34) {
        this.f9382a = mediaCodec;
        this.f9383b = new p34(handlerThread);
        this.f9384c = new n34(mediaCodec, handlerThread2);
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ void m11987m(k34 k34, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        k34.f9383b.mo9952e(k34.f9382a);
        lz2.m12992a("configureCodec");
        k34.f9382a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        lz2.m12993b();
        k34.f9384c.mo9419f();
        lz2.m12992a("startCodec");
        k34.f9382a.start();
        lz2.m12993b();
        k34.f9386e = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static String m11988n(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            str2 = "Audio";
        } else if (i == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: A */
    public final ByteBuffer mo8595A(int i) {
        return this.f9382a.getOutputBuffer(i);
    }

    /* renamed from: D */
    public final ByteBuffer mo8596D(int i) {
        return this.f9382a.getInputBuffer(i);
    }

    /* renamed from: S */
    public final void mo8597S(Bundle bundle) {
        this.f9382a.setParameters(bundle);
    }

    /* renamed from: a */
    public final void mo8598a(int i) {
        this.f9382a.setVideoScalingMode(i);
    }

    /* renamed from: b */
    public final void mo8599b(int i, int i2, int i3, long j, int i4) {
        this.f9384c.mo9416c(i, 0, i3, j, i4);
    }

    /* renamed from: c */
    public final MediaFormat mo8600c() {
        return this.f9383b.mo9950c();
    }

    /* renamed from: d */
    public final void mo8601d(int i, boolean z) {
        this.f9382a.releaseOutputBuffer(i, z);
    }

    /* renamed from: e */
    public final void mo8602e(Surface surface) {
        this.f9382a.setOutputSurface(surface);
    }

    /* renamed from: f */
    public final void mo8603f(int i, int i2, v21 v21, long j, int i3) {
        this.f9384c.mo9417d(i, 0, v21, j, 0);
    }

    /* renamed from: g */
    public final int mo8604g(MediaCodec.BufferInfo bufferInfo) {
        return this.f9383b.mo9949b(bufferInfo);
    }

    /* renamed from: h */
    public final void mo8605h() {
        this.f9384c.mo9415b();
        this.f9382a.flush();
        p34 p34 = this.f9383b;
        MediaCodec mediaCodec = this.f9382a;
        mediaCodec.getClass();
        p34.mo9951d(new f34(mediaCodec));
    }

    /* renamed from: i */
    public final void mo8606i(int i, long j) {
        this.f9382a.releaseOutputBuffer(i, j);
    }

    /* renamed from: k */
    public final void mo8607k() {
        try {
            if (this.f9386e == 1) {
                this.f9384c.mo9418e();
                this.f9383b.mo9954g();
            }
            this.f9386e = 2;
            if (!this.f9385d) {
                this.f9382a.release();
                this.f9385d = true;
            }
        } catch (Throwable th) {
            if (!this.f9385d) {
                this.f9382a.release();
                this.f9385d = true;
            }
            throw th;
        }
    }

    /* renamed from: t */
    public final boolean mo8608t() {
        return false;
    }

    public final int zza() {
        return this.f9383b.mo9948a();
    }
}
