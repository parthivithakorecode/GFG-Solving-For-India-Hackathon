package p016b5;

import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p100n4.C3769a;
import p100n4.C3778g;

@IgnoreJRERequirement
/* renamed from: b5.i0 */
public final class C1357i0 extends C3769a implements C1349g2<String> {

    /* renamed from: g */
    public static final C1358a f3557g = new C1358a((C3353e) null);

    /* renamed from: f */
    private final long f3558f;

    /* renamed from: b5.i0$a */
    public static final class C1358a implements C3778g.C3783c<C1357i0> {
        private C1358a() {
        }

        public /* synthetic */ C1358a(C3353e eVar) {
            this();
        }
    }

    public C1357i0(long j) {
        super(f3557g);
        this.f3558f = j;
    }

    /* renamed from: O */
    public final long mo4712O() {
        return this.f3558f;
    }

    /* renamed from: P */
    public void mo4707n(C3778g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: Q */
    public String mo4706N(C3778g gVar) {
        String O;
        C1362j0 j0Var = (C1362j0) gVar.get(C1362j0.f3561g);
        String str = "coroutine";
        if (!(j0Var == null || (O = j0Var.mo4723O()) == null)) {
            str = O;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int D = C0179o.m517D(name, " @", 0, false, 6, (Object) null);
        if (D < 0) {
            D = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + D + 10);
        String substring = name.substring(0, D);
        C3357i.m24507d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(mo4712O());
        String sb2 = sb.toString();
        C3357i.m24507d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1357i0) && this.f3558f == ((C1357i0) obj).f3558f;
    }

    public int hashCode() {
        return C1351h0.m5345a(this.f3558f);
    }

    public String toString() {
        return "CoroutineId(" + this.f3558f + ')';
    }
}
