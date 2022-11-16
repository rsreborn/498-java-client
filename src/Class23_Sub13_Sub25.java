/* Class23_Sub13_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub25 extends Class23_Sub13
{
	static int anInt4282;
	static short[] aShortArray4283;
	protected Class38 aClass38_4284;
	static int anInt4285;
	static int anInt4286;
	static int anInt4287;
	static RSString aClass16_4288 = Class38_Sub6.method1076((byte) 86, "null");
	static int anInt4289;
	static Class78 aClass78_4290;
	static int anInt4291;
	static int anInt4292;
	static Class105 aClass105_4293;
	static boolean aBoolean4294;
	static int anInt4295;
	static RSString aClass16_4296;
	
	static final void method854(byte b, boolean bool) {
		anInt4287++;
		for (int i = 0; Class23_Sub4_Sub18.anInt3191 > i; i++) {
			Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[Class23_Sub4_Sub17.anIntArray3170[i]];
			long l = 0x20000000L | (long) Class23_Sub4_Sub17.anIntArray3170[i] << 32;
			if (class38_sub7_sub1 != null && class38_sub7_sub1.method1082((byte) -108) && !class38_sub7_sub1.aClass23_Sub13_Sub20_4373.aBoolean4160 != bool && class38_sub7_sub1.aClass23_Sub13_Sub20_4373.method820(0)) {
				int i_0_ = class38_sub7_sub1.anInt2674 >> 7;
				int i_1_ = class38_sub7_sub1.anInt2659 >> 7;
				if (i_0_ >= 0 && i_0_ < 104 && i_1_ >= 0 && i_1_ < 104) {
					if (class38_sub7_sub1.anInt2668 == 1 && (class38_sub7_sub1.anInt2674 & 0x7f) == 64 && (0x7f & class38_sub7_sub1.anInt2659) == 64) {
						if ((Class23_Sub13_Sub26.anInt4297 ^ 0xffffffff) == (Class38_Sub7_Sub1.anIntArrayArray4367[i_0_][i_1_] ^ 0xffffffff)) {
							continue;
						}
						Class38_Sub7_Sub1.anIntArrayArray4367[i_0_][i_1_] = Class23_Sub13_Sub26.anInt4297;
					}
					if (!class38_sub7_sub1.aClass23_Sub13_Sub20_4373.aBoolean4169) {
						l |= ~0x7fffffffffffffffL;
					}
					class38_sub7_sub1.anInt2656 = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, (-1 + class38_sub7_sub1.anInt2668) * 64 + class38_sub7_sub1.anInt2674, -64 - (-(class38_sub7_sub1.anInt2668 * 64) - class38_sub7_sub1.anInt2659), (byte) -76);
					Class38.method993(Class23_Sub13_Sub11.anInt3916, class38_sub7_sub1.anInt2674, class38_sub7_sub1.anInt2659, class38_sub7_sub1.anInt2656, -4 + 64 * class38_sub7_sub1.anInt2668, class38_sub7_sub1, class38_sub7_sub1.anInt2680, l, class38_sub7_sub1.aBoolean2645);
				}
			}
		}
		if (b <= 10) {
			aClass78_4290 = null;
		}
	}
	
	Class23_Sub13_Sub25(Class38 class38) {
		aClass38_4284 = class38;
	}
	
	static final void method855(int i, Class38_Sub7 class38_sub7) {
		anInt4291++;
		class38_sub7.anInt2634 = class38_sub7.anInt2635;
		if (class38_sub7.anInt2660 == 0) {
			class38_sub7.anInt2632 = 0;
		} else {
			if ((class38_sub7.anInt2693 ^ 0xffffffff) != 0 && (class38_sub7.anInt2706 ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub22 class23_sub13_sub22 = Class7.method90(class38_sub7.anInt2693, (byte) 87);
				if (class38_sub7.anInt2640 > 0 && (class23_sub13_sub22.anInt4227 ^ 0xffffffff) == -1) {
					class38_sub7.anInt2632++;
					return;
				}
				if (class38_sub7.anInt2640 <= 0 && (class23_sub13_sub22.anInt4219 ^ 0xffffffff) == -1) {
					class38_sub7.anInt2632++;
					return;
				}
			}
			int i_2_ = class38_sub7.anInt2674;
			int i_3_ = class38_sub7.anInt2659;
			int i_4_ = 64 * class38_sub7.anInt2668 + class38_sub7.anIntArray2663[class38_sub7.anInt2660 + -1] * 128;
			int i_5_ = 64 * class38_sub7.anInt2668 + class38_sub7.anIntArray2694[class38_sub7.anInt2660 - 1] * 128;
			if (i_4_ - i_2_ > 256 || -i_2_ + i_4_ < -256 || i_5_ - i_3_ > 256 || -i_3_ + i_5_ < -256) {
				class38_sub7.anInt2659 = i_5_;
				class38_sub7.anInt2674 = i_4_;
			} else {
				if (i_4_ <= i_2_) {
					if ((i_2_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
						if (i_5_ > i_3_) {
							class38_sub7.anInt2682 = 768;
						} else if (i_5_ >= i_3_) {
							class38_sub7.anInt2682 = 512;
						} else {
							class38_sub7.anInt2682 = 256;
						}
					} else if (i_5_ <= i_3_) {
						if (i_5_ < i_3_) {
							class38_sub7.anInt2682 = 0;
						}
					} else {
						class38_sub7.anInt2682 = 1024;
					}
				} else if (i_3_ >= i_5_) {
					if ((i_3_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff)) {
						class38_sub7.anInt2682 = 1536;
					} else {
						class38_sub7.anInt2682 = 1792;
					}
				} else {
					class38_sub7.anInt2682 = 1280;
				}
				int i_6_ = class38_sub7.anInt2655;
				int i_7_ = 4;
				int i_8_ = 0x7ff & -class38_sub7.anInt2680 + class38_sub7.anInt2682;
				if (i_8_ > 1024) {
					i_8_ -= 2048;
				}
				if (i_8_ >= -256 && i_8_ <= 256) {
					i_6_ = class38_sub7.anInt2641;
				} else if (i_8_ >= 256 && i_8_ < 768) {
					i_6_ = class38_sub7.anInt2678;
				} else if (i_8_ >= -768 && i_8_ <= -256) {
					i_6_ = class38_sub7.anInt2700;
				}
				if (i_6_ == -1) {
					i_6_ = class38_sub7.anInt2641;
				}
				boolean bool = true;
				class38_sub7.anInt2634 = i_6_;
				if (class38_sub7 instanceof Class38_Sub7_Sub1) {
					bool = ((Class38_Sub7_Sub1) class38_sub7).aClass23_Sub13_Sub20_4373.aBoolean4178;
				}
				if (!bool) {
					if (class38_sub7.anInt2660 > 1) {
						i_7_ = 6;
					}
					if (class38_sub7.anInt2660 > 2) {
						i_7_ = 8;
					}
					if (class38_sub7.anInt2632 > 0 && class38_sub7.anInt2660 > 1) {
						i_7_ = 8;
						class38_sub7.anInt2632--;
					}
				} else {
					if ((class38_sub7.anInt2680 ^ 0xffffffff) != (class38_sub7.anInt2682 ^ 0xffffffff) && (class38_sub7.anInt2686 ^ 0xffffffff) == 0 && class38_sub7.anInt2630 != 0) {
						i_7_ = 2;
					}
					if (class38_sub7.anInt2660 > 2) {
						i_7_ = 6;
					}
					if (class38_sub7.anInt2660 > 3) {
						i_7_ = 8;
					}
					if (class38_sub7.anInt2632 > 0 && class38_sub7.anInt2660 > 1) {
						class38_sub7.anInt2632--;
						i_7_ = 8;
					}
				}
				if (class38_sub7.aBooleanArray2718[class38_sub7.anInt2660 + -1]) {
					i_7_ <<= 1;
				}
				if ((i_5_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					class38_sub7.anInt2659 += i_7_;
					if (class38_sub7.anInt2659 > i_5_) {
						class38_sub7.anInt2659 = i_5_;
					}
				} else if (i_3_ > i_5_) {
					class38_sub7.anInt2659 -= i_7_;
					if ((class38_sub7.anInt2659 ^ 0xffffffff) > (i_5_ ^ 0xffffffff)) {
						class38_sub7.anInt2659 = i_5_;
					}
				}
				if (i != 2) {
					aShortArray4283 = null;
				}
				if (i_7_ >= 8 && class38_sub7.anInt2641 == class38_sub7.anInt2634 && (class38_sub7.anInt2673 ^ 0xffffffff) != 0) {
					class38_sub7.anInt2634 = class38_sub7.anInt2673;
				}
				if ((i_4_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)) {
					if ((i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
						class38_sub7.anInt2674 -= i_7_;
						if (class38_sub7.anInt2674 < i_4_) {
							class38_sub7.anInt2674 = i_4_;
						}
					}
				} else {
					class38_sub7.anInt2674 += i_7_;
					if ((i_4_ ^ 0xffffffff) > (class38_sub7.anInt2674 ^ 0xffffffff)) {
						class38_sub7.anInt2674 = i_4_;
					}
				}
				if ((i_4_ ^ 0xffffffff) == (class38_sub7.anInt2674 ^ 0xffffffff) && class38_sub7.anInt2659 == i_5_) {
					class38_sub7.anInt2660--;
					if (class38_sub7.anInt2640 > 0) {
						class38_sub7.anInt2640--;
					}
				}
			}
		}
	}
	
	public static void method856(byte b) {
		aClass105_4293 = null;
		aClass16_4288 = null;
		aClass78_4290 = null;
		aClass16_4296 = null;
		aShortArray4283 = null;
		int i = -47 / ((-48 - b) / 63);
	}
	
	static final void method857(int i, Class72 class72, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		anInt4292++;
		if (i_9_ >= -79) {
			anInt4289 = -67;
		}
		long l = 0L;
		int i_14_ = -1;
		if (i_10_ == 0) {
			l = client.method35(i_13_, i, i_12_);
		}
		if (i_10_ == 1) {
			l = Class23_Sub13_Sub3.method611(i_13_, i, i_12_);
		}
		boolean bool = false;
		if (i_10_ == 2) {
			l = Class87_Sub3.method1416(i_13_, i, i_12_);
		}
		if (i_10_ == 3) {
			l = Class107.method1584(i_13_, i, i_12_);
		}
		boolean bool_15_ = false;
		if (l != 0L) {
			i_14_ = 0x7fffffff & (int) (l >>> 32);
			Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_14_, -21035);
			int i_16_ = (0x7df06 & (int) l) >> 14;
			int i_17_ = (0x39a584 & (int) l) >> 20;
			if (i_10_ == 0) {
				Class54.method1174(i_13_, i, i_12_);
				if (class23_sub13_sub7.anInt3806 != 0) {
					class72.method1295(true, class23_sub13_sub7.aBoolean3763, i, i_16_, i_17_, i_12_);
				}
			}
			if (i_10_ == 1) {
				Class44.method1127(i_13_, i, i_12_);
			}
			if (i_10_ == 2) {
				Class23_Sub13_Sub11.method731(i_13_, i, i_12_);
				if (class23_sub13_sub7.anInt3806 != 0 && i - -class23_sub13_sub7.anInt3752 < 104 && i_12_ - -class23_sub13_sub7.anInt3752 < 104 && i + class23_sub13_sub7.anInt3754 < 104 && i_12_ + class23_sub13_sub7.anInt3754 < 104) {
					class72.method1299(i, class23_sub13_sub7.anInt3752, 31317, class23_sub13_sub7.aBoolean3763, class23_sub13_sub7.anInt3754, i_17_, i_12_);
				}
			}
			if (i_10_ == 3) {
				Class47.method1145(i_13_, i, i_12_);
				if (class23_sub13_sub7.anInt3806 == 1) {
					class72.method1308(i, i_12_, 7446);
				}
			}
		}
	}
	
	static {
		aShortArray4283 = new short[] { 2, 4, 25, 44, 3, 22, 16, 41 };
		aClass16_4296 = Class38_Sub6.method1076((byte) 86, "Lade Sprites )2 ");
	}
}
