package p095n;

import android.content.ComponentName;
import android.os.IBinder;
import p000a.C0000a;
import p000a.C0002b;

/* renamed from: n.e */
public final class C3746e {

    /* renamed from: a */
    private final Object f21585a = new Object();

    /* renamed from: b */
    private final C0002b f21586b;

    /* renamed from: c */
    private final C0000a f21587c;

    /* renamed from: d */
    private final ComponentName f21588d;

    C3746e(C0002b bVar, C0000a aVar, ComponentName componentName) {
        this.f21586b = bVar;
        this.f21587c = aVar;
        this.f21588d = componentName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder mo14953a() {
        return this.f21587c.asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ComponentName mo14954b() {
        return this.f21588d;
    }
}
