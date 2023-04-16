package p129s0;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p089m0.C3646j;
import p117q0.C3936a;
import p153w0.C4260a;

/* renamed from: s0.d */
public abstract class C4009d<T> {

    /* renamed from: f */
    private static final String f22176f = C3646j.m25231f("ConstraintTracker");

    /* renamed from: a */
    protected final C4260a f22177a;

    /* renamed from: b */
    protected final Context f22178b;

    /* renamed from: c */
    private final Object f22179c = new Object();

    /* renamed from: d */
    private final Set<C3936a<T>> f22180d = new LinkedHashSet();

    /* renamed from: e */
    T f22181e;

    /* renamed from: s0.d$a */
    class C4010a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ List f22182f;

        C4010a(List list) {
            this.f22182f = list;
        }

        public void run() {
            for (C3936a a : this.f22182f) {
                a.mo15392a(C4009d.this.f22181e);
            }
        }
    }

    C4009d(Context context, C4260a aVar) {
        this.f22178b = context.getApplicationContext();
        this.f22177a = aVar;
    }

    /* renamed from: a */
    public void mo15487a(C3936a<T> aVar) {
        synchronized (this.f22179c) {
            if (this.f22180d.add(aVar)) {
                if (this.f22180d.size() == 1) {
                    this.f22181e = mo15479b();
                    C3646j.m25229c().mo14806a(f22176f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f22181e}), new Throwable[0]);
                    mo15484e();
                }
                aVar.mo15392a(this.f22181e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo15479b();

    /* renamed from: c */
    public void mo15488c(C3936a<T> aVar) {
        synchronized (this.f22179c) {
            if (this.f22180d.remove(aVar) && this.f22180d.isEmpty()) {
                mo15485f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15489d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f22179c
            monitor-enter(r0)
            T r1 = r3.f22181e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f22181e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<q0.a<T>> r1 = r3.f22180d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            w0.a r1 = r3.f22177a     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.mo15822a()     // Catch:{ all -> 0x002b }
            s0.d$a r2 = new s0.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p129s0.C4009d.mo15489d(java.lang.Object):void");
    }

    /* renamed from: e */
    public abstract void mo15484e();

    /* renamed from: f */
    public abstract void mo15485f();
}
