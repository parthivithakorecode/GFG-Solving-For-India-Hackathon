package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p002a1.C0013a;
import p002a1.C0030n;
import p002a1.C0039v;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.cv */
public final class C1605cv extends C1298a {
    public static final Parcelable.Creator<C1605cv> CREATOR = new C1642dv();

    /* renamed from: f */
    public final int f5529f;

    /* renamed from: g */
    public final String f5530g;

    /* renamed from: h */
    public final String f5531h;

    /* renamed from: i */
    public C1605cv f5532i;

    /* renamed from: j */
    public IBinder f5533j;

    public C1605cv(int i, String str, String str2, C1605cv cvVar, IBinder iBinder) {
        this.f5529f = i;
        this.f5530g = str;
        this.f5531h = str2;
        this.f5532i = cvVar;
        this.f5533j = iBinder;
    }

    /* renamed from: c */
    public final C0013a mo6305c() {
        C1605cv cvVar = this.f5532i;
        return new C0013a(this.f5529f, this.f5530g, this.f5531h, cvVar == null ? null : new C0013a(cvVar.f5529f, cvVar.f5530g, cvVar.f5531h));
    }

    /* renamed from: d */
    public final C0030n mo6306d() {
        C1605cv cvVar = this.f5532i;
        C2461zy zyVar = null;
        C0013a aVar = cvVar == null ? null : new C0013a(cvVar.f5529f, cvVar.f5530g, cvVar.f5531h);
        int i = this.f5529f;
        String str = this.f5530g;
        String str2 = this.f5531h;
        IBinder iBinder = this.f5533j;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zyVar = queryLocalInterface instanceof C2461zy ? (C2461zy) queryLocalInterface : new C2387xy(iBinder);
        }
        return new C0030n(i, str, str2, aVar, C0039v.m121d(zyVar));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f5529f);
        C1301c.m5225m(parcel, 2, this.f5530g, false);
        C1301c.m5225m(parcel, 3, this.f5531h, false);
        C1301c.m5224l(parcel, 4, this.f5532i, i, false);
        C1301c.m5219g(parcel, 5, this.f5533j, false);
        C1301c.m5214b(parcel, a);
    }
}
