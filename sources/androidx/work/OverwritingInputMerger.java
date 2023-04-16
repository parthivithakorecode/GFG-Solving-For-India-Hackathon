package androidx.work;

import androidx.work.C1239b;
import java.util.HashMap;
import java.util.List;
import p089m0.C3643h;

public final class OverwritingInputMerger extends C3643h {
    /* renamed from: b */
    public C1239b mo4439b(List<C1239b> list) {
        C1239b.C1240a aVar = new C1239b.C1240a();
        HashMap hashMap = new HashMap();
        for (C1239b h : list) {
            hashMap.putAll(h.mo4503h());
        }
        aVar.mo4511d(hashMap);
        return aVar.mo4508a();
    }
}
