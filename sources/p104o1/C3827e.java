package p104o1;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.C2425yz;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.k40;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.q40;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p002a1.C0031o;
import p048g2.C2635a;
import p048g2.C2637b;

/* renamed from: o1.e */
public final class C3827e extends FrameLayout {
    @NotOnlyInitialized

    /* renamed from: f */
    private final FrameLayout f21823f;
    @NotOnlyInitialized

    /* renamed from: g */
    private final q40 f21824g;

    /* renamed from: e */
    private final void m25790e(String str, View view) {
        q40 q40 = this.f21824g;
        if (q40 != null) {
            try {
                q40.mo9324a5(str, C2637b.m21358Z2(view));
            } catch (RemoteException e) {
                io0.m11129e("Unable to call setAssetView on delegate", e);
            }
        }
    }

    /* renamed from: a */
    public void mo15219a() {
        q40 q40 = this.f21824g;
        if (q40 != null) {
            try {
                q40.mo9325c();
            } catch (RemoteException e) {
                io0.m11129e("Unable to destroy native ad view", e);
            }
        }
    }

    public final void addView(@RecentlyNonNull View view, int i, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f21823f);
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: b */
    public final View mo15221b(@RecentlyNonNull String str) {
        q40 q40 = this.f21824g;
        if (q40 != null) {
            try {
                C2635a s = q40.mo9332s(str);
                if (s != null) {
                    return (View) C2637b.m21357C0(s);
                }
            } catch (RemoteException e) {
                io0.m11129e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final void bringChildToFront(@RecentlyNonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f21823f;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo15223c(C0031o oVar) {
        q40 q40 = this.f21824g;
        if (q40 != null) {
            try {
                if (oVar instanceof C2425yz) {
                    q40.mo9331r4(((C2425yz) oVar).mo12110a());
                } else if (oVar == null) {
                    q40.mo9331r4((k40) null);
                } else {
                    io0.m11126b("Use MediaContent provided by NativeAd.getMediaContent");
                }
            } catch (RemoteException e) {
                io0.m11129e("Unable to call setMediaContent on delegate", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo15224d(ImageView.ScaleType scaleType) {
        q40 q40 = this.f21824g;
        if (q40 != null && scaleType != null) {
            try {
                q40.mo9321T4(C2637b.m21358Z2(scaleType));
            } catch (RemoteException e) {
                io0.m11129e("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    public final boolean dispatchTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        q40 q40;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10489f2)).booleanValue() && (q40 = this.f21824g) != null) {
            try {
                q40.mo9326e0(C2637b.m21358Z2(motionEvent));
            } catch (RemoteException e) {
                io0.m11129e("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @RecentlyNullable
    public C3819a getAdChoicesView() {
        View b = mo15221b("3011");
        if (b instanceof C3819a) {
            return (C3819a) b;
        }
        return null;
    }

    @RecentlyNullable
    public final View getAdvertiserView() {
        return mo15221b("3005");
    }

    @RecentlyNullable
    public final View getBodyView() {
        return mo15221b("3004");
    }

    @RecentlyNullable
    public final View getCallToActionView() {
        return mo15221b("3002");
    }

    @RecentlyNullable
    public final View getHeadlineView() {
        return mo15221b("3001");
    }

    @RecentlyNullable
    public final View getIconView() {
        return mo15221b("3003");
    }

    @RecentlyNullable
    public final View getImageView() {
        return mo15221b("3008");
    }

    @RecentlyNullable
    public final C3820b getMediaView() {
        View b = mo15221b("3010");
        if (b instanceof C3820b) {
            return (C3820b) b;
        }
        if (b == null) {
            return null;
        }
        io0.m11126b("View is not an instance of MediaView");
        return null;
    }

    @RecentlyNullable
    public final View getPriceView() {
        return mo15221b("3007");
    }

    @RecentlyNullable
    public final View getStarRatingView() {
        return mo15221b("3009");
    }

    @RecentlyNullable
    public final View getStoreView() {
        return mo15221b("3006");
    }

    public final void onVisibilityChanged(@RecentlyNonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        q40 q40 = this.f21824g;
        if (q40 != null) {
            try {
                q40.mo9333s2(C2637b.m21358Z2(view), i);
            } catch (RemoteException e) {
                io0.m11129e("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f21823f);
    }

    public final void removeView(@RecentlyNonNull View view) {
        if (this.f21823f != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(C3819a aVar) {
        m25790e("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        m25790e("3005", view);
    }

    public final void setBodyView(View view) {
        m25790e("3004", view);
    }

    public final void setCallToActionView(View view) {
        m25790e("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        q40 q40 = this.f21824g;
        if (q40 != null) {
            try {
                q40.mo9323W1(C2637b.m21358Z2(view));
            } catch (RemoteException e) {
                io0.m11129e("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        m25790e("3001", view);
    }

    public final void setIconView(View view) {
        m25790e("3003", view);
    }

    public final void setImageView(View view) {
        m25790e("3008", view);
    }

    public final void setMediaView(C3820b bVar) {
        m25790e("3010", bVar);
        if (bVar != null) {
            bVar.mo15202a(new C3829g(this));
            bVar.mo15203b(new C3830h(this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [g2.a, java.lang.Object] */
    public void setNativeAd(@RecentlyNonNull C3821c cVar) {
        q40 q40 = this.f21824g;
        if (q40 != null) {
            try {
                q40.mo9322V0(cVar.mo8143c());
            } catch (RemoteException e) {
                io0.m11129e("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        m25790e("3007", view);
    }

    public final void setStarRatingView(View view) {
        m25790e("3009", view);
    }

    public final void setStoreView(View view) {
        m25790e("3006", view);
    }
}
