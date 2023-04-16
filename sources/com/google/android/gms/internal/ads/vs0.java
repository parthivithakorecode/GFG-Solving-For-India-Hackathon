package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p054h1.C2694t;

public final /* synthetic */ class vs0 implements m33 {

    /* renamed from: a */
    public final /* synthetic */ String f16402a;

    public /* synthetic */ vs0(String str) {
        this.f16402a = str;
    }

    public final URLConnection zza() {
        String str = this.f16402a;
        int i = ws0.f16924m;
        C2694t.m21615x();
        int intValue = ((Integer) C2199sw.m17001c().mo8579b(m10.f10619u)).intValue();
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(intValue);
                openConnection.setReadTimeout(intValue);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    ho0 ho0 = new ho0((String) null);
                    ho0.mo7974c(httpURLConnection, (byte[]) null);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    ho0.mo7976e(httpURLConnection, responseCode);
                    if (responseCode / 100 != 3) {
                        return httpURLConnection;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            throw new IOException("Protocol is null");
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            io0.m11126b(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            throw new IOException(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                        }
                    } else {
                        throw new IOException("Missing Location header in redirect");
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                throw new IOException("Too many redirects (20)");
            }
        }
    }
}
