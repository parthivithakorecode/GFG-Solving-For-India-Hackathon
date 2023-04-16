package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;
import p026d1.C2481i;
import p048g2.C2635a;
import p048g2.C2637b;
import p069j1.C3154e1;
import p069j1.C3202r1;
import p069j1.C3208t1;

public final class rn1 {

    /* renamed from: a */
    private final C3208t1 f13749a;

    /* renamed from: b */
    private final ks2 f13750b;

    /* renamed from: c */
    private final wm1 f13751c;

    /* renamed from: d */
    private final rm1 f13752d;

    /* renamed from: e */
    private final co1 f13753e;

    /* renamed from: f */
    private final ko1 f13754f;

    /* renamed from: g */
    private final Executor f13755g;

    /* renamed from: h */
    private final Executor f13756h;

    /* renamed from: i */
    private final b40 f13757i;

    /* renamed from: j */
    private final om1 f13758j;

    public rn1(C3208t1 t1Var, ks2 ks2, wm1 wm1, rm1 rm1, co1 co1, ko1 ko1, Executor executor, Executor executor2, om1 om1) {
        this.f13749a = t1Var;
        this.f13750b = ks2;
        this.f13757i = ks2.f9644i;
        this.f13751c = wm1;
        this.f13752d = rm1;
        this.f13753e = co1;
        this.f13754f = ko1;
        this.f13755g = executor;
        this.f13756h = executor2;
        this.f13758j = om1;
    }

    /* renamed from: g */
    private static void m16352g(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* renamed from: h */
    private final boolean m16353h(ViewGroup viewGroup, boolean z) {
        View N = z ? this.f13752d.mo10560N() : this.f13752d.mo10561O();
        if (N == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (N.getParent() instanceof ViewGroup) {
            ((ViewGroup) N.getParent()).removeView(N);
        }
        viewGroup.addView(N, ((Boolean) C2199sw.m17001c().mo8579b(m10.f10630v2)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo10611a(ViewGroup viewGroup) {
        C3208t1 t1Var;
        String str;
        String valueOf;
        boolean z = viewGroup != null;
        if (this.f13752d.mo10560N() != null) {
            if (this.f13752d.mo10557K() == 2 || this.f13752d.mo10557K() == 1) {
                t1Var = this.f13749a;
                str = this.f13750b.f9641f;
                valueOf = String.valueOf(this.f13752d.mo10557K());
            } else if (this.f13752d.mo10557K() == 6) {
                this.f13749a.mo14073E(this.f13750b.f9641f, "2", z);
                t1Var = this.f13749a;
                str = this.f13750b.f9641f;
                valueOf = "1";
            } else {
                return;
            }
            t1Var.mo14073E(str, valueOf, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo10612b(mo1 mo1) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        k40 a;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        Context context = null;
        if (this.f13751c.mo11497e() || this.f13751c.mo11496d()) {
            String[] strArr = {"1098", "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View n0 = mo1.mo8712n0(strArr[i]);
                if (n0 != null && (n0 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) n0;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context2 = mo1.mo8702d().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f13752d.mo10559M() != null) {
            view = this.f13752d.mo10559M();
            b40 b40 = this.f13757i;
            if (b40 != null && viewGroup == null) {
                m16352g(layoutParams, b40.f4685j);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(this.f13752d.mo10566T() instanceof w30)) {
            view = null;
        } else {
            w30 w30 = (w30) this.f13752d.mo10566T();
            if (viewGroup == null) {
                m16352g(layoutParams, w30.mo11567c());
            }
            x30 x30 = new x30(context2, w30, layoutParams);
            x30.setContentDescription((CharSequence) C2199sw.m17001c().mo8579b(m10.f10614t2));
            view = x30;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                C2481i iVar = new C2481i(mo1.mo8702d().getContext());
                iVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                iVar.addView(view);
                FrameLayout f = mo1.mo8703f();
                if (f != null) {
                    f.addView(iVar);
                }
            }
            mo1.mo8701b3(mo1.mo8707j(), view, true);
        }
        e73<String> e73 = mn1.f10962s;
        int size = e73.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View n02 = mo1.mo8712n0(e73.get(i2));
            i2++;
            if (n02 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) n02;
                break;
            }
        }
        this.f13756h.execute(new nn1(this, viewGroup2));
        if (viewGroup2 != null) {
            if (!m16353h(viewGroup2, true)) {
                if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10440Z6)).booleanValue() || !m16353h(viewGroup2, false)) {
                    viewGroup2.removeAllViews();
                    View d = mo1.mo8702d();
                    if (d != null) {
                        context = d.getContext();
                    }
                    if (context != null && (a = this.f13758j.mo9796a()) != null) {
                        try {
                            C2635a h = a.mo6512h();
                            if (h != null && (drawable = (Drawable) C2637b.m21357C0(h)) != null) {
                                ImageView imageView = new ImageView(context);
                                imageView.setImageDrawable(drawable);
                                C2635a i3 = mo1.mo8706i();
                                if (i3 != null) {
                                    if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10262D4)).booleanValue()) {
                                        scaleType = (ImageView.ScaleType) C2637b.m21357C0(i3);
                                        imageView.setScaleType(scaleType);
                                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        viewGroup2.addView(imageView);
                                    }
                                }
                                scaleType = ImageView.ScaleType.CENTER_INSIDE;
                                imageView.setScaleType(scaleType);
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                viewGroup2.addView(imageView);
                            }
                        } catch (RemoteException unused) {
                            io0.m11131g("Could not get main image drawable");
                        }
                    }
                } else if (this.f13752d.mo10570X() != null) {
                    this.f13752d.mo10570X().mo7103W0(new qn1(mo1, viewGroup2));
                }
            } else if (this.f13752d.mo10572Z() != null) {
                this.f13752d.mo10572Z().mo7103W0(new qn1(mo1, viewGroup2));
            }
        }
    }

    /* renamed from: c */
    public final void mo10613c(mo1 mo1) {
        if (mo1 != null && this.f13753e != null && mo1.mo8703f() != null && this.f13751c.mo11498f()) {
            try {
                mo1.mo8703f().addView(this.f13753e.mo6238a());
            } catch (qu0 e) {
                C3202r1.m24016l("web view can not be obtained", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo10614d(mo1 mo1) {
        if (mo1 != null) {
            Context context = mo1.mo8702d().getContext();
            if (C3154e1.m23871h(context, this.f13751c.f16858a)) {
                if (!(context instanceof Activity)) {
                    io0.m11126b("Activity context is needed for policy validator.");
                } else if (this.f13754f != null && mo1.mo8703f() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f13754f.mo8719a(mo1.mo8703f(), windowManager), C3154e1.m23865b());
                    } catch (qu0 e) {
                        C3202r1.m24016l("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo10615e(mo1 mo1) {
        this.f13755g.execute(new on1(this, mo1));
    }

    /* renamed from: f */
    public final boolean mo10616f(ViewGroup viewGroup) {
        return m16353h(viewGroup, true);
    }
}
