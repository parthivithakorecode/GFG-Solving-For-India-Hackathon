package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class f52 {

    /* renamed from: a */
    private final List<C2235tv> f6716a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private final Map<String, C2235tv> f6717b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private ur2 f6718c = null;

    /* renamed from: d */
    private rr2 f6719d = null;

    /* renamed from: a */
    public final oa1 mo7234a() {
        return new oa1(this.f6719d, "", this, this.f6718c);
    }

    /* renamed from: b */
    public final List<C2235tv> mo7235b() {
        return this.f6716a;
    }

    /* renamed from: c */
    public final void mo7236c(rr2 rr2) {
        String str = rr2.f13918x;
        if (!this.f6717b.containsKey(str)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = rr2.f13917w.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, rr2.f13917w.getString(next));
                } catch (JSONException unused) {
                }
            }
            C2235tv tvVar = new C2235tv(rr2.f13863F, 0, (C1605cv) null, bundle);
            this.f6716a.add(tvVar);
            this.f6717b.put(str, tvVar);
        }
    }

    /* renamed from: d */
    public final void mo7237d(rr2 rr2, long j, C1605cv cvVar) {
        String str = rr2.f13918x;
        if (this.f6717b.containsKey(str)) {
            if (this.f6719d == null) {
                this.f6719d = rr2;
            }
            C2235tv tvVar = this.f6717b.get(str);
            tvVar.f15053g = j;
            tvVar.f15054h = cvVar;
        }
    }

    /* renamed from: e */
    public final void mo7238e(ur2 ur2) {
        this.f6718c = ur2;
    }
}
