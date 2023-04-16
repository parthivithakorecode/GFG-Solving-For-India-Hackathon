package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.k */
class C0288k {

    /* renamed from: a */
    private static Field f684a;

    /* renamed from: b */
    private static boolean f685b;

    /* renamed from: c */
    private static Class<?> f686c;

    /* renamed from: d */
    private static boolean f687d;

    /* renamed from: e */
    private static Field f688e;

    /* renamed from: f */
    private static boolean f689f;

    /* renamed from: g */
    private static Field f690g;

    /* renamed from: h */
    private static boolean f691h;

    /* renamed from: androidx.appcompat.app.k$a */
    static class C0289a {
        /* renamed from: a */
        static void m995a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    static void m990a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m993d(resources);
            } else if (i >= 23) {
                m992c(resources);
            } else if (i >= 21) {
                m991b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m991b(Resources resources) {
        if (!f685b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f684a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f685b = true;
        }
        Field field = f684a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m992c(Resources resources) {
        if (!f685b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f684a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f685b = true;
        }
        Object obj = null;
        Field field = f684a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m994e(obj);
        }
    }

    /* renamed from: d */
    private static void m993d(Resources resources) {
        Object obj;
        if (!f691h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f690g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f691h = true;
        }
        Field field = f690g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f685b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f684a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f685b = true;
                }
                Field field2 = f684a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m994e(obj2);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m994e(Object obj) {
        if (!f687d) {
            try {
                f686c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f687d = true;
        }
        Class<?> cls = f686c;
        if (cls != null) {
            if (!f689f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f688e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f689f = true;
            }
            Field field = f688e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    C0289a.m995a(longSparseArray);
                }
            }
        }
    }
}
