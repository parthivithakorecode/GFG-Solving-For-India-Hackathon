package android.support.p007v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.C0197a;
import android.support.p007v4.media.session.MediaSessionCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class C0202c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final MediaController.Callback f369a;

    /* renamed from: b */
    C0197a f370b;

    /* renamed from: android.support.v4.media.session.c$a */
    private static class C0203a extends MediaController.Callback {

        /* renamed from: a */
        private final WeakReference<C0202c> f371a;

        C0203a(C0202c cVar) {
            this.f371a = new WeakReference<>(cVar);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            C0202c cVar = (C0202c) this.f371a.get();
            if (cVar != null) {
                cVar.mo473a(new C0205d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m4659c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m594a(bundle);
            C0202c cVar = (C0202c) this.f371a.get();
            if (cVar != null) {
                cVar.mo474b(bundle);
            }
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            C0202c cVar = (C0202c) this.f371a.get();
            if (cVar != null) {
                cVar.mo476c(MediaMetadataCompat.m582b(mediaMetadata));
            }
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            C0202c cVar = (C0202c) this.f371a.get();
            if (cVar != null && cVar.f370b == null) {
                cVar.mo477d(PlaybackStateCompat.m609b(playbackState));
            }
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            C0202c cVar = (C0202c) this.f371a.get();
            if (cVar != null) {
                cVar.mo478e(MediaSessionCompat.QueueItem.m596c(list));
            }
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            C0202c cVar = (C0202c) this.f371a.get();
            if (cVar != null) {
                cVar.mo479f(charSequence);
            }
        }

        public void onSessionDestroyed() {
            C0202c cVar = (C0202c) this.f371a.get();
            if (cVar != null) {
                cVar.mo480g();
            }
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m594a(bundle);
            C0202c cVar = (C0202c) this.f371a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f370b == null || Build.VERSION.SDK_INT >= 23) {
                cVar.mo481h(str, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    private static class C0204b extends C0197a.C0198a {

        /* renamed from: f */
        private final WeakReference<C0202c> f372f;

        C0204b(C0202c cVar) {
            this.f372f = new WeakReference<>(cVar);
        }

        /* renamed from: A4 */
        public void mo462A4(boolean z) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        /* renamed from: D1 */
        public void mo463D1(int i) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: I0 */
        public void mo464I0(boolean z) {
        }

        /* renamed from: N0 */
        public void mo411N0(CharSequence charSequence) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(6, charSequence, (Bundle) null);
            }
        }

        /* renamed from: W2 */
        public void mo412W2(List<MediaSessionCompat.QueueItem> list) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(5, list, (Bundle) null);
            }
        }

        /* renamed from: g1 */
        public void mo413g1() {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(8, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: g5 */
        public void mo465g5(PlaybackStateCompat playbackStateCompat) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(2, playbackStateCompat, (Bundle) null);
            }
        }

        /* renamed from: h5 */
        public void mo466h5(String str, Bundle bundle) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(1, str, bundle);
            }
        }

        /* renamed from: l1 */
        public void mo414l1(MediaMetadataCompat mediaMetadataCompat) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        /* renamed from: u2 */
        public void mo467u2(int i) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(12, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: v2 */
        public void mo468v2() {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(13, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: w5 */
        public void mo415w5(ParcelableVolumeInfo parcelableVolumeInfo) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(4, parcelableVolumeInfo != null ? new C0205d(parcelableVolumeInfo.f346f, parcelableVolumeInfo.f347g, parcelableVolumeInfo.f348h, parcelableVolumeInfo.f349i, parcelableVolumeInfo.f350j) : null, (Bundle) null);
            }
        }

        /* renamed from: z2 */
        public void mo416z2(Bundle bundle) {
            C0202c cVar = (C0202c) this.f372f.get();
            if (cVar != null) {
                cVar.mo482i(7, bundle, (Bundle) null);
            }
        }
    }

    public C0202c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f369a = new C0203a(this);
            return;
        }
        this.f369a = null;
        this.f370b = new C0204b(this);
    }

    /* renamed from: a */
    public void mo473a(C0205d dVar) {
    }

    /* renamed from: b */
    public void mo474b(Bundle bundle) {
    }

    public void binderDied() {
        mo482i(8, (Object) null, (Bundle) null);
    }

    /* renamed from: c */
    public void mo476c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void mo477d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void mo478e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void mo479f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void mo480g() {
    }

    /* renamed from: h */
    public void mo481h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo482i(int i, Object obj, Bundle bundle) {
    }
}
