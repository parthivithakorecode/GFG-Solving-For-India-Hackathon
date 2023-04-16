package p115p5;

import android.media.MediaPlayer;
import kotlin.jvm.internal.C3357i;
import p108o5.C3870l;

/* renamed from: p5.c */
public final class C3932c implements C3931b {

    /* renamed from: a */
    private final String f22068a;

    /* renamed from: b */
    private final boolean f22069b;

    public C3932c(String str, boolean z) {
        C3357i.m24508e(str, "url");
        this.f22068a = str;
        this.f22069b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        p133s4.C4051a.m26380a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        throw r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] m26097c(java.net.URL r7) {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.InputStream r7 = r7.openStream()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003d }
        L_0x000d:
            int r2 = r7.read(r1)     // Catch:{ all -> 0x003d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003d }
            int r3 = r2.intValue()     // Catch:{ all -> 0x003d }
            r4 = 0
            if (r3 <= 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = r4
        L_0x001f:
            r5 = 0
            if (r3 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = r5
        L_0x0024:
            if (r2 == 0) goto L_0x002e
            int r2 = r2.intValue()     // Catch:{ all -> 0x003d }
            r0.write(r1, r4, r2)     // Catch:{ all -> 0x003d }
            goto L_0x000d
        L_0x002e:
            k4.q r1 = p079k4.C3330q.f20829a     // Catch:{ all -> 0x003d }
            p133s4.C4051a.m26380a(r7, r5)
            byte[] r7 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            kotlin.jvm.internal.C3357i.m24507d(r7, r0)
            return r7
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            p133s4.C4051a.m26380a(r7, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p115p5.C3932c.m26097c(java.net.URL):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        p133s4.C4051a.m26380a(r2, r0);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File m26098e() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f22068a
            java.net.URI r0 = java.net.URI.create(r0)
            java.net.URL r0 = r0.toURL()
            java.lang.String r1 = "create(url).toURL()"
            kotlin.jvm.internal.C3357i.m24507d(r0, r1)
            byte[] r0 = r3.m26097c(r0)
            java.lang.String r1 = "sound"
            java.lang.String r2 = ""
            java.io.File r1 = java.io.File.createTempFile(r1, r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            r2.write(r0)     // Catch:{ all -> 0x0032 }
            r1.deleteOnExit()     // Catch:{ all -> 0x0032 }
            k4.q r0 = p079k4.C3330q.f20829a     // Catch:{ all -> 0x0032 }
            r0 = 0
            p133s4.C4051a.m26380a(r2, r0)
            java.lang.String r0 = "tempFile"
            kotlin.jvm.internal.C3357i.m24507d(r1, r0)
            return r1
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            p133s4.C4051a.m26380a(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p115p5.C3932c.m26098e():java.io.File");
    }

    /* renamed from: a */
    public void mo15383a(MediaPlayer mediaPlayer) {
        C3357i.m24508e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f22068a);
    }

    /* renamed from: b */
    public void mo15384b(C3870l lVar) {
        C3357i.m24508e(lVar, "soundPoolPlayer");
        lVar.mo15316t(this);
    }

    /* renamed from: d */
    public final String mo15388d() {
        return this.f22069b ? C0179o.m526M(this.f22068a, "file://") : m26098e().getAbsolutePath();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3932c)) {
            return false;
        }
        C3932c cVar = (C3932c) obj;
        return C3357i.m24504a(this.f22068a, cVar.f22068a) && this.f22069b == cVar.f22069b;
    }

    public int hashCode() {
        int hashCode = this.f22068a.hashCode() * 31;
        boolean z = this.f22069b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "UrlSource(url=" + this.f22068a + ", isLocal=" + this.f22069b + ')';
    }
}
