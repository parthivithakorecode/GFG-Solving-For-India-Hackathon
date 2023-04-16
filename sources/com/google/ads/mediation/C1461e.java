package com.google.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.io0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.google.ads.mediation.e */
public abstract class C1461e {

    /* renamed from: com.google.ads.mediation.e$a */
    public static final class C1462a extends Exception {
        public C1462a(@RecentlyNonNull String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.e$b */
    protected @interface C1463b {
        @RecentlyNonNull
        String name();

        boolean required() default true;
    }

    /* renamed from: a */
    public void mo4908a(@RecentlyNonNull Map<String, String> map) {
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C1463b bVar = (C1463b) field.getAnnotation(C1463b.class);
            if (bVar != null) {
                hashMap.put(bVar.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            io0.m11131g("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry next : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(next.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, next.getValue());
                } catch (IllegalAccessException unused) {
                    String str2 = (String) next.getKey();
                    sb = new StringBuilder(String.valueOf(str2).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str2);
                    str = "\" could not be set: Illegal Access";
                } catch (IllegalArgumentException unused2) {
                    String str3 = (String) next.getKey();
                    sb = new StringBuilder(String.valueOf(str3).length() + 43);
                    sb.append("Server option \"");
                    sb.append(str3);
                    str = "\" could not be set: Bad Type";
                }
            } else {
                String str4 = (String) next.getKey();
                String str5 = (String) next.getValue();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 31 + String.valueOf(str5).length());
                sb2.append("Unexpected server option: ");
                sb2.append(str4);
                sb2.append(" = \"");
                sb2.append(str5);
                sb2.append("\"");
                io0.m11126b(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C1463b) field3.getAnnotation(C1463b.class)).required()) {
                String valueOf = String.valueOf(((C1463b) field3.getAnnotation(C1463b.class)).name());
                io0.m11131g(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(((C1463b) field3.getAnnotation(C1463b.class)).name());
            }
        }
        if (sb3.length() > 0) {
            String sb4 = sb3.toString();
            throw new C1462a(sb4.length() != 0 ? "Required server option(s) missing: ".concat(sb4) : new String("Required server option(s) missing: "));
        }
        return;
        sb.append(str);
        io0.m11131g(sb.toString());
    }
}
