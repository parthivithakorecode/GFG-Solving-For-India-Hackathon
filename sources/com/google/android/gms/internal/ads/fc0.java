package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class fc0 implements h80 {

    /* renamed from: a */
    private final hb0 f6790a;

    /* renamed from: b */
    private final bp0 f6791b;

    /* renamed from: c */
    final /* synthetic */ gc0 f6792c;

    public fc0(gc0 gc0, hb0 hb0, bp0 bp0) {
        this.f6792c = gc0;
        this.f6790a = hb0;
        this.f6791b = bp0;
    }

    /* renamed from: a */
    public final void mo7286a(JSONObject jSONObject) {
        try {
            this.f6791b.mo5907e(this.f6792c.f7370a.mo10968b(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f6791b.mo5908f(e);
        } catch (Throwable th) {
            this.f6790a.mo7904g();
            throw th;
        }
        this.f6790a.mo7904g();
    }

    /* renamed from: b */
    public final void mo7287b(String str) {
        if (str == null) {
            try {
                this.f6791b.mo5908f(new qb0());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.f6790a.mo7904g();
                throw th;
            }
        } else {
            this.f6791b.mo5908f(new qb0(str));
        }
        this.f6790a.mo7904g();
    }
}
