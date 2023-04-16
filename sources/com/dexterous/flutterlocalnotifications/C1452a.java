package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;

/* renamed from: com.dexterous.flutterlocalnotifications.a */
public class C1452a extends Service {
    /* renamed from: a */
    private static int m5649a(ArrayList<Integer> arrayList) {
        int intValue = arrayList.get(0).intValue();
        for (int i = 1; i < arrayList.size(); i++) {
            intValue |= arrayList.get(i).intValue();
        }
        return intValue;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C1453b bVar = (C1453b) intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter");
        Notification createNotification = FlutterLocalNotificationsPlugin.createNotification(this, bVar.f3675f);
        if (bVar.f3677h == null || Build.VERSION.SDK_INT < 29) {
            startForeground(bVar.f3675f.f3683id.intValue(), createNotification);
        } else {
            startForeground(bVar.f3675f.f3683id.intValue(), createNotification, m5649a(bVar.f3677h));
        }
        return bVar.f3676g;
    }
}
