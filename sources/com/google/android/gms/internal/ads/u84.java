package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class u84 extends eb1 {

    /* renamed from: e */
    private final AssetManager f15459e;

    /* renamed from: f */
    private Uri f15460f;

    /* renamed from: g */
    private InputStream f15461g;

    /* renamed from: h */
    private long f15462h;

    /* renamed from: i */
    private boolean f15463i;

    public u84(Context context) {
        super(false);
        this.f15459e = context.getAssets();
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f15462h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new t84(e, 2000);
            }
        }
        InputStream inputStream = this.f15461g;
        int i3 = n13.f11236a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f15462h;
        if (j2 != -1) {
            this.f15462h = j2 - ((long) read);
        }
        mo6893o(read);
        return read;
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f15460f;
    }

    /* renamed from: i */
    public final void mo5754i() {
        this.f15460f = null;
        try {
            InputStream inputStream = this.f15461g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f15461g = null;
            if (this.f15463i) {
                this.f15463i = false;
                mo6894p();
            }
        } catch (IOException e) {
            throw new t84(e, 2000);
        } catch (Throwable th) {
            this.f15461g = null;
            if (this.f15463i) {
                this.f15463i = false;
                mo6894p();
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        try {
            Uri uri = li1.f10058a;
            this.f15460f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo6895q(li1);
            InputStream open = this.f15459e.open(path, 1);
            this.f15461g = open;
            if (open.skip(li1.f10063f) >= li1.f10063f) {
                long j = li1.f10064g;
                if (j != -1) {
                    this.f15462h = j;
                } else {
                    long available = (long) this.f15461g.available();
                    this.f15462h = available;
                    if (available == 2147483647L) {
                        this.f15462h = -1;
                    }
                }
                this.f15463i = true;
                mo6896r(li1);
                return this.f15462h;
            }
            throw new t84((Throwable) null, 2008);
        } catch (t84 e) {
            throw e;
        } catch (IOException e2) {
            throw new t84(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }
}
