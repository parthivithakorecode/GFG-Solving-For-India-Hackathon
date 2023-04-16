package android.support.p007v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0185a();

    /* renamed from: f */
    private final int f307f;

    /* renamed from: g */
    private final MediaDescriptionCompat f308g;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0185a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        C0185a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f307f = parcel.readInt();
        this.f308g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f307f + ", mDescription=" + this.f308g + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f307f);
        this.f308g.writeToParcel(parcel, i);
    }
}
