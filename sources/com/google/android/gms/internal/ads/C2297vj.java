package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vj */
public class C2297vj {

    /* renamed from: a */
    public final Uri f16324a;

    /* renamed from: b */
    public final String f16325b = null;

    /* renamed from: c */
    public final List f16326c;

    /* renamed from: d */
    public final String f16327d;

    /* renamed from: e */
    public final e73<C2375xm> f16328e;
    @Deprecated

    /* renamed from: f */
    public final List f16329f;

    /* renamed from: g */
    public final Object f16330g;

    /* synthetic */ C2297vj(Uri uri, String str, C2069pd pdVar, C1689f3 f3Var, List list, String str2, e73 e73, Object obj, C2259ui uiVar) {
        this.f16324a = uri;
        this.f16326c = list;
        this.f16327d = null;
        this.f16328e = e73;
        b73 p = e73.m8341p();
        if (e73.size() <= 0) {
            this.f16329f = p.mo5731g();
            this.f16330g = null;
            return;
        }
        C2375xm xmVar = (C2375xm) e73.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2297vj)) {
            return false;
        }
        C2297vj vjVar = (C2297vj) obj;
        return this.f16324a.equals(vjVar.f16324a) && n13.m13643p((Object) null, (Object) null) && n13.m13643p((Object) null, (Object) null) && n13.m13643p((Object) null, (Object) null) && this.f16326c.equals(vjVar.f16326c) && n13.m13643p((Object) null, (Object) null) && this.f16328e.equals(vjVar.f16328e) && n13.m13643p((Object) null, (Object) null);
    }

    public final int hashCode() {
        return ((((this.f16324a.hashCode() * 923521) + this.f16326c.hashCode()) * 961) + this.f16328e.hashCode()) * 31;
    }
}
