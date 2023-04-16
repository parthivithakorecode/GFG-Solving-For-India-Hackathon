package p161x2;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: x2.b */
public final class C4306b {

    /* renamed from: a */
    static final Type[] f22614a = new Type[0];

    /* renamed from: x2.b$a */
    private static final class C4307a implements GenericArrayType, Serializable {

        /* renamed from: f */
        private final Type f22615f;

        public C4307a(Type type) {
            this.f22615f = C4306b.m26885b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C4306b.m26889f(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f22615f;
        }

        public int hashCode() {
            return this.f22615f.hashCode();
        }

        public String toString() {
            return C4306b.m26904u(this.f22615f) + "[]";
        }
    }

    /* renamed from: x2.b$b */
    private static final class C4308b implements ParameterizedType, Serializable {

        /* renamed from: f */
        private final Type f22616f;

        /* renamed from: g */
        private final Type f22617g;

        /* renamed from: h */
        private final Type[] f22618h;

        public C4308b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C4305a.m26882a(z);
            }
            this.f22616f = type == null ? null : C4306b.m26885b(type);
            this.f22617g = C4306b.m26885b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f22618h = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C4305a.m26883b(this.f22618h[i]);
                C4306b.m26886c(this.f22618h[i]);
                Type[] typeArr3 = this.f22618h;
                typeArr3[i] = C4306b.m26885b(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C4306b.m26889f(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f22618h.clone();
        }

        public Type getOwnerType() {
            return this.f22616f;
        }

        public Type getRawType() {
            return this.f22617g;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f22618h) ^ this.f22617g.hashCode()) ^ C4306b.m26896m(this.f22616f);
        }

        public String toString() {
            int length = this.f22618h.length;
            if (length == 0) {
                return C4306b.m26904u(this.f22617g);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C4306b.m26904u(this.f22617g));
            sb.append("<");
            sb.append(C4306b.m26904u(this.f22618h[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C4306b.m26904u(this.f22618h[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: x2.b$c */
    private static final class C4309c implements WildcardType, Serializable {

        /* renamed from: f */
        private final Type f22619f;

        /* renamed from: g */
        private final Type f22620g;

        public C4309c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z = true;
            C4305a.m26882a(typeArr2.length <= 1);
            C4305a.m26882a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C4305a.m26883b(typeArr2[0]);
                C4306b.m26886c(typeArr2[0]);
                C4305a.m26882a(typeArr[0] != cls ? false : z);
                this.f22620g = C4306b.m26885b(typeArr2[0]);
                this.f22619f = cls;
                return;
            }
            C4305a.m26883b(typeArr[0]);
            C4306b.m26886c(typeArr[0]);
            this.f22620g = null;
            this.f22619f = C4306b.m26885b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C4306b.m26889f(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f22620g;
            if (type == null) {
                return C4306b.f22614a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f22619f};
        }

        public int hashCode() {
            Type type = this.f22620g;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f22619f.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f22620g != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f22620g;
            } else if (this.f22619f == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f22619f;
            }
            sb.append(C4306b.m26904u(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static GenericArrayType m26884a(Type type) {
        return new C4307a(type);
    }

    /* renamed from: b */
    public static Type m26885b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C4307a(m26885b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C4308b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C4307a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C4309c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: c */
    static void m26886c(Type type) {
        C4305a.m26882a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    private static Class<?> m26887d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m26888e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m26889f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m26888e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m26889f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    /* renamed from: g */
    public static Type m26890g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m26891h(Type type, Class<?> cls) {
        Type l = m26895l(type, cls, Collection.class);
        if (l instanceof WildcardType) {
            l = ((WildcardType) l).getUpperBounds()[0];
        }
        return l instanceof ParameterizedType ? ((ParameterizedType) l).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: i */
    static Type m26892i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m26892i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m26892i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m26893j(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type l = m26895l(type, cls, Map.class);
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: k */
    public static Class<?> m26894k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C4305a.m26882a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m26894k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m26894k(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: l */
    static Type m26895l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C4305a.m26882a(cls2.isAssignableFrom(cls));
        return m26899p(type, cls, m26892i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m26896m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m26897n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m26898o(Type type, Type type2, Type... typeArr) {
        return new C4308b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m26899p(Type type, Class<?> cls, Type type2) {
        return m26900q(type, cls, type2, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (m26888e(r1, r9) != false) goto L_0x00d7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m26900q(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            r0 = 0
        L_0x0001:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L_0x0027
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L_0x0017
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r11 = r2
        L_0x0016:
            return r11
        L_0x0017:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L_0x001f
            r0 = r1
        L_0x001f:
            java.lang.reflect.Type r11 = m26901r(r9, r10, r1)
            if (r11 != r1) goto L_0x0001
            goto L_0x00d7
        L_0x0027:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L_0x004c
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L_0x004c
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = m26900q(r9, r10, r11, r12)
            boolean r10 = m26888e(r11, r9)
            if (r10 == 0) goto L_0x0045
            r11 = r1
            goto L_0x00d7
        L_0x0045:
            java.lang.reflect.GenericArrayType r9 = m26884a(r9)
        L_0x0049:
            r11 = r9
            goto L_0x00d7
        L_0x004c:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L_0x0062
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = m26900q(r9, r10, r1, r12)
            boolean r10 = m26888e(r1, r9)
            if (r10 == 0) goto L_0x0045
            goto L_0x00d7
        L_0x0062:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00a6
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = m26900q(r9, r10, r1, r12)
            boolean r1 = m26888e(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x007c:
            if (r2 >= r6) goto L_0x009b
            r7 = r5[r2]
            java.lang.reflect.Type r7 = m26900q(r9, r10, r7, r12)
            r8 = r5[r2]
            boolean r8 = m26888e(r7, r8)
            if (r8 != 0) goto L_0x0098
            if (r1 != 0) goto L_0x0096
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = r3
        L_0x0096:
            r5[r2] = r7
        L_0x0098:
            int r2 = r2 + 1
            goto L_0x007c
        L_0x009b:
            if (r1 == 0) goto L_0x00d7
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = m26898o(r4, r9, r5)
            goto L_0x0049
        L_0x00a6:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L_0x00d7
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r3) goto L_0x00c6
            r3 = r1[r2]
            java.lang.reflect.Type r9 = m26900q(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto L_0x00d7
            java.lang.reflect.WildcardType r11 = m26903t(r9)
            goto L_0x00d7
        L_0x00c6:
            int r1 = r4.length
            if (r1 != r3) goto L_0x00d7
            r1 = r4[r2]
            java.lang.reflect.Type r9 = m26900q(r9, r10, r1, r12)     // Catch:{ all -> 0x00dd }
            r10 = r4[r2]
            if (r9 == r10) goto L_0x00d7
            java.lang.reflect.WildcardType r11 = m26902s(r9)
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r12.put(r0, r11)
        L_0x00dc:
            return r11
        L_0x00dd:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p161x2.C4306b.m26900q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: r */
    static Type m26901r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d = m26887d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        Type i = m26892i(type, cls, d);
        if (!(i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) i).getActualTypeArguments()[m26897n(d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static WildcardType m26902s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C4309c(typeArr, f22614a);
    }

    /* renamed from: t */
    public static WildcardType m26903t(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C4309c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: u */
    public static String m26904u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
