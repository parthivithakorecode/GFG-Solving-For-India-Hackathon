package p029d4;

import android.content.Context;
import java.util.Objects;
import p137t2.C4068d;

/* renamed from: d4.b */
class C2494b {

    /* renamed from: a */
    private final Boolean f18585a;

    /* renamed from: b */
    private final C2493a f18586b;

    C2494b(Boolean bool, C2493a aVar) {
        this.f18585a = bool;
        this.f18586b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4068d mo12391a(Context context) {
        C4068d.C4069a aVar = new C4068d.C4069a();
        Boolean bool = this.f18585a;
        if (bool != null) {
            aVar.mo15576c(bool.booleanValue());
        }
        C2493a aVar2 = this.f18586b;
        if (aVar2 != null) {
            aVar.mo15575b(aVar2.mo12386a(context));
        }
        return aVar.mo15574a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2493a mo12392b() {
        return this.f18586b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Boolean mo12393c() {
        return this.f18585a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2494b)) {
            return false;
        }
        C2494b bVar = (C2494b) obj;
        return Objects.equals(this.f18585a, bVar.mo12393c()) && Objects.equals(this.f18586b, bVar.mo12392b());
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f18585a, this.f18586b});
    }
}
