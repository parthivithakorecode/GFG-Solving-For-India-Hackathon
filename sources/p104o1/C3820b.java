package p104o1;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import p002a1.C0031o;

/* renamed from: o1.b */
public class C3820b extends FrameLayout {

    /* renamed from: f */
    private C0031o f21805f;

    /* renamed from: g */
    private boolean f21806g;

    /* renamed from: h */
    private ImageView.ScaleType f21807h;

    /* renamed from: i */
    private boolean f21808i;

    /* renamed from: j */
    private C3829g f21809j;

    /* renamed from: k */
    private C3830h f21810k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo15202a(C3829g gVar) {
        this.f21809j = gVar;
        if (this.f21806g) {
            gVar.f21825a.mo15223c(this.f21805f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo15203b(C3830h hVar) {
        this.f21810k = hVar;
        if (this.f21808i) {
            hVar.f21826a.mo15224d(this.f21807h);
        }
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.f21808i = true;
        this.f21807h = scaleType;
        C3830h hVar = this.f21810k;
        if (hVar != null) {
            hVar.f21826a.mo15224d(scaleType);
        }
    }

    public void setMediaContent(@RecentlyNonNull C0031o oVar) {
        this.f21806g = true;
        this.f21805f = oVar;
        C3829g gVar = this.f21809j;
        if (gVar != null) {
            gVar.f21825a.mo15223c(oVar);
        }
    }
}
