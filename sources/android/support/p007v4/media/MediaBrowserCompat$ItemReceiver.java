package android.support.p007v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.media.session.MediaSessionCompat;
import p017c.C1427b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends C1427b {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo371b(int i, Bundle bundle) {
        MediaSessionCompat.m594a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
