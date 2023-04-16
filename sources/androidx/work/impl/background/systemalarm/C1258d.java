package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.C1259e;
import java.util.Collections;
import java.util.List;
import p089m0.C3646j;
import p096n0.C3748b;
import p117q0.C3938c;
import p117q0.C3939d;
import p141u0.C4108p;
import p147v0.C4180j;
import p147v0.C4188n;

/* renamed from: androidx.work.impl.background.systemalarm.d */
public class C1258d implements C3938c, C3748b, C4188n.C4190b {

    /* renamed from: o */
    private static final String f3403o = C3646j.m25231f("DelayMetCommandHandler");

    /* renamed from: f */
    private final Context f3404f;

    /* renamed from: g */
    private final int f3405g;

    /* renamed from: h */
    private final String f3406h;

    /* renamed from: i */
    private final C1259e f3407i;

    /* renamed from: j */
    private final C3939d f3408j;

    /* renamed from: k */
    private final Object f3409k = new Object();

    /* renamed from: l */
    private int f3410l = 0;

    /* renamed from: m */
    private PowerManager.WakeLock f3411m;

    /* renamed from: n */
    private boolean f3412n = false;

    C1258d(Context context, int i, String str, C1259e eVar) {
        this.f3404f = context;
        this.f3405g = i;
        this.f3407i = eVar;
        this.f3406h = str;
        this.f3408j = new C3939d(context, eVar.mo4537f(), this);
    }

    /* renamed from: c */
    private void m5068c() {
        synchronized (this.f3409k) {
            this.f3408j.mo15404e();
            this.f3407i.mo4539h().mo15705c(this.f3406h);
            PowerManager.WakeLock wakeLock = this.f3411m;
            if (wakeLock != null && wakeLock.isHeld()) {
                C3646j.m25229c().mo14806a(f3403o, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f3411m, this.f3406h}), new Throwable[0]);
                this.f3411m.release();
            }
        }
    }

    /* renamed from: g */
    private void m5069g() {
        synchronized (this.f3409k) {
            if (this.f3410l < 2) {
                this.f3410l = 2;
                C3646j c = C3646j.m25229c();
                String str = f3403o;
                c.mo14806a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f3406h}), new Throwable[0]);
                Intent g = C1256b.m5056g(this.f3404f, this.f3406h);
                C1259e eVar = this.f3407i;
                eVar.mo4541k(new C1259e.C1261b(eVar, g, this.f3405g));
                if (this.f3407i.mo4536e().mo14960g(this.f3406h)) {
                    C3646j.m25229c().mo14806a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f3406h}), new Throwable[0]);
                    Intent f = C1256b.m5055f(this.f3404f, this.f3406h);
                    C1259e eVar2 = this.f3407i;
                    eVar2.mo4541k(new C1259e.C1261b(eVar2, f, this.f3405g));
                } else {
                    C3646j.m25229c().mo14806a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f3406h}), new Throwable[0]);
                }
            } else {
                C3646j.m25229c().mo14806a(f3403o, String.format("Already stopped work for %s", new Object[]{this.f3406h}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo4526a(String str, boolean z) {
        C3646j.m25229c().mo14806a(f3403o, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        m5068c();
        if (z) {
            Intent f = C1256b.m5055f(this.f3404f, this.f3406h);
            C1259e eVar = this.f3407i;
            eVar.mo4541k(new C1259e.C1261b(eVar, f, this.f3405g));
        }
        if (this.f3412n) {
            Intent b = C1256b.m5051b(this.f3404f);
            C1259e eVar2 = this.f3407i;
            eVar2.mo4541k(new C1259e.C1261b(eVar2, b, this.f3405g));
        }
    }

    /* renamed from: b */
    public void mo4530b(String str) {
        C3646j.m25229c().mo14806a(f3403o, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        m5069g();
    }

    /* renamed from: d */
    public void mo4531d(List<String> list) {
        m5069g();
    }

    /* renamed from: e */
    public void mo4532e(List<String> list) {
        if (list.contains(this.f3406h)) {
            synchronized (this.f3409k) {
                if (this.f3410l == 0) {
                    this.f3410l = 1;
                    C3646j.m25229c().mo14806a(f3403o, String.format("onAllConstraintsMet for %s", new Object[]{this.f3406h}), new Throwable[0]);
                    if (this.f3407i.mo4536e().mo14963j(this.f3406h)) {
                        this.f3407i.mo4539h().mo15704b(this.f3406h, 600000, this);
                    } else {
                        m5068c();
                    }
                } else {
                    C3646j.m25229c().mo14806a(f3403o, String.format("Already started work for %s", new Object[]{this.f3406h}), new Throwable[0]);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4533f() {
        this.f3411m = C4180j.m26635b(this.f3404f, String.format("%s (%s)", new Object[]{this.f3406h, Integer.valueOf(this.f3405g)}));
        C3646j c = C3646j.m25229c();
        String str = f3403o;
        c.mo14806a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f3411m, this.f3406h}), new Throwable[0]);
        this.f3411m.acquire();
        C4108p k = this.f3407i.mo4538g().mo14986o().mo4514B().mo15632k(this.f3406h);
        if (k == null) {
            m5069g();
            return;
        }
        boolean b = k.mo15614b();
        this.f3412n = b;
        if (!b) {
            C3646j.m25229c().mo14806a(str, String.format("No constraints for %s", new Object[]{this.f3406h}), new Throwable[0]);
            mo4532e(Collections.singletonList(this.f3406h));
            return;
        }
        this.f3408j.mo15403d(Collections.singletonList(k));
    }
}
