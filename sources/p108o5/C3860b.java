package p108o5;

import android.media.AudioManager;
import p145u4.C4139a;

/* renamed from: o5.b */
public final /* synthetic */ class C3860b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C3861c f21885a;

    /* renamed from: b */
    public final /* synthetic */ C4139a f21886b;

    public /* synthetic */ C3860b(C3861c cVar, C4139a aVar) {
        this.f21885a = cVar;
        this.f21886b = aVar;
    }

    public final void onAudioFocusChange(int i) {
        C3861c.m25880k(this.f21885a, this.f21886b, i);
    }
}
