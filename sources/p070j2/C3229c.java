package p070j2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j2.c */
public final class C3229c {

    /* renamed from: a */
    private static final ClassLoader f20604a = C3229c.class.getClassLoader();

    private C3229c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m24128a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m24129b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m24130c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
