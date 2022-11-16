/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

abstract class Class66
{
	static RSString aClass16_1163 = Class38_Sub6.method1076((byte) 86, " GMT");
	static int anInt1164;
	static int anInt1165;
	static Class81 aClass81_1166;
	static RSString aClass16_1167 = Class38_Sub6.method1076((byte) 86, " Sekunde(Xn(Y -Ubertragen)3");
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array1168;
	static RSString aClass16_1169 = Class38_Sub6.method1076((byte) 86, "oder ung-Ultiges Passwort)3");
	
	abstract int method1236(int i);
	
	static final void method1237(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt1165++;
		Class23_Sub13_Sub6.method632(i_2_, (byte) -30, i_3_, Class4.anIntArrayArray98[i_0_++], i);
		Class23_Sub13_Sub6.method632(i_2_, (byte) -30, i_3_, Class4.anIntArrayArray98[i_1_--], i);
		for (int i_5_ = i_0_; i_1_ >= i_5_; i_5_++) {
			int[] is = Class4.anIntArrayArray98[i_5_];
			is[i] = is[i_2_] = i_3_;
		}
		if (i_4_ != 8622) {
			method1239(-27);
		}
	}
	
	abstract void method1238(Component component, byte b);
	
	public static void method1239(int i) {
		aClass16_1169 = null;
		aClass81_1166 = null;
		aClass23_Sub13_Sub10Array1168 = null;
		aClass16_1167 = null;
		if (i != 3) {
			method1239(-118);
		}
		aClass16_1163 = null;
	}
	
	abstract void method1240(int i, Component component);
	
	static final void method1241(int i, Class64 class64, int i_6_, int i_7_, int i_8_) {
		anInt1164++;
		if (i == 3395) {
			if (Class106.anInt1819 < 3) {
				((Class23_Sub13_Sub10_Sub1) Class23_Sub1.aClass23_Sub13_Sub10_2016).method713(i_8_, i_7_, class64.anInt1128, class64.anInt999, Class23_Sub1.aClass23_Sub13_Sub10_2016.anInt3873 / 2, Class23_Sub1.aClass23_Sub13_Sub10_2016.anInt3869 / 2, Class35.anInt550, 256, class64.anIntArray1064, class64.anIntArray1109);
			} else {
				Class20.method216(i_8_, i_7_, 0, class64.anIntArray1064, class64.anIntArray1109);
			}
			Class36.aBooleanArray571[i_6_] = true;
		}
	}
	
	public Class66() {
		/* empty */
	}
	
	static {
		aClass81_1166 = new Class81(50);
	}
}
