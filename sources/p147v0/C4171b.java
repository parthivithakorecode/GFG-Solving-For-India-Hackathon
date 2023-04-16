package p147v0;

import android.text.TextUtils;
import androidx.work.C1239b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import p089m0.C3635b;
import p089m0.C3646j;
import p089m0.C3651m;
import p096n0.C3749c;
import p096n0.C3752e;
import p096n0.C3753f;
import p096n0.C3754g;
import p096n0.C3756i;
import p141u0.C4108p;

/* renamed from: v0.b */
public class C4171b implements Runnable {

    /* renamed from: h */
    private static final String f22384h = C3646j.m25231f("EnqueueRunnable");

    /* renamed from: f */
    private final C3754g f22385f;

    /* renamed from: g */
    private final C3749c f22386g = new C3749c();

    public C4171b(C3754g gVar) {
        this.f22385f = gVar;
    }

    /* renamed from: b */
    private static boolean m26613b(C3754g gVar) {
        boolean c = m26614c(gVar.mo14975g(), gVar.mo14974f(), (String[]) C3754g.m25523l(gVar).toArray(new String[0]), gVar.mo14972d(), gVar.mo14970b());
        gVar.mo14978k();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01db A[LOOP:7: B:120:0x01d5->B:122:0x01db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0204 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0159  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m26614c(p096n0.C3756i r19, java.util.List<? extends p089m0.C3664u> r20, java.lang.String[] r21, java.lang.String r22, p089m0.C3639d r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.mo14986o()
            r7 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = r7
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r12 = r7
            r11 = 0
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            u0.q r8 = r6.mo4514B()
            u0.p r8 = r8.mo15632k(r15)
            if (r8 != 0) goto L_0x0045
            m0.j r0 = p089m0.C3646j.m25229c()
            java.lang.String r1 = f22384h
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.mo14807b(r1, r2, r4)
            return r3
        L_0x0045:
            m0.s r8 = r8.f22315b
            m0.s r15 = p089m0.C3662s.SUCCEEDED
            if (r8 != r15) goto L_0x004d
            r15 = r7
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            m0.s r15 = p089m0.C3662s.FAILED
            if (r8 != r15) goto L_0x0055
            r14 = r7
            goto L_0x005a
        L_0x0055:
            m0.s r15 = p089m0.C3662s.CANCELLED
            if (r8 != r15) goto L_0x005a
            r13 = r7
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = r7
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r8 = android.text.TextUtils.isEmpty(r22)
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = r7
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x014e
            u0.q r10 = r6.mo4514B()
            java.util.List r10 = r10.mo15628g(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x014e
            m0.d r11 = p089m0.C3639d.APPEND
            if (r3 == r11) goto L_0x00ca
            m0.d r11 = p089m0.C3639d.APPEND_OR_REPLACE
            if (r3 != r11) goto L_0x0085
            goto L_0x00ca
        L_0x0085:
            m0.d r11 = p089m0.C3639d.KEEP
            if (r3 != r11) goto L_0x00a5
            java.util.Iterator r3 = r10.iterator()
        L_0x008d:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x00a5
            java.lang.Object r11 = r3.next()
            u0.p$b r11 = (p141u0.C4108p.C4110b) r11
            m0.s r11 = r11.f22333b
            m0.s r15 = p089m0.C3662s.ENQUEUED
            if (r11 == r15) goto L_0x00a3
            m0.s r15 = p089m0.C3662s.RUNNING
            if (r11 != r15) goto L_0x008d
        L_0x00a3:
            r11 = 0
            return r11
        L_0x00a5:
            r11 = 0
            v0.a r3 = p147v0.C4167a.m26603c(r2, r0, r11)
            r3.run()
            u0.q r3 = r6.mo4514B()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00c7
            java.lang.Object r15 = r10.next()
            u0.p$b r15 = (p141u0.C4108p.C4110b) r15
            java.lang.String r15 = r15.f22332a
            r3.mo15622a(r15)
            goto L_0x00b5
        L_0x00c7:
            r3 = r7
            goto L_0x014f
        L_0x00ca:
            r11 = 0
            u0.b r9 = r6.mo4516t()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00d8:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0113
            java.lang.Object r16 = r10.next()
            r7 = r16
            u0.p$b r7 = (p141u0.C4108p.C4110b) r7
            java.lang.String r11 = r7.f22332a
            boolean r11 = r9.mo15590b(r11)
            if (r11 != 0) goto L_0x010c
            m0.s r11 = r7.f22333b
            r17 = r9
            m0.s r9 = p089m0.C3662s.SUCCEEDED
            if (r11 != r9) goto L_0x00f8
            r9 = 1
            goto L_0x00f9
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            r9 = r9 & r12
            m0.s r12 = p089m0.C3662s.FAILED
            if (r11 != r12) goto L_0x0100
            r14 = 1
            goto L_0x0105
        L_0x0100:
            m0.s r12 = p089m0.C3662s.CANCELLED
            if (r11 != r12) goto L_0x0105
            r13 = 1
        L_0x0105:
            java.lang.String r7 = r7.f22332a
            r15.add(r7)
            r12 = r9
            goto L_0x010e
        L_0x010c:
            r17 = r9
        L_0x010e:
            r9 = r17
            r7 = 1
            r11 = 0
            goto L_0x00d8
        L_0x0113:
            m0.d r7 = p089m0.C3639d.APPEND_OR_REPLACE
            if (r3 != r7) goto L_0x0140
            if (r13 != 0) goto L_0x011b
            if (r14 == 0) goto L_0x0140
        L_0x011b:
            u0.q r3 = r6.mo4514B()
            java.util.List r7 = r3.mo15628g(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0127:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0139
            java.lang.Object r9 = r7.next()
            u0.p$b r9 = (p141u0.C4108p.C4110b) r9
            java.lang.String r9 = r9.f22332a
            r3.mo15622a(r9)
            goto L_0x0127
        L_0x0139:
            java.util.List r15 = java.util.Collections.emptyList()
            r3 = 0
            r13 = 0
            goto L_0x0141
        L_0x0140:
            r3 = r14
        L_0x0141:
            java.lang.Object[] r1 = r15.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r7 = r1.length
            if (r7 <= 0) goto L_0x014c
            r9 = 1
            goto L_0x014d
        L_0x014c:
            r9 = 0
        L_0x014d:
            r14 = r3
        L_0x014e:
            r3 = 0
        L_0x014f:
            java.util.Iterator r7 = r20.iterator()
        L_0x0153:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x020a
            java.lang.Object r10 = r7.next()
            m0.u r10 = (p089m0.C3664u) r10
            u0.p r11 = r10.mo14828c()
            if (r9 == 0) goto L_0x0176
            if (r12 != 0) goto L_0x0176
            if (r14 == 0) goto L_0x016e
            m0.s r15 = p089m0.C3662s.FAILED
        L_0x016b:
            r11.f22315b = r15
            goto L_0x017e
        L_0x016e:
            if (r13 == 0) goto L_0x0173
            m0.s r15 = p089m0.C3662s.CANCELLED
            goto L_0x016b
        L_0x0173:
            m0.s r15 = p089m0.C3662s.BLOCKED
            goto L_0x016b
        L_0x0176:
            boolean r15 = r11.mo15616d()
            if (r15 != 0) goto L_0x0181
            r11.f22327n = r4
        L_0x017e:
            r17 = r4
            goto L_0x0187
        L_0x0181:
            r17 = r4
            r4 = 0
            r11.f22327n = r4
        L_0x0187:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x0195
            r5 = 25
            if (r4 > r5) goto L_0x0195
        L_0x0191:
            m26616g(r11)
            goto L_0x01a2
        L_0x0195:
            r5 = 22
            if (r4 > r5) goto L_0x01a2
            java.lang.String r4 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r4 = m26617h(r0, r4)
            if (r4 == 0) goto L_0x01a2
            goto L_0x0191
        L_0x01a2:
            m0.s r4 = r11.f22315b
            m0.s r5 = p089m0.C3662s.ENQUEUED
            if (r4 != r5) goto L_0x01a9
            r3 = 1
        L_0x01a9:
            u0.q r4 = r6.mo4514B()
            r4.mo15623b(r11)
            if (r9 == 0) goto L_0x01cd
            int r4 = r1.length
            r5 = 0
        L_0x01b4:
            if (r5 >= r4) goto L_0x01cd
            r11 = r1[r5]
            u0.a r15 = new u0.a
            java.lang.String r0 = r10.mo14826a()
            r15.<init>(r0, r11)
            u0.b r0 = r6.mo4516t()
            r0.mo15592d(r15)
            int r5 = r5 + 1
            r0 = r19
            goto L_0x01b4
        L_0x01cd:
            java.util.Set r0 = r10.mo14827b()
            java.util.Iterator r0 = r0.iterator()
        L_0x01d5:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01f2
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            u0.t r5 = r6.mo4515C()
            u0.s r11 = new u0.s
            java.lang.String r15 = r10.mo14826a()
            r11.<init>(r4, r15)
            r5.mo15644a(r11)
            goto L_0x01d5
        L_0x01f2:
            if (r8 == 0) goto L_0x0204
            u0.k r0 = r6.mo4519z()
            u0.j r4 = new u0.j
            java.lang.String r5 = r10.mo14826a()
            r4.<init>(r2, r5)
            r0.mo15606a(r4)
        L_0x0204:
            r0 = r19
            r4 = r17
            goto L_0x0153
        L_0x020a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p147v0.C4171b.m26614c(n0.i, java.util.List, java.lang.String[], java.lang.String, m0.d):boolean");
    }

    /* renamed from: e */
    private static boolean m26615e(C3754g gVar) {
        List<C3754g> e = gVar.mo14973e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (C3754g next : e) {
                if (!next.mo14977j()) {
                    z2 |= m26615e(next);
                } else {
                    C3646j.m25229c().mo14810h(f22384h, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.mo14971c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m26613b(gVar) | z;
    }

    /* renamed from: g */
    private static void m26616g(C4108p pVar) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        C3635b bVar = pVar.f22323j;
        String str = pVar.f22316c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (bVar.mo14772f() || bVar.mo14776i()) {
            C1239b.C1240a aVar = new C1239b.C1240a();
            aVar.mo4510c(pVar.f22318e).mo4512e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f22316c = cls.getName();
            pVar.f22318e = aVar.mo4508a();
        }
    }

    /* renamed from: h */
    private static boolean m26617h(C3756i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (C3752e eVar : iVar.mo14985n()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo15683a() {
        WorkDatabase o = this.f22385f.mo14975g().mo14986o();
        o.mo3951c();
        try {
            boolean e = m26615e(this.f22385f);
            o.mo3965r();
            return e;
        } finally {
            o.mo3955g();
        }
    }

    /* renamed from: d */
    public C3651m mo15684d() {
        return this.f22386g;
    }

    /* renamed from: f */
    public void mo15685f() {
        C3756i g = this.f22385f.mo14975g();
        C3753f.m25520b(g.mo14982i(), g.mo14986o(), g.mo14985n());
    }

    public void run() {
        try {
            if (!this.f22385f.mo14976h()) {
                if (mo15683a()) {
                    C4173d.m26626a(this.f22385f.mo14975g().mo14981h(), RescheduleReceiver.class, true);
                    mo15685f();
                }
                this.f22386g.mo14955a(C3651m.f21400a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f22385f}));
        } catch (Throwable th) {
            this.f22386g.mo14955a(new C3651m.C3653b.C3654a(th));
        }
    }
}
