package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p079k4.C3314c;
import p079k4.C3321j;
import p079k4.C3327n;
import p139t4.C4080a;
import p145u4.C4139a;
import p145u4.C4140b;
import p145u4.C4141c;
import p145u4.C4142d;
import p145u4.C4143e;
import p145u4.C4144f;
import p145u4.C4145g;
import p145u4.C4146h;
import p145u4.C4147i;
import p145u4.C4148j;
import p145u4.C4149k;
import p145u4.C4150l;
import p145u4.C4151m;
import p145u4.C4152n;
import p145u4.C4153o;
import p145u4.C4154p;
import p145u4.C4155q;
import p145u4.C4156r;
import p145u4.C4157s;
import p145u4.C4158t;
import p145u4.C4159u;
import p145u4.C4160v;
import p145u4.C4161w;
import p169y4.C4476c;

/* renamed from: kotlin.jvm.internal.c */
public final class C3350c implements C4476c<Object>, C3349b {

    /* renamed from: g */
    public static final C3351a f20838g = new C3351a((C3353e) null);

    /* renamed from: h */
    private static final Map<Class<? extends C3314c<?>>, Integer> f20839h;

    /* renamed from: i */
    private static final HashMap<String, String> f20840i;

    /* renamed from: j */
    private static final HashMap<String, String> f20841j;

    /* renamed from: k */
    private static final HashMap<String, String> f20842k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Map<String, String> f20843l;

    /* renamed from: f */
    private final Class<?> f20844f;

    /* renamed from: kotlin.jvm.internal.c$a */
    public static final class C3351a {
        private C3351a() {
        }

        public /* synthetic */ C3351a(C3353e eVar) {
            this();
        }

        /* renamed from: a */
        public final String mo14370a(Class<?> cls) {
            String str;
            C3357i.m24508e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        C3357i.m24507d(simpleName, "name");
                        String Z = C0179o.m539Z(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (Z != null) {
                            return Z;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    C3357i.m24507d(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return C0179o.m538Y(simpleName, '$', (String) null, 2, (Object) null);
                    }
                    return C0179o.m539Z(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) C3350c.f20843l.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) C3350c.f20843l.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i = 0;
        List d = C3585i.m25031d(C4139a.class, C4150l.class, C4154p.class, C4155q.class, C4156r.class, C4157s.class, C4158t.class, C4159u.class, C4160v.class, C4161w.class, C4140b.class, C4141c.class, C4142d.class, C4143e.class, C4144f.class, C4145g.class, C4146h.class, C4147i.class, C4148j.class, C4149k.class, C4151m.class, C4152n.class, C4153o.class);
        ArrayList arrayList = new ArrayList(C3586j.m25035h(d, 10));
        for (Object next : d) {
            int i2 = i + 1;
            if (i < 0) {
                C3585i.m25034g();
            }
            arrayList.add(C3327n.m24453a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f20839h = C3602z.m25083g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f20840i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f20841j = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C3357i.m24507d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C3357i.m24507d(str, "kotlinName");
            sb.append(C0179o.m541b0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C3321j a = C3327n.m24453a(sb2, str + ".Companion");
            hashMap3.put(a.mo14323c(), a.mo14324d());
        }
        for (Map.Entry next2 : f20839h.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f20842k = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C3601y.m25077a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C0179o.m541b0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f20843l = linkedHashMap;
    }

    public C3350c(Class<?> cls) {
        C3357i.m24508e(cls, "jClass");
        this.f20844f = cls;
    }

    /* renamed from: a */
    public String mo14366a() {
        return f20838g.mo14370a(mo14365b());
    }

    /* renamed from: b */
    public Class<?> mo14365b() {
        return this.f20844f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3350c) && C3357i.m24504a(C4080a.m26442b(this), C4080a.m26442b((C4476c) obj));
    }

    public int hashCode() {
        return C4080a.m26442b(this).hashCode();
    }

    public String toString() {
        return mo14365b().toString() + " (Kotlin reflection is not available)";
    }
}
