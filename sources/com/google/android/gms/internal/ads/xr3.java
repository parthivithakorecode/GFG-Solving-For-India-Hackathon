package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class xr3 extends lo3 {

    /* renamed from: f */
    final bs3 f17334f;

    /* renamed from: g */
    no3 f17335g = m19637a();

    /* renamed from: h */
    final /* synthetic */ ds3 f17336h;

    xr3(ds3 ds3) {
        this.f17336h = ds3;
        this.f17334f = new bs3(ds3, (as3) null);
    }

    /* renamed from: a */
    private final no3 m19637a() {
        if (this.f17334f.hasNext()) {
            return this.f17334f.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f17335g != null;
    }

    public final byte zza() {
        no3 no3 = this.f17335g;
        if (no3 != null) {
            byte zza = no3.zza();
            if (!this.f17335g.hasNext()) {
                this.f17335g = m19637a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
