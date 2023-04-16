package android.support.p007v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p017c.C1427b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends C1427b {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo371b(int i, Bundle bundle) {
        MediaSessionCompat.m594a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}
