package p029d4;

import android.content.Context;
import java.util.List;
import java.util.Objects;
import p137t2.C4061a;

/* renamed from: d4.a */
class C2493a {

    /* renamed from: a */
    private final Integer f18583a;

    /* renamed from: b */
    private final List<String> f18584b;

    C2493a(Integer num, List<String> list) {
        this.f18583a = num;
        this.f18584b = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4061a mo12386a(Context context) {
        C4061a.C4062a aVar = new C4061a.C4062a(context);
        Integer num = this.f18583a;
        if (num != null) {
            aVar.mo15570c(num.intValue());
        }
        List<String> list = this.f18584b;
        if (list != null) {
            for (String a : list) {
                aVar.mo15568a(a);
            }
        }
        return aVar.mo15569b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Integer mo12387b() {
        return this.f18583a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<String> mo12388c() {
        return this.f18584b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2493a)) {
            return false;
        }
        C2493a aVar = (C2493a) obj;
        return Objects.equals(this.f18583a, aVar.mo12387b()) && Objects.equals(this.f18584b, aVar.mo12388c());
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f18583a, this.f18584b});
    }
}
