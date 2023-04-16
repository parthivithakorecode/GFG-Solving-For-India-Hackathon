package p166y1;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
import p172z1.C4494d;
import p172z1.C4506j;

@Deprecated
/* renamed from: y1.f */
public abstract class C4382f {
    @GuardedBy("sAllClients")

    /* renamed from: a */
    private static final Set<C4382f> f22747a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: y1.f$a */
    public interface C4383a extends C4494d {
    }

    @Deprecated
    /* renamed from: y1.f$b */
    public interface C4384b extends C4506j {
    }
}
