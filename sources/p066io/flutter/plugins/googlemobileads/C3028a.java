package p066io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import p002a1.C0013a;
import p002a1.C0039v;
import p005a4.C0145k;
import p066io.flutter.plugins.googlemobileads.C3035c0;
import p066io.flutter.plugins.googlemobileads.C3042e;

/* renamed from: io.flutter.plugins.googlemobileads.a */
class C3028a {

    /* renamed from: a */
    private Activity f20047a;

    /* renamed from: b */
    private final Map<Integer, C3042e> f20048b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0145k f20049c;

    /* renamed from: io.flutter.plugins.googlemobileads.a$a */
    class C3029a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Map f20050f;

        C3029a(Map map) {
            this.f20050f = map;
        }

        public void run() {
            C3028a.this.f20049c.mo335c("onAdEvent", this.f20050f);
        }
    }

    C3028a(C0145k kVar) {
        this.f20049c = kVar;
    }

    /* renamed from: g */
    private void m23380g(Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new C3029a(map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3042e mo13743b(int i) {
        return this.f20048b.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Integer mo13744c(C3042e eVar) {
        for (Integer next : this.f20048b.keySet()) {
            if (this.f20048b.get(next) == eVar) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13745d(int i) {
        if (this.f20048b.containsKey(Integer.valueOf(i))) {
            C3042e eVar = this.f20048b.get(Integer.valueOf(i));
            if (eVar != null) {
                eVar.mo13771b();
            }
            this.f20048b.remove(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13746e() {
        for (Map.Entry next : this.f20048b.entrySet()) {
            if (next.getValue() != null) {
                ((C3042e) next.getValue()).mo13771b();
            }
        }
        this.f20048b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity mo13747f() {
        return this.f20047a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo13748h(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdClicked");
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo13749i(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdClosed");
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo13750j(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdDismissedFullScreenContent");
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo13751k(int i, C3042e.C3045c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdFailedToLoad");
        hashMap.put("loadAdError", cVar);
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo13752l(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdImpression");
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo13753m(int i, C0039v vVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdLoaded");
        hashMap.put("responseInfo", vVar == null ? null : new C3042e.C3047e(vVar));
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo13754n(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdMetadataChanged");
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo13755o(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdOpened");
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo13756p(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdShowedFullScreenContent");
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo13757q(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAppEvent");
        hashMap.put("name", str);
        hashMap.put("data", str2);
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo13758r(int i, C0013a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onFailedToShowFullScreenContent");
        hashMap.put("error", new C3042e.C3043a(aVar));
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo13759s(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onFluidAdHeightChanged");
        hashMap.put("height", Integer.valueOf(i2));
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo13760t(C3042e eVar, C3075n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", mo13744c(eVar));
        hashMap.put("eventName", "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(nVar.f20163c));
        hashMap.put("precision", Integer.valueOf(nVar.f20161a));
        hashMap.put("currencyCode", nVar.f20162b);
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo13761u(int i, C3035c0.C3037b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", bVar);
        m23380g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo13762v(Activity activity) {
        this.f20047a = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo13763w(int i) {
        C3042e.C3046d dVar = (C3042e.C3046d) mo13743b(i);
        if (dVar == null) {
            return false;
        }
        dVar.mo13773e();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo13764x(C3042e eVar, int i) {
        if (this.f20048b.get(Integer.valueOf(i)) == null) {
            this.f20048b.put(Integer.valueOf(i), eVar);
        } else {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", new Object[]{Integer.valueOf(i)}));
        }
    }
}
