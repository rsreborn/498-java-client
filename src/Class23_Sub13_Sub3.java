/* Class23_Sub13_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub3 extends Class23_Sub13
{
	static int anInt3688;
	static int anInt3689;
	static int anInt3690;
	static Class5 aClass5_3691 = new Class5(64);
	static int anInt3692;
	static int anInt3693;
	protected Class38_Sub5 aClass38_Sub5_3694;
	static RSString aClass16_3695 = Class38_Sub6.method1076((byte) 86, "Untersuchen");
	static RSString aClass16_3696;
	static RSString aClass16_3697;
	static boolean aBoolean3698 = true;
	static Class105_Sub1 aClass105_Sub1_3699;
	static int[] anIntArray3700 = new int[2048];
	static RSString aClass16_3701;
	private static RSString aClass16_3702;
	static int anInt3703;
	
	static final long method611(int i, int i_0_, int i_1_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_];
		if (class23_sub1 == null || class23_sub1.aClass24_2038 == null) {
			return 0L;
		}
		return class23_sub1.aClass24_2038.aLong364;
	}
	
	static final Class23_Sub13_Sub13 method612(int i, boolean bool) {
		anInt3688++;
		Class23_Sub13_Sub13 class23_sub13_sub13 = (Class23_Sub13_Sub13) Class23_Sub13_Sub1.aClass5_3666.method62(120, (long) i);
		if (class23_sub13_sub13 != null) {
			return class23_sub13_sub13;
		}
		byte[] bs = Class25.aClass105_380.method1544(Class67.method1246((byte) 47, i), 0, Class65.method1232(i, -544255032));
		class23_sub13_sub13 = new Class23_Sub13_Sub13();
		if (bs != null) {
			class23_sub13_sub13.method761((byte) 121, new Buffer(bs));
		}
		if (bool != false) {
			aBoolean3698 = false;
		}
		Class23_Sub13_Sub1.aClass5_3666.method67((long) i, class23_sub13_sub13, true);
		return class23_sub13_sub13;
	}
	
	static final void method613(Class23_Sub13_Sub8 class23_sub13_sub8, byte b, Class23_Sub13_Sub8 class23_sub13_sub8_2_) {
		if (Class66.aClass23_Sub13_Sub10Array1168 == null) {
			Class66.aClass23_Sub13_Sub10Array1168 = Class99.method1498(Class23_Sub13_Sub1.anInt3671, Class92.aClass105_Sub1_1561, 0, 0);
		}
		if (b < 83) {
			aClass16_3695 = null;
		}
		if (Class13.aClass43Array258 == null) {
			Class13.aClass43Array258 = Class68.method1249(Class92.aClass105_Sub1_1561, 0, Class106.anInt1822, 0);
		}
		if (Class23_Sub12.aClass43Array2296 == null) {
			Class23_Sub12.aClass43Array2296 = Class68.method1249(Class92.aClass105_Sub1_1561, 0, Class39.anInt604, 0);
		}
		anInt3692++;
		if (Class23_Sub13_Sub13.aClass43Array3987 == null) {
			Class23_Sub13_Sub13.aClass43Array3987 = Class68.method1249(Class92.aClass105_Sub1_1561, 0, Class71.anInt1275, 0);
		}
		Class20.method222(0, 23, 765, 480, 0);
		Class20.method208(0, 0, 138, 23, 12425273, 9135624);
		Class20.method208(138, 0, 640, 23, 5197647, 2697513);
		class23_sub13_sub8_2_.method666(Class97.aClass16_1644, 69, 15, 0, -1);
		if (Class23_Sub13_Sub13.aClass43Array3987 != null) {
			Class23_Sub13_Sub13.aClass43Array3987[1].method1119(140, 1);
			class23_sub13_sub8.method650(Class23_Sub17.aClass16_2365, 152, 10, 16777215, -1);
			Class23_Sub13_Sub13.aClass43Array3987[0].method1119(140, 12);
			class23_sub13_sub8.method650(Class23_Sub4_Sub26.aClass16_3320, 152, 21, 16777215, -1);
		}
		if (Class23_Sub12.aClass43Array2296 != null) {
			int i = 610;
			int i_3_ = 500;
			int i_4_ = 280;
			if (Class88.anIntArray1507[0] == 0 && (Class23_Sub20.anIntArray2401[0] ^ 0xffffffff) == -1) {
				Class23_Sub12.aClass43Array2296[2].method1119(i_4_, 4);
			} else {
				Class23_Sub12.aClass43Array2296[0].method1119(i_4_, 4);
			}
			if ((Class88.anIntArray1507[0] ^ 0xffffffff) == -1 && Class23_Sub20.anIntArray2401[0] == 1) {
				Class23_Sub12.aClass43Array2296[3].method1119(i_4_ + 15, 4);
			} else {
				Class23_Sub12.aClass43Array2296[1].method1119(i_4_ + 15, 4);
			}
			class23_sub13_sub8_2_.method650(Class90.aClass16_1529, i_4_ + 32, 17, 16777215, -1);
			int i_5_ = 390;
			if (Class88.anIntArray1507[0] == 1 && (Class23_Sub20.anIntArray2401[0] ^ 0xffffffff) == -1) {
				Class23_Sub12.aClass43Array2296[2].method1119(i_5_, 4);
			} else {
				Class23_Sub12.aClass43Array2296[0].method1119(i_5_, 4);
			}
			if (Class88.anIntArray1507[0] != 1 || Class23_Sub20.anIntArray2401[0] != 1) {
				Class23_Sub12.aClass43Array2296[1].method1119(15 + i_5_, 4);
			} else {
				Class23_Sub12.aClass43Array2296[3].method1119(i_5_ - -15, 4);
			}
			class23_sub13_sub8_2_.method650(Class59.aClass16_925, i_5_ - -32, 17, 16777215, -1);
			if (Class88.anIntArray1507[0] == 2 && (Class23_Sub20.anIntArray2401[0] ^ 0xffffffff) == -1) {
				Class23_Sub12.aClass43Array2296[2].method1119(i_3_, 4);
			} else {
				Class23_Sub12.aClass43Array2296[0].method1119(i_3_, 4);
			}
			if (Class88.anIntArray1507[0] == 2 && Class23_Sub20.anIntArray2401[0] == 1) {
				Class23_Sub12.aClass43Array2296[3].method1119(i_3_ + 15, 4);
			} else {
				Class23_Sub12.aClass43Array2296[1].method1119(15 + i_3_, 4);
			}
			class23_sub13_sub8_2_.method650(Class19.aClass16_323, i_3_ + 32, 17, 16777215, -1);
			if (Class88.anIntArray1507[0] == 3 && Class23_Sub20.anIntArray2401[0] == 0) {
				Class23_Sub12.aClass43Array2296[2].method1119(i, 4);
			} else {
				Class23_Sub12.aClass43Array2296[0].method1119(i, 4);
			}
			if (Class88.anIntArray1507[0] == 3 && Class23_Sub20.anIntArray2401[0] == 1) {
				Class23_Sub12.aClass43Array2296[3].method1119(15 + i, 4);
			} else {
				Class23_Sub12.aClass43Array2296[1].method1119(15 + i, 4);
			}
			class23_sub13_sub8_2_.method650(Class5.aClass16_114, i + 32, 17, 16777215, -1);
		}
		Class20.method222(700, 4, 58, 16, 0);
		class23_sub13_sub8.method666(Class23_Sub4_Sub27.aClass16_3338, 729, 16, 16777215, -1);
		Class23_Sub13_Sub2.anInt3680 = -1;
		if (Class66.aClass23_Sub13_Sub10Array1168 != null) {
			int i = 88;
			int i_6_ = 19;
			int i_7_ = 765 / (1 + i);
			int i_8_ = 480 / (i_6_ + 1);
			int i_9_;
			int i_10_;
			do {
				i_9_ = i_8_;
				i_10_ = i_7_;
				if (((-1 + i_7_) * i_8_ ^ 0xffffffff) <= (Class51.anInt793 ^ 0xffffffff)) {
					i_7_--;
				}
				if ((Class51.anInt793 ^ 0xffffffff) >= (i_7_ * (-1 + i_8_) ^ 0xffffffff)) {
					i_8_--;
				}
				if ((Class51.anInt793 ^ 0xffffffff) >= (i_7_ * (i_8_ + -1) ^ 0xffffffff)) {
					i_8_--;
				}
			} while (i_9_ != i_8_ || i_7_ != i_10_);
			i_9_ = (765 - i * i_7_) / (i_7_ - -1);
			if (i_9_ > 5) {
				i_9_ = 5;
			}
			int i_11_ = (-(i_9_ * (i_7_ + -1)) + (765 - i_7_ * i)) / 2;
			i_10_ = (480 + -(i_8_ * i_6_)) / (1 + i_8_);
			if (i_10_ > 5) {
				i_10_ = 5;
			}
			int i_12_ = 0;
			int i_13_ = i_11_;
			int i_14_ = (480 - (i_6_ * i_8_ - -(i_10_ * (-1 + i_8_)))) / 2;
			int i_15_ = 23 - -i_14_;
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (Class51.anInt793 ^ 0xffffffff); i_16_++) {
				Class82 class82 = Class23_Sub13_Sub1.worldList[i_16_];
				boolean bool = true;
				RSString class16 = Class23_Sub4_Sub23.method360((byte) -9, class82.anInt1447);
				if ((class82.anInt1447 ^ 0xffffffff) == 0) {
					bool = false;
					class16 = Class46.aClass16_707;
				} else if (class82.anInt1447 > 1980) {
					class16 = Class26.aClass16_401;
					bool = false;
				}
				if (Class23_Sub4_Sub14.anInt3126 >= i_13_ && i_15_ <= Class102.anInt1701 && Class23_Sub4_Sub14.anInt3126 < i + i_13_ && (Class102.anInt1701 ^ 0xffffffff) > (i_15_ + i_6_ ^ 0xffffffff) && bool) {
					Class23_Sub13_Sub2.anInt3680 = i_16_;
					Class66.aClass23_Sub13_Sub10Array1168[class82.aBoolean1450 ? 1 : 0].method699(i_13_, i_15_, 128, 16777215);
				} else {
					Class66.aClass23_Sub13_Sub10Array1168[!class82.aBoolean1450 ? 0 : 1].method705(i_13_, i_15_);
				}
				if (Class13.aClass43Array258 != null) {
					Class13.aClass43Array258[class82.anInt1443 + (!class82.aBoolean1450 ? 0 : 8)].method1119(i_13_ - -29, i_15_);
				}
				class23_sub13_sub8_2_.method666(Class23_Sub4_Sub23.method360((byte) -9, class82.anInt1451), i_13_ - -15, 5 + i_6_ / 2 + i_15_, 0, -1);
				class23_sub13_sub8.method666(class16, i_13_ - -60, i_15_ + i_6_ / 2 - -5, 268435455, -1);
				i_15_ += i_10_ - -i_6_;
				if ((i_8_ ^ 0xffffffff) >= (++i_12_ ^ 0xffffffff)) {
					i_15_ = 23 - -i_14_;
					i_12_ = 0;
					i_13_ += i_9_ - -i;
				}
			}
		}
	}
	
	static final int method614(int i, boolean bool, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		if ((i_21_ & 0x1) == 1) {
			int i_22_ = i_20_;
			i_20_ = i;
			i = i_22_;
		}
		if (bool != true) {
			return -91;
		}
		anInt3690++;
		i_19_ &= 0x3;
		if (i_19_ == 0) {
			return i_18_;
		}
		if (i_19_ == 1) {
			return i_17_;
		}
		if (i_19_ == 2) {
			return 7 - i_18_ + 1 + -i_20_;
		}
		return 1 + -i + (7 + -i_17_);
	}
	
	public static void method615(int i) {
		aClass16_3696 = null;
		aClass16_3702 = null;
		aClass105_Sub1_3699 = null;
		aClass16_3695 = null;
		aClass16_3697 = null;
		aClass16_3701 = null;
		aClass5_3691 = null;
		anIntArray3700 = null;
		if (i != 11) {
			method615(-45);
		}
	}
	
	static final void method616(int i, int i_23_, byte b, Class64 class64) {
		anInt3689++;
		if (class64.anInt1038 == 1) {
			Class23_Sub13_Sub19.method812(0L, (short) 30, 0, Class23_Sub4_Sub38.aClass16_3509, 500, class64.aClass16_1059, class64.anInt1098);
			Class23_Sub7.anInt2221++;
		}
		if (b != 1) {
			aClass5_3691 = null;
		}
		if (class64.anInt1038 == 2 && !ObjectDefinition.aBoolean3792) {
			RSString class16 = Class99.method1497((byte) -114, class64);
			if (class16 != null) {
				Class89.anInt1512++;
				Class23_Sub13_Sub19.method812(0L, (short) 9, -1, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub35.aClass16_3458, class64.aClass16_1019 }, -10), b + 499, class16, class64.anInt1098);
			}
		}
		if (class64.anInt1038 == 3) {
			Class29.anInt438++;
			Class23_Sub13_Sub19.method812(0L, (short) 13, 0, Class23_Sub4_Sub38.aClass16_3509, 500, Class2.aClass16_73, class64.anInt1098);
		}
		if (class64.anInt1038 == 4) {
			Class23_Sub13_Sub19.method812(0L, (short) 57, 0, Class23_Sub4_Sub38.aClass16_3509, 500, class64.aClass16_1059, class64.anInt1098);
			Class23_Sub5_Sub1.anInt3539++;
		}
		if (class64.anInt1038 == 5) {
			Class23_Sub13_Sub21.anInt4196++;
			Class23_Sub13_Sub19.method812(0L, (short) 23, 0, Class23_Sub4_Sub38.aClass16_3509, 500, class64.aClass16_1059, class64.anInt1098);
		}
		if (class64.anInt1038 == 6 && Class23_Sub13_Sub14.aClass64_4007 == null) {
			Class23_Sub13_Sub19.method812(0L, (short) 15, -1, Class23_Sub4_Sub38.aClass16_3509, 500, class64.aClass16_1059, class64.anInt1098);
			Class23_Sub13_Sub12.anInt3962++;
		}
		if (class64.anInt1003 == 2) {
			int i_24_ = 0;
			for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (class64.anInt1105 ^ 0xffffffff); i_25_++) {
				for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (class64.anInt1112 ^ 0xffffffff); i_26_++) {
					int i_27_ = i_26_ * (class64.anInt1046 + 32);
					int i_28_ = i_25_ * (class64.anInt998 + 32);
					if (i_24_ < 20) {
						i_28_ += class64.anIntArray1051[i_24_];
						i_27_ += class64.anIntArray1011[i_24_];
					}
					if ((i_27_ ^ 0xffffffff) >= (i_23_ ^ 0xffffffff) && i >= i_28_ && (i_23_ ^ 0xffffffff) > (32 + i_27_ ^ 0xffffffff) && i < i_28_ - -32) {
						Class23_Sub13_Sub23.aClass64_4257 = class64;
						Class49.anInt761 = i_24_;
						if ((class64.anIntArray1028[i_24_] ^ 0xffffffff) < -1) {
							ItemDefinition class23_sub13_sub11 = Class23_Sub13_Sub24.method853(117, -1 + class64.anIntArray1028[i_24_]);
							if (Class38_Sub7_Sub1.anInt4374 == 1 && Class107.method1580(Class47.method1142(class64, 71), -26304)) {
								if ((Class49.anInt759 ^ 0xffffffff) != (class64.anInt1098 ^ 0xffffffff) || Class17.anInt302 != i_24_) {
									Class23_Sub13_Sub19.method812((long) class23_sub13_sub11.id, (short) 26, i_24_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub24.aClass16_4281, Class14.aClass16_274, class23_sub13_sub11.name }, -76), 500, NPCDefinition.aClass16_4163, class64.anInt1098);
									Class23_Sub7.anInt2206++;
								}
							} else if (!ObjectDefinition.aBoolean3792 || !Class107.method1580(Class47.method1142(class64, 121), -26304)) {
								RSString[] class16s = class23_sub13_sub11.aClass16Array3910;
								Class21.anInt336++;
								if (Class23_Sub4_Sub5.aBoolean2977) {
									class16s = Class23_Sub4_Sub31.method396(30113, class16s);
								}
								if (Class107.method1580(Class47.method1142(class64, b ^ 0x78), -26304)) {
									for (int i_29_ = 4; i_29_ >= 3; i_29_--) {
										if (class16s == null || class16s[i_29_] == null) {
											if (i_29_ == 4) {
												Class23_Sub13_Sub19.method812((long) class23_sub13_sub11.id, (short) 11, i_24_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.name }, b + -21), 500, Class23_Sub13_Sub21.aClass16_4186, class64.anInt1098);
												Class23_Sub13_Sub17.anInt4065++;
											}
										} else {
											Class56.anInt891++;
											short s;
											if (i_29_ == 3) {
												s = (short) 6;
											} else {
												s = (short) 11;
											}
											Class23_Sub13_Sub19.method812((long) class23_sub13_sub11.id, s, i_24_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.name }, -58), 500, class16s[i_29_], class64.anInt1098);
										}
									}
								}
								if (Class49.method1152(-1, Class47.method1142(class64, 105))) {
									Class23_Sub13_Sub19.method812((long) class23_sub13_sub11.id, (short) 18, i_24_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.name }, b ^ ~0xc), 500, NPCDefinition.aClass16_4163, class64.anInt1098);
									Class71_Sub3.anInt2747++;
								}
								if (Class107.method1580(Class47.method1142(class64, 124), -26304) && class16s != null) {
									for (int i_30_ = 2; i_30_ >= 0; i_30_--) {
										if (class16s[i_30_] != null) {
											Class71_Sub1.anInt2727++;
											short s = 0;
											if (i_30_ == 0) {
												s = (short) 50;
											}
											if (i_30_ == 1) {
												s = (short) 47;
											}
											if (i_30_ == 2) {
												s = (short) 20;
											}
											Class23_Sub13_Sub19.method812((long) class23_sub13_sub11.id, s, i_24_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.name }, -46), 500, class16s[i_30_], class64.anInt1098);
										}
									}
								}
								class16s = class64.aClass16Array1029;
								if (Class23_Sub4_Sub5.aBoolean2977) {
									class16s = Class23_Sub4_Sub31.method396(30113, class16s);
								}
								if (class16s != null) {
									for (int i_31_ = 4; (i_31_ ^ 0xffffffff) <= -1; i_31_--) {
										if (class16s[i_31_] != null) {
											Class29.anInt461++;
											short s = 0;
											if ((i_31_ ^ 0xffffffff) == -1) {
												s = (short) 36;
											}
											if (i_31_ == 1) {
												s = (short) 7;
											}
											if (i_31_ == 2) {
												s = (short) 8;
											}
											if (i_31_ == 3) {
												s = (short) 28;
											}
											if (i_31_ == 4) {
												s = (short) 51;
											}
											Class23_Sub13_Sub19.method812((long) class23_sub13_sub11.id, s, i_24_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.name }, b ^ ~0x9), b ^ 0x1f5, class16s[i_31_], class64.anInt1098);
										}
									}
								}
								Class23_Sub13_Sub19.method812((long) class23_sub13_sub11.id, (short) 1007, i_24_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.name }, -11), 500, Class71_Sub1_Sub1.aClass16_4462, class64.anInt1098);
							} else if ((0x10 & Class71_Sub1.anInt2725) == 16) {
								Class23_Sub4_Sub20.anInt3238++;
								Class23_Sub13_Sub19.method812((long) class23_sub13_sub11.id, (short) 24, i_24_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub4.aClass16_3714, Class14.aClass16_274, class23_sub13_sub11.name }, -24), 500, Class49.aClass16_764, class64.anInt1098);
							}
						}
					}
					i_24_++;
				}
			}
		}
		if (class64.aBoolean1017) {
			if (!ObjectDefinition.aBoolean3792) {
				for (int i_32_ = 9; i_32_ >= 5; i_32_--) {
					RSString class16 = Class23_Sub13_Sub9.method685(i_32_, class64, 1);
					if (class16 != null) {
						Class23_Sub8.anInt2237++;
						Class23_Sub13_Sub19.method812((long) (1 + i_32_), (short) 1002, class64.anInt1005, class64.aClass16_1130, 500, class16, class64.anInt1098);
					}
				}
				RSString class16 = Class99.method1497((byte) -111, class64);
				if (class16 != null) {
					Class23_Sub13_Sub19.method812(0L, (short) 9, class64.anInt1005, class64.aClass16_1130, 500, class16, class64.anInt1098);
					Class89.anInt1512++;
				}
				for (int i_33_ = 4; (i_33_ ^ 0xffffffff) <= -1; i_33_--) {
					RSString class16_34_ = Class23_Sub13_Sub9.method685(i_33_, class64, b);
					if (class16_34_ != null) {
						Class23_Sub13_Sub19.method812((long) (i_33_ + 1), (short) 19, class64.anInt1005, class64.aClass16_1130, b + 499, class16_34_, class64.anInt1098);
						Class23_Sub8.anInt2237++;
					}
				}
				if (Class13.method119(Class47.method1142(class64, b + 64), b)) {
					Class23_Sub13_Sub12.anInt3962++;
					Class23_Sub13_Sub19.method812(0L, (short) 15, class64.anInt1005, Class23_Sub4_Sub38.aClass16_3509, 500, Class71_Sub1_Sub1.aClass16_4458, class64.anInt1098);
				}
			} else if (Class36.method987(Class47.method1142(class64, 72), (byte) 122) && (0x20 & Class71_Sub1.anInt2725) == 32) {
				RuntimeException_Sub1.anInt1854++;
				Class23_Sub13_Sub19.method812(0L, (short) 49, class64.anInt1005, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub4.aClass16_3714, Class23_Sub4_Sub10.aClass16_3050, class64.aClass16_1130 }, -66), b ^ 0x1f5, Class49.aClass16_764, class64.anInt1098);
			}
		}
	}
	
	Class23_Sub13_Sub3(Class38_Sub5 class38_sub5) {
		aClass38_Sub5_3694 = class38_sub5;
	}
	
	static {
		aClass16_3697 = Class38_Sub6.method1076((byte) 86, "Lade Titelbild )2 ");
		aClass16_3701 = Class38_Sub6.method1076((byte) 86, "titlebutton");
		aClass16_3702 = Class38_Sub6.method1076((byte) 86, "Press (Wchange your password(W on front page)3");
		anInt3703 = 0;
		aClass16_3696 = aClass16_3702;
	}
}
