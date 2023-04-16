package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.db */
public abstract class C1622db implements C1585cb {

    /* renamed from: y */
    protected static volatile C1735gc f5721y;

    /* renamed from: f */
    protected MotionEvent f5722f;

    /* renamed from: g */
    protected final LinkedList<MotionEvent> f5723g = new LinkedList<>();

    /* renamed from: h */
    protected long f5724h = 0;

    /* renamed from: i */
    protected long f5725i = 0;

    /* renamed from: j */
    protected long f5726j = 0;

    /* renamed from: k */
    protected long f5727k = 0;

    /* renamed from: l */
    protected long f5728l = 0;

    /* renamed from: m */
    protected long f5729m = 0;

    /* renamed from: n */
    protected long f5730n = 0;

    /* renamed from: o */
    protected double f5731o;

    /* renamed from: p */
    private double f5732p;

    /* renamed from: q */
    private double f5733q;

    /* renamed from: r */
    protected float f5734r;

    /* renamed from: s */
    protected float f5735s;

    /* renamed from: t */
    protected float f5736t;

    /* renamed from: u */
    protected float f5737u;

    /* renamed from: v */
    private boolean f5738v = false;

    /* renamed from: w */
    protected boolean f5739w = false;

    /* renamed from: x */
    protected DisplayMetrics f5740x;

