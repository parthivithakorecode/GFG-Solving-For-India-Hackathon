package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C2313vz;

public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: f */
    private final C2313vz f3707f = new C2313vz();

    public void attachInfo(@RecentlyNonNull Context context, @RecentlyNonNull ProviderInfo providerInfo) {
        this.f3707f.attachInfo(context, providerInfo);
    }

    public int delete(@RecentlyNonNull Uri uri, @RecentlyNonNull String str, @RecentlyNonNull String[] strArr) {
        return 0;
    }

    @RecentlyNullable
    public String getType(@RecentlyNonNull Uri uri) {
        return null;
    }

    @RecentlyNullable
    public Uri insert(@RecentlyNonNull Uri uri, @RecentlyNonNull ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    @RecentlyNullable
    public Cursor query(@RecentlyNonNull Uri uri, @RecentlyNonNull String[] strArr, @RecentlyNonNull String str, @RecentlyNonNull String[] strArr2, @RecentlyNonNull String str2) {
        return null;
    }

    public int update(@RecentlyNonNull Uri uri, @RecentlyNonNull ContentValues contentValues, @RecentlyNonNull String str, @RecentlyNonNull String[] strArr) {
        return 0;
    }
}
