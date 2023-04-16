package p029d4;

import android.app.Activity;
import android.content.Context;
import p005a4.C0128c;
import p005a4.C0145k;
import p005a4.C0159s;
import p137t2.C4063b;
import p137t2.C4065c;
import p137t2.C4070e;
import p137t2.C4071f;

/* renamed from: d4.d */
public class C2496d implements C0145k.C0149c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2495c f18588a;

    /* renamed from: b */
    private final C0145k f18589b;

    /* renamed from: c */
    private final Context f18590c;

    /* renamed from: d */
    private C4065c f18591d;

    /* renamed from: e */
    private Activity f18592e;

    /* renamed from: d4.d$a */
    class C2497a implements C4065c.C4067b {

        /* renamed from: a */
        final /* synthetic */ C0145k.C0150d f18593a;

        C2497a(C0145k.C0150d dVar) {
            this.f18593a = dVar;
        }

        /* renamed from: a */
        public void mo12399a() {
            this.f18593a.mo338a((Object) null);
        }
    }

    /* renamed from: d4.d$b */
    class C2498b implements C4065c.C4066a {

        /* renamed from: a */
        final /* synthetic */ C0145k.C0150d f18595a;

        C2498b(C0145k.C0150d dVar) {
            this.f18595a = dVar;
        }

        /* renamed from: a */
        public void mo12400a(C4070e eVar) {
            this.f18595a.mo339b(Integer.toString(eVar.mo15577a()), eVar.mo15578b(), (Object) null);
        }
    }

    /* renamed from: d4.d$c */
    class C2499c implements C4071f.C4073b {

        /* renamed from: a */
        final /* synthetic */ C0145k.C0150d f18597a;

        C2499c(C0145k.C0150d dVar) {
            this.f18597a = dVar;
        }

        /* renamed from: a */
        public void mo12401a(C4063b bVar) {
            C2496d.this.f18588a.mo12397s(bVar);
            this.f18597a.mo338a(bVar);
        }
    }

    /* renamed from: d4.d$d */
    class C2500d implements C4071f.C4072a {

        /* renamed from: a */
        final /* synthetic */ C0145k.C0150d f18599a;

        C2500d(C0145k.C0150d dVar) {
            this.f18599a = dVar;
        }

        /* renamed from: b */
        public void mo12402b(C4070e eVar) {
            this.f18599a.mo339b(Integer.toString(eVar.mo15577a()), eVar.mo15578b(), (Object) null);
        }
    }

    /* renamed from: d4.d$e */
    class C2501e implements C4063b.C4064a {

        /* renamed from: a */
        final /* synthetic */ C0145k.C0150d f18601a;

        C2501e(C0145k.C0150d dVar) {
            this.f18601a = dVar;
        }

        /* renamed from: a */
        public void mo12403a(C4070e eVar) {
            if (eVar != null) {
                this.f18601a.mo339b(Integer.toString(eVar.mo15577a()), eVar.mo15578b(), (Object) null);
            } else {
                this.f18601a.mo338a((Object) null);
            }
        }
    }

    public C2496d(C0128c cVar, Context context) {
        C2495c cVar2 = new C2495c();
        this.f18588a = cVar2;
        C0145k kVar = new C0145k(cVar, "plugins.flutter.io/google_mobile_ads/ump", new C0159s(cVar2));
        this.f18589b = kVar;
        kVar.mo337e(this);
        this.f18590c = context;
    }

    /* renamed from: b */
    private C4065c m21052b() {
        C4065c cVar = this.f18591d;
        if (cVar != null) {
            return cVar;
        }
        C4065c a = C4071f.m26423a(this.f18590c);
        this.f18591d = a;
        return a;
    }

    /* renamed from: c */
    public void mo12398c(Activity activity) {
        this.f18592e = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        r7.mo338a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        r7.mo338a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p005a4.C0144j r6, p005a4.C0145k.C0150d r7) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f269a
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.String r2 = "ConsentForm#show"
            r3 = -1
            switch(r1) {
                case -2068759970: goto L_0x0050;
                case -1310145901: goto L_0x0045;
                case -971145086: goto L_0x003c;
                case -878979462: goto L_0x0031;
                case -585732218: goto L_0x0026;
                case -497439839: goto L_0x001b;
                case 665104519: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x005a
        L_0x0010:
            java.lang.String r1 = "ConsentInformation#getConsentStatus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0019
            goto L_0x005a
        L_0x0019:
            r3 = 6
            goto L_0x005a
        L_0x001b:
            java.lang.String r1 = "UserMessagingPlatform#loadConsentForm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            goto L_0x005a
        L_0x0024:
            r3 = 5
            goto L_0x005a
        L_0x0026:
            java.lang.String r1 = "ConsentInformation#isConsentFormAvailable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002f
            goto L_0x005a
        L_0x002f:
            r3 = 4
            goto L_0x005a
        L_0x0031:
            java.lang.String r1 = "ConsentForm#dispose"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003a
            goto L_0x005a
        L_0x003a:
            r3 = 3
            goto L_0x005a
        L_0x003c:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0043
            goto L_0x005a
        L_0x0043:
            r3 = 2
            goto L_0x005a
        L_0x0045:
            java.lang.String r1 = "ConsentInformation#requestConsentInfoUpdate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004e
            goto L_0x005a
        L_0x004e:
            r3 = 1
            goto L_0x005a
        L_0x0050:
            java.lang.String r1 = "ConsentInformation#reset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            java.lang.String r0 = "consentForm"
            java.lang.String r1 = "0"
            r4 = 0
            switch(r3) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00c1;
                case 2: goto L_0x00aa;
                case 3: goto L_0x0096;
                case 4: goto L_0x0089;
                case 5: goto L_0x0078;
                case 6: goto L_0x0067;
                default: goto L_0x0062;
            }
        L_0x0062:
            r7.mo340c()
            goto L_0x0103
        L_0x0067:
            t2.c r6 = r5.m21052b()
            int r6 = r6.mo14577d()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x0073:
            r7.mo338a(r6)
            goto L_0x0103
        L_0x0078:
            android.content.Context r6 = r5.f18590c
            d4.d$c r0 = new d4.d$c
            r0.<init>(r7)
            d4.d$d r1 = new d4.d$d
            r1.<init>(r7)
            p137t2.C4071f.m26424b(r6, r0, r1)
            goto L_0x0103
        L_0x0089:
            t2.c r6 = r5.m21052b()
            boolean r6 = r6.mo14574a()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0073
        L_0x0096:
            java.lang.Object r6 = r6.mo332a(r0)
            t2.b r6 = (p137t2.C4063b) r6
            if (r6 != 0) goto L_0x00a4
            java.lang.String r6 = "Called dispose on ad that has been freed"
            android.util.Log.w(r1, r6)
            goto L_0x0100
        L_0x00a4:
            d4.c r0 = r5.f18588a
            r0.mo12396r(r6)
            goto L_0x0100
        L_0x00aa:
            java.lang.Object r6 = r6.mo332a(r0)
            t2.b r6 = (p137t2.C4063b) r6
            if (r6 != 0) goto L_0x00b6
            r7.mo339b(r1, r2, r4)
            goto L_0x0103
        L_0x00b6:
            android.app.Activity r0 = r5.f18592e
            d4.d$e r1 = new d4.d$e
            r1.<init>(r7)
            r6.mo14624a(r0, r1)
            goto L_0x0103
        L_0x00c1:
            android.app.Activity r0 = r5.f18592e
            if (r0 != 0) goto L_0x00cb
            java.lang.String r6 = "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity."
            r7.mo339b(r1, r6, r4)
            goto L_0x0103
        L_0x00cb:
            java.lang.String r0 = "params"
            java.lang.Object r6 = r6.mo332a(r0)
            d4.b r6 = (p029d4.C2494b) r6
            if (r6 != 0) goto L_0x00df
            t2.d$a r6 = new t2.d$a
            r6.<init>()
            t2.d r6 = r6.mo15574a()
            goto L_0x00e5
        L_0x00df:
            android.app.Activity r0 = r5.f18592e
            t2.d r6 = r6.mo12391a(r0)
        L_0x00e5:
            t2.c r0 = r5.m21052b()
            android.app.Activity r1 = r5.f18592e
            d4.d$a r2 = new d4.d$a
            r2.<init>(r7)
            d4.d$b r3 = new d4.d$b
            r3.<init>(r7)
            r0.mo14575b(r1, r6, r2, r3)
            goto L_0x0103
        L_0x00f9:
            t2.c r6 = r5.m21052b()
            r6.mo14576c()
        L_0x0100:
            r7.mo338a(r4)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p029d4.C2496d.onMethodCall(a4.j, a4.k$d):void");
    }
}
