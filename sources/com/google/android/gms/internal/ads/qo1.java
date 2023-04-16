package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class qo1 extends if1 {

    /* renamed from: g */
    public final li1 f13254g;

    public qo1(li1 li1, int i, int i2) {
        super(m15782b(2008, 1));
        this.f13254g = li1;
    }

    public qo1(IOException iOException, li1 li1, int i, int i2) {
        super((Throwable) iOException, m15782b(i, i2));
        this.f13254g = li1;
    }

    public qo1(String str, li1 li1, int i, int i2) {
        super(str, m15782b(2001, 1));
        this.f13254g = li1;
    }

    @Deprecated
    public qo1(String str, IOException iOException, li1 li1, int i) {
        this(str, iOException, li1, 2000, 1);
    }

    public qo1(String str, IOException iOException, li1 li1, int i, int i2) {
        super(str, iOException, m15782b(i, 1));
        this.f13254g = li1;
    }

    /* renamed from: a */
    public static qo1 m15781a(IOException iOException, li1 li1, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && w33.m18852a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        return i2 == 2007 ? new pn1(iOException, li1) : new qo1(iOException, li1, i2, i);
    }

    /* renamed from: b */
    private static int m15782b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }
}
