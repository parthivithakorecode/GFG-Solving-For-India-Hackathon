package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.jq */
public final class C1860jq extends C1298a {
    public static final Parcelable.Creator<C1860jq> CREATOR = new C1897kq();
    @GuardedBy("this")

    /* renamed from: f */
    private ParcelFileDescriptor f9223f;
    @GuardedBy("this")

    /* renamed from: g */
    private final boolean f9224g;
    @GuardedBy("this")

    /* renamed from: h */
    private final boolean f9225h;
    @GuardedBy("this")

    /* renamed from: i */
    private final long f9226i;
    @GuardedBy("this")

    /* renamed from: j */
    private final boolean f9227j;

    public C1860jq() {
        this((ParcelFileDescriptor) null, false, false, 0, false);
    }

    public C1860jq(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.f9223f = parcelFileDescriptor;
        this.f9224g = z;
        this.f9225h = z2;
        this.f9226i = j;
        this.f9227j = z3;
    }

    /* renamed from: c */
    public final synchronized long mo8514c() {
        return this.f9226i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized ParcelFileDescriptor mo8515d() {
        return this.f9223f;
    }

    /* renamed from: e */
    public final synchronized InputStream mo8516e() {
        ParcelFileDescriptor parcelFileDescriptor = this.f9223f;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f9223f = null;
        return autoCloseInputStream;
    }

    /* renamed from: f */
    public final synchronized boolean mo8517f() {
        return this.f9224g;
    }

    /* renamed from: g */
    public final synchronized boolean mo8518g() {
        return this.f9223f != null;
    }

    /* renamed from: h */
    public final synchronized boolean mo8519h() {
        return this.f9225h;
    }

    /* renamed from: i */
    public final synchronized boolean mo8520i() {
        return this.f9227j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5224l(parcel, 2, mo8515d(), i, false);
        C1301c.m5215c(parcel, 3, mo8517f());
        C1301c.m5215c(parcel, 4, mo8519h());
        C1301c.m5223k(parcel, 5, mo8514c());
        C1301c.m5215c(parcel, 6, mo8520i());
        C1301c.m5214b(parcel, a);
    }
}
