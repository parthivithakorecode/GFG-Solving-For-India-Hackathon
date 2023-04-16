package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p009os.C0674a;
import androidx.core.view.accessibility.C0755e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p109p.C3879e;

/* renamed from: androidx.core.view.accessibility.b */
public class C0750b {

    /* renamed from: d */
    private static int f2130d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f2131a;

    /* renamed from: b */
    public int f2132b = -1;

    /* renamed from: c */
    private int f2133c = -1;

    /* renamed from: androidx.core.view.accessibility.b$a */
    public static class C0751a {

        /* renamed from: A */
        public static final C0751a f2134A;

        /* renamed from: B */
        public static final C0751a f2135B;

        /* renamed from: C */
        public static final C0751a f2136C;

        /* renamed from: D */
        public static final C0751a f2137D;

        /* renamed from: E */
        public static final C0751a f2138E;

        /* renamed from: F */
        public static final C0751a f2139F;

        /* renamed from: G */
        public static final C0751a f2140G;

        /* renamed from: H */
        public static final C0751a f2141H;

        /* renamed from: I */
        public static final C0751a f2142I;

        /* renamed from: J */
        public static final C0751a f2143J;

        /* renamed from: K */
        public static final C0751a f2144K;

        /* renamed from: L */
        public static final C0751a f2145L;

        /* renamed from: M */
        public static final C0751a f2146M;

        /* renamed from: N */
        public static final C0751a f2147N;

        /* renamed from: O */
        public static final C0751a f2148O;

        /* renamed from: P */
        public static final C0751a f2149P;

        /* renamed from: Q */
        public static final C0751a f2150Q;

        /* renamed from: e */
        public static final C0751a f2151e = new C0751a(1, (CharSequence) null);

        /* renamed from: f */
        public static final C0751a f2152f = new C0751a(2, (CharSequence) null);

        /* renamed from: g */
        public static final C0751a f2153g = new C0751a(4, (CharSequence) null);

        /* renamed from: h */
        public static final C0751a f2154h = new C0751a(8, (CharSequence) null);

        /* renamed from: i */
        public static final C0751a f2155i = new C0751a(16, (CharSequence) null);

        /* renamed from: j */
        public static final C0751a f2156j = new C0751a(32, (CharSequence) null);

        /* renamed from: k */
        public static final C0751a f2157k = new C0751a(64, (CharSequence) null);

        /* renamed from: l */
        public static final C0751a f2158l = new C0751a(128, (CharSequence) null);

        /* renamed from: m */
        public static final C0751a f2159m;

        /* renamed from: n */
        public static final C0751a f2160n;

        /* renamed from: o */
        public static final C0751a f2161o;

        /* renamed from: p */
        public static final C0751a f2162p;

        /* renamed from: q */
        public static final C0751a f2163q = new C0751a(4096, (CharSequence) null);

        /* renamed from: r */
        public static final C0751a f2164r = new C0751a(8192, (CharSequence) null);

        /* renamed from: s */
        public static final C0751a f2165s = new C0751a(16384, (CharSequence) null);

        /* renamed from: t */
        public static final C0751a f2166t = new C0751a(32768, (CharSequence) null);

        /* renamed from: u */
        public static final C0751a f2167u = new C0751a(65536, (CharSequence) null);

        /* renamed from: v */
        public static final C0751a f2168v = new C0751a(131072, (CharSequence) null, C0755e.C0762g.class);

        /* renamed from: w */
        public static final C0751a f2169w = new C0751a(262144, (CharSequence) null);

        /* renamed from: x */
        public static final C0751a f2170x = new C0751a(524288, (CharSequence) null);

        /* renamed from: y */
        public static final C0751a f2171y = new C0751a(1048576, (CharSequence) null);

        /* renamed from: z */
        public static final C0751a f2172z = new C0751a(2097152, (CharSequence) null, C0755e.C0763h.class);

        /* renamed from: a */
        final Object f2173a;

        /* renamed from: b */
        private final int f2174b;

        /* renamed from: c */
        private final Class<? extends C0755e.C0756a> f2175c;

        /* renamed from: d */
        protected final C0755e f2176d;

