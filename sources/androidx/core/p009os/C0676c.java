package androidx.core.p009os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.internal.C3357i;

/* renamed from: androidx.core.os.c */
final class C0676c {

    /* renamed from: a */
    public static final C0676c f2007a = new C0676c();

    private C0676c() {
    }

    /* renamed from: a */
    public static final void m2811a(Bundle bundle, String str, Size size) {
        C3357i.m24508e(bundle, "bundle");
        C3357i.m24508e(str, "key");
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m2812b(Bundle bundle, String str, SizeF sizeF) {
        C3357i.m24508e(bundle, "bundle");
        C3357i.m24508e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
