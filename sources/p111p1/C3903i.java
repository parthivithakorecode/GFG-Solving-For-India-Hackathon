package p111p1;

import com.google.android.gms.internal.ads.dc3;
import com.google.android.gms.internal.ads.e02;
import com.google.android.gms.internal.ads.f02;
import com.google.android.gms.internal.ads.kv3;
import com.google.android.gms.internal.ads.sv3;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.yv3;
import java.util.concurrent.Executor;

/* renamed from: p1.i */
public final class C3903i implements kv3<C3901h> {

    /* renamed from: a */
    private final yv3<Executor> f22035a;

    /* renamed from: b */
    private final yv3<e02> f22036b;

    public C3903i(yv3<Executor> yv3, yv3<e02> yv32) {
        this.f22035a = yv3;
        this.f22036b = yv32;
    }

    /* renamed from: b */
    public final C3901h mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new C3901h(dc3, ((f02) this.f22036b).mo5051a());
    }
}