        static {
            Class<C0755e.C0758c> cls = C0755e.C0758c.class;
            Class<C0755e.C0757b> cls2 = C0755e.C0757b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f2159m = new C0751a(256, (CharSequence) null, cls2);
            f2160n = new C0751a(512, (CharSequence) null, cls2);
            f2161o = new C0751a(1024, (CharSequence) null, cls);
            f2162p = new C0751a(2048, (CharSequence) null, cls);
            int i = Build.VERSION.SDK_INT;
            f2134A = new C0751a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2135B = new C0751a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C0755e) null, C0755e.C0760e.class);
            f2136C = new C0751a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2137D = new C0751a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2138E = new C0751a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2139F = new C0751a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2140G = new C0751a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2141H = new C0751a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2142I = new C0751a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2143J = new C0751a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2144K = new C0751a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2145L = new C0751a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C0755e) null, C0755e.C0761f.class);
            f2146M = new C0751a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C0755e) null, C0755e.C0759d.class);
            f2147N = new C0751a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2148O = new C0751a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            f2149P = new C0751a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f2150Q = new C0751a(accessibilityAction, 16908372, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
        }

        public C0751a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
        }

        private C0751a(int i, CharSequence charSequence, Class<? extends C0755e.C0756a> cls) {
            this((Object) null, i, charSequence, (C0755e) null, cls);
        }

        C0751a(Object obj) {
            this(obj, 0, (CharSequence) null, (C0755e) null, (Class<? extends C0755e.C0756a>) null);
        }

        C0751a(Object obj, int i, CharSequence charSequence, C0755e eVar, Class<? extends C0755e.C0756a> cls) {
            this.f2174b = i;
            this.f2176d = eVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f2173a = obj;
            this.f2175c = cls;
        }

        /* renamed from: a */
        public int mo2816a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2173a).getId();
            }
            return 0;
        }

        /* renamed from: b */
        public CharSequence mo2817b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2173a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2818c(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.e r0 = r4.f2176d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.e$a> r2 = r4.f2175c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                androidx.core.view.accessibility.e$a r1 = (androidx.core.view.accessibility.C0755e.C0756a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo2823a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends androidx.core.view.accessibility.e$a> r1 = r4.f2175c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                androidx.core.view.accessibility.e r6 = r4.f2176d
                boolean r5 = r6.mo2822a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.C0750b.C0751a.mo2818c(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0751a)) {
                return false;
            }
            Object obj2 = this.f2173a;
            Object obj3 = ((C0751a) obj).f2173a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f2173a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    private C0750b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2131a = accessibilityNodeInfo;
    }

    /* renamed from: G */
    private void m2980G(View view) {
        SparseArray<WeakReference<ClickableSpan>> q = m2989q(view);
        if (q != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < q.size(); i++) {
                if (q.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                q.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: H */
    private void m2981H(int i, boolean z) {
        Bundle n = mo2806n();
        if (n != null) {
            int i2 = n.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            n.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: P */
    public static C0750b m2982P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0750b(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private void m2983b(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: d */
    private void m2984d() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2131a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2131a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2131a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2131a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: e */
    private List<Integer> m2985e(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2131a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f2131a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: g */
    private static String m2986g(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: l */
    public static ClickableSpan[] m2987l(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: o */
    private SparseArray<WeakReference<ClickableSpan>> m2988o(View view) {
        SparseArray<WeakReference<ClickableSpan>> q = m2989q(view);
        if (q != null) {
            return q;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C3879e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: q */
    private SparseArray<WeakReference<ClickableSpan>> m2989q(View view) {
        return (SparseArray) view.getTag(C3879e.tag_accessibility_clickable_spans);
    }

    /* renamed from: t */
    private boolean m2990t() {
        return !m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: u */
    private int m2991u(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f2130d;
        f2130d = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean mo2783A() {
        return this.f2131a.isFocused();
    }

    /* renamed from: B */
    public boolean mo2784B() {
        return this.f2131a.isLongClickable();
    }

    /* renamed from: C */
    public boolean mo2785C() {
        return this.f2131a.isPassword();
    }

    /* renamed from: D */
    public boolean mo2786D() {
        return this.f2131a.isScrollable();
    }

    /* renamed from: E */
    public boolean mo2787E() {
        return this.f2131a.isSelected();
    }

    /* renamed from: F */
    public boolean mo2788F(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2131a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: I */
    public void mo2789I(CharSequence charSequence) {
        this.f2131a.setClassName(charSequence);
    }

    /* renamed from: J */
    public void mo2790J(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2131a.setHeading(z);
        } else {
            m2981H(2, z);
        }
    }

    /* renamed from: K */
    public void mo2791K(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f2131a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f2131a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: L */
    public void mo2792L(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2131a.setScreenReaderFocusable(z);
        } else {
            m2981H(1, z);
        }
    }

    /* renamed from: M */
    public void mo2793M(boolean z) {
        this.f2131a.setScrollable(z);
    }

    /* renamed from: N */
    public void mo2794N(CharSequence charSequence) {
        if (C0674a.m2808b()) {
            this.f2131a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f2131a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: O */
    public AccessibilityNodeInfo mo2795O() {
        return this.f2131a;
    }

    /* renamed from: a */
    public void mo2796a(C0751a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2131a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2173a);
        }
    }

    /* renamed from: c */
    public void mo2797c(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m2984d();
            m2980G(view);
            ClickableSpan[] l = m2987l(charSequence);
            if (l != null && l.length > 0) {
                mo2806n().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C3879e.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> o = m2988o(view);
                for (int i2 = 0; i2 < l.length; i2++) {
                    int u = m2991u(l[i2], o);
                    o.put(u, new WeakReference(l[i2]));
                    m2983b(l[i2], (Spanned) charSequence, u);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0750b)) {
            return false;
        }
        C0750b bVar = (C0750b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2131a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f2131a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f2131a)) {
            return false;
        }
        return this.f2133c == bVar.f2133c && this.f2132b == bVar.f2132b;
    }

    /* renamed from: f */
    public List<C0751a> mo2799f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2131a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0751a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: h */
    public int mo2800h() {
        return this.f2131a.getActions();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2131a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public void mo2802i(Rect rect) {
        this.f2131a.getBoundsInParent(rect);
    }

    /* renamed from: j */
    public void mo2803j(Rect rect) {
        this.f2131a.getBoundsInScreen(rect);
    }

    /* renamed from: k */
    public CharSequence mo2804k() {
        return this.f2131a.getClassName();
    }

    /* renamed from: m */
    public CharSequence mo2805m() {
        return this.f2131a.getContentDescription();
    }

    /* renamed from: n */
    public Bundle mo2806n() {
        return Build.VERSION.SDK_INT >= 19 ? this.f2131a.getExtras() : new Bundle();
    }

    /* renamed from: p */
    public CharSequence mo2807p() {
        return this.f2131a.getPackageName();
    }

    /* renamed from: r */
    public CharSequence mo2808r() {
        if (!m2990t()) {
            return this.f2131a.getText();
        }
        List<Integer> e = m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> e2 = m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> e3 = m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> e4 = m2985e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2131a.getText(), 0, this.f2131a.getText().length()));
        for (int i = 0; i < e.size(); i++) {
            spannableString.setSpan(new C0749a(e4.get(i).intValue(), this, mo2806n().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), e.get(i).intValue(), e2.get(i).intValue(), e3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: s */
    public String mo2809s() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2131a.getViewIdResourceName();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo2802i(rect);
        sb.append("; boundsInParent: " + rect);
        mo2803j(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo2807p());
        sb.append("; className: ");
        sb.append(mo2804k());
        sb.append("; text: ");
        sb.append(mo2808r());
        sb.append("; contentDescription: ");
        sb.append(mo2805m());
        sb.append("; viewId: ");
        sb.append(mo2809s());
        sb.append("; checkable: ");
        sb.append(mo2811v());
        sb.append("; checked: ");
        sb.append(mo2812w());
        sb.append("; focusable: ");
        sb.append(mo2815z());
        sb.append("; focused: ");
        sb.append(mo2783A());
        sb.append("; selected: ");
        sb.append(mo2787E());
        sb.append("; clickable: ");
        sb.append(mo2813x());
        sb.append("; longClickable: ");
        sb.append(mo2784B());
        sb.append("; enabled: ");
        sb.append(mo2814y());
        sb.append("; password: ");
        sb.append(mo2785C());
        sb.append("; scrollable: " + mo2786D());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C0751a> f = mo2799f();
            for (int i = 0; i < f.size(); i++) {
                C0751a aVar = f.get(i);
                String g = m2986g(aVar.mo2816a());
                if (g.equals("ACTION_UNKNOWN") && aVar.mo2817b() != null) {
                    g = aVar.mo2817b().toString();
                }
                sb.append(g);
                if (i != f.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int h = mo2800h();
            while (h != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(h);
                h &= ~numberOfTrailingZeros;
                sb.append(m2986g(numberOfTrailingZeros));
                if (h != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: v */
    public boolean mo2811v() {
        return this.f2131a.isCheckable();
    }

    /* renamed from: w */
    public boolean mo2812w() {
        return this.f2131a.isChecked();
    }

    /* renamed from: x */
    public boolean mo2813x() {
        return this.f2131a.isClickable();
    }

    /* renamed from: y */
    public boolean mo2814y() {
        return this.f2131a.isEnabled();
    }

    /* renamed from: z */
    public boolean mo2815z() {
        return this.f2131a.isFocusable();
    }
}
