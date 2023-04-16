package p089m0;

import android.app.Notification;

/* renamed from: m0.e */
public final class C3640e {

    /* renamed from: a */
    private final int f21386a;

    /* renamed from: b */
    private final int f21387b;

    /* renamed from: c */
    private final Notification f21388c;

    public C3640e(int i, Notification notification, int i2) {
        this.f21386a = i;
        this.f21388c = notification;
        this.f21387b = i2;
    }

    /* renamed from: a */
    public int mo14796a() {
        return this.f21387b;
    }

    /* renamed from: b */
    public Notification mo14797b() {
        return this.f21388c;
    }

    /* renamed from: c */
    public int mo14798c() {
        return this.f21386a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3640e.class != obj.getClass()) {
            return false;
        }
        C3640e eVar = (C3640e) obj;
        if (this.f21386a == eVar.f21386a && this.f21387b == eVar.f21387b) {
            return this.f21388c.equals(eVar.f21388c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21386a * 31) + this.f21387b) * 31) + this.f21388c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f21386a + ", mForegroundServiceType=" + this.f21387b + ", mNotification=" + this.f21388c + '}';
    }
}
