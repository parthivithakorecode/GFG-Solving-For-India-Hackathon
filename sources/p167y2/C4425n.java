package p167y2;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4212h;
import p149v2.C4215k;
import p149v2.C4216l;
import p149v2.C4217m;
import p149v2.C4218n;
import p149v2.C4220p;
import p149v2.C4223s;
import p149v2.C4233w;
import p149v2.C4235x;
import p155w2.C4267c;
import p161x2.C4329g;

/* renamed from: y2.n */
public final class C4425n {

    /* renamed from: A */
    public static final C4233w<BigInteger> f22816A = new C4440h();

    /* renamed from: B */
    public static final C4235x f22817B;

    /* renamed from: C */
    public static final C4233w<StringBuilder> f22818C;

    /* renamed from: D */
    public static final C4235x f22819D;

    /* renamed from: E */
    public static final C4233w<StringBuffer> f22820E;

    /* renamed from: F */
    public static final C4235x f22821F;

    /* renamed from: G */
    public static final C4233w<URL> f22822G;

    /* renamed from: H */
    public static final C4235x f22823H;

    /* renamed from: I */
    public static final C4233w<URI> f22824I;

    /* renamed from: J */
    public static final C4235x f22825J;

    /* renamed from: K */
    public static final C4233w<InetAddress> f22826K;

    /* renamed from: L */
    public static final C4235x f22827L;

    /* renamed from: M */
    public static final C4233w<UUID> f22828M;

    /* renamed from: N */
    public static final C4235x f22829N;

    /* renamed from: O */
    public static final C4233w<Currency> f22830O;

    /* renamed from: P */
    public static final C4235x f22831P;

    /* renamed from: Q */
    public static final C4233w<Calendar> f22832Q;

    /* renamed from: R */
    public static final C4235x f22833R;

    /* renamed from: S */
    public static final C4233w<Locale> f22834S;

    /* renamed from: T */
    public static final C4235x f22835T;

    /* renamed from: U */
    public static final C4233w<C4215k> f22836U;

    /* renamed from: V */
    public static final C4235x f22837V;

    /* renamed from: W */
    public static final C4235x f22838W = new C4454t();

    /* renamed from: a */
    public static final C4233w<Class> f22839a;

    /* renamed from: b */
    public static final C4235x f22840b;

    /* renamed from: c */
    public static final C4233w<BitSet> f22841c;

    /* renamed from: d */
    public static final C4235x f22842d;

    /* renamed from: e */
    public static final C4233w<Boolean> f22843e;

    /* renamed from: f */
    public static final C4233w<Boolean> f22844f = new C4429b0();

    /* renamed from: g */
    public static final C4235x f22845g;

    /* renamed from: h */
    public static final C4233w<Number> f22846h;

    /* renamed from: i */
    public static final C4235x f22847i;

    /* renamed from: j */
    public static final C4233w<Number> f22848j;

    /* renamed from: k */
    public static final C4235x f22849k;

    /* renamed from: l */
    public static final C4233w<Number> f22850l;

    /* renamed from: m */
    public static final C4235x f22851m;

    /* renamed from: n */
    public static final C4233w<AtomicInteger> f22852n;

    /* renamed from: o */
    public static final C4235x f22853o;

    /* renamed from: p */
    public static final C4233w<AtomicBoolean> f22854p;

    /* renamed from: q */
    public static final C4235x f22855q;

    /* renamed from: r */
    public static final C4233w<AtomicIntegerArray> f22856r;

    /* renamed from: s */
    public static final C4235x f22857s;

    /* renamed from: t */
    public static final C4233w<Number> f22858t = new C4428b();

    /* renamed from: u */
    public static final C4233w<Number> f22859u = new C4430c();

    /* renamed from: v */
    public static final C4233w<Number> f22860v = new C4432d();

    /* renamed from: w */
    public static final C4233w<Character> f22861w;

    /* renamed from: x */
    public static final C4235x f22862x;

    /* renamed from: y */
    public static final C4233w<String> f22863y;

    /* renamed from: z */
    public static final C4233w<BigDecimal> f22864z = new C4438g();

    /* renamed from: y2.n$a */
    class C4426a extends C4233w<AtomicIntegerArray> {
        C4426a() {
        }

