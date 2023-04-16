package com.google.android.gms.internal.ads;

public final class u04 {

    /* renamed from: e */
    public static final u04 f15311e = new u04(-1, -1, -1);

    /* renamed from: a */
    public final int f15312a;

    /* renamed from: b */
    public final int f15313b;

    /* renamed from: c */
    public final int f15314c;

    /* renamed from: d */
    public final int f15315d;

    public u04(int i, int i2, int i3) {
        this.f15312a = i;
        this.f15313b = i2;
        this.f15314c = i3;
        this.f15315d = n13.m13645r(i3) ? n13.m13614S(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f15312a;
        int i2 = this.f15313b;
        int i3 = this.f15314c;
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i);
        sb.append(", channelCount=");
        sb.append(i2);
        sb.append(", encoding=");
        sb.append(i3);
        sb.append(']');
        return sb.toString();
    }
}
