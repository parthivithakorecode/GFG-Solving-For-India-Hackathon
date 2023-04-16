package android.support.p007v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0186a();

    /* renamed from: f */
    private final String f309f;

    /* renamed from: g */
    private final CharSequence f310g;

    /* renamed from: h */
    private final CharSequence f311h;

    /* renamed from: i */
    private final CharSequence f312i;

    /* renamed from: j */
    private final Bitmap f313j;

    /* renamed from: k */
    private final Uri f314k;

    /* renamed from: l */
    private final Bundle f315l;

    /* renamed from: m */
    private final Uri f316m;

    /* renamed from: n */
    private MediaDescription f317n;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0186a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0186a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m569b(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0187b {

        /* renamed from: a */
        private String f318a;

        /* renamed from: b */
        private CharSequence f319b;

        /* renamed from: c */
        private CharSequence f320c;

        /* renamed from: d */
        private CharSequence f321d;

        /* renamed from: e */
        private Bitmap f322e;

        /* renamed from: f */
        private Uri f323f;

        /* renamed from: g */
        private Bundle f324g;

        /* renamed from: h */
        private Uri f325h;

        /* renamed from: a */
        public MediaDescriptionCompat mo387a() {
            return new MediaDescriptionCompat(this.f318a, this.f319b, this.f320c, this.f321d, this.f322e, this.f323f, this.f324g, this.f325h);
        }

        /* renamed from: b */
        public C0187b mo388b(CharSequence charSequence) {
            this.f321d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0187b mo389c(Bundle bundle) {
            this.f324g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0187b mo390d(Bitmap bitmap) {
            this.f322e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0187b mo391e(Uri uri) {
            this.f323f = uri;
            return this;
        }

        /* renamed from: f */
        public C0187b mo392f(String str) {
            this.f318a = str;
            return this;
        }

        /* renamed from: g */
        public C0187b mo393g(Uri uri) {
            this.f325h = uri;
            return this;
        }

        /* renamed from: h */
        public C0187b mo394h(CharSequence charSequence) {
            this.f320c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0187b mo395i(CharSequence charSequence) {
            this.f319b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f309f = parcel.readString();
        this.f310g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f311h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f312i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f313j = (Bitmap) parcel.readParcelable(classLoader);
        this.f314k = (Uri) parcel.readParcelable(classLoader);
        this.f315l = parcel.readBundle(classLoader);
        this.f316m = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f309f = str;
        this.f310g = charSequence;
        this.f311h = charSequence2;
        this.f312i = charSequence3;
        this.f313j = bitmap;
        this.f314k = uri;
        this.f315l = bundle;
        this.f316m = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p007v4.media.MediaDescriptionCompat m569b(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.mo392f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.mo395i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.mo394h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.mo388b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.mo390d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.mo391e(r3)
            android.os.Bundle r3 = r9.getExtras()
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004c
            android.support.p007v4.media.session.MediaSessionCompat.m594a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x004d
        L_0x004c:
            r5 = r0
        L_0x004d:
            if (r5 == 0) goto L_0x0065
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x005f
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x005f
            goto L_0x0066
        L_0x005f:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0065:
            r0 = r3
        L_0x0066:
            r2.mo389c(r0)
            if (r5 == 0) goto L_0x006f
            r2.mo393g(r5)
            goto L_0x007a
        L_0x006f:
            r0 = 23
            if (r1 < r0) goto L_0x007a
            android.net.Uri r0 = r9.getMediaUri()
            r2.mo393g(r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.mo387a()
            r0.f317n = r9
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.MediaDescriptionCompat.m569b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: c */
    public Object mo379c() {
        int i;
        MediaDescription mediaDescription = this.f317n;
        if (mediaDescription != null || (i = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f309f);
        builder.setTitle(this.f310g);
        builder.setSubtitle(this.f311h);
        builder.setDescription(this.f312i);
        builder.setIconBitmap(this.f313j);
        builder.setIconUri(this.f314k);
        Bundle bundle = this.f315l;
        if (i < 23 && this.f316m != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f316m);
        }
        builder.setExtras(bundle);
        if (i >= 23) {
            builder.setMediaUri(this.f316m);
        }
        MediaDescription build = builder.build();
        this.f317n = build;
        return build;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f310g + ", " + this.f311h + ", " + this.f312i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f309f);
            TextUtils.writeToParcel(this.f310g, parcel, i);
            TextUtils.writeToParcel(this.f311h, parcel, i);
            TextUtils.writeToParcel(this.f312i, parcel, i);
            parcel.writeParcelable(this.f313j, i);
            parcel.writeParcelable(this.f314k, i);
            parcel.writeBundle(this.f315l);
            parcel.writeParcelable(this.f316m, i);
            return;
        }
        ((MediaDescription) mo379c()).writeToParcel(parcel, i);
    }
}
