package p066io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.C0221h;
import androidx.core.view.C0813j0;
import java.io.FileNotFoundException;
import java.util.List;
import p099n3.C3768b;
import p174z3.C4558i;

/* renamed from: io.flutter.plugin.platform.c */
public class C3000c {

    /* renamed from: a */
    private final Activity f19958a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4558i f19959b;

    /* renamed from: c */
    private final C3004d f19960c;

    /* renamed from: d */
    private C4558i.C4568j f19961d;

    /* renamed from: e */
    private int f19962e = 1280;

    /* renamed from: f */
    final C4558i.C4566h f19963f;

    /* renamed from: io.flutter.plugin.platform.c$a */
    class C3001a implements C4558i.C4566h {
        C3001a() {
        }

        /* renamed from: a */
        public CharSequence mo13644a(C4558i.C4563e eVar) {
            return C3000c.this.m23212p(eVar);
        }

        /* renamed from: b */
        public void mo13645b() {
            C3000c.this.m23214r();
        }

        /* renamed from: c */
        public void mo13646c(List<C4558i.C4570l> list) {
            C3000c.this.m23220x(list);
        }

        /* renamed from: d */
        public void mo13647d(C4558i.C4569k kVar) {
            C3000c.this.m23219w(kVar);
        }

        /* renamed from: e */
        public void mo13648e(C4558i.C4567i iVar) {
            C3000c.this.m23213q(iVar);
        }

        /* renamed from: f */
        public void mo13649f() {
            C3000c.this.m23218v();
        }

        /* renamed from: g */
        public void mo13650g() {
            C3000c.this.m23215s();
        }

        /* renamed from: h */
        public void mo13651h(String str) {
            C3000c.this.m23216t(str);
        }

        /* renamed from: i */
        public void mo13652i(C4558i.C4565g gVar) {
            C3000c.this.mo13642B(gVar);
        }

        /* renamed from: j */
        public void mo13653j(C4558i.C4561c cVar) {
            C3000c.this.m23217u(cVar);
        }

        /* renamed from: k */
        public void mo13654k(C4558i.C4568j jVar) {
            C3000c.this.m23222z(jVar);
        }

        /* renamed from: l */
        public void mo13655l(int i) {
            C3000c.this.m23221y(i);
        }

        /* renamed from: m */
        public boolean mo13656m() {
            return C3000c.this.m23211n();
        }
    }

    /* renamed from: io.flutter.plugin.platform.c$b */
    class C3002b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f19965a;

        C3002b(View view) {
            this.f19965a = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m23240b(int i) {
            C4558i iVar;
            boolean z;
            if ((i & 4) == 0) {
                iVar = C3000c.this.f19959b;
                z = true;
            } else {
                iVar = C3000c.this.f19959b;
                z = false;
            }
            iVar.mo16236m(z);
        }

        public void onSystemUiVisibilityChange(int i) {
            this.f19965a.post(new C3005d(this, i));
        }
    }

