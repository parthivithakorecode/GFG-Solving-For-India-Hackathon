package p004a3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p149v2.C4216l;

/* renamed from: a3.c */
final class C0119c extends C0118b {

    /* renamed from: d */
    private static Class f242d;

    /* renamed from: b */
    private final Object f243b = m367d();

    /* renamed from: c */
    private final Field f244c = m366c();

    C0119c() {
    }

    /* renamed from: c */
    private static Field m366c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m367d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f242d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo303b(AccessibleObject accessibleObject) {
        if (!mo304e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new C4216l("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo304e(AccessibleObject accessibleObject) {
        if (!(this.f243b == null || this.f244c == null)) {
            try {
                long longValue = ((Long) f242d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f243b, new Object[]{this.f244c})).longValue();
                f242d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f243b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
