package com.google.android.gms.internal.ads;

import java.util.List;

final class wq3 extends yq3 {
    /* synthetic */ wq3(vq3 vq3) {
        super((xq3) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo11290a(Object obj, long j) {
        jq3 jq3 = (jq3) gt3.m9991p(obj, j);
        if (jq3.mo6246c()) {
            return jq3;
        }
        int size = jq3.size();
        jq3 e = jq3.mo5923e(size == 0 ? 10 : size + size);
        gt3.m9971D(obj, j, e);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11291b(Object obj, long j) {
        ((jq3) gt3.m9991p(obj, j)).mo6244a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final <E> void mo11292c(Object obj, Object obj2, long j) {
        jq3 jq3 = (jq3) gt3.m9991p(obj, j);
        jq3 jq32 = (jq3) gt3.m9991p(obj2, j);
        int size = jq3.size();
        int size2 = jq32.size();
        if (size > 0 && size2 > 0) {
            if (!jq3.mo6246c()) {
                jq3 = jq3.mo5923e(size2 + size);
            }
            jq3.addAll(jq32);
        }
        if (size > 0) {
            jq32 = jq3;
        }
        gt3.m9971D(obj, j, jq32);
    }
}
