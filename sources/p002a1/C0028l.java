package p002a1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C1980mz;
import com.google.android.gms.internal.ads.C2420yu;
import com.google.android.gms.internal.ads.io0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p012b1.C1296e;

/* renamed from: a1.l */
public abstract class C0028l extends ViewGroup {
    @NotOnlyInitialized

    /* renamed from: f */
    protected final C1980mz f49f;

    protected C0028l(@RecentlyNonNull Context context, int i) {
        super(context);
        this.f49f = new C1980mz(this, i);
    }

    /* renamed from: a */
    public void mo83a() {
        this.f49f.mo9380n();
    }

    /* renamed from: b */
    public void mo84b(@RecentlyNonNull C0022g gVar) {
        this.f49f.mo9381o(gVar.mo42a());
    }

    /* renamed from: c */
    public void mo85c() {
        this.f49f.mo9382p();
    }

    /* renamed from: d */
    public void mo86d() {
        this.f49f.mo9383q();
    }

    @RecentlyNonNull
    public C0018d getAdListener() {
        return this.f49f.mo9371d();
    }

    @RecentlyNullable
    public C0024h getAdSize() {
        return this.f49f.mo9372e();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f49f.mo9379m();
    }

    @RecentlyNullable
    public C0034r getOnPaidEventListener() {
        return this.f49f.mo9373f();
    }

    @RecentlyNullable
    public C0039v getResponseInfo() {
        return this.f49f.mo9374g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        C0024h hVar;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e) {
                io0.m11129e("Unable to retrieve ad size.", e);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int k = hVar.mo61k(context);
                i3 = hVar.mo57d(context);
                i4 = k;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(@RecentlyNonNull C0018d dVar) {
        this.f49f.mo9385s(dVar);
        if (dVar == null) {
            this.f49f.mo9384r((C2420yu) null);
            return;
        }
        if (dVar instanceof C2420yu) {
            this.f49f.mo9384r((C2420yu) dVar);
        }
        if (dVar instanceof C1296e) {
            this.f49f.mo9389w((C1296e) dVar);
        }
    }

    public void setAdSize(@RecentlyNonNull C0024h hVar) {
        this.f49f.mo9386t(hVar);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.f49f.mo9388v(str);
    }

    public void setOnPaidEventListener(C0034r rVar) {
        this.f49f.mo9391y(rVar);
    }
}
