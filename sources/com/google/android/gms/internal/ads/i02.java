package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

final class i02 implements nb3<ds2> {

    /* renamed from: a */
    final /* synthetic */ j02 f8481a;

    i02(j02 j02) {
        this.f8481a = j02;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        ds2 ds2 = (ds2) obj;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10270E4)).booleanValue()) {
            this.f8481a.f8914e.mo10475g(ds2.f5904b.f5509b.f15732e);
            this.f8481a.f8914e.mo10476h(ds2.f5904b.f5509b.f15733f);
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10270E4)).booleanValue()) {
            Matcher matcher = j02.f8909f.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f8481a.f8914e.mo10475g(Integer.parseInt(matcher.group(1)));
            }
        }
    }
}
