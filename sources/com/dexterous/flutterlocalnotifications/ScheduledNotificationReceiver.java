package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.core.app.C0581n;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import p021c3.C1439a;

@Keep
public class ScheduledNotificationReceiver extends BroadcastReceiver {

    /* renamed from: com.dexterous.flutterlocalnotifications.ScheduledNotificationReceiver$a */
    class C1451a extends C1439a<NotificationDetails> {
        C1451a() {
        }
    }

    public void onReceive(Context context, Intent intent) {
        Integer num;
        String stringExtra = intent.getStringExtra(FlutterLocalNotificationsPlugin.NOTIFICATION_DETAILS);
        if (StringUtils.isNullOrEmpty(stringExtra).booleanValue()) {
            Notification notification = (Notification) intent.getParcelableExtra("notification");
            notification.when = System.currentTimeMillis();
            int intExtra = intent.getIntExtra("notification_id", 0);
            C0581n.m2390e(context).mo2505h(intExtra, notification);
            if (!intent.getBooleanExtra("repeat", false)) {
                num = Integer.valueOf(intExtra);
            } else {
                return;
            }
        } else {
            NotificationDetails notificationDetails = (NotificationDetails) FlutterLocalNotificationsPlugin.buildGson().mo15715i(stringExtra, new C1451a().mo4849e());
            FlutterLocalNotificationsPlugin.showNotification(context, notificationDetails);
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                FlutterLocalNotificationsPlugin.zonedScheduleNextNotification(context, notificationDetails);
                return;
            } else if (notificationDetails.matchDateTimeComponents != null) {
                FlutterLocalNotificationsPlugin.zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
                return;
            } else if (notificationDetails.repeatInterval != null) {
                FlutterLocalNotificationsPlugin.scheduleNextRepeatingNotification(context, notificationDetails);
                return;
            } else {
                num = notificationDetails.f3683id;
            }
        }
        FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, num);
    }
}
