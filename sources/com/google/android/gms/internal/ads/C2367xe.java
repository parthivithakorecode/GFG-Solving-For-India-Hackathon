package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xe */
public final class C2367xe implements Parcelable {
    public static final Parcelable.Creator<C2367xe> CREATOR = new C2330we();

    /* renamed from: A */
    public final int f17152A;

    /* renamed from: B */
    public final long f17153B;

    /* renamed from: C */
    public final int f17154C;

    /* renamed from: D */
    public final String f17155D;

    /* renamed from: E */
    public final int f17156E;

    /* renamed from: F */
    private int f17157F;

    /* renamed from: f */
    public final String f17158f;

    /* renamed from: g */
    public final int f17159g;

    /* renamed from: h */
    public final String f17160h;

    /* renamed from: i */
    public final C1964mj f17161i;

    /* renamed from: j */
    public final String f17162j;

    /* renamed from: k */
    public final String f17163k;

    /* renamed from: l */
    public final int f17164l;

    /* renamed from: m */
    public final List<byte[]> f17165m;

    /* renamed from: n */
    public final C2406yg f17166n;

    /* renamed from: o */
    public final int f17167o;

    /* renamed from: p */
    public final int f17168p;

    /* renamed from: q */
    public final float f17169q;

    /* renamed from: r */
    public final int f17170r;

    /* renamed from: s */
    public final float f17171s;

    /* renamed from: t */
    public final int f17172t;

    /* renamed from: u */
    public final byte[] f17173u;

    /* renamed from: v */
    public final C1597cn f17174v;

    /* renamed from: w */
    public final int f17175w;

    /* renamed from: x */
    public final int f17176x;

    /* renamed from: y */
    public final int f17177y;

    /* renamed from: z */
    public final int f17178z;

