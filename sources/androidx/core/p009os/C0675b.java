package androidx.core.p009os;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.jvm.internal.C3357i;

/* renamed from: androidx.core.os.b */
final class C0675b {

    /* renamed from: a */
    public static final C0675b f2006a = new C0675b();

    private C0675b() {
    }

    /* renamed from: a */
    public static final void m2810a(Bundle bundle, String str, IBinder iBinder) {
        C3357i.m24508e(bundle, "bundle");
        C3357i.m24508e(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
