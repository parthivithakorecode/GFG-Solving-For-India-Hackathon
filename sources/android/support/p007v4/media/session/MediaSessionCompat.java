package android.support.p007v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p007v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;
import p082l0.C3443b;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0191a();

        /* renamed from: f */
        private final MediaDescriptionCompat f339f;

        /* renamed from: g */
        private final long f340g;

        /* renamed from: h */
        private MediaSession.QueueItem f341h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0191a implements Parcelable.Creator<QueueItem> {
            C0191a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f339f = mediaDescriptionCompat;
                this.f340g = j;
                this.f341h = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.f339f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f340g = parcel.readLong();
        }

        /* renamed from: b */
        public static QueueItem m595b(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m569b(queueItem.getDescription()), queueItem.getQueueId());
        }

        /* renamed from: c */
        public static List<QueueItem> m596c(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object b : list) {
                arrayList.add(m595b(b));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f339f + ", Id=" + this.f340g + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f339f.writeToParcel(parcel, i);
            parcel.writeLong(this.f340g);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0192a();

        /* renamed from: f */
        ResultReceiver f342f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0192a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0192a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f342f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f342f.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0193a();

        /* renamed from: f */
        private final Object f343f;

        /* renamed from: g */
        private C0199b f344g;

        /* renamed from: h */
        private C3443b f345h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0193a implements Parcelable.Creator<Token> {
            C0193a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0199b) null, (C3443b) null);
        }

        Token(Object obj, C0199b bVar, C3443b bVar2) {
            this.f343f = obj;
            this.f344g = bVar;
            this.f345h = bVar2;
        }

        /* renamed from: b */
        public C0199b mo430b() {
            return this.f344g;
        }

        /* renamed from: c */
        public Object mo431c() {
            return this.f343f;
        }

        /* renamed from: d */
        public void mo432d(C0199b bVar) {
            this.f344g = bVar;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public void mo434e(C3443b bVar) {
            this.f345h = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f343f;
            Object obj3 = ((Token) obj).f343f;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f343f;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f343f, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f343f);
            }
        }
    }

    /* renamed from: a */
    public static void m594a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
