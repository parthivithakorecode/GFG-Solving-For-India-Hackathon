package p013b2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

/* renamed from: b2.b */
public class C1299b {

    /* renamed from: b2.b$a */
    public static class C1300a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1300a(@androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b2.C1299b.C1300a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static Bundle m5191a(@RecentlyNonNull Parcel parcel, int i) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s);
        return readBundle;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static byte[] m5192b(@RecentlyNonNull Parcel parcel, int i) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + s);
        return createByteArray;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static int[] m5193c(@RecentlyNonNull Parcel parcel, int i) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s);
        return createIntArray;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static ArrayList<Integer> m5194d(@RecentlyNonNull Parcel parcel, int i) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + s);
        return arrayList;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static <T extends Parcelable> T m5195e(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s);
        return t;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static String m5196f(@RecentlyNonNull Parcel parcel, int i) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s);
        return readString;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public static String[] m5197g(@RecentlyNonNull Parcel parcel, int i) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + s);
        return createStringArray;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public static ArrayList<String> m5198h(@RecentlyNonNull Parcel parcel, int i) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s);
        return createStringArrayList;
    }

    @RecentlyNonNull
    /* renamed from: i */
    public static <T> T[] m5199i(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s);
        return createTypedArray;
    }

    @RecentlyNonNull
    /* renamed from: j */
    public static <T> ArrayList<T> m5200j(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s);
        return createTypedArrayList;
    }

    /* renamed from: k */
    public static void m5201k(@RecentlyNonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C1300a(sb.toString(), parcel);
        }
    }

    /* renamed from: l */
    public static int m5202l(int i) {
        return (char) i;
    }

    /* renamed from: m */
    public static boolean m5203m(@RecentlyNonNull Parcel parcel, int i) {
        m5212v(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: n */
    public static float m5204n(@RecentlyNonNull Parcel parcel, int i) {
        m5212v(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: o */
    public static int m5205o(@RecentlyNonNull Parcel parcel) {
        return parcel.readInt();
    }

    @RecentlyNonNull
    /* renamed from: p */
    public static IBinder m5206p(@RecentlyNonNull Parcel parcel, int i) {
        int s = m5209s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s);
        return readStrongBinder;
    }

    /* renamed from: q */
    public static int m5207q(@RecentlyNonNull Parcel parcel, int i) {
        m5212v(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: r */
    public static long m5208r(@RecentlyNonNull Parcel parcel, int i) {
        m5212v(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: s */
    public static int m5209s(@RecentlyNonNull Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: t */
    public static void m5210t(@RecentlyNonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m5209s(parcel, i));
    }

    /* renamed from: u */
    public static int m5211u(@RecentlyNonNull Parcel parcel) {
        int o = m5205o(parcel);
        int s = m5209s(parcel, o);
        int dataPosition = parcel.dataPosition();
        if (m5202l(o) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(o));
            throw new C1300a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = s + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C1300a(sb.toString(), parcel);
    }

    /* renamed from: v */
    private static void m5212v(Parcel parcel, int i, int i2) {
        int s = m5209s(parcel, i);
        if (s != i2) {
            String hexString = Integer.toHexString(s);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(s);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C1300a(sb.toString(), parcel);
        }
    }
}
