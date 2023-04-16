package p012b1;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p002a1.C0024h;
import p002a1.C0028l;
import p002a1.C0040w;
import p002a1.C0042x;
import p003a2.C0092o;

/* renamed from: b1.b */
public final class C1293b extends C0028l {
    public C1293b(@RecentlyNonNull Context context) {
        super(context, 0);
        C0092o.m314j(context, "Context cannot be null");
    }

    /* renamed from: e */
    public void mo4612e(@RecentlyNonNull C1291a aVar) {
        this.f49f.mo9381o(aVar.mo42a());
    }

    @RecentlyNullable
    public C0024h[] getAdSizes() {
        return this.f49f.mo9370a();
    }

    @RecentlyNullable
    public C1296e getAppEventListener() {
        return this.f49f.mo9377k();
    }

    @RecentlyNonNull
    public C0040w getVideoController() {
        return this.f49f.mo9375i();
    }

    @RecentlyNullable
    public C0042x getVideoOptions() {
        return this.f49f.mo9376j();
    }

    public void setAdSizes(@RecentlyNonNull C0024h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f49f.mo9387u(hVarArr);
    }

    public void setAppEventListener(C1296e eVar) {
        this.f49f.mo9389w(eVar);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f49f.mo9390x(z);
    }

    public void setVideoOptions(@RecentlyNonNull C0042x xVar) {
        this.f49f.mo9392z(xVar);
    }
}
