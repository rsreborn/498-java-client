/* Class23_Sub13_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub4 extends Class23_Sub13
{
	static int anInt3704;
	protected int anInt3705;
	protected boolean aBoolean3706;
	static int anInt3707;
	static int anInt3708;
	protected int anInt3709 = -1;
	protected int anInt3710;
	static Class23_Sub5_Sub1 aClass23_Sub5_Sub1_3711;
	static int anInt3712;
	static int anInt3713;
	static RSString aClass16_3714 = null;
	static int anInt3715;
	static int anInt3716;
	static Class105 aClass105_3717;
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array3718;
	
	private final void method617(Buffer class23_sub5, int i, int i_0_, int i_1_) {
		if (i_0_ != 1) {
			if (i_0_ == 2) {
				anInt3709 = class23_sub5.readByte();
			} else if (i_0_ == 3) {
				anInt3709 = class23_sub5.readShortBE();
				if ((anInt3709 ^ 0xffffffff) == -65536) {
					anInt3709 = -1;
				}
			} else if (i_0_ == 5) {
				aBoolean3706 = false;
			} else if (i_0_ == 7) {
				anInt3710 = Class68.method1252(false, class23_sub5.method471(124));
			} else if (i_0_ != 8) {
				if (i_0_ == 9) {
					class23_sub5.readShortBE();
				}
			} else {
				Class17.anInt305 = i_1_;
			}
		} else {
			anInt3705 = Class68.method1252(false, class23_sub5.method471(118));
		}
		anInt3704++;
		if (i != -9) {
			aClass16_3714 = null;
		}
	}
	
	static final void method618(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (i_4_ != -717) {
			aClass23_Sub5_Sub1_3711 = null;
		}
		for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (Class23_Sub4_Sub25.anInt3306 ^ 0xffffffff); i_6_++) {
			if ((Class23_Sub4_Sub9.anIntArray3034[i_6_] + Class24.anIntArray372[i_6_] ^ 0xffffffff) < (i ^ 0xffffffff) && (Class23_Sub4_Sub9.anIntArray3034[i_6_] ^ 0xffffffff) > (i + i_2_ ^ 0xffffffff) && Class55.anIntArray865[i_6_] + Class23_Sub11.anIntArray2286[i_6_] > i_5_ && Class23_Sub11.anIntArray2286[i_6_] < i_3_ + i_5_) {
				Class36.aBooleanArray571[i_6_] = true;
			}
		}
		anInt3712++;
	}
	
	final void method619(int i, Buffer class23_sub5, int i_7_) {
		for (;;) {
			int i_8_ = class23_sub5.readByte();
			if (i_8_ == 0) {
				break;
			}
			method617(class23_sub5, -9, i_8_, i_7_);
		}
		if (i != 3) {
			method621(105, 87, 20, -45, 35);
		}
		anInt3713++;
	}
	
	static final void method620(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, byte b, int i_16_) {
		if (b != -124) {
			method623(118, 102, -126, -110, -95, -60, 38, 101);
		}
		if (i_12_ == i_14_ && (i_16_ ^ 0xffffffff) == (i_13_ ^ 0xffffffff) && i_15_ == i_11_ && i == i_9_) {
			Class23_Sub14.method863(i_14_, i, i_10_, i_13_, (byte) -88, i_15_);
		} else {
			int i_17_ = i_13_;
			int i_18_ = i_14_;
			int i_19_ = 3 * i_14_;
			int i_20_ = i_13_ * 3;
			int i_21_ = 3 * i_12_;
			int i_22_ = 3 * i_11_;
			int i_23_ = i_21_ + -i_22_ + i_15_ - i_14_;
			int i_24_ = 3 * i_16_;
			int i_25_ = i_9_ * 3;
			int i_26_ = -i_21_ + -i_21_ + i_22_ + i_19_;
			int i_27_ = -i_24_ + i_25_ - (i_24_ + -i_20_);
			int i_28_ = -i_13_ + (-i_25_ + i) - -i_24_;
			int i_29_ = -i_19_ + i_21_;
			int i_30_ = -i_20_ + i_24_;
			for (int i_31_ = 128; i_31_ <= 4096; i_31_ += 128) {
				int i_32_ = i_31_ * i_31_ >> 12;
				int i_33_ = i_32_ * i_31_ >> 12;
				int i_34_ = i_33_ * i_23_;
				int i_35_ = i_32_ * i_26_;
				int i_36_ = i_27_ * i_32_;
				int i_37_ = i_31_ * i_29_;
				int i_38_ = i_28_ * i_33_;
				int i_39_ = i_30_ * i_31_;
				int i_40_ = i_14_ + (i_34_ - (-i_35_ + -i_37_) >> 12);
				int i_41_ = i_13_ + (i_36_ + (i_38_ + i_39_) >> 12);
				Class23_Sub14.method863(i_18_, i_41_, i_10_, i_17_, (byte) -88, i_40_);
				i_17_ = i_41_;
				i_18_ = i_40_;
			}
		}
		anInt3716++;
	}
	
	static final void method621(int i, int i_42_, int i_43_, int i_44_, int i_45_) {
		if ((Class23_Sub7.anInt2213 ^ 0xffffffff) == i_44_) {
			Class71_Sub1.aClass23_Sub13_Sub10Array2723[Class51.anInt798 / 100].method694(Class23_Sub4_Sub27.anInt3327 - 8, -8 + Applet_Sub1.anInt34);
		}
		anInt3715++;
		if (Class23_Sub7.anInt2213 == 2) {
			Class71_Sub1.aClass23_Sub13_Sub10Array2723[4 - -(Class51.anInt798 / 100)].method694(Class23_Sub4_Sub27.anInt3327 - 8, -8 + Applet_Sub1.anInt34);
		}
		Class69.method1257(true);
		if (Class82.aBoolean1442) {
			int i_46_ = 512 + i_45_ + -5;
			int i_47_ = i_42_ - -20;
			Class38_Sub7.aClass23_Sub13_Sub8_2637.method668(Class23_Sub4_Sub14.method322(new RSString[] { Class97.aClass16_1641, Class23_Sub4_Sub23.method360((byte) -9, Class2.anInt79) }, -112), i_46_, i_47_, 16776960, -1);
			Runtime runtime = Runtime.getRuntime();
			int i_48_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
			i_47_ += 15;
			int i_49_ = 16776960;
			if ((i_48_ ^ 0xffffffff) < -32769 && Class7.aBoolean170) {
				i_49_ = 16711680;
			}
			if ((i_48_ ^ 0xffffffff) < -65537 && !Class7.aBoolean170) {
				i_49_ = 16711680;
			}
			Class38_Sub7.aClass23_Sub13_Sub8_2637.method668(Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub24.aClass16_3294, Class23_Sub4_Sub23.method360((byte) -9, i_48_), Class55.aClass16_868 }, -45), i_46_, i_47_, i_49_, -1);
			i_47_ += 15;
		}
	}
	
	public static void method622(int i) {
		aClass16_3714 = null;
		aClass23_Sub13_Sub10Array3718 = null;
		aClass105_3717 = null;
		aClass23_Sub5_Sub1_3711 = null;
		if (i != -2903) {
			method618(-8, -124, 5, 72, -21);
		}
	}
	
	public Class23_Sub13_Sub4() {
		anInt3705 = 0;
		aBoolean3706 = true;
		anInt3710 = -1;
	}
	
	static final boolean method623(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
		if (i_50_ < i_51_ && i_50_ < i_52_ && i_50_ < i_53_) {
			return false;
		}
		if (i_50_ > i_51_ && i_50_ > i_52_ && i_50_ > i_53_) {
			return false;
		}
		if (i < i_54_ && i < i_55_ && i < i_56_) {
			return false;
		}
		if (i > i_54_ && i > i_55_ && i > i_56_) {
			return false;
		}
		int i_57_ = (i_50_ - i_51_) * (i_55_ - i_54_) - (i - i_54_) * (i_52_ - i_51_);
		int i_58_ = (i_50_ - i_53_) * (i_54_ - i_56_) - (i - i_56_) * (i_51_ - i_53_);
		int i_59_ = (i_50_ - i_52_) * (i_56_ - i_55_) - (i - i_55_) * (i_53_ - i_52_);
		if (i_57_ * i_59_ > 0 && i_59_ * i_58_ > 0) {
			return true;
		}
		return false;
	}
	
	static final void method624(int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		anInt3708++;
		int i_68_ = i + -i_65_;
		int i_69_ = (i_67_ + -i_61_ << 16) / i_68_;
		if (i_64_ != -3) {
			method623(-71, 7, -31, -31, -37, -12, 47, 59);
		}
		int i_70_ = i_62_ - i_63_;
		int i_71_ = (i_66_ - i_60_ << 16) / i_70_;
		boolean bool;
		if (Class17_Sub1.anInt2002 <= 0 || Class17_Sub1.anInt2002 % 10 >= 5) {
			bool = false;
		} else {
			bool = true;
		}
		for (int i_72_ = 0; i_72_ < i_70_; i_72_++) {
			int i_73_ = (i_72_ - -1) * i_71_ >> 16;
			int i_74_ = i_72_ * i_71_ >> 16;
			int i_75_ = i_73_ - i_74_;
			if (i_75_ > 0) {
				i_74_ += i_60_;
				int[][] is = Class23_Sub13_Sub10.anIntArrayArrayArray3881[i_63_ + i_72_ >> 6];
				i_73_ += i_60_;
				for (int i_76_ = 0; i_76_ < i_68_; i_76_++) {
					int i_77_ = i_76_ * i_69_ >> 16;
					int i_78_ = i_69_ * (1 + i_76_) >> 16;
					int i_79_ = -i_77_ + i_78_;
					if ((i_79_ ^ 0xffffffff) < -1) {
						i_77_ += i_61_;
						i_78_ += i_61_;
						int i_80_ = i_76_ + i_65_ >> 6;
						if (is[i_80_] != null) {
							int i_81_ = (i_72_ - -i_63_ & 0x3f) + ((i_65_ + i_76_ & 0x3f) << 6);
							int i_82_ = is[i_80_][i_81_];
							if (i_82_ != 0) {
								Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(-1 + i_82_, -21035);
								if (bool && class23_sub13_sub7.anInt3751 == Class92.anInt1560) {
									Class23_Sub11 class23_sub11 = new Class23_Sub11();
									class23_sub11.anInt2280 = class23_sub13_sub7.anInt3751;
									class23_sub11.anInt2289 = i_74_;
									class23_sub11.anInt2285 = i_77_;
									Class42.aClass89_658.method1439(27, class23_sub11);
								}
								Class23.aClass23_Sub13_Sub10_Sub1Array350[class23_sub13_sub7.anInt3751].method694(i_74_ - 7, i_77_ + -7);
							}
						}
					}
				}
			}
		}
		if (Class23_Sub4_Sub4.aDouble2969 == Class107.aDouble1838) {
			for (Class23_Sub21 class23_sub21 = (Class23_Sub21) RSString.aClass89_1951.method1437(10); class23_sub21 != null; class23_sub21 = (Class23_Sub21) RSString.aClass89_1951.method1431((byte) -89)) {
				int i_83_ = class23_sub21.anInt2412;
				int i_84_ = class23_sub21.anInt2415;
				i_84_ = -i_84_ + (Class38_Sub7.anInt2697 + Class29.anInt445);
				i_83_ -= Class102.anInt1702;
				int i_85_ = (-i_60_ + i_66_) * (-i_63_ + i_83_) / (i_62_ + -i_63_) + i_60_;
				int i_86_ = (i_84_ + -i_65_) * (i_67_ + -i_61_) / (-i_65_ + i) + i_61_;
				int i_87_ = 16777215;
				int i_88_ = class23_sub21.anInt2405;
				Class84 class84 = null;
				if ((i_88_ ^ 0xffffffff) == -1) {
					if (Class107.aDouble1838 == 3.0) {
						class84 = Class94.aClass84_1607;
					}
					if (Class107.aDouble1838 == 4.0) {
						class84 = Class61.aClass84_962;
					}
					if (Class107.aDouble1838 == 6.0) {
						class84 = Class23_Sub13.aClass84_2307;
					}
					if (Class107.aDouble1838 == 8.0) {
						class84 = Class23_Sub4_Sub30.aClass84_3384;
					}
				}
				if (i_88_ == 1) {
					if (Class107.aDouble1838 == 3.0) {
						class84 = Class23_Sub13.aClass84_2307;
					}
					if (Class107.aDouble1838 == 4.0) {
						class84 = Class23_Sub4_Sub30.aClass84_3384;
					}
					if (Class107.aDouble1838 == 6.0) {
						class84 = Class23_Sub4_Sub1.aClass84_2888;
					}
					if (Class107.aDouble1838 == 8.0) {
						class84 = Class23_Sub27.aClass84_2483;
					}
				}
				if (i_88_ == 2) {
					if (Class107.aDouble1838 == 3.0) {
						class84 = Class23_Sub4_Sub1.aClass84_2888;
					}
					i_87_ = 16755200;
					if (Class107.aDouble1838 == 4.0) {
						class84 = Class23_Sub27.aClass84_2483;
					}
					if (Class107.aDouble1838 == 6.0) {
						class84 = Class23_Sub25.aClass84_2463;
					}
					if (Class107.aDouble1838 == 8.0) {
						class84 = Class23_Sub8.aClass84_2244;
					}
				}
				if (class84 != null) {
					RSString[] class16s = class23_sub21.aClass16Array2408;
					int i_89_ = class16s.length;
					i_86_ -= class84.method1384() * (i_89_ + -1) / 2;
					i_86_ += class84.method1386() / 2;
					for (int i_90_ = 0; (i_89_ ^ 0xffffffff) < (i_90_ ^ 0xffffffff); i_90_++) {
						class84.method1388(class16s[i_90_], i_85_, i_86_, i_87_, true);
						i_86_ += class84.method1384();
					}
				}
			}
		}
		for (Class23_Sub11 class23_sub11 = (Class23_Sub11) Class42.aClass89_658.method1437(1); class23_sub11 != null; class23_sub11 = (Class23_Sub11) Class42.aClass89_658.method1431((byte) -89)) {
			Class23.aClass23_Sub13_Sub10_Sub1Array350[class23_sub11.anInt2280].method694(class23_sub11.anInt2289 - 7, class23_sub11.anInt2285 - 7);
			Class20.method201(class23_sub11.anInt2289, class23_sub11.anInt2285, 15, 16776960, 128);
			Class20.method201(class23_sub11.anInt2289, class23_sub11.anInt2285, 7, 16777215, 256);
		}
		Class42.aClass89_658.method1435(95);
	}
	
	static {
		aClass23_Sub5_Sub1_3711 = new Class23_Sub5_Sub1(5000);
	}
}