    C2367xe(Parcel parcel) {
        this.f17158f = parcel.readString();
        this.f17162j = parcel.readString();
        this.f17163k = parcel.readString();
        this.f17160h = parcel.readString();
        this.f17159g = parcel.readInt();
        this.f17164l = parcel.readInt();
        this.f17167o = parcel.readInt();
        this.f17168p = parcel.readInt();
        this.f17169q = parcel.readFloat();
        this.f17170r = parcel.readInt();
        this.f17171s = parcel.readFloat();
        this.f17173u = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f17172t = parcel.readInt();
        this.f17174v = (C1597cn) parcel.readParcelable(C1597cn.class.getClassLoader());
        this.f17175w = parcel.readInt();
        this.f17176x = parcel.readInt();
        this.f17177y = parcel.readInt();
        this.f17178z = parcel.readInt();
        this.f17152A = parcel.readInt();
        this.f17154C = parcel.readInt();
        this.f17155D = parcel.readString();
        this.f17156E = parcel.readInt();
        this.f17153B = parcel.readLong();
        int readInt = parcel.readInt();
        this.f17165m = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f17165m.add(parcel.createByteArray());
        }
        this.f17166n = (C2406yg) parcel.readParcelable(C2406yg.class.getClassLoader());
        this.f17161i = (C1964mj) parcel.readParcelable(C1964mj.class.getClassLoader());
    }

    C2367xe(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C1597cn cnVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, C2406yg ygVar, C1964mj mjVar) {
        this.f17158f = str;
        this.f17162j = str2;
        this.f17163k = str3;
        this.f17160h = str4;
        this.f17159g = i;
        this.f17164l = i2;
        this.f17167o = i3;
        this.f17168p = i4;
        this.f17169q = f;
        this.f17170r = i5;
        this.f17171s = f2;
        this.f17173u = bArr;
        this.f17172t = i6;
        this.f17174v = cnVar;
        this.f17175w = i7;
        this.f17176x = i8;
        this.f17177y = i9;
        this.f17178z = i10;
        this.f17152A = i11;
        this.f17154C = i12;
        this.f17155D = str5;
        this.f17156E = i13;
        this.f17153B = j;
        this.f17165m = list == null ? Collections.emptyList() : list;
        this.f17166n = ygVar;
        this.f17161i = mjVar;
    }

    /* renamed from: h */
    public static C2367xe m19465h(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, C2406yg ygVar, int i5, String str4) {
        return m19466i(str, str2, (String) null, -1, -1, i3, i4, -1, -1, -1, (List<byte[]>) null, ygVar, 0, str4, (C1964mj) null);
    }

    /* renamed from: i */
    public static C2367xe m19466i(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, C2406yg ygVar, int i8, String str4, C1964mj mjVar) {
        return new C2367xe(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C1597cn) null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, ygVar, (C1964mj) null);
    }

    /* renamed from: j */
    public static C2367xe m19467j(String str, String str2, String str3, int i, List<byte[]> list, String str4, C2406yg ygVar) {
        return new C2367xe(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C1597cn) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, ygVar, (C1964mj) null);
    }

    /* renamed from: k */
    public static C2367xe m19468k(String str, String str2, String str3, int i, C2406yg ygVar) {
        return new C2367xe(str, (String) null, "application/x-camera-motion", (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C1597cn) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, ygVar, (C1964mj) null);
    }

    /* renamed from: l */
    public static C2367xe m19469l(String str, String str2, String str3, int i, int i2, String str4, int i3, C2406yg ygVar, long j, List<byte[]> list) {
        return new C2367xe(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C1597cn) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, ygVar, (C1964mj) null);
    }

    /* renamed from: m */
    public static C2367xe m19470m(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, C1597cn cnVar, C2406yg ygVar) {
        return new C2367xe(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, cnVar, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, ygVar, (C1964mj) null);
    }

    @TargetApi(16)
    /* renamed from: n */
    private static void m19471n(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: b */
    public final int mo11806b() {
        int i;
        int i2 = this.f17167o;
        if (i2 == -1 || (i = this.f17168p) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: c */
    public final MediaFormat mo11807c() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f17163k);
        String str = this.f17155D;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m19471n(mediaFormat, "max-input-size", this.f17164l);
        m19471n(mediaFormat, "width", this.f17167o);
        m19471n(mediaFormat, "height", this.f17168p);
        float f = this.f17169q;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m19471n(mediaFormat, "rotation-degrees", this.f17170r);
        m19471n(mediaFormat, "channel-count", this.f17175w);
        m19471n(mediaFormat, "sample-rate", this.f17176x);
        m19471n(mediaFormat, "encoder-delay", this.f17178z);
        m19471n(mediaFormat, "encoder-padding", this.f17152A);
        for (int i = 0; i < this.f17165m.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f17165m.get(i)));
        }
        C1597cn cnVar = this.f17174v;
        if (cnVar != null) {
            m19471n(mediaFormat, "color-transfer", cnVar.f5451h);
            m19471n(mediaFormat, "color-standard", cnVar.f5449f);
            m19471n(mediaFormat, "color-range", cnVar.f5450g);
            byte[] bArr = cnVar.f5452i;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: d */
    public final C2367xe mo11808d(C2406yg ygVar) {
        String str = this.f17158f;
        return new C2367xe(str, this.f17162j, this.f17163k, this.f17160h, this.f17159g, this.f17164l, this.f17167o, this.f17168p, this.f17169q, this.f17170r, this.f17171s, this.f17173u, this.f17172t, this.f17174v, this.f17175w, this.f17176x, this.f17177y, this.f17178z, this.f17152A, this.f17154C, this.f17155D, this.f17156E, this.f17153B, this.f17165m, ygVar, this.f17161i);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C2367xe mo11810e(int i, int i2) {
        String str = this.f17158f;
        return new C2367xe(str, this.f17162j, this.f17163k, this.f17160h, this.f17159g, this.f17164l, this.f17167o, this.f17168p, this.f17169q, this.f17170r, this.f17171s, this.f17173u, this.f17172t, this.f17174v, this.f17175w, this.f17176x, this.f17177y, i, i2, this.f17154C, this.f17155D, this.f17156E, this.f17153B, this.f17165m, this.f17166n, this.f17161i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2367xe.class == obj.getClass()) {
            C2367xe xeVar = (C2367xe) obj;
            if (this.f17159g == xeVar.f17159g && this.f17164l == xeVar.f17164l && this.f17167o == xeVar.f17167o && this.f17168p == xeVar.f17168p && this.f17169q == xeVar.f17169q && this.f17170r == xeVar.f17170r && this.f17171s == xeVar.f17171s && this.f17172t == xeVar.f17172t && this.f17175w == xeVar.f17175w && this.f17176x == xeVar.f17176x && this.f17177y == xeVar.f17177y && this.f17178z == xeVar.f17178z && this.f17152A == xeVar.f17152A && this.f17153B == xeVar.f17153B && this.f17154C == xeVar.f17154C && C2449zm.m20736o(this.f17158f, xeVar.f17158f) && C2449zm.m20736o(this.f17155D, xeVar.f17155D) && this.f17156E == xeVar.f17156E && C2449zm.m20736o(this.f17162j, xeVar.f17162j) && C2449zm.m20736o(this.f17163k, xeVar.f17163k) && C2449zm.m20736o(this.f17160h, xeVar.f17160h) && C2449zm.m20736o(this.f17166n, xeVar.f17166n) && C2449zm.m20736o(this.f17161i, xeVar.f17161i) && C2449zm.m20736o(this.f17174v, xeVar.f17174v) && Arrays.equals(this.f17173u, xeVar.f17173u) && this.f17165m.size() == xeVar.f17165m.size()) {
                for (int i = 0; i < this.f17165m.size(); i++) {
                    if (!Arrays.equals(this.f17165m.get(i), xeVar.f17165m.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final C2367xe mo11812f(int i) {
        String str = this.f17158f;
        return new C2367xe(str, this.f17162j, this.f17163k, this.f17160h, this.f17159g, i, this.f17167o, this.f17168p, this.f17169q, this.f17170r, this.f17171s, this.f17173u, this.f17172t, this.f17174v, this.f17175w, this.f17176x, this.f17177y, this.f17178z, this.f17152A, this.f17154C, this.f17155D, this.f17156E, this.f17153B, this.f17165m, this.f17166n, this.f17161i);
    }

    /* renamed from: g */
    public final C2367xe mo11813g(C1964mj mjVar) {
        String str = this.f17158f;
        return new C2367xe(str, this.f17162j, this.f17163k, this.f17160h, this.f17159g, this.f17164l, this.f17167o, this.f17168p, this.f17169q, this.f17170r, this.f17171s, this.f17173u, this.f17172t, this.f17174v, this.f17175w, this.f17176x, this.f17177y, this.f17178z, this.f17152A, this.f17154C, this.f17155D, this.f17156E, this.f17153B, this.f17165m, this.f17166n, mjVar);
    }

    public final int hashCode() {
        int i = this.f17157F;
        if (i != 0) {
            return i;
        }
        String str = this.f17158f;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.f17162j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17163k;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17160h;
        int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f17159g) * 31) + this.f17167o) * 31) + this.f17168p) * 31) + this.f17175w) * 31) + this.f17176x) * 31;
        String str5 = this.f17155D;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f17156E) * 31;
        C2406yg ygVar = this.f17166n;
        int hashCode6 = (hashCode5 + (ygVar == null ? 0 : ygVar.hashCode())) * 31;
        C1964mj mjVar = this.f17161i;
        if (mjVar != null) {
            i2 = mjVar.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.f17157F = i3;
        return i3;
    }

    public final String toString() {
        String str = this.f17158f;
        String str2 = this.f17162j;
        String str3 = this.f17163k;
        int i = this.f17159g;
        String str4 = this.f17155D;
        int i2 = this.f17167o;
        int i3 = this.f17168p;
        float f = this.f17169q;
        int i4 = this.f17175w;
        int i5 = this.f17176x;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17158f);
        parcel.writeString(this.f17162j);
        parcel.writeString(this.f17163k);
        parcel.writeString(this.f17160h);
        parcel.writeInt(this.f17159g);
        parcel.writeInt(this.f17164l);
        parcel.writeInt(this.f17167o);
        parcel.writeInt(this.f17168p);
        parcel.writeFloat(this.f17169q);
        parcel.writeInt(this.f17170r);
        parcel.writeFloat(this.f17171s);
        parcel.writeInt(this.f17173u != null ? 1 : 0);
        byte[] bArr = this.f17173u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f17172t);
        parcel.writeParcelable(this.f17174v, i);
        parcel.writeInt(this.f17175w);
        parcel.writeInt(this.f17176x);
        parcel.writeInt(this.f17177y);
        parcel.writeInt(this.f17178z);
        parcel.writeInt(this.f17152A);
        parcel.writeInt(this.f17154C);
        parcel.writeString(this.f17155D);
        parcel.writeInt(this.f17156E);
        parcel.writeLong(this.f17153B);
        int size = this.f17165m.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f17165m.get(i2));
        }
        parcel.writeParcelable(this.f17166n, 0);
        parcel.writeParcelable(this.f17161i, 0);
    }
}
