package p062i2;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p142u1.C4133f;

/* renamed from: i2.e */
public abstract class C2832e extends C2829b implements C2833f {
    public C2832e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean mo13090D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo13093a3((Status) C2830c.m22317a(parcel, Status.CREATOR), (C4133f) C2830c.m22317a(parcel, C4133f.CREATOR));
        return true;
    }
}
