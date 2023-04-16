package androidx.activity.result;

import androidx.activity.result.C0228d;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1107k;
import androidx.lifecycle.C1110m;
import p031e.C2532a;

class ActivityResultRegistry$1 implements C1107k {

    /* renamed from: a */
    final /* synthetic */ String f420a;

    /* renamed from: b */
    final /* synthetic */ C0226b f421b;

    /* renamed from: c */
    final /* synthetic */ C2532a f422c;

    /* renamed from: d */
    final /* synthetic */ C0228d f423d;

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        if (C1099i.C1101b.ON_START.equals(bVar)) {
            this.f423d.f431f.put(this.f420a, new C0228d.C0230b(this.f421b, this.f422c));
            if (this.f423d.f432g.containsKey(this.f420a)) {
                Object obj = this.f423d.f432g.get(this.f420a);
                this.f423d.f432g.remove(this.f420a);
                this.f421b.mo556a(obj);
            }
            C0224a aVar = (C0224a) this.f423d.f433h.getParcelable(this.f420a);
            if (aVar != null) {
                this.f423d.f433h.remove(this.f420a);
                this.f421b.mo556a(this.f422c.mo3639a(aVar.mo548c(), aVar.mo547b()));
            }
        } else if (C1099i.C1101b.ON_STOP.equals(bVar)) {
            this.f423d.f431f.remove(this.f420a);
        } else if (C1099i.C1101b.ON_DESTROY.equals(bVar)) {
            this.f423d.mo562i(this.f420a);
        }
    }
}
