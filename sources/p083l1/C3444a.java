package p083l1;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import p002a1.C0013a;

/* renamed from: l1.a */
public abstract class C3444a {
    @RecentlyNonNull
    public abstract C3466w getSDKVersionInfo();

    @RecentlyNonNull
    public abstract C3466w getVersionInfo();

    public abstract void initialize(@RecentlyNonNull Context context, @RecentlyNonNull C3445b bVar, @RecentlyNonNull List<C3453j> list);

    public void loadBannerAd(@RecentlyNonNull C3451h hVar, @RecentlyNonNull C3447d<C3450g, Object> dVar) {
        dVar.mo5246a(new C0013a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(@RecentlyNonNull C3451h hVar, @RecentlyNonNull C3447d<C3454k, Object> dVar) {
        dVar.mo5246a(new C0013a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(@RecentlyNonNull C3456m mVar, @RecentlyNonNull C3447d<C3455l, Object> dVar) {
        dVar.mo5246a(new C0013a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(@RecentlyNonNull C3458o oVar, @RecentlyNonNull C3447d<C3465v, Object> dVar) {
        dVar.mo5246a(new C0013a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(@RecentlyNonNull C3461r rVar, @RecentlyNonNull C3447d<C3460q, Object> dVar) {
        dVar.mo5246a(new C0013a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(@RecentlyNonNull C3461r rVar, @RecentlyNonNull C3447d<C3460q, Object> dVar) {
        dVar.mo5246a(new C0013a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
