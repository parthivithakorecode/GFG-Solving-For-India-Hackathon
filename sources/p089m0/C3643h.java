package p089m0;

import androidx.work.C1239b;
import java.util.List;

/* renamed from: m0.h */
public abstract class C3643h {

    /* renamed from: a */
    private static final String f21389a = C3646j.m25231f("InputMerger");

    /* renamed from: a */
    public static C3643h m25223a(String str) {
        try {
            return (C3643h) Class.forName(str).newInstance();
        } catch (Exception e) {
            C3646j c = C3646j.m25229c();
            String str2 = f21389a;
            c.mo14807b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C1239b mo4439b(List<C1239b> list);
}
