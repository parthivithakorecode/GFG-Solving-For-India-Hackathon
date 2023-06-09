package androidx.core.p009os;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.C3357i;
import p079k4.C3321j;

/* renamed from: androidx.core.os.d */
public final class C0677d {
    /* renamed from: a */
    public static final Bundle m2813a(C3321j<String, ? extends Object>... jVarArr) {
        C3357i.m24508e(jVarArr, "pairs");
        Bundle bundle = new Bundle(jVarArr.length);
        for (C3321j<String, ? extends Object> jVar : jVarArr) {
            String a = jVar.mo14321a();
            Object b = jVar.mo14322b();
            if (b == null) {
                bundle.putString(a, (String) null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(a, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(a, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(a, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(a, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(a, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(a, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(a, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(a, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(a, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(a, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(a, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(a, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(a, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(a, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(a, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(a, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(a, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(a, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(a, (short[]) b);
            } else {
                if (b instanceof Object[]) {
                    Class<?> componentType = b.getClass().getComponentType();
                    C3357i.m24505b(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(a, (Parcelable[]) b);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(a, (String[]) b);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(a, (CharSequence[]) b);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a + '\"');
                    }
                } else if (!(b instanceof Serializable)) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 18 && (b instanceof IBinder)) {
                        C0675b.m2810a(bundle, a, (IBinder) b);
                    } else if (i >= 21 && (b instanceof Size)) {
                        C0676c.m2811a(bundle, a, (Size) b);
                    } else if (i < 21 || !(b instanceof SizeF)) {
                        throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
                    } else {
                        C0676c.m2812b(bundle, a, (SizeF) b);
                    }
                }
                bundle.putSerializable(a, (Serializable) b);
            }
        }
        return bundle;
    }
}
