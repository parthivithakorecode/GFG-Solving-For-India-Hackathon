package p069j1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.dc3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.qy1;
import com.google.android.gms.internal.ads.uy1;
import com.google.android.gms.internal.ads.wo0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p054h1.C2694t;

/* renamed from: j1.x */
public final class C3218x {

    /* renamed from: a */
    private final Context f20581a;

    /* renamed from: b */
    private final uy1 f20582b;

    /* renamed from: c */
    private String f20583c;

    /* renamed from: d */
    private String f20584d;

    /* renamed from: e */
    private String f20585e;

    /* renamed from: f */
    private String f20586f;

    /* renamed from: g */
    private int f20587g;

    /* renamed from: h */
    private int f20588h;

    /* renamed from: i */
    private PointF f20589i;

    /* renamed from: j */
    private PointF f20590j;

    /* renamed from: k */
    private Handler f20591k;

    /* renamed from: l */
    private Runnable f20592l;

    public C3218x(Context context) {
        this.f20587g = 0;
        this.f20592l = new C3172j(this);
        this.f20581a = context;
        this.f20588h = ViewConfiguration.get(context).getScaledTouchSlop();
        C2694t.m21612u().mo13974b();
        this.f20591k = C2694t.m21612u().mo13973a();
        this.f20582b = C2694t.m21611t().mo13978a();
    }

    public C3218x(Context context, String str) {
        this(context);
        this.f20583c = str;
    }

