package p077k2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k2.c */
public final class C3300c {

    /* renamed from: a */
    private static final ClassLoader f20778a = C3300c.class.getClassLoader();

    private C3300c() {
    }

    /* renamed from: a */
    public static void m24384a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m24385b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m24386c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
