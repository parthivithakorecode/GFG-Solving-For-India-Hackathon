package p066io.flutter.embedding.android;

import android.view.KeyEvent;
import p066io.flutter.embedding.android.C2937s;
import p174z3.C4546d;

/* renamed from: io.flutter.embedding.android.m */
public class C2929m implements C2937s.C2942d {

    /* renamed from: a */
    private final C4546d f19753a;

    /* renamed from: b */
    private final C2937s.C2939b f19754b = new C2937s.C2939b();

    public C2929m(C4546d dVar) {
        this.f19753a = dVar;
    }

    /* renamed from: a */
    public void mo13387a(KeyEvent keyEvent, C2937s.C2942d.C2943a aVar) {
        int action = keyEvent.getAction();
        boolean z = false;
        if (action == 0 || action == 1) {
            C4546d.C4548b bVar = new C4546d.C4548b(keyEvent, this.f19754b.mo13397a(keyEvent.getUnicodeChar()));
            if (action != 0) {
                z = true;
            }
            this.f19753a.mo16224e(bVar, z, new C2928l(aVar));
            return;
        }
        aVar.mo13399a(false);
    }
}
