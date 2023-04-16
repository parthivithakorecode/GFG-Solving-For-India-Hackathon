package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

public final class py2 extends ly2 {

    /* renamed from: i */
    private static final Pattern f12960i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final ny2 f12961a;

    /* renamed from: b */
    private final my2 f12962b;

    /* renamed from: c */
    private final List<dz2> f12963c = new ArrayList();

    /* renamed from: d */
    private l03 f12964d;

    /* renamed from: e */
    private oz2 f12965e;

    /* renamed from: f */
    private boolean f12966f = false;

    /* renamed from: g */
    private boolean f12967g = false;

    /* renamed from: h */
    private final String f12968h;

    py2(my2 my2, ny2 ny2) {
        this.f12962b = my2;
        this.f12961a = ny2;
        this.f12968h = UUID.randomUUID().toString();
        m15330k((View) null);
        if (ny2.mo9606d() == oy2.HTML || ny2.mo9606d() == oy2.JAVASCRIPT) {
            this.f12965e = new pz2(ny2.mo9605a());
        } else {
            this.f12965e = new rz2(ny2.mo9611i(), (String) null);
        }
        this.f12965e.mo9902j();
        az2.m6457a().mo5588d(this);
        gz2.m10168a().mo7771d(this.f12965e.mo9893a(), my2.mo9369b());
    }

    /* renamed from: k */
    private final void m15330k(View view) {
        this.f12964d = new l03(view);
    }

    /* renamed from: b */
    public final void mo9093b(View view, ry2 ry2, String str) {
        dz2 dz2;
        if (this.f12967g) {
            return;
        }
        if (f12960i.matcher("Ad overlay").matches()) {
            Iterator<dz2> it = this.f12963c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dz2 = null;
                    break;
                }
                dz2 = it.next();
                if (dz2.mo6757b().get() == view) {
                    break;
                }
            }
            if (dz2 == null) {
                this.f12963c.add(new dz2(view, ry2, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    /* renamed from: c */
    public final void mo9094c() {
        if (!this.f12967g) {
            this.f12964d.clear();
            if (!this.f12967g) {
                this.f12963c.clear();
            }
            this.f12967g = true;
            gz2.m10168a().mo7770c(this.f12965e.mo9893a());
            az2.m6457a().mo5589e(this);
            this.f12965e.mo9895c();
            this.f12965e = null;
        }
    }

    /* renamed from: d */
    public final void mo9095d(View view) {
        if (!this.f12967g && mo10202f() != view) {
            m15330k(view);
            this.f12965e.mo9894b();
            Collection<py2> c = az2.m6457a().mo5587c();
            if (c != null && c.size() > 0) {
                for (py2 next : c) {
                    if (next != this && next.mo10202f() == view) {
                        next.f12964d.clear();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo9096e() {
        if (!this.f12966f) {
            this.f12966f = true;
            az2.m6457a().mo5590f(this);
            this.f12965e.mo9900h(hz2.m10831b().mo8045a());
            this.f12965e.mo9898f(this, this.f12961a);
        }
    }

    /* renamed from: f */
    public final View mo10202f() {
        return (View) this.f12964d.get();
    }

    /* renamed from: g */
    public final oz2 mo10203g() {
        return this.f12965e;
    }

    /* renamed from: h */
    public final String mo10204h() {
        return this.f12968h;
    }

    /* renamed from: i */
    public final List<dz2> mo10205i() {
        return this.f12963c;
    }

    /* renamed from: j */
    public final boolean mo10206j() {
        return this.f12966f && !this.f12967g;
    }
}
