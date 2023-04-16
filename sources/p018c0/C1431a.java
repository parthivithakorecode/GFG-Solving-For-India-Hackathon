package p018c0;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.C0564j;
import androidx.core.app.C0565k;
import androidx.media.C1146a;
import androidx.media.C1147b;
import androidx.media.C1148c;

/* renamed from: c0.a */
public class C1431a extends C0565k.C0578i {

    /* renamed from: e */
    int[] f3643e = null;

    /* renamed from: f */
    MediaSessionCompat.Token f3644f;

    /* renamed from: g */
    boolean f3645g;

    /* renamed from: h */
    PendingIntent f3646h;

    /* renamed from: A */
    private RemoteViews m5599A(C0565k.C0566a aVar) {
        boolean z = aVar.mo2406a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f1820a.f1782a.getPackageName(), C1148c.notification_media_action);
        int i = C1146a.action0;
        remoteViews.setImageViewResource(i, aVar.mo2410e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(i, aVar.mo2406a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i, aVar.mo2415j());
        }
        return remoteViews;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo4835B(int i) {
        return i <= 3 ? C1148c.notification_template_big_media_narrow : C1148c.notification_template_big_media;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo4836C() {
        return C1148c.notification_template_media;
    }

    /* renamed from: b */
    public void mo2420b(C0564j jVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            jVar.mo2405a().setStyle(mo4837x(new Notification.MediaStyle()));
        } else if (this.f3645g) {
            jVar.mo2405a().setOngoing(true);
        }
    }

    /* renamed from: s */
    public RemoteViews mo2471s(C0564j jVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return mo4838y();
    }

    /* renamed from: t */
    public RemoteViews mo2472t(C0564j jVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return mo4839z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public Notification.MediaStyle mo4837x(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f3643e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f3644f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.mo431c());
        }
        return mediaStyle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public RemoteViews mo4838y() {
        int min = Math.min(this.f1820a.f1783b.size(), 5);
        RemoteViews c = mo2492c(false, mo4835B(min), false);
        c.removeAllViews(C1146a.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c.addView(C1146a.media_actions, m5599A(this.f1820a.f1783b.get(i)));
            }
        }
        if (this.f3645g) {
            int i2 = C1146a.cancel_action;
            c.setViewVisibility(i2, 0);
            c.setInt(i2, "setAlpha", this.f1820a.f1782a.getResources().getInteger(C1147b.cancel_button_image_alpha));
            c.setOnClickPendingIntent(i2, this.f3646h);
        } else {
            c.setViewVisibility(C1146a.cancel_action, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public RemoteViews mo4839z() {
        RemoteViews c = mo2492c(false, mo4836C(), true);
        int size = this.f1820a.f1783b.size();
        int[] iArr = this.f3643e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c.removeAllViews(C1146a.media_actions);
        if (min > 0) {
            int i = 0;
            while (i < min) {
                if (i < size) {
                    c.addView(C1146a.media_actions, m5599A(this.f1820a.f1783b.get(this.f3643e[i])));
                    i++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.f3645g) {
            c.setViewVisibility(C1146a.end_padder, 8);
            int i2 = C1146a.cancel_action;
            c.setViewVisibility(i2, 0);
            c.setOnClickPendingIntent(i2, this.f3646h);
            c.setInt(i2, "setAlpha", this.f1820a.f1782a.getResources().getInteger(C1147b.cancel_button_image_alpha));
        } else {
            c.setViewVisibility(C1146a.end_padder, 0);
            c.setViewVisibility(C1146a.cancel_action, 8);
        }
        return c;
    }
}
