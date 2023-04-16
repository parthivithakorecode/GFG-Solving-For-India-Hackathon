package p069j1;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j1.r */
public final /* synthetic */ class C3200r implements DialogInterface.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ C3218x f20534f;

    /* renamed from: g */
    public final /* synthetic */ AtomicInteger f20535g;

    /* renamed from: h */
    public final /* synthetic */ int f20536h;

    /* renamed from: i */
    public final /* synthetic */ int f20537i;

    /* renamed from: j */
    public final /* synthetic */ int f20538j;

    public /* synthetic */ C3200r(C3218x xVar, AtomicInteger atomicInteger, int i, int i2, int i3) {
        this.f20534f = xVar;
        this.f20535g = atomicInteger;
        this.f20536h = i;
        this.f20537i = i2;
        this.f20538j = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f20534f.mo14122h(this.f20535g, this.f20536h, this.f20537i, this.f20538j, dialogInterface, i);
    }
}
