package p136t1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C1980mz;
import com.google.android.gms.internal.ads.io0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p002a1.C0018d;
import p002a1.C0024h;

/* renamed from: t1.b */
public final class C4060b extends ViewGroup {
    @NotOnlyInitialized

    /* renamed from: f */
    private final C1980mz f22260f;

    @RecentlyNonNull
    public C0018d getAdListener() {
        return this.f22260f.mo9371d();
    }

    @RecentlyNullable
    public C0024h getAdSize() {
        return this.f22260f.mo9372e();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f22260f.mo9379m();
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
        this.f22260f.mo9385s(dVar);
    }

    public void setAdSize(@RecentlyNonNull C0024h hVar) {
        this.f22260f.mo9386t(hVar);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.f22260f.mo9388v(str);
    }
}
