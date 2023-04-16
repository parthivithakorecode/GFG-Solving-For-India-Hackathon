package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p139t4.C4081b;
import p169y4.C4475b;
import p169y4.C4477d;
import p169y4.C4481h;
import p169y4.C4482i;

/* renamed from: kotlin.jvm.internal.a */
public abstract class C3347a implements C4475b, Serializable {
    public static final Object NO_RECEIVER = C3348a.f20837f;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C4475b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.a$a */
    private static class C3348a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C3348a f20837f = new C3348a();

        private C3348a() {
        }
    }

    public C3347a() {
        this(NO_RECEIVER);
    }

    protected C3347a(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C3347a(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C4475b compute() {
        C4475b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C4475b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C4475b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C4477d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C3364p.m24523c(cls) : C3364p.m24522b(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C4475b getReflected() {
        C4475b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C4081b();
    }

    public C4481h getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C4482i getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
