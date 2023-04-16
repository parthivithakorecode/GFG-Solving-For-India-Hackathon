package p066io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p064i4.C2854h;
import p066io.flutter.embedding.android.C2899a;
import p066io.flutter.embedding.android.C2920k;
import p066io.flutter.embedding.android.C2951u;
import p066io.flutter.embedding.engine.FlutterOverlaySurface;
import p066io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import p066io.flutter.plugin.editing.C2986f;
import p066io.flutter.view.C3102c;
import p066io.flutter.view.C3119d;
import p099n3.C3768b;
import p106o3.C3832a;
import p126r3.C3990a;
import p168y3.C4462a;
import p174z3.C4572k;

/* renamed from: io.flutter.plugin.platform.q */
public class C3021q implements C3015k {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static Class[] f20003w = {SurfaceView.class};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3010i f20004a = new C3010i();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2899a f20005b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f20006c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2920k f20007d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3119d f20008e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2986f f20009f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4572k f20010g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2998a f20011h = new C2998a();

    /* renamed from: i */
    final HashMap<Integer, C3023r> f20012i = new HashMap<>();

    /* renamed from: j */
    final HashMap<Context, View> f20013j = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final SparseArray<C3007f> f20014k = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final SparseArray<C3990a> f20015l = new SparseArray<>();

    /* renamed from: m */
    private final SparseArray<C2999b> f20016m = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final SparseArray<C3011j> f20017n = new SparseArray<>();

    /* renamed from: o */
    private int f20018o = 0;

    /* renamed from: p */
    private boolean f20019p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f20020q = true;

    /* renamed from: r */
    private final HashSet<Integer> f20021r = new HashSet<>();

    /* renamed from: s */
    private final HashSet<Integer> f20022s = new HashSet<>();

    /* renamed from: t */
    private final C2951u f20023t = C2951u.m23010a();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f20024u = false;

    /* renamed from: v */
    private final C4572k.C4580g f20025v = new C3022a();

    /* renamed from: io.flutter.plugin.platform.q$a */
    class C3022a implements C4572k.C4580g {
        C3022a() {
        }

        /* renamed from: m */
        private void m23346m(C3007f fVar, C4572k.C4576d dVar) {
            C3768b.m25591e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f23153a);
        }

        @TargetApi(23)
        /* renamed from: n */
        private long m23347n(C3007f fVar, C4572k.C4576d dVar) {
            long j;
            C3011j jVar;
            m23350q(23);
            C3768b.m25591e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f23153a);
            int y = C3021q.this.m23300l0(dVar.f23155c);
            int y2 = C3021q.this.m23300l0(dVar.f23156d);
            if (C3021q.this.f20024u) {
                jVar = new C3011j(C3021q.this.f20006c);
                j = -1;
            } else {
                C3119d.C3122c a = C3021q.this.f20008e.mo13953a();
                C3011j jVar2 = new C3011j(C3021q.this.f20006c, a);
                long d = a.mo13957d();
                jVar = jVar2;
                j = d;
            }
            jVar.mo13679m(C3021q.this.f20005b);
            jVar.mo13674i(y, y2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(y, y2);
            int y3 = C3021q.this.m23300l0(dVar.f23157e);
            int y4 = C3021q.this.m23300l0(dVar.f23158f);
            layoutParams.topMargin = y3;
            layoutParams.leftMargin = y4;
            jVar.mo13676j(layoutParams);
            View a2 = fVar.mo13659a();
            a2.setLayoutParams(new FrameLayout.LayoutParams(y, y2));
            a2.setImportantForAccessibility(4);
            jVar.addView(a2);
            jVar.mo13677k(new C3018n(this, dVar));
            C3021q.this.f20007d.addView(jVar);
            C3021q.this.f20017n.append(dVar.f23153a, jVar);
            return j;
        }