    /* renamed from: s */
    private final void m24102s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u = m24104u(arrayList, "None", true);
        int u2 = m24104u(arrayList, "Shake", true);
        int u3 = m24104u(arrayList, "Flick", true);
        qy1 qy1 = qy1.NONE;
        int ordinal = this.f20582b.mo11330a().ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? u : u3 : u2;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, C2694t.m21609r().mo14006k());
        AtomicInteger atomicInteger = new AtomicInteger(i);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new C3203s(atomicInteger));
        builder.setNegativeButton("Dismiss", new C3191o(this));
        builder.setPositiveButton("Save", new C3200r(this, atomicInteger, i, u2, u3));
        builder.setOnCancelListener(new C3164h(this));
        builder.create().show();
    }

    /* renamed from: t */
    private final boolean m24103t(float f, float f2, float f3, float f4) {
        return Math.abs(this.f20589i.x - f) < ((float) this.f20588h) && Math.abs(this.f20589i.y - f2) < ((float) this.f20588h) && Math.abs(this.f20590j.x - f3) < ((float) this.f20588h) && Math.abs(this.f20590j.y - f4) < ((float) this.f20588h);
    }

    /* renamed from: u */
    private static final int m24104u(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14115a() {
        m24102s(this.f20581a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo14116b() {
        m24102s(this.f20581a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14117c(dc3 dc3) {
        if (!C2694t.m21611t().mo13987j(this.f20581a, this.f20584d, this.f20585e)) {
            C2694t.m21611t().mo13981d(this.f20581a, this.f20584d, this.f20585e);
        } else {
            dc3.execute(new C3212v(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo14118d(dc3 dc3) {
        if (!C2694t.m21611t().mo13987j(this.f20581a, this.f20584d, this.f20585e)) {
            C2694t.m21611t().mo13981d(this.f20581a, this.f20584d, this.f20585e);
        } else {
            dc3.execute(new C3168i(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo14119e() {
        C2694t.m21611t().mo13980c(this.f20581a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo14120f() {
        C2694t.m21611t().mo13980c(this.f20581a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo14121g() {
        this.f20587g = 4;
        mo14132r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo14122h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        uy1 uy1;
        qy1 qy1;
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                uy1 = this.f20582b;
                qy1 = qy1.SHAKE;
            } else if (atomicInteger.get() == i3) {
                uy1 = this.f20582b;
                qy1 = qy1.FLICK;
            } else {
                uy1 = this.f20582b;
                qy1 = qy1.NONE;
            }
            uy1.mo11339j(qy1);
        }
        mo14132r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo14123i(String str, DialogInterface dialogInterface, int i) {
        C2694t.m21608q();
        C3163g2.m23941q(this.f20581a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo14124j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            if (!(this.f20581a instanceof Activity)) {
                io0.m11130f("Can not create dialog without Activity Context");
                return;
            }
            String str = this.f20583c;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                C2694t.m21608q();
                Map<String, String> s = C3163g2.m23943s(build);
                for (String next : s.keySet()) {
                    sb.append(next);
                    sb.append(" = ");
                    sb.append(s.get(next));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f20581a);
            builder.setMessage(str2);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new C3197q(this, str2));
            builder.setNegativeButton("Close", C3206t.f20541f);
            builder.create().show();
        } else if (i6 == i2) {
            io0.m11126b("Debug mode [Creative Preview] selected.");
            wo0.f16886a.execute(new C3180l(this));
        } else if (i6 == i3) {
            io0.m11126b("Debug mode [Troubleshooting] selected.");
            wo0.f16886a.execute(new C3176k(this));
        } else if (i6 == i4) {
            dc3 dc3 = wo0.f16890e;
            dc3 dc32 = wo0.f16886a;
            if (this.f20582b.mo11342m()) {
                dc3.execute(new C3215w(this));
            } else {
                dc32.execute(new C3188n(this, dc3));
            }
        } else if (i6 == i5) {
            dc3 dc33 = wo0.f16890e;
            dc3 dc34 = wo0.f16886a;
            if (this.f20582b.mo11342m()) {
                dc33.execute(new C3209u(this));
            } else {
                dc34.execute(new C3184m(this, dc33));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo14125k() {
        C3145c0 t = C2694t.m21611t();
        Context context = this.f20581a;
        String str = this.f20584d;
        String str2 = this.f20585e;
        String str3 = this.f20586f;
        boolean m = t.mo13990m();
        t.mo13985h(t.mo13987j(context, str, str2));
        if (t.mo13990m()) {
            if (!m && !TextUtils.isEmpty(str3)) {
                t.mo13982e(context, str2, str3, str);
            }
            io0.m11126b("Device is linked for debug signals.");
            t.mo13986i(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        t.mo13981d(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo14126l() {
        C3145c0 t = C2694t.m21611t();
        Context context = this.f20581a;
        String str = this.f20584d;
        String str2 = this.f20585e;
        if (!t.mo13988k(context, str, str2)) {
            t.mo13986i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(t.f20448f)) {
            io0.m11126b("Creative is not pushed for this device.");
            t.mo13986i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(t.f20448f)) {
            io0.m11126b("The app is not linked for creative preview.");
            t.mo13981d(context, str, str2);
        } else if ("0".equals(t.f20448f)) {
            io0.m11126b("Device is linked for in app preview.");
            t.mo13986i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: m */
    public final void mo14127m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f20587g = 0;
            this.f20589i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f20587g;
        if (i != -1) {
            if (i == 0) {
                if (actionMasked == 5) {
                    this.f20587g = 5;
                    this.f20590j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.f20591k.postDelayed(this.f20592l, ((Long) C2199sw.m17001c().mo8579b(m10.f10526j3)).longValue());
                }
            } else if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            z |= !m24103t(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                        }
                        if (m24103t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f20587g = -1;
                this.f20591k.removeCallbacks(this.f20592l);
            }
        }
    }

    /* renamed from: n */
    public final void mo14128n(String str) {
        this.f20584d = str;
    }

    /* renamed from: o */
    public final void mo14129o(String str) {
        this.f20585e = str;
    }

    /* renamed from: p */
    public final void mo14130p(String str) {
        this.f20583c = str;
    }

    /* renamed from: q */
    public final void mo14131q(String str) {
        this.f20586f = str;
    }

    /* renamed from: r */
    public final void mo14132r() {
        try {
            if (!(this.f20581a instanceof Activity)) {
                io0.m11130f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(C2694t.m21611t().mo13979b())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != C2694t.m21611t().mo13990m()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int u = m24104u(arrayList, "Ad information", true);
            int u2 = m24104u(arrayList, str, true);
            int u3 = m24104u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue();
            int u4 = m24104u(arrayList, "Open ad inspector", booleanValue);
            int u5 = m24104u(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f20581a, C2694t.m21609r().mo14006k());
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C3194p(this, u, u2, u3, u4, u5));
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            C3202r1.m24016l("", e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f20583c);
        sb.append(",DebugSignal: ");
        sb.append(this.f20586f);
        sb.append(",AFMA Version: ");
        sb.append(this.f20585e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f20584d);
        sb.append("}");
        return sb.toString();
    }
}