    protected C1622db(Context context) {
        try {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10419X1)).booleanValue()) {
                C2250u9.m17753d();
            } else {
                C1772hc.m10452a(f5721y);
            }
            this.f5740x = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    private final void m7788m() {
        this.f5728l = 0;
        this.f5724h = 0;
        this.f5725i = 0;
        this.f5726j = 0;
        this.f5727k = 0;
        this.f5729m = 0;
        this.f5730n = 0;
        if (this.f5723g.size() > 0) {
            Iterator it = this.f5723g.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f5723g.clear();
        } else {
            MotionEvent motionEvent = this.f5722f;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f5722f = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b4 A[SYNTHETIC, Splitter:B:48:0x00b4] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m7789n(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.m10.f10331M1
            com.google.android.gms.internal.ads.k10 r8 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r7 = r8.mo8579b(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.gc r10 = f5721y
            if (r10 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.gc r10 = f5721y
            com.google.android.gms.internal.ads.bb r10 = r10.mo7569d()
            goto L_0x002e
        L_0x002d:
            r10 = r9
        L_0x002e:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r11 = com.google.android.gms.internal.ads.m10.f10419X1
            com.google.android.gms.internal.ads.k10 r12 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r11 = r12.mo8579b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r8 == r11) goto L_0x0043
            java.lang.String r11 = "te"
            goto L_0x0048
        L_0x0043:
            java.lang.String r11 = "be"
            goto L_0x0048
        L_0x0046:
            r10 = r9
            r11 = r10
        L_0x0048:
            r15 = 2
            r14 = 3
            if (r2 != r14) goto L_0x005e
            com.google.android.gms.internal.ads.j8 r9 = r1.mo6428i(r0, r3, r4)     // Catch:{ Exception -> 0x005b }
            r1.f5738v = r8     // Catch:{ Exception -> 0x0056 }
            r0 = 1002(0x3ea, float:1.404E-42)
            r13 = r0
            goto L_0x006f
        L_0x0056:
            r0 = move-exception
            r18 = r0
            r8 = r14
            goto L_0x008c
        L_0x005b:
            r0 = move-exception
            r8 = r14
            goto L_0x008a
        L_0x005e:
            if (r2 != r15) goto L_0x0067
            com.google.android.gms.internal.ads.j8 r0 = r1.mo6430k(r0, r3, r4)     // Catch:{ Exception -> 0x005b }
            r3 = 1008(0x3f0, float:1.413E-42)
            goto L_0x006d
        L_0x0067:
            com.google.android.gms.internal.ads.j8 r0 = r1.mo6429j(r0, r9)     // Catch:{ Exception -> 0x005b }
            r3 = 1000(0x3e8, float:1.401E-42)
        L_0x006d:
            r9 = r0
            r13 = r3
        L_0x006f:
            if (r7 == 0) goto L_0x0087
            if (r10 == 0) goto L_0x0087
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005b }
            long r3 = r3 - r5
            r0 = -1
            r18 = 0
            r12 = r10
            r8 = r14
            r14 = r0
            r15 = r3
            r17 = r11
            r12.mo5760c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x0085 }
            goto L_0x0088
        L_0x0085:
            r0 = move-exception
            goto L_0x008a
        L_0x0087:
            r8 = r14
        L_0x0088:
            r3 = 2
            goto L_0x00ae
        L_0x008a:
            r18 = r0
        L_0x008c:
            if (r7 == 0) goto L_0x0088
            if (r10 == 0) goto L_0x0088
            if (r2 != r8) goto L_0x0097
            r0 = 1003(0x3eb, float:1.406E-42)
            r13 = r0
            r3 = 2
            goto L_0x00a2
        L_0x0097:
            r3 = 2
            if (r2 != r3) goto L_0x009e
            r0 = 1009(0x3f1, float:1.414E-42)
            r13 = r0
            goto L_0x00a2
        L_0x009e:
            r0 = 1001(0x3e9, float:1.403E-42)
            r13 = r0
            r2 = 1
        L_0x00a2:
            r14 = -1
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r5
            r12 = r10
            r17 = r11
            r12.mo5760c(r13, r14, r15, r17, r18)
        L_0x00ae:
            long r4 = java.lang.System.currentTimeMillis()
            if (r9 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.aq3 r0 = r9.mo11894o()     // Catch:{ Exception -> 0x00f5 }
            com.google.android.gms.internal.ads.a9 r0 = (com.google.android.gms.internal.ads.C1509a9) r0     // Catch:{ Exception -> 0x00f5 }
            int r0 = r0.mo5393f()     // Catch:{ Exception -> 0x00f5 }
            if (r0 != 0) goto L_0x00c1
            goto L_0x00ef
        L_0x00c1:
            com.google.android.gms.internal.ads.aq3 r0 = r9.mo11894o()     // Catch:{ Exception -> 0x00f5 }
            com.google.android.gms.internal.ads.a9 r0 = (com.google.android.gms.internal.ads.C1509a9) r0     // Catch:{ Exception -> 0x00f5 }
            r6 = r21
            java.lang.String r0 = com.google.android.gms.internal.ads.C2250u9.m17750a(r0, r6)     // Catch:{ Exception -> 0x00f5 }
            if (r7 == 0) goto L_0x011c
            if (r10 == 0) goto L_0x011c
            if (r2 != r8) goto L_0x00d7
            r6 = 1006(0x3ee, float:1.41E-42)
        L_0x00d5:
            r13 = r6
            goto L_0x00df
        L_0x00d7:
            if (r2 != r3) goto L_0x00dc
            r6 = 1010(0x3f2, float:1.415E-42)
            goto L_0x00d5
        L_0x00dc:
            r6 = 1004(0x3ec, float:1.407E-42)
            goto L_0x00d5
        L_0x00df:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f5 }
            long r15 = r14 - r4
            r14 = -1
            r18 = 0
            r12 = r10
            r17 = r11
            r12.mo5760c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x011c
        L_0x00ef:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x011c
        L_0x00f5:
            r0 = move-exception
            r18 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L_0x011c
            if (r10 == 0) goto L_0x011c
            if (r2 != r8) goto L_0x0107
            r2 = 1007(0x3ef, float:1.411E-42)
        L_0x0105:
            r13 = r2
            goto L_0x010f
        L_0x0107:
            if (r2 != r3) goto L_0x010c
            r2 = 1011(0x3f3, float:1.417E-42)
            goto L_0x0105
        L_0x010c:
            r2 = 1005(0x3ed, float:1.408E-42)
            goto L_0x0105
        L_0x010f:
            r14 = -1
            long r2 = java.lang.System.currentTimeMillis()
            long r15 = r2 - r4
            r12 = r10
            r17 = r11
            r12.mo5760c(r13, r14, r15, r17, r18)
        L_0x011c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1622db.m7789n(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* renamed from: a */
    public final synchronized void mo6110a(MotionEvent motionEvent) {
        Long l;
        if (this.f5738v) {
            m7788m();
            this.f5738v = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5731o = 0.0d;
            this.f5732p = (double) motionEvent.getRawX();
            this.f5733q = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = rawX - this.f5732p;
            double d2 = rawY - this.f5733q;
            this.f5731o += Math.sqrt((d * d) + (d2 * d2));
            this.f5732p = rawX;
            this.f5733q = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f5734r = motionEvent.getX();
            this.f5735s = motionEvent.getY();
            this.f5736t = motionEvent.getRawX();
            this.f5737u = motionEvent.getRawY();
            this.f5724h++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f5722f = obtain;
            this.f5723g.add(obtain);
            if (this.f5723g.size() > 6) {
                this.f5723g.remove().recycle();
            }
            this.f5726j++;
            this.f5728l = mo6427h(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f5725i += (long) (motionEvent.getHistorySize() + 1);
            try {
                C1809ic l2 = mo6431l(motionEvent);
                Long l3 = l2.f8598e;
                if (!(l3 == null || l2.f8601h == null)) {
                    this.f5729m += l3.longValue() + l2.f8601h.longValue();
                }
                if (!(this.f5740x == null || (l = l2.f8599f) == null || l2.f8602i == null)) {
                    this.f5730n += l.longValue() + l2.f8602i.longValue();
                }
            } catch (C2364xb unused) {
            }
        } else if (action2 == 3) {
            this.f5727k++;
        }
        this.f5739w = true;
    }

    /* renamed from: c */
    public final String mo6112c(Context context, View view, Activity activity) {
        return m7789n(context, (String) null, 2, view, (Activity) null, (byte[]) null);
    }

    /* renamed from: d */
    public final String mo6113d(Context context) {
        if (!C1846jc.m11556f()) {
            return m7789n(context, (String) null, 1, (View) null, (Activity) null, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    /* renamed from: e */
    public final synchronized void mo6114e(int i, int i2, int i3) {
        synchronized (this) {
            if (this.f5722f != null) {
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10315K1)).booleanValue()) {
                    m7788m();
                } else {
                    this.f5722f.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f5740x;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f5722f = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * f, ((float) i2) * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f5722f = null;
            }
            this.f5739w = false;
        }
    }

    /* renamed from: f */
    public final String mo6115f(Context context, String str, View view) {
        return m7789n(context, str, 3, view, (Activity) null, (byte[]) null);
    }

    /* renamed from: g */
    public final String mo6116g(Context context, String str, View view, Activity activity) {
        return m7789n(context, str, 3, view, activity, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract long mo6427h(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C1842j8 mo6428i(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C1842j8 mo6429j(Context context, C1582c8 c8Var);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C1842j8 mo6430k(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C1809ic mo6431l(MotionEvent motionEvent);
}
