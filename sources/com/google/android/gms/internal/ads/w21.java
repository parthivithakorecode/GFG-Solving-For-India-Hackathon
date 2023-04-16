package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

public final class w21 {

    /* renamed from: a */
    private final String f16659a;

    /* renamed from: b */
    private final lc0 f16660b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f16661c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public b31 f16662d;

    /* renamed from: e */
    private final t70<Object> f16663e = new s21(this);

    /* renamed from: f */
    private final t70<Object> f16664f = new u21(this);

    public w21(String str, lc0 lc0, Executor executor) {
        this.f16659a = str;
        this.f16660b = lc0;
        this.f16661c = executor;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ boolean m18831g(w21 w21, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(w21.f16659a);
    }

    /* renamed from: c */
    public final void mo11559c(b31 b31) {
        this.f16660b.mo8919b("/updateActiveView", this.f16663e);
        this.f16660b.mo8919b("/untrackActiveViewUnit", this.f16664f);
        this.f16662d = b31;
    }

    /* renamed from: d */
    public final void mo11560d(eu0 eu0) {
        eu0.mo7080F0("/updateActiveView", this.f16663e);
        eu0.mo7080F0("/untrackActiveViewUnit", this.f16664f);
    }

    /* renamed from: e */
    public final void mo11561e() {
        this.f16660b.mo8920c("/updateActiveView", this.f16663e);
        this.f16660b.mo8920c("/untrackActiveViewUnit", this.f16664f);
    }

    /* renamed from: f */
    public final void mo11562f(eu0 eu0) {
        eu0.mo7082G0("/updateActiveView", this.f16663e);
        eu0.mo7082G0("/untrackActiveViewUnit", this.f16664f);
    }
}
