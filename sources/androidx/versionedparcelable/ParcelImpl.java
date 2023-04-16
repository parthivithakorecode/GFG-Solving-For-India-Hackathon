package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p082l0.C3443b;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1209a();

    /* renamed from: f */
    private final C3443b f3286f;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1209a implements Parcelable.Creator<ParcelImpl> {
        C1209a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f3286f = new C1211b(parcel).mo4197u();
    }

    /* renamed from: b */
    public <T extends C3443b> T mo4160b() {
        return this.f3286f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1211b(parcel).mo4178L(this.f3286f);
    }
}
