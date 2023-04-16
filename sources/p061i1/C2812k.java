package p061i1;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.eu0;

/* renamed from: i1.k */
public final class C2812k {

    /* renamed from: a */
    public final int f19482a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f19483b;

    /* renamed from: c */
    public final ViewGroup f19484c;

    /* renamed from: d */
    public final Context f19485d;

    public C2812k(eu0 eu0) {
        this.f19483b = eu0.getLayoutParams();
        ViewParent parent = eu0.getParent();
        this.f19485d = eu0.mo7085I();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C2810i("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f19484c = viewGroup;
        this.f19482a = viewGroup.indexOfChild(eu0.mo7105Y());
        viewGroup.removeView(eu0.mo7105Y());
        eu0.mo7102V(true);
    }
}
