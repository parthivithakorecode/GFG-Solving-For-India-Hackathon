package androidx.media;

import androidx.versionedparcelable.C1210a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1210a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3041a = (AudioAttributesImpl) aVar.mo4198v(audioAttributesCompat.f3041a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1210a aVar) {
        aVar.mo4200x(false, false);
        aVar.mo4179M(audioAttributesCompat.f3041a, 1);
    }
}
