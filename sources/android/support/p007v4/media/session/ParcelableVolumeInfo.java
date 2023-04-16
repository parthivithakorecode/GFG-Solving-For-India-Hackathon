package android.support.p007v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0194a();

    /* renamed from: f */
    public int f346f;

    /* renamed from: g */
    public int f347g;

    /* renamed from: h */
    public int f348h;

    /* renamed from: i */
    public int f349i;

    /* renamed from: j */
    public int f350j;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0194a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0194a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f346f = parcel.readInt();
        this.f348h = parcel.readInt();
        this.f349i = parcel.readInt();
        this.f350j = parcel.readInt();
        this.f347g = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f346f);
        parcel.writeInt(this.f348h);
        parcel.writeInt(this.f349i);
        parcel.writeInt(this.f350j);
        parcel.writeInt(this.f347g);
    }
}
