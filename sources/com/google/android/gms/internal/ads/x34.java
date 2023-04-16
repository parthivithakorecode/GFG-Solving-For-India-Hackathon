package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

public interface x34 {
    /* renamed from: A */
    ByteBuffer mo8595A(int i);

    /* renamed from: D */
    ByteBuffer mo8596D(int i);

    /* renamed from: S */
    void mo8597S(Bundle bundle);

    /* renamed from: a */
    void mo8598a(int i);

    /* renamed from: b */
    void mo8599b(int i, int i2, int i3, long j, int i4);

    /* renamed from: c */
    MediaFormat mo8600c();

    /* renamed from: d */
    void mo8601d(int i, boolean z);

    /* renamed from: e */
    void mo8602e(Surface surface);

    /* renamed from: f */
    void mo8603f(int i, int i2, v21 v21, long j, int i3);

    /* renamed from: g */
    int mo8604g(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: h */
    void mo8605h();

    /* renamed from: i */
    void mo8606i(int i, long j);

    /* renamed from: k */
    void mo8607k();

    /* renamed from: t */
    boolean mo8608t();

    int zza();
}
