package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class mr3 {
    /* renamed from: a */
    static String m13469a(kr3 kr3, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m13472d(kr3, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m13470b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m13470b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m13470b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(us3.m18038a(uo3.m17970K((String) obj)));
                sb.append('\"');
            } else if (obj instanceof uo3) {
                sb.append(": \"");
                sb.append(us3.m18038a((uo3) obj));
                sb.append('\"');
            } else if (obj instanceof aq3) {
                sb.append(" {");
                m13472d((aq3) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m13470b(sb, i4, "key", entry.getKey());
                m13470b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: c */
    private static final String m13471c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static void m13472d(kr3 kr3, StringBuilder sb, int i) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : kr3.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m13470b(sb, i, m13471c(concat), aq3.m6216t(method2, kr3, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m13470b(sb, i, m13471c(concat2), aq3.m6216t(method3, kr3, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object t = aq3.m6216t(method4, kr3, new Object[0]);
                    if (method5 == null) {
                        if (t instanceof Boolean) {
                            if (!((Boolean) t).booleanValue()) {
                            }
                        } else if (t instanceof Integer) {
                            if (((Integer) t).intValue() == 0) {
                            }
                        } else if (t instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) t).floatValue()) == 0) {
                            }
                        } else if (!(t instanceof Double)) {
                            if (t instanceof String) {
                                obj = "";
                            } else if (t instanceof uo3) {
                                obj = uo3.f15667g;
                            } else if (t instanceof kr3) {
                                if (t == ((kr3) t).mo5389a()) {
                                }
                            } else if ((t instanceof Enum) && ((Enum) t).ordinal() == 0) {
                            }
                            if (t.equals(obj)) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) t).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) aq3.m6216t(method5, kr3, new Object[0])).booleanValue()) {
                    }
                    m13470b(sb, i, m13471c(concat3), t);
                }
            }
        }
        if (!(kr3 instanceof yp3)) {
            xs3 xs3 = ((aq3) kr3).zzc;
            if (xs3 != null) {
                xs3.mo11915g(sb, i);
                return;
            }
            return;
        }
        yp3 yp3 = (yp3) kr3;
        throw null;
    }
}
