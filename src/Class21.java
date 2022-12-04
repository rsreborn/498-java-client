/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class21
{
	static int anInt335;
	static int anInt336;
	static long aLong337;
	static Object anObject338 = new Object();
	static int anInt339;
	static int anInt340;
	static RSString aClass16_341 = Class38_Sub6.method1076((byte) 86, "(U0a )2 via: ");
	static int anInt342 = 255;
	
	static final void method223(boolean bool, int i, int i_0_, byte b, int i_1_, Class23_Sub13_Sub22 class23_sub13_sub22) {
		anInt340++;
		if (Class71_Sub3.anInt2741 < 50 && (class23_sub13_sub22.anIntArray4205 != null && class23_sub13_sub22.anIntArray4205.length > i)) {
			int i_2_ = class23_sub13_sub22.anIntArray4205[i];
			if (i_2_ != 0) {
				int i_3_ = i_2_ >> 8;
				int i_4_ = (i_2_ & 0x76) >> 4;
				int i_5_ = 0xf & i_2_;
				if ((i_5_ ^ 0xffffffff) == -1) {
					if (bool) {
						Class24.method917(i_4_, 0, (byte) 65, i_3_);
					}
				} else if ((Class94.anInt1604 ^ 0xffffffff) != -1) {
					Class58.anIntArray904[Class71_Sub3.anInt2741] = i_3_;
					Class23_Sub13_Sub6.anIntArray3738[Class71_Sub3.anInt2741] = i_4_;
					int i_6_ = (i_0_ + -64) / 128;
					if (b <= 24) {
						method225(47);
					}
					Class23_Sub17.anIntArray2368[Class71_Sub3.anInt2741] = 0;
					Class91.aClass18Array1554[Class71_Sub3.anInt2741] = null;
					int i_7_ = (-64 + i_1_) / 128;
					Class88.anIntArray1497[Class71_Sub3.anInt2741] = i_5_ + ((i_6_ << 16) - -(i_7_ << 8));
					Class71_Sub3.anInt2741++;
				}
			}
		}
	}
	
	static final void method224(int i, int i_8_, int i_9_, int i_10_, byte b) {
		Class20.method210(i_8_, i, i_8_ - -i_10_, i - -i_9_);
		Class76.method1318();
		Class20.method222(i_8_, i, i_10_, i_9_, 0);
		anInt339++;
		if (Class73.anInt1319 >= 100) {
			if (Class56.aClass23_Sub13_Sub10_893 == null) {
				Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1 = new Class23_Sub13_Sub10_Sub1(i_10_, i_9_);
				Class20.method202(class23_sub13_sub10_sub1.anIntArray4502, i_10_, i_9_);
				Class23_Sub4_Sub24.method368(0, 0, i_10_, 1, 0, ISAACCipher.anInt1238, 0, Class38_Sub7.anInt2697, i_9_);
				Class56.aClass23_Sub13_Sub10_893 = class23_sub13_sub10_sub1;
				Class23_Sub13_Sub25.aClass78_4290.method1347((byte) -91);
			}
			Class56.aClass23_Sub13_Sub10_893.method705(i_8_, i);
			int i_11_ = i_8_ + Class33.anInt521 * i_10_ / ISAACCipher.anInt1238;
			if (b > 46) {
				int i_12_ = Class31.anInt488 * i_9_ / Class38_Sub7.anInt2697 + i;
				int i_13_ = Class65.anInt1161 * i_9_ / Class38_Sub7.anInt2697;
				int i_14_ = i_10_ * Class71_Sub2_Sub1.anInt4475 / ISAACCipher.anInt1238;
				Class20.method212(i_11_, i_12_, i_14_, i_13_, 16711680, 128);
				Class20.method215(i_11_, i_12_, i_14_, i_13_, 16711680);
				if ((Class17_Sub1.anInt2002 ^ 0xffffffff) < -1 && Class17_Sub1.anInt2002 % 10 < 5) {
					for (Class23_Sub11 class23_sub11 = (Class23_Sub11) Class17_Sub1.aClass89_1996.method1437(-115); class23_sub11 != null; class23_sub11 = (Class23_Sub11) Class17_Sub1.aClass89_1996.method1431((byte) -89)) {
						if (class23_sub11.anInt2280 == Class92.anInt1560) {
							int i_15_ = i_10_ * class23_sub11.anInt2289 / ISAACCipher.anInt1238 + i_8_;
							int i_16_ = i + class23_sub11.anInt2285 * i_9_ / Class38_Sub7.anInt2697;
							Class20.method222(-2 + i_15_, i_16_ - 2, 4, 4, 16776960);
						}
					}
				}
			}
		}
	}
	
	public static void method225(int i) {
		anObject338 = null;
		if (i <= 9) {
			anObject338 = null;
		}
		aClass16_341 = null;
	}
	
	static final boolean method226(int i, int i_17_, int i_18_, int i_19_) {
		if (!Class19.method199(i, i_17_, i_18_)) {
			return false;
		}
		int i_20_ = i_17_ << 7;
		int i_21_ = i_18_ << 7;
		int i_22_ = Class17.anIntArrayArrayArray301[i][i_17_][i_18_] - 1;
		int i_23_ = i_22_ - 120;
		int i_24_ = i_22_ - 230;
		int i_25_ = i_22_ - 238;
		if (i_19_ < 16) {
			if (i_19_ == 1) {
				if (i_20_ > Class17.anInt311) {
					if (!Class23_Sub13_Sub23.method846(i_20_, i_22_, i_21_)) {
						return false;
					}
					if (!Class23_Sub13_Sub23.method846(i_20_, i_22_, i_21_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!Class23_Sub13_Sub23.method846(i_20_, i_23_, i_21_)) {
						return false;
					}
					if (!Class23_Sub13_Sub23.method846(i_20_, i_23_, i_21_ + 128)) {
						return false;
					}
				}
				if (!Class23_Sub13_Sub23.method846(i_20_, i_24_, i_21_)) {
					return false;
				}
				if (!Class23_Sub13_Sub23.method846(i_20_, i_24_, i_21_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_19_ == 2) {
				if (i_21_ < Class23_Sub4_Sub23.anInt3281) {
					if (!Class23_Sub13_Sub23.method846(i_20_, i_22_, i_21_ + 128)) {
						return false;
					}
					if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_22_, i_21_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!Class23_Sub13_Sub23.method846(i_20_, i_23_, i_21_ + 128)) {
						return false;
					}
					if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_23_, i_21_ + 128)) {
						return false;
					}
				}
				if (!Class23_Sub13_Sub23.method846(i_20_, i_24_, i_21_ + 128)) {
					return false;
				}
				if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_24_, i_21_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_19_ == 4) {
				if (i_20_ < Class17.anInt311) {
					if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_22_, i_21_)) {
						return false;
					}
					if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_22_, i_21_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_23_, i_21_)) {
						return false;
					}
					if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_23_, i_21_ + 128)) {
						return false;
					}
				}
				if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_24_, i_21_)) {
					return false;
				}
				if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_24_, i_21_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_19_ == 8) {
				if (i_21_ > Class23_Sub4_Sub23.anInt3281) {
					if (!Class23_Sub13_Sub23.method846(i_20_, i_22_, i_21_)) {
						return false;
					}
					if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_22_, i_21_)) {
						return false;
					}
				}
				if (i > 0) {
					if (!Class23_Sub13_Sub23.method846(i_20_, i_23_, i_21_)) {
						return false;
					}
					if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_23_, i_21_)) {
						return false;
					}
				}
				if (!Class23_Sub13_Sub23.method846(i_20_, i_24_, i_21_)) {
					return false;
				}
				if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_24_, i_21_)) {
					return false;
				}
				return true;
			}
		}
		if (!Class23_Sub13_Sub23.method846(i_20_ + 64, i_25_, i_21_ + 64)) {
			return false;
		}
		if (i_19_ == 16) {
			if (!Class23_Sub13_Sub23.method846(i_20_, i_24_, i_21_ + 128)) {
				return false;
			}
			return true;
		}
		if (i_19_ == 32) {
			if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_24_, i_21_ + 128)) {
				return false;
			}
			return true;
		}
		if (i_19_ == 64) {
			if (!Class23_Sub13_Sub23.method846(i_20_ + 128, i_24_, i_21_)) {
				return false;
			}
			return true;
		}
		if (i_19_ == 128) {
			if (!Class23_Sub13_Sub23.method846(i_20_, i_24_, i_21_)) {
				return false;
			}
			return true;
		}
		return true;
	}
}
