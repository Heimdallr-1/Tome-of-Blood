package com.luiq54.arsoscura;

import com.hollingsworth.arsnouveau.api.ArsNouveauAPI;
import com.hollingsworth.arsnouveau.api.spell.AbstractSpellPart;
import com.luiq54.arsoscura.common.glyphs.AugmentMimic;
import com.luiq54.arsoscura.common.glyphs.EffectSigilGenerate;
import com.luiq54.arsoscura.common.glyphs.MethodSigil;

import java.util.ArrayList;
import java.util.List;

public class ArsNouveauRegistry {

    public static List<AbstractSpellPart> registeredSpells = new ArrayList<>(); //this will come handy for datagen

    public static void registerGlyphs() {
//        register(EffectLifeSuck.INSTANCE);
        register(EffectSigilGenerate.INSTANCE);
        register(MethodSigil.INSTANCE);
        register(AugmentMimic.INSTANCE);
    }

    public static void registerSounds() {
    }

    public static void register(AbstractSpellPart spellPart) {
        ArsNouveauAPI.getInstance().registerSpell(spellPart);
        registeredSpells.add(spellPart);
    }

}
