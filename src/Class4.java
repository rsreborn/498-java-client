/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4
{
	static Class72[] aClass72Array85 = new Class72[4];
	static int anInt86;
	static RSString aClass16_87;
	static int anInt88;
	static int anInt89 = 0;
	static RSString aClass16_90;
	static RSString aClass16_91;
	static RSString aClass16_92;
	private static RSString aClass16_93;
	static int anInt94;
	static int anInt95;
	static int anInt96 = 2;
	static int anInt97;
	static int[][] anIntArrayArray98;
	static RSString aClass16_99;
	static boolean aBoolean100;
	private static RSString aClass16_101;
	
	static final void method57(int i, boolean bool) {
		anInt94++;
		Class48.method1150((byte) -123);
		Class100.anInt1686++;
		if (Class100.anInt1686 >= 50 || bool) {
			if (i != 56) {
				method57(-92, true);
			}
			Class100.anInt1686 = 0;
			do {
				if (!Class23_Sub4_Sub7.aBoolean3012 && Class23_Sub24.aClass34_2440 != null) {
					Class63.anInt987++;
					Class23_Sub7.aClass23_Sub5_Sub1_2202.writeOpcode(56, 2976);
					try {
						Class23_Sub24.aClass34_2440.method977(30000, Class23_Sub7.aClass23_Sub5_Sub1_2202.pos, 0, Class23_Sub7.aClass23_Sub5_Sub1_2202.payload);
						Class23_Sub7.aClass23_Sub5_Sub1_2202.pos = 0;
					} catch (java.io.IOException ioexception) {
						Class23_Sub4_Sub7.aBoolean3012 = true;
						break;
					}
					break;
				}
			} while (false);
		}
	}
	
	static final void method58(int i, int i_0_) {
		if (i_0_ >= -106) {
			aClass16_87 = null;
		}
		if (Class23_Sub4_Sub18.anIntArray3183 == null || Class23_Sub4_Sub18.anIntArray3183.length < i) {
			Class23_Sub4_Sub18.anIntArray3183 = new int[i];
		}
		anInt95++;
	}
	
	public static void method59(int i) {
		anIntArrayArray98 = null;
		aClass16_93 = null;
		aClass16_91 = null;
		aClass16_87 = null;
		aClass16_101 = null;
		aClass72Array85 = null;
		aClass16_92 = null;
		aClass16_90 = null;
		if (i >= -94) {
			method57(-96, false);
		}
		aClass16_99 = null;
	}
	
	static final void method60(int i) {
		if (i != 11980) {
			method57(2, false);
		}
		anInt86++;
		for (int i_1_ = 0; i_1_ < 100; i_1_++)
			Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_1_] = true;
	}
	
	static final void method61(int i) {
		anInt97++;
		for (int i_2_ = -1; (Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
			int i_3_;
			if ((i_2_ ^ 0xffffffff) == 0) {
				i_3_ = 2047;
			} else {
				i_3_ = Class23_Sub13_Sub3.anIntArray3700[i_2_];
			}
			Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
			if (class38_sub7_sub2 != null && (class38_sub7_sub2.anInt2639 ^ 0xffffffff) < -1) {
				class38_sub7_sub2.anInt2639--;
				if (class38_sub7_sub2.anInt2639 == 0) {
					class38_sub7_sub2.aClass16_2670 = null;
				}
			}
		}
		for (int i_4_ = i; (i_4_ ^ 0xffffffff) > (Class23_Sub4_Sub18.anInt3191 ^ 0xffffffff); i_4_++) {
			int i_5_ = Class23_Sub4_Sub17.anIntArray3170[i_4_];
			Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_5_];
			if (class38_sub7_sub1 != null && (class38_sub7_sub1.anInt2639 ^ 0xffffffff) < -1) {
				class38_sub7_sub1.anInt2639--;
				if ((class38_sub7_sub1.anInt2639 ^ 0xffffffff) == -1) {
					class38_sub7_sub1.aClass16_2670 = null;
				}
			}
		}
	}
	
	static {
		anInt88 = -1;
		aClass16_87 = Class38_Sub6.method1076((byte) 86, "und loggen sich dann erneut ein)3");
		aClass16_93 = Class38_Sub6.method1076((byte) 86, "Please wait)3)3)3");
		aClass16_91 = Class38_Sub6.method1076((byte) 86, "Abbrechen");
		aClass16_92 = aClass16_93;
		aBoolean100 = false;
		aClass16_101 = Class38_Sub6.method1076((byte) 86, "green:");
		aClass16_90 = aClass16_101;
		aClass16_99 = aClass16_101;
	}
}
