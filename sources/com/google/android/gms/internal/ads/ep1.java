package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class ep1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ fp1 f6309a;

    /* renamed from: b */
    public final /* synthetic */ cc3 f6310b;

    /* renamed from: c */
    public final /* synthetic */ cc3 f6311c;

    /* renamed from: d */
    public final /* synthetic */ cc3 f6312d;

    /* renamed from: e */
    public final /* synthetic */ cc3 f6313e;

    /* renamed from: f */
    public final /* synthetic */ cc3 f6314f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f6315g;

    /* renamed from: h */
    public final /* synthetic */ cc3 f6316h;

    /* renamed from: i */
    public final /* synthetic */ cc3 f6317i;

    /* renamed from: j */
    public final /* synthetic */ cc3 f6318j;

    /* renamed from: k */
    public final /* synthetic */ cc3 f6319k;

    public /* synthetic */ ep1(fp1 fp1, cc3 cc3, cc3 cc32, cc3 cc33, cc3 cc34, cc3 cc35, JSONObject jSONObject, cc3 cc36, cc3 cc37, cc3 cc38, cc3 cc39) {
        this.f6309a = fp1;
        this.f6310b = cc3;
        this.f6311c = cc32;
        this.f6312d = cc33;
        this.f6313e = cc34;
        this.f6314f = cc35;
        this.f6315g = jSONObject;
        this.f6316h = cc36;
        this.f6317i = cc37;
        this.f6318j = cc38;
        this.f6319k = cc39;
    }

    public final Object call() {
        cc3 cc3 = this.f6310b;
        cc3 cc32 = this.f6311c;
        cc3 cc33 = this.f6312d;
        cc3 cc34 = this.f6313e;
        cc3 cc35 = this.f6314f;
        JSONObject jSONObject = this.f6315g;
        cc3 cc36 = this.f6316h;
        cc3 cc37 = this.f6317i;
        cc3 cc38 = this.f6318j;
        cc3 cc39 = this.f6319k;
        rm1 rm1 = (rm1) cc3.get();
        rm1.mo10593n((List) cc32.get());
        rm1.mo10590k((n40) cc33.get());
        rm1.mo10594o((n40) cc34.get());
        rm1.mo10586h((g40) cc35.get());
        rm1.mo10596q(tp1.m17393j(jSONObject));
        rm1.mo10589j(tp1.m17392i(jSONObject));
        eu0 eu0 = (eu0) cc36.get();
        if (eu0 != null) {
            rm1.mo10604y(eu0);
            rm1.mo10603x(eu0.mo7105Y());
            rm1.mo10602w(eu0.mo7139p());
        }
        eu0 eu02 = (eu0) cc37.get();
        if (eu02 != null) {
            rm1.mo10592m(eu02);
            rm1.mo10605z(eu02.mo7105Y());
        }
        eu0 eu03 = (eu0) cc38.get();
        if (eu03 != null) {
            rm1.mo10597r(eu03);
        }
        for (xp1 xp1 : (List) cc39.get()) {
            if (xp1.f17296a != 1) {
                rm1.mo10591l(xp1.f17297b, xp1.f17299d);
            } else {
                rm1.mo10600u(xp1.f17297b, xp1.f17298c);
            }
        }
        return rm1;
    }
}
