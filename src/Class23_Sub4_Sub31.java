/* Class23_Sub4_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub31 extends Class23_Sub4
{
	private int anInt3387;
	static RSString aClass16_3388 = Class38_Sub6.method1076((byte) 86, "<col=ffb000>");
	private int[] anIntArray3389;
	static int anInt3390;
	static int anInt3391;
	static int anInt3392;
	static int anInt3393;
	static int anInt3394;
	static int anInt3395;
	static int anInt3396;
	static int anInt3397;
	private int anInt3398 = -1;
	static int[] anIntArray3399 = new int[500];
	static int anInt3400;
	static int anInt3401;
	static int anInt3402;
	static RSString aClass16_3403 = Class38_Sub6.method1076((byte) 86, "<br>(X100(U(Y");
	static int anInt3404;
	private int anInt3405;
	
	static final void constructMapRegion(boolean bool, int i) {
		if (i >= -29) {
			anInt3396 = 96;
		}
		anInt3390++;
		Class23_Sub13_Sub26.aBoolean4298 = bool;
		if (Class23_Sub13_Sub26.aBoolean4298) {
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method487(0);
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
				for (int i_13_ = 0; i_13_ < 13; i_13_++) {
					for (int i_14_ = 0; i_14_ < 13; i_14_++) {
						int i_15_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 110, 1);
						if (i_15_ != 1) {
							Class94.anIntArrayArrayArray1602[i_12_][i_13_][i_14_] = -1;
						} else {
							Class94.anIntArrayArrayArray1602[i_12_][i_13_][i_14_] = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 123, 26);
						}
					}
				}
			}
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method485(-113);
			int i_16_ = (-Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos + Class23_Sub4_Sub2.anInt2925) / 16;
			Class23_Sub2.anIntArrayArray2054 = new int[i_16_][4];
			for (int i_17_ = 0; (i_16_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
				for (int i_18_ = 0; i_18_ < 4; i_18_++)
					Class23_Sub2.anIntArrayArray2054[i_17_][i_18_] = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readUIntBE();
			}
			int i_19_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			int i_20_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
			int i_21_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.getUShortBE();
			int i_22_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			int i_23_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readUByte();
			Class53.aByteArrayArray843 = new byte[i_16_][];
			Class23_Sub4_Sub23.anIntArray3282 = new int[i_16_];
			Class23_Sub8.aByteArrayArray2235 = new byte[i_16_][];
			Class23_Sub13_Sub13.anIntArray3996 = new int[i_16_];
			Class23_Sub4_Sub33.anIntArray3431 = new int[i_16_];
			i_16_ = 0;
			for (int i_24_ = 0; i_24_ < 4; i_24_++) {
				for (int i_25_ = 0; i_25_ < 13; i_25_++) {
					for (int i_26_ = 0; i_26_ < 13; i_26_++) {
						int i_27_ = Class94.anIntArrayArrayArray1602[i_24_][i_25_][i_26_];
						if ((i_27_ ^ 0xffffffff) != 0) {
							int i_28_ = i_27_ >> 14 & 0x3ff;
							int i_29_ = (0x3ffd & i_27_) >> 3;
							int i_30_ = (i_28_ / 8 << 8) + i_29_ / 8;
							for (int i_31_ = 0; (i_16_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
								if ((i_30_ ^ 0xffffffff) == (Class23_Sub13_Sub13.anIntArray3996[i_31_] ^ 0xffffffff)) {
									i_30_ = -1;
									break;
								}
							}
							if ((i_30_ ^ 0xffffffff) != 0) {
								Class23_Sub13_Sub13.anIntArray3996[i_16_] = i_30_;
								int i_32_ = 0xff & i_30_ >> 8;
								int i_33_ = i_30_ & 0xff;
								Class23_Sub4_Sub23.anIntArray3282[i_16_] = Class38_Sub6.aClass105_Sub1_2613.method1540(107, Class23_Sub4_Sub14.method322(new RSString[] { client.aClass16_1961, Class23_Sub4_Sub23.method360((byte) -9, i_32_), Class38_Sub7_Sub1.aClass16_4369, Class23_Sub4_Sub23.method360((byte) -9, i_33_) }, -126));
								Class23_Sub4_Sub33.anIntArray3431[i_16_] = Class38_Sub6.aClass105_Sub1_2613.method1540(125, Class23_Sub4_Sub14.method322(new RSString[] { Class40.aClass16_632, Class23_Sub4_Sub23.method360((byte) -9, i_32_), Class38_Sub7_Sub1.aClass16_4369, Class23_Sub4_Sub23.method360((byte) -9, i_33_) }, -87));
								i_16_++;
							}
						}
					}
				}
			}
			Class23_Sub4_Sub19.method342(i_23_, i_20_, 31362, i_19_, i_21_, i_22_);
		} else {
			int i_0_ = (Class23_Sub4_Sub2.anInt2925 + -Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos) / 16;
			Class23_Sub2.anIntArrayArray2054 = new int[i_0_][4];
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
				for (int i_2_ = 0; i_2_ < 4; i_2_++)
					Class23_Sub2.anIntArrayArray2054[i_1_][i_2_] = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readUIntBE();
			}
			int i_3_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.getUShortBE();
			int i_4_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.getUShortBE();
			boolean bool_5_ = false;
			int i_6_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.getUShortBE();
			if ((i_4_ / 8 == 48 || i_4_ / 8 == 49) && i_3_ / 8 == 48) {
				bool_5_ = true;
			}
			int i_7_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readUByte();
			int i_8_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.getUShortBE();
			Class53.aByteArrayArray843 = new byte[i_0_][];
			if (i_4_ / 8 == 48 && i_3_ / 8 == 148) {
				bool_5_ = true;
			}
			Class23_Sub8.aByteArrayArray2235 = new byte[i_0_][];
			Class23_Sub4_Sub23.anIntArray3282 = new int[i_0_];
			Class23_Sub13_Sub13.anIntArray3996 = new int[i_0_];
			Class23_Sub4_Sub33.anIntArray3431 = new int[i_0_];
			i_0_ = 0;
			for (int i_9_ = (i_4_ - 6) / 8; (i_4_ - -6) / 8 >= i_9_; i_9_++) {
				for (int i_10_ = (i_3_ + -6) / 8; ((6 + i_3_) / 8 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff); i_10_++) {
					int i_11_ = (i_9_ << 8) - -i_10_;
					if (bool_5_ && (i_10_ == 49 || i_10_ == 149 || i_10_ == 147 || i_9_ == 50 || i_9_ == 49 && i_10_ == 47)) {
						Class23_Sub13_Sub13.anIntArray3996[i_0_] = i_11_;
						Class23_Sub4_Sub23.anIntArray3282[i_0_] = -1;
						Class23_Sub4_Sub33.anIntArray3431[i_0_] = -1;
					} else {
						Class23_Sub13_Sub13.anIntArray3996[i_0_] = i_11_;
						Class23_Sub4_Sub23.anIntArray3282[i_0_] = Class38_Sub6.aClass105_Sub1_2613.method1540(91, Class23_Sub4_Sub14.method322(new RSString[] { client.aClass16_1961, Class23_Sub4_Sub23.method360((byte) -9, i_9_), Class38_Sub7_Sub1.aClass16_4369, Class23_Sub4_Sub23.method360((byte) -9, i_10_) }, -98));
						Class23_Sub4_Sub33.anIntArray3431[i_0_] = Class38_Sub6.aClass105_Sub1_2613.method1540(73, Class23_Sub4_Sub14.method322(new RSString[] { Class40.aClass16_632, Class23_Sub4_Sub23.method360((byte) -9, i_9_), Class38_Sub7_Sub1.aClass16_4369, Class23_Sub4_Sub23.method360((byte) -9, i_10_) }, -33));
					}
					i_0_++;
				}
			}
			Class23_Sub4_Sub19.method342(i_7_, i_6_, 31362, i_8_, i_3_, i_4_);
		}
	}
	
	private final boolean method395(int i) {
		anInt3397++;
		if (anIntArray3389 != null) {
			return true;
		}
		if (i != 128) {
			method396(37, null);
		}
		if ((anInt3398 ^ 0xffffffff) <= -1) {
			int i_34_ = Class23_Sub4_Sub33.anInt3428;
			int i_35_ = Class102.anInt1706;
			int i_36_ = Class38.anInterface1_589.method7(anInt3398, false) ? 64 : 128;
			anIntArray3389 = Class38.anInterface1_589.method1(1, anInt3398);
			anInt3405 = i_36_;
			anInt3387 = i_36_;
			Class23_Sub4.method266(4096, i_34_, i_35_);
			if (anIntArray3389 == null) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_37_) {
		if ((i ^ 0xffffffff) == -1) {
			anInt3398 = class23_sub5.getUShortBE();
		}
		anInt3392++;
		if (i_37_ != 1000) {
			anInt3396 = 18;
		}
	}
	
	static final RSString[] method396(int i, RSString[] class16s) {
		anInt3395++;
		RSString[] class16s_38_ = new RSString[5];
		if (i != 30113) {
			method397(false);
		}
		for (int i_39_ = 0; i_39_ < 5; i_39_++) {
			class16s_38_[i_39_] = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub23.method360((byte) -9, i_39_), Class23_Sub16.aClass16_2351 }, i + -30210);
			if (class16s != null && class16s[i_39_] != null) {
				class16s_38_[i_39_] = Class23_Sub4_Sub14.method322(new RSString[] { class16s_38_[i_39_], class16s[i_39_] }, -35);
			}
		}
		return class16s_38_;
	}
	
	public static void method397(boolean bool) {
		aClass16_3403 = null;
		if (bool == true) {
			aClass16_3388 = null;
			anIntArray3399 = null;
		}
	}
	
	static final void method398(Class105 class105, Class105 class105_40_, int i, Class105 class105_41_) {
		anInt3391++;
		Class23_Sub4_Sub10.anInt3060 = class105_40_.method1540(103, Class14.aClass16_277);
		Class23_Sub14.anInt2338 = class105_41_.method1540(80, Class23_Sub4_Sub3.aClass16_2938);
		Class23_Sub13_Sub1.anInt3672 = class105_41_.method1540(119, Class88.aClass16_1498);
		Class23_Sub11.anInt2282 = class105_41_.method1540(88, Class23_Sub13_Sub3.aClass16_3701);
		Class23_Sub10_Sub2.anInt3617 = class105_41_.method1540(120, Class23_Sub4_Sub23_Sub1.aClass16_4482);
		Class23_Sub20.anInt2398 = class105_41_.method1540(117, Class23_Sub13_Sub6.aClass16_3733);
		Class23_Sub13_Sub1.anInt3671 = class105_41_.method1540(107, Class98.aClass16_1662);
		Class106.anInt1822 = class105_41_.method1540(68, Class23_Sub4_Sub2.aClass16_2921);
		Class39.anInt604 = class105_41_.method1540(95, Class23_Sub4_Sub1.aClass16_2887);
		int i_42_ = -51 % ((-31 - i) / 44);
		Class71.anInt1275 = class105_41_.method1540(82, Class23_Sub13.aClass16_2311);
		Class59.anInt935 = class105_41_.method1540(100, Class17.aClass16_303);
		Class23_Sub4_Sub3.anInt2940 = class105.method1540(118, oa.aClass16_1252);
	}
	
	public Class23_Sub4_Sub31() {
		super(0, false);
	}
	
	static final void method399(Class64[] class64s, int i, int i_43_, int i_44_, boolean bool) {
		for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > (class64s.length ^ 0xffffffff); i_45_++) {
			Class64 class64 = class64s[i_45_];
			if (class64 != null && (class64.anInt1056 ^ 0xffffffff) == (i_44_ ^ 0xffffffff)) {
				if (class64.aByte1034 != 0) {
					if (class64.aByte1034 == 1) {
						class64.anInt1128 = -class64.anInt1112 + i_43_;
					} else if (class64.aByte1034 != 2) {
						if (class64.aByte1034 == 3) {
							if (class64.anInt1003 != 2) {
								if (class64.anInt1003 == 7) {
									class64.anInt1128 = class64.anInt1112 * 115 - -(class64.anInt1046 * (-1 + class64.anInt1112));
								}
							} else {
								class64.anInt1128 = class64.anInt1046 * (-1 + class64.anInt1112) + 32 * class64.anInt1112;
							}
						}
					} else {
						class64.anInt1128 = i_43_ * class64.anInt1112 >> 14;
					}
				} else {
					class64.anInt1128 = class64.anInt1112;
				}
				if (class64.aByte1085 == 0) {
					class64.anInt999 = class64.anInt1105;
				} else if (class64.aByte1085 == 1) {
					class64.anInt999 = -class64.anInt1105 + i;
				} else if (class64.aByte1085 != 2) {
					if (class64.aByte1085 == 3) {
						if (class64.anInt1003 == 2) {
							class64.anInt999 = (class64.anInt1105 - 1) * class64.anInt998 + 32 * class64.anInt1105;
						} else if (class64.anInt1003 == 7) {
							class64.anInt999 = (-1 + class64.anInt1105) * class64.anInt998 + 12 * class64.anInt1105;
						}
					}
				} else {
					class64.anInt999 = i * class64.anInt1105 >> 14;
				}
				if (Class75.aBoolean1373 && (Class47.method1142(class64, 103) != 0 || class64.anInt1003 == 0)) {
					if (class64.anInt999 < 5 && class64.anInt1128 < 5) {
						class64.anInt1128 = 5;
						class64.anInt999 = 5;
					} else {
						if (class64.anInt999 <= 0) {
							class64.anInt999 = 5;
						}
						if ((class64.anInt1128 ^ 0xffffffff) >= -1) {
							class64.anInt1128 = 5;
						}
					}
				}
				if (class64.aByte1142 != 0) {
					if (class64.aByte1142 == 1) {
						class64.anInt1126 = class64.anInt1097 + (-class64.anInt999 + i) / 2;
					} else if (class64.aByte1142 == 2) {
						class64.anInt1126 = -class64.anInt999 + i - class64.anInt1097;
					} else if (class64.aByte1142 != 3) {
						if (class64.aByte1142 != 4) {
							class64.anInt1126 = -class64.anInt999 + i - (i * class64.anInt1097 >> 14);
						} else {
							class64.anInt1126 = (class64.anInt1097 * i >> 14) + (-class64.anInt999 + i) / 2;
						}
					} else {
						class64.anInt1126 = class64.anInt1097 * i >> 14;
					}
				} else {
					class64.anInt1126 = class64.anInt1097;
				}
				if ((class64.aByte1151 ^ 0xffffffff) == -1) {
					class64.anInt1120 = class64.anInt1124;
				} else if (class64.aByte1151 == 1) {
					class64.anInt1120 = (i_43_ + -class64.anInt1128) / 2 + class64.anInt1124;
				} else if (class64.aByte1151 != 2) {
					if (class64.aByte1151 != 3) {
						if (class64.aByte1151 == 4) {
							class64.anInt1120 = (i_43_ * class64.anInt1124 >> 14) + (-class64.anInt1128 + i_43_) / 2;
						} else {
							class64.anInt1120 = i_43_ + -class64.anInt1128 + -(class64.anInt1124 * i_43_ >> 14);
						}
					} else {
						class64.anInt1120 = class64.anInt1124 * i_43_ >> 14;
					}
				} else {
					class64.anInt1120 = -class64.anInt1128 + (i_43_ - class64.anInt1124);
				}
				if (Class75.aBoolean1373 && (Class47.method1142(class64, 105) != 0 || class64.anInt1003 == 0)) {
					if (class64.anInt1126 < 0) {
						class64.anInt1126 = 0;
					} else if ((class64.anInt999 + class64.anInt1126 ^ 0xffffffff) < (i ^ 0xffffffff)) {
						class64.anInt1126 = -class64.anInt999 + i;
					}
					if (class64.anInt1120 >= 0) {
						if (i_43_ < class64.anInt1120 - -class64.anInt1128) {
							class64.anInt1120 = i_43_ - class64.anInt1128;
						}
					} else {
						class64.anInt1120 = 0;
					}
				}
				if ((class64.anInt1088 - class64.anInt999 ^ 0xffffffff) > (class64.anInt1083 ^ 0xffffffff)) {
					class64.anInt1083 = class64.anInt1088 - class64.anInt999;
				}
				if ((class64.anInt1083 ^ 0xffffffff) > -1) {
					class64.anInt1083 = 0;
				}
				if (class64.anInt1129 + -class64.anInt1128 < class64.anInt1009) {
					class64.anInt1009 = class64.anInt1129 + -class64.anInt1128;
				}
				if ((class64.anInt1009 ^ 0xffffffff) > -1) {
					class64.anInt1009 = 0;
				}
				if (class64.anInt1003 == 0) {
					Class23_Sub4_Sub21.method351(class64, bool);
				}
			}
		}
		if (bool == true) {
			anInt3393++;
		}
	}
	
	final int[][] method258(int i, byte b) {
		anInt3404++;
		if (b != 9) {
			return null;
		}
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (aClass103_2108.aBoolean1733 && method395(128)) {
			int i_46_ = ((Class102.anInt1706 ^ 0xffffffff) == (anInt3405 ^ 0xffffffff) ? i : i * anInt3405 / Class102.anInt1706) * anInt3387;
			int[] is_47_ = is[1];
			int[] is_48_ = is[0];
			int[] is_49_ = is[2];
			if (anInt3387 == Class23_Sub4_Sub33.anInt3428) {
				for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_50_++) {
					int i_51_ = anIntArray3389[i_46_++];
					is_49_[i_50_] = Class24.method919(i_51_, 255) << 4;
					is_47_[i_50_] = Class24.method919(i_51_, 65280) >> 4;
					is_48_[i_50_] = Class24.method919(i_51_ >> 12, 4080);
				}
			} else {
				for (int i_52_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_52_ ^ 0xffffffff); i_52_++) {
					int i_53_ = anInt3387 * i_52_ / Class23_Sub4_Sub33.anInt3428;
					int i_54_ = anIntArray3389[i_53_ + i_46_];
					is_49_[i_52_] = Class24.method919(255, i_54_) << 4;
					is_47_[i_52_] = Class24.method919(i_54_ >> 4, 4080);
					is_48_[i_52_] = Class24.method919(4080, i_54_ >> 12);
				}
			}
		}
		return is;
	}
	
	final int method264(byte b) {
		if (b != 15) {
			aClass16_3388 = null;
		}
		anInt3402++;
		return anInt3398;
	}
	
	final void method254(int i) {
		anInt3401++;
		super.method254(i);
		anIntArray3389 = null;
	}
	
	static final int method400(int i, int i_55_, int i_56_, int i_57_) {
		int i_58_ = 256 - i_55_;
		if (i_56_ != 1021638856) {
			method397(false);
		}
		anInt3394++;
		return (i_58_ * (0xff00 & i_57_) + (0xff00 & i) * i_55_ & 0xff0000) + (i_58_ * (i_57_ & 0xff00ff) - -(i_55_ * (0xff00ff & i)) & ~0xff00ff) >> 8;
	}
	
	static {
		anInt3400 = 0;
	}
}
