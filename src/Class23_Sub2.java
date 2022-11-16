/* Class23_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub2 extends Class23
{
	static int anInt2042;
	static RSString aClass16_2043;
	static int anInt2044;
	protected byte[] aByteArray2045;
	protected int anInt2046;
	static int anInt2047;
	static int anInt2048;
	private static RSString aClass16_2049 = Class38_Sub6.method1076((byte) 86, "glow3:");
	static RSString aClass16_2050;
	protected Class47[] aClass47Array2051;
	protected Class23_Sub6_Sub1[] aClass23_Sub6_Sub1Array2052;
	static Class5 aClass5_2053;
	static int[][] anIntArrayArray2054;
	private int[] anIntArray2055;
	protected short[] aShortArray2056;
	static int anInt2057;
	static long aLong2058;
	static RSString aClass16_2059;
	static RSString aClass16_2060;
	static RSString aClass16_2061;
	static RSString aClass16_2062;
	static RSString aClass16_2063;
	static RSString aClass16_2064;
	static RSString aClass16_2065;
	protected byte[] aByteArray2066;
	protected byte[] aByteArray2067;
	static int anInt2068;
	
	public static void method237(byte b) {
		aClass5_2053 = null;
		aClass16_2050 = null;
		if (b < 52) {
			aClass16_2043 = null;
		}
		aClass16_2059 = null;
		anIntArrayArray2054 = null;
		aClass16_2062 = null;
		aClass16_2049 = null;
		aClass16_2060 = null;
		aClass16_2064 = null;
		aClass16_2063 = null;
		aClass16_2065 = null;
		aClass16_2043 = null;
		aClass16_2061 = null;
	}
	
	static final void method238(int i, boolean bool) {
		anInt2044++;
		if (Class23_Sub23.aClass34_2427 != null) {
			try {
				Buffer class23_sub5 = new Buffer(4);
				class23_sub5.method460((byte) 107, bool ? 2 : 3);
				class23_sub5.method457(-483923896, i);
				Class23_Sub23.aClass34_2427.method977(30000, 4, 0, class23_sub5.payload);
			} catch (java.io.IOException ioexception) {
				try {
					Class23_Sub23.aClass34_2427.method976(false);
				} catch (Exception exception) {
					/* empty */
				}
				Class23_Sub23.aClass34_2427 = null;
				Class23_Sub17.anInt2369++;
			}
		}
	}
	
	final void method239(int i) {
		anIntArray2055 = null;
		if (i == 0) {
			anInt2057++;
		}
	}
	
	static final Class43 method240(byte b) {
		anInt2047++;
		if (b != -69) {
			method238(26, false);
		}
		Class43_Sub1 class43_sub1 = new Class43_Sub1(Class23_Sub12.anInt2301, Class23_Sub13_Sub15.anInt4033, Class23_Sub23.anIntArray2417[0], Class23_Sub13_Sub2.anIntArray3679[0], Class79.anIntArray1875[0], Class105.anIntArray1766[0], Class23_Sub13_Sub23.aByteArrayArray4243[0], Class23_Sub4_Sub1.anIntArray2890);
		Class23_Sub13_Sub9.method684(true);
		return class43_sub1;
	}
	
	final boolean method241(int[] is, Class14 class14, byte[] bs, int i) {
		anInt2042++;
		boolean bool = true;
		int i_0_ = 0;
		Class23_Sub6_Sub1 class23_sub6_sub1 = null;
		for (int i_1_ = i; i_1_ < 128; i_1_++) {
			if (bs == null || bs[i_1_] != 0) {
				int i_2_ = anIntArray2055[i_1_];
				if ((i_2_ ^ 0xffffffff) != -1) {
					if (i_2_ != i_0_) {
						i_0_ = i_2_;
						i_2_--;
						if ((0x1 & i_2_) != 0) {
							class23_sub6_sub1 = class14.method131(is, false, i_2_ >> 2);
						} else {
							class23_sub6_sub1 = class14.method125(-90, i_2_ >> 2, is);
						}
						if (class23_sub6_sub1 == null) {
							bool = false;
						}
					}
					if (class23_sub6_sub1 != null) {
						aClass23_Sub6_Sub1Array2052[i_1_] = class23_sub6_sub1;
						anIntArray2055[i_1_] = 0;
					}
				}
			}
		}
		return bool;
	}
	
	public Class23_Sub2() {
		/* empty */
	}
	
	Class23_Sub2(byte[] bs) {
		aByteArray2045 = new byte[128];
		aClass47Array2051 = new Class47[128];
		aClass23_Sub6_Sub1Array2052 = new Class23_Sub6_Sub1[128];
		anIntArray2055 = new int[128];
		aByteArray2067 = new byte[128];
		aByteArray2066 = new byte[128];
		aShortArray2056 = new short[128];
		int i = 0;
		Buffer class23_sub5;
		for (class23_sub5 = new Buffer(bs); class23_sub5.payload[i + class23_sub5.position] != 0; i++) {
			/* empty */
		}
		byte[] bs_3_ = new byte[i];
		for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i ^ 0xffffffff); i_4_++)
			bs_3_[i_4_] = class23_sub5.method452(-16933672);
		i++;
		class23_sub5.position++;
		int i_5_ = class23_sub5.position;
		class23_sub5.position += i;
		int i_6_;
		for (i_6_ = 0; class23_sub5.payload[class23_sub5.position + i_6_] != 0; i_6_++) {
			/* empty */
		}
		byte[] bs_7_ = new byte[i_6_];
		for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_8_++)
			bs_7_[i_8_] = class23_sub5.method452(-16933672);
		i_6_++;
		class23_sub5.position++;
		int i_9_ = class23_sub5.position;
		class23_sub5.position += i_6_;
		int i_10_;
		for (i_10_ = 0; (class23_sub5.payload[class23_sub5.position - -i_10_] ^ 0xffffffff) != -1; i_10_++) {
			/* empty */
		}
		byte[] bs_11_ = new byte[i_10_];
		for (int i_12_ = 0; (i_10_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++)
			bs_11_[i_12_] = class23_sub5.method452(-16933672);
		i_10_++;
		class23_sub5.position++;
		byte[] bs_13_ = new byte[i_10_];
		int i_14_;
		if (i_10_ > 1) {
			i_14_ = 2;
			bs_13_[1] = (byte) 1;
			int i_15_ = 1;
			for (int i_16_ = 2; (i_16_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_16_++) {
				int i_17_ = class23_sub5.method461(-1797813752);
				if (i_17_ != 0) {
					if (i_15_ >= i_17_) {
						i_17_--;
					}
					i_15_ = i_17_;
				} else {
					i_15_ = i_14_++;
				}
				bs_13_[i_16_] = (byte) i_15_;
			}
		} else {
			i_14_ = i_10_;
		}
		Class47[] class47s = new Class47[i_14_];
		for (int i_18_ = 0; i_18_ < class47s.length; i_18_++) {
			Class47 class47 = class47s[i_18_] = new Class47();
			int i_19_ = class23_sub5.method461(-1797813752);
			if (i_19_ > 0) {
				class47.aByteArray729 = new byte[i_19_ * 2];
			}
			i_19_ = class23_sub5.method461(-1797813752);
			if ((i_19_ ^ 0xffffffff) < -1) {
				class47.aByteArray731 = new byte[2 + i_19_ * 2];
				class47.aByteArray731[1] = (byte) 64;
			}
		}
		int i_20_ = class23_sub5.method461(-1797813752);
		int i_21_ = 0;
		byte[] bs_22_ = (i_20_ ^ 0xffffffff) >= -1 ? null : new byte[2 * i_20_];
		i_20_ = class23_sub5.method461(-1797813752);
		for (/**/; class23_sub5.payload[i_21_ + class23_sub5.position] != 0; i_21_++) {
			/* empty */
		}
		byte[] bs_23_ = new byte[i_21_];
		for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_24_++)
			bs_23_[i_24_] = class23_sub5.method452(-16933672);
		byte[] bs_25_ = i_20_ <= 0 ? null : new byte[2 * i_20_];
		class23_sub5.position++;
		i_21_++;
		int i_26_ = 0;
		for (int i_27_ = 0; i_27_ < 128; i_27_++) {
			i_26_ += class23_sub5.method461(-1797813752);
			aShortArray2056[i_27_] = (short) i_26_;
		}
		i_26_ = 0;
		for (int i_28_ = 0; i_28_ < 128; i_28_++) {
			i_26_ += class23_sub5.method461(-1797813752);
			aShortArray2056[i_28_] += i_26_ << 8;
		}
		int i_29_ = 0;
		int i_30_ = 0;
		int i_31_ = 0;
		for (int i_32_ = 0; i_32_ < 128; i_32_++) {
			if (i_29_ == 0) {
				if ((bs_23_.length ^ 0xffffffff) < (i_30_ ^ 0xffffffff)) {
					i_29_ = bs_23_[i_30_++];
				} else {
					i_29_ = -1;
				}
				i_31_ = class23_sub5.method437(false);
			}
			i_29_--;
			aShortArray2056[i_32_] += Class24.method919(-1 + i_31_, 2) << 14;
			anIntArray2055[i_32_] = i_31_;
		}
		i_29_ = 0;
		int i_33_ = 0;
		i_30_ = 0;
		for (int i_34_ = 0; i_34_ < 128; i_34_++) {
			if ((anIntArray2055[i_34_] ^ 0xffffffff) != -1) {
				if ((i_29_ ^ 0xffffffff) == -1) {
					i_33_ = class23_sub5.payload[i_5_++] + -1;
					if (i_30_ < bs_3_.length) {
						i_29_ = bs_3_[i_30_++];
					} else {
						i_29_ = -1;
					}
				}
				aByteArray2045[i_34_] = (byte) i_33_;
				i_29_--;
			}
		}
		i_29_ = 0;
		i_30_ = 0;
		int i_35_ = 0;
		for (int i_36_ = 0; i_36_ < 128; i_36_++) {
			if ((anIntArray2055[i_36_] ^ 0xffffffff) != -1) {
				if ((i_29_ ^ 0xffffffff) == -1) {
					i_35_ = 16 + class23_sub5.payload[i_9_++] << 2;
					if (bs_7_.length <= i_30_) {
						i_29_ = -1;
					} else {
						i_29_ = bs_7_[i_30_++];
					}
				}
				i_29_--;
				aByteArray2066[i_36_] = (byte) i_35_;
			}
		}
		Class47 class47 = null;
		i_29_ = 0;
		i_30_ = 0;
		for (int i_37_ = 0; i_37_ < 128; i_37_++) {
			if ((anIntArray2055[i_37_] ^ 0xffffffff) != -1) {
				if ((i_29_ ^ 0xffffffff) == -1) {
					class47 = class47s[bs_13_[i_30_]];
					if (i_30_ >= bs_11_.length) {
						i_29_ = -1;
					} else {
						i_29_ = bs_11_[i_30_++];
					}
				}
				i_29_--;
				aClass47Array2051[i_37_] = class47;
			}
		}
		i_29_ = 0;
		int i_38_ = 0;
		i_30_ = 0;
		for (int i_39_ = 0; i_39_ < 128; i_39_++) {
			if (i_29_ == 0) {
				if (i_30_ >= bs_23_.length) {
					i_29_ = -1;
				} else {
					i_29_ = bs_23_[i_30_++];
				}
				if ((anIntArray2055[i_39_] ^ 0xffffffff) < -1) {
					i_38_ = 1 + class23_sub5.method461(-1797813752);
				}
			}
			i_29_--;
			aByteArray2067[i_39_] = (byte) i_38_;
		}
		anInt2046 = 1 + class23_sub5.method461(-1797813752);
		for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_40_++) {
			Class47 class47_41_ = class47s[i_40_];
			if (class47_41_.aByteArray729 != null) {
				for (int i_42_ = 1; i_42_ < class47_41_.aByteArray729.length; i_42_ += 2)
					class47_41_.aByteArray729[i_42_] = class23_sub5.method452(-16933672);
			}
			if (class47_41_.aByteArray731 != null) {
				for (int i_43_ = 3; -2 + class47_41_.aByteArray731.length > i_43_; i_43_ += 2)
					class47_41_.aByteArray731[i_43_] = class23_sub5.method452(-16933672);
			}
		}
		if (bs_22_ != null) {
			for (int i_44_ = 1; (i_44_ ^ 0xffffffff) > (bs_22_.length ^ 0xffffffff); i_44_ += 2)
				bs_22_[i_44_] = class23_sub5.method452(-16933672);
		}
		if (bs_25_ != null) {
			for (int i_45_ = 1; (i_45_ ^ 0xffffffff) > (bs_25_.length ^ 0xffffffff); i_45_ += 2)
				bs_25_[i_45_] = class23_sub5.method452(-16933672);
		}
		for (int i_46_ = 0; i_46_ < i_14_; i_46_++) {
			Class47 class47_47_ = class47s[i_46_];
			if (class47_47_.aByteArray731 != null) {
				i_26_ = 0;
				for (int i_48_ = 2; class47_47_.aByteArray731.length > i_48_; i_48_ += 2) {
					i_26_ = class23_sub5.method461(-1797813752) + (i_26_ + 1);
					class47_47_.aByteArray731[i_48_] = (byte) i_26_;
				}
			}
		}
		for (int i_49_ = 0; i_49_ < i_14_; i_49_++) {
			Class47 class47_50_ = class47s[i_49_];
			if (class47_50_.aByteArray729 != null) {
				i_26_ = 0;
				for (int i_51_ = 2; class47_50_.aByteArray729.length > i_51_; i_51_ += 2) {
					i_26_ = class23_sub5.method461(-1797813752) + (1 + i_26_);
					class47_50_.aByteArray729[i_51_] = (byte) i_26_;
				}
			}
		}
		if (bs_22_ != null) {
			i_26_ = class23_sub5.method461(-1797813752);
			bs_22_[0] = (byte) i_26_;
			for (int i_52_ = 2; i_52_ < bs_22_.length; i_52_ += 2) {
				i_26_ += 1 + class23_sub5.method461(-1797813752);
				bs_22_[i_52_] = (byte) i_26_;
			}
			int i_53_ = bs_22_[0];
			int i_54_ = bs_22_[1];
			for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > (i_53_ ^ 0xffffffff); i_55_++)
				aByteArray2067[i_55_] = (byte) (32 + i_54_ * aByteArray2067[i_55_] >> 6);
			int i_56_ = 2;
			while (bs_22_.length > i_56_) {
				int i_57_ = bs_22_[1 + i_56_];
				int i_58_ = bs_22_[i_56_];
				int i_59_ = (-i_53_ + i_58_) / 2 + i_54_ * (i_58_ + -i_53_);
				for (int i_60_ = i_53_; i_60_ < i_58_; i_60_++) {
					int i_61_ = Class23_Sub13_Sub2.method606(i_58_ + -i_53_, i_59_, 90);
					aByteArray2067[i_60_] = (byte) (32 + aByteArray2067[i_60_] * i_61_ >> 6);
					i_59_ += i_57_ - i_54_;
				}
				i_56_ += 2;
				i_54_ = i_57_;
				i_53_ = i_58_;
			}
			for (int i_62_ = i_53_; i_62_ < 128; i_62_++)
				aByteArray2067[i_62_] = (byte) (aByteArray2067[i_62_] * i_54_ - -32 >> 6);
			Object object = null;
		}
		if (bs_25_ != null) {
			i_26_ = class23_sub5.method461(-1797813752);
			bs_25_[0] = (byte) i_26_;
			for (int i_63_ = 2; i_63_ < bs_25_.length; i_63_ += 2) {
				i_26_ = class23_sub5.method461(-1797813752) + 1 + i_26_;
				bs_25_[i_63_] = (byte) i_26_;
			}
			int i_64_ = bs_25_[1] << 1;
			int i_65_ = bs_25_[0];
			for (int i_66_ = 0; (i_66_ ^ 0xffffffff) > (i_65_ ^ 0xffffffff); i_66_++) {
				int i_67_ = (0xff & aByteArray2066[i_66_]) - -i_64_;
				if ((i_67_ ^ 0xffffffff) > -1) {
					i_67_ = 0;
				}
				if (i_67_ > 128) {
					i_67_ = 128;
				}
				aByteArray2066[i_66_] = (byte) i_67_;
			}
			int i_68_ = 2;
			while ((bs_25_.length ^ 0xffffffff) < (i_68_ ^ 0xffffffff)) {
				int i_69_ = bs_25_[i_68_];
				int i_70_ = i_64_ * (i_69_ + -i_65_) + (-i_65_ + i_69_) / 2;
				int i_71_ = bs_25_[1 + i_68_] << 1;
				for (int i_72_ = i_65_; i_72_ < i_69_; i_72_++) {
					int i_73_ = Class23_Sub13_Sub2.method606(i_69_ - i_65_, i_70_, 85);
					i_70_ += -i_64_ + i_71_;
					int i_74_ = i_73_ + (aByteArray2066[i_72_] & 0xff);
					if ((i_74_ ^ 0xffffffff) > -1) {
						i_74_ = 0;
					}
					if (i_74_ > 128) {
						i_74_ = 128;
					}
					aByteArray2066[i_72_] = (byte) i_74_;
				}
				i_68_ += 2;
				i_64_ = i_71_;
				i_65_ = i_69_;
			}
			for (int i_75_ = i_65_; i_75_ < 128; i_75_++) {
				int i_76_ = i_64_ + (aByteArray2066[i_75_] & 0xff);
				if (i_76_ < 0) {
					i_76_ = 0;
				}
				if (i_76_ > 128) {
					i_76_ = 128;
				}
				aByteArray2066[i_75_] = (byte) i_76_;
			}
			Object object = null;
		}
		for (int i_77_ = 0; (i_14_ ^ 0xffffffff) < (i_77_ ^ 0xffffffff); i_77_++)
			class47s[i_77_].anInt730 = class23_sub5.method461(-1797813752);
		for (int i_78_ = 0; (i_78_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_78_++) {
			Class47 class47_79_ = class47s[i_78_];
			if (class47_79_.aByteArray729 != null) {
				class47_79_.anInt728 = class23_sub5.method461(-1797813752);
			}
			if (class47_79_.aByteArray731 != null) {
				class47_79_.anInt720 = class23_sub5.method461(-1797813752);
			}
			if ((class47_79_.anInt730 ^ 0xffffffff) < -1) {
				class47_79_.anInt736 = class23_sub5.method461(-1797813752);
			}
		}
		for (int i_80_ = 0; (i_14_ ^ 0xffffffff) < (i_80_ ^ 0xffffffff); i_80_++)
			class47s[i_80_].anInt725 = class23_sub5.method461(-1797813752);
		for (int i_81_ = 0; i_14_ > i_81_; i_81_++) {
			Class47 class47_82_ = class47s[i_81_];
			if ((class47_82_.anInt725 ^ 0xffffffff) < -1) {
				class47_82_.anInt724 = class23_sub5.method461(-1797813752);
			}
		}
		for (int i_83_ = 0; (i_14_ ^ 0xffffffff) < (i_83_ ^ 0xffffffff); i_83_++) {
			Class47 class47_84_ = class47s[i_83_];
			if (class47_84_.anInt724 > 0) {
				class47_84_.anInt732 = class23_sub5.method461(-1797813752);
			}
		}
	}
	
	static {
		anInt2048 = 0;
		aClass16_2043 = aClass16_2049;
		aClass16_2059 = aClass16_2049;
		aClass16_2062 = Class38_Sub6.method1076((byte) 86, "");
		aClass16_2063 = aClass16_2062;
		aLong2058 = 0L;
		aClass16_2065 = aClass16_2062;
		aClass16_2061 = aClass16_2062;
		aClass16_2050 = aClass16_2062;
		aClass16_2060 = aClass16_2062;
		aClass16_2064 = aClass16_2062;
		aClass5_2053 = new Class5(100);
	}
}
