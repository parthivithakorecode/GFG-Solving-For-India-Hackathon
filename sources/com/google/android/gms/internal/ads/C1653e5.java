package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.e5 */
class C1653e5 extends X509Certificate {

    /* renamed from: f */
    private final X509Certificate f6092f;

    public C1653e5(X509Certificate x509Certificate) {
        this.f6092f = x509Certificate;
    }

    public final void checkValidity() {
        this.f6092f.checkValidity();
    }

    public final void checkValidity(Date date) {
        this.f6092f.checkValidity(date);
    }

    public final int getBasicConstraints() {
        return this.f6092f.getBasicConstraints();
    }

    public final Set<String> getCriticalExtensionOIDs() {
        return this.f6092f.getCriticalExtensionOIDs();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f6092f.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f6092f.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f6092f.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f6092f.getKeyUsage();
    }

    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f6092f.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f6092f.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f6092f.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f6092f.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f6092f.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f6092f.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f6092f.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f6092f.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f6092f.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f6092f.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f6092f.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() {
        return this.f6092f.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f6092f.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f6092f.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f6092f.toString();
    }

    public final void verify(PublicKey publicKey) {
        this.f6092f.verify(publicKey);
    }

    public final void verify(PublicKey publicKey, String str) {
        this.f6092f.verify(publicKey, str);
    }
}
