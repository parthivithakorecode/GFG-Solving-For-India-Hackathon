package p172z1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p003a2.C0052c;
import p003a2.C0073h;
import p003a2.C0076i;
import p003a2.C0092o;
import p160x1.C4280b;
import p160x1.C4282d;
import p166y1.C4365a;

/* renamed from: z1.i */
public final class C4504i implements C4365a.C4374f, ServiceConnection {

    /* renamed from: q */
    private static final String f22994q = C4504i.class.getSimpleName();

    /* renamed from: f */
    private final String f22995f;

    /* renamed from: g */
    private final String f22996g;

    /* renamed from: h */
    private final ComponentName f22997h;

    /* renamed from: i */
    private final Context f22998i;

    /* renamed from: j */
    private final C4494d f22999j;

    /* renamed from: k */
    private final Handler f23000k;

    /* renamed from: l */
    private final C4506j f23001l;

    /* renamed from: m */
    private IBinder f23002m;

    /* renamed from: n */
    private boolean f23003n;

    /* renamed from: o */
    private String f23004o;

    /* renamed from: p */
    private String f23005p;

    /* renamed from: f */
    private final void m27348f() {
        if (Thread.currentThread() != this.f23000k.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: t */
    private final void m27349t(String str) {
        String.valueOf(this.f23002m);
        str.length();
    }

    /* renamed from: a */
    public final boolean mo15987a() {
        m27348f();
        return this.f23002m != null;
    }

    /* renamed from: b */
    public final void mo15988b(@RecentlyNonNull C0052c.C0057e eVar) {
    }

    /* renamed from: c */
    public final Set<Scope> mo231c() {
        return Collections.emptySet();
    }

    /* renamed from: d */
    public final void mo15989d(@RecentlyNonNull String str) {
        m27348f();
        this.f23004o = str;
        mo15997o();
    }

    /* renamed from: e */
    public final boolean mo15990e() {
        return false;
    }

    /* renamed from: h */
    public final void mo15991h(@RecentlyNonNull C0052c.C0055c cVar) {
        m27348f();
        m27349t("Connect started.");
        if (mo15987a()) {
            try {
                mo15989d("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f22997h;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f22995f).setAction(this.f22996g);
            }
            boolean bindService = this.f22998i.bindService(intent, this, C0073h.m276a());
            this.f23003n = bindService;
            if (!bindService) {
                this.f23002m = null;
                this.f23001l.mo16168n0(new C4280b(16));
            }
            m27349t("Finished connect.");
        } catch (SecurityException e) {
            this.f23003n = false;
            this.f23002m = null;
            throw e;
        }
    }

    /* renamed from: i */
    public final int mo178i() {
        return 0;
    }

    /* renamed from: j */
    public final boolean mo15992j() {
        m27348f();
        return this.f23003n;
    }

    @RecentlyNonNull
    /* renamed from: k */
    public final C4282d[] mo15993k() {
        return new C4282d[0];
    }

    @RecentlyNonNull
    /* renamed from: l */
    public final String mo15994l() {
        String str = this.f22995f;
        if (str != null) {
            return str;
        }
        C0092o.m313i(this.f22997h);
        return this.f22997h.getPackageName();
    }

    @RecentlyNullable
    /* renamed from: m */
    public final String mo15995m() {
        return this.f23004o;
    }

    /* renamed from: n */
    public final void mo15996n(C0076i iVar, Set<Scope> set) {
    }

    /* renamed from: o */
    public final void mo15997o() {
        m27348f();
        m27349t("Disconnect called.");
        try {
            this.f22998i.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f23003n = false;
        this.f23002m = null;
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.f23000k.post(new C4501g0(this, iBinder));
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        this.f23000k.post(new C4505i0(this));
    }

    /* renamed from: p */
    public final boolean mo185p() {
        return false;
    }

    /* renamed from: q */
    public final void mo16164q(String str) {
        this.f23005p = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo16165r() {
        this.f23003n = false;
        this.f23002m = null;
        m27349t("Disconnected.");
        this.f22999j.mo16146D(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo16166s(IBinder iBinder) {
        this.f23003n = false;
        this.f23002m = iBinder;
        m27349t("Connected.");
        this.f22999j.mo16145C0(new Bundle());
    }
}
