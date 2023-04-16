package p003a2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import p003a2.C0076i;
import p013b2.C1298a;
import p160x1.C4282d;
import p160x1.C4284f;

/* renamed from: a2.f */
public class C0067f extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0067f> CREATOR = new C0114y0();

    /* renamed from: f */
    final int f148f;

    /* renamed from: g */
    final int f149g;

    /* renamed from: h */
    int f150h;

    /* renamed from: i */
    String f151i;

    /* renamed from: j */
    IBinder f152j;

    /* renamed from: k */
    Scope[] f153k;

    /* renamed from: l */
    Bundle f154l;

    /* renamed from: m */
    Account f155m;

    /* renamed from: n */
    C4282d[] f156n;

    /* renamed from: o */
    C4282d[] f157o;

    /* renamed from: p */
    boolean f158p;

    /* renamed from: q */
    int f159q;

    /* renamed from: r */
    boolean f160r;

    /* renamed from: s */
    private final String f161s;

    C0067f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C4282d[] dVarArr, C4282d[] dVarArr2, boolean z, int i4, boolean z2, String str2) {
        this.f148f = i;
        this.f149g = i2;
        this.f150h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f151i = "com.google.android.gms";
        } else {
            this.f151i = str;
        }
        if (i < 2) {
            this.f155m = iBinder != null ? C0046a.m153C0(C0076i.C0077a.m285n0(iBinder)) : null;
        } else {
            this.f152j = iBinder;
            this.f155m = account;
        }
        this.f153k = scopeArr;
        this.f154l = bundle;
        this.f156n = dVarArr;
        this.f157o = dVarArr2;
        this.f158p = z;
        this.f159q = i4;
        this.f160r = z2;
        this.f161s = str2;
    }

    public C0067f(int i, String str) {
        this.f148f = 6;
        this.f150h = C4284f.f22589a;
        this.f149g = i;
        this.f158p = true;
        this.f161s = str;
    }

    @RecentlyNullable
    /* renamed from: c */
    public final String mo228c() {
        return this.f161s;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C0114y0.m357a(this, parcel, i);
    }
}
