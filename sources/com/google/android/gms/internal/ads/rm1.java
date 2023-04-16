package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;
import p048g2.C2635a;
import p048g2.C2637b;
import p102o.C3814g;

public final class rm1 {

    /* renamed from: a */
    private int f13712a;

    /* renamed from: b */
    private C1609cz f13713b;

    /* renamed from: c */
    private g40 f13714c;

    /* renamed from: d */
    private View f13715d;

    /* renamed from: e */
    private List<?> f13716e;

    /* renamed from: f */
    private List<C2351wz> f13717f = Collections.emptyList();

    /* renamed from: g */
    private C2351wz f13718g;

    /* renamed from: h */
    private Bundle f13719h;

    /* renamed from: i */
    private eu0 f13720i;

    /* renamed from: j */
    private eu0 f13721j;

    /* renamed from: k */
    private eu0 f13722k;

    /* renamed from: l */
    private C2635a f13723l;

    /* renamed from: m */
    private View f13724m;

    /* renamed from: n */
    private View f13725n;

    /* renamed from: o */
    private C2635a f13726o;

    /* renamed from: p */
    private double f13727p;

    /* renamed from: q */
    private n40 f13728q;

    /* renamed from: r */
    private n40 f13729r;

    /* renamed from: s */
    private String f13730s;

    /* renamed from: t */
    private final C3814g<String, z30> f13731t = new C3814g<>();

    /* renamed from: u */
    private final C3814g<String, String> f13732u = new C3814g<>();

    /* renamed from: v */
    private float f13733v;

    /* renamed from: w */
    private String f13734w;

