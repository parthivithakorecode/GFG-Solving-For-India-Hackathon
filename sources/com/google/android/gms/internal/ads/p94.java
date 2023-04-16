package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

public final class p94 extends eb1 {

    /* renamed from: e */
    private RandomAccessFile f12565e;

    /* renamed from: f */
    private Uri f12566f;

    /* renamed from: g */
    private long f12567g;

    /* renamed from: h */
    private boolean f12568h;

    public p94() {
        super(false);
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12567g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f12565e;
            int i3 = n13.f11236a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f12567g -= (long) read;
                mo6893o(read);
            }
            return read;
        } catch (IOException e) {
            throw new o94(e, 2000);
        }
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f12566f;
    }

    /* renamed from: i */
    public final void mo5754i() {
        this.f12566f = null;
        try {
            RandomAccessFile randomAccessFile = this.f12565e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f12565e = null;
            if (this.f12568h) {
                this.f12568h = false;
                mo6894p();
            }
        } catch (IOException e) {
            throw new o94(e, 2000);
        } catch (Throwable th) {
            this.f12565e = null;
            if (this.f12568h) {
                this.f12568h = false;
                mo6894p();
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        Uri uri = li1.f10058a;
        this.f12566f = uri;
        mo6895q(li1);
        int i = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f12565e = randomAccessFile;
            try {
                randomAccessFile.seek(li1.f10063f);
                long j = li1.f10064g;
                if (j == -1) {
                    j = this.f12565e.length() - li1.f10063f;
                }
                this.f12567g = j;
                if (j >= 0) {
                    this.f12568h = true;
                    mo6896r(li1);
                    return this.f12567g;
                }
                throw new o94((String) null, (Throwable) null, 2008);
            } catch (IOException e) {
                throw new o94(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new o94(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            if (n13.f11236a < 21 || !n94.m13806b(e2.getCause())) {
                i = 2005;
            }
            throw new o94(e2, i);
        } catch (SecurityException e3) {
            throw new o94(e3, 2006);
        } catch (RuntimeException e4) {
            throw new o94(e4, 2000);
        }
    }
}
