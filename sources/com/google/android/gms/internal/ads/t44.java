package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class t44 implements x34 {

    /* renamed from: a */
    private final MediaCodec f14712a;

    /* renamed from: b */
    private ByteBuffer[] f14713b;

    /* renamed from: c */
    private ByteBuffer[] f14714c;

    /* synthetic */ t44(MediaCodec mediaCodec, Surface surface, r44 r44) {
        this.f14712a = mediaCodec;
        if (n13.f11236a < 21) {
            this.f14713b = mediaCodec.getInputBuffers();
            this.f14714c = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: A */
    public final ByteBuffer mo8595A(int i) {
        return n13.f11236a >= 21 ? this.f14712a.getOutputBuffer(i) : ((ByteBuffer[]) n13.m13626c(this.f14714c))[i];
    }

    /* renamed from: D */
    public final ByteBuffer mo8596D(int i) {
        return n13.f11236a >= 21 ? this.f14712a.getInputBuffer(i) : ((ByteBuffer[]) n13.m13626c(this.f14713b))[i];
    }

    /* renamed from: S */
    public final void mo8597S(Bundle bundle) {
        this.f14712a.setParameters(bundle);
    }

    /* renamed from: a */
    public final void mo8598a(int i) {
        this.f14712a.setVideoScalingMode(i);
    }

    /* renamed from: b */
    public final void mo8599b(int i, int i2, int i3, long j, int i4) {
        this.f14712a.queueInputBuffer(i, 0, i3, j, i4);
    }

    /* renamed from: c */
    public final MediaFormat mo8600c() {
        return this.f14712a.getOutputFormat();
    }

    /* renamed from: d */
    public final void mo8601d(int i, boolean z) {
        this.f14712a.releaseOutputBuffer(i, z);
    }

    /* renamed from: e */
    public final void mo8602e(Surface surface) {
        this.f14712a.setOutputSurface(surface);
    }

    /* renamed from: f */
    public final void mo8603f(int i, int i2, v21 v21, long j, int i3) {
        this.f14712a.queueSecureInputBuffer(i, 0, v21.mo11368a(), j, 0);
    }

    /* renamed from: g */
    public final int mo8604g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f14712a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3) {
                if (n13.f11236a < 21) {
                    this.f14714c = this.f14712a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: h */
    public final void mo8605h() {
        this.f14712a.flush();
    }

    /* renamed from: i */
    public final void mo8606i(int i, long j) {
        this.f14712a.releaseOutputBuffer(i, j);
    }

    /* renamed from: k */
    public final void mo8607k() {
        this.f14713b = null;
        this.f14714c = null;
        this.f14712a.release();
    }

    /* renamed from: t */
    public final boolean mo8608t() {
        return false;
    }

    public final int zza() {
        return this.f14712a.dequeueInputBuffer(0);
    }
}
