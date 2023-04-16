package androidx.media;

import androidx.versionedparcelable.C1210a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1210a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3046a = aVar.mo4192p(audioAttributesImplBase.f3046a, 1);
        audioAttributesImplBase.f3047b = aVar.mo4192p(audioAttributesImplBase.f3047b, 2);
        audioAttributesImplBase.f3048c = aVar.mo4192p(audioAttributesImplBase.f3048c, 3);
        audioAttributesImplBase.f3049d = aVar.mo4192p(audioAttributesImplBase.f3049d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1210a aVar) {
        aVar.mo4200x(false, false);
        aVar.mo4172F(audioAttributesImplBase.f3046a, 1);
        aVar.mo4172F(audioAttributesImplBase.f3047b, 2);
        aVar.mo4172F(audioAttributesImplBase.f3048c, 3);
        aVar.mo4172F(audioAttributesImplBase.f3049d, 4);
    }
}
