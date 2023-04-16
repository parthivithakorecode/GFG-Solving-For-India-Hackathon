package p101n5;

import java.util.Locale;
import kotlin.jvm.internal.C3357i;
import p005a4.C0144j;
import p006a5.C0165d;

/* renamed from: n5.e */
public final class C3794e {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C3785a m25645b(C0144j jVar) {
        Boolean bool = (Boolean) jVar.mo332a("isSpeakerphoneOn");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) jVar.mo332a("stayAwake");
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                Integer num = (Integer) jVar.mo332a("contentType");
                if (num != null) {
                    int intValue = num.intValue();
                    Integer num2 = (Integer) jVar.mo332a("usageType");
                    if (num2 != null) {
                        return new C3785a(booleanValue, booleanValue2, intValue, num2.intValue(), (Integer) jVar.mo332a("audioFocus"));
                    }
                    throw new IllegalStateException("usageType is required".toString());
                }
                throw new IllegalStateException("contentType is required".toString());
            }
            throw new IllegalStateException("stayAwake is required".toString());
        }
        throw new IllegalStateException("isSpeakerphoneOn is required".toString());
    }

    /* renamed from: c */
    public static final String m25646c(String str) {
        C3357i.m24508e(str, "<this>");
        String upperCase = new C0165d("(.) (.)").mo362a(new C0165d("(.)(\\p{Upper})").mo362a(str, "$1_$2"), "$1_$2").toUpperCase(Locale.ROOT);
        C3357i.m24507d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
