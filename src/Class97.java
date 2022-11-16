/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class97
{
	static RSString aClass16_1631 = Class38_Sub6.method1076((byte) 86, "Geben Sie Ihren Benutzernamen");
	static int anInt1632 = -1;
	static int anInt1633;
	static int anInt1634;
	static int anInt1635;
	static RSString aClass16_1636 = Class38_Sub6.method1076((byte) 86, ")1");
	private static RSString aClass16_1637 = Class38_Sub6.method1076((byte) 86, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");
	private static RSString aClass16_1638;
	private static RSString aClass16_1639;
	static RSString aClass16_1640 = aClass16_1637;
	static RSString aClass16_1641;
	static RSString aClass16_1642;
	static int anInt1643;
	static RSString aClass16_1644;
	static int anInt1645;
	static Class6 aClass6_1646;
	static RSString aClass16_1647;
	
	static final int method1487(boolean bool, boolean bool_0_, boolean bool_1_) {
		anInt1633++;
		if (bool_1_ != false) {
			return 91;
		}
		int i = 0;
		if (bool) {
			i += Class4.anInt89 + Buffer.anInt2166;
		}
		if (bool_0_) {
			i += Class68.anInt1190 + Class23_Sub13_Sub8_Sub1.anInt4501;
		}
		return i;
	}
	
	static final void method1488(int i) {
		int i_2_ = 96 / ((-41 - i) / 44);
		anInt1643++;
		Class33.aClass5_516.method68(0);
		Class66.aClass81_1166.method1369((byte) 91);
		Class98.aClass5_1654.method68(0);
	}
	
	static final void method1489(Class105 class105, boolean bool, Class105 class105_3_, byte b, boolean bool_4_) {
		Class23_Sub13_Sub4.aClass105_3717 = class105;
		Class23_Sub4_Sub3.aClass105_2943 = class105_3_;
		Class38_Sub7_Sub1.aBoolean4372 = bool_4_;
		Class23_Sub4_Sub37.aBoolean3498 = bool;
		Class90.aClass81_1545 = new Class81(30);
		if (b != -57) {
			method1489(null, true, null, (byte) -10, false);
		}
		anInt1635++;
	}
	
	static final void method1490(int i, int i_5_, Class64[] class64s, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		Class20.method210(i, i_5_, i_9_, i_7_);
		if (i_12_ != -1) {
			aClass16_1637 = null;
		}
		Class76.method1318();
		for (int i_13_ = 0; i_13_ < class64s.length; i_13_++) {
			Class64 class64 = class64s[i_13_];
			if (class64 != null && ((class64.anInt1056 ^ 0xffffffff) == (i_8_ ^ 0xffffffff) || (i_8_ ^ 0xffffffff) == 1412584498 && Class23_Sub4_Sub8.aClass64_3028 == class64)) {
				int i_14_;
				if (i_10_ != -1) {
					i_14_ = i_10_;
				} else {
					Class23_Sub4_Sub9.anIntArray3034[Class23_Sub4_Sub25.anInt3306] = i_11_ + class64.anInt1120;
					Class23_Sub11.anIntArray2286[Class23_Sub4_Sub25.anInt3306] = i_6_ + class64.anInt1126;
					Class24.anIntArray372[Class23_Sub4_Sub25.anInt3306] = class64.anInt1128;
					Class55.anIntArray865[Class23_Sub4_Sub25.anInt3306] = class64.anInt999;
					i_14_ = Class23_Sub4_Sub25.anInt3306++;
				}
				class64.anInt1144 = Class89.anInt1511;
				class64.anInt1078 = i_14_;
				if (!class64.aBoolean1017 || !Class10.method109(true, class64)) {
					if ((class64.anInt1149 ^ 0xffffffff) < -1) {
						Class46.method1141((byte) 123, class64);
					}
					int i_15_ = i_11_ + class64.anInt1120;
					int i_16_ = class64.anInt1127;
					int i_17_ = class64.anInt1126 + i_6_;
					if (Class75.aBoolean1373 && ((Class47.method1142(class64, 66) ^ 0xffffffff) != -1 || (class64.anInt1003 ^ 0xffffffff) == -1) && i_16_ > 127) {
						i_16_ = 127;
					}
					if (Class23_Sub4_Sub8.aClass64_3028 == class64) {
						if ((i_8_ ^ 0xffffffff) != 1412584498 && !class64.aBoolean1061) {
							Class13.anInt250 = i_11_;
							Class31.aClass64Array484 = class64s;
							Class58.anInt907 = i_6_;
							continue;
						}
						if (Class17_Sub1.aBoolean2003 && Class72.aBoolean1310) {
							int i_18_ = Class23_Sub4_Sub14.anInt3126;
							i_18_ -= Class23_Sub4_Sub10.anInt3059;
							if ((Class48.anInt751 ^ 0xffffffff) < (i_18_ ^ 0xffffffff)) {
								i_18_ = Class48.anInt751;
							}
							int i_19_ = Class102.anInt1701;
							i_19_ -= Class23_Sub13_Sub15.anInt4034;
							if ((Class64.anInt1082 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)) {
								i_19_ = Class64.anInt1082;
							}
							if (Class64.anInt1082 - -Class64.aClass64_1102.anInt999 < class64.anInt999 + i_19_) {
								i_19_ = Class64.anInt1082 + Class64.aClass64_1102.anInt999 + -class64.anInt999;
							}
							if (Class64.aClass64_1102.anInt1128 + Class48.anInt751 < class64.anInt1128 + i_18_) {
								i_18_ = -class64.anInt1128 + (Class48.anInt751 - -Class64.aClass64_1102.anInt1128);
							}
							i_17_ = i_19_;
							i_15_ = i_18_;
						}
						if (!class64.aBoolean1061) {
							i_16_ = 128;
						}
					}
					int i_20_;
					int i_21_;
					int i_22_;
					int i_23_;
					if (class64.anInt1003 == 2) {
						i_23_ = i_9_;
						i_20_ = i_5_;
						i_21_ = i;
						i_22_ = i_7_;
					} else {
						i_20_ = i_5_ < i_17_ ? i_17_ : i_5_;
						i_21_ = i < i_15_ ? i_15_ : i;
						int i_24_ = class64.anInt1128 + i_15_;
						int i_25_ = i_17_ - -class64.anInt999;
						if (class64.anInt1003 == 9) {
							i_25_++;
							i_24_++;
						}
						i_22_ = (i_7_ ^ 0xffffffff) >= (i_25_ ^ 0xffffffff) ? i_7_ : i_25_;
						i_23_ = i_24_ < i_9_ ? i_24_ : i_9_;
					}
					if (!class64.aBoolean1017 || i_21_ < i_23_ && (i_20_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
						if ((class64.anInt1149 ^ 0xffffffff) != -1) {
							if (class64.anInt1149 == 1337) {
								Class70.anInt1222 = i_17_;
								anInt1632 = i_15_;
								Class105_Sub1.method1568(class64.anInt1128, i_15_, class64.anInt999, i_17_, 1920);
								Class20.method210(i, i_5_, i_9_, i_7_);
								continue;
							}
							if (class64.anInt1149 == 1338) {
								if (class64.method1222(126)) {
									Class2.method49(i_17_, i_14_, false, class64, i_15_);
									Class20.method210(i, i_5_, i_9_, i_7_);
								}
								continue;
							}
							if (class64.anInt1149 == 1339) {
								if (class64.method1222(119)) {
									Class66.method1241(3395, class64, i_14_, i_17_, i_15_);
									Class20.method210(i, i_5_, i_9_, i_7_);
								}
								continue;
							}
							if (class64.anInt1149 == 1400) {
								Class92.method1458(-104, class64.anInt1128, i_17_, class64.anInt999, i_15_);
								Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_14_] = true;
								Class36.aBooleanArray571[i_14_] = true;
								Class20.method210(i, i_5_, i_9_, i_7_);
								continue;
							}
							if (class64.anInt1149 == 1401) {
								Class21.method224(i_17_, i_15_, class64.anInt999, class64.anInt1128, (byte) 70);
								Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_14_] = true;
								Class36.aBooleanArray571[i_14_] = true;
								Class20.method210(i, i_5_, i_9_, i_7_);
								continue;
							}
						}
						if ((class64.anInt1003 ^ 0xffffffff) == -1 && class64.aBoolean1150 && i_21_ <= Class23_Sub4_Sub14.anInt3126 && i_20_ <= Class102.anInt1701 && Class23_Sub4_Sub14.anInt3126 < i_23_ && i_22_ > Class102.anInt1701 && !Class53.aBoolean840 && !Class75.aBoolean1373) {
							Class23_Sub13_Sub9.anInt3863 = 1;
							Class23_Sub13_Sub26.aClass16Array4307[0] = Class23_Sub4_Sub27.aClass16_3338;
							Class38_Sub5.aShortArray2603[0] = (short) 1006;
							Class98.aClass16Array1655[0] = Class23_Sub4_Sub38.aClass16_3509;
						}
						int i_26_ = Class102.anInt1701;
						int i_27_ = Class23_Sub4_Sub14.anInt3126;
						if (!Class53.aBoolean840 && (i_27_ ^ 0xffffffff) <= (i_21_ ^ 0xffffffff) && (i_26_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff) && (i_27_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff) && i_22_ > i_26_) {
							Class23_Sub13_Sub3.method616(i_26_ - i_17_, i_27_ + -i_15_, (byte) 1, class64);
						}
						if (class64.anInt1003 == 0) {
							if (!class64.aBoolean1017 && Class10.method109(true, class64) && class64 != Class42.aClass64_663) {
								continue;
							}
							if (!class64.aBoolean1017) {
								if ((class64.anInt1088 - class64.anInt999 ^ 0xffffffff) > (class64.anInt1083 ^ 0xffffffff)) {
									class64.anInt1083 = class64.anInt1088 - class64.anInt999;
								}
								if ((class64.anInt1083 ^ 0xffffffff) > -1) {
									class64.anInt1083 = 0;
								}
							}
							method1490(i_21_, i_20_, class64s, i_17_ - class64.anInt1083, i_22_, class64.anInt1098, i_23_, i_14_, -class64.anInt1009 + i_15_, i_12_);
							if (class64.aClass64Array1131 != null) {
								method1490(i_21_, i_20_, class64.aClass64Array1131, -class64.anInt1083 + i_17_, i_22_, class64.anInt1098, i_23_, i_14_, -class64.anInt1009 + i_15_, i_12_);
							}
							Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) 91, (long) class64.anInt1098);
							if (class23_sub25 != null) {
								if ((class23_sub25.anInt2461 ^ 0xffffffff) == -1 && Class23_Sub4_Sub14.anInt3126 >= i_21_ && i_20_ <= Class102.anInt1701 && i_23_ > Class23_Sub4_Sub14.anInt3126 && Class102.anInt1701 < i_22_ && !Class53.aBoolean840 && !Class75.aBoolean1373) {
									Class23_Sub13_Sub26.aClass16Array4307[0] = Class23_Sub4_Sub27.aClass16_3338;
									Class98.aClass16Array1655[0] = Class23_Sub4_Sub38.aClass16_3509;
									Class23_Sub13_Sub9.anInt3863 = 1;
									Class38_Sub5.aShortArray2603[0] = (short) 1006;
								}
								Class23_Sub26.method909(i_20_, i_21_, i_22_, i_14_, (byte) 21, i_15_, i_23_, class23_sub25.anInt2456, i_17_);
							}
							Class20.method210(i, i_5_, i_9_, i_7_);
							Class76.method1318();
						}
						if (Class23_Sub4_Sub26.aBooleanArray3325[i_14_] || Class57.anInt901 > 1) {
							if (class64.anInt1003 == 0 && !class64.aBoolean1017 && class64.anInt999 < class64.anInt1088) {
								Class61.method1197(true, class64.anInt999, class64.anInt1128 + i_15_, class64.anInt1088, class64.anInt1083, i_17_);
							}
							if (class64.anInt1003 != 1) {
								if (class64.anInt1003 == 2) {
									int i_28_ = 0;
									for (int i_29_ = 0; class64.anInt1105 > i_29_; i_29_++) {
										for (int i_30_ = 0; (class64.anInt1112 ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++) {
											int i_31_ = i_17_ + (class64.anInt998 + 32) * i_29_;
											int i_32_ = (class64.anInt1046 + 32) * i_30_ + i_15_;
											if (i_28_ < 20) {
												i_32_ += class64.anIntArray1011[i_28_];
												i_31_ += class64.anIntArray1051[i_28_];
											}
											if (class64.anIntArray1028[i_28_] <= 0) {
												if (class64.anIntArray1042 != null && i_28_ < 20) {
													Class23_Sub13_Sub10 class23_sub13_sub10 = class64.method1225(i_28_, (byte) 24);
													if (class23_sub13_sub10 == null) {
														if (Class4.aBoolean100) {
															Class91.method1450((byte) 29, class64);
														}
													} else {
														class23_sub13_sub10.method694(i_32_, i_31_);
													}
												}
											} else {
												boolean bool = false;
												int i_33_ = -1 + class64.anIntArray1028[i_28_];
												boolean bool_34_ = false;
												if ((i_32_ - -32 ^ 0xffffffff) < (i ^ 0xffffffff) && (i_32_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff) && (i_5_ ^ 0xffffffff) > (32 + i_31_ ^ 0xffffffff) && (i_31_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff) || class64 == Class51.aClass64_790 && (Class87_Sub3.anInt2822 ^ 0xffffffff) == (i_28_ ^ 0xffffffff)) {
													Class23_Sub13_Sub10 class23_sub13_sub10;
													if (Class38_Sub7_Sub1.anInt4374 != 1 || Class17.anInt302 != i_28_ || Class49.anInt759 != class64.anInt1098) {
														class23_sub13_sub10 = Class23_Sub13_Sub26.method860(class64.aBoolean1054, i_33_, class64.anIntArray1147[i_28_], 3153952, 500, 1);
													} else {
														class23_sub13_sub10 = Class23_Sub13_Sub26.method860(class64.aBoolean1054, i_33_, class64.anIntArray1147[i_28_], 0, 500, 2);
													}
													if (class23_sub13_sub10 == null) {
														Class91.method1450((byte) 29, class64);
													} else if (class64 != Class51.aClass64_790 || Class87_Sub3.anInt2822 != i_28_) {
														if (class64 == Class32.aClass64_502 && (Class24.anInt362 ^ 0xffffffff) == (i_28_ ^ 0xffffffff)) {
															class23_sub13_sub10.method696(i_32_, i_31_, 128);
														} else {
															class23_sub13_sub10.method694(i_32_, i_31_);
														}
													} else {
														int i_35_ = Class102.anInt1701 + -Class23_Sub4_Sub38.anInt3510;
														if (i_35_ < 5 && (i_35_ ^ 0xffffffff) < 4) {
															i_35_ = 0;
														}
														int i_36_ = Class23_Sub4_Sub14.anInt3126 - Class23_Sub23.anInt2435;
														if (i_36_ < 5 && (i_36_ ^ 0xffffffff) < 4) {
															i_36_ = 0;
														}
														if (Class103.anInt1728 < 5) {
															i_36_ = 0;
															i_35_ = 0;
														}
														class23_sub13_sub10.method696(i_32_ + i_36_, i_31_ + i_35_, 128);
														if ((i_8_ ^ 0xffffffff) != 0) {
															Class64 class64_37_ = class64s[0xffff & i_8_];
															int i_38_ = Class20.anInt334;
															int i_39_ = Class20.anInt332;
															if ((i_35_ + i_31_ ^ 0xffffffff) > (i_39_ ^ 0xffffffff) && class64_37_.anInt1083 > 0) {
																int i_40_ = (-i_35_ + (i_39_ - i_31_)) * Class23_Sub25.anInt2459 / 3;
																if (Class23_Sub25.anInt2459 * 10 < i_40_) {
																	i_40_ = 10 * Class23_Sub25.anInt2459;
																}
																if (i_40_ > class64_37_.anInt1083) {
																	i_40_ = class64_37_.anInt1083;
																}
																Class23_Sub4_Sub38.anInt3510 += i_40_;
																class64_37_.anInt1083 -= i_40_;
																Class91.method1450((byte) 29, class64_37_);
															}
															if (i_38_ < 32 + i_35_ + i_31_ && class64_37_.anInt1088 - class64_37_.anInt999 > class64_37_.anInt1083) {
																int i_41_ = (-i_38_ + (32 + (i_31_ + i_35_))) * Class23_Sub25.anInt2459 / 3;
																if (Class23_Sub25.anInt2459 * 10 < i_41_) {
																	i_41_ = Class23_Sub25.anInt2459 * 10;
																}
																if ((-class64_37_.anInt1083 + class64_37_.anInt1088 - class64_37_.anInt999 ^ 0xffffffff) > (i_41_ ^ 0xffffffff)) {
																	i_41_ = class64_37_.anInt1088 + -class64_37_.anInt999 - class64_37_.anInt1083;
																}
																class64_37_.anInt1083 += i_41_;
																Class23_Sub4_Sub38.anInt3510 -= i_41_;
																Class91.method1450((byte) 29, class64_37_);
															}
														}
													}
												}
											}
											i_28_++;
										}
									}
								} else if (class64.anInt1003 == 3) {
									int i_42_;
									if (Class23_Sub13_Sub15.method776(true, class64)) {
										i_42_ = class64.anInt1086;
										if (class64 == Class42.aClass64_663 && (class64.anInt1057 ^ 0xffffffff) != -1) {
											i_42_ = class64.anInt1057;
										}
									} else {
										i_42_ = class64.anInt1033;
										if (Class42.aClass64_663 == class64 && (class64.anInt1106 ^ 0xffffffff) != -1) {
											i_42_ = class64.anInt1106;
										}
									}
									if ((i_16_ ^ 0xffffffff) == -1) {
										if (class64.aBoolean1081) {
											Class20.method222(i_15_, i_17_, class64.anInt1128, class64.anInt999, i_42_);
										} else {
											Class20.method215(i_15_, i_17_, class64.anInt1128, class64.anInt999, i_42_);
										}
									} else if (class64.aBoolean1081) {
										Class20.method212(i_15_, i_17_, class64.anInt1128, class64.anInt999, i_42_, 256 - (0xff & i_16_));
									} else {
										Class20.method213(i_15_, i_17_, class64.anInt1128, class64.anInt999, i_42_, -(0xff & i_16_) + 256);
									}
								} else if (class64.anInt1003 == 4) {
									Class23_Sub13_Sub8 class23_sub13_sub8 = class64.method1223(Class23_Sub4_Sub1.aClass43Array2881, (byte) -6);
									if (class23_sub13_sub8 == null) {
										if (Class4.aBoolean100) {
											Class91.method1450((byte) 29, class64);
										}
									} else {
										RSString class16 = class64.aClass16_1070;
										int i_43_;
										if (!Class23_Sub13_Sub15.method776(true, class64)) {
											i_43_ = class64.anInt1033;
											if (class64 == Class42.aClass64_663 && (class64.anInt1106 ^ 0xffffffff) != -1) {
												i_43_ = class64.anInt1106;
											}
										} else {
											i_43_ = class64.anInt1086;
											if (Class42.aClass64_663 == class64 && (class64.anInt1057 ^ 0xffffffff) != -1) {
												i_43_ = class64.anInt1057;
											}
											if ((class64.aClass16_1095.method171(-61) ^ 0xffffffff) < -1) {
												class16 = class64.aClass16_1095;
											}
										}
										if (class64.aBoolean1017 && class64.anInt1122 != -1) {
											Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(127, class64.anInt1122);
											class16 = class23_sub13_sub11.aClass16_3902;
											if (class16 == null) {
												class16 = Class23_Sub4_Sub30.aClass16_3378;
											}
											if ((class23_sub13_sub11.anInt3895 == 1 || class64.anInt1134 != 1) && (class64.anInt1134 ^ 0xffffffff) != 0) {
												class16 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class16, Class23_Sub13_Sub16.aClass16_4041, Class90.method1448(class64.anInt1134, i_12_ + -13523) }, -89);
											}
										}
										if (class64 == Class23_Sub13_Sub14.aClass64_4007) {
											class16 = Class4.aClass16_92;
											i_43_ = class64.anInt1033;
										}
										if (!class64.aBoolean1017) {
											class16 = Class54.method1178(12445, class64, class16);
										}
										class23_sub13_sub8.method665(class16, i_15_, i_17_, class64.anInt1128, class64.anInt999, i_43_, class64.aBoolean1069 ? 0 : -1, class64.anInt1133, class64.anInt1045, class64.anInt1062);
									}
								} else if (class64.anInt1003 == 5) {
									if (!class64.aBoolean1017) {
										Class23_Sub13_Sub10 class23_sub13_sub10 = class64.method1221(Class23_Sub13_Sub15.method776(true, class64), i_12_ + -7984);
										if (class23_sub13_sub10 == null) {
											if (Class4.aBoolean100) {
												Class91.method1450((byte) 29, class64);
											}
										} else {
											class23_sub13_sub10.method694(i_15_, i_17_);
										}
									} else {
										Class23_Sub13_Sub10 class23_sub13_sub10;
										if (class64.anInt1122 != -1) {
											class23_sub13_sub10 = Class23_Sub13_Sub26.method860(class64.aBoolean1054, class64.anInt1122, class64.anInt1134, class64.anInt1087, 500, class64.anInt1132);
										} else {
											class23_sub13_sub10 = class64.method1221(false, -7985);
										}
										if (class23_sub13_sub10 != null) {
											int i_44_ = class23_sub13_sub10.anInt3879;
											int i_45_ = class23_sub13_sub10.anInt3885;
											if (!class64.aBoolean1071) {
												int i_46_ = 4096 * class64.anInt1128 / i_44_;
												if ((class64.anInt1002 ^ 0xffffffff) != -1) {
													class23_sub13_sub10.method697(i_46_, class64.anInt999 / 2 + i_17_, i_15_ - -(class64.anInt1128 / 2), class64.anInt1002, i_12_ + -93);
												} else if (i_16_ != 0) {
													class23_sub13_sub10.method695(i_15_, i_17_, class64.anInt1128, class64.anInt999, 256 - (i_16_ & 0xff));
												} else if ((class64.anInt1128 ^ 0xffffffff) == (i_44_ ^ 0xffffffff) && (class64.anInt999 ^ 0xffffffff) == (i_45_ ^ 0xffffffff)) {
													class23_sub13_sub10.method694(i_15_, i_17_);
												} else {
													class23_sub13_sub10.method698(i_15_, i_17_, class64.anInt1128, class64.anInt999);
												}
											} else {
												int i_47_ = (class64.anInt1128 + (-1 + i_44_)) / i_44_;
												int i_48_ = (class64.anInt999 - (-i_45_ - -1)) / i_45_;
												Class20.method204(i_15_, i_17_, class64.anInt1128 + i_15_, i_17_ + class64.anInt999);
												for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > (i_47_ ^ 0xffffffff); i_49_++) {
													for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > (i_48_ ^ 0xffffffff); i_50_++) {
														if ((class64.anInt1002 ^ 0xffffffff) == -1) {
															if ((i_16_ ^ 0xffffffff) != -1) {
																class23_sub13_sub10.method696(i_49_ * i_44_ + i_15_, i_17_ - -(i_45_ * i_50_), -(0xff & i_16_) + 256);
															} else {
																class23_sub13_sub10.method694(i_15_ - -(i_49_ * i_44_), i_50_ * i_45_ + i_17_);
															}
														} else {
															class23_sub13_sub10.method697(4096, i_17_ - -(i_45_ * i_50_) + i_45_ / 2, i_44_ * i_49_ + (i_15_ - -(i_44_ / 2)), class64.anInt1002, -95);
														}
													}
												}
												Class20.method210(i, i_5_, i_9_, i_7_);
											}
										} else if (Class4.aBoolean100) {
											Class91.method1450((byte) 29, class64);
										}
									}
								} else if (class64.anInt1003 == 6) {
									boolean bool = Class23_Sub13_Sub15.method776(true, class64);
									Class38_Sub1 class38_sub1 = null;
									int i_51_;
									if (!bool) {
										i_51_ = class64.anInt1006;
									} else {
										i_51_ = class64.anInt1118;
									}
									int i_52_ = 0;
									if ((class64.anInt1122 ^ 0xffffffff) == 0) {
										if (class64.anInt1111 == 5) {
											if (class64.anInt1091 == -1) {
												class38_sub1 = Class82.aClass51_1440.method1166(-1, -1, (byte) -52, null, null);
											} else {
												int i_53_ = class64.anInt1091 & 0x7ff;
												if (i_53_ == Class23_Sub4_Sub10.anInt3049) {
													i_53_ = 2047;
												}
												Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_53_];
												Class23_Sub13_Sub22 class23_sub13_sub22 = i_51_ == -1 ? null : Class7.method90(i_51_, (byte) 113);
												if (class38_sub7_sub2 != null && ((int) class38_sub7_sub2.aClass16_4389.method184(-69) << 11 ^ 0xffffffff) == (~0x7ff & class64.anInt1091 ^ 0xffffffff)) {
													class38_sub1 = class38_sub7_sub2.aClass51_4393.method1166(class64.anInt1100, 0, (byte) -52, null, class23_sub13_sub22);
												}
											}
										} else if (i_51_ == -1) {
											class38_sub1 = class64.method1226(Class105.aClass38_Sub7_Sub2_1812.aClass51_4393, bool, null, -29797, -1);
											if (class38_sub1 == null && Class4.aBoolean100) {
												Class91.method1450((byte) 29, class64);
											}
										} else {
											Class23_Sub13_Sub22 class23_sub13_sub22 = Class7.method90(i_51_, (byte) 76);
											class38_sub1 = class64.method1226(Class105.aClass38_Sub7_Sub2_1812.aClass51_4393, bool, class23_sub13_sub22, -29797, class64.anInt1100);
											if (class38_sub1 == null && Class4.aBoolean100) {
												Class91.method1450((byte) 29, class64);
											}
										}
									} else {
										Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-68, class64.anInt1122);
										if (class23_sub13_sub11 != null) {
											class23_sub13_sub11 = class23_sub13_sub11.method735(123, class64.anInt1134);
											class38_sub1 = class23_sub13_sub11.method741(-17838, 0, 1, null);
											if (class38_sub1 != null) {
												i_52_ = -class38_sub1.method999() / 2;
											} else {
												Class91.method1450((byte) 29, class64);
											}
										}
									}
									if (class38_sub1 != null) {
										int i_54_;
										if (class64.anInt1018 <= 0) {
											i_54_ = 256;
										} else {
											i_54_ = (class64.anInt1128 << 8) / class64.anInt1018;
										}
										int i_55_ = (i_54_ * class64.anInt1044 >> 8) + i_15_ + class64.anInt1128 / 2;
										int i_56_;
										if (class64.anInt1076 > 0) {
											i_56_ = (class64.anInt999 << 8) / class64.anInt1076;
										} else {
											i_56_ = 256;
										}
										int i_57_ = i_17_ - (-(class64.anInt999 / 2) + -(i_56_ * class64.anInt1025 >> 8));
										Class76.method1317(i_55_, i_57_);
										int i_58_ = Class76.anIntArray1386[class64.anInt1107] * class64.anInt1050 >> 16;
										int i_59_ = Class76.anIntArray1395[class64.anInt1107] * class64.anInt1050 >> 16;
										if (!class64.aBoolean1017) {
											class38_sub1.method1018(0, class64.anInt1110, 0, class64.anInt1107, 0, i_58_, i_59_);
										} else if (!class64.aBoolean1004) {
											class38_sub1.method1018(0, class64.anInt1110, class64.anInt1000, class64.anInt1107, class64.anInt1015, class64.anInt1074 + i_52_ + i_58_, i_59_ + class64.anInt1074);
										} else {
											((Class38_Sub1_Sub1) class38_sub1).method1025(0, class64.anInt1110, class64.anInt1000, class64.anInt1107, class64.anInt1015, i_52_ + (i_58_ - -class64.anInt1074), i_59_ + class64.anInt1074, class64.anInt1050);
										}
										Class76.method1325();
									}
								} else {
									if (class64.anInt1003 == 7) {
										Class23_Sub13_Sub8 class23_sub13_sub8 = class64.method1223(Class23_Sub4_Sub1.aClass43Array2881, (byte) -6);
										if (class23_sub13_sub8 == null) {
											if (Class4.aBoolean100) {
												Class91.method1450((byte) 29, class64);
											}
											continue;
										}
										int i_60_ = 0;
										for (int i_61_ = 0; (class64.anInt1105 ^ 0xffffffff) < (i_61_ ^ 0xffffffff); i_61_++) {
											for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > (class64.anInt1112 ^ 0xffffffff); i_62_++) {
												if ((class64.anIntArray1028[i_60_] ^ 0xffffffff) < -1) {
													Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(127, class64.anIntArray1028[i_60_] - 1);
													RSString class16;
													if (class23_sub13_sub11.anInt3895 != 1 && class64.anIntArray1147[i_60_] == 1) {
														class16 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.aClass16_3902, Class23_Sub7.aClass16_2226 }, i_12_ + -69);
													} else {
														class16 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.aClass16_3902, Class23_Sub13_Sub16.aClass16_4041, Class90.method1448(class64.anIntArray1147[i_60_], i_12_ + -13523) }, -97);
													}
													int i_63_ = (class64.anInt1046 + 115) * i_62_ + i_15_;
													int i_64_ = i_17_ - -(i_61_ * (12 - -class64.anInt998));
													if ((class64.anInt1133 ^ 0xffffffff) != -1) {
														if (class64.anInt1133 != 1) {
															class23_sub13_sub8.method668(class16, 115 + (i_63_ - 1), i_64_, class64.anInt1033, class64.aBoolean1069 ? 0 : -1);
														} else {
															class23_sub13_sub8.method666(class16, i_63_ + 57, i_64_, class64.anInt1033, class64.aBoolean1069 ? 0 : -1);
														}
													} else {
														class23_sub13_sub8.method650(class16, i_63_, i_64_, class64.anInt1033, !class64.aBoolean1069 ? -1 : 0);
													}
												}
												i_60_++;
											}
										}
									}
									if (class64.anInt1003 == 8 && Class92.aClass64_1567 == class64 && (Class23_Sub4_Sub21.anInt3240 ^ 0xffffffff) == (Class105.anInt1811 ^ 0xffffffff)) {
										int i_65_ = 0;
										int i_66_ = 0;
										Class23_Sub13_Sub8 class23_sub13_sub8 = Class38_Sub7.aClass23_Sub13_Sub8_2637;
										RSString class16 = class64.aClass16_1070;
										class16 = Class54.method1178(12445, class64, class16);
										while (class16.method171(i_12_ + -60) > 0) {
											int i_67_ = class16.method173(95, Class14.aClass16_276);
											RSString class16_68_;
											if (i_67_ != -1) {
												class16_68_ = class16.method148(i_67_, 0, true);
												class16 = class16.method138((byte) 91, 4 + i_67_);
											} else {
												class16_68_ = class16;
												class16 = Class23_Sub4_Sub38.aClass16_3509;
											}
											int i_69_ = class23_sub13_sub8.method649(class16_68_);
											i_66_ += 1 + class23_sub13_sub8.anInt3811;
											if ((i_69_ ^ 0xffffffff) < (i_65_ ^ 0xffffffff)) {
												i_65_ = i_69_;
											}
										}
										i_66_ += 7;
										int i_70_ = i_17_ + (class64.anInt999 - -5);
										if ((i_7_ ^ 0xffffffff) > (i_70_ - -i_66_ ^ 0xffffffff)) {
											i_70_ = -i_66_ + i_7_;
										}
										i_65_ += 6;
										int i_71_ = -i_65_ + (i_15_ + class64.anInt1128) + -5;
										if ((5 + i_15_ ^ 0xffffffff) < (i_71_ ^ 0xffffffff)) {
											i_71_ = 5 + i_15_;
										}
										if ((i_9_ ^ 0xffffffff) > (i_65_ + i_71_ ^ 0xffffffff)) {
											i_71_ = i_9_ + -i_65_;
										}
										Class20.method222(i_71_, i_70_, i_65_, i_66_, 16777120);
										Class20.method215(i_71_, i_70_, i_65_, i_66_, 0);
										int i_72_ = i_70_ - (-class23_sub13_sub8.anInt3811 - 2);
										class16 = class64.aClass16_1070;
										class16 = Class54.method1178(12445, class64, class16);
										while ((class16.method171(i_12_ + -60) ^ 0xffffffff) < -1) {
											int i_73_ = class16.method173(104, Class14.aClass16_276);
											RSString class16_74_;
											if ((i_73_ ^ 0xffffffff) == 0) {
												class16_74_ = class16;
												class16 = Class23_Sub4_Sub38.aClass16_3509;
											} else {
												class16_74_ = class16.method148(i_73_, 0, true);
												class16 = class16.method138((byte) 109, i_73_ + 4);
											}
											class23_sub13_sub8.method650(class16_74_, i_71_ + 3, i_72_, 0, -1);
											i_72_ += 1 + class23_sub13_sub8.anInt3811;
										}
									}
									if (class64.anInt1003 == 9) {
										int i_75_;
										int i_76_;
										int i_77_;
										int i_78_;
										if (!class64.aBoolean1123) {
											i_75_ = i_15_;
											i_76_ = class64.anInt1128 + i_15_;
											i_77_ = i_17_;
											i_78_ = i_17_ + class64.anInt999;
										} else {
											i_75_ = i_15_;
											i_76_ = i_15_ - -class64.anInt1128;
											i_77_ = class64.anInt999 + i_17_;
											i_78_ = i_17_;
										}
										if (class64.anInt1063 != 1) {
											Class20.method209(i_75_, i_77_, i_76_, i_78_, class64.anInt1033, class64.anInt1063);
										} else {
											Class20.method203(i_75_, i_77_, i_76_, i_78_, class64.anInt1033);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		anInt1634++;
	}
	
	public static void method1491(int i) {
		aClass16_1631 = null;
		aClass16_1642 = null;
		aClass6_1646 = null;
		if (i == 0) {
			aClass16_1644 = null;
			aClass16_1639 = null;
			aClass16_1636 = null;
			aClass16_1641 = null;
			aClass16_1647 = null;
			aClass16_1640 = null;
			aClass16_1638 = null;
			aClass16_1637 = null;
		}
	}
	
	static {
		aClass16_1638 = Class38_Sub6.method1076((byte) 86, "Password: ");
		aClass16_1639 = Class38_Sub6.method1076((byte) 86, "Select a world");
		aClass16_1642 = aClass16_1638;
		aClass16_1644 = aClass16_1639;
		aClass16_1641 = Class38_Sub6.method1076((byte) 86, "Fps:");
		anInt1645 = -1;
		aClass16_1647 = Class38_Sub6.method1076((byte) 86, " ");
	}
}
