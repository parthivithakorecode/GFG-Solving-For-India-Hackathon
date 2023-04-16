package p066io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import p066io.flutter.embedding.android.C2920k;
import p066io.flutter.embedding.engine.C2961a;
import p099n3.C3768b;
import p168y3.C4472b;

/* renamed from: io.flutter.embedding.android.FlutterSplashView */
final class FlutterSplashView extends FrameLayout {

    /* renamed from: o */
    private static String f19644o = "FlutterSplashView";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2955x f19645f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2920k f19646g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View f19647h;

    /* renamed from: i */
    Bundle f19648i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f19649j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f19650k;

    /* renamed from: l */
    private final C2920k.C2926f f19651l;

    /* renamed from: m */
    private final C4472b f19652m;

    /* renamed from: n */
    private final Runnable f19653n;

    @Keep
    /* renamed from: io.flutter.embedding.android.FlutterSplashView$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new C2895a();
        /* access modifiers changed from: private */
        public String previousCompletedSplashIsolate;
        /* access modifiers changed from: private */
        public Bundle splashScreenState;

        /* renamed from: io.flutter.embedding.android.FlutterSplashView$SavedState$a */
        class C2895a implements Parcelable.Creator<SavedState> {
            C2895a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$a */
    class C2896a implements C2920k.C2926f {
        C2896a() {
        }

        /* renamed from: a */
        public void mo13231a() {
        }

        /* renamed from: b */
        public void mo13232b(C2961a aVar) {
            FlutterSplashView.this.f19646g.mo13380y(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.mo13223g(flutterSplashView.f19646g, FlutterSplashView.this.f19645f);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$b */
    class C2897b implements C4472b {
        C2897b() {
        }

        /* renamed from: c */
        public void mo13233c() {
        }

        /* renamed from: f */
        public void mo13234f() {
            if (FlutterSplashView.this.f19645f != null) {
                FlutterSplashView.this.m22771k();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$c */
    class C2898c implements Runnable {
        C2898c() {
        }

        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f19647h);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            String unused = flutterSplashView2.f19650k = flutterSplashView2.f19649j;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19651l = new C2896a();
        this.f19652m = new C2897b();
        this.f19653n = new C2898c();
        setSaveEnabled(true);
    }

    /* renamed from: h */
    private boolean m22768h() {
        C2920k kVar = this.f19646g;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        } else if (kVar.mo13379w()) {
            return this.f19646g.getAttachedFlutterEngine().mo13477h().mo15273k() != null && this.f19646g.getAttachedFlutterEngine().mo13477h().mo15273k().equals(this.f19650k);
        } else {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    /* renamed from: i */
    private boolean m22769i() {
        C2920k kVar = this.f19646g;
        return kVar != null && kVar.mo13379w() && !this.f19646g.mo13378u() && !m22768h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f19645f;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22770j() {
        /*
            r1 = this;
            io.flutter.embedding.android.k r0 = r1.f19646g
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.mo13379w()
            if (r0 == 0) goto L_0x001c
            io.flutter.embedding.android.x r0 = r1.f19645f
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.mo13240b()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.m22772l()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.embedding.android.FlutterSplashView.m22770j():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m22771k() {
        this.f19649j = this.f19646g.getAttachedFlutterEngine().mo13477h().mo15273k();
        String str = f19644o;
        C3768b.m25592f(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f19649j);
        this.f19645f.mo13239a(this.f19653n);
    }

    /* renamed from: l */
    private boolean m22772l() {
        C2920k kVar = this.f19646g;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        } else if (kVar.mo13379w()) {
            return this.f19646g.mo13378u() && !m22768h();
        } else {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    /* renamed from: g */
    public void mo13223g(C2920k kVar, C2955x xVar) {
        C2920k kVar2 = this.f19646g;
        if (kVar2 != null) {
            kVar2.mo13381z(this.f19652m);
            removeView(this.f19646g);
        }
        View view = this.f19647h;
        if (view != null) {
            removeView(view);
        }
        this.f19646g = kVar;
        addView(kVar);
        this.f19645f = xVar;
        if (xVar == null) {
            return;
        }
        if (m22769i()) {
            C3768b.m25592f(f19644o, "Showing splash screen UI.");
            View c = xVar.mo13241c(getContext(), this.f19648i);
            this.f19647h = c;
            addView(c);
            kVar.mo13359l(this.f19652m);
        } else if (m22770j()) {
            C3768b.m25592f(f19644o, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c2 = xVar.mo13241c(getContext(), this.f19648i);
            this.f19647h = c2;
            addView(c2);
            m22771k();
        } else if (!kVar.mo13379w()) {
            C3768b.m25592f(f19644o, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
            kVar.mo13358k(this.f19651l);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f19650k = savedState.previousCompletedSplashIsolate;
        this.f19648i = savedState.splashScreenState;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        String unused = savedState.previousCompletedSplashIsolate = this.f19650k;
        C2955x xVar = this.f19645f;
        Bundle unused2 = savedState.splashScreenState = xVar != null ? xVar.mo13242d() : null;
        return savedState;
    }
}
