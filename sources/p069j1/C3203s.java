package p069j1;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j1.s */
public final /* synthetic */ class C3203s implements DialogInterface.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ AtomicInteger f20539f;

    public /* synthetic */ C3203s(AtomicInteger atomicInteger) {
        this.f20539f = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f20539f.set(i);
    }
}
