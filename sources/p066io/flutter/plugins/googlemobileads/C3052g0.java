package p066io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p002a1.C0017c;
import p002a1.C0033q;
import p005a4.C0145k;
import p005a4.C0159s;
import p029d4.C2496d;
import p047g1.C2633b;
import p047g1.C2634c;
import p104o1.C3821c;
import p104o1.C3827e;
import p132s3.C4047a;
import p138t3.C4076a;
import p138t3.C4078c;

/* renamed from: io.flutter.plugins.googlemobileads.g0 */
public class C3052g0 implements C4047a, C4076a, C0145k.C0149c {

    /* renamed from: a */
    private C4047a.C4049b f20105a;

    /* renamed from: b */
    private C3028a f20106b;

    /* renamed from: c */
    private C3031b f20107c;

    /* renamed from: d */
    private AppStateNotifier f20108d;

    /* renamed from: e */
    private C2496d f20109e;

    /* renamed from: f */
    private final Map<String, C3055c> f20110f = new HashMap();

    /* renamed from: g */
    private C3062i0 f20111g;

    /* renamed from: h */
    private final C3087v f20112h = new C3087v();

    /* renamed from: io.flutter.plugins.googlemobileads.g0$a */
    class C3053a implements C0033q {

        /* renamed from: a */
        final /* synthetic */ C0145k.C0150d f20113a;

        C3053a(C0145k.C0150d dVar) {
            this.f20113a = dVar;
        }

