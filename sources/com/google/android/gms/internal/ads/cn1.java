package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p102o.C3814g;

public final class cn1 {

    /* renamed from: h */
    public static final cn1 f5454h = new cn1(new an1());

    /* renamed from: a */
    private final l50 f5455a;

    /* renamed from: b */
    private final i50 f5456b;

    /* renamed from: c */
    private final y50 f5457c;

    /* renamed from: d */
    private final v50 f5458d;

    /* renamed from: e */
    private final ba0 f5459e;

    /* renamed from: f */
    private final C3814g<String, r50> f5460f;

    /* renamed from: g */
    private final C3814g<String, o50> f5461g;

    private cn1(an1 an1) {
        this.f5455a = an1.f4253a;
        this.f5456b = an1.f4254b;
        this.f5457c = an1.f4255c;
        this.f5460f = new C3814g<>(an1.f4258f);
        this.f5461g = new C3814g<>(an1.f4259g);
        this.f5458d = an1.f4256d;
        this.f5459e = an1.f4257e;
    }

    /* renamed from: a */
    public final i50 mo6227a() {
        return this.f5456b;
    }

    /* renamed from: b */
    public final l50 mo6228b() {
        return this.f5455a;
    }

    /* renamed from: c */
    public final o50 mo6229c(String str) {
        return this.f5461g.get(str);
    }

    /* renamed from: d */
    public final r50 mo6230d(String str) {
        return this.f5460f.get(str);
    }

    /* renamed from: e */
    public final v50 mo6231e() {
        return this.f5458d;
    }

    /* renamed from: f */
    public final y50 mo6232f() {
        return this.f5457c;
    }

    /* renamed from: g */
    public final ba0 mo6233g() {
        return this.f5459e;
    }

    /* renamed from: h */
    public final ArrayList<String> mo6234h() {
        ArrayList<String> arrayList = new ArrayList<>(this.f5460f.size());
        for (int i = 0; i < this.f5460f.size(); i++) {
            arrayList.add(this.f5460f.mo15174i(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final ArrayList<String> mo6235i() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f5457c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f5455a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f5456b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f5460f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f5459e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
