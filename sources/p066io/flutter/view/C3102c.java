package p066io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p064i4.C2850d;
import p064i4.C2854h;
import p066io.flutter.plugin.platform.C3015k;
import p099n3.C3768b;
import p174z3.C4540a;

/* renamed from: io.flutter.view.c */
public class C3102c extends AccessibilityNodeProvider {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final int f20242A = (((((((((((C3111i.HAS_CHECKED_STATE.f20341f | C3111i.IS_CHECKED.f20341f) | C3111i.IS_SELECTED.f20341f) | C3111i.IS_TEXT_FIELD.f20341f) | C3111i.IS_FOCUSED.f20341f) | C3111i.HAS_ENABLED_STATE.f20341f) | C3111i.IS_ENABLED.f20341f) | C3111i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f20341f) | C3111i.HAS_TOGGLED_STATE.f20341f) | C3111i.IS_TOGGLED.f20341f) | C3111i.IS_FOCUSABLE.f20341f) | C3111i.IS_SLIDER.f20341f);

    /* renamed from: B */
    private static int f20243B = 267386881;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final int f20244z = (((C3109g.SCROLL_RIGHT.f20308f | C3109g.SCROLL_LEFT.f20308f) | C3109g.SCROLL_UP.f20308f) | C3109g.SCROLL_DOWN.f20308f);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final View f20245a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4540a f20246b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AccessibilityManager f20247c;

    /* renamed from: d */
    private final AccessibilityViewEmbedder f20248d;

    /* renamed from: e */
    private final C3015k f20249e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ContentResolver f20250f;

    /* renamed from: g */
    private final Map<Integer, C3114l> f20251g;

    /* renamed from: h */
    private final Map<Integer, C3110h> f20252h;

    /* renamed from: i */
    private C3114l f20253i;

    /* renamed from: j */
    private Integer f20254j;

    /* renamed from: k */
    private Integer f20255k;

    /* renamed from: l */
    private int f20256l;

    /* renamed from: m */
    private C3114l f20257m;

    /* renamed from: n */
    private C3114l f20258n;

    /* renamed from: o */
    private C3114l f20259o;

    /* renamed from: p */
    private final List<Integer> f20260p;

    /* renamed from: q */
    private int f20261q;

    /* renamed from: r */
    private Integer f20262r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C3113k f20263s;

    /* renamed from: t */
    private boolean f20264t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f20265u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C4540a.C4542b f20266v;

    /* renamed from: w */
    private final AccessibilityManager.AccessibilityStateChangeListener f20267w;
    @TargetApi(19)

    /* renamed from: x */
    private final AccessibilityManager.TouchExplorationStateChangeListener f20268x;

    /* renamed from: y */
    private final ContentObserver f20269y;

    /* renamed from: io.flutter.view.c$a */
    class C3103a implements C4540a.C4542b {
        C3103a() {
        }

        /* renamed from: a */
        public void mo13945a(String str) {
            C3102c.this.f20245a.announceForAccessibility(str);
        }

