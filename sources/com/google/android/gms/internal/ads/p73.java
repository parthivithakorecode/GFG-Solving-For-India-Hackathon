package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class p73<E> extends z63<E> implements Set<E> {
    @CheckForNull

    /* renamed from: g */
    private transient e73<E> f12544g;

    p73() {
    }

    /* renamed from: o */
    static int m14864o(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        }
        q43.m15462e(max < 1073741824, "collection too large");
        return 1073741824;
    }

    /* renamed from: q */
    public static <E> o73<E> m14865q(int i) {
        return new o73<>(i);
    }

    /* renamed from: s */
    public static <E> p73<E> m14867s() {
        return z83.f18109n;
    }

    @SafeVarargs
    /* renamed from: t */
    public static <E> p73<E> m14868t(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Object[] objArr = new Object[11];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, 5);
        return m14870w(11, objArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static <E> p73<E> m14870w(int i, Object... objArr) {
        if (i == 0) {
            return z83.f18109n;
        }
        if (i != 1) {
            int o = m14864o(i);
            Object[] objArr2 = new Object[o];
            int i2 = o - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                r83.m16099a(obj, i5);
                int hashCode = obj.hashCode();
                int a = w63.m18895a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new e93(obj3);
            } else if (m14864o(i4) < o / 2) {
                return m14870w(i4, objArr);
            } else {
                if (m14871x(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new z83(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new e93(obj4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static boolean m14871x(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p73) && mo9993v() && ((p73) obj).mo9993v() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return d93.m7781a(this);
    }

    /* renamed from: k */
    public e73<E> mo6862k() {
        e73<E> e73 = this.f12544g;
        if (e73 != null) {
            return e73;
        }
        e73<E> p = mo9992p();
        this.f12544g = p;
        return p;
    }

    /* renamed from: l */
    public abstract h93<E> iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public e73<E> mo9992p() {
        return e73.m8342q(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo9993v() {
        return false;
    }
}
