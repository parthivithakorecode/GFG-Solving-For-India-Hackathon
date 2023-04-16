package p139t4;

import kotlin.jvm.internal.C3349b;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3364p;
import p169y4.C4476c;

/* renamed from: t4.a */
public final class C4080a {
    /* renamed from: a */
    public static final <T> Class<T> m26441a(C4476c<T> cVar) {
        C3357i.m24508e(cVar, "<this>");
        Class<?> b = ((C3349b) cVar).mo14365b();
        C3357i.m24506c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b;
    }

    /* renamed from: b */
    public static final <T> Class<T> m26442b(C4476c<T> cVar) {
        C3357i.m24508e(cVar, "<this>");
        Class b = ((C3349b) cVar).mo14365b();
        if (!b.isPrimitive()) {
            C3357i.m24506c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b;
        }
        String name = b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b = Short.class;
                    break;
                }
                break;
        }
        C3357i.m24506c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b;
    }

    /* renamed from: c */
    public static final <T> C4476c<T> m26443c(Class<T> cls) {
        C3357i.m24508e(cls, "<this>");
        return C3364p.m24522b(cls);
    }
}
