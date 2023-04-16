package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p034e2.C2546c;

public class oo0 implements ao0 {

    /* renamed from: a */
    private final String f12130a;

    public oo0() {
        this.f12130a = null;
    }

    public oo0(String str) {
        this.f12130a = str;
    }

    /* renamed from: b */
    public void mo5345b(String str) {
        HttpURLConnection httpURLConnection;
        try {
            if (C2546c.m21176a()) {
                TrafficStats.setThreadStatsTag(263);
            }
            String valueOf = String.valueOf(str);
            io0.m11126b(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            C2125qw.m15897b();
            String str2 = this.f12130a;
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setReadTimeout(60000);
            if (str2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            httpURLConnection.setUseCaches(false);
            ho0 ho0 = new ho0((String) null);
            ho0.mo7974c(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            ho0.mo7976e(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                io0.m11131g(sb.toString());
            }
            httpURLConnection.disconnect();
            if (C2546c.m21176a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            io0.m11131g(sb2.toString());
            if (C2546c.m21176a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (IOException | RuntimeException e2) {
            try {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                io0.m11131g(sb3.toString());
            } finally {
                if (C2546c.m21176a()) {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