    /* renamed from: io.flutter.plugin.platform.c$c */
    static /* synthetic */ class C3003c {

        /* renamed from: a */
        static final /* synthetic */ int[] f19967a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19968b;

        /* renamed from: c */
        static final /* synthetic */ int[] f19969c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                z3.i$d[] r0 = p174z3.C4558i.C4562d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19969c = r0
                r1 = 1
                z3.i$d r2 = p174z3.C4558i.C4562d.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f19969c     // Catch:{ NoSuchFieldError -> 0x001d }
                z3.i$d r3 = p174z3.C4558i.C4562d.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                z3.i$l[] r2 = p174z3.C4558i.C4570l.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f19968b = r2
                z3.i$l r3 = p174z3.C4558i.C4570l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f19968b     // Catch:{ NoSuchFieldError -> 0x0038 }
                z3.i$l r3 = p174z3.C4558i.C4570l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                z3.i$g[] r2 = p174z3.C4558i.C4565g.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f19967a = r2
                z3.i$g r3 = p174z3.C4558i.C4565g.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f19967a     // Catch:{ NoSuchFieldError -> 0x0053 }
                z3.i$g r2 = p174z3.C4558i.C4565g.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f19967a     // Catch:{ NoSuchFieldError -> 0x005e }
                z3.i$g r1 = p174z3.C4558i.C4565g.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f19967a     // Catch:{ NoSuchFieldError -> 0x0069 }
                z3.i$g r1 = p174z3.C4558i.C4565g.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f19967a     // Catch:{ NoSuchFieldError -> 0x0074 }
                z3.i$g r1 = p174z3.C4558i.C4565g.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugin.platform.C3000c.C3003c.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.plugin.platform.c$d */
    public interface C3004d {
        /* renamed from: b */
        boolean mo13260b();
    }

    public C3000c(Activity activity, C4558i iVar, C3004d dVar) {
        C3001a aVar = new C3001a();
        this.f19963f = aVar;
        this.f19958a = activity;
        this.f19959b = iVar;
        iVar.mo16235l(aVar);
        this.f19960c = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m23211n() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f19958a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public CharSequence m23212p(C4558i.C4563e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f19958a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null) {
                if (eVar != C4558i.C4563e.PLAIN_TEXT) {
                    return null;
                }
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f19958a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", (Bundle) null);
            }
            return itemAt.coerceToText(this.f19958a);
        } catch (SecurityException e) {
            C3768b.m25594h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e);
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m23213q(C4558i.C4567i iVar) {
        if (iVar == C4558i.C4567i.CLICK) {
            this.f19958a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m23214r() {
        C3004d dVar = this.f19960c;
        if (dVar == null || !dVar.mo13260b()) {
            Activity activity = this.f19958a;
            if (activity instanceof C0221h) {
                ((C0221h) activity).mo495h().mo531c();
            } else {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m23215s() {
        mo13641A();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m23216t(String str) {
        ((ClipboardManager) this.f19958a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m23217u(C4558i.C4561c cVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 28 && i > 21) {
                this.f19958a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f23104b, (Bitmap) null, cVar.f23103a));
            }
            if (i >= 28) {
                this.f19958a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f23104b, 0, cVar.f23103a));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m23218v() {
        View decorView = this.f19958a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new C3002b(decorView));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m23219w(C4558i.C4569k kVar) {
        int i;
        if (kVar == C4558i.C4569k.LEAN_BACK) {
            i = 1798;
        } else if (kVar == C4558i.C4569k.IMMERSIVE && Build.VERSION.SDK_INT >= 19) {
            i = 3846;
        } else if (kVar == C4558i.C4569k.IMMERSIVE_STICKY && Build.VERSION.SDK_INT >= 19) {
            i = 5894;
        } else if (kVar == C4558i.C4569k.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i = 1792;
        } else {
            return;
        }
        this.f19962e = i;
        mo13641A();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m23220x(List<C4558i.C4570l> list) {
        int i = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = C3003c.f19968b[list.get(i2).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i = i & -513 & -3;
            }
        }
        this.f19962e = i;
        mo13641A();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m23221y(int i) {
        this.f19958a.setRequestedOrientation(i);
    }

    /* access modifiers changed from: private */
    @TargetApi(21)
    /* renamed from: z */
    public void m23222z(C4558i.C4568j jVar) {
        Window window = this.f19958a.getWindow();
        C0813j0 j0Var = new C0813j0(window, window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i >= 23) {
            C4558i.C4562d dVar = jVar.f23130b;
            if (dVar != null) {
                int i2 = C3003c.f19969c[dVar.ordinal()];
                if (i2 == 1) {
                    j0Var.mo2924b(true);
                } else if (i2 == 2) {
                    j0Var.mo2924b(false);
                }
            }
            Integer num = jVar.f23129a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f23131c;
        if (bool != null && i >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i >= 26) {
            C4558i.C4562d dVar2 = jVar.f23133e;
            if (dVar2 != null) {
                int i3 = C3003c.f19969c[dVar2.ordinal()];
                if (i3 == 1) {
                    j0Var.mo2923a(true);
                } else if (i3 == 2) {
                    j0Var.mo2923a(false);
                }
            }
            Integer num2 = jVar.f23132d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f23134f;
        if (num3 != null && i >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f23135g;
        if (bool2 != null && i >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f19961d = jVar;
    }

    /* renamed from: A */
    public void mo13641A() {
        this.f19958a.getWindow().getDecorView().setSystemUiVisibility(this.f19962e);
        C4558i.C4568j jVar = this.f19961d;
        if (jVar != null) {
            m23222z(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo13642B(C4558i.C4565g gVar) {
        int i;
        View decorView = this.f19958a.getWindow().getDecorView();
        int i2 = C3003c.f19967a[gVar.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        if (i2 != 5 || Build.VERSION.SDK_INT < 21) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        i = 6;
                    } else {
                        return;
                    }
                }
            }
            decorView.performHapticFeedback(i3);
            return;
        }
        i = 0;
        decorView.performHapticFeedback(i);
    }

    /* renamed from: o */
    public void mo13643o() {
        this.f19959b.mo16235l((C4558i.C4566h) null);
    }
}
