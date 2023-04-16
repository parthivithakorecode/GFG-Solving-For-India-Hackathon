package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.t */
final class C1037t implements Parcelable {
    public static final Parcelable.Creator<C1037t> CREATOR = new C1038a();

    /* renamed from: f */
    final String f2791f;

    /* renamed from: g */
    final String f2792g;

    /* renamed from: h */
    final boolean f2793h;

    /* renamed from: i */
    final int f2794i;

    /* renamed from: j */
    final int f2795j;

    /* renamed from: k */
    final String f2796k;

    /* renamed from: l */
    final boolean f2797l;

    /* renamed from: m */
    final boolean f2798m;

    /* renamed from: n */
    final boolean f2799n;

    /* renamed from: o */
    final Bundle f2800o;

    /* renamed from: p */
    final boolean f2801p;

    /* renamed from: q */
    final int f2802q;

    /* renamed from: r */
    Bundle f2803r;

    /* renamed from: androidx.fragment.app.t$a */
    class C1038a implements Parcelable.Creator<C1037t> {
        C1038a() {
        }

        /* renamed from: a */
        public C1037t createFromParcel(Parcel parcel) {
            return new C1037t(parcel);
        }

        /* renamed from: b */
        public C1037t[] newArray(int i) {
            return new C1037t[i];
        }
    }

    C1037t(Parcel parcel) {
        this.f2791f = parcel.readString();
        this.f2792g = parcel.readString();
        boolean z = true;
        this.f2793h = parcel.readInt() != 0;
        this.f2794i = parcel.readInt();
        this.f2795j = parcel.readInt();
        this.f2796k = parcel.readString();
        this.f2797l = parcel.readInt() != 0;
        this.f2798m = parcel.readInt() != 0;
        this.f2799n = parcel.readInt() != 0;
        this.f2800o = parcel.readBundle();
        this.f2801p = parcel.readInt() == 0 ? false : z;
        this.f2803r = parcel.readBundle();
        this.f2802q = parcel.readInt();
    }

    C1037t(Fragment fragment) {
        this.f2791f = fragment.getClass().getName();
        this.f2792g = fragment.f2499k;
        this.f2793h = fragment.f2507s;
        this.f2794i = fragment.f2464B;
        this.f2795j = fragment.f2465C;
        this.f2796k = fragment.f2466D;
        this.f2797l = fragment.f2469G;
        this.f2798m = fragment.f2506r;
        this.f2799n = fragment.f2468F;
        this.f2800o = fragment.f2500l;
        this.f2801p = fragment.f2467E;
        this.f2802q = fragment.f2485W.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2791f);
        sb.append(" (");
        sb.append(this.f2792g);
        sb.append(")}:");
        if (this.f2793h) {
            sb.append(" fromLayout");
        }
        if (this.f2795j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2795j));
        }
        String str = this.f2796k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2796k);
        }
        if (this.f2797l) {
            sb.append(" retainInstance");
        }
        if (this.f2798m) {
            sb.append(" removing");
        }
        if (this.f2799n) {
            sb.append(" detached");
        }
        if (this.f2801p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2791f);
        parcel.writeString(this.f2792g);
        parcel.writeInt(this.f2793h ? 1 : 0);
        parcel.writeInt(this.f2794i);
        parcel.writeInt(this.f2795j);
        parcel.writeString(this.f2796k);
        parcel.writeInt(this.f2797l ? 1 : 0);
        parcel.writeInt(this.f2798m ? 1 : 0);
        parcel.writeInt(this.f2799n ? 1 : 0);
        parcel.writeBundle(this.f2800o);
        parcel.writeInt(this.f2801p ? 1 : 0);
        parcel.writeBundle(this.f2803r);
        parcel.writeInt(this.f2802q);
    }
}
