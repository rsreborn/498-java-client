/* Class38_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38_Sub3 extends Class38
{
	private int anInt2504;
	private int anInt2505;
	static int anInt2506;
	private int anInt2507;
	static int anInt2508;
	private int anInt2509;
	private int anInt2510;
	static int anInt2511;
	private int anInt2512;
	private int anInt2513;
	private int anInt2514 = -32768;
	static int[] anIntArray2515;
	static int anInt2516;
	private int anInt2517;
	private Class23_Sub13_Sub22 aClass23_Sub13_Sub22_2518;
	
	final int method999() {
		anInt2511++;
		return anInt2514;
	}
	
	private final Class38 method1038(int i) {
		anInt2508++;
		boolean bool = Class17.anIntArrayArrayArray301 != Class23_Sub4_Sub12.anIntArrayArrayArray3080;
		ObjectDefinition class23_sub13_sub7 = Class38_Sub2.loadObjectDefinition(anInt2509, -21035);
		if (class23_sub13_sub7.anIntArray3746 != null) {
			class23_sub13_sub7 = class23_sub13_sub7.method646(i ^ ~0x39df4d37);
		}
		if (class23_sub13_sub7 == null) {
			return null;
		}
		if (aClass23_Sub13_Sub22_2518 != null) {
			int i_0_ = -anInt2513 + Class89.anInt1511;
			if (i_0_ > 100 && aClass23_Sub13_Sub22_2518.anInt4223 > 0) {
				int i_1_;
				for (i_1_ = -aClass23_Sub13_Sub22_2518.anInt4223 + aClass23_Sub13_Sub22_2518.anIntArray4203.length; i_1_ > anInt2512 && i_0_ > aClass23_Sub13_Sub22_2518.anIntArray4204[anInt2512]; anInt2512++)
					i_0_ -= aClass23_Sub13_Sub22_2518.anIntArray4204[anInt2512];
				if ((i_1_ ^ 0xffffffff) >= (anInt2512 ^ 0xffffffff)) {
					int i_2_ = 0;
					for (int i_3_ = i_1_; i_3_ < aClass23_Sub13_Sub22_2518.anIntArray4203.length; i_3_++)
						i_2_ += aClass23_Sub13_Sub22_2518.anIntArray4204[i_3_];
					i_0_ %= i_2_;
				}
			}
			while (aClass23_Sub13_Sub22_2518.anIntArray4204[anInt2512] < i_0_) {
				i_0_ -= aClass23_Sub13_Sub22_2518.anIntArray4204[anInt2512];
				anInt2512++;
				if (anInt2512 >= aClass23_Sub13_Sub22_2518.anIntArray4203.length) {
					anInt2512 -= aClass23_Sub13_Sub22_2518.anInt4223;
					if (anInt2512 < 0 || aClass23_Sub13_Sub22_2518.anIntArray4203.length <= anInt2512) {
						aClass23_Sub13_Sub22_2518 = null;
						break;
					}
				}
			}
			anInt2513 = -i_0_ + Class89.anInt1511;
		}
		int i_4_;
		int i_5_;
		if (anInt2507 == 1 || anInt2507 == 3) {
			i_5_ = class23_sub13_sub7.anInt3752;
			i_4_ = class23_sub13_sub7.anInt3754;
		} else {
			i_4_ = class23_sub13_sub7.anInt3752;
			i_5_ = class23_sub13_sub7.anInt3754;
		}
		int i_6_ = anInt2505 - -(i_4_ >> 1);
		if (i != -861382974) {
			anIntArray2515 = null;
		}
		int i_7_ = (i_4_ + 1 >> 1) + anInt2505;
		int i_8_ = (i_4_ << 6) + (anInt2505 << 7);
		int i_9_ = (i_5_ >> 1) + anInt2517;
		int i_10_ = anInt2517 + (i_5_ + 1 >> 1);
		int i_11_ = (i_5_ << 6) + (anInt2517 << 7);
		int[][] is = Class17.anIntArrayArrayArray301[anInt2504];
		int[][] is_12_ = null;
		if (!bool) {
			if (anInt2504 < 3) {
				is_12_ = Class17.anIntArrayArrayArray301[anInt2504 - -1];
			}
		} else {
			is_12_ = Class23_Sub4_Sub12.anIntArrayArrayArray3080[0];
		}
		int i_13_ = is[i_7_][i_9_] + (is[i_6_][i_9_] - -is[i_6_][i_10_] + is[i_7_][i_10_]) >> 2;
		Class23_Sub13_Sub5 class23_sub13_sub5;
		if (aClass23_Sub13_Sub22_2518 == null) {
			class23_sub13_sub5 = class23_sub13_sub7.method636(false, anInt2510, false, is_12_, is, i_11_, i_8_, anInt2507, i_13_);
		} else {
			class23_sub13_sub5 = class23_sub13_sub7.method644(is, i_8_, anInt2507, anInt2512, is_12_, i_13_, anInt2510, i_11_, aClass23_Sub13_Sub22_2518, (byte) -104);
		}
		if (class23_sub13_sub5 == null) {
			return null;
		}
		return class23_sub13_sub5.aClass38_3723;
	}
	
	public static void method1039(int i) {
		anIntArray2515 = null;
		if (i != -1044489951) {
			anIntArray2515 = null;
		}
	}
	
	final void method995(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, long l) {
		anInt2516++;
		Class38 class38 = method1038(-861382974);
		if (class38 != null) {
			class38.method995(i, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, l);
			anInt2514 = class38.method999();
		}
	}
	
	Class38_Sub3(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool, Class38 class38) {
		anInt2509 = i;
		anInt2504 = i_23_;
		anInt2505 = i_24_;
		anInt2510 = i_21_;
		anInt2517 = i_25_;
		anInt2507 = i_22_;
		if (i_26_ != -1) {
			aClass23_Sub13_Sub22_2518 = Class7.method90(i_26_, (byte) 90);
			anInt2512 = 0;
			anInt2513 = Class89.anInt1511 + -1;
			if (aClass23_Sub13_Sub22_2518.anInt4228 == 0 && class38 != null && class38 instanceof Class38_Sub3) {
				Class38_Sub3 class38_sub3_27_ = (Class38_Sub3) class38;
				if (aClass23_Sub13_Sub22_2518 == class38_sub3_27_.aClass23_Sub13_Sub22_2518) {
					anInt2512 = class38_sub3_27_.anInt2512;
					anInt2513 = class38_sub3_27_.anInt2513;
					return;
				}
			}
			if (bool && aClass23_Sub13_Sub22_2518.anInt4223 != -1) {
				anInt2512 = (int) (Math.random() * (double) aClass23_Sub13_Sub22_2518.anIntArray4203.length);
				anInt2513 -= (int) (Math.random() * (double) aClass23_Sub13_Sub22_2518.anIntArray4204[anInt2512]);
			}
		}
	}
}
