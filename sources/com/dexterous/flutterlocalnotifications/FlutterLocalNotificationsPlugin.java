package com.dexterous.flutterlocalnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.Keep;
import androidx.core.app.C0539b;
import androidx.core.app.C0551d;
import androidx.core.app.C0565k;
import androidx.core.app.C0581n;
import androidx.core.app.C0588o;
import androidx.core.content.C0597a;
import androidx.core.graphics.drawable.IconCompat;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005a4.C0128c;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0153n;
import p005a4.C0154o;
import p005a4.C0155p;
import p018c0.C1431a;
import p021c3.C1439a;
import p042f3.C2607a;
import p058h5.C2752g;
import p058h5.C2778q;
import p058h5.C2783t;
import p073j5.C3250b;
import p099n3.C3764a;
import p132s3.C4047a;
import p138t3.C4076a;
import p138t3.C4078c;
import p149v2.C4203e;
import p149v2.C4210f;

@Keep
public class FlutterLocalNotificationsPlugin implements C0145k.C0149c, C0153n, C0155p, C4047a, C4076a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    private static final String CANCEL_TAG = "tag";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DRAWABLE = "drawable";
    private static final String GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE = "GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE";
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_CODE = "GET_ACTIVE_NOTIFICATIONS_ERROR_CODE";
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "GET_NOTIFICATION_CHANNELS_ERROR_CODE";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "INVALID_BIG_PICTURE";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "INVALID_ICON";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "INVALID_LARGE_ICON";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "INVALID_LED_DETAILS";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "INVALID_SOUND";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    private static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String REQUEST_PERMISSION_METHOD = "requestPermission";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SCHEDULE_METHOD = "schedule";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_DAILY_AT_TIME_METHOD = "showDailyAtTime";
    private static final String SHOW_METHOD = "show";
    private static final String SHOW_WEEKLY_AT_DAY_AND_TIME_METHOD = "showWeeklyAtDayAndTime";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static C4203e gson;
    private Context applicationContext;
    private C1454c callback;
    private C0145k channel;
    private Intent launchIntent;
    private Activity mainActivity;
    private boolean permissionRequestInProgress = false;

    /* renamed from: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin$a */
    class C1447a extends C1439a<ArrayList<NotificationDetails>> {
        C1447a() {
        }
    }

    /* renamed from: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin$b */
    class C1448b implements C1454c {

        /* renamed from: a */
        final /* synthetic */ C0145k.C0150d f3666a;

        C1448b(C0145k.C0150d dVar) {
            this.f3666a = dVar;
        }

        /* renamed from: a */
        public void mo4867a(String str) {
            this.f3666a.mo339b("PERMISSION_REQUEST_IN_PROGRESS", str, (Object) null);
        }

        /* renamed from: b */
        public void mo4868b(boolean z) {
            this.f3666a.mo338a(Boolean.valueOf(z));
        }
    }

    /* renamed from: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin$c */
    static /* synthetic */ class C1449c {

        /* renamed from: a */
        static final /* synthetic */ int[] f3668a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3669b;

        /* renamed from: c */
        static final /* synthetic */ int[] f3670c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009c */
        static {
            /*
                com.dexterous.flutterlocalnotifications.NotificationStyle[] r0 = com.dexterous.flutterlocalnotifications.NotificationStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3670c = r0
                r1 = 1
                com.dexterous.flutterlocalnotifications.NotificationStyle r2 = com.dexterous.flutterlocalnotifications.NotificationStyle.BigPicture     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3670c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.dexterous.flutterlocalnotifications.NotificationStyle r3 = com.dexterous.flutterlocalnotifications.NotificationStyle.BigText     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3670c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.dexterous.flutterlocalnotifications.NotificationStyle r4 = com.dexterous.flutterlocalnotifications.NotificationStyle.Inbox     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3670c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.dexterous.flutterlocalnotifications.NotificationStyle r5 = com.dexterous.flutterlocalnotifications.NotificationStyle.Messaging     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f3670c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.dexterous.flutterlocalnotifications.NotificationStyle r6 = com.dexterous.flutterlocalnotifications.NotificationStyle.Media     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.dexterous.flutterlocalnotifications.models.IconSource[] r5 = com.dexterous.flutterlocalnotifications.models.IconSource.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f3669b = r5
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.DrawableResource     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r5 = f3669b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.BitmapFilePath     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r5 = f3669b     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.ContentUri     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r5 = f3669b     // Catch:{ NoSuchFieldError -> 0x006d }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.FlutterBitmapAsset     // Catch:{ NoSuchFieldError -> 0x006d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r5 = f3669b     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.ByteArray     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                com.dexterous.flutterlocalnotifications.RepeatInterval[] r4 = com.dexterous.flutterlocalnotifications.RepeatInterval.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f3668a = r4
                com.dexterous.flutterlocalnotifications.RepeatInterval r5 = com.dexterous.flutterlocalnotifications.RepeatInterval.EveryMinute     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r1 = f3668a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.dexterous.flutterlocalnotifications.RepeatInterval r4 = com.dexterous.flutterlocalnotifications.RepeatInterval.Hourly     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f3668a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.dexterous.flutterlocalnotifications.RepeatInterval r1 = com.dexterous.flutterlocalnotifications.RepeatInterval.Daily     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f3668a     // Catch:{ NoSuchFieldError -> 0x00a6 }
                com.dexterous.flutterlocalnotifications.RepeatInterval r1 = com.dexterous.flutterlocalnotifications.RepeatInterval.Weekly     // Catch:{ NoSuchFieldError -> 0x00a6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a6 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a6 }
            L_0x00a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.C1449c.<clinit>():void");
        }
    }

    private static void applyGrouping(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        boolean z;
        if (!StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            eVar.mo2467w(notificationDetails.groupKey);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
                eVar.mo2469y(true);
            }
            eVar.mo2468x(notificationDetails.groupAlertBehavior.intValue());
        }
    }

    private void areNotificationsEnabled(C0145k.C0150d dVar) {
        dVar.mo338a(Boolean.valueOf(getNotificationManager(this.applicationContext).mo2500a()));
    }

    static C4203e buildGson() {
        if (gson == null) {
            gson = new C4210f().mo15741c(RuntimeTypeAdapterFactory.m5645of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class)).mo15740b();
        }
        return gson;
    }

    private static C0588o buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        C0588o.C0590b bVar = new C0588o.C0590b();
        bVar.mo2524b(BooleanUtils.getValue(personDetails.bot));
        Object obj = personDetails.icon;
        if (!(obj == null || (iconSource = personDetails.iconBitmapSource) == null)) {
            bVar.mo2525c(getIconFromSource(context, obj, iconSource));
        }
        bVar.mo2526d(BooleanUtils.getValue(personDetails.important));
        String str = personDetails.key;
        if (str != null) {
            bVar.mo2527e(str);
        }
        String str2 = personDetails.name;
        if (str2 != null) {
            bVar.mo2528f(str2);
        }
        String str3 = personDetails.uri;
        if (str3 != null) {
            bVar.mo2529g(str3);
        }
        return bVar.mo2523a();
    }

    private static long calculateNextNotificationTrigger(long j, long j2) {
        while (j < System.currentTimeMillis()) {
            j += j2;
        }
        return j;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        int i = C1449c.f3668a[notificationDetails.repeatInterval.ordinal()];
        if (i == 1) {
            return 60000;
        }
        if (i == 2) {
            return 3600000;
        }
        if (i != 3) {
            return i != 4 ? 0 : 604800000;
        }
        return 86400000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r3.channelAction;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean canCreateNotificationChannel(android.content.Context r2, com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x002e
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.lang.String r0 = r3.f3679id
            android.app.NotificationChannel r2 = r2.getNotificationChannel(r0)
            if (r2 != 0) goto L_0x001e
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r0 = r3.channelAction
            if (r0 == 0) goto L_0x0026
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r1 = com.dexterous.flutterlocalnotifications.models.NotificationChannelAction.CreateIfNotExists
            if (r0 == r1) goto L_0x0026
        L_0x001e:
            if (r2 == 0) goto L_0x0028
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r2 = r3.channelAction
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r3 = com.dexterous.flutterlocalnotifications.models.NotificationChannelAction.Update
            if (r2 != r3) goto L_0x0028
        L_0x0026:
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L_0x002e:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.canCreateNotificationChannel(android.content.Context, com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails):java.lang.Boolean");
    }

    private void cancel(C0144j jVar, C0145k.C0150d dVar) {
        Map map = (Map) jVar.mo333b();
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        dVar.mo338a((Object) null);
    }

    private void cancelAllNotifications(C0145k.C0150d dVar) {
        getNotificationManager(this.applicationContext).mo2503d();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            dVar.mo338a((Object) null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().f3683id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        dVar.mo338a((Object) null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, ScheduledNotificationReceiver.class)));
        C0581n notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.mo2501b(num.intValue());
        } else {
            notificationManager.mo2502c(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = (byte) ((Double) arrayList.get(i)).intValue();
        }
        return bArr;
    }

    private static C0565k.C0576h.C0577a createMessage(Context context, MessageDetails messageDetails) {
        String str;
        C0565k.C0576h.C0577a aVar = new C0565k.C0576h.C0577a(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (!(str2 == null || (str = messageDetails.dataMimeType) == null)) {
            aVar.mo2490j(str, Uri.parse(str2));
        }
        return aVar;
    }

    protected static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        NotificationChannelDetails fromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, fromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, fromNotificationDetails);
        }
        Intent launchIntent2 = getLaunchIntent(context);
        launchIntent2.setAction(SELECT_NOTIFICATION);
        launchIntent2.putExtra(PAYLOAD, notificationDetails.payload);
        int i = 134217728;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        }
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.f3683id.intValue(), launchIntent2, i);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        C0565k.C0573e E = new C0565k.C0573e(context, notificationDetails.channelId).mo2464s(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title).mo2463r(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body).mo2442N(notificationDetails.ticker).mo2457l(BooleanUtils.getValue(notificationDetails.autoCancel)).mo2462q(activity).mo2434F(notificationDetails.priority.intValue()).mo2432D(BooleanUtils.getValue(notificationDetails.ongoing)).mo2433E(BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        setSmallIcon(context, notificationDetails, E);
        E.mo2470z(getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource));
        Integer num = notificationDetails.color;
        if (num != null) {
            E.mo2460o(num.intValue());
        }
        Boolean bool = notificationDetails.colorized;
        if (bool != null) {
            E.mo2461p(bool.booleanValue());
        }
        Boolean bool2 = notificationDetails.showWhen;
        if (bool2 != null) {
            E.mo2437I(BooleanUtils.getValue(bool2));
        }
        Long l = notificationDetails.when;
        if (l != null) {
            E.mo2447S(l.longValue());
        }
        Boolean bool3 = notificationDetails.usesChronometer;
        if (bool3 != null) {
            E.mo2444P(bool3.booleanValue());
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            E.mo2466v(activity, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            E.mo2436H(notificationDetails.shortcutId);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            E.mo2441M(notificationDetails.subText);
        }
        Integer num2 = notificationDetails.number;
        if (num2 != null) {
            E.mo2431C(num2.intValue());
        }
        setVisibility(notificationDetails, E);
        applyGrouping(notificationDetails, E);
        setSound(context, notificationDetails, E);
        setVibrationPattern(notificationDetails, E);
        setLights(notificationDetails, E);
        setStyle(context, notificationDetails, E);
        setProgress(notificationDetails, E);
        setCategory(notificationDetails, E);
        setTimeoutAfter(notificationDetails, E);
        Notification b = E.mo2449b();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            for (int i2 : iArr) {
                b.flags = i2 | b.flags;
            }
        }
        return b;
    }

    private void createNotificationChannel(C0144j jVar, C0145k.C0150d dVar) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) jVar.mo333b()));
        dVar.mo338a((Object) null);
    }

    private void createNotificationChannelGroup(C0144j jVar, C0145k.C0150d dVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) jVar.mo333b());
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(from.f3681id, from.name);
            if (i >= 28) {
                notificationChannelGroup.setDescription(from.description);
            }
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
        dVar.mo338a((Object) null);
    }

    private void deleteNotificationChannel(C0144j jVar, C0145k.C0150d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) jVar.mo333b());
        }
        dVar.mo338a((Object) null);
    }

    private void deleteNotificationChannelGroup(C0144j jVar, C0145k.C0150d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) jVar.mo333b());
        }
        dVar.mo338a((Object) null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        String str;
        IconSource iconSource;
        if (iconCompat == null) {
            return null;
        }
        int q = iconCompat.mo2599q();
        if (q == 2) {
            iconSource = IconSource.DrawableResource;
            str = this.applicationContext.getResources().getResourceEntryName(iconCompat.mo2597n());
        } else if (q != 4) {
            return null;
        } else {
            iconSource = IconSource.ContentUri;
            str = iconCompat.mo2600r().toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", Integer.valueOf(iconSource.ordinal()));
        hashMap.put("data", str);
        return hashMap;
    }

    private Map<String, Object> describePerson(C0588o oVar) {
        if (oVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", oVar.mo2515d());
        hashMap.put("name", oVar.mo2516e());
        hashMap.put("uri", oVar.mo2517f());
        hashMap.put("bot", Boolean.valueOf(oVar.mo2518g()));
        hashMap.put("important", Boolean.valueOf(oVar.mo2519h()));
        hashMap.put("icon", describeIcon(oVar.mo2514c()));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(C0145k.C0150d dVar, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (hasInvalidIcon(dVar, from.icon) || hasInvalidLargeIcon(dVar, from.largeIcon, from.largeIconBitmapSource) || hasInvalidBigPictureResources(dVar, from) || hasInvalidRawSoundResource(dVar, from) || hasInvalidLedDetails(dVar, from)) {
            return null;
        }
        return from;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    private void getActiveNotificationMessagingStyle(C0144j jVar, C0145k.C0150d dVar) {
        Notification notification;
        StatusBarNotification statusBarNotification;
        if (Build.VERSION.SDK_INT < 23) {
            dVar.mo339b(GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE, "Android version must be 6.0 or newer to use getActiveNotificationMessagingStyle", (Object) null);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) jVar.mo333b();
            int intValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            int length = activeNotifications.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    notification = null;
                    break;
                }
                statusBarNotification = activeNotifications[i];
                if (statusBarNotification.getId() != intValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                    i++;
                }
            }
            notification = statusBarNotification.getNotification();
            if (notification == null) {
                dVar.mo338a((Object) null);
                return;
            }
            C0565k.C0576h y = C0565k.C0576h.m2328y(notification);
            if (y == null) {
                dVar.mo338a((Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("groupConversation", Boolean.valueOf(y.mo2480E()));
            hashMap.put("person", describePerson(y.mo2479C()));
            hashMap.put("conversationTitle", y.mo2477A());
            ArrayList arrayList = new ArrayList();
            for (C0565k.C0576h.C0577a next : y.mo2478B()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", next.mo2488h());
                hashMap2.put("timestamp", Long.valueOf(next.mo2489i()));
                hashMap2.put("person", describePerson(next.mo2487g()));
                arrayList.add(hashMap2);
            }
            hashMap.put("messages", arrayList);
            dVar.mo338a(hashMap);
        } catch (Throwable th) {
            dVar.mo339b(GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private void getActiveNotifications(C0145k.C0150d dVar) {
        if (Build.VERSION.SDK_INT < 23) {
            dVar.mo339b(GET_ACTIVE_NOTIFICATIONS_ERROR_CODE, GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE, (Object) null);
            return;
        }
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (Build.VERSION.SDK_INT >= 26) {
                    hashMap.put("channelId", notification.getChannelId());
                }
                hashMap.put("groupKey", notification.getGroup());
                hashMap.put(CANCEL_TAG, statusBarNotification.getTag());
                hashMap.put("title", notification.extras.getCharSequence("android.title"));
                hashMap.put("body", notification.extras.getCharSequence("android.text"));
                arrayList.add(hashMap);
            }
            dVar.mo338a(arrayList);
        } catch (Throwable th) {
            dVar.mo339b(GET_ACTIVE_NOTIFICATIONS_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private static PendingIntent getActivityPendingIntent(Context context, int i, Intent intent) {
        return PendingIntent.getActivity(context, i, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] castObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i, Intent intent) {
        return PendingIntent.getBroadcast(context, i, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i = C1449c.f3669b[iconSource.ordinal()];
        if (i == 1) {
            return IconCompat.m2653k(context, getDrawableResourceId(context, (String) obj));
        }
        if (i == 2) {
            return IconCompat.m2649g(BitmapFactory.decodeFile((String) obj));
        }
        if (i == 3) {
            return IconCompat.m2651i((String) obj);
        }
        if (i == 4) {
            try {
                AssetFileDescriptor openFd = context.getAssets().openFd(C3764a.m25580e().mo15007c().mo15417h((String) obj));
                FileInputStream createInputStream = openFd.createInputStream();
                IconCompat g = IconCompat.m2649g(BitmapFactory.decodeStream(createInputStream));
                createInputStream.close();
                openFd.close();
                return g;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (i != 5) {
            return null;
        } else {
            byte[] castObjectToByteArray = castObjectToByteArray(obj);
            return IconCompat.m2652j(castObjectToByteArray, 0, castObjectToByteArray.length);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            hashMap.put(CANCEL_ID, notificationChannel.getId());
            hashMap.put("name", notificationChannel.getName());
            hashMap.put("description", notificationChannel.getDescription());
            hashMap.put("groupId", notificationChannel.getGroup());
            hashMap.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
            hashMap.put("importance", Integer.valueOf(notificationChannel.getImportance()));
            Uri sound = notificationChannel.getSound();
            if (sound == null) {
                hashMap.put("sound", (Object) null);
                hashMap.put("playSound", Boolean.FALSE);
            } else {
                hashMap.put("playSound", Boolean.TRUE);
                List asList = Arrays.asList(SoundSource.values());
                if (sound.getScheme().equals("android.resource")) {
                    String[] split = sound.toString().split("/");
                    str = split[split.length - 1];
                    Integer tryParseInt = tryParseInt(str);
                    if (tryParseInt == null || (str = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue())) != null) {
                        hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                    }
                } else {
                    hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                    str = sound.toString();
                }
                hashMap.put("sound", str);
            }
            hashMap.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
            hashMap.put("vibrationPattern", notificationChannel.getVibrationPattern());
            hashMap.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
            hashMap.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
        }
        return hashMap;
    }

    static String getNextFireDate(NotificationDetails notificationDetails) {
        if (Build.VERSION.SDK_INT >= 26) {
            ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
            if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1));
            } else if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
                return null;
            } else {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1));
            }
        } else {
            ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency2 = notificationDetails.scheduledNotificationRepeatFrequency;
            if (scheduledNotificationRepeatFrequency2 == ScheduledNotificationRepeatFrequency.Daily) {
                return C3250b.f20640n.mo14171b(C2752g.m21889S(notificationDetails.scheduledDateTime).mo12872V(1));
            } else if (scheduledNotificationRepeatFrequency2 != ScheduledNotificationRepeatFrequency.Weekly) {
                return null;
            } else {
                return C3250b.f20640n.mo14171b(C2752g.m21889S(notificationDetails.scheduledDateTime).mo12877a0(1));
            }
        }
    }

    static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        if (Build.VERSION.SDK_INT >= 26) {
            ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
            ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
            ZonedDateTime now = ZonedDateTime.now(of);
            ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
            while (of3.isBefore(now)) {
                of3 = of3.plusDays(1);
            }
            DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
            if (dateTimeComponents == DateTimeComponents.Time) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            }
            if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
                while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                    of3 = of3.plusDays(1);
                }
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            } else if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
                while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                    of3 = of3.plusDays(1);
                }
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            } else if (dateTimeComponents != DateTimeComponents.DateAndTime) {
                return null;
            } else {
                while (true) {
                    if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
                    }
                    of3 = of3.plusDays(1);
                }
            }
        } else {
            C2778q q = C2778q.m22125q(notificationDetails.timeZoneName);
            C2783t R = C2783t.m22168R(C2752g.m21889S(notificationDetails.scheduledDateTime), q);
            C2783t P = C2783t.m22166P(q);
            C2783t Q = C2783t.m22167Q(P.mo13026M(), P.mo13023J(), P.mo13019F(), R.mo13021H(), R.mo13022I(), R.mo13025L(), R.mo13024K(), q);
            while (Q.mo13120s(P)) {
                Q = Q.mo13029X(1);
            }
            DateTimeComponents dateTimeComponents2 = notificationDetails.matchDateTimeComponents;
            if (dateTimeComponents2 == DateTimeComponents.Time) {
                return C3250b.f20640n.mo14171b(Q);
            }
            if (dateTimeComponents2 == DateTimeComponents.DayOfWeekAndTime) {
                while (Q.mo13020G() != R.mo13020G()) {
                    Q = Q.mo13029X(1);
                }
                return C3250b.f20640n.mo14171b(Q);
            } else if (dateTimeComponents2 == DateTimeComponents.DayOfMonthAndTime) {
                while (Q.mo13019F() != R.mo13019F()) {
                    Q = Q.mo13029X(1);
                }
                return C3250b.f20640n.mo14171b(Q);
            } else if (dateTimeComponents2 != DateTimeComponents.DateAndTime) {
                return null;
            } else {
                while (true) {
                    if (Q.mo13023J() == R.mo13023J() && Q.mo13019F() == R.mo13019F()) {
                        return C3250b.f20640n.mo14171b(Q);
                    }
                    Q = Q.mo13029X(1);
                }
            }
        }
    }

    private void getNotificationAppLaunchDetails(C0145k.C0150d dVar) {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        String str = null;
        if (activity != null) {
            Intent intent = activity.getIntent();
            Boolean valueOf = Boolean.valueOf(intent != null && SELECT_NOTIFICATION.equals(intent.getAction()) && !launchedActivityFromHistory(intent));
            if (valueOf.booleanValue()) {
                str = intent.getStringExtra(PAYLOAD);
            }
            bool = valueOf;
        }
        hashMap.put(NOTIFICATION_LAUNCHED_APP, bool);
        hashMap.put(PAYLOAD, str);
        dVar.mo338a(hashMap);
    }

    private void getNotificationChannels(C0145k.C0150d dVar) {
        try {
            List<NotificationChannel> g = getNotificationManager(this.applicationContext).mo2504g();
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel mappedNotificationChannel : g) {
                arrayList.add(getMappedNotificationChannel(mappedNotificationChannel));
            }
            dVar.mo338a(arrayList);
        } catch (Throwable th) {
            dVar.mo339b(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private static C0581n getNotificationManager(Context context) {
        return C0581n.m2390e(context);
    }

    private boolean hasInvalidBigPictureResources(C0145k.C0150d dVar, NotificationDetails notificationDetails) {
        if (notificationDetails.style != NotificationStyle.BigPicture) {
            return false;
        }
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        if (hasInvalidLargeIcon(dVar, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
            return true;
        }
        BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
        if (bitmapSource == BitmapSource.DrawableResource) {
            String str = (String) bigPictureStyleInformation.bigPicture;
            return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_BIG_PICTURE_ERROR_CODE);
        } else if (bitmapSource == BitmapSource.FilePath) {
            return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
        } else {
            if (bitmapSource != BitmapSource.ByteArray) {
                return false;
            }
            byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
            return bArr == null || bArr.length == 0;
        }
    }

    private boolean hasInvalidIcon(C0145k.C0150d dVar, String str) {
        return !StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_ICON_ERROR_CODE);
    }

    private boolean hasInvalidLargeIcon(C0145k.C0150d dVar, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource == bitmapSource2 || bitmapSource == BitmapSource.FilePath) {
            String str = (String) obj;
            return !StringUtils.isNullOrEmpty(str).booleanValue() && bitmapSource == bitmapSource2 && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_LARGE_ICON_ERROR_CODE);
        } else if (bitmapSource == BitmapSource.ByteArray) {
            return ((byte[]) obj).length == 0;
        } else {
            return false;
        }
    }

    private boolean hasInvalidLedDetails(C0145k.C0150d dVar, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        dVar.mo339b(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, (Object) null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(C0145k.C0150d dVar, NotificationDetails notificationDetails) {
        SoundSource soundSource;
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue() || (((soundSource = notificationDetails.soundSource) != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0)) {
            return false;
        }
        dVar.mo339b(INVALID_SOUND_ERROR_CODE, String.format(INVALID_RAW_RESOURCE_ERROR_MESSAGE, new Object[]{notificationDetails.sound}), (Object) null);
        return true;
    }

    private static void initAndroidThreeTen(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            C2607a.m21301a(context);
        }
    }

    private void initialize(C0144j jVar, C0145k.C0150d dVar) {
        String str = (String) ((Map) jVar.mo333b()).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, dVar, INVALID_ICON_ERROR_CODE)) {
            initAndroidThreeTen(this.applicationContext);
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            dVar.mo338a(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, C0145k.C0150d dVar, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        dVar.mo339b(str2, String.format(INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE, new Object[]{str}), (Object) null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & 1048576) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, (String) null);
        return string != null ? (ArrayList) buildGson().mo15715i(string, new C1447a().mo4849e()) : arrayList;
    }

    private void onAttachedToEngine(Context context, C0128c cVar) {
        this.applicationContext = context;
        C0145k kVar = new C0145k(cVar, METHOD_CHANNEL);
        this.channel = kVar;
        kVar.mo337e(this);
    }

    private void pendingNotificationRequests(C0145k.C0150d dVar) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(CANCEL_ID, next.f3683id);
            hashMap.put("title", next.title);
            hashMap.put("body", next.body);
            hashMap.put(PAYLOAD, next.payload);
            arrayList.add(hashMap);
        }
        dVar.mo338a(arrayList);
    }

    public static void registerWith(C0154o oVar) {
        FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin = new FlutterLocalNotificationsPlugin();
        flutterLocalNotificationsPlugin.setActivity(oVar.mo347d());
        oVar.mo346c(flutterLocalNotificationsPlugin);
        oVar.mo344a(flutterLocalNotificationsPlugin);
        flutterLocalNotificationsPlugin.onAttachedToEngine(oVar.mo345b(), oVar.mo348e());
    }

    static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f3683id.equals(num)) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(C0144j jVar, C0145k.C0150d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.mo333b());
        if (extractNotificationDetails != null) {
            repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            dVar.mo338a((Object) null);
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, notificationDetails.repeatTime.hour.intValue());
            instance.set(12, notificationDetails.repeatTime.minute.intValue());
            instance.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                instance.set(7, num.intValue());
            }
            longValue = instance.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String p = buildGson().mo15721p(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, p);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f3683id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            C0551d.m2201b(alarmManager, 0, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    static void rescheduleNotifications(Context context) {
        initAndroidThreeTen(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (next.repeatInterval != null) {
                repeatNotification(context, next, Boolean.FALSE);
            } else if (next.timeZoneName == null) {
                scheduleNotification(context, next, Boolean.FALSE);
            } else {
                zonedScheduleNotification(context, next, Boolean.FALSE);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource == null || soundSource == SoundSource.RawResource) {
            return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
        } else if (soundSource == SoundSource.Uri) {
            return Uri.parse(str);
        } else {
            return null;
        }
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.f3683id.equals(notificationDetails.f3683id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().mo15721p(arrayList)).apply();
    }

    private void schedule(C0144j jVar, C0145k.C0150d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.mo333b());
        if (extractNotificationDetails != null) {
            scheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            dVar.mo338a((Object) null);
        }
    }

    static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String p = buildGson().mo15721p(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, p);
        C0551d.m2201b(getAlarmManager(context), 0, calculateNextNotificationTrigger, getBroadcastPendingIntent(context, notificationDetails.f3683id.intValue(), intent));
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String p = buildGson().mo15721p(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, p);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f3683id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            C0551d.m2201b(alarmManager, 0, notificationDetails.millisecondsSinceEpoch.longValue(), broadcastPendingIntent);
        } else {
            C0551d.m2200a(alarmManager, 0, notificationDetails.millisecondsSinceEpoch.longValue(), broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        this.channel.mo335c("selectNotification", intent.getStringExtra(PAYLOAD));
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        Bitmap bitmapFromSource;
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        C0565k.C0567b bVar = new C0565k.C0567b();
        if (bigPictureStyleInformation.contentTitle != null) {
            bVar.mo2418A(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            bVar.mo2419B(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            bitmapFromSource = null;
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                bitmapFromSource = getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource);
            }
            bVar.mo2424z(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
            eVar.mo2440L(bVar);
        }
        bVar.mo2423y(bitmapFromSource);
        bVar.mo2424z(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
        eVar.mo2440L(bVar);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        C0565k.C0571c cVar = new C0565k.C0571c();
        if (bigTextStyleInformation.bigText != null) {
            cVar.mo2426x(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            cVar.mo2427y(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            boolean booleanValue = bigTextStyleInformation.htmlFormatSummaryText.booleanValue();
            String str = bigTextStyleInformation.summaryText;
            CharSequence charSequence = str;
            if (booleanValue) {
                charSequence = fromHtml(str);
            }
            cVar.mo2428z(charSequence);
        }
        eVar.mo2440L(cVar);
    }

    private static void setCategory(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        String str = notificationDetails.category;
        if (str != null) {
            eVar.mo2458m(str);
        }
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        C0565k.C0575g gVar = new C0565k.C0575g();
        if (inboxStyleInformation.contentTitle != null) {
            gVar.mo2475y(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            gVar.mo2476z(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                gVar.mo2474x(inboxStyleInformation.htmlFormatLines.booleanValue() ? fromHtml(next) : next);
            }
        }
        eVar.mo2440L(gVar);
    }

    private static void setLights(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        if (BooleanUtils.getValue(notificationDetails.enableLights) && notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            eVar.mo2429A(notificationDetails.ledColor.intValue(), notificationDetails.ledOnMs.intValue(), notificationDetails.ledOffMs.intValue());
        }
    }

    private static void setMediaStyle(C0565k.C0573e eVar) {
        eVar.mo2440L(new C1431a());
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        C0565k.C0576h hVar = new C0565k.C0576h(buildPerson(context, messagingStyleInformation.person));
        hVar.mo2482I(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            hVar.mo2481H(str);
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                hVar.mo2483x(createMessage(context, it.next()));
            }
        }
        eVar.mo2440L(hVar);
    }

    private static void setProgress(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            eVar.mo2435G(notificationDetails.maxProgress.intValue(), notificationDetails.progress.intValue(), notificationDetails.indeterminate.booleanValue());
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        int intValue;
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            intValue = getDrawableResourceId(context, notificationDetails.icon);
        } else {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, (String) null);
            intValue = StringUtils.isNullOrEmpty(string).booleanValue() ? notificationDetails.iconResourceId.intValue() : getDrawableResourceId(context, string);
        }
        eVar.mo2438J(intValue);
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        eVar.mo2439K(BooleanUtils.getValue(notificationDetails.playSound) ? retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource) : null);
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        int i = C1449c.f3670c[notificationDetails.style.ordinal()];
        if (i == 1) {
            setBigPictureStyle(context, notificationDetails, eVar);
        } else if (i == 2) {
            setBigTextStyle(notificationDetails, eVar);
        } else if (i == 3) {
            setInboxStyle(notificationDetails, eVar);
        } else if (i == 4) {
            setMessagingStyle(context, notificationDetails, eVar);
        } else if (i == 5) {
            setMediaStyle(eVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        Long l = notificationDetails.timeoutAfter;
        if (l != null) {
            eVar.mo2443O(l.longValue());
        }
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        if (BooleanUtils.getValue(notificationDetails.enableVibration)) {
            long[] jArr = notificationDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                eVar.mo2445Q(jArr);
                return;
            }
            return;
        }
        eVar.mo2445Q(new long[]{0});
    }

    private static void setVisibility(NotificationDetails notificationDetails, C0565k.C0573e eVar) {
        Integer num = notificationDetails.visibility;
        if (num != null) {
            int intValue = num.intValue();
            int i = 1;
            if (intValue == 0) {
                i = 0;
            } else if (intValue != 1) {
                if (intValue == 2) {
                    i = -1;
                } else {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
            }
            eVar.mo2446R(i);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.f3679id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
            notificationChannel.setDescription(notificationChannelDetails.description);
            notificationChannel.setGroup(notificationChannelDetails.groupId);
            if (notificationChannelDetails.playSound.booleanValue()) {
                Integer num2 = notificationChannelDetails.audioAttributesUsage;
                notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(Integer.valueOf(num2 != null ? num2.intValue() : 5).intValue()).build());
            } else {
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            }
            notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                notificationChannel.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            notificationChannel.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                notificationChannel.setLightColor(num.intValue());
            }
            notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private void show(C0144j jVar, C0145k.C0150d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.mo333b());
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            dVar.mo338a((Object) null);
        }
    }

    static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        C0581n notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        int intValue = notificationDetails.f3683id.intValue();
        if (str != null) {
            notificationManager.mo2506i(str, intValue, createNotification);
        } else {
            notificationManager.mo2505h(intValue, createNotification);
        }
    }

    private void startForegroundService(C0144j jVar, C0145k.C0150d dVar) {
        String str;
        Map map = (Map) jVar.mo332a("notificationData");
        Integer num = (Integer) jVar.mo332a("startType");
        ArrayList arrayList = (ArrayList) jVar.mo332a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            str = "If foregroundServiceTypes is non-null it must not be empty!";
        } else if (map == null || num == null) {
            str = "An argument passed to startForegroundService was null!";
        } else {
            NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, map);
            if (extractNotificationDetails == null) {
                return;
            }
            if (extractNotificationDetails.f3683id.intValue() != 0) {
                C1453b bVar = new C1453b(extractNotificationDetails, num.intValue(), arrayList);
                Intent intent = new Intent(this.applicationContext, C1452a.class);
                intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", bVar);
                C0597a.m2455j(this.applicationContext, intent);
                dVar.mo338a((Object) null);
                return;
            }
            str = "The id of the notification for a foreground service must not be 0!";
        }
        dVar.mo339b("ARGUMENT_ERROR", str, (Object) null);
    }

    private void stopForegroundService(C0145k.C0150d dVar) {
        this.applicationContext.stopService(new Intent(this.applicationContext, C1452a.class));
        dVar.mo338a((Object) null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(C0144j jVar, C0145k.C0150d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.mo333b());
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            dVar.mo338a((Object) null);
        }
    }

    static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        initAndroidThreeTen(context);
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate != null) {
            notificationDetails.scheduledDateTime = nextFireDate;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        initAndroidThreeTen(context);
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents != null) {
            notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String p = buildGson().mo15721p(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, p);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f3683id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        long epochMilli = Build.VERSION.SDK_INT >= 26 ? ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli() : C2783t.m22168R(C2752g.m21889S(notificationDetails.scheduledDateTime), C2778q.m22125q(notificationDetails.timeZoneName)).mo13122w().mo12795D();
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            C0551d.m2201b(alarmManager, 0, epochMilli, broadcastPendingIntent);
        } else {
            C0551d.m2200a(alarmManager, 0, epochMilli, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void onAttachedToActivity(C4078c cVar) {
        cVar.mo13516c(this);
        cVar.mo13514a(this);
        this.mainActivity = cVar.mo13517d();
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        onAttachedToEngine(bVar.mo15539a(), bVar.mo15540b());
    }

    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        String str = jVar.f269a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(STOP_FOREGROUND_SERVICE)) {
                    c = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(GET_NOTIFICATION_CHANNELS_METHOD)) {
                    c = 1;
                    break;
                }
                break;
            case -1889739879:
                if (str.equals(SHOW_WEEKLY_AT_DAY_AND_TIME_METHOD)) {
                    c = 2;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c = 3;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(CANCEL_METHOD)) {
                    c = 4;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(PENDING_NOTIFICATION_REQUESTS_METHOD)) {
                    c = 5;
                    break;
                }
                break;
            case -697920873:
                if (str.equals(SCHEDULE_METHOD)) {
                    c = 6;
                    break;
                }
                break;
            case -208611345:
                if (str.equals(GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD)) {
                    c = 7;
                    break;
                }
                break;
            case 3529469:
                if (str.equals(SHOW_METHOD)) {
                    c = 8;
                    break;
                }
                break;
            case 6625712:
                if (str.equals(PERIODICALLY_SHOW_METHOD)) {
                    c = 9;
                    break;
                }
                break;
            case 116003316:
                if (str.equals(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD)) {
                    c = 10;
                    break;
                }
                break;
            case 476547271:
                if (str.equals(CANCEL_ALL_METHOD)) {
                    c = 11;
                    break;
                }
                break;
            case 548573423:
                if (str.equals(ZONED_SCHEDULE_METHOD)) {
                    c = 12;
                    break;
                }
                break;
            case 746581438:
                if (str.equals(REQUEST_PERMISSION_METHOD)) {
                    c = 13;
                    break;
                }
                break;
            case 767006947:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c = 14;
                    break;
                }
                break;
            case 871091088:
                if (str.equals(INITIALIZE_METHOD)) {
                    c = 15;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(ARE_NOTIFICATIONS_ENABLED_METHOD)) {
                    c = 16;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_METHOD)) {
                    c = 17;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(START_FOREGROUND_SERVICE)) {
                    c = 18;
                    break;
                }
                break;
            case 1408864732:
                if (str.equals(SHOW_DAILY_AT_TIME_METHOD)) {
                    c = 19;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(GET_ACTIVE_NOTIFICATIONS_METHOD)) {
                    c = 20;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_METHOD)) {
                    c = 21;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                stopForegroundService(dVar);
                return;
            case 1:
                getNotificationChannels(dVar);
                return;
            case 2:
            case 9:
            case 19:
                repeat(jVar, dVar);
                return;
            case 3:
                deleteNotificationChannelGroup(jVar, dVar);
                return;
            case 4:
                cancel(jVar, dVar);
                return;
            case 5:
                pendingNotificationRequests(dVar);
                return;
            case 6:
                schedule(jVar, dVar);
                return;
            case 7:
                getNotificationAppLaunchDetails(dVar);
                return;
            case 8:
                show(jVar, dVar);
                return;
            case 10:
                getActiveNotificationMessagingStyle(jVar, dVar);
                return;
            case 11:
                cancelAllNotifications(dVar);
                return;
            case 12:
                zonedSchedule(jVar, dVar);
                return;
            case 13:
                requestPermission(new C1448b(dVar));
                return;
            case 14:
                createNotificationChannelGroup(jVar, dVar);
                return;
            case 15:
                initialize(jVar, dVar);
                return;
            case 16:
                areNotificationsEnabled(dVar);
                return;
            case 17:
                deleteNotificationChannel(jVar, dVar);
                return;
            case 18:
                startForegroundService(jVar, dVar);
                return;
            case 20:
                getActiveNotifications(dVar);
                return;
            case 21:
                createNotificationChannel(jVar, dVar);
                return;
            default:
                dVar.mo340c();
                return;
        }
    }

    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    public void onReattachedToActivityForConfigChanges(C4078c cVar) {
        cVar.mo13516c(this);
        cVar.mo13514a(this);
        this.mainActivity = cVar.mo13517d();
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.permissionRequestInProgress) {
            boolean z = true;
            if (i == 1) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    z = false;
                }
                this.callback.mo4868b(z);
                this.permissionRequestInProgress = false;
                return z;
            }
        }
        return false;
    }

    public void requestPermission(C1454c cVar) {
        if (this.permissionRequestInProgress) {
            cVar.mo4867a("Another permission request is already in progress");
            return;
        }
        this.callback = cVar;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!(C0597a.m2446a(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0)) {
                this.permissionRequestInProgress = true;
                C0539b.m2182o(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                return;
            }
            this.callback.mo4868b(true);
            this.permissionRequestInProgress = false;
            return;
        }
        this.callback.mo4868b(C0581n.m2390e(this.mainActivity).mo2500a());
    }
}
