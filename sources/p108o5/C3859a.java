package p108o5;

import android.media.AudioManager;
import p145u4.C4139a;

/* renamed from: o5.a */
public final /* synthetic */ class C3859a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C3861c f21883a;

    /* renamed from: b */
    public final /* synthetic */ C4139a f21884b;

    public /* synthetic */ C3859a(C3861c cVar, C4139a aVar) {
        this.f21883a = cVar;
        this.f21884b = aVar;
    }

    public final void onAudioFocusChange(int i) {
        C3861c.m25878i(this.f21883a, this.f21884b, i);
    }
}
