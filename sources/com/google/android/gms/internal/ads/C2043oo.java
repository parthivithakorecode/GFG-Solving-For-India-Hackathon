package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2694t;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.oo */
public final class C2043oo {

    /* renamed from: a */
    private final int f12113a;

    /* renamed from: b */
    private final int f12114b;

    /* renamed from: c */
    private final int f12115c;

    /* renamed from: d */
    private final boolean f12116d;

    /* renamed from: e */
    private final C1674ep f12117e;

    /* renamed from: f */
    private final C1970mp f12118f;

    /* renamed from: g */
    private final Object f12119g = new Object();

    /* renamed from: h */
    private final ArrayList<String> f12120h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<String> f12121i = new ArrayList<>();

    /* renamed from: j */
    private final ArrayList<C1525ap> f12122j = new ArrayList<>();

    /* renamed from: k */
    private int f12123k = 0;

    /* renamed from: l */
    private int f12124l = 0;

    /* renamed from: m */
    private int f12125m = 0;

    /* renamed from: n */
    private int f12126n;

    /* renamed from: o */
    private String f12127o = "";

    /* renamed from: p */
    private String f12128p = "";

    /* renamed from: q */
    private String f12129q = "";

    public C2043oo(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f12113a = i;
        this.f12114b = i2;
        this.f12115c = i3;
        this.f12116d = z;
        this.f12117e = new C1674ep(i4);
        this.f12118f = new C1970mp(i5, i6, i7);
    }

    /* renamed from: p */
    private final void m14542p(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f12115c) {
            synchronized (this.f12119g) {
                this.f12120h.add(str);
                this.f12123k += str.length();
                if (z) {
                    this.f12121i.add(str);
                    this.f12122j.add(new C1525ap(f, f2, f3, f4, this.f12121i.size() - 1));
                }
            }
        }
    }

    /* renamed from: q */
    private static final String m14543q(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append(arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo9809a(int i, int i2) {
        return this.f12116d ? this.f12114b : (i * this.f12113a) + (i2 * this.f12114b);
    }

    /* renamed from: b */
    public final int mo9810b() {
        return this.f12126n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo9811c() {
        return this.f12123k;
    }

    /* renamed from: d */
    public final String mo9812d() {
        return this.f12127o;
    }

    /* renamed from: e */
    public final String mo9813e() {
        return this.f12128p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2043oo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C2043oo) obj).f12127o;
        return str != null && str.equals(this.f12127o);
    }

    /* renamed from: f */
    public final String mo9815f() {
        return this.f12129q;
    }

    /* renamed from: g */
    public final void mo9816g() {
        synchronized (this.f12119g) {
            this.f12125m--;
        }
    }

    /* renamed from: h */
    public final void mo9817h() {
        synchronized (this.f12119g) {
            this.f12125m++;
        }
    }

    public final int hashCode() {
        return this.f12127o.hashCode();
    }

    /* renamed from: i */
    public final void mo9819i() {
        synchronized (this.f12119g) {
            this.f12126n -= 100;
        }
    }

    /* renamed from: j */
    public final void mo9820j(int i) {
        this.f12124l = i;
    }

    /* renamed from: k */
    public final void mo9821k(String str, boolean z, float f, float f2, float f3, float f4) {
        m14542p(str, z, f, f2, f3, f4);
    }

    /* renamed from: l */
    public final void mo9822l(String str, boolean z, float f, float f2, float f3, float f4) {
        m14542p(str, z, f, f2, f3, f4);
        synchronized (this.f12119g) {
            if (this.f12125m < 0) {
                io0.m11126b("ActivityContent: negative number of WebViews.");
            }
            mo9823m();
        }
    }

    /* renamed from: m */
    public final void mo9823m() {
        synchronized (this.f12119g) {
            int a = mo9809a(this.f12123k, this.f12124l);
            if (a > this.f12126n) {
                this.f12126n = a;
                if (!C2694t.m21607p().mo11025h().mo14102w()) {
                    this.f12127o = this.f12117e.mo7013a(this.f12120h);
                    this.f12128p = this.f12117e.mo7013a(this.f12121i);
                }
                if (!C2694t.m21607p().mo11025h().mo14101v()) {
                    this.f12129q = this.f12118f.mo9345a(this.f12121i, this.f12122j);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo9824n() {
        synchronized (this.f12119g) {
            int a = mo9809a(this.f12123k, this.f12124l);
            if (a > this.f12126n) {
                this.f12126n = a;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo9825o() {
        boolean z;
        synchronized (this.f12119g) {
            z = this.f12125m == 0;
        }
        return z;
    }

    public final String toString() {
        int i = this.f12124l;
        int i2 = this.f12126n;
        int i3 = this.f12123k;
        String q = m14543q(this.f12120h, 100);
        String q2 = m14543q(this.f12121i, 100);
        String str = this.f12127o;
        String str2 = this.f12128p;
        String str3 = this.f12129q;
        int length = String.valueOf(q).length();
        int length2 = String.valueOf(q2).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(q);
        sb.append("\n viewableText");
        sb.append(q2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
