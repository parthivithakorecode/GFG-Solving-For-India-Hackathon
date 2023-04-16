package p069j1;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.s33;
import p054h1.C2694t;

/* renamed from: j1.s1 */
public final class C3205s1 extends s33 {
    public C3205s1(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10716a(Message message) {
        try {
            super.mo10716a(message);
        } catch (Throwable th) {
            C2694t.m21608q();
            C3163g2.m23940p(C2694t.m21607p().mo11021c(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C2694t.m21607p().mo11034s(e, "AdMobHandler.handleMessage");
        }
    }
}
