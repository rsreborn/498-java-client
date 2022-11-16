/* Class23_Sub4_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub26 extends Class23_Sub4
{
	static int anInt3315;
	private static RSString aClass16_3316 = Class38_Sub6.method1076((byte) 86, "Free world");
	static CacheArchive aClass105_Sub1_3317;
	static int anInt3318;
	static int anInt3319;
	static RSString aClass16_3320 = aClass16_3316;
	static int anInt3321;
	static int anInt3322;
	static int[] anIntArray3323 = new int[2000];
	static int anInt3324;
	static boolean[] aBooleanArray3325 = new boolean[100];
	
	public static void method377(boolean bool) {
		aClass16_3316 = null;
		if (bool != false) {
			method379(-34);
		}
		aClass16_3320 = null;
		aBooleanArray3325 = null;
		aClass105_Sub1_3317 = null;
		anIntArray3323 = null;
	}
	
	final int[] method260(int i, int i_0_) {
		if (i != 0) {
			anIntArray3323 = null;
		}
		anInt3321++;
		int[] is = aClass99_2115.method1500(i_0_, (byte) -123);
		if (aClass99_2115.aBoolean1681) {
			int[] is_1_ = this.method261(i_0_, 0, (byte) 18);
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_2_++)
				is[i_2_] = -is_1_[i_2_] + 4096;
		}
		return is;
	}
	
	public Class23_Sub4_Sub26() {
		super(1, false);
	}
	
	static final void method378(byte b, boolean bool) {
		if ((Class23_Sub13_Sub17.anInt4077 ^ 0xffffffff) == (Class105.aClass38_Sub7_Sub2_1812.anInt2674 >> 7 ^ 0xffffffff) && (Class105.aClass38_Sub7_Sub2_1812.anInt2659 >> 7 ^ 0xffffffff) == (Class23_Sub13_Sub18.anInt4078 ^ 0xffffffff)) {
			Class23_Sub13_Sub17.anInt4077 = 0;
		}
		int i = Class23_Sub4_Sub11.anInt3067;
		anInt3319++;
		int i_3_ = 127 % ((-61 - b) / 56);
		if (bool) {
			i = 1;
		}
		for (int i_4_ = 0; (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
			long l;
			Class38_Sub7_Sub2 class38_sub7_sub2;
			if (bool) {
				class38_sub7_sub2 = Class105.aClass38_Sub7_Sub2_1812;
				l = 8791798054912L;
			} else {
				l = (long) Class23_Sub13_Sub3.anIntArray3700[i_4_] << 32;
				class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[Class23_Sub13_Sub3.anIntArray3700[i_4_]];
			}
			if (class38_sub7_sub2 != null && class38_sub7_sub2.method1082((byte) -108)) {
				int i_5_ = class38_sub7_sub2.anInt2674 >> 7;
				int i_6_ = class38_sub7_sub2.anInt2659 >> 7;
				class38_sub7_sub2.aBoolean4384 = false;
				if ((Class7.aBoolean170 && Class23_Sub4_Sub11.anInt3067 > 50 || Class23_Sub4_Sub11.anInt3067 > 200) && !bool && class38_sub7_sub2.anInt2635 == class38_sub7_sub2.anInt2634) {
					class38_sub7_sub2.aBoolean4384 = true;
				}
				if (i_5_ >= 0 && i_5_ < 104 && (i_6_ ^ 0xffffffff) <= -1 && i_6_ < 104) {
					if (class38_sub7_sub2.aClass38_Sub1_4402 != null && Class89.anInt1511 >= class38_sub7_sub2.anInt4380 && (class38_sub7_sub2.anInt4411 ^ 0xffffffff) < (Class89.anInt1511 ^ 0xffffffff)) {
						class38_sub7_sub2.aBoolean4384 = false;
						class38_sub7_sub2.anInt2656 = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, class38_sub7_sub2.anInt2674, class38_sub7_sub2.anInt2659, (byte) -54);
						Class23_Sub13_Sub6.method631(Class23_Sub13_Sub11.anInt3916, class38_sub7_sub2.anInt2674, class38_sub7_sub2.anInt2659, class38_sub7_sub2.anInt2656, class38_sub7_sub2, class38_sub7_sub2.anInt2680, l, class38_sub7_sub2.anInt4387, class38_sub7_sub2.anInt4391, class38_sub7_sub2.anInt4390, class38_sub7_sub2.anInt4396);
					} else {
						if ((class38_sub7_sub2.anInt2674 & 0x7f) == 64 && (class38_sub7_sub2.anInt2659 & 0x7f) == 64) {
							if (Class23_Sub13_Sub26.anInt4297 == Class38_Sub7_Sub1.anIntArrayArray4367[i_5_][i_6_]) {
								continue;
							}
							Class38_Sub7_Sub1.anIntArrayArray4367[i_5_][i_6_] = Class23_Sub13_Sub26.anInt4297;
						}
						class38_sub7_sub2.anInt2656 = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, class38_sub7_sub2.anInt2674, class38_sub7_sub2.anInt2659, (byte) 85);
						Class38.method993(Class23_Sub13_Sub11.anInt3916, class38_sub7_sub2.anInt2674, class38_sub7_sub2.anInt2659, class38_sub7_sub2.anInt2656, 60, class38_sub7_sub2, class38_sub7_sub2.anInt2680, l, class38_sub7_sub2.aBoolean2645);
					}
				}
			}
		}
	}
	
	final int[][] method258(int i, byte b) {
		if (b != 9) {
			method378((byte) 96, false);
		}
		anInt3315++;
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (aClass103_2108.aBoolean1733) {
			int[][] is_7_ = this.method256(0, (byte) -128, i);
			int[] is_8_ = is_7_[0];
			int[] is_9_ = is_7_[1];
			int[] is_10_ = is_7_[2];
			int[] is_11_ = is[0];
			int[] is_12_ = is[2];
			int[] is_13_ = is[1];
			for (int i_14_ = 0; Class23_Sub4_Sub33.anInt3428 > i_14_; i_14_++) {
				is_11_[i_14_] = -is_8_[i_14_] + 4096;
				is_13_[i_14_] = 4096 - is_9_[i_14_];
				is_12_[i_14_] = -is_10_[i_14_] + 4096;
			}
		}
		return is;
	}
	
	static final void method379(int i) {
		anInt3324++;
		Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method487(0);
		int i_15_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 126, 8);
		if ((i_15_ ^ 0xffffffff) > (Class23_Sub4_Sub18.anInt3191 ^ 0xffffffff)) {
			for (int i_16_ = i_15_; (i_16_ ^ 0xffffffff) > (Class23_Sub4_Sub18.anInt3191 ^ 0xffffffff); i_16_++)
				Class54.anIntArray857[Class23_Sub4_Sub10.anInt3061++] = Class23_Sub4_Sub17.anIntArray3170[i_16_];
		}
		if (Class23_Sub4_Sub18.anInt3191 < i_15_) {
			throw new RuntimeException("gnpov1");
		}
		Class23_Sub4_Sub18.anInt3191 = 0;
		int i_17_ = 0;
		if (i == 7028) {
			for (/**/; (i_15_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
				int i_18_ = Class23_Sub4_Sub17.anIntArray3170[i_17_];
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_18_];
				int i_19_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 122, 1);
				if (i_19_ == 0) {
					Class23_Sub4_Sub17.anIntArray3170[Class23_Sub4_Sub18.anInt3191++] = i_18_;
					class38_sub7_sub1.anInt2698 = Class89.anInt1511;
				} else {
					int i_20_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 119, 2);
					if (i_20_ == 0) {
						Class23_Sub4_Sub17.anIntArray3170[Class23_Sub4_Sub18.anInt3191++] = i_18_;
						class38_sub7_sub1.anInt2698 = Class89.anInt1511;
						Class94.anIntArray1603[Class23_Sub2.anInt2048++] = i_18_;
					} else if (i_20_ == 1) {
						Class23_Sub4_Sub17.anIntArray3170[Class23_Sub4_Sub18.anInt3191++] = i_18_;
						class38_sub7_sub1.anInt2698 = Class89.anInt1511;
						int i_21_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 126, 3);
						class38_sub7_sub1.method1084(i_21_, false, -30438);
						int i_22_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 120, 1);
						if (i_22_ == 1) {
							Class94.anIntArray1603[Class23_Sub2.anInt2048++] = i_18_;
						}
					} else if (i_20_ == 2) {
						Class23_Sub4_Sub17.anIntArray3170[Class23_Sub4_Sub18.anInt3191++] = i_18_;
						class38_sub7_sub1.anInt2698 = Class89.anInt1511;
						int i_23_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 119, 3);
						class38_sub7_sub1.method1084(i_23_, true, -30438);
						int i_24_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 118, 3);
						class38_sub7_sub1.method1084(i_24_, true, -30438);
						int i_25_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 110, 1);
						if (i_25_ == 1) {
							Class94.anIntArray1603[Class23_Sub2.anInt2048++] = i_18_;
						}
					} else if (i_20_ == 3) {
						Class54.anIntArray857[Class23_Sub4_Sub10.anInt3061++] = i_18_;
					}
				}
			}
		}
	}
	
	final void method255(Buffer class23_sub5, int i, int i_26_) {
		if (i_26_ == 1000) {
			anInt3322++;
			if (i == 0) {
				aBoolean2117 = class23_sub5.method461(-1797813752) == 1;
			}
		}
	}
}
