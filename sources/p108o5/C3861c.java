package p108o5;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import kotlin.jvm.internal.C3357i;
import p079k4.C3330q;
import p101n5.C3785a;
import p145u4.C4139a;

/* renamed from: o5.c */
public final class C3861c {

    /* renamed from: a */
    private final C3872m f21887a;

    /* renamed from: b */
    private AudioManager.OnAudioFocusChangeListener f21888b;

    /* renamed from: c */
    private AudioFocusRequest f21889c;

    public C3861c(C3872m mVar) {
        C3357i.m24508e(mVar, "player");
        this.f21887a = mVar;
    }

    /* renamed from: c */
    private final AudioManager m25874c() {
        return this.f21887a.mo15328f();
    }

    /* renamed from: d */
    private final C3785a m25875d() {
        return this.f21887a.mo15329g();
    }

    /* renamed from: e */
    private final void m25876e(int i, C4139a<C3330q> aVar) {
        if (i == 1) {
            aVar.invoke();
        }
    }

    /* renamed from: h */
    private final void m25877h(C4139a<C3330q> aVar) {
        Integer d = m25875d().mo15022d();
        if (d != null) {
            AudioFocusRequest build = new AudioFocusRequest.Builder(d.intValue()).setAudioAttributes(m25875d().mo15020a()).setOnAudioFocusChangeListener(new C3859a(this, aVar)).build();
            this.f21889c = build;
            m25876e(m25874c().requestAudioFocus(build), aVar);
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m25878i(C3861c cVar, C4139a aVar, int i) {
        C3357i.m24508e(cVar, "this$0");
        C3357i.m24508e(aVar, "$andThen");
        cVar.m25876e(i, aVar);
    }

    /* renamed from: j */
    private final void m25879j(C4139a<C3330q> aVar) {
        Integer d = m25875d().mo15022d();
        if (d != null) {
            int intValue = d.intValue();
            this.f21888b = new C3860b(this, aVar);
            m25876e(m25874c().requestAudioFocus(this.f21888b, 3, intValue), aVar);
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m25880k(C3861c cVar, C4139a aVar, int i) {
        C3357i.m24508e(cVar, "this$0");
        C3357i.m24508e(aVar, "$andThen");
        cVar.m25876e(i, aVar);
    }

    /* renamed from: f */
    public final void mo15291f() {
        if (m25875d().mo15022d() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.f21889c;
            if (audioFocusRequest != null) {
                m25874c().abandonAudioFocusRequest(audioFocusRequest);
                return;
            }
            return;
        }
        m25874c().abandonAudioFocus(this.f21888b);
    }

    /* renamed from: g */
    public final void mo15292g(C4139a<C3330q> aVar) {
        C3357i.m24508e(aVar, "andThen");
        if (m25875d().mo15022d() == null) {
            aVar.invoke();
        } else if (Build.VERSION.SDK_INT >= 26) {
            m25877h(aVar);
        } else {
            m25879j(aVar);
        }
    }
}
