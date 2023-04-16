package p003a2;

import android.app.Activity;
import android.content.Intent;

/* renamed from: a2.z */
final class C0115z extends C0047a0 {

    /* renamed from: f */
    final /* synthetic */ Intent f232f;

    /* renamed from: g */
    final /* synthetic */ Activity f233g;

    /* renamed from: h */
    final /* synthetic */ int f234h;

    C0115z(Intent intent, Activity activity, int i) {
        this.f232f = intent;
        this.f233g = activity;
        this.f234h = i;
    }

    /* renamed from: a */
    public final void mo137a() {
        Intent intent = this.f232f;
        if (intent != null) {
            this.f233g.startActivityForResult(intent, this.f234h);
        }
    }
}