        /* renamed from: b */
        public void mo13468b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer order : byteBufferArr) {
                order.order(ByteOrder.LITTLE_ENDIAN);
            }
            C3102c.this.mo13940b0(byteBuffer, strArr, byteBufferArr);
        }

        /* renamed from: c */
        public void mo13469c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            C3102c.this.mo13939a0(byteBuffer, strArr);
        }

        /* renamed from: d */
        public void mo13946d(String str) {
            if (Build.VERSION.SDK_INT < 28) {
                AccessibilityEvent k = C3102c.this.m23637H(0, 32);
                k.getText().add(str);
                C3102c.this.m23644S(k);
            }
        }

        /* renamed from: e */
        public void mo13947e(int i) {
            C3102c.this.m23643R(i, 2);
        }

        /* renamed from: f */
        public void mo13948f(int i) {
            C3102c.this.m23643R(i, 1);
        }
    }

    /* renamed from: io.flutter.view.c$b */
    class C3104b implements AccessibilityManager.AccessibilityStateChangeListener {
        C3104b() {
        }

        public void onAccessibilityStateChanged(boolean z) {
            if (!C3102c.this.f20265u) {
                C3102c cVar = C3102c.this;
                if (z) {
                    cVar.f20246b.mo16222g(C3102c.this.f20266v);
                    C3102c.this.f20246b.mo16220e();
                } else {
                    cVar.m23648W(false);
                    C3102c.this.f20246b.mo16222g((C4540a.C4542b) null);
                    C3102c.this.f20246b.mo16219d();
                }
                if (C3102c.this.f20263s != null) {
                    C3102c.this.f20263s.mo13382a(z, C3102c.this.f20247c.isTouchExplorationEnabled());
                }
            }
        }
    }

    /* renamed from: io.flutter.view.c$c */
    class C3105c extends ContentObserver {
        C3105c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            onChange(z, (Uri) null);
        }

        public void onChange(boolean z, Uri uri) {
            if (!C3102c.this.f20265u) {
                String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(C3102c.this.f20250f, "transition_animation_scale");
                if (string != null && string.equals("0")) {
                    C3102c.m23658g(C3102c.this, C3108f.DISABLE_ANIMATIONS.f20284f);
                } else {
                    C3102c.m23657f(C3102c.this, ~C3108f.DISABLE_ANIMATIONS.f20284f);
                }
                C3102c.this.m23645T();
            }
        }
    }

    /* renamed from: io.flutter.view.c$d */
    class C3106d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ AccessibilityManager f20273a;

        C3106d(AccessibilityManager accessibilityManager) {
            this.f20273a = accessibilityManager;
        }

        public void onTouchExplorationStateChanged(boolean z) {
            if (!C3102c.this.f20265u) {
                if (!z) {
                    C3102c.this.m23648W(false);
                    C3102c.this.m23638L();
                }
                if (C3102c.this.f20263s != null) {
                    C3102c.this.f20263s.mo13382a(this.f20273a.isEnabled(), z);
                }
            }
        }
    }

    /* renamed from: io.flutter.view.c$e */
    static /* synthetic */ class C3107e {

        /* renamed from: a */
        static final /* synthetic */ int[] f20275a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.view.c$o[] r0 = p066io.flutter.view.C3102c.C3117o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20275a = r0
                io.flutter.view.c$o r1 = p066io.flutter.view.C3102c.C3117o.SPELLOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.view.c$o r1 = p066io.flutter.view.C3102c.C3117o.LOCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.view.C3102c.C3107e.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.view.c$f */
    private enum C3108f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        

        /* renamed from: f */
        final int f20284f;

        private C3108f(int i) {
            this.f20284f = i;
        }
    }

    /* renamed from: io.flutter.view.c$g */
    public enum C3109g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        

        /* renamed from: f */
        public final int f20308f;

        private C3109g(int i) {
            this.f20308f = i;
        }
    }

    /* renamed from: io.flutter.view.c$h */
    private static class C3110h {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f20309a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f20310b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f20311c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f20312d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f20313e;

        C3110h() {
        }
    }

    /* renamed from: io.flutter.view.c$i */
    enum C3111i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432);
        

        /* renamed from: f */
        final int f20341f;

        private C3111i(int i) {
            this.f20341f = i;
        }
    }

    /* renamed from: io.flutter.view.c$j */
    private static class C3112j extends C3116n {

        /* renamed from: d */
        String f20342d;

        private C3112j() {
            super((C3103a) null);
        }

        /* synthetic */ C3112j(C3103a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.c$k */
    public interface C3113k {
        /* renamed from: a */
        void mo13382a(boolean z, boolean z2);
    }

    /* renamed from: io.flutter.view.c$l */
    private static class C3114l {

        /* renamed from: A */
        private C3118p f20343A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public boolean f20344B = false;

        /* renamed from: C */
        private int f20345C;

        /* renamed from: D */
        private int f20346D;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public int f20347E;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public int f20348F;

        /* renamed from: G */
        private float f20349G;

        /* renamed from: H */
        private float f20350H;

        /* renamed from: I */
        private float f20351I;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public String f20352J;

        /* renamed from: K */
        private String f20353K;

        /* renamed from: L */
        private float f20354L;

        /* renamed from: M */
        private float f20355M;

        /* renamed from: N */
        private float f20356N;

        /* renamed from: O */
        private float f20357O;

        /* renamed from: P */
        private float[] f20358P;
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public C3114l f20359Q;
        /* access modifiers changed from: private */

        /* renamed from: R */
        public List<C3114l> f20360R = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: S */
        public List<C3114l> f20361S = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: T */
        public List<C3110h> f20362T;
        /* access modifiers changed from: private */

        /* renamed from: U */
        public C3110h f20363U;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public C3110h f20364V;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public boolean f20365W = true;

        /* renamed from: X */
        private float[] f20366X;
        /* access modifiers changed from: private */

        /* renamed from: Y */
        public boolean f20367Y = true;

        /* renamed from: Z */
        private float[] f20368Z;

        /* renamed from: a */
        final C3102c f20369a;

        /* renamed from: a0 */
        private Rect f20370a0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f20371b = -1;

        /* renamed from: c */
        private int f20372c;

        /* renamed from: d */
        private int f20373d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f20374e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f20375f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f20376g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f20377h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f20378i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f20379j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f20380k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public float f20381l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public float f20382m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public float f20383n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public String f20384o;

        /* renamed from: p */
        private List<C3116n> f20385p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public String f20386q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public List<C3116n> f20387r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public String f20388s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public List<C3116n> f20389t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public String f20390u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public List<C3116n> f20391v;

        /* renamed from: w */
        private String f20392w;

        /* renamed from: x */
        private List<C3116n> f20393x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public String f20394y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public int f20395z = -1;

        C3114l(C3102c cVar) {
            this.f20369a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: A0 */
        public static boolean m23705A0(C3114l lVar, C2850d<C3114l> dVar) {
            return (lVar == null || lVar.m23753j0(dVar) == null) ? false : true;
        }

        /* renamed from: B0 */
        private void m23707B0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        /* access modifiers changed from: private */
        /* renamed from: C0 */
        public void m23709C0(float[] fArr, Set<C3114l> set, boolean z) {
            set.add(this);
            if (this.f20367Y) {
                z = true;
            }
            if (z) {
                if (this.f20368Z == null) {
                    this.f20368Z = new float[16];
                }
                if (this.f20358P == null) {
                    this.f20358P = new float[16];
                }
                Matrix.multiplyMM(this.f20368Z, 0, fArr, 0, this.f20358P, 0);
                float[] fArr2 = new float[4];
                fArr2[2] = 0.0f;
                fArr2[3] = 1.0f;
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                fArr2[0] = this.f20354L;
                fArr2[1] = this.f20355M;
                m23707B0(fArr3, this.f20368Z, fArr2);
                fArr2[0] = this.f20356N;
                fArr2[1] = this.f20355M;
                m23707B0(fArr4, this.f20368Z, fArr2);
                fArr2[0] = this.f20356N;
                fArr2[1] = this.f20357O;
                m23707B0(fArr5, this.f20368Z, fArr2);
                fArr2[0] = this.f20354L;
                fArr2[1] = this.f20357O;
                m23707B0(fArr6, this.f20368Z, fArr2);
                if (this.f20370a0 == null) {
                    this.f20370a0 = new Rect();
                }
                this.f20370a0.set(Math.round(m23785z0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(m23785z0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(m23783y0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(m23783y0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f20367Y = false;
            }
            int i = -1;
            for (C3114l next : this.f20360R) {
                next.f20395z = i;
                i = next.f20371b;
                next.m23709C0(this.f20368Z, set, z);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: D0 */
        public void m23711D0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.f20344B = true;
            this.f20352J = this.f20386q;
            this.f20353K = this.f20384o;
            this.f20345C = this.f20372c;
            this.f20346D = this.f20373d;
            this.f20347E = this.f20376g;
            this.f20348F = this.f20377h;
            this.f20349G = this.f20381l;
            this.f20350H = this.f20382m;
            this.f20351I = this.f20383n;
            this.f20372c = byteBuffer.getInt();
            this.f20373d = byteBuffer.getInt();
            this.f20374e = byteBuffer.getInt();
            this.f20375f = byteBuffer.getInt();
            this.f20376g = byteBuffer.getInt();
            this.f20377h = byteBuffer.getInt();
            this.f20378i = byteBuffer.getInt();
            this.f20379j = byteBuffer.getInt();
            this.f20380k = byteBuffer.getInt();
            this.f20381l = byteBuffer.getFloat();
            this.f20382m = byteBuffer.getFloat();
            this.f20383n = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            this.f20384o = i == -1 ? null : strArr[i];
            this.f20385p = m23763o0(byteBuffer, byteBufferArr);
            int i2 = byteBuffer.getInt();
            this.f20386q = i2 == -1 ? null : strArr[i2];
            this.f20387r = m23763o0(byteBuffer, byteBufferArr);
            int i3 = byteBuffer.getInt();
            this.f20388s = i3 == -1 ? null : strArr[i3];
            this.f20389t = m23763o0(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            this.f20390u = i4 == -1 ? null : strArr[i4];
            this.f20391v = m23763o0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.f20392w = i5 == -1 ? null : strArr[i5];
            this.f20393x = m23763o0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.f20394y = i6 == -1 ? null : strArr[i6];
            this.f20343A = C3118p.m23786b(byteBuffer.getInt());
            this.f20354L = byteBuffer.getFloat();
            this.f20355M = byteBuffer.getFloat();
            this.f20356N = byteBuffer.getFloat();
            this.f20357O = byteBuffer.getFloat();
            if (this.f20358P == null) {
                this.f20358P = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                this.f20358P[i7] = byteBuffer.getFloat();
            }
            this.f20365W = true;
            this.f20367Y = true;
            int i8 = byteBuffer.getInt();
            this.f20360R.clear();
            this.f20361S.clear();
            for (int i9 = 0; i9 < i8; i9++) {
                C3114l o = this.f20369a.m23632A(byteBuffer.getInt());
                o.f20359Q = this;
                this.f20360R.add(o);
            }
            for (int i10 = 0; i10 < i8; i10++) {
                C3114l o2 = this.f20369a.m23632A(byteBuffer.getInt());
                o2.f20359Q = this;
                this.f20361S.add(o2);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                this.f20362T = null;
                return;
            }
            List<C3110h> list = this.f20362T;
            if (list == null) {
                this.f20362T = new ArrayList(i11);
            } else {
                list.clear();
            }
            for (int i12 = 0; i12 < i11; i12++) {
                C3110h q = this.f20369a.m23676z(byteBuffer.getInt());
                if (q.f20311c == C3109g.TAP.f20308f) {
                    this.f20363U = q;
                } else if (q.f20311c == C3109g.LONG_PRESS.f20308f) {
                    this.f20364V = q;
                } else {
                    this.f20362T.add(q);
                }
                this.f20362T.add(q);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e0 */
        public void m23743e0(List<C3114l> list) {
            if (m23777v0(C3111i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (C3114l e0 : this.f20360R) {
                e0.m23743e0(list);
            }
        }

        @TargetApi(21)
        /* renamed from: f0 */
        private SpannableString m23745f0(String str, List<C3116n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (C3116n next : list) {
                    int i = C3107e.f20275a[next.f20398c.ordinal()];
                    if (i == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), next.f20396a, next.f20397b, 0);
                    } else if (i == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((C3112j) next).f20342d)), next.f20396a, next.f20397b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            r2 = r3.f20353K;
         */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean m23747g0() {
            /*
                r3 = this;
                java.lang.String r0 = r3.f20384o
                r1 = 0
                if (r0 != 0) goto L_0x000a
                java.lang.String r2 = r3.f20353K
                if (r2 != 0) goto L_0x000a
                return r1
            L_0x000a:
                if (r0 == 0) goto L_0x0016
                java.lang.String r2 = r3.f20353K
                if (r2 == 0) goto L_0x0016
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0017
            L_0x0016:
                r1 = 1
            L_0x0017:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.view.C3102c.C3114l.m23747g0():boolean");
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public boolean m23749h0() {
            return !Float.isNaN(this.f20381l) && !Float.isNaN(this.f20349G) && this.f20349G != this.f20381l;
        }

        /* renamed from: i0 */
        private void m23751i0() {
            if (this.f20365W) {
                this.f20365W = false;
                if (this.f20366X == null) {
                    this.f20366X = new float[16];
                }
                if (!Matrix.invertM(this.f20366X, 0, this.f20358P, 0)) {
                    Arrays.fill(this.f20366X, 0.0f);
                }
            }
        }

        /* renamed from: j0 */
        private C3114l m23753j0(C2850d<C3114l> dVar) {
            for (C3114l lVar = this.f20359Q; lVar != null; lVar = lVar.f20359Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: k0 */
        public Rect m23755k0() {
            return this.f20370a0;
        }

        /* renamed from: l0 */
        private CharSequence m23757l0() {
            return Build.VERSION.SDK_INT < 21 ? this.f20392w : m23745f0(this.f20392w, this.f20393x);
        }

        /* renamed from: m */
        static /* synthetic */ int m23758m(C3114l lVar, int i) {
            int i2 = lVar.f20377h + i;
            lVar.f20377h = i2;
            return i2;
        }

        /* renamed from: m0 */
        private CharSequence m23759m0() {
            return Build.VERSION.SDK_INT < 21 ? this.f20384o : m23745f0(this.f20384o, this.f20385p);
        }

        /* renamed from: n */
        static /* synthetic */ int m23760n(C3114l lVar, int i) {
            int i2 = lVar.f20377h - i;
            lVar.f20377h = i2;
            return i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: n0 */
        public String m23761n0() {
            String str;
            if (m23777v0(C3111i.NAMES_ROUTE) && (str = this.f20384o) != null && !str.isEmpty()) {
                return this.f20384o;
            }
            for (C3114l n0 : this.f20360R) {
                String n02 = n0.m23761n0();
                if (n02 != null && !n02.isEmpty()) {
                    return n02;
                }
            }
            return null;
        }

        /* renamed from: o0 */
        private List<C3116n> m23763o0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i = byteBuffer.getInt();
            if (i == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                int i4 = byteBuffer.getInt();
                C3117o oVar = C3117o.values()[byteBuffer.getInt()];
                int i5 = C3107e.f20275a[oVar.ordinal()];
                if (i5 == 1) {
                    byteBuffer.getInt();
                    C3115m mVar = new C3115m((C3103a) null);
                    mVar.f20396a = i3;
                    mVar.f20397b = i4;
                    mVar.f20398c = oVar;
                    arrayList.add(mVar);
                } else if (i5 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    C3112j jVar = new C3112j((C3103a) null);
                    jVar.f20396a = i3;
                    jVar.f20397b = i4;
                    jVar.f20398c = oVar;
                    jVar.f20342d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: p0 */
        public CharSequence m23765p0() {
            CharSequence[] charSequenceArr = {m23759m0(), m23757l0()};
            CharSequence charSequence = null;
            for (int i = 0; i < 2; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        /* renamed from: q0 */
        public CharSequence m23767q0() {
            return Build.VERSION.SDK_INT < 21 ? this.f20386q : m23745f0(this.f20386q, this.f20387r);
        }

        /* access modifiers changed from: private */
        /* renamed from: r0 */
        public CharSequence m23769r0() {
            CharSequence[] charSequenceArr = {m23767q0(), m23759m0(), m23757l0()};
            CharSequence charSequence = null;
            for (int i = 0; i < 3; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        /* renamed from: s0 */
        public boolean m23771s0(C3109g gVar) {
            return (gVar.f20308f & this.f20346D) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: t0 */
        public boolean m23773t0(C3111i iVar) {
            return (iVar.f20341f & this.f20345C) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: u0 */
        public boolean m23775u0(C3109g gVar) {
            return (gVar.f20308f & this.f20373d) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: v0 */
        public boolean m23777v0(C3111i iVar) {
            return (iVar.f20341f & this.f20372c) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: w0 */
        public C3114l m23779w0(float[] fArr, boolean z) {
            float f = fArr[3];
            boolean z2 = false;
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.f20354L || f2 >= this.f20356N || f3 < this.f20355M || f3 >= this.f20357O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (C3114l next : this.f20361S) {
                if (!next.m23777v0(C3111i.IS_HIDDEN)) {
                    next.m23751i0();
                    Matrix.multiplyMV(fArr2, 0, next.f20366X, 0, fArr, 0);
                    C3114l w0 = next.m23779w0(fArr2, z);
                    if (w0 != null) {
                        return w0;
                    }
                }
            }
            if (z && this.f20378i != -1) {
                z2 = true;
            }
            if (m23781x0() || z2) {
                return this;
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            r0 = r4.f20384o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            r0 = r4.f20386q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            r0 = r4.f20392w;
         */
        /* renamed from: x0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean m23781x0() {
            /*
                r4 = this;
                io.flutter.view.c$i r0 = p066io.flutter.view.C3102c.C3111i.SCOPES_ROUTE
                boolean r0 = r4.m23777v0(r0)
                r1 = 0
                if (r0 == 0) goto L_0x000a
                return r1
            L_0x000a:
                io.flutter.view.c$i r0 = p066io.flutter.view.C3102c.C3111i.IS_FOCUSABLE
                boolean r0 = r4.m23777v0(r0)
                r2 = 1
                if (r0 == 0) goto L_0x0014
                return r2
            L_0x0014:
                int r0 = r4.f20373d
                int r3 = p066io.flutter.view.C3102c.f20244z
                int r3 = ~r3
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                int r0 = r4.f20372c
                int r3 = p066io.flutter.view.C3102c.f20242A
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                java.lang.String r0 = r4.f20384o
                if (r0 == 0) goto L_0x0031
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x0031:
                java.lang.String r0 = r4.f20386q
                if (r0 == 0) goto L_0x003b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x003b:
                java.lang.String r0 = r4.f20392w
                if (r0 == 0) goto L_0x0046
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0046
            L_0x0045:
                r1 = r2
            L_0x0046:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.view.C3102c.C3114l.m23781x0():boolean");
        }

        /* renamed from: y0 */
        private float m23783y0(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        /* renamed from: z0 */
        private float m23785z0(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }
    }

    /* renamed from: io.flutter.view.c$m */
    private static class C3115m extends C3116n {
        private C3115m() {
            super((C3103a) null);
        }

        /* synthetic */ C3115m(C3103a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.c$n */
    private static class C3116n {

        /* renamed from: a */
        int f20396a;

        /* renamed from: b */
        int f20397b;

        /* renamed from: c */
        C3117o f20398c;

        private C3116n() {
        }

        /* synthetic */ C3116n(C3103a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.c$o */
    private enum C3117o {
        SPELLOUT,
        LOCALE
    }

    /* renamed from: io.flutter.view.c$p */
    private enum C3118p {
        UNKNOWN,
        LTR,
        RTL;

        /* renamed from: b */
        public static C3118p m23786b(int i) {
            return i != 1 ? i != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public C3102c(View view, C4540a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, C3015k kVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), kVar);
    }

    public C3102c(View view, C4540a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, C3015k kVar) {
        this.f20251g = new HashMap();
        this.f20252h = new HashMap();
        this.f20256l = 0;
        this.f20260p = new ArrayList();
        this.f20261q = 0;
        this.f20262r = 0;
        this.f20264t = false;
        this.f20265u = false;
        this.f20266v = new C3103a();
        C3104b bVar = new C3104b();
        this.f20267w = bVar;
        C3105c cVar = new C3105c(new Handler());
        this.f20269y = cVar;
        this.f20245a = view;
        this.f20246b = aVar;
        this.f20247c = accessibilityManager;
        this.f20250f = contentResolver;
        this.f20248d = accessibilityViewEmbedder;
        this.f20249e = kVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            C3106d dVar = new C3106d(accessibilityManager);
            this.f20268x = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        } else {
            this.f20268x = null;
        }
        if (i >= 17) {
            cVar.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        }
        if (i >= 31) {
            m23649X();
        }
        kVar.mo13688a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public C3114l m23632A(int i) {
        C3114l lVar = this.f20251g.get(Integer.valueOf(i));
        if (lVar != null) {
            return lVar;
        }
        C3114l lVar2 = new C3114l(this);
        int unused = lVar2.f20371b = i;
        this.f20251g.put(Integer.valueOf(i), lVar2);
        return lVar2;
    }

    /* renamed from: B */
    private C3114l m23633B() {
        return this.f20251g.get(0);
    }

    /* renamed from: C */
    private void m23634C(float f, float f2, boolean z) {
        C3114l J;
        if (!this.f20251g.isEmpty() && (J = m23633B().m23779w0(new float[]{f, f2, 0.0f, 1.0f}, z)) != this.f20259o) {
            if (J != null) {
                m23643R(J.f20371b, 128);
            }
            C3114l lVar = this.f20259o;
            if (lVar != null) {
                m23643R(lVar.f20371b, 256);
            }
            this.f20259o = J;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ boolean m23635F(C3114l lVar, C3114l lVar2) {
        return lVar2 == lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public AccessibilityEvent m23637H(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setPackageName(this.f20245a.getContext().getPackageName());
        obtain.setSource(this.f20245a, i);
        return obtain;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m23638L() {
        C3114l lVar = this.f20259o;
        if (lVar != null) {
            m23643R(lVar.f20371b, 256);
            this.f20259o = null;
        }
    }

    /* renamed from: M */
    private void m23639M(C3114l lVar) {
        String d0 = lVar.m23761n0();
        if (d0 == null) {
            d0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            m23647V(d0);
            return;
        }
        AccessibilityEvent H = m23637H(lVar.f20371b, 32);
        H.getText().add(d0);
        m23644S(H);
    }

    @TargetApi(18)
    /* renamed from: N */
    private boolean m23640N(C3114l lVar, int i, Bundle bundle, boolean z) {
        int i2 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i3 = lVar.f20376g;
        int k = lVar.f20377h;
        m23642P(lVar, i2, z, z2);
        if (!(i3 == lVar.f20376g && k == lVar.f20377h)) {
            String q = lVar.f20386q != null ? lVar.f20386q : "";
            AccessibilityEvent H = m23637H(lVar.f20371b, 8192);
            H.getText().add(q);
            H.setFromIndex(lVar.f20376g);
            H.setToIndex(lVar.f20377h);
            H.setItemCount(q.length());
            m23644S(H);
        }
        if (i2 == 1) {
            if (z) {
                C3109g gVar = C3109g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.m23775u0(gVar)) {
                    this.f20246b.mo16218c(i, gVar, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            C3109g gVar2 = C3109g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.m23775u0(gVar2)) {
                return false;
            }
            this.f20246b.mo16218c(i, gVar2, Boolean.valueOf(z2));
            return true;
        } else if (i2 != 2) {
            return i2 == 4 || i2 == 8 || i2 == 16;
        } else {
            if (z) {
                C3109g gVar3 = C3109g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.m23775u0(gVar3)) {
                    this.f20246b.mo16218c(i, gVar3, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            C3109g gVar4 = C3109g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!lVar.m23775u0(gVar4)) {
                return false;
            }
            this.f20246b.mo16218c(i, gVar4, Boolean.valueOf(z2));
            return true;
        }
    }

    @TargetApi(21)
    /* renamed from: O */
    private boolean m23641O(C3114l lVar, int i, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f20246b.mo16218c(i, C3109g.SET_TEXT, string);
        String unused = lVar.f20386q = string;
        List unused2 = lVar.f20387r = null;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r5.find() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        p066io.flutter.view.C3102c.C3114l.m23758m(r4, r5.start(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r5.find() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r5 = r5.start(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r5.find() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r5.find() != false) goto L_0x008f;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23642P(p066io.flutter.view.C3102c.C3114l r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = r4.f20377h
            if (r0 < 0) goto L_0x0111
            int r0 = r4.f20376g
            if (r0 >= 0) goto L_0x000e
            goto L_0x0111
        L_0x000e:
            r0 = 1
            if (r5 == r0) goto L_0x00e9
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L_0x0094
            r1 = 4
            if (r5 == r1) goto L_0x0036
            r0 = 8
            if (r5 == r0) goto L_0x0022
            r0 = 16
            if (r5 == r0) goto L_0x0022
            goto L_0x0108
        L_0x0022:
            if (r6 == 0) goto L_0x0031
        L_0x0024:
            java.lang.String r5 = r4.f20386q
            int r5 = r5.length()
        L_0x002c:
            int unused = r4.f20377h = r5
            goto L_0x0108
        L_0x0031:
            int unused = r4.f20377h = r2
            goto L_0x0108
        L_0x0036:
            if (r6 == 0) goto L_0x006b
            int r5 = r4.f20377h
            java.lang.String r1 = r4.f20386q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x006b
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f20386q
            int r1 = r4.f20377h
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0024
        L_0x0062:
            int r5 = r5.start(r0)
            p066io.flutter.view.C3102c.C3114l.m23758m(r4, r5)
            goto L_0x0108
        L_0x006b:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f20377h
            if (r5 <= 0) goto L_0x0108
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f20386q
            int r1 = r4.f20377h
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0031
        L_0x008f:
            int r5 = r5.start(r0)
            goto L_0x002c
        L_0x0094:
            if (r6 == 0) goto L_0x00c4
            int r5 = r4.f20377h
            java.lang.String r1 = r4.f20386q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x00c4
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f20386q
            int r1 = r4.f20377h
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0024
            goto L_0x0062
        L_0x00c4:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f20377h
            if (r5 <= 0) goto L_0x0108
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f20386q
            int r1 = r4.f20377h
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0108
            goto L_0x008f
        L_0x00e9:
            if (r6 == 0) goto L_0x00fd
            int r5 = r4.f20377h
            java.lang.String r1 = r4.f20386q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x00fd
            p066io.flutter.view.C3102c.C3114l.m23758m(r4, r0)
            goto L_0x0108
        L_0x00fd:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f20377h
            if (r5 <= 0) goto L_0x0108
            p066io.flutter.view.C3102c.C3114l.m23760n(r4, r0)
        L_0x0108:
            if (r7 != 0) goto L_0x0111
            int r5 = r4.f20377h
            int unused = r4.f20376g = r5
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.view.C3102c.m23642P(io.flutter.view.c$l, int, boolean, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m23643R(int i, int i2) {
        if (this.f20247c.isEnabled()) {
            m23644S(m23637H(i, i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m23644S(AccessibilityEvent accessibilityEvent) {
        if (this.f20247c.isEnabled()) {
            this.f20245a.getParent().requestSendAccessibilityEvent(this.f20245a, accessibilityEvent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m23645T() {
        this.f20246b.mo16221f(this.f20256l);
    }

    /* renamed from: U */
    private void m23646U(int i) {
        AccessibilityEvent H = m23637H(i, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            H.setContentChangeTypes(1);
        }
        m23644S(H);
    }

    @TargetApi(28)
    /* renamed from: V */
    private void m23647V(String str) {
        this.f20245a.setAccessibilityPaneTitle(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m23648W(boolean z) {
        if (this.f20264t != z) {
            this.f20264t = z;
            this.f20256l = z ? this.f20256l | C3108f.ACCESSIBLE_NAVIGATION.f20284f : this.f20256l & (~C3108f.ACCESSIBLE_NAVIGATION.f20284f);
            m23645T();
        }
    }

    @TargetApi(31)
    /* renamed from: X */
    private void m23649X() {
        View view = this.f20245a;
        if (view != null && view.getResources() != null) {
            int i = this.f20245a.getResources().getConfiguration().fontWeightAdjustment;
            this.f20256l = i != Integer.MAX_VALUE && i >= 300 ? this.f20256l | C3108f.BOLD_TEXT.f20284f : this.f20256l & C3108f.BOLD_TEXT.f20284f;
            m23645T();
        }
    }

    /* renamed from: Z */
    private boolean m23650Z(C3114l lVar) {
        return lVar.f20379j > 0 && (C3114l.m23705A0(this.f20253i, new C3100a(lVar)) || !C3114l.m23705A0(this.f20253i, C3101b.f20241a));
    }

    @TargetApi(19)
    /* renamed from: c0 */
    private void m23654c0(C3114l lVar) {
        View c;
        Integer num;
        C3114l unused = lVar.f20359Q = null;
        if (!(lVar.f20378i == -1 || (num = this.f20254j) == null || this.f20248d.platformViewOfNode(num.intValue()) != this.f20249e.mo13690c(lVar.f20378i))) {
            m23643R(this.f20254j.intValue(), 65536);
            this.f20254j = null;
        }
        if (!(lVar.f20378i == -1 || (c = this.f20249e.mo13690c(lVar.f20378i)) == null)) {
            c.setImportantForAccessibility(4);
        }
        C3114l lVar2 = this.f20253i;
        if (lVar2 == lVar) {
            m23643R(lVar2.f20371b, 65536);
            this.f20253i = null;
        }
        if (this.f20257m == lVar) {
            this.f20257m = null;
        }
        if (this.f20259o == lVar) {
            this.f20259o = null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ int m23657f(C3102c cVar, int i) {
        int i2 = i & cVar.f20256l;
        cVar.f20256l = i2;
        return i2;
    }

    /* renamed from: g */
    static /* synthetic */ int m23658g(C3102c cVar, int i) {
        int i2 = i | cVar.f20256l;
        cVar.f20256l = i2;
        return i2;
    }

    /* renamed from: v */
    private AccessibilityEvent m23673v(int i, String str, String str2) {
        AccessibilityEvent H = m23637H(i, 16);
        H.setBeforeText(str);
        H.getText().add(str2);
        int i2 = 0;
        while (i2 < str.length() && i2 < str2.length() && str.charAt(i2) == str2.charAt(i2)) {
            i2++;
        }
        if (i2 >= str.length() && i2 >= str2.length()) {
            return null;
        }
        H.setFromIndex(i2);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i2 && length2 >= i2 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        H.setRemovedCount((length - i2) + 1);
        H.setAddedCount((length2 - i2) + 1);
        return H;
    }

    @TargetApi(28)
    /* renamed from: w */
    private boolean m23674w() {
        Activity e = C2854h.m22363e(this.f20245a.getContext());
        if (e == null || e.getWindow() == null) {
            return false;
        }
        int i = e.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i == 2 || i == 0;
    }

    /* renamed from: y */
    private Rect m23675y(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f20245a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public C3110h m23676z(int i) {
        C3110h hVar = this.f20252h.get(Integer.valueOf(i));
        if (hVar != null) {
            return hVar;
        }
        C3110h hVar2 = new C3110h();
        int unused = hVar2.f20310b = i;
        int unused2 = hVar2.f20309a = f20243B + i;
        this.f20252h.put(Integer.valueOf(i), hVar2);
        return hVar2;
    }

    /* renamed from: D */
    public boolean mo13932D() {
        return this.f20247c.isEnabled();
    }

    /* renamed from: E */
    public boolean mo13933E() {
        return this.f20247c.isTouchExplorationEnabled();
    }

    /* renamed from: I */
    public AccessibilityNodeInfo mo13934I(View view, int i) {
        return AccessibilityNodeInfo.obtain(view, i);
    }

    /* renamed from: J */
    public boolean mo13935J(MotionEvent motionEvent) {
        return mo13936K(motionEvent, false);
    }

    /* renamed from: K */
    public boolean mo13936K(MotionEvent motionEvent, boolean z) {
        if (!this.f20247c.isTouchExplorationEnabled() || this.f20251g.isEmpty()) {
            return false;
        }
        C3114l J = m23633B().m23779w0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z);
        if (J == null || J.f20378i == -1) {
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                m23634C(motionEvent.getX(), motionEvent.getY(), z);
            } else if (motionEvent.getAction() == 10) {
                m23638L();
            } else {
                C3768b.m25587a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            return this.f20248d.onAccessibilityHoverEvent(J.f20371b, motionEvent);
        }
    }

    /* renamed from: Q */
    public void mo13937Q() {
        this.f20265u = true;
        this.f20249e.mo13691d();
        mo13938Y((C3113k) null);
        this.f20247c.removeAccessibilityStateChangeListener(this.f20267w);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f20247c.removeTouchExplorationStateChangeListener(this.f20268x);
        }
        this.f20250f.unregisterContentObserver(this.f20269y);
        this.f20246b.mo16222g((C4540a.C4542b) null);
    }

    /* renamed from: Y */
    public void mo13938Y(C3113k kVar) {
        this.f20263s = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo13939a0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            C3110h z = m23676z(byteBuffer.getInt());
            int unused = z.f20311c = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            String str = null;
            String unused2 = z.f20312d = i == -1 ? null : strArr[i];
            int i2 = byteBuffer.getInt();
            if (i2 != -1) {
                str = strArr[i2];
            }
            String unused3 = z.f20313e = str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: io.flutter.view.c$l} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13940b0(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.hasRemaining()
            r2 = 0
            if (r1 == 0) goto L_0x0056
            int r1 = r9.getInt()
            io.flutter.view.c$l r1 = r8.m23632A(r1)
            r1.m23711D0(r9, r10, r11)
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.IS_HIDDEN
            boolean r3 = r1.m23777v0(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x0005
        L_0x0020:
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.IS_FOCUSED
            boolean r3 = r1.m23777v0(r3)
            if (r3 == 0) goto L_0x002a
            r8.f20257m = r1
        L_0x002a:
            boolean r3 = r1.f20344B
            if (r3 == 0) goto L_0x0033
            r0.add(r1)
        L_0x0033:
            int r3 = r1.f20378i
            r4 = -1
            if (r3 == r4) goto L_0x0005
            io.flutter.plugin.platform.k r3 = r8.f20249e
            int r4 = r1.f20378i
            boolean r3 = r3.mo13689b(r4)
            if (r3 != 0) goto L_0x0005
            io.flutter.plugin.platform.k r3 = r8.f20249e
            int r1 = r1.f20378i
            android.view.View r1 = r3.mo13690c(r1)
            if (r1 == 0) goto L_0x0005
            r1.setImportantForAccessibility(r2)
            goto L_0x0005
        L_0x0056:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            io.flutter.view.c$l r10 = r8.m23633B()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 1
            if (r10 == 0) goto L_0x00b7
            r3 = 16
            float[] r3 = new float[r3]
            android.opengl.Matrix.setIdentityM(r3, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x00b1
            r5 = 28
            if (r4 < r5) goto L_0x007d
            boolean r4 = r8.m23674w()
            goto L_0x007e
        L_0x007d:
            r4 = r1
        L_0x007e:
            if (r4 == 0) goto L_0x00b1
            android.view.View r4 = r8.f20245a
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto L_0x00b1
            java.lang.Integer r5 = r8.f20262r
            int r6 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x009e
            boolean unused = r10.f20367Y = r1
            boolean unused = r10.f20365W = r1
        L_0x009e:
            int r4 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.f20262r = r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 0
            android.opengl.Matrix.translateM(r3, r2, r4, r5, r5)
        L_0x00b1:
            r10.m23709C0(r3, r9, r2)
            r10.m23743e0(r11)
        L_0x00b7:
            java.util.Iterator r10 = r11.iterator()
            r3 = 0
            r4 = r3
        L_0x00bd:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r10.next()
            io.flutter.view.c$l r5 = (p066io.flutter.view.C3102c.C3114l) r5
            java.util.List<java.lang.Integer> r6 = r8.f20260p
            int r7 = r5.f20371b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00bd
            r4 = r5
            goto L_0x00bd
        L_0x00db:
            if (r4 != 0) goto L_0x00ef
            int r10 = r11.size()
            if (r10 <= 0) goto L_0x00ef
            int r10 = r11.size()
            int r10 = r10 - r1
            java.lang.Object r10 = r11.get(r10)
            r4 = r10
            io.flutter.view.c$l r4 = (p066io.flutter.view.C3102c.C3114l) r4
        L_0x00ef:
            if (r4 == 0) goto L_0x010e
            int r10 = r4.f20371b
            int r5 = r8.f20261q
            if (r10 != r5) goto L_0x0105
            int r10 = r11.size()
            java.util.List<java.lang.Integer> r5 = r8.f20260p
            int r5 = r5.size()
            if (r10 == r5) goto L_0x010e
        L_0x0105:
            int r10 = r4.f20371b
            r8.f20261q = r10
            r8.m23639M(r4)
        L_0x010e:
            java.util.List<java.lang.Integer> r10 = r8.f20260p
            r10.clear()
            java.util.Iterator r10 = r11.iterator()
        L_0x0117:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0131
            java.lang.Object r11 = r10.next()
            io.flutter.view.c$l r11 = (p066io.flutter.view.C3102c.C3114l) r11
            java.util.List<java.lang.Integer> r4 = r8.f20260p
            int r11 = r11.f20371b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.add(r11)
            goto L_0x0117
        L_0x0131:
            java.util.Map<java.lang.Integer, io.flutter.view.c$l> r10 = r8.f20251g
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x013b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015a
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            io.flutter.view.c$l r11 = (p066io.flutter.view.C3102c.C3114l) r11
            boolean r4 = r9.contains(r11)
            if (r4 != 0) goto L_0x013b
            r8.m23654c0(r11)
            r10.remove()
            goto L_0x013b
        L_0x015a:
            r8.m23646U(r2)
            java.util.Iterator r9 = r0.iterator()
        L_0x0161:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x033a
            java.lang.Object r10 = r9.next()
            io.flutter.view.c$l r10 = (p066io.flutter.view.C3102c.C3114l) r10
            boolean r11 = r10.m23749h0()
            if (r11 == 0) goto L_0x022c
            int r11 = r10.f20371b
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r11 = r8.m23637H(r11, r0)
            float r0 = r10.f20381l
            float r4 = r10.f20382m
            float r5 = r10.f20382m
            boolean r5 = java.lang.Float.isInfinite(r5)
            r6 = 1200142336(0x4788b800, float:70000.0)
            r7 = 1203982336(0x47c35000, float:100000.0)
            if (r5 == 0) goto L_0x019b
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x019a
            r0 = r6
        L_0x019a:
            r4 = r7
        L_0x019b:
            float r5 = r10.f20383n
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x01b0
            float r4 = r4 + r7
            r5 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x01ae
            r0 = r5
        L_0x01ae:
            float r0 = r0 + r7
            goto L_0x01ba
        L_0x01b0:
            float r5 = r10.f20383n
            float r4 = r4 - r5
            float r5 = r10.f20383n
            float r0 = r0 - r5
        L_0x01ba:
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SCROLL_UP
            boolean r5 = r10.m23771s0(r5)
            if (r5 != 0) goto L_0x01e4
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SCROLL_DOWN
            boolean r5 = r10.m23771s0(r5)
            if (r5 == 0) goto L_0x01cb
            goto L_0x01e4
        L_0x01cb:
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SCROLL_LEFT
            boolean r5 = r10.m23771s0(r5)
            if (r5 != 0) goto L_0x01db
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SCROLL_RIGHT
            boolean r5 = r10.m23771s0(r5)
            if (r5 == 0) goto L_0x01ec
        L_0x01db:
            int r0 = (int) r0
            r11.setScrollX(r0)
            int r0 = (int) r4
            r11.setMaxScrollX(r0)
            goto L_0x01ec
        L_0x01e4:
            int r0 = (int) r0
            r11.setScrollY(r0)
            int r0 = (int) r4
            r11.setMaxScrollY(r0)
        L_0x01ec:
            int r0 = r10.f20379j
            if (r0 <= 0) goto L_0x0229
            int r0 = r10.f20379j
            r11.setItemCount(r0)
            int r0 = r10.f20380k
            r11.setFromIndex(r0)
            java.util.List r0 = r10.f20361S
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
        L_0x0209:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0220
            java.lang.Object r5 = r0.next()
            io.flutter.view.c$l r5 = (p066io.flutter.view.C3102c.C3114l) r5
            io.flutter.view.c$i r6 = p066io.flutter.view.C3102c.C3111i.IS_HIDDEN
            boolean r5 = r5.m23777v0(r6)
            if (r5 != 0) goto L_0x0209
            int r4 = r4 + 1
            goto L_0x0209
        L_0x0220:
            int r0 = r10.f20380k
            int r0 = r0 + r4
            int r0 = r0 - r1
            r11.setToIndex(r0)
        L_0x0229:
            r8.m23644S(r11)
        L_0x022c:
            io.flutter.view.c$i r11 = p066io.flutter.view.C3102c.C3111i.IS_LIVE_REGION
            boolean r11 = r10.m23777v0(r11)
            if (r11 == 0) goto L_0x0241
            boolean r11 = r10.m23747g0()
            if (r11 == 0) goto L_0x0241
            int r11 = r10.f20371b
            r8.m23646U(r11)
        L_0x0241:
            io.flutter.view.c$l r11 = r8.f20253i
            if (r11 == 0) goto L_0x0274
            int r11 = r11.f20371b
            int r0 = r10.f20371b
            if (r11 != r0) goto L_0x0274
            io.flutter.view.c$i r11 = p066io.flutter.view.C3102c.C3111i.IS_SELECTED
            boolean r0 = r10.m23773t0(r11)
            if (r0 != 0) goto L_0x0274
            boolean r11 = r10.m23777v0(r11)
            if (r11 == 0) goto L_0x0274
            int r11 = r10.f20371b
            r0 = 4
            android.view.accessibility.AccessibilityEvent r11 = r8.m23637H(r11, r0)
            java.util.List r0 = r11.getText()
            java.lang.String r4 = r10.f20384o
            r0.add(r4)
            r8.m23644S(r11)
        L_0x0274:
            io.flutter.view.c$l r11 = r8.f20257m
            if (r11 == 0) goto L_0x02a4
            int r11 = r11.f20371b
            int r0 = r10.f20371b
            if (r11 != r0) goto L_0x02a4
            io.flutter.view.c$l r11 = r8.f20258n
            if (r11 == 0) goto L_0x0292
            int r11 = r11.f20371b
            io.flutter.view.c$l r0 = r8.f20257m
            int r0 = r0.f20371b
            if (r11 == r0) goto L_0x02a4
        L_0x0292:
            io.flutter.view.c$l r11 = r8.f20257m
            r8.f20258n = r11
            int r11 = r10.f20371b
            r0 = 8
            android.view.accessibility.AccessibilityEvent r11 = r8.m23637H(r11, r0)
            r8.m23644S(r11)
            goto L_0x02aa
        L_0x02a4:
            io.flutter.view.c$l r11 = r8.f20257m
            if (r11 != 0) goto L_0x02aa
            r8.f20258n = r3
        L_0x02aa:
            io.flutter.view.c$l r11 = r8.f20257m
            if (r11 == 0) goto L_0x0161
            int r11 = r11.f20371b
            int r0 = r10.f20371b
            if (r11 != r0) goto L_0x0161
            io.flutter.view.c$i r11 = p066io.flutter.view.C3102c.C3111i.IS_TEXT_FIELD
            boolean r0 = r10.m23773t0(r11)
            if (r0 == 0) goto L_0x0161
            boolean r11 = r10.m23777v0(r11)
            if (r11 == 0) goto L_0x0161
            io.flutter.view.c$l r11 = r8.f20253i
            if (r11 == 0) goto L_0x02d6
            int r11 = r11.f20371b
            io.flutter.view.c$l r0 = r8.f20257m
            int r0 = r0.f20371b
            if (r11 != r0) goto L_0x0161
        L_0x02d6:
            java.lang.String r11 = r10.f20352J
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x02e3
            java.lang.String r11 = r10.f20352J
            goto L_0x02e4
        L_0x02e3:
            r11 = r0
        L_0x02e4:
            java.lang.String r4 = r10.f20386q
            if (r4 == 0) goto L_0x02ee
            java.lang.String r0 = r10.f20386q
        L_0x02ee:
            int r4 = r10.f20371b
            android.view.accessibility.AccessibilityEvent r11 = r8.m23673v(r4, r11, r0)
            if (r11 == 0) goto L_0x02fb
            r8.m23644S(r11)
        L_0x02fb:
            int r11 = r10.f20347E
            int r4 = r10.f20376g
            if (r11 != r4) goto L_0x030f
            int r11 = r10.f20348F
            int r4 = r10.f20377h
            if (r11 == r4) goto L_0x0161
        L_0x030f:
            int r11 = r10.f20371b
            r4 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r11 = r8.m23637H(r11, r4)
            java.util.List r4 = r11.getText()
            r4.add(r0)
            int r4 = r10.f20376g
            r11.setFromIndex(r4)
            int r10 = r10.f20377h
            r11.setToIndex(r10)
            int r10 = r0.length()
            r11.setItemCount(r10)
            r8.m23644S(r11)
            goto L_0x0161
        L_0x033a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.view.C3102c.mo13940b0(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:230:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0462 A[LOOP:0: B:242:0x045c->B:244:0x0462, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0487  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 1
            r0.m23648W(r2)
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r1 < r3) goto L_0x0013
            io.flutter.view.AccessibilityViewEmbedder r2 = r0.f20248d
            android.view.accessibility.AccessibilityNodeInfo r1 = r2.createAccessibilityNodeInfo(r1)
            return r1
        L_0x0013:
            r4 = -1
            r5 = 0
            if (r1 != r4) goto L_0x0034
            android.view.View r1 = r0.f20245a
            android.view.accessibility.AccessibilityNodeInfo r1 = android.view.accessibility.AccessibilityNodeInfo.obtain(r1)
            android.view.View r2 = r0.f20245a
            r2.onInitializeAccessibilityNodeInfo(r1)
            java.util.Map<java.lang.Integer, io.flutter.view.c$l> r2 = r0.f20251g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0033
            android.view.View r2 = r0.f20245a
            r1.addChild(r2, r5)
        L_0x0033:
            return r1
        L_0x0034:
            java.util.Map<java.lang.Integer, io.flutter.view.c$l> r6 = r0.f20251g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)
            java.lang.Object r6 = r6.get(r7)
            io.flutter.view.c$l r6 = (p066io.flutter.view.C3102c.C3114l) r6
            r7 = 0
            if (r6 != 0) goto L_0x0044
            return r7
        L_0x0044:
            int r8 = r6.f20378i
            if (r8 == r4) goto L_0x0072
            io.flutter.plugin.platform.k r8 = r0.f20249e
            int r9 = r6.f20378i
            boolean r8 = r8.mo13689b(r9)
            if (r8 == 0) goto L_0x0072
            io.flutter.plugin.platform.k r1 = r0.f20249e
            int r2 = r6.f20378i
            android.view.View r1 = r1.mo13690c(r2)
            if (r1 != 0) goto L_0x0063
            return r7
        L_0x0063:
            android.graphics.Rect r2 = r6.m23755k0()
            io.flutter.view.AccessibilityViewEmbedder r3 = r0.f20248d
            int r4 = r6.f20371b
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getRootNode(r1, r4, r2)
            return r1
        L_0x0072:
            android.view.View r7 = r0.f20245a
            android.view.accessibility.AccessibilityNodeInfo r7 = r0.mo13934I(r7, r1)
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.String r9 = ""
            r10 = 18
            if (r8 < r10) goto L_0x0083
            r7.setViewIdResourceName(r9)
        L_0x0083:
            android.view.View r11 = r0.f20245a
            android.content.Context r11 = r11.getContext()
            java.lang.String r11 = r11.getPackageName()
            r7.setPackageName(r11)
            java.lang.String r11 = "android.view.View"
            r7.setClassName(r11)
            android.view.View r11 = r0.f20245a
            r7.setSource(r11, r1)
            boolean r11 = r6.m23781x0()
            r7.setFocusable(r11)
            io.flutter.view.c$l r11 = r0.f20257m
            if (r11 == 0) goto L_0x00b1
            int r11 = r11.f20371b
            if (r11 != r1) goto L_0x00ad
            r11 = r2
            goto L_0x00ae
        L_0x00ad:
            r11 = r5
        L_0x00ae:
            r7.setFocused(r11)
        L_0x00b1:
            io.flutter.view.c$l r11 = r0.f20253i
            if (r11 == 0) goto L_0x00c1
            int r11 = r11.f20371b
            if (r11 != r1) goto L_0x00bd
            r11 = r2
            goto L_0x00be
        L_0x00bd:
            r11 = r5
        L_0x00be:
            r7.setAccessibilityFocused(r11)
        L_0x00c1:
            io.flutter.view.c$i r11 = p066io.flutter.view.C3102c.C3111i.IS_TEXT_FIELD
            boolean r12 = r6.m23777v0(r11)
            r13 = 21
            if (r12 == 0) goto L_0x0178
            io.flutter.view.c$i r12 = p066io.flutter.view.C3102c.C3111i.IS_OBSCURED
            boolean r12 = r6.m23777v0(r12)
            r7.setPassword(r12)
            io.flutter.view.c$i r12 = p066io.flutter.view.C3102c.C3111i.IS_READ_ONLY
            boolean r14 = r6.m23777v0(r12)
            if (r14 != 0) goto L_0x00e1
            java.lang.String r14 = "android.widget.EditText"
            r7.setClassName(r14)
        L_0x00e1:
            if (r8 < r10) goto L_0x0111
            boolean r12 = r6.m23777v0(r12)
            r12 = r12 ^ r2
            r7.setEditable(r12)
            int r12 = r6.f20376g
            if (r12 == r4) goto L_0x0102
            int r12 = r6.f20377h
            if (r12 == r4) goto L_0x0102
            int r12 = r6.f20376g
            int r14 = r6.f20377h
            r7.setTextSelection(r12, r14)
        L_0x0102:
            if (r8 <= r10) goto L_0x0111
            io.flutter.view.c$l r12 = r0.f20253i
            if (r12 == 0) goto L_0x0111
            int r12 = r12.f20371b
            if (r12 != r1) goto L_0x0111
            r7.setLiveRegion(r2)
        L_0x0111:
            io.flutter.view.c$g r12 = p066io.flutter.view.C3102c.C3109g.MOVE_CURSOR_FORWARD_BY_CHARACTER
            boolean r12 = r6.m23775u0(r12)
            r14 = 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0120
            r7.addAction(r14)
            r12 = r2
            goto L_0x0121
        L_0x0120:
            r12 = r5
        L_0x0121:
            io.flutter.view.c$g r15 = p066io.flutter.view.C3102c.C3109g.MOVE_CURSOR_BACKWARD_BY_CHARACTER
            boolean r15 = r6.m23775u0(r15)
            r5 = 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0130
            r7.addAction(r5)
            r12 = r12 | 1
        L_0x0130:
            io.flutter.view.c$g r15 = p066io.flutter.view.C3102c.C3109g.MOVE_CURSOR_FORWARD_BY_WORD
            boolean r15 = r6.m23775u0(r15)
            if (r15 == 0) goto L_0x013d
            r7.addAction(r14)
            r12 = r12 | 2
        L_0x013d:
            io.flutter.view.c$g r14 = p066io.flutter.view.C3102c.C3109g.MOVE_CURSOR_BACKWARD_BY_WORD
            boolean r14 = r6.m23775u0(r14)
            if (r14 == 0) goto L_0x014a
            r7.addAction(r5)
            r12 = r12 | 2
        L_0x014a:
            r7.setMovementGranularities(r12)
            if (r8 < r13) goto L_0x0178
            int r5 = r6.f20374e
            if (r5 < 0) goto L_0x0178
            java.lang.String r5 = r6.f20386q
            if (r5 != 0) goto L_0x015d
            r5 = 0
            goto L_0x0165
        L_0x015d:
            java.lang.String r5 = r6.f20386q
            int r5 = r5.length()
        L_0x0165:
            int unused = r6.f20375f
            int unused = r6.f20374e
            int r12 = r6.f20375f
            int r5 = r5 - r12
            int r12 = r6.f20374e
            int r5 = r5 + r12
            r7.setMaxTextLength(r5)
        L_0x0178:
            if (r8 <= r10) goto L_0x01ad
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SET_SELECTION
            boolean r5 = r6.m23775u0(r5)
            if (r5 == 0) goto L_0x0187
            r5 = 131072(0x20000, float:1.83671E-40)
            r7.addAction(r5)
        L_0x0187:
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.COPY
            boolean r5 = r6.m23775u0(r5)
            if (r5 == 0) goto L_0x0194
            r5 = 16384(0x4000, float:2.2959E-41)
            r7.addAction(r5)
        L_0x0194:
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.CUT
            boolean r5 = r6.m23775u0(r5)
            if (r5 == 0) goto L_0x019f
            r7.addAction(r3)
        L_0x019f:
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.PASTE
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x01ad
            r3 = 32768(0x8000, float:4.5918E-41)
            r7.addAction(r3)
        L_0x01ad:
            if (r8 < r13) goto L_0x01bc
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.SET_TEXT
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x01bc
            r3 = 2097152(0x200000, float:2.938736E-39)
            r7.addAction(r3)
        L_0x01bc:
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.IS_BUTTON
            boolean r3 = r6.m23777v0(r3)
            if (r3 != 0) goto L_0x01cc
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.IS_LINK
            boolean r3 = r6.m23777v0(r3)
            if (r3 == 0) goto L_0x01d1
        L_0x01cc:
            java.lang.String r3 = "android.widget.Button"
            r7.setClassName(r3)
        L_0x01d1:
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.IS_IMAGE
            boolean r3 = r6.m23777v0(r3)
            if (r3 == 0) goto L_0x01de
            java.lang.String r3 = "android.widget.ImageView"
            r7.setClassName(r3)
        L_0x01de:
            if (r8 <= r10) goto L_0x01f0
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.DISMISS
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x01f0
            r7.setDismissable(r2)
            r3 = 1048576(0x100000, float:1.469368E-39)
            r7.addAction(r3)
        L_0x01f0:
            io.flutter.view.c$l r3 = r6.f20359Q
            if (r3 == 0) goto L_0x0204
            android.view.View r3 = r0.f20245a
            io.flutter.view.c$l r5 = r6.f20359Q
            int r5 = r5.f20371b
            r7.setParent(r3, r5)
            goto L_0x0209
        L_0x0204:
            android.view.View r3 = r0.f20245a
            r7.setParent(r3)
        L_0x0209:
            int r3 = r6.f20395z
            if (r3 == r4) goto L_0x021c
            r3 = 22
            if (r8 < r3) goto L_0x021c
            android.view.View r3 = r0.f20245a
            int r5 = r6.f20395z
            r7.setTraversalAfter(r3, r5)
        L_0x021c:
            android.graphics.Rect r3 = r6.m23755k0()
            io.flutter.view.c$l r5 = r6.f20359Q
            if (r5 == 0) goto L_0x0240
            io.flutter.view.c$l r5 = r6.f20359Q
            android.graphics.Rect r5 = r5.m23755k0()
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>(r3)
            int r14 = r5.left
            int r14 = -r14
            int r5 = r5.top
            int r5 = -r5
            r12.offset(r14, r5)
            r7.setBoundsInParent(r12)
            goto L_0x0243
        L_0x0240:
            r7.setBoundsInParent(r3)
        L_0x0243:
            android.graphics.Rect r3 = r0.m23675y(r3)
            r7.setBoundsInScreen(r3)
            r7.setVisibleToUser(r2)
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.HAS_ENABLED_STATE
            boolean r3 = r6.m23777v0(r3)
            if (r3 == 0) goto L_0x0260
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.IS_ENABLED
            boolean r3 = r6.m23777v0(r3)
            if (r3 == 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r3 = 0
            goto L_0x0261
        L_0x0260:
            r3 = r2
        L_0x0261:
            r7.setEnabled(r3)
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.TAP
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x028d
            r3 = 16
            if (r8 < r13) goto L_0x0287
            io.flutter.view.c$h r5 = r6.f20363U
            if (r5 == 0) goto L_0x0287
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            io.flutter.view.c$h r12 = r6.f20363U
            java.lang.String r12 = r12.f20313e
            r5.<init>(r3, r12)
            r7.addAction(r5)
            goto L_0x028a
        L_0x0287:
            r7.addAction(r3)
        L_0x028a:
            r7.setClickable(r2)
        L_0x028d:
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.LONG_PRESS
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x02b6
            r3 = 32
            if (r8 < r13) goto L_0x02b0
            io.flutter.view.c$h r5 = r6.f20364V
            if (r5 == 0) goto L_0x02b0
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            io.flutter.view.c$h r12 = r6.f20364V
            java.lang.String r12 = r12.f20313e
            r5.<init>(r3, r12)
            r7.addAction(r5)
            goto L_0x02b3
        L_0x02b0:
            r7.addAction(r3)
        L_0x02b3:
            r7.setLongClickable(r2)
        L_0x02b6:
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.SCROLL_LEFT
            boolean r5 = r6.m23775u0(r3)
            r12 = 8192(0x2000, float:1.14794E-41)
            r14 = 4096(0x1000, float:5.74E-42)
            if (r5 != 0) goto L_0x02de
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SCROLL_UP
            boolean r5 = r6.m23775u0(r5)
            if (r5 != 0) goto L_0x02de
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SCROLL_RIGHT
            boolean r5 = r6.m23775u0(r5)
            if (r5 != 0) goto L_0x02de
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SCROLL_DOWN
            boolean r5 = r6.m23775u0(r5)
            if (r5 == 0) goto L_0x02db
            goto L_0x02de
        L_0x02db:
            r15 = 0
            goto L_0x0356
        L_0x02de:
            r7.setScrollable(r2)
            io.flutter.view.c$i r5 = p066io.flutter.view.C3102c.C3111i.HAS_IMPLICIT_SCROLLING
            boolean r5 = r6.m23777v0(r5)
            if (r5 == 0) goto L_0x0331
            boolean r5 = r6.m23775u0(r3)
            if (r5 != 0) goto L_0x0313
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.SCROLL_RIGHT
            boolean r5 = r6.m23775u0(r5)
            if (r5 == 0) goto L_0x02f8
            goto L_0x0313
        L_0x02f8:
            if (r8 <= r10) goto L_0x030d
            boolean r5 = r0.m23650Z(r6)
            if (r5 == 0) goto L_0x030d
            int r5 = r6.f20379j
            r15 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r5 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r5, r15, r15)
            r7.setCollectionInfo(r5)
            goto L_0x0331
        L_0x030d:
            java.lang.String r5 = "android.widget.ScrollView"
            r7.setClassName(r5)
            goto L_0x0331
        L_0x0313:
            r5 = 19
            if (r8 <= r5) goto L_0x032a
            boolean r5 = r0.m23650Z(r6)
            if (r5 == 0) goto L_0x032a
            int r5 = r6.f20379j
            r15 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r5 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r15, r5, r15)
            r7.setCollectionInfo(r5)
            goto L_0x0332
        L_0x032a:
            r15 = 0
            java.lang.String r5 = "android.widget.HorizontalScrollView"
            r7.setClassName(r5)
            goto L_0x0332
        L_0x0331:
            r15 = 0
        L_0x0332:
            boolean r3 = r6.m23775u0(r3)
            if (r3 != 0) goto L_0x0340
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.SCROLL_UP
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x0343
        L_0x0340:
            r7.addAction(r14)
        L_0x0343:
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.SCROLL_RIGHT
            boolean r3 = r6.m23775u0(r3)
            if (r3 != 0) goto L_0x0353
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.SCROLL_DOWN
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x0356
        L_0x0353:
            r7.addAction(r12)
        L_0x0356:
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.INCREASE
            boolean r5 = r6.m23775u0(r3)
            if (r5 != 0) goto L_0x0366
            io.flutter.view.c$g r5 = p066io.flutter.view.C3102c.C3109g.DECREASE
            boolean r5 = r6.m23775u0(r5)
            if (r5 == 0) goto L_0x037f
        L_0x0366:
            java.lang.String r5 = "android.widget.SeekBar"
            r7.setClassName(r5)
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x0374
            r7.addAction(r14)
        L_0x0374:
            io.flutter.view.c$g r3 = p066io.flutter.view.C3102c.C3109g.DECREASE
            boolean r3 = r6.m23775u0(r3)
            if (r3 == 0) goto L_0x037f
            r7.addAction(r12)
        L_0x037f:
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.IS_LIVE_REGION
            boolean r3 = r6.m23777v0(r3)
            if (r3 == 0) goto L_0x038c
            if (r8 <= r10) goto L_0x038c
            r7.setLiveRegion(r2)
        L_0x038c:
            boolean r3 = r6.m23777v0(r11)
            r5 = 28
            if (r3 == 0) goto L_0x03a5
            java.lang.CharSequence r3 = r6.m23767q0()
            r7.setText(r3)
            if (r8 < r5) goto L_0x03d9
            java.lang.CharSequence r3 = r6.m23765p0()
            r7.setHintText(r3)
            goto L_0x03d9
        L_0x03a5:
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.SCOPES_ROUTE
            boolean r3 = r6.m23777v0(r3)
            if (r3 != 0) goto L_0x03d9
            java.lang.CharSequence r3 = r6.m23769r0()
            if (r8 >= r5) goto L_0x03d4
            java.lang.String r10 = r6.f20394y
            if (r10 == 0) goto L_0x03d4
            if (r3 == 0) goto L_0x03bc
            r9 = r3
        L_0x03bc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = "\n"
            r3.append(r9)
            java.lang.String r9 = r6.f20394y
            r3.append(r9)
            java.lang.String r3 = r3.toString()
        L_0x03d4:
            if (r3 == 0) goto L_0x03d9
            r7.setContentDescription(r3)
        L_0x03d9:
            if (r8 < r5) goto L_0x03e8
            java.lang.String r3 = r6.f20394y
            if (r3 == 0) goto L_0x03e8
            java.lang.String r3 = r6.f20394y
            r7.setTooltipText(r3)
        L_0x03e8:
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.HAS_CHECKED_STATE
            boolean r3 = r6.m23777v0(r3)
            io.flutter.view.c$i r9 = p066io.flutter.view.C3102c.C3111i.HAS_TOGGLED_STATE
            boolean r9 = r6.m23777v0(r9)
            if (r3 != 0) goto L_0x03fa
            if (r9 == 0) goto L_0x03f9
            goto L_0x03fa
        L_0x03f9:
            r2 = r15
        L_0x03fa:
            r7.setCheckable(r2)
            if (r3 == 0) goto L_0x0416
            io.flutter.view.c$i r2 = p066io.flutter.view.C3102c.C3111i.IS_CHECKED
            boolean r2 = r6.m23777v0(r2)
            r7.setChecked(r2)
            io.flutter.view.c$i r2 = p066io.flutter.view.C3102c.C3111i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP
            boolean r2 = r6.m23777v0(r2)
            if (r2 == 0) goto L_0x0413
            java.lang.String r2 = "android.widget.RadioButton"
            goto L_0x0423
        L_0x0413:
            java.lang.String r2 = "android.widget.CheckBox"
            goto L_0x0423
        L_0x0416:
            if (r9 == 0) goto L_0x0426
            io.flutter.view.c$i r2 = p066io.flutter.view.C3102c.C3111i.IS_TOGGLED
            boolean r2 = r6.m23777v0(r2)
            r7.setChecked(r2)
            java.lang.String r2 = "android.widget.Switch"
        L_0x0423:
            r7.setClassName(r2)
        L_0x0426:
            io.flutter.view.c$i r2 = p066io.flutter.view.C3102c.C3111i.IS_SELECTED
            boolean r2 = r6.m23777v0(r2)
            r7.setSelected(r2)
            if (r8 < r5) goto L_0x043a
            io.flutter.view.c$i r2 = p066io.flutter.view.C3102c.C3111i.IS_HEADER
            boolean r2 = r6.m23777v0(r2)
            r7.setHeading(r2)
        L_0x043a:
            io.flutter.view.c$l r2 = r0.f20253i
            if (r2 == 0) goto L_0x0447
            int r2 = r2.f20371b
            if (r2 != r1) goto L_0x0447
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0449
        L_0x0447:
            r1 = 64
        L_0x0449:
            r7.addAction(r1)
            if (r8 < r13) goto L_0x0479
            java.util.List r1 = r6.f20362T
            if (r1 == 0) goto L_0x0479
            java.util.List r1 = r6.f20362T
            java.util.Iterator r1 = r1.iterator()
        L_0x045c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0479
            java.lang.Object r2 = r1.next()
            io.flutter.view.c$h r2 = (p066io.flutter.view.C3102c.C3110h) r2
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r3 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            int r5 = r2.f20309a
            java.lang.String r2 = r2.f20312d
            r3.<init>(r5, r2)
            r7.addAction(r3)
            goto L_0x045c
        L_0x0479:
            java.util.List r1 = r6.f20360R
            java.util.Iterator r1 = r1.iterator()
        L_0x0481:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04c0
            java.lang.Object r2 = r1.next()
            io.flutter.view.c$l r2 = (p066io.flutter.view.C3102c.C3114l) r2
            io.flutter.view.c$i r3 = p066io.flutter.view.C3102c.C3111i.IS_HIDDEN
            boolean r3 = r2.m23777v0(r3)
            if (r3 == 0) goto L_0x0496
            goto L_0x0481
        L_0x0496:
            int r3 = r2.f20378i
            if (r3 == r4) goto L_0x04b6
            io.flutter.plugin.platform.k r3 = r0.f20249e
            int r5 = r2.f20378i
            android.view.View r3 = r3.mo13690c(r5)
            io.flutter.plugin.platform.k r5 = r0.f20249e
            int r6 = r2.f20378i
            boolean r5 = r5.mo13689b(r6)
            if (r5 != 0) goto L_0x04b6
            r7.addChild(r3)
            goto L_0x0481
        L_0x04b6:
            android.view.View r3 = r0.f20245a
            int r2 = r2.f20371b
            r7.addChild(r3, r2)
            goto L_0x0481
        L_0x04c0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.view.C3102c.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r2 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L_0x0007
            r0 = 2
            if (r2 == r0) goto L_0x001d
            goto L_0x0027
        L_0x0007:
            io.flutter.view.c$l r2 = r1.f20257m
            if (r2 == 0) goto L_0x0014
        L_0x000b:
            int r2 = r2.f20371b
        L_0x000f:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L_0x0014:
            java.lang.Integer r2 = r1.f20255k
            if (r2 == 0) goto L_0x001d
        L_0x0018:
            int r2 = r2.intValue()
            goto L_0x000f
        L_0x001d:
            io.flutter.view.c$l r2 = r1.f20253i
            if (r2 == 0) goto L_0x0022
            goto L_0x000b
        L_0x0022:
            java.lang.Integer r2 = r1.f20254j
            if (r2 == 0) goto L_0x0027
            goto L_0x0018
        L_0x0027:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.view.C3102c.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        if (i >= 65536) {
            boolean performAction = this.f20248d.performAction(i, i2, bundle);
            if (performAction && i2 == 128) {
                this.f20254j = null;
            }
            return performAction;
        }
        C3114l lVar = this.f20251g.get(Integer.valueOf(i));
        boolean z = false;
        if (lVar == null) {
            return false;
        }
        switch (i2) {
            case 16:
                this.f20246b.mo16217b(i, C3109g.TAP);
                return true;
            case 32:
                this.f20246b.mo16217b(i, C3109g.LONG_PRESS);
                return true;
            case 64:
                if (this.f20253i == null) {
                    this.f20245a.invalidate();
                }
                this.f20253i = lVar;
                this.f20246b.mo16217b(i, C3109g.DID_GAIN_ACCESSIBILITY_FOCUS);
                m23643R(i, 32768);
                if (lVar.m23775u0(C3109g.INCREASE) || lVar.m23775u0(C3109g.DECREASE)) {
                    m23643R(i, 4);
                }
                return true;
            case 128:
                C3114l lVar2 = this.f20253i;
                if (lVar2 != null && lVar2.f20371b == i) {
                    this.f20253i = null;
                }
                Integer num = this.f20254j;
                if (num != null && num.intValue() == i) {
                    this.f20254j = null;
                }
                this.f20246b.mo16217b(i, C3109g.DID_LOSE_ACCESSIBILITY_FOCUS);
                m23643R(i, 65536);
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return m23640N(lVar, i, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return m23640N(lVar, i, bundle, false);
            case 4096:
                C3109g gVar = C3109g.SCROLL_UP;
                if (!lVar.m23775u0(gVar)) {
                    gVar = C3109g.SCROLL_LEFT;
                    if (!lVar.m23775u0(gVar)) {
                        gVar = C3109g.INCREASE;
                        if (!lVar.m23775u0(gVar)) {
                            return false;
                        }
                        String unused = lVar.f20386q = lVar.f20388s;
                        List unused2 = lVar.f20387r = lVar.f20389t;
                        m23643R(i, 4);
                    }
                }
                this.f20246b.mo16217b(i, gVar);
                return true;
            case 8192:
                C3109g gVar2 = C3109g.SCROLL_DOWN;
                if (!lVar.m23775u0(gVar2)) {
                    gVar2 = C3109g.SCROLL_RIGHT;
                    if (!lVar.m23775u0(gVar2)) {
                        gVar2 = C3109g.DECREASE;
                        if (!lVar.m23775u0(gVar2)) {
                            return false;
                        }
                        String unused3 = lVar.f20386q = lVar.f20390u;
                        List unused4 = lVar.f20387r = lVar.f20391v;
                        m23643R(i, 4);
                    }
                }
                this.f20246b.mo16217b(i, gVar2);
                return true;
            case 16384:
                this.f20246b.mo16217b(i, C3109g.COPY);
                return true;
            case 32768:
                this.f20246b.mo16217b(i, C3109g.PASTE);
                return true;
            case 65536:
                this.f20246b.mo16217b(i, C3109g.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z = true;
                }
                if (z) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i3 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f20377h));
                    i3 = lVar.f20377h;
                }
                hashMap.put("extent", Integer.valueOf(i3));
                this.f20246b.mo16218c(i, C3109g.SET_SELECTION, hashMap);
                C3114l lVar3 = this.f20251g.get(Integer.valueOf(i));
                int unused5 = lVar3.f20376g = ((Integer) hashMap.get("base")).intValue();
                int unused6 = lVar3.f20377h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f20246b.mo16217b(i, C3109g.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                return m23641O(lVar, i, bundle);
            case 16908342:
                this.f20246b.mo16217b(i, C3109g.SHOW_ON_SCREEN);
                return true;
            default:
                C3110h hVar = this.f20252h.get(Integer.valueOf(i2 - f20243B));
                if (hVar == null) {
                    return false;
                }
                this.f20246b.mo16218c(i, C3109g.CUSTOM_ACTION, Integer.valueOf(hVar.f20310b));
                return true;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: x */
    public boolean mo13944x(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f20248d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f20248d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f20255k = recordFlutterId;
            this.f20257m = null;
            return true;
        } else if (eventType == 128) {
            this.f20259o = null;
            return true;
        } else if (eventType == 32768) {
            this.f20254j = recordFlutterId;
            this.f20253i = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.f20255k = null;
            this.f20254j = null;
            return true;
        }
    }
}
