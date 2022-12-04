/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class88
{
	static int[] anIntArray1497 = new int[50];
	static RSString aClass16_1498;
	static int anInt1499;
	static int anInt1500;
	static long aLong1501;
	private static RSString aClass16_1502 = Class38_Sub6.method1076((byte) 86, "and choose the (Wcreate account(W");
	static int anInt1503 = 0;
	static int anInt1504;
	static RSString aClass16_1505 = aClass16_1502;
	static int anInt1506;
	static int[] anIntArray1507;
	
	public static void method1429(int i) {
		anIntArray1507 = null;
		if (i < 56) {
			aLong1501 = 72L;
		}
		aClass16_1502 = null;
		aClass16_1505 = null;
		anIntArray1497 = null;
		aClass16_1498 = null;
	}
	
	static final boolean method1430(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, int i_10_) {
		anInt1500++;
		for (int i_11_ = 0; i_11_ < 104; i_11_++) {
			for (int i_12_ = 0; i_12_ < 104; i_12_++) {
				Class23_Sub4_Sub28.anIntArrayArray3346[i_11_][i_12_] = 0;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_11_][i_12_] = 99999999;
			}
		}
		Class23_Sub4_Sub28.anIntArrayArray3346[i_3_][i_2_] = 99;
		int i_13_ = i_3_;
		int i_14_ = i_2_;
		Class23_Sub4_Sub29.anIntArrayArray3368[i_3_][i_2_] = 0;
		int i_15_ = 0;
		int i_16_ = 0;
		Class23_Sub13_Sub9.anIntArray3859[i_16_] = i_3_;
		if (i_1_ != -29517) {
			method1430(12, 31, 78, 70, -97, 24, 32, -16, 108, -4, 39, false, -31);
		}
		Class23_Sub4_Sub22.anIntArray3260[i_16_++] = i_2_;
		int[][] is = Class4.aClass72Array85[ItemDefinition.anInt3916].anIntArrayArray1290;
		boolean bool_17_ = false;
	while_127_:
		while ((i_16_ ^ 0xffffffff) != (i_15_ ^ 0xffffffff)) {
			i_14_ = Class23_Sub4_Sub22.anIntArray3260[i_15_];
			i_13_ = Class23_Sub13_Sub9.anIntArray3859[i_15_];
			i_15_ = 0xfff & i_15_ - -1;
			if ((i_13_ ^ 0xffffffff) == (i_7_ ^ 0xffffffff) && (i_6_ ^ 0xffffffff) == (i_14_ ^ 0xffffffff)) {
				bool_17_ = true;
				break;
			}
			if (i_5_ != 0) {
				if (i_5_ >= 5 && i_5_ != 10 || !Class4.aClass72Array85[ItemDefinition.anInt3916].method1305((byte) 89, -1 + i_5_, i_0_, i_7_, i_14_, i_4_, i_13_, i_6_)) {
					if (i_5_ < 10 && Class4.aClass72Array85[ItemDefinition.anInt3916].method1303(i_7_, (byte) 69, i_14_, i_13_, i_6_, i_0_, i_5_ + -1, i_4_)) {
						bool_17_ = true;
						break;
					}
				} else {
					bool_17_ = true;
					break;
				}
			}
			if ((i_9_ ^ 0xffffffff) != -1 && (i_8_ ^ 0xffffffff) != -1 && Class4.aClass72Array85[ItemDefinition.anInt3916].method1290(i_6_, i_7_, i_13_, i_9_, i_4_, i_14_, i_10_, i_8_, (byte) -124)) {
				bool_17_ = true;
				break;
			}
			int i_18_ = 1 + Class23_Sub4_Sub29.anIntArrayArray3368[i_13_][i_14_];
		while_120_:
			do {
				if (i_13_ > 0 && (Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_13_][i_14_] ^ 0xffffffff) == -1 && (0x12c010e & is[i_13_ + -1][i_14_] ^ 0xffffffff) == -1 && (0x12c0138 & is[i_13_ - 1][i_14_ - -i_4_ + -1]) == 0) {
					for (int i_19_ = 1; i_19_ < i_4_ - 1; i_19_++) {
						if ((is[-1 + i_13_][i_14_ + i_19_] & 0x12c013e) != 0) {
							break while_120_;
						}
					}
					Class23_Sub13_Sub9.anIntArray3859[i_16_] = i_13_ + -1;
					Class23_Sub4_Sub22.anIntArray3260[i_16_] = i_14_;
					i_16_ = 0xfff & 1 + i_16_;
					Class23_Sub4_Sub28.anIntArrayArray3346[i_13_ - 1][i_14_] = 2;
					Class23_Sub4_Sub29.anIntArrayArray3368[i_13_ - 1][i_14_] = i_18_;
				}
			} while (false);
		while_121_:
			do {
				if (i_13_ < 102 && Class23_Sub4_Sub28.anIntArrayArray3346[i_13_ - -1][i_14_] == 0 && (is[i_13_ - -i_4_][i_14_] & 0x12c0183) == 0 && (is[i_4_ + i_13_][i_14_ + (i_4_ - 1)] & 0x12c01e0) == 0) {
					for (int i_20_ = 1; i_20_ < -1 + i_4_; i_20_++) {
						if ((is[i_4_ + i_13_][i_20_ + i_14_] & 0x12c01e3 ^ 0xffffffff) != -1) {
							break while_121_;
						}
					}
					Class23_Sub13_Sub9.anIntArray3859[i_16_] = 1 + i_13_;
					Class23_Sub4_Sub22.anIntArray3260[i_16_] = i_14_;
					i_16_ = i_16_ - -1 & 0xfff;
					Class23_Sub4_Sub28.anIntArrayArray3346[i_13_ - -1][i_14_] = 8;
					Class23_Sub4_Sub29.anIntArrayArray3368[1 + i_13_][i_14_] = i_18_;
				}
			} while (false);
		while_122_:
			do {
				if (i_14_ > 0 && Class23_Sub4_Sub28.anIntArrayArray3346[i_13_][-1 + i_14_] == 0 && (is[i_13_][-1 + i_14_] & 0x12c010e ^ 0xffffffff) == -1 && (0x12c0183 & is[-1 + i_4_ + i_13_][-1 + i_14_]) == 0) {
					for (int i_21_ = 1; i_21_ < i_4_ - 1; i_21_++) {
						if ((0x12c018f & is[i_13_ - -i_21_][i_14_ + -1] ^ 0xffffffff) != -1) {
							break while_122_;
						}
					}
					Class23_Sub13_Sub9.anIntArray3859[i_16_] = i_13_;
					Class23_Sub4_Sub22.anIntArray3260[i_16_] = i_14_ + -1;
					Class23_Sub4_Sub28.anIntArrayArray3346[i_13_][i_14_ - 1] = 1;
					i_16_ = 1 + i_16_ & 0xfff;
					Class23_Sub4_Sub29.anIntArrayArray3368[i_13_][i_14_ - 1] = i_18_;
				}
			} while (false);
		while_123_:
			do {
				if (i_14_ < 102 && Class23_Sub4_Sub28.anIntArrayArray3346[i_13_][1 + i_14_] == 0 && (0x12c0138 & is[i_13_][i_14_ + i_4_]) == 0 && (is[i_4_ + i_13_ - 1][i_4_ + i_14_] & 0x12c01e0) == 0) {
					for (int i_22_ = 1; i_22_ < -1 + i_4_; i_22_++) {
						if ((is[i_22_ + i_13_][i_4_ + i_14_] & 0x12c01f8 ^ 0xffffffff) != -1) {
							break while_123_;
						}
					}
					Class23_Sub13_Sub9.anIntArray3859[i_16_] = i_13_;
					Class23_Sub4_Sub22.anIntArray3260[i_16_] = i_14_ + 1;
					i_16_ = 1 + i_16_ & 0xfff;
					Class23_Sub4_Sub28.anIntArrayArray3346[i_13_][i_14_ + 1] = 4;
					Class23_Sub4_Sub29.anIntArrayArray3368[i_13_][1 + i_14_] = i_18_;
				}
			} while (false);
		while_124_:
			do {
				if (i_13_ > 0 && i_14_ > 0 && Class23_Sub4_Sub28.anIntArrayArray3346[i_13_ - 1][i_14_ + -1] == 0 && (is[i_13_ + -1][i_4_ + (i_14_ - 2)] & 0x12c0138) == 0 && (is[i_13_ - 1][-1 + i_14_] & 0x12c010e ^ 0xffffffff) == -1 && (0x12c0183 & is[i_4_ + (-1 + (i_13_ - 1))][i_14_ + -1] ^ 0xffffffff) == -1) {
					for (int i_23_ = 1; i_23_ < -1 + i_4_; i_23_++) {
						if ((0x12c013e & is[i_13_ - 1][i_23_ + -1 + i_14_]) != 0 || (0x12c018f & is[i_23_ + -1 + i_13_][-1 + i_14_] ^ 0xffffffff) != -1) {
							break while_124_;
						}
					}
					Class23_Sub13_Sub9.anIntArray3859[i_16_] = -1 + i_13_;
					Class23_Sub4_Sub22.anIntArray3260[i_16_] = i_14_ - 1;
					Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_13_][-1 + i_14_] = 3;
					Class23_Sub4_Sub29.anIntArrayArray3368[-1 + i_13_][-1 + i_14_] = i_18_;
					i_16_ = 1 + i_16_ & 0xfff;
				}
			} while (false);
		while_125_:
			do {
				if (i_13_ < 102 && i_14_ > 0 && (Class23_Sub4_Sub28.anIntArrayArray3346[1 + i_13_][i_14_ - 1] ^ 0xffffffff) == -1 && (0x12c010e & is[i_13_ - -1][-1 + i_14_]) == 0 && (is[i_4_ + i_13_][-1 + i_14_] & 0x12c0183 ^ 0xffffffff) == -1 && (is[i_13_ - -i_4_][i_4_ + i_14_ + -1 - 1] & 0x12c01e0) == 0) {
					for (int i_24_ = 1; i_24_ < -1 + i_4_; i_24_++) {
						if ((0x12c01e3 & is[i_4_ + i_13_][i_14_ + (-1 - -i_24_)]) != 0 || (is[1 + i_13_ - -i_24_][i_14_ + -1] & 0x12c018f ^ 0xffffffff) != -1) {
							break while_125_;
						}
					}
					Class23_Sub13_Sub9.anIntArray3859[i_16_] = 1 + i_13_;
					Class23_Sub4_Sub22.anIntArray3260[i_16_] = -1 + i_14_;
					Class23_Sub4_Sub28.anIntArrayArray3346[i_13_ + 1][-1 + i_14_] = 9;
					Class23_Sub4_Sub29.anIntArrayArray3368[i_13_ + 1][-1 + i_14_] = i_18_;
					i_16_ = 1 + i_16_ & 0xfff;
				}
			} while (false);
		while_126_:
			do {
				if (i_13_ > 0 && i_14_ < 102 && (Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_13_][1 + i_14_] ^ 0xffffffff) == -1 && (0x12c010e & is[-1 + i_13_][i_14_ + 1]) == 0 && (is[-1 + i_13_][i_14_ + i_4_] & 0x12c0138 ^ 0xffffffff) == -1 && (is[i_13_][i_14_ - -i_4_] & 0x12c01e0) == 0) {
					for (int i_25_ = 1; i_4_ - 1 > i_25_; i_25_++) {
						if ((0x12c013e & is[i_13_ + -1][i_25_ + 1 + i_14_]) != 0 || (is[i_13_ + (-1 + i_25_)][i_4_ + i_14_] & 0x12c01f8) != 0) {
							break while_126_;
						}
					}
					Class23_Sub13_Sub9.anIntArray3859[i_16_] = i_13_ + -1;
					Class23_Sub4_Sub22.anIntArray3260[i_16_] = i_14_ - -1;
					Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_13_][i_14_ - -1] = 6;
					Class23_Sub4_Sub29.anIntArrayArray3368[i_13_ + -1][1 + i_14_] = i_18_;
					i_16_ = 1 + i_16_ & 0xfff;
				}
			} while (false);
			if (i_13_ < 102 && i_14_ < 102 && (Class23_Sub4_Sub28.anIntArrayArray3346[1 + i_13_][1 + i_14_] ^ 0xffffffff) == -1 && (is[i_13_ + 1][i_4_ + i_14_] & 0x12c0138) == 0 && (is[i_13_ - -i_4_][i_14_ - -i_4_] & 0x12c01e0 ^ 0xffffffff) == -1 && (0x12c0183 & is[i_13_ + i_4_][1 + i_14_]) == 0) {
				for (int i_26_ = 1; i_4_ + -1 > i_26_; i_26_++) {
					if ((0x12c01f8 & is[i_13_ + 1 - -i_26_][i_4_ + i_14_]) != 0 || (is[i_4_ + i_13_][1 + i_14_ - -i_26_] & 0x12c01e3 ^ 0xffffffff) != -1) {
						continue while_127_;
					}
				}
				Class23_Sub13_Sub9.anIntArray3859[i_16_] = 1 + i_13_;
				Class23_Sub4_Sub22.anIntArray3260[i_16_] = i_14_ + 1;
				i_16_ = 0xfff & 1 + i_16_;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_13_ - -1][1 + i_14_] = 12;
				Class23_Sub4_Sub29.anIntArrayArray3368[1 + i_13_][1 + i_14_] = i_18_;
			}
		}
		Class78.anInt1417 = 0;
		if (!bool_17_) {
			if (bool) {
				int i_27_ = 1000;
				int i_28_ = 10;
				int i_29_ = 100;
				for (int i_30_ = i_7_ + -i_28_; (i_28_ + i_7_ ^ 0xffffffff) <= (i_30_ ^ 0xffffffff); i_30_++) {
					for (int i_31_ = i_6_ + -i_28_; i_28_ + i_6_ >= i_31_; i_31_++) {
						if ((i_30_ ^ 0xffffffff) <= -1 && i_31_ >= 0 && i_30_ < 104 && i_31_ < 104 && Class23_Sub4_Sub29.anIntArrayArray3368[i_30_][i_31_] < 100) {
							int i_32_ = 0;
							int i_33_ = 0;
							if ((i_30_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
								i_32_ = i_7_ + -i_30_;
							} else if (i_30_ > -1 + (i_7_ + i_9_)) {
								i_32_ = i_30_ - i_7_ + (-i_9_ - -1);
							}
							if ((i_31_ ^ 0xffffffff) <= (i_6_ ^ 0xffffffff)) {
								if (i_8_ + (i_6_ - 1) < i_31_) {
									i_33_ = -i_8_ + (-i_6_ + (1 + i_31_));
								}
							} else {
								i_33_ = -i_31_ + i_6_;
							}
							int i_34_ = i_32_ * i_32_ - -(i_33_ * i_33_);
							if (i_34_ < i_27_ || i_27_ == i_34_ && (Class23_Sub4_Sub29.anIntArrayArray3368[i_30_][i_31_] ^ 0xffffffff) > (i_29_ ^ 0xffffffff)) {
								i_27_ = i_34_;
								i_14_ = i_31_;
								i_13_ = i_30_;
								i_29_ = Class23_Sub4_Sub29.anIntArrayArray3368[i_30_][i_31_];
							}
						}
					}
				}
				if (i_27_ == 1000) {
					return false;
				}
				if ((i_13_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff) && (i_14_ ^ 0xffffffff) == (i_2_ ^ 0xffffffff)) {
					return false;
				}
				Class78.anInt1417 = 1;
			} else {
				return false;
			}
		}
		i_15_ = 0;
		Class23_Sub13_Sub9.anIntArray3859[i_15_] = i_13_;
		Class23_Sub4_Sub22.anIntArray3260[i_15_++] = i_14_;
		int i_36_;
		int i_35_ = i_36_ = Class23_Sub4_Sub28.anIntArrayArray3346[i_13_][i_14_];
		while (i_13_ != i_3_ || i_14_ != i_2_) {
			if ((i_35_ ^ 0xffffffff) != (i_36_ ^ 0xffffffff)) {
				i_36_ = i_35_;
				Class23_Sub13_Sub9.anIntArray3859[i_15_] = i_13_;
				Class23_Sub4_Sub22.anIntArray3260[i_15_++] = i_14_;
			}
			if ((i_35_ & 0x1) == 0) {
				if ((i_35_ & 0x4) != 0) {
					i_14_--;
				}
			} else {
				i_14_++;
			}
			if ((i_35_ & 0x2 ^ 0xffffffff) != -1) {
				i_13_++;
			} else if ((0x8 & i_35_) != 0) {
				i_13_--;
			}
			i_35_ = Class23_Sub4_Sub28.anIntArrayArray3346[i_13_][i_14_];
		}
		if (i_15_ > 0) {
			ObjectDefinition.method635(true, i_15_, Class23_Sub4_Sub22.anIntArray3260, Class23_Sub13_Sub9.anIntArray3859, i);
			return true;
		}
		if (i == 1) {
			return false;
		}
		return true;
	}
	
	static {
		aClass16_1498 = Class38_Sub6.method1076((byte) 86, "titlebox");
		anInt1499 = 0;
		anInt1504 = 0;
		anIntArray1507 = new int[] { 0, 1, 2, 3 };
	}
}