    /* renamed from: C */
    public static rm1 m16271C(od0 od0) {
        try {
            qm1 G = m16275G(od0.mo9733b3(), (sd0) null);
            g40 M3 = od0.mo9730M3();
            String n = od0.mo9738n();
            List<?> z5 = od0.mo9745z5();
            String o = od0.mo9739o();
            Bundle d = od0.mo9734d();
            String m = od0.mo9737m();
            C2635a k = od0.mo9735k();
            String r = od0.mo9742r();
            String l = od0.mo9736l();
            double b = od0.mo9732b();
            n40 P4 = od0.mo9731P4();
            rm1 rm1 = new rm1();
            rm1.f13712a = 2;
            rm1.f13713b = G;
            rm1.f13714c = M3;
            rm1.f13715d = (View) m16277I(od0.mo9743u5());
            rm1.mo10600u("headline", n);
            rm1.f13716e = z5;
            rm1.mo10600u("body", o);
            rm1.f13719h = d;
            rm1.mo10600u("call_to_action", m);
            rm1.f13724m = (View) m16277I(od0.mo9744y5());
            rm1.f13726o = k;
            rm1.mo10600u("store", r);
            rm1.mo10600u("price", l);
            rm1.f13727p = b;
            rm1.f13728q = P4;
            return rm1;
        } catch (RemoteException e) {
            io0.m11132h("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: D */
    public static rm1 m16272D(pd0 pd0) {
        try {
            qm1 G = m16275G(pd0.mo10025b3(), (sd0) null);
            g40 M3 = pd0.mo10022M3();
            String n = pd0.mo10029n();
            List<?> z5 = pd0.mo10034z5();
            String o = pd0.mo10030o();
            Bundle b = pd0.mo10024b();
            String m = pd0.mo10028m();
            C2635a y5 = pd0.mo10033y5();
            String k = pd0.mo10027k();
            n40 P4 = pd0.mo10023P4();
            rm1 rm1 = new rm1();
            rm1.f13712a = 1;
            rm1.f13713b = G;
            rm1.f13714c = M3;
            rm1.f13715d = (View) m16277I(pd0.mo10026h());
            rm1.mo10600u("headline", n);
            rm1.f13716e = z5;
            rm1.mo10600u("body", o);
            rm1.f13719h = b;
            rm1.mo10600u("call_to_action", m);
            rm1.f13724m = (View) m16277I(pd0.mo10032u5());
            rm1.f13726o = y5;
            rm1.mo10600u("advertiser", k);
            rm1.f13729r = P4;
            return rm1;
        } catch (RemoteException e) {
            io0.m11132h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: E */
    public static rm1 m16273E(od0 od0) {
        try {
            return m16276H(m16275G(od0.mo9733b3(), (sd0) null), od0.mo9730M3(), (View) m16277I(od0.mo9743u5()), od0.mo9738n(), od0.mo9745z5(), od0.mo9739o(), od0.mo9734d(), od0.mo9737m(), (View) m16277I(od0.mo9744y5()), od0.mo9735k(), od0.mo9742r(), od0.mo9736l(), od0.mo9732b(), od0.mo9731P4(), (String) null, 0.0f);
        } catch (RemoteException e) {
            io0.m11132h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: F */
    public static rm1 m16274F(pd0 pd0) {
        try {
            return m16276H(m16275G(pd0.mo10025b3(), (sd0) null), pd0.mo10022M3(), (View) m16277I(pd0.mo10026h()), pd0.mo10029n(), pd0.mo10034z5(), pd0.mo10030o(), pd0.mo10024b(), pd0.mo10028m(), (View) m16277I(pd0.mo10032u5()), pd0.mo10033y5(), (String) null, (String) null, -1.0d, pd0.mo10023P4(), pd0.mo10027k(), 0.0f);
        } catch (RemoteException e) {
            io0.m11132h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: G */
    private static qm1 m16275G(C1609cz czVar, sd0 sd0) {
        if (czVar == null) {
            return null;
        }
        return new qm1(czVar, sd0);
    }

    /* renamed from: H */
    private static rm1 m16276H(C1609cz czVar, g40 g40, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, C2635a aVar, String str4, String str5, double d, n40 n40, String str6, float f) {
        rm1 rm1 = new rm1();
        rm1.f13712a = 6;
        rm1.f13713b = czVar;
        rm1.f13714c = g40;
        rm1.f13715d = view;
        String str7 = str;
        rm1.mo10600u("headline", str);
        rm1.f13716e = list;
        String str8 = str2;
        rm1.mo10600u("body", str2);
        rm1.f13719h = bundle;
        String str9 = str3;
        rm1.mo10600u("call_to_action", str3);
        rm1.f13724m = view2;
        rm1.f13726o = aVar;
        String str10 = str4;
        rm1.mo10600u("store", str4);
        String str11 = str5;
        rm1.mo10600u("price", str5);
        rm1.f13727p = d;
        rm1.f13728q = n40;
        rm1.mo10600u("advertiser", str6);
        rm1.mo10595p(f);
        return rm1;
    }

    /* renamed from: I */
    private static <T> T m16277I(C2635a aVar) {
        if (aVar == null) {
            return null;
        }
        return C2637b.m21357C0(aVar);
    }

    /* renamed from: a0 */
    public static rm1 m16278a0(sd0 sd0) {
        try {
            return m16276H(m16275G(sd0.mo9214i(), sd0), sd0.mo9215j(), (View) m16277I(sd0.mo9220o()), sd0.mo9221p(), sd0.mo9227x(), sd0.mo9225r(), sd0.mo9213h(), sd0.mo9226t(), (View) m16277I(sd0.mo9218m()), sd0.mo9219n(), sd0.mo9228y(), sd0.mo9224q(), sd0.mo9209b(), sd0.mo9216k(), sd0.mo9217l(), sd0.mo9210d());
        } catch (RemoteException e) {
            io0.m11132h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized double mo10554A() {
        return this.f13727p;
    }

    /* renamed from: B */
    public final synchronized void mo10555B(C2635a aVar) {
        this.f13723l = aVar;
    }

    /* renamed from: J */
    public final synchronized float mo10556J() {
        return this.f13733v;
    }

    /* renamed from: K */
    public final synchronized int mo10557K() {
        return this.f13712a;
    }

    /* renamed from: L */
    public final synchronized Bundle mo10558L() {
        if (this.f13719h == null) {
            this.f13719h = new Bundle();
        }
        return this.f13719h;
    }

    /* renamed from: M */
    public final synchronized View mo10559M() {
        return this.f13715d;
    }

    /* renamed from: N */
    public final synchronized View mo10560N() {
        return this.f13724m;
    }

    /* renamed from: O */
    public final synchronized View mo10561O() {
        return this.f13725n;
    }

    /* renamed from: P */
    public final synchronized C3814g<String, z30> mo10562P() {
        return this.f13731t;
    }

    /* renamed from: Q */
    public final synchronized C3814g<String, String> mo10563Q() {
        return this.f13732u;
    }

    /* renamed from: R */
    public final synchronized C1609cz mo10564R() {
        return this.f13713b;
    }

    /* renamed from: S */
    public final synchronized C2351wz mo10565S() {
        return this.f13718g;
    }

    /* renamed from: T */
    public final synchronized g40 mo10566T() {
        return this.f13714c;
    }

    /* renamed from: U */
    public final n40 mo10567U() {
        List<?> list = this.f13716e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.f13716e.get(0);
            if (obj instanceof IBinder) {
                return m40.m13048z5((IBinder) obj);
            }
        }
        return null;
    }

    /* renamed from: V */
    public final synchronized n40 mo10568V() {
        return this.f13728q;
    }

    /* renamed from: W */
    public final synchronized n40 mo10569W() {
        return this.f13729r;
    }

    /* renamed from: X */
    public final synchronized eu0 mo10570X() {
        return this.f13721j;
    }

    /* renamed from: Y */
    public final synchronized eu0 mo10571Y() {
        return this.f13722k;
    }

    /* renamed from: Z */
    public final synchronized eu0 mo10572Z() {
        return this.f13720i;
    }

    /* renamed from: a */
    public final synchronized String mo10573a() {
        return this.f13734w;
    }

    /* renamed from: b */
    public final synchronized String mo10574b() {
        return mo10578d("price");
    }

    /* renamed from: b0 */
    public final synchronized C2635a mo10575b0() {
        return this.f13726o;
    }

    /* renamed from: c */
    public final synchronized String mo10576c() {
        return mo10578d("store");
    }

    /* renamed from: c0 */
    public final synchronized C2635a mo10577c0() {
        return this.f13723l;
    }

    /* renamed from: d */
    public final synchronized String mo10578d(String str) {
        return this.f13732u.get(str);
    }

    /* renamed from: d0 */
    public final synchronized String mo10579d0() {
        return mo10578d("advertiser");
    }

    /* renamed from: e */
    public final synchronized List<?> mo10580e() {
        return this.f13716e;
    }

    /* renamed from: e0 */
    public final synchronized String mo10581e0() {
        return mo10578d("body");
    }

    /* renamed from: f */
    public final synchronized List<C2351wz> mo10582f() {
        return this.f13717f;
    }

    /* renamed from: f0 */
    public final synchronized String mo10583f0() {
        return mo10578d("call_to_action");
    }

    /* renamed from: g */
    public final synchronized void mo10584g() {
        eu0 eu0 = this.f13720i;
        if (eu0 != null) {
            eu0.destroy();
            this.f13720i = null;
        }
        eu0 eu02 = this.f13721j;
        if (eu02 != null) {
            eu02.destroy();
            this.f13721j = null;
        }
        eu0 eu03 = this.f13722k;
        if (eu03 != null) {
            eu03.destroy();
            this.f13722k = null;
        }
        this.f13723l = null;
        this.f13731t.clear();
        this.f13732u.clear();
        this.f13713b = null;
        this.f13714c = null;
        this.f13715d = null;
        this.f13716e = null;
        this.f13719h = null;
        this.f13724m = null;
        this.f13725n = null;
        this.f13726o = null;
        this.f13728q = null;
        this.f13729r = null;
        this.f13730s = null;
    }

    /* renamed from: g0 */
    public final synchronized String mo10585g0() {
        return this.f13730s;
    }

    /* renamed from: h */
    public final synchronized void mo10586h(g40 g40) {
        this.f13714c = g40;
    }

    /* renamed from: h0 */
    public final synchronized String mo10587h0() {
        return mo10578d("headline");
    }

    /* renamed from: i */
    public final synchronized void mo10588i(String str) {
        this.f13730s = str;
    }

    /* renamed from: j */
    public final synchronized void mo10589j(C2351wz wzVar) {
        this.f13718g = wzVar;
    }

    /* renamed from: k */
    public final synchronized void mo10590k(n40 n40) {
        this.f13728q = n40;
    }

    /* renamed from: l */
    public final synchronized void mo10591l(String str, z30 z30) {
        if (z30 == null) {
            this.f13731t.remove(str);
        } else {
            this.f13731t.put(str, z30);
        }
    }

    /* renamed from: m */
    public final synchronized void mo10592m(eu0 eu0) {
        this.f13721j = eu0;
    }

    /* renamed from: n */
    public final synchronized void mo10593n(List<z30> list) {
        this.f13716e = list;
    }

    /* renamed from: o */
    public final synchronized void mo10594o(n40 n40) {
        this.f13729r = n40;
    }

    /* renamed from: p */
    public final synchronized void mo10595p(float f) {
        this.f13733v = f;
    }

    /* renamed from: q */
    public final synchronized void mo10596q(List<C2351wz> list) {
        this.f13717f = list;
    }

    /* renamed from: r */
    public final synchronized void mo10597r(eu0 eu0) {
        this.f13722k = eu0;
    }

    /* renamed from: s */
    public final synchronized void mo10598s(String str) {
        this.f13734w = str;
    }

    /* renamed from: t */
    public final synchronized void mo10599t(double d) {
        this.f13727p = d;
    }

    /* renamed from: u */
    public final synchronized void mo10600u(String str, String str2) {
        if (str2 == null) {
            this.f13732u.remove(str);
        } else {
            this.f13732u.put(str, str2);
        }
    }

    /* renamed from: v */
    public final synchronized void mo10601v(int i) {
        this.f13712a = i;
    }

    /* renamed from: w */
    public final synchronized void mo10602w(C1609cz czVar) {
        this.f13713b = czVar;
    }

    /* renamed from: x */
    public final synchronized void mo10603x(View view) {
        this.f13724m = view;
    }

    /* renamed from: y */
    public final synchronized void mo10604y(eu0 eu0) {
        this.f13720i = eu0;
    }

    /* renamed from: z */
    public final synchronized void mo10605z(View view) {
        this.f13725n = view;
    }
}
