package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2694t;

@Deprecated
@ParametersAreNonnullByDefault
public final class b20 {

    /* renamed from: a */
    private final List<y10> f4640a = new LinkedList();

    /* renamed from: b */
    private final Map<String, String> f4641b;

    /* renamed from: c */
    private final Object f4642c;

    public b20(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4641b = linkedHashMap;
        this.f4642c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    /* renamed from: f */
    public static final y10 m6560f() {
        return new y10(C2694t.m21592a().mo12463b(), (String) null, (y10) null);
    }

    /* renamed from: a */
    public final a20 mo5628a() {
        a20 a20;
        boolean booleanValue = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f4642c) {
            for (y10 next : this.f4640a) {
                long a = next.mo11949a();
                String c = next.mo11951c();
                y10 b = next.mo11950b();
                if (b != null && a > 0) {
                    sb.append(c);
                    sb.append('.');
                    sb.append(a - b.mo11949a());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(b.mo11949a()))) {
                            hashMap.put(Long.valueOf(b.mo11949a()), new StringBuilder(c));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b.mo11949a()));
                            sb2.append('+');
                            sb2.append(c);
                        }
                    }
                }
            }
            this.f4640a.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(C2694t.m21592a().mo12462a() + (((Long) entry.getKey()).longValue() - C2694t.m21592a().mo12463b()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            a20 = new a20(sb.toString(), str);
        }
        return a20;
    }

    /* renamed from: b */
    public final Map<String, String> mo5629b() {
        Map<String, String> map;
        synchronized (this.f4642c) {
            C2694t.m21607p().mo11023f();
            map = this.f4641b;
        }
        return map;
    }

    /* renamed from: c */
    public final void mo5630c(b20 b20) {
        synchronized (this.f4642c) {
        }
    }

    /* renamed from: d */
    public final void mo5631d(String str, String str2) {
        r10 f;
        if (!TextUtils.isEmpty(str2) && (f = C2694t.m21607p().mo11023f()) != null) {
            synchronized (this.f4642c) {
                x10 a = f.mo10449a(str);
                Map<String, String> map = this.f4641b;
                map.put(str, a.mo11137a(map.get(str), str2));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo5632e(y10 y10, long j, String... strArr) {
        synchronized (this.f4642c) {
            for (int i = 0; i <= 0; i++) {
                this.f4640a.add(new y10(j, strArr[i], y10));
            }
        }
        return true;
    }
}
