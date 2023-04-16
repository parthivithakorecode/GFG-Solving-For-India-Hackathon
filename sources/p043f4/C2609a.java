package p043f4;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import p005a4.C0144j;
import p005a4.C0145k;

/* renamed from: f4.a */
class C2609a implements C0145k.C0149c {

    /* renamed from: a */
    private C2610b f18975a;

    C2609a(C2610b bVar) {
        this.f18975a = bVar;
    }

    /* renamed from: a */
    private void m21304a(C0144j jVar) {
        if (!(jVar.f270b instanceof Map)) {
            throw new IllegalArgumentException("Map argument expected");
        }
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        String str = jVar.f269a;
        str.hashCode();
        if (str.equals("shareFiles")) {
            m21304a(jVar);
            try {
                this.f18975a.mo12502l((List) jVar.mo332a("paths"), (List) jVar.mo332a("mimeTypes"), (String) jVar.mo332a("text"), (String) jVar.mo332a("subject"));
                dVar.mo338a((Object) null);
            } catch (IOException e) {
                dVar.mo339b(e.getMessage(), (String) null, (Object) null);
            }
        } else if (!str.equals("share")) {
            dVar.mo340c();
        } else {
            m21304a(jVar);
            this.f18975a.mo12501k((String) jVar.mo332a("text"), (String) jVar.mo332a("subject"));
            dVar.mo338a((Object) null);
        }
    }
}
