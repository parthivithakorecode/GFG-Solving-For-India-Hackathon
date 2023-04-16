package com.google.android.gms.internal.ads;

import java.util.Iterator;

public final /* synthetic */ class do2 implements xa3 {

    /* renamed from: a */
    public final /* synthetic */ eo2 f5853a;

    /* renamed from: b */
    public final /* synthetic */ cu2 f5854b;

    /* renamed from: c */
    public final /* synthetic */ z71 f5855c;

    public /* synthetic */ do2(eo2 eo2, cu2 cu2, z71 z71) {
        this.f5853a = eo2;
        this.f5854b = cu2;
        this.f5855c = z71;
    }

    /* renamed from: c */
    public final cc3 mo5074c(Object obj) {
        cu2 cu2 = this.f5854b;
        z71 z71 = this.f5855c;
        ds2 ds2 = (ds2) obj;
        cu2.f5526b = ds2;
        Iterator<rr2> it = ds2.f5904b.f5508a.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator<String> it2 = it.next().f13884a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return z71.mo12178h(rb3.m16131i(ds2));
            }
        }
        return rb3.m16131i(null);
    }
}
