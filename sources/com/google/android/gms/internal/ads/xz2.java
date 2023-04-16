package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

public final class xz2 {

    /* renamed from: a */
    private final HashMap<View, String> f17466a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, wz2> f17467b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f17468c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f17469d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f17470e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f17471f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f17472g = new HashMap<>();

    /* renamed from: h */
    private boolean f17473h;

    /* renamed from: a */
    public final View mo11936a(String str) {
        return this.f17468c.get(str);
    }

    /* renamed from: b */
    public final wz2 mo11937b(View view) {
        wz2 wz2 = this.f17467b.get(view);
        if (wz2 != null) {
            this.f17467b.remove(view);
        }
        return wz2;
    }

    /* renamed from: c */
    public final String mo11938c(String str) {
        return this.f17472g.get(str);
    }

    /* renamed from: d */
    public final String mo11939d(View view) {
        if (this.f17466a.size() == 0) {
            return null;
        }
        String str = this.f17466a.get(view);
        if (str != null) {
            this.f17466a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public final HashSet<String> mo11940e() {
        return this.f17471f;
    }

    /* renamed from: f */
    public final HashSet<String> mo11941f() {
        return this.f17470e;
    }

    /* renamed from: g */
    public final void mo11942g() {
        this.f17466a.clear();
        this.f17467b.clear();
        this.f17468c.clear();
        this.f17469d.clear();
        this.f17470e.clear();
        this.f17471f.clear();
        this.f17472g.clear();
        this.f17473h = false;
    }

    /* renamed from: h */
    public final void mo11943h() {
        this.f17473h = true;
    }

    /* renamed from: i */
    public final void mo11944i() {
        az2 a = az2.m6457a();
        if (a != null) {
            for (py2 next : a.mo5586b()) {
                View f = next.mo10202f();
                if (next.mo10206j()) {
                    String h = next.mo10204h();
                    if (f != null) {
                        String str = null;
                        if (!f.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = f;
                            while (true) {
                                if (view == null) {
                                    this.f17469d.addAll(hashSet);
                                    break;
                                }
                                String b = vz2.m18791b(view);
                                if (b != null) {
                                    str = b;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            this.f17470e.add(h);
                            this.f17466a.put(f, h);
                            for (dz2 next2 : next.mo10205i()) {
                                View view2 = (View) next2.mo6757b().get();
                                if (view2 != null) {
                                    wz2 wz2 = this.f17467b.get(view2);
                                    if (wz2 != null) {
                                        wz2.mo11754c(next.mo10204h());
                                    } else {
                                        this.f17467b.put(view2, new wz2(next2, next.mo10204h()));
                                    }
                                }
                            }
                        } else {
                            this.f17471f.add(h);
                            this.f17468c.put(h, f);
                            this.f17472g.put(h, str);
                        }
                    } else {
                        this.f17471f.add(h);
                        this.f17472g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final int mo11945j(View view) {
        if (this.f17469d.contains(view)) {
            return 1;
        }
        return this.f17473h ? 2 : 3;
    }
}
