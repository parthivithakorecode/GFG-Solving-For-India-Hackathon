package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1210a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1210a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1703a = (IconCompat) aVar.mo4198v(remoteActionCompat.f1703a, 1);
        remoteActionCompat.f1704b = aVar.mo4188l(remoteActionCompat.f1704b, 2);
        remoteActionCompat.f1705c = aVar.mo4188l(remoteActionCompat.f1705c, 3);
        remoteActionCompat.f1706d = (PendingIntent) aVar.mo4194r(remoteActionCompat.f1706d, 4);
        remoteActionCompat.f1707e = aVar.mo4184h(remoteActionCompat.f1707e, 5);
        remoteActionCompat.f1708f = aVar.mo4184h(remoteActionCompat.f1708f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1210a aVar) {
        aVar.mo4200x(false, false);
        aVar.mo4179M(remoteActionCompat.f1703a, 1);
        aVar.mo4170D(remoteActionCompat.f1704b, 2);
        aVar.mo4170D(remoteActionCompat.f1705c, 3);
        aVar.mo4174H(remoteActionCompat.f1706d, 4);
        aVar.mo4202z(remoteActionCompat.f1707e, 5);
        aVar.mo4202z(remoteActionCompat.f1708f, 6);
    }
}
