package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.dexterous.flutterlocalnotifications.b */
public class C1453b implements Serializable {

    /* renamed from: f */
    public final NotificationDetails f3675f;

    /* renamed from: g */
    public final int f3676g;

    /* renamed from: h */
    public final ArrayList<Integer> f3677h;

    public C1453b(NotificationDetails notificationDetails, int i, ArrayList<Integer> arrayList) {
        this.f3675f = notificationDetails;
        this.f3676g = i;
        this.f3677h = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f3675f + ", startMode=" + this.f3676g + ", foregroundServiceTypes=" + this.f3677h + '}';
    }
}
