/* Class23_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub1 extends Class23_Sub4
{
	private int anInt2879 = 0;
	private int anInt2880 = 0;
	static Class43[] aClass43Array2881;
	static int anInt2882;
	static int anInt2883;
	static int anInt2884;
	private static RSString aClass16_2885;
	private int anInt2886 = 0;
	static RSString aClass16_2887;
	static Class84 aClass84_2888;
	private static RSString aClass16_2889;
	static int[] anIntArray2890;
	private int anInt2891;
	static int anInt2892;
	static int anInt2893;
	static Class23_Sub13_Sub26 aClass23_Sub13_Sub26_2894;
	private int anInt2895;
	static RSString aClass16_2896 = Class38_Sub6.method1076((byte) 86, "<col=ffffff>");
	private int anInt2897;
	static RSString aClass16_2898;
	static int anInt2899;
	static int anInt2900;
	static RSString aClass16_2901;
	private int anInt2902;
	static RSString aClass16_2903;
	static int anInt2904;
	private int anInt2905;
	static RSString aClass16_2906;
	private static RSString aClass16_2907;
	static int anInt2908;
	private int anInt2909;
	static int anInt2910;
	
	final int[][] method258(int i, byte b) {
		if (b != 9) {
			anIntArray2890 = null;
		}
		int[][] is = aClass103_2108.method1518(-29659, i);
		anInt2910++;
		if (aClass103_2108.aBoolean1733) {
			int[][] is_0_ = this.method256(0, (byte) -111, i);
			int[] is_1_ = is_0_[0];
			int[] is_2_ = is_0_[2];
			int[] is_3_ = is_0_[1];
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			for (int i_7_ = 0; Class23_Sub4_Sub33.anInt3428 > i_7_; i_7_++) {
				method274(is_2_[i_7_], is_3_[i_7_], is_1_[i_7_], true);
				anInt2897 += anInt2879;
				anInt2902 += anInt2880;
				anInt2905 += anInt2886;
				if (anInt2902 < 0) {
					anInt2902 = 0;
				}
				if ((anInt2897 ^ 0xffffffff) > -1) {
					anInt2897 = 0;
				}
				if (anInt2902 > 4096) {
					anInt2902 = 4096;
				}
				if (anInt2897 > 4096) {
					anInt2897 = 4096;
				}
				for (/**/; (anInt2905 ^ 0xffffffff) > -1; anInt2905 += 4096) {
					/* empty */
				}
				for (/**/; anInt2905 > 4096; anInt2905 -= 4096) {
					/* empty */
				}
				method268(anInt2902, anInt2897, (byte) 39, anInt2905);
				is_4_[i_7_] = anInt2909;
				is_5_[i_7_] = anInt2891;
				is_6_[i_7_] = anInt2895;
			}
		}
		return is;
	}
	
	private final void method268(int i, int i_8_, byte b, int i_9_) {
		anInt2893++;
		int i_10_ = i_8_ <= 2048 ? i_8_ * (i + 4096) >> 12 : -(i * i_8_ >> 12) + i_8_ + i;
	while_3_:
		do {
			if (i_10_ > 0) {
				i_9_ *= 6;
				int i_11_ = i_8_ + (i_8_ + -i_10_);
				int i_12_ = i_9_ >> 12;
				int i_13_ = (i_10_ + -i_11_ << 12) / i_10_;
				int i_14_ = i_10_;
				int i_15_ = i_9_ + -(i_12_ << 12);
				i_14_ = i_13_ * i_14_ >> 12;
				i_14_ = i_14_ * i_15_ >> 12;
				int i_16_ = -i_14_ + i_10_;
				int i_17_ = i_11_ + i_14_;
				int i_18_ = i_12_;
			while_2_:
				do {
				while_1_:
					do {
					while_0_:
						do {
							do {
								if (i_18_ != 0) {
									if (i_18_ != 1) {
										if (i_18_ != 2) {
											if (i_18_ != 3) {
												if (i_18_ != 4) {
													if (i_18_ != 5) {
														break while_3_;
													}
												} else {
													break while_1_;
												}
												break while_2_;
											}
										} else {
											break;
										}
										break while_0_;
									}
								} else {
									anInt2895 = i_11_;
									anInt2891 = i_17_;
									anInt2909 = i_10_;
									break while_3_;
								}
								anInt2895 = i_11_;
								anInt2891 = i_10_;
								anInt2909 = i_16_;
								break while_3_;
							} while (false);
							anInt2909 = i_11_;
							anInt2895 = i_17_;
							anInt2891 = i_10_;
							break while_3_;
						} while (false);
						anInt2895 = i_10_;
						anInt2909 = i_11_;
						anInt2891 = i_16_;
						break while_3_;
					} while (false);
					anInt2891 = i_11_;
					anInt2909 = i_17_;
					anInt2895 = i_10_;
					break while_3_;
				} while (false);
				anInt2909 = i_10_;
				anInt2895 = i_16_;
				anInt2891 = i_11_;
			} else {
				anInt2909 = anInt2891 = anInt2895 = i_8_;
			}
		} while (false);
		if (b != 39) {
			anInt2909 = 125;
		}
	}
	
	static final void method269(int i) {
		anInt2904++;
		int i_19_ = -64 % ((8 - i) / 47);
		if (Class7.aBoolean170 && Class23_Sub4_Sub7.anInt3025 != Class23_Sub13_Sub11.anInt3916) {
			Class23_Sub4_Sub19.method342(Class23_Sub13_Sub11.anInt3916, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 31362, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], Class64.anInt1138, Class23_Sub4_Sub23.anInt3279);
		} else if ((Class63.anInt994 ^ 0xffffffff) != (Class23_Sub13_Sub11.anInt3916 ^ 0xffffffff)) {
			Class63.anInt994 = Class23_Sub13_Sub11.anInt3916;
			Class23_Sub13_Sub22.method838(Class23_Sub13_Sub11.anInt3916, (byte) 75);
		}
	}
	
	static final void method270(byte b, int i) {
		int i_20_ = 256;
		Class23_Sub17.anInt2372 += 128 * i;
		if ((Class23_Sub17.anInt2372 ^ 0xffffffff) < (Class87_Sub4.anIntArray2828.length ^ 0xffffffff)) {
			int i_21_ = (int) (Math.random() * 12.0);
			Class23_Sub17.anInt2372 -= Class87_Sub4.anIntArray2828.length;
			Class23_Sub4_Sub39.method424(Class72.aClass43_Sub1Array1303[i_21_], (byte) 120);
		}
		anInt2883++;
		if (b < 111) {
			method270((byte) -1, 66);
		}
		int i_22_ = 0;
		int i_23_ = (i_20_ + -i) * 128;
		int i_24_ = 128 * i;
		for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff); i_25_++) {
			int i_26_ = Class23_Sub4_Sub19.anIntArray3224[i_22_ - -i_24_] - Class87_Sub4.anIntArray2828[Class23_Sub17.anInt2372 + i_22_ & Class87_Sub4.anIntArray2828.length + -1] * i / 6;
			if ((i_26_ ^ 0xffffffff) > -1) {
				i_26_ = 0;
			}
			Class23_Sub4_Sub19.anIntArray3224[i_22_++] = i_26_;
		}
		for (int i_27_ = i_20_ - i; i_20_ > i_27_; i_27_++) {
			int i_28_ = i_27_ * 128;
			for (int i_29_ = 0; i_29_ < 128; i_29_++) {
				int i_30_ = (int) (100.0 * Math.random());
				if (i_30_ >= 50 || i_29_ <= 10 || i_29_ >= 118) {
					Class23_Sub4_Sub19.anIntArray3224[i_29_ - -i_28_] = 0;
				} else {
					Class23_Sub4_Sub19.anIntArray3224[i_28_ + i_29_] = 255;
				}
			}
		}
		if (Class23_Sub13_Sub7.anInt3784 > 0) {
			Class23_Sub13_Sub7.anInt3784 -= i * 4;
		}
		if (Class23_Sub11.anInt2281 > 0) {
			Class23_Sub11.anInt2281 -= i * 4;
		}
		if (Class23_Sub13_Sub7.anInt3784 == 0 && (Class23_Sub11.anInt2281 ^ 0xffffffff) == -1) {
			int i_31_ = (int) (Math.random() * (double) (2000 / i));
			if (i_31_ == 0) {
				Class23_Sub13_Sub7.anInt3784 = 1024;
			}
			if (i_31_ == 1) {
				Class23_Sub11.anInt2281 = 1024;
			}
		}
		for (int i_32_ = 0; -i + i_20_ > i_32_; i_32_++)
			Class32.anIntArray501[i_32_] = Class32.anIntArray501[i_32_ - -i];
		for (int i_33_ = -i + i_20_; i_33_ < i_20_; i_33_++) {
			Class32.anIntArray501[i_33_] = (int) (Math.sin((double) Class23_Sub13_Sub26.anInt4305 / 14.0) * 16.0 + 14.0 * Math.sin((double) Class23_Sub13_Sub26.anInt4305 / 15.0) + 12.0 * Math.sin((double) Class23_Sub13_Sub26.anInt4305 / 16.0));
			Class23_Sub13_Sub26.anInt4305++;
		}
		Class23_Sub13_Sub6.anInt3734 += i;
		int i_34_ = ((0x1 & Class89.anInt1511) + i) / 2;
		if (i_34_ > 0) {
			for (int i_35_ = 0; i_35_ < Class23_Sub13_Sub6.anInt3734 * 100; i_35_++) {
				int i_36_ = (int) (124.0 * Math.random()) + 2;
				int i_37_ = 128 + (int) (128.0 * Math.random());
				Class23_Sub4_Sub19.anIntArray3224[(i_37_ << 7) + i_36_] = 192;
			}
			Class23_Sub13_Sub6.anInt3734 = 0;
			for (int i_38_ = 0; i_38_ < i_20_; i_38_++) {
				int i_39_ = 128 * i_38_;
				int i_40_ = 0;
				for (int i_41_ = -i_34_; i_41_ < 128; i_41_++) {
					if (i_34_ + i_41_ < 128) {
						i_40_ += Class23_Sub4_Sub19.anIntArray3224[i_34_ + i_41_ - -i_39_];
					}
					if ((-i_34_ + (-1 + i_41_) ^ 0xffffffff) <= -1) {
						i_40_ -= Class23_Sub4_Sub19.anIntArray3224[i_39_ + i_41_ - (i_34_ + 1)];
					}
					if ((i_41_ ^ 0xffffffff) <= -1) {
						Class71_Sub2_Sub1.anIntArray4473[i_39_ + i_41_] = i_40_ / (1 + 2 * i_34_);
					}
				}
			}
			for (int i_42_ = 0; i_42_ < 128; i_42_++) {
				int i_43_ = 0;
				for (int i_44_ = -i_34_; (i_44_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff); i_44_++) {
					int i_45_ = i_44_ * 128;
					if (i_20_ > i_34_ + i_44_) {
						i_43_ += Class71_Sub2_Sub1.anIntArray4473[128 * i_34_ + i_42_ - -i_45_];
					}
					if ((i_44_ + (-i_34_ - 1) ^ 0xffffffff) <= -1) {
						i_43_ -= Class71_Sub2_Sub1.anIntArray4473[i_42_ + i_45_ + (-128 + -(128 * i_34_))];
					}
					if ((i_44_ ^ 0xffffffff) <= -1) {
						Class23_Sub4_Sub19.anIntArray3224[i_42_ - -i_45_] = i_43_ / (2 * i_34_ - -1);
					}
				}
			}
		}
	}
	
	final void method255(Buffer class23_sub5, int i, int i_46_) {
		anInt2908++;
		if (i_46_ == 1000) {
			int i_47_ = i;
		while_4_:
			do {
				do {
					if ((i_47_ ^ 0xffffffff) != -1) {
						if (i_47_ != 1) {
							if (i_47_ == 2) {
								break;
							}
							break while_4_;
						}
					} else {
						anInt2886 = class23_sub5.method474(true);
						return;
					}
					anInt2880 = (class23_sub5.method452(-16933672) << 12) / 100;
					return;
				} while (false);
				anInt2879 = (class23_sub5.method452(i_46_ ^ ~0x10260cf) << 12) / 100;
			} while (false);
		}
	}
	
	public Class23_Sub4_Sub1() {
		super(1, false);
	}
	
	static final RSString method271(int i, byte b, int i_48_) {
		anInt2884++;
		int i_49_ = i - i_48_;
		if (i_49_ < -9) {
			return Class100.aClass16_1684;
		}
		if (i_49_ < -6) {
			return Class91.aClass16_1552;
		}
		if (b != -15) {
			aClass16_2907 = null;
		}
		if (i_49_ < -3) {
			return Class23_Sub17.aClass16_2371;
		}
		if ((i_49_ ^ 0xffffffff) > -1) {
			return Class23_Sub4_Sub31.aClass16_3388;
		}
		if (i_49_ > 9) {
			return Class23_Sub4_Sub35.aClass16_3458;
		}
		if (i_49_ > 6) {
			return Class23_Sub10_Sub3.aClass16_3659;
		}
		if (i_49_ > 3) {
			return Class42.aClass16_651;
		}
		if (i_49_ > 0) {
			return Class104.aClass16_1739;
		}
		return Class23_Sub7.aClass16_2200;
	}
	
	public static void method272(byte b) {
		aClass23_Sub13_Sub26_2894 = null;
		aClass43Array2881 = null;
		aClass16_2901 = null;
		aClass16_2907 = null;
		aClass16_2889 = null;
		aClass84_2888 = null;
		if (b >= 36) {
			aClass16_2885 = null;
			aClass16_2898 = null;
			aClass16_2896 = null;
			aClass16_2903 = null;
			aClass16_2906 = null;
			anIntArray2890 = null;
			aClass16_2887 = null;
		}
	}
	
	static final void method273(Class64 class64, byte b, int i, int i_50_) {
		anInt2900++;
		if (Class23_Sub4_Sub8.aClass64_3028 == null && !Class53.aBoolean840) {
			if (b > -92) {
				aClass16_2906 = null;
			}
			if (class64 != null && Class23_Sub13_Sub9.method690(class64, 38) != null) {
				Class23_Sub4_Sub8.aClass64_3028 = class64;
				Class64.aClass64_1102 = Class23_Sub13_Sub9.method690(class64, -36);
				Class23_Sub4_Sub10.anInt3059 = i_50_;
				Class17.anInt304 = 0;
				Class17_Sub1.aBoolean2003 = false;
				Class23_Sub13_Sub15.anInt4034 = i;
			}
		}
	}
	
	private final void method274(int i, int i_51_, int i_52_, boolean bool) {
		anInt2882++;
		int i_53_ = i_52_ < i_51_ ? i_52_ : i_51_;
		i_53_ = (i ^ 0xffffffff) > (i_53_ ^ 0xffffffff) ? i : i_53_;
		int i_54_ = i_52_ > i_51_ ? i_52_ : i_51_;
		i_54_ = (i ^ 0xffffffff) < (i_54_ ^ 0xffffffff) ? i : i_54_;
		if (bool != true) {
			method272((byte) -19);
		}
		anInt2897 = (i_54_ + i_53_) / 2;
		int i_55_ = -i_53_ + i_54_;
		if ((i_55_ ^ 0xffffffff) < -1) {
			int i_56_ = (-i_51_ + i_54_ << 12) / i_55_;
			int i_57_ = (i_54_ + -i_52_ << 12) / i_55_;
			int i_58_ = (i_54_ - i << 12) / i_55_;
			if (i_52_ == i_54_) {
				anInt2905 = (i_51_ ^ 0xffffffff) == (i_53_ ^ 0xffffffff) ? 20480 - -i_58_ : -i_56_ + 4096;
			} else if ((i_51_ ^ 0xffffffff) != (i_54_ ^ 0xffffffff)) {
				anInt2905 = (i_53_ ^ 0xffffffff) != (i_52_ ^ 0xffffffff) ? 20480 - i_57_ : i_56_ + 12288;
			} else {
				anInt2905 = (i ^ 0xffffffff) == (i_53_ ^ 0xffffffff) ? 4096 - -i_57_ : 12288 - i_58_;
			}
			anInt2905 /= 6;
		} else {
			anInt2905 = 0;
		}
		if (anInt2897 <= 0 || anInt2897 >= 4096) {
			anInt2902 = 0;
		} else {
			anInt2902 = (i_55_ << 12) / (anInt2897 > 2048 ? -(2 * anInt2897) + 8192 : anInt2897 * 2);
		}
	}
	
	static {
		aClass16_2887 = Class38_Sub6.method1076((byte) 86, "sl_arrows");
		aClass16_2885 = Class38_Sub6.method1076((byte) 86, "Please wait )2 attempting to reestablish)3");
		aClass16_2901 = Class38_Sub6.method1076((byte) 86, "Ein kostenloses Spielkonto erstellen)3");
		aClass16_2889 = Class38_Sub6.method1076((byte) 86, "Error connecting to server)3");
		aClass16_2898 = aClass16_2885;
		aClass16_2907 = Class38_Sub6.method1076((byte) 86, "Existing User");
		aClass16_2906 = aClass16_2907;
		aClass16_2903 = aClass16_2889;
	}
}
