/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class35
{
	static int[] anIntArray548;
	static int anInt549;
	static int anInt550;
	static int anInt551;
	static int anInt552;
	static int anInt553;
	static int anInt554;
	static int anInt555;
	static RSString aClass16_556 = Class38_Sub6.method1076((byte) 86, " )2> <col=00ffff>");
	static int[] anIntArray557;
	static int anInt558;
	static int anInt559;
	
	static final Class23_Sub13_Sub6 method978(int i, int i_0_) {
		Class23_Sub13_Sub6 class23_sub13_sub6 = (Class23_Sub13_Sub6) Class40.aClass5_625.method62(116, (long) i_0_);
		if (i >= -48) {
			return null;
		}
		anInt552++;
		if (class23_sub13_sub6 != null) {
			return class23_sub13_sub6;
		}
		byte[] bs = Class17.aClass105_310.method1544(i_0_, 0, 16);
		class23_sub13_sub6 = new Class23_Sub13_Sub6();
		if (bs != null) {
			class23_sub13_sub6.method629((byte) -73, new Buffer(bs));
		}
		Class40.aClass5_625.method67((long) i_0_, class23_sub13_sub6, true);
		return class23_sub13_sub6;
	}
	
	static final void method979(boolean bool) {
		anInt558++;
		boolean bool_1_ = bool;
		while (!bool_1_) {
			bool_1_ = true;
			for (int i = 0; -1 + Class23_Sub13_Sub9.anInt3863 > i; i++) {
				if (Class38_Sub5.aShortArray2603[i] < 1000 && Class38_Sub5.aShortArray2603[i + 1] > 1000) {
					bool_1_ = false;
					RSString class16 = Class98.aClass16Array1655[i];
					Class98.aClass16Array1655[i] = Class98.aClass16Array1655[1 + i];
					Class98.aClass16Array1655[i - -1] = class16;
					RSString class16_2_ = Class23_Sub13_Sub26.aClass16Array4307[i];
					Class23_Sub13_Sub26.aClass16Array4307[i] = Class23_Sub13_Sub26.aClass16Array4307[1 + i];
					Class23_Sub13_Sub26.aClass16Array4307[1 + i] = class16_2_;
					int i_3_ = Class38_Sub2.anIntArray2502[i];
					Class38_Sub2.anIntArray2502[i] = Class38_Sub2.anIntArray2502[i - -1];
					Class38_Sub2.anIntArray2502[i + 1] = i_3_;
					i_3_ = Class23_Sub4_Sub31.anIntArray3399[i];
					Class23_Sub4_Sub31.anIntArray3399[i] = Class23_Sub4_Sub31.anIntArray3399[1 + i];
					Class23_Sub4_Sub31.anIntArray3399[i - -1] = i_3_;
					short s = Class38_Sub5.aShortArray2603[i];
					Class38_Sub5.aShortArray2603[i] = Class38_Sub5.aShortArray2603[1 + i];
					Class38_Sub5.aShortArray2603[i + 1] = s;
					long l = Class82.aLongArray1456[i];
					Class82.aLongArray1456[i] = Class82.aLongArray1456[i - -1];
					Class82.aLongArray1456[1 + i] = l;
				}
			}
		}
	}
	
	static final void method980(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt553++;
		for (int i_9_ = i_8_; i_9_ <= i_6_ + i_8_; i_9_++) {
			for (int i_10_ = i_7_; (i_4_ + i_7_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff); i_10_++) {
				if (i_10_ >= 0 && i_10_ < 104 && i_9_ >= 0 && i_9_ < 104) {
					Class38_Sub7.aByteArrayArrayArray2690[i_5_][i_10_][i_9_] = (byte) 127;
				}
			}
		}
		for (int i_11_ = i_8_; (i_11_ ^ 0xffffffff) > (i_8_ - -i_6_ ^ 0xffffffff); i_11_++) {
			for (int i_12_ = i_7_; i_12_ < i_4_ + i_7_; i_12_++) {
				if ((i_12_ ^ 0xffffffff) <= -1 && i_12_ < 104 && i_11_ >= 0 && i_11_ < 104) {
					Class17.anIntArrayArrayArray301[i_5_][i_12_][i_11_] = i_5_ > 0 ? Class17.anIntArrayArrayArray301[i_5_ + -1][i_12_][i_11_] : 0;
				}
			}
		}
		if ((i_7_ ^ 0xffffffff) < i && i_7_ < 104) {
			for (int i_13_ = 1 + i_8_; i_13_ < i_6_ + i_8_; i_13_++) {
				if ((i_13_ ^ 0xffffffff) <= -1 && i_13_ < 104) {
					Class17.anIntArrayArrayArray301[i_5_][i_7_][i_13_] = Class17.anIntArrayArrayArray301[i_5_][i_7_ - 1][i_13_];
				}
			}
		}
		if (i_8_ > 0 && i_8_ < 104) {
			for (int i_14_ = i_7_ + 1; i_4_ + i_7_ > i_14_; i_14_++) {
				if ((i_14_ ^ 0xffffffff) <= -1 && i_14_ < 104) {
					Class17.anIntArrayArrayArray301[i_5_][i_14_][i_8_] = Class17.anIntArrayArrayArray301[i_5_][i_14_][i_8_ - 1];
				}
			}
		}
		if ((i_7_ ^ 0xffffffff) <= -1 && i_8_ >= 0 && i_7_ < 104 && i_8_ < 104) {
			if (i_5_ != 0) {
				if ((i_7_ ^ 0xffffffff) >= -1 || Class17.anIntArrayArrayArray301[i_5_][-1 + i_7_][i_8_] == Class17.anIntArrayArrayArray301[i_5_ + -1][i_7_ - 1][i_8_]) {
					if (i_8_ > 0 && (Class17.anIntArrayArrayArray301[i_5_ - 1][i_7_][i_8_ - 1] ^ 0xffffffff) != (Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_ + -1] ^ 0xffffffff)) {
						Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_] = Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_ + -1];
					} else if (i_7_ > 0 && (i_8_ ^ 0xffffffff) < -1 && Class17.anIntArrayArrayArray301[i_5_][i_7_ + -1][-1 + i_8_] != Class17.anIntArrayArrayArray301[-1 + i_5_][-1 + i_7_][-1 + i_8_]) {
						Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_] = Class17.anIntArrayArrayArray301[i_5_][i_7_ + -1][i_8_ + -1];
					}
				} else {
					Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_] = Class17.anIntArrayArrayArray301[i_5_][i_7_ + -1][i_8_];
				}
			} else if ((i_7_ ^ 0xffffffff) >= -1 || (Class17.anIntArrayArrayArray301[i_5_][i_7_ + -1][i_8_] ^ 0xffffffff) == -1) {
				if (i_8_ > 0 && (Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_ + -1] ^ 0xffffffff) != -1) {
					Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_] = Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_ - 1];
				} else if (i_7_ > 0 && (i_8_ ^ 0xffffffff) < -1 && Class17.anIntArrayArrayArray301[i_5_][-1 + i_7_][-1 + i_8_] != 0) {
					Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_] = Class17.anIntArrayArrayArray301[i_5_][i_7_ - 1][-1 + i_8_];
				}
			} else {
				Class17.anIntArrayArrayArray301[i_5_][i_7_][i_8_] = Class17.anIntArrayArrayArray301[i_5_][i_7_ - 1][i_8_];
			}
		}
	}
	
	static final RSString method981(byte b, int i) {
		anInt549++;
		if ((i ^ 0xffffffff) > -1000000000) {
			return Class23_Sub4_Sub23.method360((byte) -9, i);
		}
		if (b != 103) {
			method983(71);
		}
		return Class27.aClass16_414;
	}
	
	static final boolean method982(int i, int i_15_, int i_16_, int i_17_, boolean bool, int i_18_, int i_19_, int i_20_, boolean bool_21_, int i_22_, int i_23_, int i_24_) {
		anInt555++;
		for (int i_25_ = 0; i_25_ < 104; i_25_++) {
			for (int i_26_ = 0; i_26_ < 104; i_26_++) {
				Class23_Sub4_Sub28.anIntArrayArray3346[i_25_][i_26_] = 0;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_25_][i_26_] = 99999999;
			}
		}
		Class23_Sub4_Sub28.anIntArrayArray3346[i_18_][i_16_] = 99;
		int i_27_ = i_18_;
		Class23_Sub4_Sub29.anIntArrayArray3368[i_18_][i_16_] = 0;
		int i_28_ = i_16_;
		int i_29_ = 0;
		Class23_Sub13_Sub9.anIntArray3859[i_29_] = i_18_;
		Class23_Sub4_Sub22.anIntArray3260[i_29_++] = i_16_;
		int i_30_ = 0;
		int[][] is = Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].anIntArrayArray1290;
		boolean bool_31_ = bool_21_;
		while (i_30_ != i_29_) {
			i_28_ = Class23_Sub4_Sub22.anIntArray3260[i_30_];
			i_27_ = Class23_Sub13_Sub9.anIntArray3859[i_30_];
			i_30_ = i_30_ + 1 & 0xfff;
			if (i_27_ == i_15_ && i_28_ == i_24_) {
				bool_31_ = true;
				break;
			}
			if (i_23_ != 0) {
				if ((i_23_ < 5 || i_23_ == 10) && Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].method1305((byte) -87, -1 + i_23_, i, i_15_, i_28_, 1, i_27_, i_24_)) {
					bool_31_ = true;
					break;
				}
				if (i_23_ < 10 && Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].method1303(i_15_, (byte) 111, i_28_, i_27_, i_24_, i, i_23_ - 1, 1)) {
					bool_31_ = true;
					break;
				}
			}
			if ((i_19_ ^ 0xffffffff) != -1 && i_22_ != 0 && Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].method1290(i_24_, i_15_, i_27_, i_19_, 1, i_28_, i_20_, i_22_, (byte) -124)) {
				bool_31_ = true;
				break;
			}
			int i_32_ = 1 + Class23_Sub4_Sub29.anIntArrayArray3368[i_27_][i_28_];
			if (i_27_ > 0 && Class23_Sub4_Sub28.anIntArrayArray3346[i_27_ - 1][i_28_] == 0 && (0x12c0108 & is[i_27_ + -1][i_28_]) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_29_] = i_27_ - 1;
				Class23_Sub4_Sub22.anIntArray3260[i_29_] = i_28_;
				i_29_ = 1 + i_29_ & 0xfff;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_27_ - 1][i_28_] = 2;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_27_ + -1][i_28_] = i_32_;
			}
			if (i_27_ < 103 && (Class23_Sub4_Sub28.anIntArrayArray3346[1 + i_27_][i_28_] ^ 0xffffffff) == -1 && (is[i_27_ - -1][i_28_] & 0x12c0180) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_29_] = 1 + i_27_;
				Class23_Sub4_Sub22.anIntArray3260[i_29_] = i_28_;
				i_29_ = 1 + i_29_ & 0xfff;
				Class23_Sub4_Sub28.anIntArrayArray3346[1 + i_27_][i_28_] = 8;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_27_ + 1][i_28_] = i_32_;
			}
			if ((i_28_ ^ 0xffffffff) < -1 && Class23_Sub4_Sub28.anIntArrayArray3346[i_27_][-1 + i_28_] == 0 && (is[i_27_][-1 + i_28_] & 0x12c0102) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_29_] = i_27_;
				Class23_Sub4_Sub22.anIntArray3260[i_29_] = -1 + i_28_;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_27_][-1 + i_28_] = 1;
				i_29_ = 1 + i_29_ & 0xfff;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_27_][-1 + i_28_] = i_32_;
			}
			if (i_28_ < 103 && Class23_Sub4_Sub28.anIntArrayArray3346[i_27_][i_28_ - -1] == 0 && (0x12c0120 & is[i_27_][i_28_ + 1]) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_29_] = i_27_;
				Class23_Sub4_Sub22.anIntArray3260[i_29_] = i_28_ + 1;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_27_][1 + i_28_] = 4;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_27_][1 + i_28_] = i_32_;
				i_29_ = 0xfff & 1 + i_29_;
			}
			if ((i_27_ ^ 0xffffffff) < -1 && (i_28_ ^ 0xffffffff) < -1 && (Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_27_][-1 + i_28_] ^ 0xffffffff) == -1 && (is[-1 + i_27_][i_28_ + -1] & 0x12c010e ^ 0xffffffff) == -1 && (0x12c0108 & is[-1 + i_27_][i_28_]) == 0 && (0x12c0102 & is[i_27_][i_28_ + -1] ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub9.anIntArray3859[i_29_] = i_27_ + -1;
				Class23_Sub4_Sub22.anIntArray3260[i_29_] = -1 + i_28_;
				Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_27_][-1 + i_28_] = 3;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_27_ + -1][-1 + i_28_] = i_32_;
				i_29_ = 0xfff & i_29_ - -1;
			}
			if (i_27_ < 103 && i_28_ > 0 && Class23_Sub4_Sub28.anIntArrayArray3346[i_27_ - -1][-1 + i_28_] == 0 && (is[1 + i_27_][-1 + i_28_] & 0x12c0183) == 0 && (is[i_27_ - -1][i_28_] & 0x12c0180 ^ 0xffffffff) == -1 && (0x12c0102 & is[i_27_][-1 + i_28_]) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_29_] = i_27_ + 1;
				Class23_Sub4_Sub22.anIntArray3260[i_29_] = -1 + i_28_;
				Class23_Sub4_Sub28.anIntArrayArray3346[1 + i_27_][-1 + i_28_] = 9;
				i_29_ = 0xfff & 1 + i_29_;
				Class23_Sub4_Sub29.anIntArrayArray3368[1 + i_27_][-1 + i_28_] = i_32_;
			}
			if (i_27_ > 0 && i_28_ < 103 && (Class23_Sub4_Sub28.anIntArrayArray3346[i_27_ - 1][i_28_ + 1] ^ 0xffffffff) == -1 && (0x12c0138 & is[-1 + i_27_][i_28_ - -1] ^ 0xffffffff) == -1 && (is[-1 + i_27_][i_28_] & 0x12c0108) == 0 && (is[i_27_][i_28_ - -1] & 0x12c0120) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_29_] = i_27_ - 1;
				Class23_Sub4_Sub22.anIntArray3260[i_29_] = 1 + i_28_;
				Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_27_][1 + i_28_] = 6;
				i_29_ = 0xfff & i_29_ - -1;
				Class23_Sub4_Sub29.anIntArrayArray3368[-1 + i_27_][1 + i_28_] = i_32_;
			}
			if (i_27_ < 103 && i_28_ < 103 && (Class23_Sub4_Sub28.anIntArrayArray3346[i_27_ + 1][1 + i_28_] ^ 0xffffffff) == -1 && (is[i_27_ + 1][i_28_ + 1] & 0x12c01e0) == 0 && (0x12c0180 & is[1 + i_27_][i_28_] ^ 0xffffffff) == -1 && (0x12c0120 & is[i_27_][i_28_ - -1] ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub9.anIntArray3859[i_29_] = i_27_ + 1;
				Class23_Sub4_Sub22.anIntArray3260[i_29_] = i_28_ - -1;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_27_ - -1][1 + i_28_] = 12;
				i_29_ = 0xfff & i_29_ - -1;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_27_ - -1][i_28_ - -1] = i_32_;
			}
		}
		Class78.anInt1417 = 0;
		if (!bool_31_) {
			if (bool) {
				int i_33_ = 1000;
				int i_34_ = 100;
				int i_35_ = 10;
				for (int i_36_ = -i_35_ + i_15_; (i_36_ ^ 0xffffffff) >= (i_35_ + i_15_ ^ 0xffffffff); i_36_++) {
					for (int i_37_ = -i_35_ + i_24_; i_37_ <= i_35_ + i_24_; i_37_++) {
						if ((i_36_ ^ 0xffffffff) <= -1 && (i_37_ ^ 0xffffffff) <= -1 && i_36_ < 104 && i_37_ < 104 && Class23_Sub4_Sub29.anIntArrayArray3368[i_36_][i_37_] < 100) {
							int i_38_ = 0;
							if (i_15_ <= i_36_) {
								if (i_36_ > -1 + (i_15_ - -i_19_)) {
									i_38_ = i_36_ + (-i_15_ + -i_19_ + 1);
								}
							} else {
								i_38_ = -i_36_ + i_15_;
							}
							int i_39_ = 0;
							if ((i_37_ ^ 0xffffffff) <= (i_24_ ^ 0xffffffff)) {
								if ((i_37_ ^ 0xffffffff) < (-1 + i_24_ - -i_22_ ^ 0xffffffff)) {
									i_39_ = 1 - (i_24_ - -i_22_) + i_37_;
								}
							} else {
								i_39_ = i_24_ + -i_37_;
							}
							int i_40_ = i_38_ * i_38_ - -(i_39_ * i_39_);
							if (i_33_ > i_40_ || i_33_ == i_40_ && i_34_ > Class23_Sub4_Sub29.anIntArrayArray3368[i_36_][i_37_]) {
								i_27_ = i_36_;
								i_34_ = Class23_Sub4_Sub29.anIntArrayArray3368[i_36_][i_37_];
								i_28_ = i_37_;
								i_33_ = i_40_;
							}
						}
					}
				}
				if (i_33_ == 1000) {
					return false;
				}
				if ((i_18_ ^ 0xffffffff) == (i_27_ ^ 0xffffffff) && i_16_ == i_28_) {
					return false;
				}
				Class78.anInt1417 = 1;
			} else {
				return false;
			}
		}
		i_30_ = 0;
		Class23_Sub13_Sub9.anIntArray3859[i_30_] = i_27_;
		Class23_Sub4_Sub22.anIntArray3260[i_30_++] = i_28_;
		int i_42_;
		int i_41_ = i_42_ = Class23_Sub4_Sub28.anIntArrayArray3346[i_27_][i_28_];
		while (i_27_ != i_18_ || i_28_ != i_16_) {
			if ((i_41_ ^ 0xffffffff) != (i_42_ ^ 0xffffffff)) {
				i_42_ = i_41_;
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = i_27_;
				Class23_Sub4_Sub22.anIntArray3260[i_30_++] = i_28_;
			}
			if ((0x1 & i_41_ ^ 0xffffffff) == -1) {
				if ((0x4 & i_41_ ^ 0xffffffff) != -1) {
					i_28_--;
				}
			} else {
				i_28_++;
			}
			if ((i_41_ & 0x2 ^ 0xffffffff) != -1) {
				i_27_++;
			} else if ((0x8 & i_41_) != 0) {
				i_27_--;
			}
			i_41_ = Class23_Sub4_Sub28.anIntArrayArray3346[i_27_][i_28_];
		}
		if ((i_30_ ^ 0xffffffff) < -1) {
			Class23_Sub13_Sub7.method635(true, i_30_, Class23_Sub4_Sub22.anIntArray3260, Class23_Sub13_Sub9.anIntArray3859, i_17_);
			return true;
		}
		if (i_17_ == 1) {
			return false;
		}
		return true;
	}
	
	public static void method983(int i) {
		if (i == -18540) {
			aClass16_556 = null;
			anIntArray557 = null;
			anIntArray548 = null;
		}
	}
	
	static final void method984(int i, Class72 class72, int i_43_, boolean bool, int i_44_, boolean bool_45_, int i_46_, int i_47_, int i_48_, int i_49_, boolean bool_50_, int i_51_) {
		int i_52_ = -127 % ((-55 - i_47_) / 58);
		anInt551++;
		if (!bool || (Class23_Sub4_Sub30.aByteArrayArrayArray3379[0][i_49_][i] & 0x2) != 0 || (0x10 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[i_44_][i_49_][i] ^ 0xffffffff) == -1 && (RSString.method144(i, 89, i_49_, i_44_) ^ 0xffffffff) == (Class23_Sub4_Sub7.anInt3025 ^ 0xffffffff)) {
			if ((i_44_ ^ 0xffffffff) > (Class28.anInt424 ^ 0xffffffff)) {
				Class28.anInt424 = i_44_;
			}
			Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_51_, -21035);
			int[][] is = Class17.anIntArrayArrayArray301[i_48_];
			int i_53_;
			int i_54_;
			if (i_43_ != 1 && i_43_ != 3) {
				i_53_ = class23_sub13_sub7.anInt3754;
				i_54_ = class23_sub13_sub7.anInt3752;
			} else {
				i_53_ = class23_sub13_sub7.anInt3752;
				i_54_ = class23_sub13_sub7.anInt3754;
			}
			int i_55_;
			int i_56_;
			if (i_54_ + i_49_ <= 104) {
				i_56_ = i_49_ - -(1 + i_54_ >> 1);
				i_55_ = i_49_ - -(i_54_ >> 1);
			} else {
				i_55_ = i_49_;
				i_56_ = 1 + i_49_;
			}
			int i_57_;
			int i_58_;
			if (i_53_ + i <= 104) {
				i_57_ = i - -(1 + i_53_ >> 1);
				i_58_ = i + (i_53_ >> 1);
			} else {
				i_57_ = 1 + i;
				i_58_ = i;
			}
			int i_59_ = (i_49_ << 7) - -(i_54_ << 6);
			int i_60_ = (i << 7) + (i_53_ << 6);
			int i_61_ = is[i_56_][i_57_] + (is[i_55_][i_57_] + is[i_56_][i_58_]) + is[i_55_][i_58_] >> 2;
			int[][] is_62_ = null;
			if (bool_50_) {
				is_62_ = Class23_Sub4_Sub12.anIntArrayArrayArray3080[0];
			} else if (i_48_ < 3) {
				is_62_ = Class17.anIntArrayArrayArray301[1 + i_48_];
			}
			long l = (long) (i_43_ << 20 | (i_46_ << 14 | (i << 7 | i_49_)) | 0x40000000);
			if ((class23_sub13_sub7.anInt3793 ^ 0xffffffff) == -1 || bool_50_) {
				l |= ~0x7fffffffffffffffL;
			}
			if (class23_sub13_sub7.anInt3783 == 1) {
				l |= 0x400000L;
			}
			if (bool_45_ && class23_sub13_sub7.method645(-1)) {
				Class23_Sub19.method881(i_49_, false, i, class23_sub13_sub7, i_44_, i_43_);
			}
			l |= (long) i_51_ << 32;
			if (i_46_ == 22) {
				if (!bool || (class23_sub13_sub7.anInt3793 ^ 0xffffffff) != -1 || class23_sub13_sub7.anInt3806 == 1 || class23_sub13_sub7.aBoolean3785) {
					Class38 class38;
					if ((class23_sub13_sub7.anInt3776 ^ 0xffffffff) != 0 || class23_sub13_sub7.anIntArray3746 != null) {
						class38 = new Class38_Sub3(i_51_, 22, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
					} else {
						Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 22, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
						class38 = class23_sub13_sub5.aClass38_3723;
					}
					Class23_Sub13_Sub21.method830(i_44_, i_49_, i, i_61_, class38, l, class23_sub13_sub7.aBoolean3741);
					if (class23_sub13_sub7.anInt3806 == 1 && class72 != null) {
						class72.method1297(i_49_, -111, i);
					}
				}
			} else if (i_46_ == 10 || i_46_ == 11) {
				Class38 class38;
				if (class23_sub13_sub7.anInt3776 == -1 && class23_sub13_sub7.anIntArray3746 == null) {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 10, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				} else {
					class38 = new Class38_Sub3(i_51_, 10, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				}
				if (class38 != null) {
					boolean bool_63_ = Class91.method1453(i_44_, i_49_, i, i_61_, i_54_, i_53_, class38, i_46_ == 11 ? 256 : 0, l);
					if (class23_sub13_sub7.aBoolean3774 && bool_63_ && bool_45_) {
						int i_64_ = 15;
						if (class38 instanceof Class38_Sub1) {
							i_64_ = ((Class38_Sub1) class38).method1012() / 4;
							if (i_64_ > 30) {
								i_64_ = 30;
							}
						}
						for (int i_65_ = 0; i_54_ >= i_65_; i_65_++) {
							for (int i_66_ = 0; (i_53_ ^ 0xffffffff) <= (i_66_ ^ 0xffffffff); i_66_++) {
								if ((i_64_ ^ 0xffffffff) < (Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_ - -i_65_][i_66_ + i] ^ 0xffffffff)) {
									Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_65_ + i_49_][i_66_ + i] = (byte) i_64_;
								}
							}
						}
					}
				}
				if (class23_sub13_sub7.anInt3806 != 0 && class72 != null) {
					class72.method1293(class23_sub13_sub7.aBoolean3763, i, i_53_, i_54_, 256, i_49_);
				}
			} else if (i_46_ >= 12) {
				Class38 class38;
				if (class23_sub13_sub7.anInt3776 == -1 && class23_sub13_sub7.anIntArray3746 == null) {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, i_46_, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				} else {
					class38 = new Class38_Sub3(i_51_, i_46_, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				}
				Class91.method1453(i_44_, i_49_, i, i_61_, 1, 1, class38, 0, l);
				if (bool_45_ && i_46_ >= 12 && i_46_ <= 17 && i_46_ != 13 && (i_44_ ^ 0xffffffff) < -1) {
					Class54.anIntArrayArrayArray861[i_44_][i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][i], 2340);
				}
				if ((class23_sub13_sub7.anInt3806 ^ 0xffffffff) != -1 && class72 != null) {
					class72.method1293(class23_sub13_sub7.aBoolean3763, i, i_53_, i_54_, 256, i_49_);
				}
			} else if (i_46_ == 0) {
				Class38 class38;
				if (class23_sub13_sub7.anInt3776 == -1 && class23_sub13_sub7.anIntArray3746 == null) {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 0, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				} else {
					class38 = new Class38_Sub3(i_51_, 0, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				}
				Class31.method960(i_44_, i_49_, i, i_61_, class38, null, Class23_Sub13_Sub23.anIntArray4259[i_43_], 0, l);
				if (bool_45_) {
					if (i_43_ == 0) {
						if (class23_sub13_sub7.aBoolean3774) {
							Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_][i] = (byte) 50;
							Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_][i - -1] = (byte) 50;
						}
						if (class23_sub13_sub7.aBoolean3771) {
							Class54.anIntArrayArrayArray861[i_44_][i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][i], 585);
						}
					} else if (i_43_ != 1) {
						if (i_43_ == 2) {
							if (class23_sub13_sub7.aBoolean3774) {
								Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_ + 1][i] = (byte) 50;
								Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_ + 1][1 + i] = (byte) 50;
							}
							if (class23_sub13_sub7.aBoolean3771) {
								Class54.anIntArrayArrayArray861[i_44_][1 + i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][1 + i_49_][i], 585);
							}
						} else if (i_43_ == 3) {
							if (class23_sub13_sub7.aBoolean3774) {
								Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_][i] = (byte) 50;
								Class38_Sub7.aByteArrayArrayArray2690[i_44_][1 + i_49_][i] = (byte) 50;
							}
							if (class23_sub13_sub7.aBoolean3771) {
								Class54.anIntArrayArrayArray861[i_44_][i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][i], 1170);
							}
						}
					} else {
						if (class23_sub13_sub7.aBoolean3774) {
							Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_][1 + i] = (byte) 50;
							Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_ + 1][i - -1] = (byte) 50;
						}
						if (class23_sub13_sub7.aBoolean3771) {
							Class54.anIntArrayArrayArray861[i_44_][i_49_][i - -1] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][i - -1], 1170);
						}
					}
				}
				if (class23_sub13_sub7.anInt3806 != 0 && class72 != null) {
					class72.method1309(class23_sub13_sub7.aBoolean3763, i, i_43_, 60, i_49_, i_46_);
				}
				if (class23_sub13_sub7.anInt3779 != 16) {
					Class72.method1306(i_44_, i_49_, i, class23_sub13_sub7.anInt3779);
				}
			} else if (i_46_ == 1) {
				Class38 class38;
				if ((class23_sub13_sub7.anInt3776 ^ 0xffffffff) != 0 || class23_sub13_sub7.anIntArray3746 != null) {
					class38 = new Class38_Sub3(i_51_, 1, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				} else {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 1, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				}
				Class31.method960(i_44_, i_49_, i, i_61_, class38, null, Class23_Sub4_Sub10.anIntArray3062[i_43_], 0, l);
				if (class23_sub13_sub7.aBoolean3774 && bool_45_) {
					if ((i_43_ ^ 0xffffffff) == -1) {
						Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_][1 + i] = (byte) 50;
					} else if (i_43_ != 1) {
						if (i_43_ == 2) {
							Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_ + 1][i] = (byte) 50;
						} else if (i_43_ == 3) {
							Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_][i] = (byte) 50;
						}
					} else {
						Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_ + 1][i - -1] = (byte) 50;
					}
				}
				if (class23_sub13_sub7.anInt3806 != 0 && class72 != null) {
					class72.method1309(class23_sub13_sub7.aBoolean3763, i, i_43_, -14, i_49_, i_46_);
				}
			} else if (i_46_ == 2) {
				int i_67_ = 0x3 & i_43_ + 1;
				Class38 class38;
				Class38 class38_68_;
				if (class23_sub13_sub7.anInt3776 == -1 && class23_sub13_sub7.anIntArray3746 == null) {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 2, bool_45_, is_62_, is, i_60_, i_59_, 4 + i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
					class23_sub13_sub5 = class23_sub13_sub7.method636(false, 2, bool_45_, is_62_, is, i_60_, i_59_, i_67_, i_61_);
					class38_68_ = class23_sub13_sub5.aClass38_3723;
				} else {
					class38 = new Class38_Sub3(i_51_, 2, i_43_ + 4, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
					class38_68_ = new Class38_Sub3(i_51_, 2, i_67_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				}
				Class31.method960(i_44_, i_49_, i, i_61_, class38, class38_68_, Class23_Sub13_Sub23.anIntArray4259[i_43_], Class23_Sub13_Sub23.anIntArray4259[i_67_], l);
				if (class23_sub13_sub7.aBoolean3771 && bool_45_) {
					if (i_43_ == 0) {
						Class54.anIntArrayArrayArray861[i_44_][i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][i], 585);
						Class54.anIntArrayArrayArray861[i_44_][i_49_][1 + i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][1 + i], 1170);
					} else if (i_43_ != 1) {
						if (i_43_ != 2) {
							if (i_43_ == 3) {
								Class54.anIntArrayArrayArray861[i_44_][i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][i], 1170);
								Class54.anIntArrayArrayArray861[i_44_][i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][i], 585);
							}
						} else {
							Class54.anIntArrayArrayArray861[i_44_][i_49_ + 1][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_ + 1][i], 585);
							Class54.anIntArrayArrayArray861[i_44_][i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][i], 1170);
						}
					} else {
						Class54.anIntArrayArrayArray861[i_44_][i_49_][1 + i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][i_49_][1 + i], 1170);
						Class54.anIntArrayArrayArray861[i_44_][1 + i_49_][i] = Class65.method1230(Class54.anIntArrayArrayArray861[i_44_][1 + i_49_][i], 585);
					}
				}
				if ((class23_sub13_sub7.anInt3806 ^ 0xffffffff) != -1 && class72 != null) {
					class72.method1309(class23_sub13_sub7.aBoolean3763, i, i_43_, 31, i_49_, i_46_);
				}
				if (class23_sub13_sub7.anInt3779 != 16) {
					Class72.method1306(i_44_, i_49_, i, class23_sub13_sub7.anInt3779);
				}
			} else if (i_46_ == 3) {
				Class38 class38;
				if (class23_sub13_sub7.anInt3776 != -1 || class23_sub13_sub7.anIntArray3746 != null) {
					class38 = new Class38_Sub3(i_51_, 3, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				} else {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 3, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				}
				Class31.method960(i_44_, i_49_, i, i_61_, class38, null, Class23_Sub4_Sub10.anIntArray3062[i_43_], 0, l);
				if (class23_sub13_sub7.aBoolean3774 && bool_45_) {
					if ((i_43_ ^ 0xffffffff) == -1) {
						Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_][1 + i] = (byte) 50;
					} else if (i_43_ != 1) {
						if (i_43_ != 2) {
							if (i_43_ == 3) {
								Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_][i] = (byte) 50;
							}
						} else {
							Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_ + 1][i] = (byte) 50;
						}
					} else {
						Class38_Sub7.aByteArrayArrayArray2690[i_44_][i_49_ + 1][i + 1] = (byte) 50;
					}
				}
				if ((class23_sub13_sub7.anInt3806 ^ 0xffffffff) != -1 && class72 != null) {
					class72.method1309(class23_sub13_sub7.aBoolean3763, i, i_43_, 98, i_49_, i_46_);
				}
			} else if (i_46_ == 9) {
				Class38 class38;
				if ((class23_sub13_sub7.anInt3776 ^ 0xffffffff) == 0 && class23_sub13_sub7.anIntArray3746 == null) {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, i_46_, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				} else {
					class38 = new Class38_Sub3(i_51_, i_46_, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				}
				Class91.method1453(i_44_, i_49_, i, i_61_, 1, 1, class38, 0, l);
				if (class23_sub13_sub7.anInt3806 != 0 && class72 != null) {
					class72.method1293(class23_sub13_sub7.aBoolean3763, i, i_53_, i_54_, 256, i_49_);
				}
				if (class23_sub13_sub7.anInt3779 != 16) {
					Class72.method1306(i_44_, i_49_, i, class23_sub13_sub7.anInt3779);
				}
			} else if (i_46_ == 4) {
				Class38 class38;
				if ((class23_sub13_sub7.anInt3776 ^ 0xffffffff) == 0 && class23_sub13_sub7.anIntArray3746 == null) {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 4, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				} else {
					class38 = new Class38_Sub3(i_51_, 4, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				}
				Class23_Sub13_Sub14.method767(i_44_, i_49_, i, i_61_, class38, null, Class23_Sub13_Sub23.anIntArray4259[i_43_], 0, 0, 0, l);
			} else if (i_46_ == 5) {
				int i_69_ = 16;
				long l_70_ = client.method35(i_44_, i_49_, i);
				if (l_70_ != 0L) {
					i_69_ = Class38_Sub2.method1037(0x7fffffff & (int) (l_70_ >>> 32), -21035).anInt3779;
				}
				Class38 class38;
				if (class23_sub13_sub7.anInt3776 != -1 || class23_sub13_sub7.anIntArray3746 != null) {
					class38 = new Class38_Sub3(i_51_, 4, i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				} else {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 4, bool_45_, is_62_, is, i_60_, i_59_, i_43_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				}
				Class23_Sub13_Sub14.method767(i_44_, i_49_, i, i_61_, class38, null, Class23_Sub13_Sub23.anIntArray4259[i_43_], 0, i_69_ * Class23_Sub24.anIntArray2441[i_43_], i_69_ * Class55.anIntArray874[i_43_], l);
			} else if (i_46_ == 6) {
				int i_71_ = 8;
				long l_72_ = client.method35(i_44_, i_49_, i);
				if ((l_72_ ^ 0xffffffffffffffffL) != -1L) {
					i_71_ = Class38_Sub2.method1037((int) (l_72_ >>> 32) & 0x7fffffff, -21035).anInt3779 / 2;
				}
				Class38 class38;
				if (class23_sub13_sub7.anInt3776 != -1 || class23_sub13_sub7.anIntArray3746 != null) {
					class38 = new Class38_Sub3(i_51_, 4, 4 + i_43_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				} else {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 4, bool_45_, is_62_, is, i_60_, i_59_, i_43_ - -4, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				}
				Class23_Sub13_Sub14.method767(i_44_, i_49_, i, i_61_, class38, null, 256, i_43_, i_71_ * Class23_Sub4_Sub17.anIntArray3164[i_43_], Class23_Sub4.anIntArray2114[i_43_] * i_71_, l);
			} else if (i_46_ == 7) {
				int i_73_ = 0x3 & i_43_ - -2;
				Class38 class38;
				if ((class23_sub13_sub7.anInt3776 ^ 0xffffffff) != 0 || class23_sub13_sub7.anIntArray3746 != null) {
					class38 = new Class38_Sub3(i_51_, 4, 4 + i_73_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				} else {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 4, bool_45_, is_62_, is, i_60_, i_59_, 4 + i_73_, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
				}
				Class23_Sub13_Sub14.method767(i_44_, i_49_, i, i_61_, class38, null, 256, i_73_, 0, 0, l);
			} else if (i_46_ == 8) {
				int i_74_ = 8;
				long l_75_ = client.method35(i_44_, i_49_, i);
				if ((l_75_ ^ 0xffffffffffffffffL) != -1L) {
					i_74_ = Class38_Sub2.method1037((int) (l_75_ >>> 32) & 0x7fffffff, -21035).anInt3779 / 2;
				}
				int i_76_ = i_43_ + 2 & 0x3;
				Class38 class38;
				Class38 class38_77_;
				if (class23_sub13_sub7.anInt3776 != -1 || class23_sub13_sub7.anIntArray3746 != null) {
					class38 = new Class38_Sub3(i_51_, 4, i_43_ - -4, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
					class38_77_ = new Class38_Sub3(i_51_, 4, 4 + i_76_, i_48_, i_49_, i, class23_sub13_sub7.anInt3776, class23_sub13_sub7.aBoolean3768, null);
				} else {
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, 4, bool_45_, is_62_, is, i_60_, i_59_, i_43_ - -4, i_61_);
					class38 = class23_sub13_sub5.aClass38_3723;
					class23_sub13_sub5 = class23_sub13_sub7.method636(false, 4, bool_45_, is_62_, is, i_60_, i_59_, i_76_ - -4, i_61_);
					class38_77_ = class23_sub13_sub5.aClass38_3723;
				}
				Class23_Sub13_Sub14.method767(i_44_, i_49_, i, i_61_, class38, class38_77_, 256, i_43_, i_74_ * Class23_Sub4_Sub17.anIntArray3164[i_43_], i_74_ * Class23_Sub4.anIntArray2114[i_43_], l);
			}
		}
	}
	
	static final void method985(int i) {
		anInt559++;
		if (Class23_Sub13_Sub24.anInt4275 == 238) {
			int i_78_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_79_ = Class105.anInt1808 - -(i_78_ & 0x7);
			int i_80_ = Class23_Sub4_Sub7.anInt3026 - -((i_78_ & 0x73) >> 4);
			int i_81_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			if (i_81_ == 65535) {
				i_81_ = -1;
			}
			int i_82_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_83_ = (0xfa & i_82_) >> 4;
			int i_84_ = 0x7 & i_82_;
			int i_85_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			if (i_80_ >= 0 && i_79_ >= 0 && i_80_ < 104 && i_79_ < 104) {
				int i_86_ = i_83_ + 1;
				if ((Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0] ^ 0xffffffff) <= (i_80_ + -i_86_ ^ 0xffffffff) && Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0] <= i_86_ + i_80_ && (Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0] ^ 0xffffffff) <= (-i_86_ + i_79_ ^ 0xffffffff) && i_79_ - -i_86_ >= Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0] && (Class94.anInt1604 ^ 0xffffffff) != -1 && i_84_ > 0 && Class71_Sub3.anInt2741 < 50 && i_81_ != -1) {
					Class58.anIntArray904[Class71_Sub3.anInt2741] = i_81_;
					Class23_Sub13_Sub6.anIntArray3738[Class71_Sub3.anInt2741] = i_84_;
					Class23_Sub17.anIntArray2368[Class71_Sub3.anInt2741] = i_85_;
					Class91.aClass18Array1554[Class71_Sub3.anInt2741] = null;
					Class88.anIntArray1497[Class71_Sub3.anInt2741] = (i_80_ << 16) + ((i_79_ << 8) - -i_83_);
					Class71_Sub3.anInt2741++;
				}
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 125) {
			int i_87_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_88_ = 2 * Class23_Sub4_Sub7.anInt3026 - -((i_87_ & 0xf3) >> 4);
			int i_89_ = 2 * Class105.anInt1808 + (i_87_ & 0xf);
			int i_90_ = i_88_ + Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(-16933672);
			int i_91_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(-16933672) + i_89_;
			int i_92_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method474(true);
			int i_93_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_94_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte() * 4;
			int i_95_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte() * 4;
			int i_96_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_97_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_98_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_99_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			if ((i_88_ ^ 0xffffffff) <= -1 && (i_89_ ^ 0xffffffff) <= -1 && i_88_ < 208 && i_89_ < 208 && (i_90_ ^ 0xffffffff) <= -1 && (i_91_ ^ 0xffffffff) <= -1 && i_90_ < 208 && i_91_ < 208 && i_93_ != 65535) {
				i_90_ = 64 * i_90_;
				i_89_ = 64 * i_89_;
				i_91_ = 64 * i_91_;
				i_88_ *= 64;
				Class38_Sub5 class38_sub5 = new Class38_Sub5(i_93_, Class23_Sub13_Sub11.anInt3916, i_88_, i_89_, -i_94_ + Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_88_, i_89_, (byte) 127), Class89.anInt1511 + i_96_, i_97_ - -Class89.anInt1511, i_98_, i_99_, i_92_, i_95_);
				class38_sub5.method1069(i_96_ - -Class89.anInt1511, i_91_, i_90_, Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_90_, i_91_, (byte) -77) + -i_95_, -18499);
				Class36.aClass89_562.method1439(-124, new Class23_Sub13_Sub3(class38_sub5));
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 138) {
			int i_100_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_101_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 104);
			int i_102_ = Class105.anInt1808 + (i_101_ & 0x7);
			int i_103_ = Class23_Sub4_Sub7.anInt3026 + ((i_101_ & 0x7b) >> 4);
			int i_104_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
			if (i_103_ >= 0 && i_102_ >= 0 && i_103_ < 104 && i_102_ < 104) {
				Class38_Sub2 class38_sub2 = new Class38_Sub2();
				class38_sub2.anInt2495 = i_100_;
				class38_sub2.anInt2499 = i_104_;
				if (Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_103_][i_102_] == null) {
					Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_103_][i_102_] = new Class89();
				}
				Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_103_][i_102_].method1439(-108, new Class23_Sub13_Sub1(class38_sub2));
				Class44.method1129(i_103_, i_102_, (byte) 123);
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 198) {
			int i_105_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_106_ = ((0x77 & i_105_) >> 4) + Class23_Sub4_Sub7.anInt3026;
			int i_107_ = (i_105_ & 0x7) + Class105.anInt1808;
			int i_108_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_109_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_110_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			if (i_106_ >= 0 && i_107_ >= 0 && i_106_ < 104 && i_107_ < 104) {
				Class89 class89 = Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_106_][i_107_];
				if (class89 != null) {
					for (Class23_Sub13_Sub1 class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1437(57); class23_sub13_sub1 != null; class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1431((byte) -89)) {
						Class38_Sub2 class38_sub2 = class23_sub13_sub1.aClass38_Sub2_3668;
						if ((0x7fff & i_108_) == class38_sub2.anInt2495 && (class38_sub2.anInt2499 ^ 0xffffffff) == (i_109_ ^ 0xffffffff)) {
							class38_sub2.anInt2499 = i_110_;
							break;
						}
					}
					Class44.method1129(i_106_, i_107_, (byte) 122);
				}
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 24) {
			int i_111_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(127);
			int i_112_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-107);
			int i_113_ = 0x3 & i_112_;
			int i_114_ = i_112_ >> 2;
			int i_115_ = Class75.anIntArray1375[i_114_];
			int i_116_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_117_ = Class23_Sub4_Sub7.anInt3026 - -((0x7e & i_116_) >> 4);
			int i_118_ = Class105.anInt1808 + (i_116_ & 0x7);
			if ((i_117_ ^ 0xffffffff) <= -1 && (i_118_ ^ 0xffffffff) <= -1 && i_117_ < 104 && i_118_ < 104) {
				Class82.method1373(i_118_, i_111_, 0, Class23_Sub13_Sub11.anInt3916, i_115_, -1, -7593, i_113_, i_114_, i_117_);
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 214) {
			int i_119_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_120_ = Class23_Sub4_Sub7.anInt3026 - -(i_119_ >> 4 & 0x7);
			int i_121_ = Class105.anInt1808 + (0x7 & i_119_);
			int i_122_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_123_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_124_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			if ((i_120_ ^ 0xffffffff) <= -1 && i_121_ >= 0 && i_120_ < 104 && i_121_ < 104) {
				i_121_ = 64 + 128 * i_121_;
				i_120_ = 128 * i_120_ - -64;
				Class38_Sub6 class38_sub6 = new Class38_Sub6(i_122_, Class23_Sub13_Sub11.anInt3916, i_120_, i_121_, Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_120_, i_121_, (byte) 115) - i_123_, i_124_, Class89.anInt1511);
				Class23_Sub13_Sub17.aClass89_4066.method1439(-117, new Class23_Sub13_Sub9(class38_sub6));
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 134) {
			int i_125_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_126_ = Class23_Sub4_Sub7.anInt3026 - -((i_125_ & 0x7a) >> 4);
			int i_127_ = Class105.anInt1808 + (i_125_ & 0x7);
			int i_128_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(126);
			if (i_126_ >= 0 && i_127_ >= 0 && i_126_ < 104 && i_127_ < 104) {
				Class89 class89 = Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_126_][i_127_];
				if (class89 != null) {
					for (Class23_Sub13_Sub1 class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1437(-117); class23_sub13_sub1 != null; class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1431((byte) -89)) {
						if (class23_sub13_sub1.aClass38_Sub2_3668.anInt2495 == (i_128_ & 0x7fff)) {
							class23_sub13_sub1.method228(0);
							break;
						}
					}
					if (class89.method1437(71) == null) {
						Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_126_][i_127_] = null;
					}
					Class44.method1129(i_126_, i_127_, (byte) 120);
				}
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 188) {
			int i_129_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_130_ = (0x7 & i_129_) + Class105.anInt1808;
			int i_131_ = Class23_Sub4_Sub7.anInt3026 - -(0x7 & i_129_ >> 4);
			int i_132_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(-16933672) + i_131_;
			int i_133_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(-16933672) + i_130_;
			int i_134_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method474(true);
			int i_135_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_136_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte() * 4;
			int i_137_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte() * 4;
			int i_138_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_139_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_140_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_141_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			if (i_131_ >= 0 && i_130_ >= 0 && i_131_ < 104 && i_130_ < 104 && i_132_ >= 0 && i_133_ >= 0 && i_132_ < 104 && i_133_ < 104 && (i_135_ ^ 0xffffffff) != -65536) {
				i_132_ = i_132_ * 128 - -64;
				i_130_ = 64 + 128 * i_130_;
				i_133_ = 128 * i_133_ - -64;
				i_131_ = 64 + i_131_ * 128;
				Class38_Sub5 class38_sub5 = new Class38_Sub5(i_135_, Class23_Sub13_Sub11.anInt3916, i_131_, i_130_, Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_131_, i_130_, (byte) 89) - i_136_, Class89.anInt1511 + i_138_, i_139_ - -Class89.anInt1511, i_140_, i_141_, i_134_, i_137_);
				class38_sub5.method1069(i_138_ - -Class89.anInt1511, i_133_, i_132_, Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_132_, i_133_, (byte) -102) + -i_137_, -18499);
				Class36.aClass89_562.method1439(125, new Class23_Sub13_Sub3(class38_sub5));
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 77) {
			int i_142_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-120);
			int i_143_ = 0x3 & i_142_;
			int i_144_ = i_142_ >> 2;
			int i_145_ = Class75.anIntArray1375[i_144_];
			int i_146_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 99);
			int i_147_ = Class23_Sub4_Sub7.anInt3026 - -(0x7 & i_146_ >> 4);
			int i_148_ = Class105.anInt1808 - -(i_146_ & 0x7);
			if ((i_147_ ^ 0xffffffff) <= -1 && i_148_ >= 0 && i_147_ < 104 && i_148_ < 104) {
				Class82.method1373(i_148_, -1, 0, Class23_Sub13_Sub11.anInt3916, i_145_, -1, -7593, i_143_, i_144_, i_147_);
			}
		} else if (Class23_Sub13_Sub24.anInt4275 == 16) {
			int i_149_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
			int i_150_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(125);
			int i_151_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
			int i_152_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
			int i_153_ = (i_152_ >> 4 & 0x7) + Class23_Sub4_Sub7.anInt3026;
			int i_154_ = Class105.anInt1808 + (0x7 & i_152_);
			if (i_153_ >= 0 && (i_154_ ^ 0xffffffff) <= -1 && i_153_ < 104 && i_154_ < 104 && i_151_ != Class23_Sub4_Sub10.anInt3049) {
				Class38_Sub2 class38_sub2 = new Class38_Sub2();
				class38_sub2.anInt2495 = i_150_;
				class38_sub2.anInt2499 = i_149_;
				if (Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_153_][i_154_] == null) {
					Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_153_][i_154_] = new Class89();
				}
				Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_153_][i_154_].method1439(113, new Class23_Sub13_Sub1(class38_sub2));
				Class44.method1129(i_153_, i_154_, (byte) 113);
			}
		} else {
			int i_155_ = 67 % ((i - -15) / 46);
			if (Class23_Sub13_Sub24.anInt4275 == 74) {
				int i_156_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-117);
				int i_157_ = (i_156_ >> 4 & 0x7) + Class23_Sub4_Sub7.anInt3026;
				int i_158_ = Class105.anInt1808 + (i_156_ & 0x7);
				int i_159_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readShortBE();
				int i_160_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
				int i_161_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method433(-75);
				int i_162_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method440(-18402);
				int i_163_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(-16933672);
				int i_164_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method434((byte) 105);
				int i_165_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readByte();
				int i_166_ = i_165_ >> 2;
				int i_167_ = Class75.anIntArray1375[i_166_];
				int i_168_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(126);
				int i_169_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
				Class38_Sub7_Sub2 class38_sub7_sub2;
				if (Class23_Sub4_Sub10.anInt3049 == i_169_) {
					class38_sub7_sub2 = Class105.aClass38_Sub7_Sub2_1812;
				} else {
					class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_169_];
				}
				int i_170_ = i_165_ & 0x3;
				if (class38_sub7_sub2 != null) {
					Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_160_, -21035);
					int i_171_;
					int i_172_;
					if (i_170_ == 1 || i_170_ == 3) {
						i_172_ = class23_sub13_sub7.anInt3752;
						i_171_ = class23_sub13_sub7.anInt3754;
					} else {
						i_171_ = class23_sub13_sub7.anInt3752;
						i_172_ = class23_sub13_sub7.anInt3754;
					}
					int i_173_ = (i_171_ >> 1) + i_157_;
					int i_174_ = (i_172_ >> 1) + i_158_;
					int i_175_ = i_157_ - -(1 + i_171_ >> 1);
					int i_176_ = i_158_ + (i_172_ - -1 >> 1);
					int[][] is = Class17.anIntArrayArrayArray301[Class23_Sub13_Sub11.anInt3916];
					int[][] is_177_ = null;
					if (Class23_Sub13_Sub11.anInt3916 < 3) {
						is_177_ = Class17.anIntArrayArrayArray301[1 + Class23_Sub13_Sub11.anInt3916];
					}
					int i_178_ = is[i_173_][i_176_] + is[i_173_][i_174_] + (is[i_175_][i_174_] - -is[i_175_][i_176_]) >> 2;
					int i_179_ = (i_157_ << 7) + (i_171_ << 6);
					int i_180_ = (i_158_ << 7) - -(i_172_ << 6);
					Class23_Sub13_Sub5 class23_sub13_sub5 = class23_sub13_sub7.method636(false, i_166_, false, is_177_, is, i_180_, i_179_, i_170_, i_178_);
					if (class23_sub13_sub5 != null) {
						if ((i_163_ ^ 0xffffffff) < (i_162_ ^ 0xffffffff)) {
							int i_181_ = i_163_;
							i_163_ = i_162_;
							i_162_ = i_181_;
						}
						if (i_161_ > i_164_) {
							int i_182_ = i_161_;
							i_161_ = i_164_;
							i_164_ = i_182_;
						}
						Class82.method1373(i_158_, -1, i_168_ - -1, Class23_Sub13_Sub11.anInt3916, i_167_, 1 + i_159_, -7593, 0, 0, i_157_);
						class38_sub7_sub2.aClass38_Sub1_4402 = (Class38_Sub1) class23_sub13_sub5.aClass38_3723;
						class38_sub7_sub2.anInt4380 = i_168_ - -Class89.anInt1511;
						class38_sub7_sub2.anInt4411 = i_159_ + Class89.anInt1511;
						class38_sub7_sub2.anInt4403 = i_178_;
						class38_sub7_sub2.anInt4390 = i_162_ + i_157_;
						class38_sub7_sub2.anInt4387 = i_157_ - -i_163_;
						class38_sub7_sub2.anInt4391 = i_161_ + i_158_;
						class38_sub7_sub2.anInt4379 = 64 * i_172_ + 128 * i_158_;
						class38_sub7_sub2.anInt4396 = i_158_ + i_164_;
						class38_sub7_sub2.anInt4395 = i_157_ * 128 - -(i_171_ * 64);
					}
				}
			}
			if (Class23_Sub13_Sub24.anInt4275 == 60) {
				int i_183_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(127);
				int i_184_ = Class23_Sub4_Sub7.anInt3026 - -((0x74 & i_183_) >> 4);
				int i_185_ = Class105.anInt1808 - -(i_183_ & 0x7);
				int i_186_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
				int i_187_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(126);
				int i_188_ = 0x3 & i_187_;
				if (i_186_ == 65535) {
					i_186_ = -1;
				}
				int i_189_ = i_187_ >> 2;
				int i_190_ = Class75.anIntArray1375[i_189_];
				Class23_Sub19.method879(104, i_190_, i_184_, i_185_, i_186_, i_189_, Class23_Sub13_Sub11.anInt3916, i_188_);
			}
		}
	}
	
	static {
		anInt550 = 0;
		anInt554 = 100;
	}
}
