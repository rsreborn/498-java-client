/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class106
{
	static int anInt1815 = 0;
	static int anInt1816;
	private int[] anIntArray1817;
	static int anInt1818;
	static int anInt1819;
	static int anInt1820;
	static int anInt1821;
	static int anInt1822 = -1;
	private int[] anIntArray1823;
	static int anInt1824;
	static int anInt1825;
	private byte[] aByteArray1826;
	static int anInt1827;
	static RSString aClass16_1828 = Class38_Sub6.method1076((byte) 86, "");
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array1829;
	static RSString aClass16_1830;
	private static RSString aClass16_1831;
	
	public static void method1574(boolean bool) {
		if (bool != true) {
			anInt1819 = -64;
		}
		aClass23_Sub13_Sub10Array1829 = null;
		aClass16_1828 = null;
		aClass16_1831 = null;
		aClass16_1830 = null;
	}
	
	final int method1575(int i, byte[] bs, int i_0_, int i_1_, int i_2_, byte[] bs_3_) {
		anInt1825++;
		if (i_2_ < 26) {
			aClass23_Sub13_Sub10Array1829 = null;
		}
		if ((i ^ 0xffffffff) == -1) {
			return 0;
		}
		i += i_0_;
		int i_4_ = 0;
		int i_5_ = i_1_;
		for (;;) {
			byte b = bs_3_[i_5_];
			if (b < 0) {
				i_4_ = anIntArray1823[i_4_];
			} else {
				i_4_++;
			}
			int i_6_;
			if (((i_6_ = anIntArray1823[i_4_]) ^ 0xffffffff) > -1) {
				bs[i_0_++] = (byte) (i_6_ ^ 0xffffffff);
				if ((i_0_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
					break;
				}
				i_4_ = 0;
			}
			if ((0x40 & b ^ 0xffffffff) != -1) {
				i_4_ = anIntArray1823[i_4_];
			} else {
				i_4_++;
			}
			if (((i_6_ = anIntArray1823[i_4_]) ^ 0xffffffff) > -1) {
				bs[i_0_++] = (byte) (i_6_ ^ 0xffffffff);
				if ((i ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)) {
					break;
				}
				i_4_ = 0;
			}
			if ((0x20 & b ^ 0xffffffff) == -1) {
				i_4_++;
			} else {
				i_4_ = anIntArray1823[i_4_];
			}
			if ((i_6_ = anIntArray1823[i_4_]) < 0) {
				bs[i_0_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i <= i_0_) {
					break;
				}
				i_4_ = 0;
			}
			if ((b & 0x10) != 0) {
				i_4_ = anIntArray1823[i_4_];
			} else {
				i_4_++;
			}
			if (((i_6_ = anIntArray1823[i_4_]) ^ 0xffffffff) > -1) {
				bs[i_0_++] = (byte) (i_6_ ^ 0xffffffff);
				if ((i_0_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
					break;
				}
				i_4_ = 0;
			}
			if ((b & 0x8) == 0) {
				i_4_++;
			} else {
				i_4_ = anIntArray1823[i_4_];
			}
			if ((i_6_ = anIntArray1823[i_4_]) < 0) {
				bs[i_0_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i <= i_0_) {
					break;
				}
				i_4_ = 0;
			}
			if ((b & 0x4) != 0) {
				i_4_ = anIntArray1823[i_4_];
			} else {
				i_4_++;
			}
			if (((i_6_ = anIntArray1823[i_4_]) ^ 0xffffffff) > -1) {
				bs[i_0_++] = (byte) (i_6_ ^ 0xffffffff);
				if ((i_0_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
					break;
				}
				i_4_ = 0;
			}
			if ((b & 0x2) != 0) {
				i_4_ = anIntArray1823[i_4_];
			} else {
				i_4_++;
			}
			if ((i_6_ = anIntArray1823[i_4_]) < 0) {
				bs[i_0_++] = (byte) (i_6_ ^ 0xffffffff);
				if ((i_0_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
					break;
				}
				i_4_ = 0;
			}
			if ((0x1 & b ^ 0xffffffff) != -1) {
				i_4_ = anIntArray1823[i_4_];
			} else {
				i_4_++;
			}
			if ((i_6_ = anIntArray1823[i_4_]) < 0) {
				bs[i_0_++] = (byte) (i_6_ ^ 0xffffffff);
				if ((i ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)) {
					break;
				}
				i_4_ = 0;
			}
			i_5_++;
		}
		return 1 + (i_5_ + -i_1_);
	}
	
	static final void method1576(byte b) {
		anInt1821++;
		Class35.anInt550 &= 0x7ff;
		int i = Class23_Sub4_Sub26.anInt3318 >> 7;
		int i_7_ = Class2.anInt82 >> 7;
		if (Class23_Sub4_Sub37.anInt3492 < 128) {
			Class23_Sub4_Sub37.anInt3492 = 128;
		}
		if (Class23_Sub4_Sub37.anInt3492 > 383) {
			Class23_Sub4_Sub37.anInt3492 = 383;
		}
		int i_8_ = Class23_Sub4_Sub22.method359(ItemDefinition.anInt3916, Class23_Sub4_Sub26.anInt3318, Class2.anInt82, (byte) 127);
		int i_9_ = 0;
		if (i > 3 && i_7_ > 3 && i < 100 && i_7_ < 100) {
			for (int i_10_ = -4 + i; i + 4 >= i_10_; i_10_++) {
				for (int i_11_ = -4 + i_7_; (i_11_ ^ 0xffffffff) >= (i_7_ + 4 ^ 0xffffffff); i_11_++) {
					int i_12_ = ItemDefinition.anInt3916;
					if (i_12_ < 3 && (Class23_Sub4_Sub30.aByteArrayArrayArray3379[1][i_10_][i_11_] & 0x2) == 2) {
						i_12_++;
					}
					int i_13_ = i_8_ + -Class17.anIntArrayArrayArray301[i_12_][i_10_][i_11_];
					if (i_13_ > i_9_) {
						i_9_ = i_13_;
					}
				}
			}
		}
		int i_14_ = -8 % ((-21 - b) / 50);
		int i_15_ = i_9_ * 192;
		if (i_15_ > 98048) {
			i_15_ = 98048;
		}
		if ((i_15_ ^ 0xffffffff) > -32769) {
			i_15_ = 32768;
		}
		if ((i_15_ ^ 0xffffffff) < (Class24.anInt365 ^ 0xffffffff)) {
			Class24.anInt365 += (-Class24.anInt365 + i_15_) / 24;
		} else if (Class24.anInt365 > i_15_) {
			Class24.anInt365 += (-Class24.anInt365 + i_15_) / 80;
		}
	}
	
	static final void method1577(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		anInt1824++;
		Class4.method58(i_21_, -109);
		int i_22_ = 0;
		int i_23_ = i_21_ + -i;
		if (i_23_ < 0) {
			i_23_ = 0;
		}
		int i_24_ = i_21_;
		int i_25_ = -i_21_;
		int i_26_ = i_23_;
		int i_27_ = -1;
		int i_28_ = -i_23_;
		int i_29_ = -1;
		int[] is = Class4.anIntArrayArray98[i_16_];
		int i_30_ = -87 % ((i_19_ - 44) / 52);
		int i_31_ = i_23_ + i_20_;
		int i_32_ = i_20_ + -i_23_;
		Class23_Sub13_Sub6.method632(i_32_, (byte) -30, i_17_, is, i_20_ + -i_21_);
		Class23_Sub13_Sub6.method632(i_31_, (byte) -30, i_18_, is, i_32_);
		Class23_Sub13_Sub6.method632(i_21_ + i_20_, (byte) -30, i_17_, is, i_31_);
		while (i_22_ < i_24_) {
			i_29_ += 2;
			i_28_ += i_29_;
			if ((i_28_ ^ 0xffffffff) <= -1 && i_26_ >= 1) {
				Class23_Sub4_Sub18.anIntArray3183[i_26_] = i_22_;
				i_26_--;
				i_28_ -= i_26_ << 1;
			}
			i_27_ += 2;
			i_25_ += i_27_;
			i_22_++;
			if ((i_25_ ^ 0xffffffff) <= -1) {
				i_24_--;
				i_25_ -= i_24_ << 1;
				if (i_24_ >= i_23_) {
					int[] is_33_ = Class4.anIntArrayArray98[i_16_ + i_24_];
					int[] is_34_ = Class4.anIntArrayArray98[i_16_ - i_24_];
					int i_35_ = -i_22_ + i_20_;
					int i_36_ = i_20_ - -i_22_;
					Class23_Sub13_Sub6.method632(i_36_, (byte) -30, i_17_, is_33_, i_35_);
					Class23_Sub13_Sub6.method632(i_36_, (byte) -30, i_17_, is_34_, i_35_);
				} else {
					int[] is_37_ = Class4.anIntArrayArray98[-i_24_ + i_16_];
					int[] is_38_ = Class4.anIntArrayArray98[i_24_ + i_16_];
					int i_39_ = Class23_Sub4_Sub18.anIntArray3183[i_24_];
					int i_40_ = i_20_ - -i_22_;
					int i_41_ = -i_22_ + i_20_;
					int i_42_ = i_39_ + i_20_;
					int i_43_ = -i_39_ + i_20_;
					Class23_Sub13_Sub6.method632(i_43_, (byte) -30, i_17_, is_38_, i_41_);
					Class23_Sub13_Sub6.method632(i_42_, (byte) -30, i_18_, is_38_, i_43_);
					Class23_Sub13_Sub6.method632(i_40_, (byte) -30, i_17_, is_38_, i_42_);
					Class23_Sub13_Sub6.method632(i_43_, (byte) -30, i_17_, is_37_, i_41_);
					Class23_Sub13_Sub6.method632(i_42_, (byte) -30, i_18_, is_37_, i_43_);
					Class23_Sub13_Sub6.method632(i_40_, (byte) -30, i_17_, is_37_, i_42_);
				}
			}
			int[] is_44_ = Class4.anIntArrayArray98[i_16_ + i_22_];
			int[] is_45_ = Class4.anIntArrayArray98[-i_22_ + i_16_];
			int i_46_ = i_20_ + -i_24_;
			int i_47_ = i_20_ - -i_24_;
			if (i_22_ < i_23_) {
				int i_48_ = (i_22_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff) ? Class23_Sub4_Sub18.anIntArray3183[i_22_] : i_26_;
				int i_49_ = i_48_ + i_20_;
				int i_50_ = -i_48_ + i_20_;
				Class23_Sub13_Sub6.method632(i_50_, (byte) -30, i_17_, is_44_, i_46_);
				Class23_Sub13_Sub6.method632(i_49_, (byte) -30, i_18_, is_44_, i_50_);
				Class23_Sub13_Sub6.method632(i_47_, (byte) -30, i_17_, is_44_, i_49_);
				Class23_Sub13_Sub6.method632(i_50_, (byte) -30, i_17_, is_45_, i_46_);
				Class23_Sub13_Sub6.method632(i_49_, (byte) -30, i_18_, is_45_, i_50_);
				Class23_Sub13_Sub6.method632(i_47_, (byte) -30, i_17_, is_45_, i_49_);
			} else {
				Class23_Sub13_Sub6.method632(i_47_, (byte) -30, i_17_, is_44_, i_46_);
				Class23_Sub13_Sub6.method632(i_47_, (byte) -30, i_17_, is_45_, i_46_);
			}
		}
	}
	
	Class106(byte[] bs) {
		int i = bs.length;
		anIntArray1823 = new int[8];
		aByteArray1826 = bs;
		anIntArray1817 = new int[i];
		int i_51_ = 0;
		int[] is = new int[33];
		for (int i_52_ = 0; (i_52_ ^ 0xffffffff) > (i ^ 0xffffffff); i_52_++) {
			int i_53_ = bs[i_52_];
			if (i_53_ != 0) {
				int i_54_ = 1 << -i_53_ + 32;
				int i_55_ = is[i_53_];
				anIntArray1817[i_52_] = i_55_;
				int i_56_;
				if ((i_54_ & i_55_) == 0) {
					for (int i_57_ = -1 + i_53_; i_57_ >= 1; i_57_--) {
						int i_58_ = is[i_57_];
						if (i_55_ != i_58_) {
							break;
						}
						int i_59_ = 1 << -i_57_ + 32;
						if ((i_59_ & i_58_ ^ 0xffffffff) == -1) {
							is[i_57_] = Class65.method1230(i_59_, i_58_);
						} else {
							is[i_57_] = is[-1 + i_57_];
							break;
						}
					}
					i_56_ = i_54_ | i_55_;
				} else {
					i_56_ = is[-1 + i_53_];
				}
				is[i_53_] = i_56_;
				for (int i_60_ = i_53_ - -1; i_60_ <= 32; i_60_++) {
					if (i_55_ == is[i_60_]) {
						is[i_60_] = i_56_;
					}
				}
				int i_61_ = 0;
				for (int i_62_ = 0; (i_53_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
					int i_63_ = -2147483648 >>> i_62_;
					if ((i_63_ & i_55_) == 0) {
						i_61_++;
					} else {
						if ((anIntArray1823[i_61_] ^ 0xffffffff) == -1) {
							anIntArray1823[i_61_] = i_51_;
						}
						i_61_ = anIntArray1823[i_61_];
					}
					if ((anIntArray1823.length ^ 0xffffffff) >= (i_61_ ^ 0xffffffff)) {
						int[] is_64_ = new int[anIntArray1823.length * 2];
						for (int i_65_ = 0; (anIntArray1823.length ^ 0xffffffff) < (i_65_ ^ 0xffffffff); i_65_++)
							is_64_[i_65_] = anIntArray1823[i_65_];
						anIntArray1823 = is_64_;
					}
					i_63_ >>>= 1;
				}
				anIntArray1823[i_61_] = i_52_ ^ 0xffffffff;
				if ((i_61_ ^ 0xffffffff) <= (i_51_ ^ 0xffffffff)) {
					i_51_ = i_61_ + 1;
				}
			}
		}
	}
	
	static final void method1578(int i, boolean bool, int i_66_, int i_67_, int i_68_) {
		anInt1816++;
		if (bool == true) {
			if ((-i + i_67_ ^ 0xffffffff) > (Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff) || i_67_ + i > Class35.anInt554 || (i_68_ + -i ^ 0xffffffff) > (Class88.anInt1503 ^ 0xffffffff) || Class23_Sub4_Sub33.anInt3435 < i_68_ - -i) {
				RuntimeException_Sub1.method1587(i_67_, i_66_, (byte) -100, i, i_68_);
			} else {
				Class40.method1105((byte) -116, i_67_, i, i_66_, i_68_);
			}
		}
	}
	
	final int method1579(int i, int i_69_, byte[] bs, int i_70_, int i_71_, byte[] bs_72_) {
		anInt1818++;
		i_70_ += i_69_;
		int i_73_ = 0;
		int i_74_ = i_71_ << 3;
		if (i != -1323418753) {
			method1577(-70, -127, -102, -50, 5, -21, 0);
		}
		for (/**/; i_70_ > i_69_; i_69_++) {
			int i_75_ = 0xff & bs[i_69_];
			int i_76_ = anIntArray1817[i_75_];
			int i_77_ = aByteArray1826[i_75_];
			if (i_77_ == 0) {
				throw new RuntimeException("No codeword for data value " + i_75_);
			}
			int i_78_ = i_74_ >> 3;
			int i_79_ = i_74_ & 0x7;
			i_74_ += i_77_;
			int i_80_ = (i_77_ + i_79_ + -1 >> 3) + i_78_;
			i_73_ &= -i_79_ >> 31;
			i_79_ += 24;
			bs_72_[i_78_] = (byte) (i_73_ = Class65.method1230(i_73_, i_76_ >>> i_79_));
			if ((i_78_ ^ 0xffffffff) > (i_80_ ^ 0xffffffff)) {
				i_78_++;
				i_79_ -= 8;
				bs_72_[i_78_] = (byte) (i_73_ = i_76_ >>> i_79_);
				if ((i_80_ ^ 0xffffffff) < (i_78_ ^ 0xffffffff)) {
					i_78_++;
					i_79_ -= 8;
					bs_72_[i_78_] = (byte) (i_73_ = i_76_ >>> i_79_);
					if (i_78_ < i_80_) {
						i_78_++;
						i_79_ -= 8;
						bs_72_[i_78_] = (byte) (i_73_ = i_76_ >>> i_79_);
						if ((i_80_ ^ 0xffffffff) < (i_78_ ^ 0xffffffff)) {
							i_79_ -= 8;
							i_78_++;
							bs_72_[i_78_] = (byte) (i_73_ = i_76_ << -i_79_);
						}
					}
				}
			}
		}
		return -i_71_ + (i_74_ + 7 >> 3);
	}
	
	static {
		anInt1827 = 5063219;
		aClass16_1831 = Class38_Sub6.method1076((byte) 86, " from your ignore list first)3");
		aClass16_1830 = aClass16_1831;
		anInt1819 = 0;
	}
}
