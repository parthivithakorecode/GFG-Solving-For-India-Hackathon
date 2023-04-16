package p061i1;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;
import p048g2.C2635a;
import p048g2.C2637b;

/* renamed from: i1.f */
public final class C2807f extends C1298a {
    public static final Parcelable.Creator<C2807f> CREATOR = new C2806e();

    /* renamed from: f */
    public final String f19468f;

    /* renamed from: g */
    public final String f19469g;

    /* renamed from: h */
    public final String f19470h;

    /* renamed from: i */
    public final String f19471i;

    /* renamed from: j */
    public final String f19472j;

    /* renamed from: k */
    public final String f19473k;

    /* renamed from: l */
    public final String f19474l;

    /* renamed from: m */
    public final Intent f19475m;

    /* renamed from: n */
    public final C2824w f19476n;

    /* renamed from: o */
    public final boolean f19477o;

    public C2807f(Intent intent, C2824w wVar) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent, C2637b.m21358Z2(wVar).asBinder(), false);
    }

    public C2807f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.f19468f = str;
        this.f19469g = str2;
        this.f19470h = str3;
        this.f19471i = str4;
        this.f19472j = str5;
        this.f19473k = str6;
        this.f19474l = str7;
        this.f19475m = intent;
        this.f19476n = (C2824w) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder));
        this.f19477o = z;
    }

    public C2807f(String str, String str2, String str3, String str4, String str5, String str6, String str7, C2824w wVar) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null, C2637b.m21358Z2(wVar).asBinder(), false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 2, this.f19468f, false);
        C1301c.m5225m(parcel, 3, this.f19469g, false);
        C1301c.m5225m(parcel, 4, this.f19470h, false);
        C1301c.m5225m(parcel, 5, this.f19471i, false);
        C1301c.m5225m(parcel, 6, this.f19472j, false);
        C1301c.m5225m(parcel, 7, this.f19473k, false);
        C1301c.m5225m(parcel, 8, this.f19474l, false);
        C1301c.m5224l(parcel, 9, this.f19475m, i, false);
        C1301c.m5219g(parcel, 10, C2637b.m21358Z2(this.f19476n).asBinder(), false);
        C1301c.m5215c(parcel, 11, this.f19477o);
        C1301c.m5214b(parcel, a);
    }
}
