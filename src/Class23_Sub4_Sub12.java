/* Class23_Sub4_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub12 extends Class23_Sub4
{
	private byte[] aByteArray3074;
	static int anInt3075 = 0;
	static int anInt3076;
	static int anInt3077;
	static int anInt3078;
	private int anInt3079;
	static int[][][] anIntArrayArrayArray3080;
	private int anInt3081;
	static int anInt3082;
	private short[] aShortArray3083;
	static int anInt3084;
	private int anInt3085 = 1638;
	static int anInt3086;
	static int anInt3087;
	static int anInt3088;
	static int anInt3089 = -8 + (int) (Math.random() * 17.0);
	static int anInt3090;
	private short[] aShortArray3091;
	private boolean aBoolean3092;
	private int anInt3093;
	private int anInt3094;
	
	final int[] method260(int i, int i_0_) {
		int[] is = aClass99_2115.method1500(i_0_, (byte) -111);
		if (i != 0) {
			anInt3093 = 29;
		}
		anInt3086++;
		if (aClass99_2115.aBoolean1681) {
			method309(i_0_, is, 2000000);
		}
		return is;
	}
	
	public Class23_Sub4_Sub12() {
		super(0, true);
		aByteArray3074 = new byte[512];
		aBoolean3092 = true;
		anInt3081 = 4;
		anInt3079 = 4;
		anInt3094 = 4;
		anInt3093 = 0;
	}
	
	private final void method309(int i, int[] is, int i_1_) {
		anInt3076++;
		int i_2_ = anInt3081 * Class23_Sub13_Sub16.anIntArray4049[i];
		if (i_1_ != 2000000) {
			anInt3089 = 23;
		}
		if (anInt3079 != 1) {
			int i_3_ = aShortArray3091[0];
			if (i_3_ > 8 || i_3_ < -8) {
				int i_4_ = aShortArray3083[0] << 12;
				int i_5_ = i_4_ * i_2_ >> 12;
				int i_6_ = anInt3081 * i_4_ >> 12;
				int i_7_ = i_5_ >> 12;
				int i_8_ = i_7_ + 1;
				if (i_6_ <= i_8_) {
					i_8_ = 0;
				}
				int i_9_ = i_4_ * anInt3094 >> 12;
				int i_10_ = aByteArray3074[0xff & i_7_] & 0xff;
				int i_11_ = aByteArray3074[0xff & i_8_] & 0xff;
				i_5_ &= 0xfff;
				int i_12_ = Class23_Sub4_Sub4.anIntArray2954[i_5_];
				for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_13_++) {
					int i_14_ = anInt3094 * Class61.anIntArray967[i_13_];
					int i_15_ = method310(i_1_ ^ 0x1ee8b2, i_14_ * i_4_ >> 12, i_9_, i_11_, i_5_, i_12_, i_10_);
					is[i_13_] = i_15_ * i_3_ >> 12;
				}
			}
			for (int i_16_ = 1; (anInt3079 ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				i_3_ = aShortArray3091[i_16_];
				if (i_3_ > 8 || i_3_ < -8) {
					int i_17_ = aShortArray3083[i_16_] << 12;
					int i_18_ = i_17_ * anInt3094 >> 12;
					int i_19_ = anInt3081 * i_17_ >> 12;
					int i_20_ = i_2_ * i_17_ >> 12;
					int i_21_ = i_20_ >> 12;
					int i_22_ = aByteArray3074[0xff & i_21_] & 0xff;
					i_20_ &= 0xfff;
					int i_23_ = Class23_Sub4_Sub4.anIntArray2954[i_20_];
					int i_24_ = 1 + i_21_;
					if (i_24_ >= i_19_) {
						i_24_ = 0;
					}
					int i_25_ = aByteArray3074[i_24_ & 0xff] & 0xff;
					if (aBoolean3092 && (-1 + anInt3079 ^ 0xffffffff) == (i_16_ ^ 0xffffffff)) {
						for (int i_26_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
							int i_27_ = anInt3094 * Class61.anIntArray967[i_26_];
							int i_28_ = method310(27698, i_17_ * i_27_ >> 12, i_18_, i_25_, i_20_, i_23_, i_22_);
							i_28_ = is[i_26_] - -(i_3_ * i_28_ >> 12);
							is[i_26_] = 2048 + (i_28_ >> 1);
						}
					} else {
						for (int i_29_ = 0; Class23_Sub4_Sub33.anInt3428 > i_29_; i_29_++) {
							int i_30_ = anInt3094 * Class61.anIntArray967[i_29_];
							int i_31_ = method310(27698, i_17_ * i_30_ >> 12, i_18_, i_25_, i_20_, i_23_, i_22_);
							is[i_29_] += i_31_ * i_3_ >> 12;
						}
					}
				}
			}
		} else {
			int i_32_ = aShortArray3083[0] << 12;
			int i_33_ = i_32_ * anInt3081 >> 12;
			int i_34_ = i_32_ * anInt3094 >> 12;
			int i_35_ = i_2_ * i_32_ >> 12;
			int i_36_ = aShortArray3091[0];
			int i_37_ = i_35_ >> 12;
			i_35_ &= 0xfff;
			int i_38_ = 1 + i_37_;
			int i_39_ = Class23_Sub4_Sub4.anIntArray2954[i_35_];
			if ((i_38_ ^ 0xffffffff) <= (i_33_ ^ 0xffffffff)) {
				i_38_ = 0;
			}
			int i_40_ = 0xff & aByteArray3074[0xff & i_37_];
			int i_41_ = aByteArray3074[0xff & i_38_] & 0xff;
			if (!aBoolean3092) {
				for (int i_42_ = 0; Class23_Sub4_Sub33.anInt3428 > i_42_; i_42_++) {
					int i_43_ = Class61.anIntArray967[i_42_] * anInt3094;
					int i_44_ = method310(27698, i_32_ * i_43_ >> 12, i_34_, i_41_, i_35_, i_39_, i_40_);
					is[i_42_] = i_36_ * i_44_ >> 12;
				}
			} else {
				for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_45_++) {
					int i_46_ = anInt3094 * Class61.anIntArray967[i_45_];
					int i_47_ = method310(i_1_ ^ 0x1ee8b2, i_32_ * i_46_ >> 12, i_34_, i_41_, i_35_, i_39_, i_40_);
					i_47_ = i_36_ * i_47_ >> 12;
					is[i_45_] = (i_47_ >> 1) + 2048;
				}
			}
		}
	}
	
	private final int method310(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_) {
		anInt3077++;
		if (i != 27698) {
			return 127;
		}
		int i_54_ = -4096 + i_51_;
		int i_55_ = i_48_ >> 12;
		int i_56_ = i_55_ + 1;
		if (i_49_ <= i_56_) {
			i_56_ = 0;
		}
		i_48_ &= 0xfff;
		i_56_ &= 0xff;
		i_55_ &= 0xff;
		int i_57_ = i_48_ + -4096;
		int i_58_ = aByteArray3074[i_53_ + i_55_] & 0x3;
		int i_59_ = Class23_Sub4_Sub4.anIntArray2954[i_48_];
		int i_60_;
		if (i_58_ <= 1) {
			i_60_ = (i_58_ ^ 0xffffffff) != -1 ? -i_48_ + i_51_ : i_51_ + i_48_;
		} else {
			i_60_ = i_58_ != 2 ? -i_48_ - i_51_ : -i_51_ + i_48_;
		}
		i_58_ = aByteArray3074[i_56_ + i_53_] & 0x3;
		int i_61_;
		if (i_58_ > 1) {
			i_61_ = i_58_ == 2 ? -i_51_ + i_57_ : -i_57_ + -i_51_;
		} else {
			i_61_ = i_58_ == 0 ? i_51_ + i_57_ : -i_57_ + i_51_;
		}
		i_58_ = aByteArray3074[i_55_ + i_50_] & 0x3;
		int i_62_ = i_60_ + ((i_61_ - i_60_) * i_59_ >> 12);
		if (i_58_ > 1) {
			i_60_ = i_58_ != 2 ? -i_54_ + -i_48_ : i_48_ + -i_54_;
		} else {
			i_60_ = (i_58_ ^ 0xffffffff) != -1 ? -i_48_ + i_54_ : i_48_ + i_54_;
		}
		i_58_ = aByteArray3074[i_56_ - -i_50_] & 0x3;
		if (i_58_ <= 1) {
			i_61_ = (i_58_ ^ 0xffffffff) == -1 ? i_57_ - -i_54_ : i_54_ + -i_57_;
		} else {
			i_61_ = i_58_ == 2 ? -i_54_ + i_57_ : -i_54_ + -i_57_;
		}
		int i_63_ = i_60_ + (i_59_ * (-i_60_ + i_61_) >> 12);
		return (i_52_ * (i_63_ + -i_62_) >> 12) + i_62_;
	}
	
	static final void method311(boolean bool) {
		if (!Class23_Sub13_Sub8_Sub1.aBooleanArray4492[96]) {
			if (!Class23_Sub13_Sub8_Sub1.aBooleanArray4492[97]) {
				Class23_Sub10_Sub3.anInt3660 /= 2;
			} else {
				Class23_Sub10_Sub3.anInt3660 += (24 - Class23_Sub10_Sub3.anInt3660) / 2;
			}
		} else {
			Class23_Sub10_Sub3.anInt3660 += (-24 + -Class23_Sub10_Sub3.anInt3660) / 2;
		}
		anInt3088++;
		Class35.anInt550 += Class23_Sub10_Sub3.anInt3660 / 2;
		if (!Class23_Sub13_Sub8_Sub1.aBooleanArray4492[98]) {
			if (Class23_Sub13_Sub8_Sub1.aBooleanArray4492[99]) {
				Class23_Sub8.anInt2251 += (-12 + -Class23_Sub8.anInt2251) / 2;
			} else {
				Class23_Sub8.anInt2251 /= 2;
			}
		} else {
			Class23_Sub8.anInt2251 += (-Class23_Sub8.anInt2251 + 12) / 2;
		}
		Class23_Sub4_Sub37.anInt3492 += Class23_Sub8.anInt2251 / 2;
		int i = Class87_Sub4.anInt2841 + Class105.aClass38_Sub7_Sub2_1812.anInt2674;
		int i_64_ = Class106.anInt1815 + Class105.aClass38_Sub7_Sub2_1812.anInt2659;
		if (-i + Class23_Sub4_Sub26.anInt3318 < -500 || -i + Class23_Sub4_Sub26.anInt3318 > 500 || -i_64_ + Class2.anInt82 < -500 || -i_64_ + Class2.anInt82 > 500) {
			Class2.anInt82 = i_64_;
			Class23_Sub4_Sub26.anInt3318 = i;
		}
		if (i != Class23_Sub4_Sub26.anInt3318) {
			Class23_Sub4_Sub26.anInt3318 += (-Class23_Sub4_Sub26.anInt3318 + i) / 16;
		}
		if (i_64_ != Class2.anInt82) {
			Class2.anInt82 += (-Class2.anInt82 + i_64_) / 16;
		}
		Class106.method1576((byte) 50);
		if (bool != true) {
			anIntArrayArrayArray3080 = null;
		}
	}
	
	final void method255(Buffer class23_sub5, int i, int i_65_) {
		if (i_65_ != 1000) {
			anInt3075 = 53;
		}
		anInt3078++;
		int i_66_ = i;
	while_33_:
		do {
		while_32_:
			do {
			while_31_:
				do {
				while_30_:
					do {
					while_29_:
						do {
							do {
								if (i_66_ != 0) {
									if (i_66_ != 1) {
										if (i_66_ != 2) {
											if (i_66_ != 3) {
												if (i_66_ != 4) {
													if (i_66_ != 5) {
														if (i_66_ == 6) {
															break while_32_;
														}
														break while_33_;
													}
												} else {
													break while_30_;
												}
												break while_31_;
											}
										} else {
											break;
										}
										break while_29_;
									}
								} else {
									aBoolean3092 = class23_sub5.method461(-1797813752) == 1;
									return;
								}
								anInt3079 = class23_sub5.method461(-1797813752);
								return;
							} while (false);
							anInt3085 = class23_sub5.method474(true);
							if (anInt3085 < 0) {
								aShortArray3091 = new short[anInt3079];
								for (i_66_ = 0; (anInt3079 ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_++)
									aShortArray3091[i_66_] = (short) class23_sub5.method474(true);
							}
							break while_33_;
						} while (false);
						anInt3094 = anInt3081 = class23_sub5.method461(-1797813752);
						return;
					} while (false);
					anInt3093 = class23_sub5.method461(-1797813752);
					return;
				} while (false);
				anInt3094 = class23_sub5.method461(-1797813752);
				return;
			} while (false);
			anInt3081 = class23_sub5.method461(i_65_ ^ ~0x6b28761f);
		} while (false);
	}
	
	public static void method312(int i) {
		anIntArrayArrayArray3080 = null;
		if (i != 6) {
			anInt3075 = -102;
		}
	}
	
	static final void method313(int i, boolean bool) {
		anInt3087++;
		if (i != -1 && Class17.method189(-10924, i)) {
			Class64[] class64s = Class23_Sub4_Sub28.aClass64ArrayArray3350[i];
			int i_67_ = 0;
			if (bool == true) {
				for (/**/; (class64s.length ^ 0xffffffff) < (i_67_ ^ 0xffffffff); i_67_++) {
					Class64 class64 = class64s[i_67_];
					if (class64.anObjectArray1113 != null) {
						Class23_Sub9 class23_sub9 = new Class23_Sub9();
						class23_sub9.anObjectArray2274 = class64.anObjectArray1113;
						class23_sub9.aClass64_2263 = class64;
						Class23_Sub23.method896(2000000, class23_sub9, true);
					}
				}
			}
		}
	}
	
	private final void method314(byte b) {
		if ((anInt3085 ^ 0xffffffff) >= -1) {
			if (aShortArray3091 != null && (aShortArray3091.length ^ 0xffffffff) == (anInt3079 ^ 0xffffffff)) {
				aShortArray3083 = new short[anInt3079];
				for (int i = 0; i < anInt3079; i++)
					aShortArray3083[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else {
			aShortArray3083 = new short[anInt3079];
			aShortArray3091 = new short[anInt3079];
			for (int i = 0; (i ^ 0xffffffff) > (anInt3079 ^ 0xffffffff); i++) {
				aShortArray3091[i] = (short) (int) (4096.0 * Math.pow((double) ((float) anInt3085 / 4096.0F), (double) i));
				aShortArray3083[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		}
		if (b != 107) {
			method312(-37);
		}
		anInt3082++;
	}
	
	final void method265(int i) {
		anInt3084++;
		aByteArray3074 = Class92.method1460(anInt3093, true);
		method314((byte) 107);
		for (int i_68_ = anInt3079 - 1; i_68_ >= 1; i_68_--) {
			short s = aShortArray3091[i_68_];
			if (s > 8 || s < -8) {
				break;
			}
			anInt3079--;
		}
		if (i != -21746) {
			anInt3093 = 26;
		}
	}
}
