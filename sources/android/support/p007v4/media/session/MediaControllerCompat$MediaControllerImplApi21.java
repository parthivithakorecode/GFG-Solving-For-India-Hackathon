package android.support.p007v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.C0199b;
import android.support.p007v4.media.session.C0202c;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0557f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p082l0.C3442a;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f334a;

    /* renamed from: b */
    private final List<C0202c> f335b;

    /* renamed from: c */
    private HashMap<C0202c, C0190a> f336c;

    /* renamed from: d */
    final MediaSessionCompat.Token f337d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: f */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f338f;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f338f.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f334a) {
                    mediaControllerCompat$MediaControllerImplApi21.f337d.mo432d(C0199b.C0200a.m629D(C0557f.m2215a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f337d.mo434e(C3442a.m24778b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.mo409a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class C0190a extends C0202c.C0204b {
        C0190a(C0202c cVar) {
            super(cVar);
        }

        /* renamed from: N0 */
        public void mo411N0(CharSequence charSequence) {
            throw new AssertionError();
        }

        /* renamed from: W2 */
        public void mo412W2(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        /* renamed from: g1 */
        public void mo413g1() {
            throw new AssertionError();
        }

        /* renamed from: l1 */
        public void mo414l1(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        /* renamed from: w5 */
        public void mo415w5(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        /* renamed from: z2 */
        public void mo416z2(Bundle bundle) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo409a() {
        if (this.f337d.mo430b() != null) {
            for (C0202c next : this.f335b) {
                C0190a aVar = new C0190a(next);
                this.f336c.put(next, aVar);
                next.f370b = aVar;
                try {
                    this.f337d.mo430b().mo471c1(aVar);
                    next.mo482i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f335b.clear();
        }
    }
}
