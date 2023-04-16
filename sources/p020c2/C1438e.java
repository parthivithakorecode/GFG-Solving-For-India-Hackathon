package p020c2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p003a2.C0060d;
import p003a2.C0070g;
import p003a2.C0104u;
import p070j2.C3230d;
import p160x1.C4282d;
import p172z1.C4494d;
import p172z1.C4506j;

/* renamed from: c2.e */
public final class C1438e extends C0070g<C1434a> {

    /* renamed from: N */
    private final C0104u f3652N;

    public C1438e(Context context, Looper looper, C0060d dVar, C0104u uVar, C4494d dVar2, C4506j jVar) {
        super(context, looper, 270, dVar, dVar2, jVar);
        this.f3652N = uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo156D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo157E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo160H() {
        return true;
    }

    /* renamed from: i */
    public final int mo178i() {
        return 203390000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo188s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C1434a ? (C1434a) queryLocalInterface : new C1434a(iBinder);
    }

    /* renamed from: v */
    public final C4282d[] mo191v() {
        return C3230d.f20606b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Bundle mo195z() {
        return this.f3652N.mo283d();
    }
}
