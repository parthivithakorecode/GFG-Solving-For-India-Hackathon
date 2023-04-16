package android.support.p007v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0189a();

    /* renamed from: f */
    private final int f332f;

    /* renamed from: g */
    private final float f333g;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0189a implements Parcelable.Creator<RatingCompat> {
        C0189a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f332f = i;
        this.f333g = f;
    }

    public int describeContents() {
        return this.f332f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f332f);
        sb.append(" rating=");
        float f = this.f333g;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f332f);
        parcel.writeFloat(this.f333g);
    }
}
