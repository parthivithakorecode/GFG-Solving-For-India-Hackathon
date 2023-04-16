package android.support.p007v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0196a();

    /* renamed from: f */
    final int f351f;

    /* renamed from: g */
    final long f352g;

    /* renamed from: h */
    final long f353h;

    /* renamed from: i */
    final float f354i;

    /* renamed from: j */
    final long f355j;

    /* renamed from: k */
    final int f356k;

    /* renamed from: l */
    final CharSequence f357l;

    /* renamed from: m */
    final long f358m;

    /* renamed from: n */
    List<CustomAction> f359n;

    /* renamed from: o */
    final long f360o;

    /* renamed from: p */
    final Bundle f361p;

    /* renamed from: q */
    private PlaybackState f362q;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0195a();

        /* renamed from: f */
        private final String f363f;

        /* renamed from: g */
        private final CharSequence f364g;

        /* renamed from: h */
        private final int f365h;

        /* renamed from: i */
        private final Bundle f366i;

        /* renamed from: j */
        private PlaybackState.CustomAction f367j;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0195a implements Parcelable.Creator<CustomAction> {
            C0195a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f363f = parcel.readString();
            this.f364g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f365h = parcel.readInt();
            this.f366i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f363f = str;
            this.f364g = charSequence;
            this.f365h = i;
            this.f366i = bundle;
        }

        /* renamed from: b */
        public static CustomAction m610b(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.f367j = customAction;
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f364g + ", mIcon=" + this.f365h + ", mExtras=" + this.f366i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f363f);
            TextUtils.writeToParcel(this.f364g, parcel, i);
            parcel.writeInt(this.f365h);
            parcel.writeBundle(this.f366i);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0196a implements Parcelable.Creator<PlaybackStateCompat> {
        C0196a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f351f = i;
        this.f352g = j;
        this.f353h = j2;
        this.f354i = f;
        this.f355j = j3;
        this.f356k = i2;
        this.f357l = charSequence;
        this.f358m = j4;
        this.f359n = new ArrayList(list);
        this.f360o = j5;
        this.f361p = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f351f = parcel.readInt();
        this.f352g = parcel.readLong();
        this.f354i = parcel.readFloat();
        this.f358m = parcel.readLong();
        this.f353h = parcel.readLong();
        this.f355j = parcel.readLong();
        this.f357l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f359n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f360o = parcel.readLong();
        this.f361p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f356k = parcel.readInt();
    }

    /* renamed from: b */
    public static PlaybackStateCompat m609b(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction b : customActions) {
                arrayList2.add(CustomAction.m610b(b));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.f362q = playbackState;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f351f + ", position=" + this.f352g + ", buffered position=" + this.f353h + ", speed=" + this.f354i + ", updated=" + this.f358m + ", actions=" + this.f355j + ", error code=" + this.f356k + ", error message=" + this.f357l + ", custom actions=" + this.f359n + ", active item id=" + this.f360o + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f351f);
        parcel.writeLong(this.f352g);
        parcel.writeFloat(this.f354i);
        parcel.writeLong(this.f358m);
        parcel.writeLong(this.f353h);
        parcel.writeLong(this.f355j);
        TextUtils.writeToParcel(this.f357l, parcel, i);
        parcel.writeTypedList(this.f359n);
        parcel.writeLong(this.f360o);
        parcel.writeBundle(this.f361p);
        parcel.writeInt(this.f356k);
    }
}
