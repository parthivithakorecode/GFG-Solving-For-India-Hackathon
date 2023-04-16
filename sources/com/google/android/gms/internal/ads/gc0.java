package com.google.android.gms.internal.ads;

import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
import p054h1.C2694t;

@ParametersAreNonnullByDefault
public final class gc0<I, O> implements rb0<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final tb0<O> f7370a;

    /* renamed from: b */
    private final vb0<I> f7371b;

    /* renamed from: c */
    private final nb0 f7372c;

    /* renamed from: d */
    private final String f7373d;

    gc0(nb0 nb0, String str, vb0<I> vb0, tb0<O> tb0) {
        this.f7372c = nb0;
        this.f7373d = str;
        this.f7371b = vb0;
        this.f7370a = tb0;
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m9645d(gc0 gc0, hb0 hb0, ob0 ob0, Object obj, bp0 bp0) {
        try {
            C2694t.m21608q();
            String uuid = UUID.randomUUID().toString();
            s70.f14306o.mo8115c(uuid, new fc0(gc0, hb0, bp0));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", gc0.f7371b.mo8587a(obj));
            ob0.mo9998c1(gc0.f7373d, jSONObject);
        } catch (Exception e) {
            bp0.mo5908f(e);
            io0.m11129e("Unable to invokeJavascript", e);
            hb0.mo7904g();
        } catch (Throwable th) {
            hb0.mo7904g();
            throw th;
        }
    }

    /* renamed from: a */
    public final cc3<O> mo7584a(I i) {
        bp0 bp0 = new bp0();
        hb0 b = this.f7372c.mo9481b((C1734gb) null);
        b.mo8196e(new dc0(this, b, i, bp0), new ec0(this, bp0, b));
        return bp0;
    }

    /* renamed from: c */
    public final cc3<O> mo5074c(I i) {
        return mo7584a(i);
    }
}