        /* renamed from: o */
        private long m23348o(C3007f fVar, C4572k.C4576d dVar) {
            m23350q(20);
            C3768b.m25591e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f23153a);
            C3119d.C3122c a = C3021q.this.f20008e.mo13953a();
            C3007f fVar2 = fVar;
            C3119d.C3122c cVar = a;
            C3023r a2 = C3023r.m23364a(C3021q.this.f20006c, C3021q.this.f20011h, fVar2, cVar, C3021q.this.m23300l0(dVar.f23155c), C3021q.this.m23300l0(dVar.f23156d), dVar.f23153a, (Object) null, new C3019o(this, dVar));
            if (a2 != null) {
                if (C3021q.this.f20007d != null) {
                    a2.mo13732f(C3021q.this.f20007d);
                }
                C3021q.this.f20012i.put(Integer.valueOf(dVar.f23153a), a2);
                View a3 = fVar.mo13659a();
                C3021q.this.f20013j.put(a3.getContext(), a3);
                return a.mo13957d();
            }
            throw new IllegalStateException("Failed creating virtual display for a " + dVar.f23154b + " with id: " + dVar.f23153a);
        }

        @TargetApi(19)
        /* renamed from: p */
        private C3007f m23349p(C4572k.C4576d dVar, boolean z) {
            C3008g b = C3021q.this.f20004a.mo13668b(dVar.f23154b);
            if (b != null) {
                Object obj = null;
                if (dVar.f23161i != null) {
                    obj = b.mo13666b().mo324b(dVar.f23161i);
                }
                C3007f a = b.mo13665a(z ? new MutableContextWrapper(C3021q.this.f20006c) : C3021q.this.f20006c, dVar.f23153a, obj);
                View a2 = a.mo13659a();
                if (a2 != null) {
                    a2.setLayoutDirection(dVar.f23159g);
                    C3021q.this.f20014k.put(dVar.f23153a, a);
                    return a;
                }
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f23154b);
        }

        /* renamed from: q */
        private void m23350q(int i) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < i) {
                throw new IllegalStateException("Trying to use platform views with API " + i2 + ", required API level is: " + i);
            }
        }

        /* renamed from: r */
        private void m23351r(C4572k.C4576d dVar) {
            if (!C3021q.m23304n0(dVar.f23159g)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f23159g + "(view id: " + dVar.f23153a + ")");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m23352s(C4572k.C4576d dVar, View view, boolean z) {
            C3021q qVar = C3021q.this;
            if (z) {
                qVar.f20010g.mo16238d(dVar.f23153a);
            } else if (qVar.f20009f != null) {
                C3021q.this.f20009f.mo13607l(dVar.f23153a);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m23353t(C4572k.C4576d dVar, View view, boolean z) {
            if (z) {
                C3021q.this.f20010g.mo16238d(dVar.f23153a);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m23354u(C3023r rVar, float f, C4572k.C4574b bVar) {
            C3021q.this.m23302m0(rVar);
            if (C3021q.this.f20006c != null) {
                f = C3021q.this.m23280O();
            }
            bVar.mo16237a(new C4572k.C4575c(C3021q.this.m23297j0((double) rVar.mo13730d(), f), C3021q.this.m23297j0((double) rVar.mo13729c(), f)));
        }

        @TargetApi(19)
        /* renamed from: a */
        public void mo13719a(C4572k.C4576d dVar) {
            m23350q(19);
            m23351r(dVar);
            m23346m(m23349p(dVar, false), dVar);
        }

        /* renamed from: b */
        public void mo13720b(boolean z) {
            boolean unused = C3021q.this.f20020q = z;
        }

        /* renamed from: c */
        public void mo13721c(int i, double d, double d2) {
            if (!C3021q.this.mo13689b(i)) {
                C3011j jVar = (C3011j) C3021q.this.f20017n.get(i);
                if (jVar == null) {
                    C3768b.m25588b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
                    return;
                }
                int y = C3021q.this.m23300l0(d);
                int y2 = C3021q.this.m23300l0(d2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
                layoutParams.topMargin = y;
                layoutParams.leftMargin = y2;
                jVar.mo13676j(layoutParams);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
        @android.annotation.TargetApi(17)
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo13722d(int r4, int r5) {
            /*
                r3 = this;
                boolean r0 = p066io.flutter.plugin.platform.C3021q.m23304n0(r5)
                if (r0 == 0) goto L_0x0058
                io.flutter.plugin.platform.q r0 = p066io.flutter.plugin.platform.C3021q.this
                boolean r0 = r0.mo13689b(r4)
                java.lang.String r1 = "PlatformViewsController"
                if (r0 == 0) goto L_0x0023
                io.flutter.plugin.platform.q r0 = p066io.flutter.plugin.platform.C3021q.this
                java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.r> r0 = r0.f20012i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                io.flutter.plugin.platform.r r0 = (p066io.flutter.plugin.platform.C3023r) r0
                android.view.View r0 = r0.mo13731e()
                goto L_0x004a
            L_0x0023:
                io.flutter.plugin.platform.q r0 = p066io.flutter.plugin.platform.C3021q.this
                android.util.SparseArray r0 = r0.f20014k
                java.lang.Object r0 = r0.get(r4)
                io.flutter.plugin.platform.f r0 = (p066io.flutter.plugin.platform.C3007f) r0
                if (r0 != 0) goto L_0x0046
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Setting direction to an unknown view with id: "
            L_0x0038:
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                p099n3.C3768b.m25588b(r1, r4)
                return
            L_0x0046:
                android.view.View r0 = r0.mo13659a()
            L_0x004a:
                if (r0 != 0) goto L_0x0054
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Setting direction to a null view with id: "
                goto L_0x0038
            L_0x0054:
                r0.setLayoutDirection(r5)
                return
            L_0x0058:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Trying to set unknown direction value: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = "(view id: "
                r1.append(r5)
                r1.append(r4)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugin.platform.C3021q.C3022a.mo13722d(int, int):void");
        }

        /* renamed from: e */
        public void mo13723e(C4572k.C4579f fVar) {
            int i = fVar.f23169a;
            float f = C3021q.this.f20006c.getResources().getDisplayMetrics().density;
            if (C3021q.this.mo13689b(i)) {
                C3021q.this.f20012i.get(Integer.valueOf(i)).mo13728b(C3021q.this.mo13718k0(f, fVar, true));
                return;
            }
            C3007f fVar2 = (C3007f) C3021q.this.f20014k.get(i);
            if (fVar2 == null) {
                C3768b.m25588b("PlatformViewsController", "Sending touch to an unknown view with id: " + i);
                return;
            }
            View a = fVar2.mo13659a();
            if (a == null) {
                C3768b.m25588b("PlatformViewsController", "Sending touch to a null view with id: " + i);
                return;
            }
            a.dispatchTouchEvent(C3021q.this.mo13718k0(f, fVar, false));
        }

        @TargetApi(20)
        /* renamed from: f */
        public long mo13724f(C4572k.C4576d dVar) {
            m23351r(dVar);
            int i = dVar.f23153a;
            if (C3021q.this.f20017n.get(i) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i);
            } else if (C3021q.this.f20008e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i);
            } else if (C3021q.this.f20007d != null) {
                boolean z = true;
                C3007f p = m23349p(dVar, true);
                View a = p.mo13659a();
                if (a.getParent() == null) {
                    if (Build.VERSION.SDK_INT < 23 || C2854h.m22364f(a, C3021q.f20003w)) {
                        z = false;
                    }
                    if (!z) {
                        if (dVar.f23160h == C4572k.C4576d.C4577a.TEXTURE_WITH_HYBRID_FALLBACK) {
                            m23346m(p, dVar);
                            return -2;
                        } else if (!C3021q.this.f20024u) {
                            return m23348o(p, dVar);
                        }
                    }
                    return m23347n(p, dVar);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo13725g(int r4) {
            /*
                r3 = this;
                io.flutter.plugin.platform.q r0 = p066io.flutter.plugin.platform.C3021q.this
                boolean r0 = r0.mo13689b(r4)
                java.lang.String r1 = "PlatformViewsController"
                if (r0 == 0) goto L_0x001d
                io.flutter.plugin.platform.q r0 = p066io.flutter.plugin.platform.C3021q.this
                java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.r> r0 = r0.f20012i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                io.flutter.plugin.platform.r r0 = (p066io.flutter.plugin.platform.C3023r) r0
                android.view.View r0 = r0.mo13731e()
                goto L_0x0044
            L_0x001d:
                io.flutter.plugin.platform.q r0 = p066io.flutter.plugin.platform.C3021q.this
                android.util.SparseArray r0 = r0.f20014k
                java.lang.Object r0 = r0.get(r4)
                io.flutter.plugin.platform.f r0 = (p066io.flutter.plugin.platform.C3007f) r0
                if (r0 != 0) goto L_0x0040
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Clearing focus on an unknown view with id: "
            L_0x0032:
                r0.append(r2)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                p099n3.C3768b.m25588b(r1, r4)
                return
            L_0x0040:
                android.view.View r0 = r0.mo13659a()
            L_0x0044:
                if (r0 != 0) goto L_0x004e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Clearing focus on a null view with id: "
                goto L_0x0032
            L_0x004e:
                r0.clearFocus()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugin.platform.C3021q.C3022a.mo13725g(int):void");
        }

        /* renamed from: h */
        public void mo13726h(int i) {
            C3007f fVar = (C3007f) C3021q.this.f20014k.get(i);
            if (fVar == null) {
                C3768b.m25588b("PlatformViewsController", "Disposing unknown platform view with id: " + i);
                return;
            }
            C3021q.this.f20014k.remove(i);
            try {
                fVar.mo13660b();
            } catch (RuntimeException e) {
                C3768b.m25589c("PlatformViewsController", "Disposing platform view threw an exception", e);
            }
            if (C3021q.this.mo13689b(i)) {
                View e2 = C3021q.this.f20012i.get(Integer.valueOf(i)).mo13731e();
                if (e2 != null) {
                    C3021q.this.f20013j.remove(e2.getContext());
                }
                C3021q.this.f20012i.remove(Integer.valueOf(i));
                return;
            }
            C3011j jVar = (C3011j) C3021q.this.f20017n.get(i);
            if (jVar != null) {
                jVar.removeAllViews();
                jVar.mo13673h();
                jVar.mo13680o();
                ViewGroup viewGroup = (ViewGroup) jVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(jVar);
                }
                C3021q.this.f20017n.remove(i);
                return;
            }
            C3990a aVar = (C3990a) C3021q.this.f20015l.get(i);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.mo15458b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                C3021q.this.f20015l.remove(i);
            }
        }

        /* renamed from: i */
        public void mo13727i(C4572k.C4578e eVar, C4572k.C4574b bVar) {
            int y = C3021q.this.m23300l0(eVar.f23167b);
            int y2 = C3021q.this.m23300l0(eVar.f23168c);
            int i = eVar.f23166a;
            if (C3021q.this.mo13689b(i)) {
                float z = C3021q.this.m23280O();
                C3023r rVar = C3021q.this.f20012i.get(Integer.valueOf(i));
                C3021q.this.m23284U(rVar);
                rVar.mo13735i(y, y2, new C3020p(this, rVar, z, bVar));
                return;
            }
            C3007f fVar = (C3007f) C3021q.this.f20014k.get(i);
            C3011j jVar = (C3011j) C3021q.this.f20017n.get(i);
            if (fVar == null || jVar == null) {
                C3768b.m25588b("PlatformViewsController", "Resizing unknown platform view with id: " + i);
                return;
            }
            if (y > jVar.mo13672e() || y2 > jVar.mo13670d()) {
                jVar.mo13674i(y, y2);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = y;
            layoutParams.height = y2;
            jVar.setLayoutParams(layoutParams);
            View a = fVar.mo13659a();
            if (a != null) {
                ViewGroup.LayoutParams layoutParams2 = a.getLayoutParams();
                layoutParams2.width = y;
                layoutParams2.height = y2;
                a.setLayoutParams(layoutParams2);
            }
            bVar.mo16237a(new C4572k.C4575c(C3021q.this.m23295i0((double) jVar.mo13672e()), C3021q.this.m23295i0((double) jVar.mo13670d())));
        }
    }

    /* renamed from: M */
    private void m23278M() {
        while (this.f20014k.size() > 0) {
            this.f20025v.mo13726h(this.f20014k.keyAt(0));
        }
    }

    /* renamed from: N */
    private void m23279N(boolean z) {
        for (int i = 0; i < this.f20016m.size(); i++) {
            int keyAt = this.f20016m.keyAt(i);
            C2999b valueAt = this.f20016m.valueAt(i);
            if (this.f20021r.contains(Integer.valueOf(keyAt))) {
                this.f20007d.mo13360m(valueAt);
                z &= valueAt.mo13327d();
            } else {
                if (!this.f20019p) {
                    valueAt.mo13324a();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.f20015l.size(); i2++) {
            int keyAt2 = this.f20015l.keyAt(i2);
            View view = this.f20015l.get(keyAt2);
            if (!this.f20022s.contains(Integer.valueOf(keyAt2)) || (!z && this.f20020q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public float m23280O() {
        return this.f20006c.getResources().getDisplayMetrics().density;
    }

    /* renamed from: R */
    private void m23281R() {
        if (this.f20020q && !this.f20019p) {
            this.f20007d.mo13372p();
            this.f20019p = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m23282S(int i, View view, boolean z) {
        if (z) {
            this.f20010g.mo16238d(i);
            return;
        }
        C2986f fVar = this.f20009f;
        if (fVar != null) {
            fVar.mo13607l(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m23283T() {
        m23279N(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m23284U(C3023r rVar) {
        C2986f fVar = this.f20009f;
        if (fVar != null) {
            fVar.mo13613u();
            rVar.mo13733g();
        }
    }

    /* renamed from: c0 */
    private static MotionEvent.PointerCoords m23285c0(Object obj, float f) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f;
        return pointerCoords;
    }

    /* renamed from: d0 */
    private static List<MotionEvent.PointerCoords> m23286d0(Object obj, float f) {
        ArrayList arrayList = new ArrayList();
        for (Object c0 : (List) obj) {
            arrayList.add(m23285c0(c0, f));
        }
        return arrayList;
    }

    /* renamed from: e0 */
    private static MotionEvent.PointerProperties m23288e0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* renamed from: f0 */
    private static List<MotionEvent.PointerProperties> m23290f0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object e0 : (List) obj) {
            arrayList.add(m23288e0(e0));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    private void m23292g0() {
        if (this.f20007d == null) {
            C3768b.m25588b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i = 0; i < this.f20016m.size(); i++) {
            this.f20007d.removeView(this.f20016m.valueAt(i));
        }
        this.f20016m.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public int m23295i0(double d) {
        return m23297j0(d, m23280O());
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public int m23297j0(double d, float f) {
        return (int) Math.round(d / ((double) f));
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public int m23300l0(double d) {
        return (int) Math.round(d * ((double) m23280O()));
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m23302m0(C3023r rVar) {
        C2986f fVar = this.f20009f;
        if (fVar != null) {
            fVar.mo13605G();
            rVar.mo13734h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static boolean m23304n0(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: B */
    public void mo13697B(Context context, C3119d dVar, C3832a aVar) {
        if (this.f20006c == null) {
            this.f20006c = context;
            this.f20008e = dVar;
            C4572k kVar = new C4572k(aVar);
            this.f20010g = kVar;
            kVar.mo16239e(this.f20025v);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    /* renamed from: C */
    public void mo13698C(C2986f fVar) {
        this.f20009f = fVar;
    }

    /* renamed from: D */
    public void mo13699D(C4462a aVar) {
        this.f20005b = new C2899a(aVar, true);
    }

    /* renamed from: E */
    public void mo13700E(C2920k kVar) {
        this.f20007d = kVar;
        for (int i = 0; i < this.f20017n.size(); i++) {
            this.f20007d.addView(this.f20017n.valueAt(i));
        }
        for (int i2 = 0; i2 < this.f20015l.size(); i2++) {
            this.f20007d.addView(this.f20015l.valueAt(i2));
        }
        for (int i3 = 0; i3 < this.f20014k.size(); i3++) {
            this.f20014k.valueAt(i3).mo13662d(this.f20007d);
        }
    }

    /* renamed from: F */
    public boolean mo13701F(View view) {
        if (view == null || !this.f20013j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f20013j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(19)
    /* renamed from: G */
    public FlutterOverlaySurface mo13702G() {
        return mo13703H(new C2999b(this.f20007d.getContext(), this.f20007d.getWidth(), this.f20007d.getHeight(), this.f20011h));
    }

    @TargetApi(19)
    /* renamed from: H */
    public FlutterOverlaySurface mo13703H(C2999b bVar) {
        int i = this.f20018o;
        this.f20018o = i + 1;
        this.f20016m.put(i, bVar);
        return new FlutterOverlaySurface(i, bVar.getSurface());
    }

    /* renamed from: I */
    public void mo13704I() {
        for (int i = 0; i < this.f20016m.size(); i++) {
            C2999b valueAt = this.f20016m.valueAt(i);
            valueAt.mo13324a();
            valueAt.mo13328f();
        }
    }

    /* renamed from: J */
    public void mo13705J() {
        C4572k kVar = this.f20010g;
        if (kVar != null) {
            kVar.mo16239e((C4572k.C4580g) null);
        }
        mo13704I();
        this.f20010g = null;
        this.f20006c = null;
        this.f20008e = null;
    }

    /* renamed from: K */
    public void mo13706K() {
        for (int i = 0; i < this.f20017n.size(); i++) {
            this.f20007d.removeView(this.f20017n.valueAt(i));
        }
        for (int i2 = 0; i2 < this.f20015l.size(); i2++) {
            this.f20007d.removeView(this.f20015l.valueAt(i2));
        }
        mo13704I();
        m23292g0();
        this.f20007d = null;
        this.f20019p = false;
        for (int i3 = 0; i3 < this.f20014k.size(); i3++) {
            this.f20014k.valueAt(i3).mo13663e();
        }
    }

    /* renamed from: L */
    public void mo13707L() {
        this.f20009f = null;
    }

    /* renamed from: P */
    public C3009h mo13708P() {
        return this.f20004a;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(19)
    /* renamed from: Q */
    public void mo13709Q(int i) {
        C3007f fVar = this.f20014k.get(i);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.f20015l.get(i) == null) {
            View a = fVar.mo13659a();
            if (a == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (a.getParent() == null) {
                Context context = this.f20006c;
                C3990a aVar = new C3990a(context, context.getResources().getDisplayMetrics().density, this.f20005b);
                aVar.setOnDescendantFocusChangeListener(new C3016l(this, i));
                this.f20015l.put(i, aVar);
                a.setImportantForAccessibility(4);
                aVar.addView(a);
                this.f20007d.addView(aVar);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    /* renamed from: V */
    public void mo13710V() {
    }

    /* renamed from: W */
    public void mo13711W() {
        this.f20021r.clear();
        this.f20022s.clear();
    }

    /* renamed from: X */
    public void mo13712X() {
        m23278M();
    }

    /* renamed from: Y */
    public void mo13713Y(int i, int i2, int i3, int i4, int i5) {
        if (this.f20016m.get(i) != null) {
            m23281R();
            C2999b bVar = this.f20016m.get(i);
            if (bVar.getParent() == null) {
                this.f20007d.addView(bVar);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.leftMargin = i2;
            layoutParams.topMargin = i3;
            bVar.setLayoutParams(layoutParams);
            bVar.setVisibility(0);
            bVar.bringToFront();
            this.f20021r.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i + ") doesn't exist");
    }

    /* renamed from: Z */
    public void mo13714Z(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        m23281R();
        mo13709Q(i);
        C3990a aVar = this.f20015l.get(i);
        aVar.mo15457a(flutterMutatorsStack, i2, i3, i4, i5);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        View a = this.f20014k.get(i).mo13659a();
        if (a != null) {
            a.setLayoutParams(layoutParams);
            a.bringToFront();
        }
        this.f20022s.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo13688a(C3102c cVar) {
        this.f20011h.mo13639c(cVar);
    }

    /* renamed from: a0 */
    public void mo13715a0() {
        boolean z = false;
        if (!this.f20019p || !this.f20022s.isEmpty()) {
            if (this.f20019p && this.f20007d.mo13357j()) {
                z = true;
            }
            m23279N(z);
            return;
        }
        this.f20019p = false;
        this.f20007d.mo13345B(new C3017m(this));
    }

    /* renamed from: b */
    public boolean mo13689b(int i) {
        return this.f20012i.containsKey(Integer.valueOf(i));
    }

    /* renamed from: b0 */
    public void mo13716b0() {
        m23278M();
    }

    /* renamed from: c */
    public View mo13690c(int i) {
        if (mo13689b(i)) {
            return this.f20012i.get(Integer.valueOf(i)).mo13731e();
        }
        C3007f fVar = this.f20014k.get(i);
        if (fVar == null) {
            return null;
        }
        return fVar.mo13659a();
    }

    /* renamed from: d */
    public void mo13691d() {
        this.f20011h.mo13639c((C3102c) null);
    }

    /* renamed from: h0 */
    public void mo13717h0(boolean z) {
        this.f20024u = z;
    }

    /* renamed from: k0 */
    public MotionEvent mo13718k0(float f, C4572k.C4579f fVar, boolean z) {
        C4572k.C4579f fVar2 = fVar;
        MotionEvent b = this.f20023t.mo13400b(C2951u.C2952a.m23015c(fVar2.f23184p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) m23290f0(fVar2.f23174f).toArray(new MotionEvent.PointerProperties[fVar2.f23173e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) m23286d0(fVar2.f23175g, f).toArray(new MotionEvent.PointerCoords[fVar2.f23173e]);
        if (!z && b != null) {
            return MotionEvent.obtain(b.getDownTime(), b.getEventTime(), fVar2.f23172d, fVar2.f23173e, pointerPropertiesArr, pointerCoordsArr, b.getMetaState(), b.getButtonState(), b.getXPrecision(), b.getYPrecision(), b.getDeviceId(), b.getEdgeFlags(), b.getSource(), b.getFlags());
        }
        return MotionEvent.obtain(fVar2.f23170b.longValue(), fVar2.f23171c.longValue(), fVar2.f23172d, fVar2.f23173e, pointerPropertiesArr, pointerCoordsArr, fVar2.f23176h, fVar2.f23177i, fVar2.f23178j, fVar2.f23179k, fVar2.f23180l, fVar2.f23181m, fVar2.f23182n, fVar2.f23183o);
    }
}
