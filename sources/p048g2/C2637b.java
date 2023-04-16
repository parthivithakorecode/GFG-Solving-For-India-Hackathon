package p048g2;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Field;
import p003a2.C0092o;
import p048g2.C2635a;

/* renamed from: g2.b */
public final class C2637b<T> extends C2635a.C2636a {

    /* renamed from: f */
    private final T f19009f;

    private C2637b(T t) {
        this.f19009f = t;
    }

    @RecentlyNonNull
    /* renamed from: C0 */
    public static <T> T m21357C0(@RecentlyNonNull C2635a aVar) {
        if (aVar instanceof C2637b) {
            return ((C2637b) aVar).f19009f;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C0092o.m313i(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @RecentlyNonNull
    /* renamed from: Z2 */
    public static <T> C2635a m21358Z2(@RecentlyNonNull T t) {
        return new C2637b(t);
    }
}
