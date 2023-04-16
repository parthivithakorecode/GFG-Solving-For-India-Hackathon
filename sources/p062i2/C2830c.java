package p062i2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i2.c */
public final class C2830c {

    /* renamed from: a */
    private static final ClassLoader f19523a = C2830c.class.getClassLoader();

    private C2830c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m22317a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m22318b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22319c(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p062i2.C2830c.m22319c(android.os.Parcel, android.os.IInterface):void");
    }
}
