package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

final class x14 {

    /* renamed from: a */
    public final C1574c0 f16983a;

    /* renamed from: b */
    public final int f16984b;

    /* renamed from: c */
    public final int f16985c = 0;

    /* renamed from: d */
    public final int f16986d;

    /* renamed from: e */
    public final int f16987e;

    /* renamed from: f */
    public final int f16988f;

    /* renamed from: g */
    public final int f16989g;

    /* renamed from: h */
    public final int f16990h;

    /* renamed from: i */
    public final w04[] f16991i;

    public x14(C1574c0 c0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, w04[] w04Arr) {
        this.f16983a = c0Var;
        this.f16984b = i;
        boolean z2 = false;
        this.f16986d = i3;
        this.f16987e = i4;
        this.f16988f = i5;
        this.f16989g = i6;
        this.f16991i = w04Arr;
        int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
        wu1.m19207f(minBufferSize != -2 ? true : z2);
        this.f16990h = n13.m13607L(minBufferSize * 4, ((int) mo11757a(250000)) * i3, Math.max(minBufferSize, ((int) mo11757a(750000)) * i3));
    }

    /* renamed from: a */
    public final long mo11757a(long j) {
        return (j * ((long) this.f16987e)) / 1000000;
    }

    /* renamed from: b */
    public final long mo11758b(long j) {
        return (j * 1000000) / ((long) this.f16987e);
    }

    /* renamed from: c */
    public final AudioTrack mo11759c(boolean z, ef3 ef3, int i) {
        AudioTrack audioTrack;
        try {
            int i2 = n13.f11236a;
            if (i2 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(ef3.mo6942a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f16987e).setChannelMask(this.f16988f).setEncoding(this.f16989g).build()).setTransferMode(1).setBufferSizeInBytes(this.f16990h).setSessionId(i).setOffloadedPlayback(false).build();
            } else if (i2 >= 21) {
                audioTrack = new AudioTrack(ef3.mo6942a(), new AudioFormat.Builder().setSampleRate(this.f16987e).setChannelMask(this.f16988f).setEncoding(this.f16989g).build(), this.f16990h, 1, i);
            } else {
                int i3 = ef3.f6202a;
                audioTrack = i == 0 ? new AudioTrack(3, this.f16987e, this.f16988f, this.f16989g, this.f16990h, 1) : new AudioTrack(3, this.f16987e, this.f16988f, this.f16989g, this.f16990h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new k14(state, this.f16987e, this.f16988f, this.f16990h, this.f16983a, false, (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new k14(0, this.f16987e, this.f16988f, this.f16990h, this.f16983a, false, e);
        }
    }
}
