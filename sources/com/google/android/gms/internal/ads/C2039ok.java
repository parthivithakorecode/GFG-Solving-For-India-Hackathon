package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ok */
public final class C2039ok implements C1891kk {

    /* renamed from: f */
    private final C1891kk[] f12067f;

    /* renamed from: g */
    private final ArrayList<C1891kk> f12068g;

    /* renamed from: h */
    private final C1775hf f12069h = new C1775hf();

    /* renamed from: i */
    private C1854jk f12070i;

    /* renamed from: j */
    private C1812if f12071j;

    /* renamed from: k */
    private int f12072k = -1;

    /* renamed from: l */
    private C2002nk f12073l;

    public C2039ok(C1891kk... kkVarArr) {
        this.f12067f = kkVarArr;
        this.f12068g = new ArrayList<>(Arrays.asList(kkVarArr));
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m14499c(C2039ok okVar, int i, C1812if ifVar, Object obj) {
        C2002nk nkVar;
        if (okVar.f12073l == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                ifVar.mo8136g(i2, okVar.f12069h, false);
            }
            int i3 = okVar.f12072k;
            if (i3 == -1) {
                okVar.f12072k = 1;
            } else if (i3 != 1) {
                nkVar = new C2002nk(1);
                okVar.f12073l = nkVar;
            }
            nkVar = null;
            okVar.f12073l = nkVar;
        }
        if (okVar.f12073l == null) {
            okVar.f12068g.remove(okVar.f12067f[i]);
            if (i == 0) {
                okVar.f12071j = ifVar;
            }
            if (okVar.f12068g.isEmpty()) {
                okVar.f12070i.mo7647c(okVar.f12071j, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo7645a(C1959me meVar, boolean z, C1854jk jkVar) {
        this.f12070i = jkVar;
        int i = 0;
        while (true) {
            C1891kk[] kkVarArr = this.f12067f;
            if (i < kkVarArr.length) {
                kkVarArr[i].mo7645a(meVar, false, new C1965mk(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo7646b(C1817ik ikVar) {
        C1928lk lkVar = (C1928lk) ikVar;
        int i = 0;
        while (true) {
            C1891kk[] kkVarArr = this.f12067f;
            if (i < kkVarArr.length) {
                kkVarArr[i].mo7646b(lkVar.f10071f[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final C1817ik mo7648d(int i, C2337wl wlVar) {
        int length = this.f12067f.length;
        C1817ik[] ikVarArr = new C1817ik[length];
        for (int i2 = 0; i2 < length; i2++) {
            ikVarArr[i2] = this.f12067f[i2].mo7648d(i, wlVar);
        }
        return new C1928lk(ikVarArr);
    }

    /* renamed from: g */
    public final void mo7649g() {
        for (C1891kk g : this.f12067f) {
            g.mo7649g();
        }
    }

    public final void zza() {
        C2002nk nkVar = this.f12073l;
        if (nkVar == null) {
            for (C1891kk zza : this.f12067f) {
                zza.zza();
            }
            return;
        }
        throw nkVar;
    }
}
