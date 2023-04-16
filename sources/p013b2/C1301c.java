package p013b2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* renamed from: b2.c */
public class C1301c {
    /* renamed from: a */
    public static int m5213a(@RecentlyNonNull Parcel parcel) {
        return m5231s(parcel, 20293);
    }

    /* renamed from: b */
    public static void m5214b(@RecentlyNonNull Parcel parcel, int i) {
        m5232t(parcel, i);
    }

    /* renamed from: c */
    public static void m5215c(@RecentlyNonNull Parcel parcel, int i, boolean z) {
        m5230r(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m5216d(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int s = m5231s(parcel, i);
            parcel.writeBundle(bundle);
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m5217e(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int s = m5231s(parcel, i);
            parcel.writeByteArray(bArr);
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m5218f(@RecentlyNonNull Parcel parcel, int i, float f) {
        m5230r(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: g */
    public static void m5219g(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int s = m5231s(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m5220h(@RecentlyNonNull Parcel parcel, int i, int i2) {
        m5230r(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: i */
    public static void m5221i(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull int[] iArr, boolean z) {
        if (iArr != null) {
            int s = m5231s(parcel, i);
            parcel.writeIntArray(iArr);
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m5222j(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Integer> list, boolean z) {
        if (list != null) {
            int s = m5231s(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m5223k(@RecentlyNonNull Parcel parcel, int i, long j) {
        m5230r(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: l */
    public static void m5224l(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int s = m5231s(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static void m5225m(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String str, boolean z) {
        if (str != null) {
            int s = m5231s(parcel, i);
            parcel.writeString(str);
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m5226n(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int s = m5231s(parcel, i);
            parcel.writeStringArray(strArr);
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m5227o(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<String> list, boolean z) {
        if (list != null) {
            int s = m5231s(parcel, i);
            parcel.writeStringList(list);
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static <T extends Parcelable> void m5228p(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int s = m5231s(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m5233u(parcel, t, i2);
                }
            }
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static <T extends Parcelable> void m5229q(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<T> list, boolean z) {
        if (list != null) {
            int s = m5231s(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m5233u(parcel, parcelable, 0);
                }
            }
            m5232t(parcel, s);
        } else if (z) {
            m5230r(parcel, i, 0);
        }
    }

    /* renamed from: r */
    private static void m5230r(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: s */
    private static int m5231s(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: t */
    private static void m5232t(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: u */
    private static <T extends Parcelable> void m5233u(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
