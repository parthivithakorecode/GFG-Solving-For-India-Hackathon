package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class ye4 {

    /* renamed from: a */
    private final ByteArrayOutputStream f17692a;

    /* renamed from: b */
    private final DataOutputStream f17693b;

    public ye4() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f17692a = byteArrayOutputStream;
        this.f17693b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m19994b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public final byte[] mo11995a(xe4 xe4) {
        this.f17692a.reset();
        try {
            m19994b(this.f17693b, xe4.f17184f);
            String str = xe4.f17185g;
            if (str == null) {
                str = "";
            }
            m19994b(this.f17693b, str);
            this.f17693b.writeLong(xe4.f17186h);
            this.f17693b.writeLong(xe4.f17187i);
            this.f17693b.write(xe4.f17188j);
            this.f17693b.flush();
            return this.f17692a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
