package com.google.android.gms.internal.ads;

public final class dv3 {

    /* renamed from: j */
    public static final dv3 f5937j = new dv3(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    public static final dv3 f5938k = new dv3(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    public static final dv3 f5939l = new dv3(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    public static final dv3 f5940m = new dv3(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    public final double f5941a;

    /* renamed from: b */
    public final double f5942b;

    /* renamed from: c */
    public final double f5943c;

    /* renamed from: d */
    public final double f5944d;

    /* renamed from: e */
    public final double f5945e;

    /* renamed from: f */
    public final double f5946f;

    /* renamed from: g */
    public final double f5947g;

    /* renamed from: h */
    public final double f5948h;

    /* renamed from: i */
    public final double f5949i;

    public dv3(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f5941a = d5;
        this.f5942b = d6;
        this.f5943c = d7;
        this.f5944d = d;
        this.f5945e = d2;
        this.f5946f = d3;
        this.f5947g = d4;
        this.f5948h = d8;
        this.f5949i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dv3.class != obj.getClass()) {
            return false;
        }
        dv3 dv3 = (dv3) obj;
        return Double.compare(dv3.f5944d, this.f5944d) == 0 && Double.compare(dv3.f5945e, this.f5945e) == 0 && Double.compare(dv3.f5946f, this.f5946f) == 0 && Double.compare(dv3.f5947g, this.f5947g) == 0 && Double.compare(dv3.f5948h, this.f5948h) == 0 && Double.compare(dv3.f5949i, this.f5949i) == 0 && Double.compare(dv3.f5941a, this.f5941a) == 0 && Double.compare(dv3.f5942b, this.f5942b) == 0 && Double.compare(dv3.f5943c, this.f5943c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f5941a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f5942b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f5943c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f5944d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f5945e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f5946f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f5947g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f5948h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f5949i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f5937j)) {
            return "Rotate 0°";
        }
        if (equals(f5938k)) {
            return "Rotate 90°";
        }
        if (equals(f5939l)) {
            return "Rotate 180°";
        }
        if (equals(f5940m)) {
            return "Rotate 270°";
        }
        double d = this.f5941a;
        double d2 = this.f5942b;
        double d3 = this.f5943c;
        double d4 = this.f5944d;
        double d5 = this.f5945e;
        double d6 = this.f5946f;
        double d7 = this.f5947g;
        double d8 = this.f5948h;
        double d9 = this.f5949i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
