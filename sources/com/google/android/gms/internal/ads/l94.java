package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class l94 implements he1 {

    /* renamed from: a */
    private final Context f9950a;

    /* renamed from: b */
    private final List<vt1> f9951b = new ArrayList();

    /* renamed from: c */
    private final he1 f9952c;

    /* renamed from: d */
    private he1 f9953d;

    /* renamed from: e */
    private he1 f9954e;

    /* renamed from: f */
    private he1 f9955f;

    /* renamed from: g */
    private he1 f9956g;

    /* renamed from: h */
    private he1 f9957h;

    /* renamed from: i */
    private he1 f9958i;

    /* renamed from: j */
    private he1 f9959j;

    /* renamed from: k */
    private he1 f9960k;

    public l94(Context context, he1 he1) {
        this.f9950a = context.getApplicationContext();
        this.f9952c = he1;
    }

    /* renamed from: o */
    private final he1 m12633o() {
        if (this.f9954e == null) {
            u84 u84 = new u84(this.f9950a);
            this.f9954e = u84;
            m12634p(u84);
        }
        return this.f9954e;
    }

    /* renamed from: p */
    private final void m12634p(he1 he1) {
        for (int i = 0; i < this.f9951b.size(); i++) {
            he1.mo6892j(this.f9951b.get(i));
        }
    }

    /* renamed from: q */
    private static final void m12635q(he1 he1, vt1 vt1) {
        if (he1 != null) {
            he1.mo6892j(vt1);
        }
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        he1 he1 = this.f9960k;
        Objects.requireNonNull(he1);
        return he1.mo5752a(bArr, i, i2);
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        he1 he1 = this.f9960k;
        if (he1 == null) {
            return null;
        }
        return he1.mo5753h();
    }

    /* renamed from: i */
    public final void mo5754i() {
        he1 he1 = this.f9960k;
        if (he1 != null) {
            try {
                he1.mo5754i();
            } finally {
                this.f9960k = null;
            }
        }
    }

    /* renamed from: j */
    public final void mo6892j(vt1 vt1) {
        Objects.requireNonNull(vt1);
        this.f9952c.mo6892j(vt1);
        this.f9951b.add(vt1);
        m12635q(this.f9953d, vt1);
        m12635q(this.f9954e, vt1);
        m12635q(this.f9955f, vt1);
        m12635q(this.f9956g, vt1);
        m12635q(this.f9957h, vt1);
        m12635q(this.f9958i, vt1);
        m12635q(this.f9959j, vt1);
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        he1 he1;
        wu1.m19207f(this.f9960k == null);
        String scheme = li1.f10058a.getScheme();
        if (n13.m13646s(li1.f10058a)) {
            String path = li1.f10058a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f9953d == null) {
                    p94 p94 = new p94();
                    this.f9953d = p94;
                    m12634p(p94);
                }
                he1 = this.f9953d;
                this.f9960k = he1;
                return this.f9960k.mo5755k(li1);
            }
        } else if (!"asset".equals(scheme)) {
            if ("content".equals(scheme)) {
                if (this.f9955f == null) {
                    e94 e94 = new e94(this.f9950a);
                    this.f9955f = e94;
                    m12634p(e94);
                }
                he1 = this.f9955f;
            } else if ("rtmp".equals(scheme)) {
                if (this.f9956g == null) {
                    try {
                        he1 he12 = (he1) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f9956g = he12;
                        m12634p(he12);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f9956g == null) {
                        this.f9956g = this.f9952c;
                    }
                }
                he1 = this.f9956g;
            } else if ("udp".equals(scheme)) {
                if (this.f9957h == null) {
                    ka4 ka4 = new ka4(2000);
                    this.f9957h = ka4;
                    m12634p(ka4);
                }
                he1 = this.f9957h;
            } else if ("data".equals(scheme)) {
                if (this.f9958i == null) {
                    f94 f94 = new f94();
                    this.f9958i = f94;
                    m12634p(f94);
                }
                he1 = this.f9958i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f9959j == null) {
                    ca4 ca4 = new ca4(this.f9950a);
                    this.f9959j = ca4;
                    m12634p(ca4);
                }
                he1 = this.f9959j;
            } else {
                he1 = this.f9952c;
            }
            this.f9960k = he1;
            return this.f9960k.mo5755k(li1);
        }
        he1 = m12633o();
        this.f9960k = he1;
        return this.f9960k.mo5755k(li1);
    }

    public final Map<String, List<String>> zza() {
        he1 he1 = this.f9960k;
        return he1 == null ? Collections.emptyMap() : he1.zza();
    }
}
