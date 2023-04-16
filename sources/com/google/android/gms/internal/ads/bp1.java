package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import java.util.concurrent.Executor;
import p034e2.C2547d;
import p069j1.C3202r1;
import p069j1.C3210u0;

public final class bp1 {

    /* renamed from: a */
    private final C3210u0 f5000a;

    /* renamed from: b */
    private final C2547d f5001b;

    /* renamed from: c */
    private final Executor f5002c;

    public bp1(C3210u0 u0Var, C2547d dVar, Executor executor) {
        this.f5000a = u0Var;
        this.f5001b = dVar;
        this.f5002c = executor;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Bitmap m7014a(bp1 bp1, byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10246B4)).booleanValue()) {
            options.inJustDecodeBounds = true;
            bp1.m7015c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) C2199sw.m17001c().mo8579b(m10.f10254C4)).intValue())) / 2);
            }
        }
        return bp1.m7015c(bArr, options);
    }

    /* renamed from: c */
    private final Bitmap m7015c(byte[] bArr, BitmapFactory.Options options) {
        long b = this.f5001b.mo12463b();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b2 = this.f5001b.mo12463b();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = b2 - b;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            C3202r1.m24015k(sb.toString());
        }
        return decodeByteArray;
    }

    /* renamed from: b */
    public final cc3<Bitmap> mo5913b(String str, double d, boolean z) {
        return rb3.m16135m(this.f5000a.mo14108a(str), new ap1(this, d, z), this.f5002c);
    }
}