        /* renamed from: f */
        public AtomicIntegerArray mo4624c(C2488a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.mo12357d();
            while (aVar.mo12344B()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo12349N()));
                } catch (NumberFormatException e) {
                    throw new C4223s((Throwable) e);
                }
            }
            aVar.mo12363v();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.mo12381m();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.mo12374V((long) atomicIntegerArray.get(i));
            }
            cVar.mo12383v();
        }
    }

    /* renamed from: y2.n$a0 */
    class C4427a0 extends C4233w<Boolean> {
        C4427a0() {
        }

        /* renamed from: f */
        public Boolean mo4624c(C2488a aVar) {
            C2490b V = aVar.mo12354V();
            if (V != C2490b.NULL) {
                return V == C2490b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.mo12353T())) : Boolean.valueOf(aVar.mo12347H());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Boolean bool) {
            cVar.mo12375W(bool);
        }
    }

    /* renamed from: y2.n$b */
    class C4428b extends C4233w<Number> {
        C4428b() {
        }

        /* renamed from: f */
        public Number mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo12350O());
            } catch (NumberFormatException e) {
                throw new C4223s((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            cVar.mo12376X(number);
        }
    }

    /* renamed from: y2.n$b0 */
    class C4429b0 extends C4233w<Boolean> {
        C4429b0() {
        }

        /* renamed from: f */
        public Boolean mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return Boolean.valueOf(aVar.mo12353T());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Boolean bool) {
            cVar.mo12377Y(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: y2.n$c */
    class C4430c extends C4233w<Number> {
        C4430c() {
        }

        /* renamed from: f */
        public Number mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return Float.valueOf((float) aVar.mo12348I());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            cVar.mo12376X(number);
        }
    }

    /* renamed from: y2.n$c0 */
    class C4431c0 extends C4233w<Number> {
        C4431c0() {
        }

        /* renamed from: f */
        public Number mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo12349N());
            } catch (NumberFormatException e) {
                throw new C4223s((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            cVar.mo12376X(number);
        }
    }

    /* renamed from: y2.n$d */
    class C4432d extends C4233w<Number> {
        C4432d() {
        }

        /* renamed from: f */
        public Number mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return Double.valueOf(aVar.mo12348I());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            cVar.mo12376X(number);
        }
    }

    /* renamed from: y2.n$d0 */
    class C4433d0 extends C4233w<Number> {
        C4433d0() {
        }

        /* renamed from: f */
        public Number mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo12349N());
            } catch (NumberFormatException e) {
                throw new C4223s((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            cVar.mo12376X(number);
        }
    }

    /* renamed from: y2.n$e */
    class C4434e extends C4233w<Character> {
        C4434e() {
        }

        /* renamed from: f */
        public Character mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            String T = aVar.mo12353T();
            if (T.length() == 1) {
                return Character.valueOf(T.charAt(0));
            }
            throw new C4223s("Expecting character, got: " + T);
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Character ch) {
            cVar.mo12377Y(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: y2.n$e0 */
    class C4435e0 extends C4233w<Number> {
        C4435e0() {
        }

        /* renamed from: f */
        public Number mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo12349N());
            } catch (NumberFormatException e) {
                throw new C4223s((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            cVar.mo12376X(number);
        }
    }

    /* renamed from: y2.n$f */
    class C4436f extends C4233w<String> {
        C4436f() {
        }

        /* renamed from: f */
        public String mo4624c(C2488a aVar) {
            C2490b V = aVar.mo12354V();
            if (V != C2490b.NULL) {
                return V == C2490b.BOOLEAN ? Boolean.toString(aVar.mo12347H()) : aVar.mo12353T();
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, String str) {
            cVar.mo12377Y(str);
        }
    }

    /* renamed from: y2.n$f0 */
    class C4437f0 extends C4233w<AtomicInteger> {
        C4437f0() {
        }

        /* renamed from: f */
        public AtomicInteger mo4624c(C2488a aVar) {
            try {
                return new AtomicInteger(aVar.mo12349N());
            } catch (NumberFormatException e) {
                throw new C4223s((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, AtomicInteger atomicInteger) {
            cVar.mo12374V((long) atomicInteger.get());
        }
    }

    /* renamed from: y2.n$g */
    class C4438g extends C4233w<BigDecimal> {
        C4438g() {
        }

        /* renamed from: f */
        public BigDecimal mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo12353T());
            } catch (NumberFormatException e) {
                throw new C4223s((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, BigDecimal bigDecimal) {
            cVar.mo12376X(bigDecimal);
        }
    }

    /* renamed from: y2.n$g0 */
    class C4439g0 extends C4233w<AtomicBoolean> {
        C4439g0() {
        }

        /* renamed from: f */
        public AtomicBoolean mo4624c(C2488a aVar) {
            return new AtomicBoolean(aVar.mo12347H());
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, AtomicBoolean atomicBoolean) {
            cVar.mo12378Z(atomicBoolean.get());
        }
    }

    /* renamed from: y2.n$h */
    class C4440h extends C4233w<BigInteger> {
        C4440h() {
        }

        /* renamed from: f */
        public BigInteger mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            try {
                return new BigInteger(aVar.mo12353T());
            } catch (NumberFormatException e) {
                throw new C4223s((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, BigInteger bigInteger) {
            cVar.mo12376X(bigInteger);
        }
    }

    /* renamed from: y2.n$h0 */
    private static final class C4441h0<T extends Enum<T>> extends C4233w<T> {

        /* renamed from: a */
        private final Map<String, T> f22865a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f22866b = new HashMap();

        /* renamed from: y2.n$h0$a */
        class C4442a implements PrivilegedAction<Void> {

            /* renamed from: a */
            final /* synthetic */ Field f22867a;

            C4442a(Field field) {
                this.f22867a = field;
            }

            /* renamed from: a */
            public Void run() {
                this.f22867a.setAccessible(true);
                return null;
            }
        }

        public C4441h0(Class<T> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new C4442a(field));
                        Enum enumR = (Enum) field.get((Object) null);
                        String name = enumR.name();
                        C4267c cVar = (C4267c) field.getAnnotation(C4267c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String put : cVar.alternate()) {
                                this.f22865a.put(put, enumR);
                            }
                        }
                        this.f22865a.put(name, enumR);
                        this.f22866b.put(enumR, name);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: f */
        public T mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return (Enum) this.f22865a.get(aVar.mo12353T());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, T t) {
            cVar.mo12377Y(t == null ? null : this.f22866b.get(t));
        }
    }

    /* renamed from: y2.n$i */
    class C4443i extends C4233w<StringBuilder> {
        C4443i() {
        }

        /* renamed from: f */
        public StringBuilder mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return new StringBuilder(aVar.mo12353T());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, StringBuilder sb) {
            cVar.mo12377Y(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: y2.n$j */
    class C4444j extends C4233w<StringBuffer> {
        C4444j() {
        }

        /* renamed from: f */
        public StringBuffer mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return new StringBuffer(aVar.mo12353T());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, StringBuffer stringBuffer) {
            cVar.mo12377Y(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: y2.n$k */
    class C4445k extends C4233w<Class> {
        C4445k() {
        }

        /* renamed from: f */
        public Class mo4624c(C2488a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: y2.n$l */
    class C4446l extends C4233w<URL> {
        C4446l() {
        }

        /* renamed from: f */
        public URL mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            String T = aVar.mo12353T();
            if ("null".equals(T)) {
                return null;
            }
            return new URL(T);
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, URL url) {
            cVar.mo12377Y(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: y2.n$m */
    class C4447m extends C4233w<URI> {
        C4447m() {
        }

        /* renamed from: f */
        public URI mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            try {
                String T = aVar.mo12353T();
                if ("null".equals(T)) {
                    return null;
                }
                return new URI(T);
            } catch (URISyntaxException e) {
                throw new C4216l((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, URI uri) {
            cVar.mo12377Y(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: y2.n$n */
    class C4448n extends C4233w<InetAddress> {
        C4448n() {
        }

        /* renamed from: f */
        public InetAddress mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return InetAddress.getByName(aVar.mo12353T());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, InetAddress inetAddress) {
            cVar.mo12377Y(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: y2.n$o */
    class C4449o extends C4233w<UUID> {
        C4449o() {
        }

        /* renamed from: f */
        public UUID mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return UUID.fromString(aVar.mo12353T());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, UUID uuid) {
            cVar.mo12377Y(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: y2.n$p */
    class C4450p extends C4233w<Currency> {
        C4450p() {
        }

        /* renamed from: f */
        public Currency mo4624c(C2488a aVar) {
            return Currency.getInstance(aVar.mo12353T());
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Currency currency) {
            cVar.mo12377Y(currency.getCurrencyCode());
        }
    }

    /* renamed from: y2.n$q */
    class C4451q extends C4233w<Calendar> {
        C4451q() {
        }

        /* renamed from: f */
        public Calendar mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            aVar.mo12359h();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.mo12354V() != C2490b.END_OBJECT) {
                String P = aVar.mo12351P();
                int N = aVar.mo12349N();
                if ("year".equals(P)) {
                    i = N;
                } else if ("month".equals(P)) {
                    i2 = N;
                } else if ("dayOfMonth".equals(P)) {
                    i3 = N;
                } else if ("hourOfDay".equals(P)) {
                    i4 = N;
                } else if ("minute".equals(P)) {
                    i5 = N;
                } else if ("second".equals(P)) {
                    i6 = N;
                }
            }
            aVar.mo12364w();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.mo12369H();
                return;
            }
            cVar.mo12382n();
            cVar.mo12368F("year");
            cVar.mo12374V((long) calendar.get(1));
            cVar.mo12368F("month");
            cVar.mo12374V((long) calendar.get(2));
            cVar.mo12368F("dayOfMonth");
            cVar.mo12374V((long) calendar.get(5));
            cVar.mo12368F("hourOfDay");
            cVar.mo12374V((long) calendar.get(11));
            cVar.mo12368F("minute");
            cVar.mo12374V((long) calendar.get(12));
            cVar.mo12368F("second");
            cVar.mo12374V((long) calendar.get(13));
            cVar.mo12384w();
        }
    }

    /* renamed from: y2.n$r */
    class C4452r extends C4233w<Locale> {
        C4452r() {
        }

        /* renamed from: f */
        public Locale mo4624c(C2488a aVar) {
            Locale locale;
            String str = null;
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo12353T(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return locale;
            }
            locale = new Locale(nextToken, nextToken2, str);
            return locale;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Locale locale) {
            cVar.mo12377Y(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: y2.n$s */
    class C4453s extends C4233w<C4215k> {
        C4453s() {
        }

        /* renamed from: f */
        public C4215k mo4624c(C2488a aVar) {
            if (aVar instanceof C4405f) {
                return ((C4405f) aVar).mo16023i0();
            }
            switch (C4461z.f22881a[aVar.mo12354V().ordinal()]) {
                case 1:
                    return new C4220p((Number) new C4329g(aVar.mo12353T()));
                case 2:
                    return new C4220p(Boolean.valueOf(aVar.mo12347H()));
                case 3:
                    return new C4220p(aVar.mo12353T());
                case 4:
                    aVar.mo12352R();
                    return C4217m.f22503a;
                case 5:
                    C4212h hVar = new C4212h();
                    aVar.mo12357d();
                    while (aVar.mo12344B()) {
                        hVar.mo15747p(mo4624c(aVar));
                    }
                    aVar.mo12363v();
                    return hVar;
                case 6:
                    C4218n nVar = new C4218n();
                    aVar.mo12359h();
                    while (aVar.mo12344B()) {
                        nVar.mo15761p(aVar.mo12351P(), mo4624c(aVar));
                    }
                    aVar.mo12364w();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, C4215k kVar) {
            if (kVar == null || kVar.mo15753m()) {
                cVar.mo12369H();
            } else if (kVar.mo15755o()) {
                C4220p j = kVar.mo15751j();
                if (j.mo15773w()) {
                    cVar.mo12376X(j.mo15771t());
                } else if (j.mo15772u()) {
                    cVar.mo12378Z(j.mo15767p());
                } else {
                    cVar.mo12377Y(j.mo15746k());
                }
            } else if (kVar.mo15752l()) {
                cVar.mo12381m();
                Iterator<C4215k> it = kVar.mo15749h().iterator();
                while (it.hasNext()) {
                    mo4625e(cVar, it.next());
                }
                cVar.mo12383v();
            } else if (kVar.mo15754n()) {
                cVar.mo12382n();
                for (Map.Entry next : kVar.mo15750i().mo15762q()) {
                    cVar.mo12368F((String) next.getKey());
                    mo4625e(cVar, (C4215k) next.getValue());
                }
                cVar.mo12384w();
            } else {
                throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
            }
        }
    }

    /* renamed from: y2.n$t */
    class C4454t implements C4235x {
        C4454t() {
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [c3.a<T>, c3.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> p149v2.C4233w<T> create(p149v2.C4203e r2, p021c3.C1439a<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.mo4848c()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                y2.n$h0 r2 = new y2.n$h0
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p167y2.C4425n.C4454t.create(v2.e, c3.a):v2.w");
        }
    }

    /* renamed from: y2.n$u */
    class C4455u extends C4233w<BitSet> {
        C4455u() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.mo12349N() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet mo4624c(p028d3.C2488a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo12357d()
                d3.b r1 = r8.mo12354V()
                r2 = 0
                r3 = r2
            L_0x000e:
                d3.b r4 = p028d3.C2490b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = p167y2.C4425n.C4461z.f22881a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.mo12353T()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = r2
                goto L_0x0069
            L_0x0030:
                v2.s r8 = new v2.s
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0047:
                v2.s r8 = new v2.s
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.mo12347H()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.mo12349N()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                d3.b r1 = r8.mo12354V()
                goto L_0x000e
            L_0x0075:
                r8.mo12363v()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p167y2.C4425n.C4455u.mo4624c(d3.a):java.util.BitSet");
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, BitSet bitSet) {
            cVar.mo12381m();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.mo12374V(bitSet.get(i) ? 1 : 0);
            }
            cVar.mo12383v();
        }
    }

    /* renamed from: y2.n$v */
    class C4456v implements C4235x {

        /* renamed from: f */
        final /* synthetic */ Class f22869f;

        /* renamed from: g */
        final /* synthetic */ C4233w f22870g;

        C4456v(Class cls, C4233w wVar) {
            this.f22869f = cls;
            this.f22870g = wVar;
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            if (aVar.mo4848c() == this.f22869f) {
                return this.f22870g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f22869f.getName() + ",adapter=" + this.f22870g + "]";
        }
    }

    /* renamed from: y2.n$w */
    class C4457w implements C4235x {

        /* renamed from: f */
        final /* synthetic */ Class f22871f;

        /* renamed from: g */
        final /* synthetic */ Class f22872g;

        /* renamed from: h */
        final /* synthetic */ C4233w f22873h;

        C4457w(Class cls, Class cls2, C4233w wVar) {
            this.f22871f = cls;
            this.f22872g = cls2;
            this.f22873h = wVar;
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            Class<? super T> c = aVar.mo4848c();
            if (c == this.f22871f || c == this.f22872g) {
                return this.f22873h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f22872g.getName() + "+" + this.f22871f.getName() + ",adapter=" + this.f22873h + "]";
        }
    }

    /* renamed from: y2.n$x */
    class C4458x implements C4235x {

        /* renamed from: f */
        final /* synthetic */ Class f22874f;

        /* renamed from: g */
        final /* synthetic */ Class f22875g;

        /* renamed from: h */
        final /* synthetic */ C4233w f22876h;

        C4458x(Class cls, Class cls2, C4233w wVar) {
            this.f22874f = cls;
            this.f22875g = cls2;
            this.f22876h = wVar;
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            Class<? super T> c = aVar.mo4848c();
            if (c == this.f22874f || c == this.f22875g) {
                return this.f22876h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f22874f.getName() + "+" + this.f22875g.getName() + ",adapter=" + this.f22876h + "]";
        }
    }

    /* renamed from: y2.n$y */
    class C4459y implements C4235x {

        /* renamed from: f */
        final /* synthetic */ Class f22877f;

        /* renamed from: g */
        final /* synthetic */ C4233w f22878g;

        /* renamed from: y2.n$y$a */
        class C4460a extends C4233w<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f22879a;

            C4460a(Class cls) {
                this.f22879a = cls;
            }

            /* renamed from: c */
            public T1 mo4624c(C2488a aVar) {
                T1 c = C4459y.this.f22878g.mo4624c(aVar);
                if (c == null || this.f22879a.isInstance(c)) {
                    return c;
                }
                throw new C4223s("Expected a " + this.f22879a.getName() + " but was " + c.getClass().getName());
            }

            /* renamed from: e */
            public void mo4625e(C2491c cVar, T1 t1) {
                C4459y.this.f22878g.mo4625e(cVar, t1);
            }
        }

        C4459y(Class cls, C4233w wVar) {
            this.f22877f = cls;
            this.f22878g = wVar;
        }

        public <T2> C4233w<T2> create(C4203e eVar, C1439a<T2> aVar) {
            Class<? super T2> c = aVar.mo4848c();
            if (!this.f22877f.isAssignableFrom(c)) {
                return null;
            }
            return new C4460a(c);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f22877f.getName() + ",adapter=" + this.f22878g + "]";
        }
    }

    /* renamed from: y2.n$z */
    static /* synthetic */ class C4461z {

        /* renamed from: a */
        static final /* synthetic */ int[] f22881a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d3.b[] r0 = p028d3.C2490b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22881a = r0
                d3.b r1 = p028d3.C2490b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x001d }
                d3.b r1 = p028d3.C2490b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d3.b r1 = p028d3.C2490b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d3.b r1 = p028d3.C2490b.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x003e }
                d3.b r1 = p028d3.C2490b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x0049 }
                d3.b r1 = p028d3.C2490b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x0054 }
                d3.b r1 = p028d3.C2490b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x0060 }
                d3.b r1 = p028d3.C2490b.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x006c }
                d3.b r1 = p028d3.C2490b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f22881a     // Catch:{ NoSuchFieldError -> 0x0078 }
                d3.b r1 = p028d3.C2490b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p167y2.C4425n.C4461z.<clinit>():void");
        }
    }

    static {
        C4233w<Class> b = new C4445k().mo15780b();
        f22839a = b;
        f22840b = m27134b(Class.class, b);
        C4233w<BitSet> b2 = new C4455u().mo15780b();
        f22841c = b2;
        f22842d = m27134b(BitSet.class, b2);
        C4427a0 a0Var = new C4427a0();
        f22843e = a0Var;
        f22845g = m27133a(Boolean.TYPE, Boolean.class, a0Var);
        C4431c0 c0Var = new C4431c0();
        f22846h = c0Var;
        f22847i = m27133a(Byte.TYPE, Byte.class, c0Var);
        C4433d0 d0Var = new C4433d0();
        f22848j = d0Var;
        f22849k = m27133a(Short.TYPE, Short.class, d0Var);
        C4435e0 e0Var = new C4435e0();
        f22850l = e0Var;
        f22851m = m27133a(Integer.TYPE, Integer.class, e0Var);
        C4233w<AtomicInteger> b3 = new C4437f0().mo15780b();
        f22852n = b3;
        f22853o = m27134b(AtomicInteger.class, b3);
        C4233w<AtomicBoolean> b4 = new C4439g0().mo15780b();
        f22854p = b4;
        f22855q = m27134b(AtomicBoolean.class, b4);
        C4233w<AtomicIntegerArray> b5 = new C4426a().mo15780b();
        f22856r = b5;
        f22857s = m27134b(AtomicIntegerArray.class, b5);
        C4434e eVar = new C4434e();
        f22861w = eVar;
        f22862x = m27133a(Character.TYPE, Character.class, eVar);
        C4436f fVar = new C4436f();
        f22863y = fVar;
        f22817B = m27134b(String.class, fVar);
        C4443i iVar = new C4443i();
        f22818C = iVar;
        f22819D = m27134b(StringBuilder.class, iVar);
        C4444j jVar = new C4444j();
        f22820E = jVar;
        f22821F = m27134b(StringBuffer.class, jVar);
        C4446l lVar = new C4446l();
        f22822G = lVar;
        f22823H = m27134b(URL.class, lVar);
        C4447m mVar = new C4447m();
        f22824I = mVar;
        f22825J = m27134b(URI.class, mVar);
        C4448n nVar = new C4448n();
        f22826K = nVar;
        f22827L = m27136d(InetAddress.class, nVar);
        C4449o oVar = new C4449o();
        f22828M = oVar;
        f22829N = m27134b(UUID.class, oVar);
        C4233w<Currency> b6 = new C4450p().mo15780b();
        f22830O = b6;
        f22831P = m27134b(Currency.class, b6);
        C4451q qVar = new C4451q();
        f22832Q = qVar;
        f22833R = m27135c(Calendar.class, GregorianCalendar.class, qVar);
        C4452r rVar = new C4452r();
        f22834S = rVar;
        f22835T = m27134b(Locale.class, rVar);
        C4453s sVar = new C4453s();
        f22836U = sVar;
        f22837V = m27136d(C4215k.class, sVar);
    }

    /* renamed from: a */
    public static <TT> C4235x m27133a(Class<TT> cls, Class<TT> cls2, C4233w<? super TT> wVar) {
        return new C4457w(cls, cls2, wVar);
    }

    /* renamed from: b */
    public static <TT> C4235x m27134b(Class<TT> cls, C4233w<TT> wVar) {
        return new C4456v(cls, wVar);
    }

    /* renamed from: c */
    public static <TT> C4235x m27135c(Class<TT> cls, Class<? extends TT> cls2, C4233w<? super TT> wVar) {
        return new C4458x(cls, cls2, wVar);
    }

    /* renamed from: d */
    public static <T1> C4235x m27136d(Class<T1> cls, C4233w<T1> wVar) {
        return new C4459y(cls, wVar);
    }
}
