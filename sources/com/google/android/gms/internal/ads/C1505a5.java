package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.a5 */
final class C1505a5 implements C2431z4 {

    /* renamed from: a */
    private final FileChannel f3936a;

    /* renamed from: b */
    private final long f3937b;

    /* renamed from: c */
    private final long f3938c;

    public C1505a5(FileChannel fileChannel, long j, long j2) {
        this.f3936a = fileChannel;
        this.f3937b = j;
        this.f3938c = j2;
    }

    /* renamed from: a */
    public final void mo5086a(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.f3936a.map(FileChannel.MapMode.READ_ONLY, this.f3937b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long zza() {
        return this.f3938c;
    }
}