        /* renamed from: a */
        public void mo104a(C0017c cVar) {
            if (cVar != null) {
                this.f20113a.mo339b(Integer.toString(cVar.mo19a()), cVar.mo21c(), cVar.mo20b());
                return;
            }
            this.f20113a.mo338a((Object) null);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.g0$b */
    private static final class C3054b implements C2634c {

        /* renamed from: a */
        private final C0145k.C0150d f20115a;

        /* renamed from: b */
        private boolean f20116b;

        private C3054b(C0145k.C0150d dVar) {
            this.f20115a = dVar;
            this.f20116b = false;
        }

        /* synthetic */ C3054b(C0145k.C0150d dVar, C3053a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo12520a(C2633b bVar) {
            if (!this.f20116b) {
                this.f20115a.mo338a(new C3084t(bVar));
                this.f20116b = true;
            }
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.g0$c */
    public interface C3055c {
        /* renamed from: a */
        C3827e mo13817a(C3821c cVar, Map<String, Object> map);
    }

    /* renamed from: b */
    private static <T> T m23473b(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3034c mo13816a(Context context) {
        return new C3034c(context);
    }

    public void onAttachedToActivity(C4078c cVar) {
        C3028a aVar = this.f20106b;
        if (aVar != null) {
            aVar.mo13762v(cVar.mo13517d());
        }
        C3031b bVar = this.f20107c;
        if (bVar != null) {
            bVar.mo13766r(cVar.mo13517d());
        }
        C2496d dVar = this.f20109e;
        if (dVar != null) {
            dVar.mo12398c(cVar.mo13517d());
        }
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        this.f20105a = bVar;
        C3031b bVar2 = new C3031b(bVar.mo15539a());
        this.f20107c = bVar2;
        C3062i0 i0Var = this.f20111g;
        if (i0Var != null) {
            bVar2.mo13767s(i0Var);
        }
        C0145k kVar = new C0145k(bVar.mo15540b(), "plugins.flutter.io/google_mobile_ads", new C0159s(this.f20107c));
        kVar.mo337e(this);
        this.f20106b = new C3028a(kVar);
        bVar.mo15541c().mo13667a("plugins.flutter.io/google_mobile_ads/ad_widget", new C3057h0(this.f20106b));
        this.f20108d = new AppStateNotifier(bVar.mo15540b());
        this.f20109e = new C2496d(bVar.mo15540b(), bVar.mo15539a());
    }

    public void onDetachedFromActivity() {
        C4047a.C4049b bVar;
        C3031b bVar2 = this.f20107c;
        if (!(bVar2 == null || (bVar = this.f20105a) == null)) {
            bVar2.mo13766r(bVar.mo15539a());
        }
        C3028a aVar = this.f20106b;
        if (aVar != null) {
            aVar.mo13762v((Activity) null);
        }
        C2496d dVar = this.f20109e;
        if (dVar != null) {
            dVar.mo12398c((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        C4047a.C4049b bVar;
        C3031b bVar2 = this.f20107c;
        if (!(bVar2 == null || (bVar = this.f20105a) == null)) {
            bVar2.mo13766r(bVar.mo15539a());
        }
        C3028a aVar = this.f20106b;
        if (aVar != null) {
            aVar.mo13762v((Activity) null);
        }
        C2496d dVar = this.f20109e;
        if (dVar != null) {
            dVar.mo12398c((Activity) null);
        }
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        AppStateNotifier appStateNotifier = this.f20108d;
        if (appStateNotifier != null) {
            appStateNotifier.mo13742k();
            this.f20108d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x030b, code lost:
        r2.mo338a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0442, code lost:
        r2.mo339b(r3, r1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04f9, code lost:
        r2.mo338a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0587, code lost:
        r2.mo339b("InvalidRequest", "A null or invalid ad request was provided.", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p005a4.C0144j r24, p005a4.C0145k.C0150d r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            if (r3 == 0) goto L_0x063d
            s3.a$b r4 = r0.f20105a
            if (r4 != 0) goto L_0x0010
            goto L_0x063d
        L_0x0010:
            android.app.Activity r3 = r3.mo13747f()
            if (r3 == 0) goto L_0x001d
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            android.app.Activity r3 = r3.mo13747f()
            goto L_0x0023
        L_0x001d:
            s3.a$b r3 = r0.f20105a
            android.content.Context r3 = r3.mo15539a()
        L_0x0023:
            java.lang.String r4 = r1.f269a
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            r7 = 1
            r8 = 0
            switch(r6) {
                case -1959534605: goto L_0x0161;
                case -1941808395: goto L_0x0156;
                case -1826439721: goto L_0x014b;
                case -1771320504: goto L_0x0140;
                case -1548893609: goto L_0x0135;
                case -1395015128: goto L_0x012a;
                case -1273455673: goto L_0x011f;
                case -965504608: goto L_0x0114;
                case -768079951: goto L_0x0106;
                case -676596397: goto L_0x00f8;
                case -572043403: goto L_0x00ea;
                case -533157842: goto L_0x00dc;
                case -436783448: goto L_0x00ce;
                case -172783533: goto L_0x00c0;
                case 90971631: goto L_0x00b2;
                case 250880674: goto L_0x00a4;
                case 273004986: goto L_0x0096;
                case 288452133: goto L_0x0088;
                case 316173893: goto L_0x007a;
                case 1064076149: goto L_0x006c;
                case 1355848557: goto L_0x005e;
                case 1403601573: goto L_0x0050;
                case 1661969852: goto L_0x0042;
                case 1882741923: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x016b
        L_0x0034:
            java.lang.String r6 = "loadRewardedInterstitialAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x003e
            goto L_0x016b
        L_0x003e:
            r5 = 23
            goto L_0x016b
        L_0x0042:
            java.lang.String r6 = "setImmersiveMode"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x004c
            goto L_0x016b
        L_0x004c:
            r5 = 22
            goto L_0x016b
        L_0x0050:
            java.lang.String r6 = "MobileAds#initialize"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x005a
            goto L_0x016b
        L_0x005a:
            r5 = 21
            goto L_0x016b
        L_0x005e:
            java.lang.String r6 = "showAdWithoutView"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0068
            goto L_0x016b
        L_0x0068:
            r5 = 20
            goto L_0x016b
        L_0x006c:
            java.lang.String r6 = "MobileAds#openAdInspector"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0076
            goto L_0x016b
        L_0x0076:
            r5 = 19
            goto L_0x016b
        L_0x007a:
            java.lang.String r6 = "MobileAds#disableMediationInitialization"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0084
            goto L_0x016b
        L_0x0084:
            r5 = 18
            goto L_0x016b
        L_0x0088:
            java.lang.String r6 = "MobileAds#updateRequestConfiguration"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0092
            goto L_0x016b
        L_0x0092:
            r5 = 17
            goto L_0x016b
        L_0x0096:
            java.lang.String r6 = "getAdSize"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00a0
            goto L_0x016b
        L_0x00a0:
            r5 = 16
            goto L_0x016b
        L_0x00a4:
            java.lang.String r6 = "disposeAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00ae
            goto L_0x016b
        L_0x00ae:
            r5 = 15
            goto L_0x016b
        L_0x00b2:
            java.lang.String r6 = "_init"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00bc
            goto L_0x016b
        L_0x00bc:
            r5 = 14
            goto L_0x016b
        L_0x00c0:
            java.lang.String r6 = "loadAdManagerBannerAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00ca
            goto L_0x016b
        L_0x00ca:
            r5 = 13
            goto L_0x016b
        L_0x00ce:
            java.lang.String r6 = "MobileAds#getVersionString"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00d8
            goto L_0x016b
        L_0x00d8:
            r5 = 12
            goto L_0x016b
        L_0x00dc:
            java.lang.String r6 = "MobileAds#setAppVolume"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00e6
            goto L_0x016b
        L_0x00e6:
            r5 = 11
            goto L_0x016b
        L_0x00ea:
            java.lang.String r6 = "loadBannerAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00f4
            goto L_0x016b
        L_0x00f4:
            r5 = 10
            goto L_0x016b
        L_0x00f8:
            java.lang.String r6 = "loadAdManagerInterstitialAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0102
            goto L_0x016b
        L_0x0102:
            r5 = 9
            goto L_0x016b
        L_0x0106:
            java.lang.String r6 = "AdSize#getAnchoredAdaptiveBannerAdSize"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0110
            goto L_0x016b
        L_0x0110:
            r5 = 8
            goto L_0x016b
        L_0x0114:
            java.lang.String r6 = "loadNativeAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x011d
            goto L_0x016b
        L_0x011d:
            r5 = 7
            goto L_0x016b
        L_0x011f:
            java.lang.String r6 = "loadFluidAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0128
            goto L_0x016b
        L_0x0128:
            r5 = 6
            goto L_0x016b
        L_0x012a:
            java.lang.String r6 = "MobileAds#getRequestConfiguration"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0133
            goto L_0x016b
        L_0x0133:
            r5 = 5
            goto L_0x016b
        L_0x0135:
            java.lang.String r6 = "loadRewardedAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x013e
            goto L_0x016b
        L_0x013e:
            r5 = 4
            goto L_0x016b
        L_0x0140:
            java.lang.String r6 = "loadAppOpenAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0149
            goto L_0x016b
        L_0x0149:
            r5 = 3
            goto L_0x016b
        L_0x014b:
            java.lang.String r6 = "MobileAds#setAppMuted"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0154
            goto L_0x016b
        L_0x0154:
            r5 = 2
            goto L_0x016b
        L_0x0156:
            java.lang.String r6 = "loadInterstitialAd"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x015f
            goto L_0x016b
        L_0x015f:
            r5 = r7
            goto L_0x016b
        L_0x0161:
            java.lang.String r6 = "MobileAds#openDebugMenu"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r5 = r8
        L_0x016b:
            java.lang.String r4 = "A null or invalid ad request was provided."
            java.lang.String r6 = "InvalidRequest"
            java.lang.String r9 = "orientation"
            java.lang.String r10 = "serverSideVerificationOptions"
            java.lang.String r11 = "adManagerRequest"
            java.lang.String r12 = "request"
            java.lang.String r13 = "adUnitId"
            java.lang.String r14 = "adId"
            r15 = 0
            switch(r5) {
                case 0: goto L_0x062f;
                case 1: goto L_0x05f6;
                case 2: goto L_0x05e3;
                case 3: goto L_0x058c;
                case 4: goto L_0x04fe;
                case 5: goto L_0x04f3;
                case 6: goto L_0x04bb;
                case 7: goto L_0x0424;
                case 8: goto L_0x03f4;
                case 9: goto L_0x03a8;
                case 10: goto L_0x0367;
                case 11: goto L_0x0355;
                case 12: goto L_0x034d;
                case 13: goto L_0x0310;
                case 14: goto L_0x0306;
                case 15: goto L_0x02f6;
                case 16: goto L_0x02b6;
                case 17: goto L_0x026a;
                case 18: goto L_0x0263;
                case 19: goto L_0x0257;
                case 20: goto L_0x023c;
                case 21: goto L_0x0230;
                case 22: goto L_0x020d;
                case 23: goto L_0x0184;
                default: goto L_0x017f;
            }
        L_0x017f:
            r25.mo340c()
            goto L_0x063c
        L_0x0184:
            java.lang.Object r5 = r1.mo332a(r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = m23473b(r5)
            r19 = r5
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r5 = r1.mo332a(r12)
            r20 = r5
            io.flutter.plugins.googlemobileads.l r20 = (p066io.flutter.plugins.googlemobileads.C3067l) r20
            java.lang.Object r5 = r1.mo332a(r11)
            io.flutter.plugins.googlemobileads.i r5 = (p066io.flutter.plugins.googlemobileads.C3059i) r5
            java.lang.Object r7 = r1.mo332a(r10)
            r21 = r7
            io.flutter.plugins.googlemobileads.e0 r21 = (p066io.flutter.plugins.googlemobileads.C3048e0) r21
            if (r20 == 0) goto L_0x01cd
            io.flutter.plugins.googlemobileads.d0 r4 = new io.flutter.plugins.googlemobileads.d0
            java.lang.Object r5 = r1.mo332a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r17 = r5.intValue()
            io.flutter.plugins.googlemobileads.a r5 = r0.f20106b
            java.lang.Object r5 = m23473b(r5)
            r18 = r5
            io.flutter.plugins.googlemobileads.a r18 = (p066io.flutter.plugins.googlemobileads.C3028a) r18
            io.flutter.plugins.googlemobileads.h r5 = new io.flutter.plugins.googlemobileads.h
            r5.<init>(r3)
            r16 = r4
            r22 = r5
            r16.<init>((int) r17, (p066io.flutter.plugins.googlemobileads.C3028a) r18, (java.lang.String) r19, (p066io.flutter.plugins.googlemobileads.C3067l) r20, (p066io.flutter.plugins.googlemobileads.C3048e0) r21, (p066io.flutter.plugins.googlemobileads.C3056h) r22)
            goto L_0x01f3
        L_0x01cd:
            if (r5 == 0) goto L_0x0587
            io.flutter.plugins.googlemobileads.d0 r4 = new io.flutter.plugins.googlemobileads.d0
            java.lang.Object r6 = r1.mo332a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r17 = r6.intValue()
            io.flutter.plugins.googlemobileads.a r6 = r0.f20106b
            java.lang.Object r6 = m23473b(r6)
            r18 = r6
            io.flutter.plugins.googlemobileads.a r18 = (p066io.flutter.plugins.googlemobileads.C3028a) r18
            io.flutter.plugins.googlemobileads.h r6 = new io.flutter.plugins.googlemobileads.h
            r6.<init>(r3)
            r16 = r4
            r20 = r5
            r22 = r6
            r16.<init>((int) r17, (p066io.flutter.plugins.googlemobileads.C3028a) r18, (java.lang.String) r19, (p066io.flutter.plugins.googlemobileads.C3059i) r20, (p066io.flutter.plugins.googlemobileads.C3048e0) r21, (p066io.flutter.plugins.googlemobileads.C3056h) r22)
        L_0x01f3:
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = m23473b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13764x(r4, r1)
            r4.mo13787f()
            goto L_0x030b
        L_0x020d:
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r4 = r1.mo332a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            io.flutter.plugins.googlemobileads.e r3 = r3.mo13743b(r4)
            io.flutter.plugins.googlemobileads.e$d r3 = (p066io.flutter.plugins.googlemobileads.C3042e.C3046d) r3
            java.lang.String r4 = "immersiveModeEnabled"
            java.lang.Object r1 = r1.mo332a(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3.mo13772d(r1)
            goto L_0x030b
        L_0x0230:
            io.flutter.plugins.googlemobileads.v r1 = r0.f20112h
            io.flutter.plugins.googlemobileads.g0$b r4 = new io.flutter.plugins.googlemobileads.g0$b
            r4.<init>(r2, r15)
            r1.mo13895d(r3, r4)
            goto L_0x063c
        L_0x023c:
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r3.mo13763w(r1)
            if (r1 != 0) goto L_0x030b
            java.lang.String r1 = "AdShowError"
            java.lang.String r3 = "Ad failed to show."
            r2.mo339b(r1, r3, r15)
            goto L_0x063c
        L_0x0257:
            io.flutter.plugins.googlemobileads.v r1 = r0.f20112h
            io.flutter.plugins.googlemobileads.g0$a r4 = new io.flutter.plugins.googlemobileads.g0$a
            r4.<init>(r2)
            r1.mo13896e(r3, r4)
            goto L_0x063c
        L_0x0263:
            io.flutter.plugins.googlemobileads.v r1 = r0.f20112h
            r1.mo13892a(r3)
            goto L_0x030b
        L_0x026a:
            a1.u r3 = p002a1.C0032p.m100b()
            a1.u$a r3 = r3.mo111e()
            java.lang.String r4 = "maxAdContentRating"
            java.lang.Object r4 = r1.mo332a(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "tagForChildDirectedTreatment"
            java.lang.Object r5 = r1.mo332a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.String r6 = "tagForUnderAgeOfConsent"
            java.lang.Object r6 = r1.mo332a(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.String r7 = "testDeviceIds"
            java.lang.Object r1 = r1.mo332a(r7)
            java.util.List r1 = (java.util.List) r1
            if (r4 == 0) goto L_0x0297
            r3.mo113b(r4)
        L_0x0297:
            if (r5 == 0) goto L_0x02a0
            int r4 = r5.intValue()
            r3.mo114c(r4)
        L_0x02a0:
            if (r6 == 0) goto L_0x02a9
            int r4 = r6.intValue()
            r3.mo115d(r4)
        L_0x02a9:
            if (r1 == 0) goto L_0x02ae
            r3.mo116e(r1)
        L_0x02ae:
            a1.u r1 = r3.mo112a()
            p002a1.C0032p.m107i(r1)
            goto L_0x030b
        L_0x02b6:
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            io.flutter.plugins.googlemobileads.e r1 = r3.mo13743b(r1)
            if (r1 != 0) goto L_0x02c9
            goto L_0x030b
        L_0x02c9:
            boolean r3 = r1 instanceof p066io.flutter.plugins.googlemobileads.C3081q
            if (r3 == 0) goto L_0x02d5
            io.flutter.plugins.googlemobileads.q r1 = (p066io.flutter.plugins.googlemobileads.C3081q) r1
            io.flutter.plugins.googlemobileads.m r1 = r1.mo13886d()
            goto L_0x04f9
        L_0x02d5:
            boolean r3 = r1 instanceof p066io.flutter.plugins.googlemobileads.C3063j
            if (r3 == 0) goto L_0x02e1
            io.flutter.plugins.googlemobileads.j r1 = (p066io.flutter.plugins.googlemobileads.C3063j) r1
            io.flutter.plugins.googlemobileads.m r1 = r1.mo13840d()
            goto L_0x04f9
        L_0x02e1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected ad type for getAdSize: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "unexpected_ad_type"
            goto L_0x0442
        L_0x02f6:
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13745d(r1)
            goto L_0x030b
        L_0x0306:
            io.flutter.plugins.googlemobileads.a r1 = r0.f20106b
            r1.mo13746e()
        L_0x030b:
            r2.mo338a(r15)
            goto L_0x063c
        L_0x0310:
            io.flutter.plugins.googlemobileads.j r10 = new io.flutter.plugins.googlemobileads.j
            java.lang.Object r4 = r1.mo332a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            io.flutter.plugins.googlemobileads.a r5 = r0.f20106b
            java.lang.Object r6 = r1.mo332a(r13)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "sizes"
            java.lang.Object r7 = r1.mo332a(r7)
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.mo332a(r12)
            io.flutter.plugins.googlemobileads.i r8 = (p066io.flutter.plugins.googlemobileads.C3059i) r8
            io.flutter.plugins.googlemobileads.c r9 = r0.mo13816a(r3)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13764x(r10, r1)
            r10.mo13841e()
            goto L_0x030b
        L_0x034d:
            io.flutter.plugins.googlemobileads.v r1 = r0.f20112h
            java.lang.String r1 = r1.mo13894c()
            goto L_0x04f9
        L_0x0355:
            io.flutter.plugins.googlemobileads.v r3 = r0.f20112h
            java.lang.String r4 = "volume"
            java.lang.Object r1 = r1.mo332a(r4)
            java.lang.Double r1 = (java.lang.Double) r1
            double r4 = r1.doubleValue()
            r3.mo13899h(r4)
            goto L_0x030b
        L_0x0367:
            io.flutter.plugins.googlemobileads.q r4 = new io.flutter.plugins.googlemobileads.q
            java.lang.Object r5 = r1.mo332a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r7 = r5.intValue()
            io.flutter.plugins.googlemobileads.a r8 = r0.f20106b
            java.lang.Object r5 = r1.mo332a(r13)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r5 = r1.mo332a(r12)
            r10 = r5
            io.flutter.plugins.googlemobileads.l r10 = (p066io.flutter.plugins.googlemobileads.C3067l) r10
            java.lang.String r5 = "size"
            java.lang.Object r5 = r1.mo332a(r5)
            r11 = r5
            io.flutter.plugins.googlemobileads.m r11 = (p066io.flutter.plugins.googlemobileads.C3069m) r11
            io.flutter.plugins.googlemobileads.c r12 = r0.mo13816a(r3)
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13764x(r4, r1)
            r4.mo13887e()
            goto L_0x030b
        L_0x03a8:
            io.flutter.plugins.googlemobileads.k r4 = new io.flutter.plugins.googlemobileads.k
            java.lang.Object r5 = r1.mo332a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            io.flutter.plugins.googlemobileads.a r5 = r0.f20106b
            java.lang.Object r5 = m23473b(r5)
            r7 = r5
            io.flutter.plugins.googlemobileads.a r7 = (p066io.flutter.plugins.googlemobileads.C3028a) r7
            java.lang.Object r5 = r1.mo332a(r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = m23473b(r5)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r1.mo332a(r12)
            r9 = r5
            io.flutter.plugins.googlemobileads.i r9 = (p066io.flutter.plugins.googlemobileads.C3059i) r9
            io.flutter.plugins.googlemobileads.h r10 = new io.flutter.plugins.googlemobileads.h
            r10.<init>(r3)
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = m23473b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13764x(r4, r1)
            r4.mo13842f()
            goto L_0x030b
        L_0x03f4:
            io.flutter.plugins.googlemobileads.m$b r4 = new io.flutter.plugins.googlemobileads.m$b
            io.flutter.plugins.googlemobileads.m$a r5 = new io.flutter.plugins.googlemobileads.m$a
            r5.<init>()
            java.lang.Object r6 = r1.mo332a(r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "width"
            java.lang.Object r1 = r1.mo332a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.<init>(r3, r5, r6, r1)
            a1.h r1 = p002a1.C0024h.f33q
            a1.h r3 = r4.f20155a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x041c
            goto L_0x030b
        L_0x041c:
            int r1 = r4.f20157c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x04f9
        L_0x0424:
            java.lang.String r4 = "factoryId"
            java.lang.Object r4 = r1.mo332a(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, io.flutter.plugins.googlemobileads.g0$c> r5 = r0.f20110f
            java.lang.Object r5 = r5.get(r4)
            io.flutter.plugins.googlemobileads.g0$c r5 = (p066io.flutter.plugins.googlemobileads.C3052g0.C3055c) r5
            if (r5 != 0) goto L_0x0447
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r8] = r4
            java.lang.String r3 = "Can't find NativeAdFactory with id: %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.String r3 = "NativeAdError"
        L_0x0442:
            r2.mo339b(r3, r1, r15)
            goto L_0x063c
        L_0x0447:
            io.flutter.plugins.googlemobileads.w$a r4 = new io.flutter.plugins.googlemobileads.w$a
            r4.<init>()
            io.flutter.plugins.googlemobileads.a r6 = r0.f20106b
            io.flutter.plugins.googlemobileads.w$a r4 = r4.mo13909h(r6)
            java.lang.Object r6 = r1.mo332a(r13)
            java.lang.String r6 = (java.lang.String) r6
            io.flutter.plugins.googlemobileads.w$a r4 = r4.mo13905d(r6)
            io.flutter.plugins.googlemobileads.w$a r4 = r4.mo13903b(r5)
            java.lang.Object r5 = r1.mo332a(r12)
            io.flutter.plugins.googlemobileads.l r5 = (p066io.flutter.plugins.googlemobileads.C3067l) r5
            io.flutter.plugins.googlemobileads.w$a r4 = r4.mo13911j(r5)
            java.lang.Object r5 = r1.mo332a(r11)
            io.flutter.plugins.googlemobileads.i r5 = (p066io.flutter.plugins.googlemobileads.C3059i) r5
            io.flutter.plugins.googlemobileads.w$a r4 = r4.mo13904c(r5)
            java.lang.String r5 = "customOptions"
            java.lang.Object r5 = r1.mo332a(r5)
            java.util.Map r5 = (java.util.Map) r5
            io.flutter.plugins.googlemobileads.w$a r4 = r4.mo13906e(r5)
            java.lang.Object r5 = r1.mo332a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            io.flutter.plugins.googlemobileads.w$a r4 = r4.mo13908g(r5)
            java.lang.String r5 = "nativeAdOptions"
            java.lang.Object r5 = r1.mo332a(r5)
            io.flutter.plugins.googlemobileads.z r5 = (p066io.flutter.plugins.googlemobileads.C3092z) r5
            io.flutter.plugins.googlemobileads.w$a r4 = r4.mo13910i(r5)
            io.flutter.plugins.googlemobileads.h r5 = new io.flutter.plugins.googlemobileads.h
            r5.<init>(r3)
            io.flutter.plugins.googlemobileads.w$a r3 = r4.mo13907f(r5)
            io.flutter.plugins.googlemobileads.w r3 = r3.mo13902a()
            io.flutter.plugins.googlemobileads.a r4 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.mo13764x(r3, r1)
            r3.mo13900d()
            goto L_0x030b
        L_0x04bb:
            io.flutter.plugins.googlemobileads.d r4 = new io.flutter.plugins.googlemobileads.d
            java.lang.Object r5 = r1.mo332a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            io.flutter.plugins.googlemobileads.a r7 = r0.f20106b
            java.lang.Object r5 = r1.mo332a(r13)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r1.mo332a(r12)
            r9 = r5
            io.flutter.plugins.googlemobileads.i r9 = (p066io.flutter.plugins.googlemobileads.C3059i) r9
            io.flutter.plugins.googlemobileads.c r10 = r0.mo13816a(r3)
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13764x(r4, r1)
            r4.mo13841e()
            goto L_0x030b
        L_0x04f3:
            io.flutter.plugins.googlemobileads.v r1 = r0.f20112h
            a1.u r1 = r1.mo13893b()
        L_0x04f9:
            r2.mo338a(r1)
            goto L_0x063c
        L_0x04fe:
            java.lang.Object r5 = r1.mo332a(r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = m23473b(r5)
            r19 = r5
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r5 = r1.mo332a(r12)
            r20 = r5
            io.flutter.plugins.googlemobileads.l r20 = (p066io.flutter.plugins.googlemobileads.C3067l) r20
            java.lang.Object r5 = r1.mo332a(r11)
            io.flutter.plugins.googlemobileads.i r5 = (p066io.flutter.plugins.googlemobileads.C3059i) r5
            java.lang.Object r7 = r1.mo332a(r10)
            r21 = r7
            io.flutter.plugins.googlemobileads.e0 r21 = (p066io.flutter.plugins.googlemobileads.C3048e0) r21
            if (r20 == 0) goto L_0x0547
            io.flutter.plugins.googlemobileads.c0 r4 = new io.flutter.plugins.googlemobileads.c0
            java.lang.Object r5 = r1.mo332a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r17 = r5.intValue()
            io.flutter.plugins.googlemobileads.a r5 = r0.f20106b
            java.lang.Object r5 = m23473b(r5)
            r18 = r5
            io.flutter.plugins.googlemobileads.a r18 = (p066io.flutter.plugins.googlemobileads.C3028a) r18
            io.flutter.plugins.googlemobileads.h r5 = new io.flutter.plugins.googlemobileads.h
            r5.<init>(r3)
            r16 = r4
            r22 = r5
            r16.<init>((int) r17, (p066io.flutter.plugins.googlemobileads.C3028a) r18, (java.lang.String) r19, (p066io.flutter.plugins.googlemobileads.C3067l) r20, (p066io.flutter.plugins.googlemobileads.C3048e0) r21, (p066io.flutter.plugins.googlemobileads.C3056h) r22)
            goto L_0x056d
        L_0x0547:
            if (r5 == 0) goto L_0x0587
            io.flutter.plugins.googlemobileads.c0 r4 = new io.flutter.plugins.googlemobileads.c0
            java.lang.Object r6 = r1.mo332a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r17 = r6.intValue()
            io.flutter.plugins.googlemobileads.a r6 = r0.f20106b
            java.lang.Object r6 = m23473b(r6)
            r18 = r6
            io.flutter.plugins.googlemobileads.a r18 = (p066io.flutter.plugins.googlemobileads.C3028a) r18
            io.flutter.plugins.googlemobileads.h r6 = new io.flutter.plugins.googlemobileads.h
            r6.<init>(r3)
            r16 = r4
            r20 = r5
            r22 = r6
            r16.<init>((int) r17, (p066io.flutter.plugins.googlemobileads.C3028a) r18, (java.lang.String) r19, (p066io.flutter.plugins.googlemobileads.C3059i) r20, (p066io.flutter.plugins.googlemobileads.C3048e0) r21, (p066io.flutter.plugins.googlemobileads.C3056h) r22)
        L_0x056d:
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = m23473b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13764x(r4, r1)
            r4.mo13774f()
            goto L_0x030b
        L_0x0587:
            r2.mo339b(r6, r4, r15)
            goto L_0x063c
        L_0x058c:
            io.flutter.plugins.googlemobileads.p r4 = new io.flutter.plugins.googlemobileads.p
            java.lang.Object r5 = r1.mo332a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            java.lang.Object r5 = r1.mo332a(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r7 = r5.intValue()
            io.flutter.plugins.googlemobileads.a r5 = r0.f20106b
            java.lang.Object r5 = m23473b(r5)
            r8 = r5
            io.flutter.plugins.googlemobileads.a r8 = (p066io.flutter.plugins.googlemobileads.C3028a) r8
            java.lang.Object r5 = r1.mo332a(r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = m23473b(r5)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r5 = r1.mo332a(r12)
            r10 = r5
            io.flutter.plugins.googlemobileads.l r10 = (p066io.flutter.plugins.googlemobileads.C3067l) r10
            java.lang.Object r5 = r1.mo332a(r11)
            r11 = r5
            io.flutter.plugins.googlemobileads.i r11 = (p066io.flutter.plugins.googlemobileads.C3059i) r11
            io.flutter.plugins.googlemobileads.h r12 = new io.flutter.plugins.googlemobileads.h
            r12.<init>(r3)
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13764x(r4, r1)
            r4.mo13884i()
            goto L_0x030b
        L_0x05e3:
            io.flutter.plugins.googlemobileads.v r3 = r0.f20112h
            java.lang.String r4 = "muted"
            java.lang.Object r1 = r1.mo332a(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3.mo13898g(r1)
            goto L_0x030b
        L_0x05f6:
            io.flutter.plugins.googlemobileads.u r10 = new io.flutter.plugins.googlemobileads.u
            java.lang.Object r4 = r1.mo332a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            io.flutter.plugins.googlemobileads.a r6 = r0.f20106b
            java.lang.Object r4 = r1.mo332a(r13)
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r1.mo332a(r12)
            r8 = r4
            io.flutter.plugins.googlemobileads.l r8 = (p066io.flutter.plugins.googlemobileads.C3067l) r8
            io.flutter.plugins.googlemobileads.h r9 = new io.flutter.plugins.googlemobileads.h
            r9.<init>(r3)
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            io.flutter.plugins.googlemobileads.a r3 = r0.f20106b
            java.lang.Object r1 = r1.mo332a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo13764x(r10, r1)
            r10.mo13888f()
            goto L_0x030b
        L_0x062f:
            java.lang.Object r1 = r1.mo332a(r13)
            java.lang.String r1 = (java.lang.String) r1
            io.flutter.plugins.googlemobileads.v r4 = r0.f20112h
            r4.mo13897f(r3, r1)
            goto L_0x030b
        L_0x063c:
            return
        L_0x063d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "method call received before instanceManager initialized: "
            r2.append(r3)
            java.lang.String r1 = r1.f269a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "GoogleMobileAdsPlugin"
            android.util.Log.e(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugins.googlemobileads.C3052g0.onMethodCall(a4.j, a4.k$d):void");
    }

    public void onReattachedToActivityForConfigChanges(C4078c cVar) {
        C3028a aVar = this.f20106b;
        if (aVar != null) {
            aVar.mo13762v(cVar.mo13517d());
        }
        C3031b bVar = this.f20107c;
        if (bVar != null) {
            bVar.mo13766r(cVar.mo13517d());
        }
        C2496d dVar = this.f20109e;
        if (dVar != null) {
            dVar.mo12398c(cVar.mo13517d());
        }
    }
}
