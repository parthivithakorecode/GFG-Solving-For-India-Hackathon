package p071j3;

import java.util.List;
import p056h3.C2710d0;

/* renamed from: j3.b */
public abstract class C3233b implements C3238e {
    /* renamed from: k */
    private Boolean m24134k(String str) {
        Object c = mo14154c(str);
        if (c instanceof Boolean) {
            return (Boolean) c;
        }
        return null;
    }

    /* renamed from: m */
    private String m24135m() {
        return (String) mo14154c("sql");
    }

    /* renamed from: n */
    private List<Object> m24136n() {
        return (List) mo14154c("arguments");
    }

    /* renamed from: d */
    public C2710d0 mo14147d() {
        return new C2710d0(m24135m(), m24136n());
    }

    /* renamed from: e */
    public boolean mo14148e() {
        return Boolean.TRUE.equals(mo14154c("noResult"));
    }

    /* renamed from: f */
    public Boolean mo14149f() {
        return m24134k("inTransaction");
    }

    /* renamed from: g */
    public Integer mo14150g() {
        return (Integer) mo14154c("transactionId");
    }

    /* renamed from: h */
    public boolean mo14151h() {
        return mo14156j("transactionId") && mo14150g() == null;
    }

    /* renamed from: l */
    public boolean mo14152l() {
        return Boolean.TRUE.equals(mo14154c("continueOnError"));
    }

    public String toString() {
        return "" + mo14155i() + " " + m24135m() + " " + m24136n();
    }
}
