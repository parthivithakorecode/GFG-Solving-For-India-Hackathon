package p062i2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p003a2.C0060d;
import p003a2.C0070g;
import p142u1.C4135h;
import p160x1.C4282d;
import p172z1.C4494d;
import p172z1.C4506j;

/* renamed from: i2.d */
public final class C2831d extends C0070g<C2834g> {
    protected C2831d(Context context, Looper looper, C0060d dVar, C4494d dVar2, C4506j jVar) {
        super(context, looper, 300, dVar, dVar2, jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo156D() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo157E() {
        return "com.google.android.gms.appset.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo160H() {
        return true;
    }

    /* renamed from: R */
    public final boolean mo170R() {
        return true;
    }

    /* renamed from: i */
    public final int mo178i() {
        return 212800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo188s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof C2834g ? (C2834g) queryLocalInterface : new C2834g(iBinder);
    }

    /* renamed from: v */
    public final C4282d[] mo191v() {
        return C4135h.f22369b;
    }
}
