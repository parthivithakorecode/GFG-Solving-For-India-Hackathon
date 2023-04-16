package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p002a1.C0042x;
import p013b2.C1298a;
import p013b2.C1301c;
import p026d1.C2473e;
import p104o1.C3825d;

public final class b40 extends C1298a {
    public static final Parcelable.Creator<b40> CREATOR = new c40();

    /* renamed from: f */
    public final int f4681f;

    /* renamed from: g */
    public final boolean f4682g;

    /* renamed from: h */
    public final int f4683h;

    /* renamed from: i */
    public final boolean f4684i;

    /* renamed from: j */
    public final int f4685j;

    /* renamed from: k */
    public final s00 f4686k;

    /* renamed from: l */
    public final boolean f4687l;

    /* renamed from: m */
    public final int f4688m;

    public b40(int i, boolean z, int i2, boolean z2, int i3, s00 s00, boolean z3, int i4) {
        this.f4681f = i;
        this.f4682g = z;
        this.f4683h = i2;
        this.f4684i = z2;
        this.f4685j = i3;
        this.f4686k = s00;
        this.f4687l = z3;
        this.f4688m = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b40(C2473e eVar) {
        this(4, eVar.mo12317f(), eVar.mo12313b(), eVar.mo12316e(), eVar.mo12312a(), eVar.mo12315d() != null ? new s00(eVar.mo12315d()) : null, eVar.mo12318g(), eVar.mo12314c());
    }

    /* renamed from: c */
    public static C3825d m6604c(b40 b40) {
        C3825d.C3826a aVar = new C3825d.C3826a();
        if (b40 == null) {
            return aVar.mo15212a();
        }
        int i = b40.f4681f;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    aVar.mo15215d(b40.f4687l);
                    aVar.mo15214c(b40.f4688m);
                }
                aVar.mo15217f(b40.f4682g);
                aVar.mo15216e(b40.f4684i);
                return aVar.mo15212a();
            }
            s00 s00 = b40.f4686k;
            if (s00 != null) {
                aVar.mo15218g(new C0042x(s00));
            }
        }
        aVar.mo15213b(b40.f4685j);
        aVar.mo15217f(b40.f4682g);
        aVar.mo15216e(b40.f4684i);
        return aVar.mo15212a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f4681f);
        C1301c.m5215c(parcel, 2, this.f4682g);
        C1301c.m5220h(parcel, 3, this.f4683h);
        C1301c.m5215c(parcel, 4, this.f4684i);
        C1301c.m5220h(parcel, 5, this.f4685j);
        C1301c.m5224l(parcel, 6, this.f4686k, i, false);
        C1301c.m5215c(parcel, 7, this.f4687l);
        C1301c.m5220h(parcel, 8, this.f4688m);
        C1301c.m5214b(parcel, a);
    }
}
