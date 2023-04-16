package p091m2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m2.h0 */
public final class C3688h0 {

    /* renamed from: a */
    private static final ClassLoader f21468a = C3688h0.class.getClassLoader();

    private C3688h0() {
    }

    /* renamed from: a */
    public static void m25319a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m25320b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m25321c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m25322d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
