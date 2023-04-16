package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class az2 {

    /* renamed from: c */
    private static final az2 f4543c = new az2();

    /* renamed from: a */
    private final ArrayList<py2> f4544a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<py2> f4545b = new ArrayList<>();

    private az2() {
    }

    /* renamed from: a */
    public static az2 m6457a() {
        return f4543c;
    }

    /* renamed from: b */
    public final Collection<py2> mo5586b() {
        return Collections.unmodifiableCollection(this.f4545b);
    }

    /* renamed from: c */
    public final Collection<py2> mo5587c() {
        return Collections.unmodifiableCollection(this.f4544a);
    }

    /* renamed from: d */
    public final void mo5588d(py2 py2) {
        this.f4544a.add(py2);
    }

    /* renamed from: e */
    public final void mo5589e(py2 py2) {
        boolean g = mo5591g();
        this.f4544a.remove(py2);
        this.f4545b.remove(py2);
        if (g && !mo5591g()) {
            hz2.m10831b().mo8049f();
        }
    }

    /* renamed from: f */
    public final void mo5590f(py2 py2) {
        boolean g = mo5591g();
        this.f4545b.add(py2);
        if (!g) {
            hz2.m10831b().mo8048e();
        }
    }

    /* renamed from: g */
    public final boolean mo5591g() {
        return this.f4545b.size() > 0;
    }
}
