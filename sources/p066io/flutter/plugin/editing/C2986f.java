package p066io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.HashMap;
import p066io.flutter.embedding.android.C2937s;
import p066io.flutter.plugin.editing.C2981c;
import p066io.flutter.plugin.platform.C3021q;
import p099n3.C3768b;
import p128s.C3994a;
import p174z3.C4591p;

/* renamed from: io.flutter.plugin.editing.f */
public class C2986f implements C2981c.C2983b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final View f19916a;

    /* renamed from: b */
    private final InputMethodManager f19917b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AutofillManager f19918c;

    /* renamed from: d */
    private final C4591p f19919d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2989c f19920e = new C2989c(C2989c.C2990a.NO_TARGET, 0);

    /* renamed from: f */
    private C4591p.C4593b f19921f;

    /* renamed from: g */
    private SparseArray<C4591p.C4593b> f19922g;

    /* renamed from: h */
    private C2981c f19923h;

    /* renamed from: i */
    private boolean f19924i;

    /* renamed from: j */
    private InputConnection f19925j;

    /* renamed from: k */
    private C3021q f19926k;

    /* renamed from: l */
    private Rect f19927l;

    /* renamed from: m */
    private ImeSyncDeferringInsetsCallback f19928m;

    /* renamed from: n */
    private C4591p.C4597e f19929n;

    /* renamed from: o */
    private boolean f19930o;

    /* renamed from: io.flutter.plugin.editing.f$a */
    class C2987a implements C4591p.C4598f {
        C2987a() {
        }

        /* renamed from: a */
        public void mo13615a() {
            C2986f fVar = C2986f.this;
            fVar.mo13604F(fVar.f19916a);
        }

        /* renamed from: b */
        public void mo13616b() {
            C2986f.this.mo13608m();
        }

        /* renamed from: c */
        public void mo13617c(C4591p.C4597e eVar) {
            C2986f fVar = C2986f.this;
            fVar.mo13603E(fVar.f19916a, eVar);
        }

        /* renamed from: d */
        public void mo13618d(int i, C4591p.C4593b bVar) {
            C2986f.this.mo13602D(i, bVar);
        }

        /* renamed from: e */
        public void mo13619e(String str, Bundle bundle) {
            C2986f.this.mo13601B(str, bundle);
        }

        /* renamed from: f */
        public void mo13620f(int i, boolean z) {
            C2986f.this.m23136C(i, z);
        }

        /* renamed from: g */
        public void mo13621g(double d, double d2, double[] dArr) {
            C2986f.this.m23135A(d, d2, dArr);
        }

        /* renamed from: h */
        public void mo13622h() {
            C2986f.this.m23152x();
        }

        /* renamed from: i */
        public void mo13623i(boolean z) {
            if (Build.VERSION.SDK_INT >= 26 && C2986f.this.f19918c != null) {
                if (z) {
                    C2986f.this.f19918c.commit();
                } else {
                    C2986f.this.f19918c.cancel();
                }
            }
        }

        /* renamed from: j */
        public void mo13624j() {
            if (C2986f.this.f19920e.f19936a == C2989c.C2990a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                C2986f.this.m23153y();
                return;
            }
            C2986f fVar = C2986f.this;
            fVar.m23148s(fVar.f19916a);
        }
    }

    /* renamed from: io.flutter.plugin.editing.f$b */
    class C2988b implements C2991d {

        /* renamed from: a */
        final /* synthetic */ boolean f19932a;

        /* renamed from: b */
        final /* synthetic */ double[] f19933b;

        /* renamed from: c */
        final /* synthetic */ double[] f19934c;

        C2988b(boolean z, double[] dArr, double[] dArr2) {
            this.f19932a = z;
            this.f19933b = dArr;
            this.f19934c = dArr2;
        }

        /* renamed from: a */
        public void mo13625a(double d, double d2) {
            double d3 = 1.0d;
            if (!this.f19932a) {
                double[] dArr = this.f19933b;
                d3 = 1.0d / (((dArr[3] * d) + (dArr[7] * d2)) + dArr[15]);
            }
            double[] dArr2 = this.f19933b;
            double d4 = ((dArr2[0] * d) + (dArr2[4] * d2) + dArr2[12]) * d3;
            double d5 = ((dArr2[1] * d) + (dArr2[5] * d2) + dArr2[13]) * d3;
            double[] dArr3 = this.f19934c;
            if (d4 < dArr3[0]) {
                dArr3[0] = d4;
            } else if (d4 > dArr3[1]) {
                dArr3[1] = d4;
            }
            if (d5 < dArr3[2]) {
                dArr3[2] = d5;
            } else if (d5 > dArr3[3]) {
                dArr3[3] = d5;
            }
        }
    }

    /* renamed from: io.flutter.plugin.editing.f$c */
    private static class C2989c {

        /* renamed from: a */
        C2990a f19936a;

        /* renamed from: b */
        int f19937b;

        /* renamed from: io.flutter.plugin.editing.f$c$a */
        enum C2990a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public C2989c(C2990a aVar, int i) {
            this.f19936a = aVar;
            this.f19937b = i;
        }
    }

    /* renamed from: io.flutter.plugin.editing.f$d */
    private interface C2991d {
        /* renamed from: a */
        void mo13625a(double d, double d2);
    }

    @SuppressLint({"NewApi"})
    public C2986f(View view, C4591p pVar, C3021q qVar) {
        int i = 0;
        this.f19916a = view;
        AutofillManager autofillManager = null;
        this.f19923h = new C2981c((C4591p.C4597e) null, view);
        this.f19917b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        this.f19918c = i2 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : autofillManager;
        if (i2 >= 30) {
            i = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : i;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? i | WindowInsets.Type.statusBars() : i, WindowInsets.Type.ime());
            this.f19928m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f19919d = pVar;
        pVar.mo16262n(new C2987a());
        pVar.mo16259k();
        this.f19926k = qVar;
        qVar.mo13698C(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m23135A(double d, double d2, double[] dArr) {
        double d3 = d;
        double d4 = d2;
        double[] dArr2 = dArr;
        double[] dArr3 = new double[4];
        boolean z = dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d;
        double d5 = dArr2[12] / dArr2[15];
        dArr3[1] = d5;
        dArr3[0] = d5;
        double d6 = dArr2[13] / dArr2[15];
        dArr3[3] = d6;
        dArr3[2] = d6;
        C2988b bVar = new C2988b(z, dArr2, dArr3);
        bVar.mo13625a(d3, 0.0d);
        bVar.mo13625a(d3, d4);
        bVar.mo13625a(0.0d, d4);
        Float valueOf = Float.valueOf(this.f19916a.getContext().getResources().getDisplayMetrics().density);
        this.f19927l = new Rect((int) (dArr3[0] * ((double) valueOf.floatValue())), (int) (dArr3[2] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[1] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[3] * ((double) valueOf.floatValue())));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m23136C(int i, boolean z) {
        if (z) {
            this.f19916a.requestFocus();
            this.f19920e = new C2989c(C2989c.C2990a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i);
            this.f19917b.restartInput(this.f19916a);
            this.f19924i = false;
            return;
        }
        this.f19920e = new C2989c(C2989c.C2990a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i);
        this.f19925j = null;
    }

    /* renamed from: H */
    private void m23137H(C4591p.C4593b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (bVar == null || bVar.f23220j == null) {
                this.f19922g = null;
                return;
            }
            C4591p.C4593b[] bVarArr = bVar.f23222l;
            SparseArray<C4591p.C4593b> sparseArray = new SparseArray<>();
            this.f19922g = sparseArray;
            if (bVarArr == null) {
                sparseArray.put(bVar.f23220j.f23223a.hashCode(), bVar);
                return;
            }
            for (C4591p.C4593b bVar2 : bVarArr) {
                C4591p.C4593b.C4594a aVar = bVar2.f23220j;
                if (aVar != null) {
                    this.f19922g.put(aVar.f23223a.hashCode(), bVar2);
                    this.f19918c.notifyValueChanged(this.f19916a, aVar.f23223a.hashCode(), AutofillValue.forText(aVar.f23225c.f23236a));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f23217g;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m23146k() {
        /*
            r3 = this;
            z3.p$b r0 = r3.f19921f
            r1 = 1
            if (r0 == 0) goto L_0x0012
            z3.p$c r0 = r0.f23217g
            if (r0 != 0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            z3.p$g r0 = r0.f23227a
            z3.p$g r2 = p174z3.C4591p.C4599g.NONE
            if (r0 == r2) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugin.editing.C2986f.m23146k():boolean");
    }

    /* renamed from: n */
    private static boolean m23147n(C4591p.C4597e eVar, C4591p.C4597e eVar2) {
        int i = eVar.f23240e - eVar.f23239d;
        if (i != eVar2.f23240e - eVar2.f23239d) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (eVar.f23236a.charAt(eVar.f23239d + i2) != eVar2.f23236a.charAt(eVar2.f23239d + i2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m23148s(View view) {
        m23153y();
        this.f19917b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* renamed from: t */
    private static int m23149t(C4591p.C4595c cVar, boolean z, boolean z2, boolean z3, boolean z4, C4591p.C4596d dVar) {
        C4591p.C4599g gVar = cVar.f23227a;
        if (gVar == C4591p.C4599g.DATETIME) {
            return 4;
        }
        if (gVar == C4591p.C4599g.NUMBER) {
            int i = 2;
            if (cVar.f23228b) {
                i = 4098;
            }
            return cVar.f23229c ? i | 8192 : i;
        } else if (gVar == C4591p.C4599g.PHONE) {
            return 3;
        } else {
            if (gVar == C4591p.C4599g.NONE) {
                return 0;
            }
            int i2 = 1;
            if (gVar == C4591p.C4599g.MULTILINE) {
                i2 = 131073;
            } else if (gVar == C4591p.C4599g.EMAIL_ADDRESS) {
                i2 = 33;
            } else if (gVar == C4591p.C4599g.URL) {
                i2 = 17;
            } else if (gVar == C4591p.C4599g.VISIBLE_PASSWORD) {
                i2 = 145;
            } else if (gVar == C4591p.C4599g.NAME) {
                i2 = 97;
            } else if (gVar == C4591p.C4599g.POSTAL_ADDRESS) {
                i2 = 113;
            }
            if (z) {
                i2 = i2 | 524288 | 128;
            } else {
                if (z2) {
                    i2 |= 32768;
                }
                if (!z3) {
                    i2 |= 524288;
                }
            }
            return dVar == C4591p.C4596d.CHARACTERS ? i2 | 4096 : dVar == C4591p.C4596d.WORDS ? i2 | 8192 : dVar == C4591p.C4596d.SENTENCES ? i2 | 16384 : i2;
        }
    }

    /* renamed from: v */
    private boolean m23150v() {
        return this.f19922g != null;
    }

    /* renamed from: w */
    private void m23151w(String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.f19918c != null && m23150v()) {
            this.f19918c.notifyValueChanged(this.f19916a, this.f19921f.f23220j.f23223a.hashCode(), AutofillValue.forText(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m23152x() {
        if (Build.VERSION.SDK_INT >= 26 && this.f19918c != null && m23150v()) {
            String str = this.f19921f.f23220j.f23223a;
            int[] iArr = new int[2];
            this.f19916a.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.f19927l);
            rect.offset(iArr[0], iArr[1]);
            this.f19918c.notifyViewEntered(this.f19916a, str.hashCode(), rect);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m23153y() {
        C4591p.C4593b bVar;
        if (Build.VERSION.SDK_INT >= 26 && this.f19918c != null && (bVar = this.f19921f) != null && bVar.f23220j != null && m23150v()) {
            this.f19918c.notifyViewExited(this.f19916a, this.f19921f.f23220j.f23223a.hashCode());
        }
    }

    /* renamed from: B */
    public void mo13601B(String str, Bundle bundle) {
        this.f19917b.sendAppPrivateCommand(this.f19916a, str, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo13602D(int i, C4591p.C4593b bVar) {
        m23153y();
        this.f19921f = bVar;
        this.f19920e = m23146k() ? new C2989c(C2989c.C2990a.FRAMEWORK_CLIENT, i) : new C2989c(C2989c.C2990a.NO_TARGET, i);
        this.f19923h.mo13588l(this);
        C4591p.C4593b.C4594a aVar = bVar.f23220j;
        this.f19923h = new C2981c(aVar != null ? aVar.f23225c : null, this.f19916a);
        m23137H(bVar);
        this.f19924i = true;
        mo13605G();
        this.f19927l = null;
        this.f19923h.mo13579a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo13603E(View view, C4591p.C4597e eVar) {
        C4591p.C4597e eVar2;
        if (!this.f19924i && (eVar2 = this.f19929n) != null && eVar2.mo16267b()) {
            boolean n = m23147n(this.f19929n, eVar);
            this.f19924i = n;
            if (n) {
                C3768b.m25591e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f19929n = eVar;
        this.f19923h.mo13590n(eVar);
        if (this.f19924i) {
            this.f19917b.restartInput(view);
            this.f19924i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo13604F(View view) {
        if (m23146k()) {
            view.requestFocus();
            this.f19917b.showSoftInput(view, 0);
            return;
        }
        m23148s(view);
    }

    /* renamed from: G */
    public void mo13605G() {
        if (this.f19920e.f19936a == C2989c.C2990a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f19930o = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r7 == r1.f23240e) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13558a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000b
            io.flutter.plugin.editing.c r9 = r8.f19923h
            java.lang.String r9 = r9.toString()
            r8.m23151w(r9)
        L_0x000b:
            io.flutter.plugin.editing.c r9 = r8.f19923h
            int r9 = r9.mo13587i()
            io.flutter.plugin.editing.c r10 = r8.f19923h
            int r10 = r10.mo13586h()
            io.flutter.plugin.editing.c r11 = r8.f19923h
            int r11 = r11.mo13585g()
            io.flutter.plugin.editing.c r0 = r8.f19923h
            int r7 = r0.mo13584f()
            io.flutter.plugin.editing.c r0 = r8.f19923h
            java.util.ArrayList r0 = r0.mo13583e()
            z3.p$e r1 = r8.f19929n
            if (r1 == 0) goto L_0x0052
            io.flutter.plugin.editing.c r1 = r8.f19923h
            java.lang.String r1 = r1.toString()
            z3.p$e r2 = r8.f19929n
            java.lang.String r2 = r2.f23236a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0050
            z3.p$e r1 = r8.f19929n
            int r2 = r1.f23237b
            if (r9 != r2) goto L_0x0050
            int r2 = r1.f23238c
            if (r10 != r2) goto L_0x0050
            int r2 = r1.f23239d
            if (r11 != r2) goto L_0x0050
            int r1 = r1.f23240e
            if (r7 != r1) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r1 = 0
            goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.c r2 = r8.f19923h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            p099n3.C3768b.m25592f(r2, r1)
            z3.p$b r1 = r8.f19921f
            boolean r1 = r1.f23215e
            if (r1 == 0) goto L_0x0086
            z3.p r1 = r8.f19919d
            io.flutter.plugin.editing.f$c r2 = r8.f19920e
            int r2 = r2.f19937b
            r1.mo16265q(r2, r0)
            io.flutter.plugin.editing.c r0 = r8.f19923h
            r0.mo13581c()
            goto L_0x0099
        L_0x0086:
            z3.p r0 = r8.f19919d
            io.flutter.plugin.editing.f$c r1 = r8.f19920e
            int r1 = r1.f19937b
            io.flutter.plugin.editing.c r2 = r8.f19923h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.mo16264p(r1, r2, r3, r4, r5, r6)
        L_0x0099:
            z3.p$e r6 = new z3.p$e
            io.flutter.plugin.editing.c r0 = r8.f19923h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f19929n = r6
            goto L_0x00b1
        L_0x00ac:
            io.flutter.plugin.editing.c r9 = r8.f19923h
            r9.mo13581c()
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugin.editing.C2986f.mo13558a(boolean, boolean, boolean):void");
    }

    /* renamed from: j */
    public void mo13606j(SparseArray<AutofillValue> sparseArray) {
        C4591p.C4593b bVar;
        C4591p.C4593b.C4594a aVar;
        C4591p.C4593b.C4594a aVar2;
        if (Build.VERSION.SDK_INT >= 26 && (bVar = this.f19921f) != null && this.f19922g != null && (aVar = bVar.f23220j) != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < sparseArray.size(); i++) {
                C4591p.C4593b bVar2 = this.f19922g.get(sparseArray.keyAt(i));
                if (!(bVar2 == null || (aVar2 = bVar2.f23220j) == null)) {
                    String charSequence = sparseArray.valueAt(i).getTextValue().toString();
                    C4591p.C4597e eVar = new C4591p.C4597e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (aVar2.f23223a.equals(aVar.f23223a)) {
                        this.f19923h.mo13590n(eVar);
                    } else {
                        hashMap.put(aVar2.f23223a, eVar);
                    }
                }
            }
            this.f19919d.mo16266r(this.f19920e.f19937b, hashMap);
        }
    }

    /* renamed from: l */
    public void mo13607l(int i) {
        C2989c cVar = this.f19920e;
        C2989c.C2990a aVar = cVar.f19936a;
        if ((aVar == C2989c.C2990a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == C2989c.C2990a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f19937b == i) {
            this.f19920e = new C2989c(C2989c.C2990a.NO_TARGET, 0);
            m23153y();
            this.f19917b.hideSoftInputFromWindow(this.f19916a.getApplicationWindowToken(), 0);
            this.f19917b.restartInput(this.f19916a);
            this.f19924i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo13608m() {
        if (this.f19920e.f19936a != C2989c.C2990a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f19923h.mo13588l(this);
            m23153y();
            this.f19921f = null;
            m23137H((C4591p.C4593b) null);
            this.f19920e = new C2989c(C2989c.C2990a.NO_TARGET, 0);
            mo13605G();
            this.f19927l = null;
        }
    }

    /* renamed from: o */
    public InputConnection mo13609o(View view, C2937s sVar, EditorInfo editorInfo) {
        C2989c cVar = this.f19920e;
        C2989c.C2990a aVar = cVar.f19936a;
        if (aVar == C2989c.C2990a.NO_TARGET) {
            this.f19925j = null;
            return null;
        } else if (aVar == C2989c.C2990a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar != C2989c.C2990a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                C4591p.C4593b bVar = this.f19921f;
                int t = m23149t(bVar.f23217g, bVar.f23211a, bVar.f23212b, bVar.f23213c, bVar.f23214d, bVar.f23216f);
                editorInfo.inputType = t;
                editorInfo.imeOptions = 33554432;
                if (Build.VERSION.SDK_INT >= 26 && !this.f19921f.f23214d) {
                    editorInfo.imeOptions = 33554432 | 16777216;
                }
                Integer num = this.f19921f.f23218h;
                int intValue = num == null ? (t & 131072) != 0 ? 1 : 6 : num.intValue();
                C4591p.C4593b bVar2 = this.f19921f;
                String str = bVar2.f23219i;
                if (str != null) {
                    editorInfo.actionLabel = str;
                    editorInfo.actionId = intValue;
                }
                editorInfo.imeOptions = intValue | editorInfo.imeOptions;
                String[] strArr = bVar2.f23221k;
                if (strArr != null) {
                    C3994a.m26224d(editorInfo, strArr);
                }
                C2979b bVar3 = new C2979b(view, this.f19920e.f19937b, this.f19919d, sVar, this.f19923h, editorInfo);
                editorInfo.initialSelStart = this.f19923h.mo13587i();
                editorInfo.initialSelEnd = this.f19923h.mo13586h();
                this.f19925j = bVar3;
                return bVar3;
            } else if (this.f19930o) {
                return this.f19925j;
            } else {
                InputConnection onCreateInputConnection = this.f19926k.mo13690c(cVar.f19937b).onCreateInputConnection(editorInfo);
                this.f19925j = onCreateInputConnection;
                return onCreateInputConnection;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: p */
    public void mo13610p() {
        this.f19926k.mo13707L();
        this.f19919d.mo16262n((C4591p.C4598f) null);
        m23153y();
        this.f19923h.mo13588l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f19928m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* renamed from: q */
    public InputMethodManager mo13611q() {
        return this.f19917b;
    }

    /* renamed from: r */
    public boolean mo13612r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!mo13611q().isAcceptingText() || (inputConnection = this.f19925j) == null) {
            return false;
        }
        return inputConnection instanceof C2979b ? ((C2979b) inputConnection).mo13567f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    /* renamed from: u */
    public void mo13613u() {
        if (this.f19920e.f19936a == C2989c.C2990a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f19930o = true;
        }
    }

    /* renamed from: z */
    public void mo13614z(ViewStructure viewStructure, int i) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        ViewStructure viewStructure3 = viewStructure;
        if (Build.VERSION.SDK_INT >= 26 && m23150v()) {
            String str = this.f19921f.f23220j.f23223a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i2 = 0; i2 < this.f19922g.size(); i2++) {
                int keyAt = this.f19922g.keyAt(i2);
                C4591p.C4593b.C4594a aVar = this.f19922g.valueAt(i2).f23220j;
                if (aVar != null) {
                    viewStructure3.addChildCount(1);
                    ViewStructure newChild = viewStructure3.newChild(i2);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = aVar.f23224b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = aVar.f23226d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.f19927l) == null) {
                        viewStructure2 = newChild;
                        viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                        charSequence = aVar.f23225c.f23236a;
                    } else {
                        viewStructure2 = newChild;
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f19927l.height());
                        charSequence = this.f19923h;
                    }
                    viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
                }
            }
        }
    }
}
