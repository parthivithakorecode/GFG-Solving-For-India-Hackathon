package p066io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.Collections;
import p002a1.C0024h;
import p012b1.C1293b;
import p066io.flutter.plugin.platform.C3007f;

/* renamed from: io.flutter.plugins.googlemobileads.d */
final class C3038d extends C3063j {

    /* renamed from: h */
    private ViewGroup f20070h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f20071i = -1;

    /* renamed from: io.flutter.plugins.googlemobileads.d$a */
    class C3039a implements View.OnLayoutChangeListener {
        C3039a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight != C3038d.this.f20071i) {
                C3038d dVar = C3038d.this;
                dVar.f20126b.mo13759s(dVar.f20081a, measuredHeight);
            }
            int unused = C3038d.this.f20071i = measuredHeight;
        }
    }

    C3038d(int i, C3028a aVar, String str, C3059i iVar, C3034c cVar) {
        super(i, aVar, str, Collections.singletonList(new C3069m(C0024h.f32p)), iVar, cVar);
    }

    /* renamed from: a */
    public void mo13783a() {
        C1293b bVar = this.f20131g;
        if (bVar != null) {
            bVar.addOnLayoutChangeListener(new C3039a());
            this.f20126b.mo13753m(this.f20081a, this.f20131g.getResponseInfo());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        C1293b bVar = this.f20131g;
        if (bVar != null) {
            bVar.mo83a();
            this.f20131g = null;
        }
        ViewGroup viewGroup = this.f20070h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f20070h = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3007f mo13784c() {
        if (this.f20131g == null) {
            return null;
        }
        ViewGroup viewGroup = this.f20070h;
        if (viewGroup != null) {
            return new C3033b0(viewGroup);
        }
        ScrollView h = mo13785h();
        if (h == null) {
            return null;
        }
        h.setClipChildren(false);
        h.setVerticalScrollBarEnabled(false);
        h.setHorizontalScrollBarEnabled(false);
        this.f20070h = h;
        h.addView(this.f20131g);
        return new C3033b0(this.f20131g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ScrollView mo13785h() {
        if (this.f20126b.mo13747f() != null) {
            return new ScrollView(this.f20126b.mo13747f());
        }
        Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
        return null;
    }
}
