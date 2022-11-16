/* Class23_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class23_Sub23 extends Class23
{
	static int[] anIntArray2417;
	protected int anInt2418;
	protected int anInt2419;
	static int anInt2420 = 0;
	static int anInt2421;
	static int anInt2422;
	protected int anInt2423;
	static int anInt2424;
	static int anInt2425;
	static int anInt2426;
	static Class34 aClass34_2427;
	protected int anInt2428;
	protected int anInt2429 = 0;
	protected int anInt2430;
	protected int anInt2431;
	static RSString[] aClass16Array2432 = new RSString[8];
	protected int anInt2433;
	protected int anInt2434;
	static int anInt2435 = 0;
	protected int anInt2436;
	protected int anInt2437 = -1;
	protected int anInt2438;
	
	public static void method895(int i) {
		aClass34_2427 = null;
		anIntArray2417 = null;
		aClass16Array2432 = null;
		if (i < 100) {
			method895(72);
		}
	}
	
	static final void method896(int i, Class23_Sub9 class23_sub9, boolean bool) {
		Object[] objects = class23_sub9.anObjectArray2274;
		int i_0_ = ((Integer) objects[0]).intValue();
		if (bool == true) {
			anInt2421++;
			Class23_Sub13_Sub23 class23_sub13_sub23 = Class59.method1196(i_0_, -17384);
			if (class23_sub13_sub23 != null) {
				Class92.anInt1566 = 0;
				int i_1_ = 0;
				int i_2_ = 0;
				int[] is = class23_sub13_sub23.anIntArray4236;
				int[] is_3_ = class23_sub13_sub23.anIntArray4253;
				int i_4_ = -1;
				int i_5_ = -1;
				try {
					Class79.anIntArray1885 = new int[class23_sub13_sub23.anInt4247];
					int i_6_ = 0;
					int i_7_ = 0;
					Class46.aClass16Array713 = new RSString[class23_sub13_sub23.anInt4234];
					for (int i_8_ = 1; (i_8_ ^ 0xffffffff) > (objects.length ^ 0xffffffff); i_8_++) {
						if (objects[i_8_] instanceof Integer) {
							int i_9_ = ((Integer) objects[i_8_]).intValue();
							if (i_9_ == -2147483647) {
								i_9_ = class23_sub9.anInt2264;
							}
							if (i_9_ == -2147483646) {
								i_9_ = class23_sub9.anInt2258;
							}
							if ((i_9_ ^ 0xffffffff) == 2147483644) {
								i_9_ = class23_sub9.aClass64_2263 == null ? -1 : class23_sub9.aClass64_2263.anInt1098;
							}
							if ((i_9_ ^ 0xffffffff) == 2147483643) {
								i_9_ = class23_sub9.anInt2270;
							}
							if ((i_9_ ^ 0xffffffff) == 2147483642) {
								i_9_ = class23_sub9.aClass64_2263 == null ? -1 : class23_sub9.aClass64_2263.anInt1005;
							}
							if ((i_9_ ^ 0xffffffff) == 2147483641) {
								i_9_ = class23_sub9.aClass64_2255 != null ? class23_sub9.aClass64_2255.anInt1098 : -1;
							}
							if ((i_9_ ^ 0xffffffff) == 2147483640) {
								i_9_ = class23_sub9.aClass64_2255 == null ? -1 : class23_sub9.aClass64_2255.anInt1005;
							}
							if (i_9_ == -2147483640) {
								i_9_ = class23_sub9.anInt2261;
							}
							if ((i_9_ ^ 0xffffffff) == 2147483638) {
								i_9_ = class23_sub9.anInt2266;
							}
							Class79.anIntArray1885[i_6_++] = i_9_;
						} else if (objects[i_8_] instanceof RSString) {
							RSString class16 = (RSString) objects[i_8_];
							if (class16.method183(Class91.aClass16_1558, (byte) -49)) {
								class16 = class23_sub9.aClass16_2260;
							}
							Class46.aClass16Array713[i_7_++] = class16;
						}
					}
					int i_10_ = 0;
					for (;;) {
						if (++i_10_ > i) {
							throw new RuntimeException("slow");
						}
						i_4_ = is[++i_5_];
						if (i_4_ < 100) {
							if ((i_4_ ^ 0xffffffff) == -1) {
								Class26.anIntArray393[i_1_++] = is_3_[i_5_];
								continue;
							}
							if (i_4_ == 1) {
								int i_11_ = is_3_[i_5_];
								Class26.anIntArray393[i_1_++] = Class23_Sub4_Sub26.anIntArray3323[i_11_];
								continue;
							}
							if (i_4_ == 2) {
								int i_12_ = is_3_[i_5_];
								Class23_Sub4_Sub26.anIntArray3323[i_12_] = Class26.anIntArray393[--i_1_];
								continue;
							}
							if (i_4_ == 3) {
								Class79.aClass16Array1878[i_2_++] = class23_sub13_sub23.aClass16Array4237[i_5_];
								continue;
							}
							if (i_4_ == 6) {
								i_5_ += is_3_[i_5_];
								continue;
							}
							if (i_4_ == 7) {
								i_1_ -= 2;
								if ((Class26.anIntArray393[i_1_ - -1] ^ 0xffffffff) != (Class26.anIntArray393[i_1_] ^ 0xffffffff)) {
									i_5_ += is_3_[i_5_];
								}
								continue;
							}
							if (i_4_ == 8) {
								i_1_ -= 2;
								if ((Class26.anIntArray393[1 + i_1_] ^ 0xffffffff) == (Class26.anIntArray393[i_1_] ^ 0xffffffff)) {
									i_5_ += is_3_[i_5_];
								}
								continue;
							}
							if (i_4_ == 9) {
								i_1_ -= 2;
								if (Class26.anIntArray393[1 + i_1_] > Class26.anIntArray393[i_1_]) {
									i_5_ += is_3_[i_5_];
								}
								continue;
							}
							if (i_4_ == 10) {
								i_1_ -= 2;
								if (Class26.anIntArray393[1 + i_1_] < Class26.anIntArray393[i_1_]) {
									i_5_ += is_3_[i_5_];
								}
								continue;
							}
							if (i_4_ == 21) {
								if (Class92.anInt1566 != 0) {
									Class50 class50 = Class23_Sub4_Sub36.aClass50Array3463[--Class92.anInt1566];
									Class46.aClass16Array713 = class50.aClass16Array782;
									Class79.anIntArray1885 = class50.anIntArray785;
									i_5_ = class50.anInt772;
									class23_sub13_sub23 = class50.aClass23_Sub13_Sub23_778;
									is = class23_sub13_sub23.anIntArray4236;
									is_3_ = class23_sub13_sub23.anIntArray4253;
									continue;
								}
								return;
							}
							if (i_4_ == 25) {
								int i_13_ = is_3_[i_5_];
								Class26.anIntArray393[i_1_++] = Class103.method1517(-68, i_13_);
								continue;
							}
							if (i_4_ == 27) {
								int i_14_ = is_3_[i_5_];
								Class78.method1348(0, i_14_, Class26.anIntArray393[--i_1_]);
								continue;
							}
							if (i_4_ == 31) {
								i_1_ -= 2;
								if (Class26.anIntArray393[1 + i_1_] >= Class26.anIntArray393[i_1_]) {
									i_5_ += is_3_[i_5_];
								}
								continue;
							}
							if (i_4_ == 32) {
								i_1_ -= 2;
								if (Class26.anIntArray393[i_1_ - -1] <= Class26.anIntArray393[i_1_]) {
									i_5_ += is_3_[i_5_];
								}
								continue;
							}
							if (i_4_ == 33) {
								Class26.anIntArray393[i_1_++] = Class79.anIntArray1885[is_3_[i_5_]];
								continue;
							}
							if (i_4_ == 34) {
								Class79.anIntArray1885[is_3_[i_5_]] = Class26.anIntArray393[--i_1_];
								continue;
							}
							if (i_4_ == 35) {
								Class79.aClass16Array1878[i_2_++] = Class46.aClass16Array713[is_3_[i_5_]];
								continue;
							}
							if (i_4_ == 36) {
								Class46.aClass16Array713[is_3_[i_5_]] = Class79.aClass16Array1878[--i_2_];
								continue;
							}
							if (i_4_ == 37) {
								int i_15_ = is_3_[i_5_];
								i_2_ -= i_15_;
								RSString class16 = Class23_Sub4_Sub29.method389(Class79.aClass16Array1878, -32768, i_2_, i_15_);
								Class79.aClass16Array1878[i_2_++] = class16;
								continue;
							}
							if (i_4_ == 38) {
								i_1_--;
								continue;
							}
							if (i_4_ == 39) {
								i_2_--;
								continue;
							}
							if (i_4_ == 40) {
								int i_16_ = is_3_[i_5_];
								Class23_Sub13_Sub23 class23_sub13_sub23_17_ = Class59.method1196(i_16_, -17384);
								RSString[] class16s = new RSString[class23_sub13_sub23_17_.anInt4234];
								int[] is_18_ = new int[class23_sub13_sub23_17_.anInt4247];
								for (int i_19_ = 0; (class23_sub13_sub23_17_.anInt4241 ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++)
									is_18_[i_19_] = Class26.anIntArray393[-class23_sub13_sub23_17_.anInt4241 + i_1_ + i_19_];
								for (int i_20_ = 0; (class23_sub13_sub23_17_.anInt4246 ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++)
									class16s[i_20_] = Class79.aClass16Array1878[i_20_ + i_2_ - class23_sub13_sub23_17_.anInt4246];
								i_1_ -= class23_sub13_sub23_17_.anInt4241;
								i_2_ -= class23_sub13_sub23_17_.anInt4246;
								Class50 class50 = new Class50();
								class50.anIntArray785 = Class79.anIntArray1885;
								class50.aClass23_Sub13_Sub23_778 = class23_sub13_sub23;
								class50.anInt772 = i_5_;
								class50.aClass16Array782 = Class46.aClass16Array713;
								if (Class92.anInt1566 >= Class23_Sub4_Sub36.aClass50Array3463.length) {
									throw new RuntimeException();
								}
								Class23_Sub4_Sub36.aClass50Array3463[Class92.anInt1566++] = class50;
								Class79.anIntArray1885 = is_18_;
								i_5_ = -1;
								Class46.aClass16Array713 = class16s;
								class23_sub13_sub23 = class23_sub13_sub23_17_;
								is_3_ = class23_sub13_sub23.anIntArray4253;
								is = class23_sub13_sub23.anIntArray4236;
								continue;
							}
							if (i_4_ == 42) {
								Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub24.anIntArray4278[is_3_[i_5_]];
								continue;
							}
							if (i_4_ == 43) {
								Class23_Sub13_Sub24.anIntArray4278[is_3_[i_5_]] = Class26.anIntArray393[--i_1_];
								continue;
							}
							if (i_4_ == 44) {
								int i_21_ = is_3_[i_5_] >> 16;
								int i_22_ = is_3_[i_5_] & 0xffff;
								int i_23_ = Class26.anIntArray393[--i_1_];
								if ((i_23_ ^ 0xffffffff) > -1 || i_23_ > 5000) {
									throw new RuntimeException();
								}
								Class23_Sub14.anIntArray2335[i_21_] = i_23_;
								int i_24_ = -1;
								if (i_22_ == 105) {
									i_24_ = 0;
								}
								for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff); i_25_++)
									Class23_Sub21.anIntArrayArray2410[i_21_][i_25_] = i_24_;
								continue;
							}
							if (i_4_ == 45) {
								int i_26_ = is_3_[i_5_];
								int i_27_ = Class26.anIntArray393[--i_1_];
								if ((i_27_ ^ 0xffffffff) > -1 || Class23_Sub14.anIntArray2335[i_26_] <= i_27_) {
									throw new RuntimeException();
								}
								Class26.anIntArray393[i_1_++] = Class23_Sub21.anIntArrayArray2410[i_26_][i_27_];
								continue;
							}
							if (i_4_ == 46) {
								i_1_ -= 2;
								int i_28_ = is_3_[i_5_];
								int i_29_ = Class26.anIntArray393[i_1_];
								if (i_29_ < 0 || (Class23_Sub14.anIntArray2335[i_28_] ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)) {
									throw new RuntimeException();
								}
								Class23_Sub21.anIntArrayArray2410[i_28_][i_29_] = Class26.anIntArray393[i_1_ + 1];
								continue;
							}
							if (i_4_ == 47) {
								RSString class16 = Class23_Sub4_Sub3.aClass16Array2951[is_3_[i_5_]];
								if (class16 == null) {
									class16 = Class40.aClass16_629;
								}
								Class79.aClass16Array1878[i_2_++] = class16;
								continue;
							}
							if (i_4_ == 48) {
								Class23_Sub4_Sub3.aClass16Array2951[is_3_[i_5_]] = Class79.aClass16Array1878[--i_2_];
								continue;
							}
							if (i_4_ == 51) {
								oa var_oa = class23_sub13_sub23.anOaArray4235[is_3_[i_5_]];
								Class23_Sub20 class23_sub20 = (Class23_Sub20) var_oa.a((byte) 113, (long) Class26.anIntArray393[--i_1_]);
								if (class23_sub20 != null) {
									i_5_ += class23_sub20.anInt2394;
								}
								continue;
							}
						}
						boolean bool_30_;
						if (is_3_[i_5_] == 1) {
							bool_30_ = true;
						} else {
							bool_30_ = false;
						}
						if (i_4_ < 300) {
							if (i_4_ == 100) {
								i_1_ -= 3;
								int i_31_ = Class26.anIntArray393[i_1_ - -1];
								int i_32_ = Class26.anIntArray393[2 + i_1_];
								int i_33_ = Class26.anIntArray393[i_1_];
								if ((i_31_ ^ 0xffffffff) == -1) {
									throw new RuntimeException();
								}
								Class64 class64 = Class23_Sub24.method905(i_33_, (byte) 111);
								if (class64.aClass64Array1131 == null) {
									class64.aClass64Array1131 = new Class64[1 + i_32_];
								}
								if ((class64.aClass64Array1131.length ^ 0xffffffff) >= (i_32_ ^ 0xffffffff)) {
									Class64[] class64s = new Class64[i_32_ - -1];
									for (int i_34_ = 0; (class64.aClass64Array1131.length ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++)
										class64s[i_34_] = class64.aClass64Array1131[i_34_];
									class64.aClass64Array1131 = class64s;
								}
								if ((i_32_ ^ 0xffffffff) < -1 && class64.aClass64Array1131[-1 + i_32_] == null) {
									throw new RuntimeException("Gap at:" + (i_32_ + -1));
								}
								Class64 class64_35_ = new Class64();
								class64_35_.aBoolean1017 = true;
								class64_35_.anInt1005 = i_32_;
								class64_35_.anInt1056 = class64_35_.anInt1098 = class64.anInt1098;
								class64_35_.anInt1003 = i_31_;
								class64.aClass64Array1131[i_32_] = class64_35_;
								if (!bool_30_) {
									Class61.aClass64_959 = class64_35_;
								} else {
									Class23_Sub4_Sub4.aClass64_2965 = class64_35_;
								}
								Class91.method1450((byte) 29, class64);
							} else if (i_4_ == 101) {
								Class64 class64 = bool_30_ ? Class23_Sub4_Sub4.aClass64_2965 : Class61.aClass64_959;
								if (class64.anInt1005 == -1) {
									if (!bool_30_) {
										throw new RuntimeException("Tried to cc_delete static active-component!");
									}
									throw new RuntimeException("Tried to .cc_delete static .active-component!");
								}
								Class64 class64_36_ = Class23_Sub24.method905(class64.anInt1098, (byte) 111);
								class64_36_.aClass64Array1131[class64.anInt1005] = null;
								Class91.method1450((byte) 29, class64_36_);
							} else if (i_4_ == 102) {
								Class64 class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
								class64.aClass64Array1131 = null;
								Class91.method1450((byte) 29, class64);
							} else if (i_4_ == 200) {
								i_1_ -= 2;
								int i_37_ = Class26.anIntArray393[i_1_];
								int i_38_ = Class26.anIntArray393[1 + i_1_];
								Class64 class64 = Class23_Sub13_Sub8_Sub1.method679(i_37_, i_38_, (byte) -127);
								if (class64 == null || (i_38_ ^ 0xffffffff) == 0) {
									Class26.anIntArray393[i_1_++] = 0;
								} else {
									Class26.anIntArray393[i_1_++] = 1;
									if (bool_30_) {
										Class23_Sub4_Sub4.aClass64_2965 = class64;
									} else {
										Class61.aClass64_959 = class64;
									}
								}
							} else {
								if (i_4_ != 201) {
									break;
								}
								int i_39_ = Class26.anIntArray393[--i_1_];
								Class64 class64 = Class23_Sub24.method905(i_39_, (byte) 111);
								if (class64 == null) {
									Class26.anIntArray393[i_1_++] = 0;
								} else {
									Class26.anIntArray393[i_1_++] = 1;
									if (bool_30_) {
										Class23_Sub4_Sub4.aClass64_2965 = class64;
									} else {
										Class61.aClass64_959 = class64;
									}
								}
							}
						} else if (i_4_ < 500) {
							if (i_4_ == 403) {
								i_1_ -= 2;
								int i_40_ = Class26.anIntArray393[1 + i_1_];
								int i_41_ = Class26.anIntArray393[i_1_];
								if (i_41_ >= 7) {
									i_41_ -= 7;
								}
								Class105.aClass38_Sub7_Sub2_1812.aClass51_4393.method1165(i_40_, -1, i_41_);
							} else if (i_4_ == 404) {
								i_1_ -= 2;
								int i_42_ = Class26.anIntArray393[i_1_];
								int i_43_ = Class26.anIntArray393[i_1_ - -1];
								Class105.aClass38_Sub7_Sub2_1812.aClass51_4393.method1168(i_42_, i_43_, (byte) -101);
							} else {
								if (i_4_ != 410) {
									break;
								}
								boolean bool_44_ = Class26.anIntArray393[--i_1_] != 0;
								Class105.aClass38_Sub7_Sub2_1812.aClass51_4393.method1169(bool, bool_44_);
							}
						} else if ((i_4_ < 1000 || i_4_ >= 1100) && (i_4_ < 2000 || i_4_ >= 2100)) {
							if ((i_4_ < 1100 || i_4_ >= 1200) && (i_4_ < 2100 || i_4_ >= 2200)) {
								if ((i_4_ < 1200 || i_4_ >= 1300) && (i_4_ < 2200 || i_4_ >= 2300)) {
									if ((i_4_ < 1300 || i_4_ >= 1400) && (i_4_ < 2300 || i_4_ >= 2400)) {
										if (i_4_ >= 1400 && i_4_ < 1500 || i_4_ >= 2400 && i_4_ < 2500) {
											Class64 class64;
											if (i_4_ >= 2000) {
												class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
												i_4_ -= 1000;
											} else {
												class64 = bool_30_ ? Class23_Sub4_Sub4.aClass64_2965 : Class61.aClass64_959;
											}
											int[] is_45_ = null;
											RSString class16 = Class79.aClass16Array1878[--i_2_];
											if ((class16.method171(-61) ^ 0xffffffff) < -1 && class16.method166((byte) 92, class16.method171(-61) + -1) == 89) {
												int i_46_ = Class26.anIntArray393[--i_1_];
												if (i_46_ > 0) {
													is_45_ = new int[i_46_];
													while ((i_46_-- ^ 0xffffffff) < -1)
														is_45_[i_46_] = Class26.anIntArray393[--i_1_];
												}
												class16 = class16.method148(-1 + class16.method171(-61), 0, true);
											}
											Object[] objects_47_ = new Object[1 + class16.method171(-61)];
											for (int i_48_ = objects_47_.length + -1; i_48_ >= 1; i_48_--) {
												if (class16.method166((byte) 100, i_48_ + -1) != 115) {
													objects_47_[i_48_] = new Integer(Class26.anIntArray393[--i_1_]);
												} else {
													objects_47_[i_48_] = Class79.aClass16Array1878[--i_2_];
												}
											}
											int i_49_ = Class26.anIntArray393[--i_1_];
											if (i_49_ != -1) {
												objects_47_[0] = new Integer(i_49_);
											} else {
												objects_47_ = null;
											}
											if (i_4_ == 1423) {
												class64.anObjectArray1119 = objects_47_;
											}
											if (i_4_ == 1400) {
												class64.anObjectArray1008 = objects_47_;
											}
											if (i_4_ == 1402) {
												class64.anObjectArray1023 = objects_47_;
											}
											if (i_4_ == 1418) {
												class64.anObjectArray1065 = objects_47_;
											}
											if (i_4_ == 1416) {
												class64.anObjectArray1026 = objects_47_;
											}
											if (i_4_ == 1407) {
												class64.anObjectArray1049 = objects_47_;
												class64.anIntArray1140 = is_45_;
											}
											if (i_4_ == 1419) {
												class64.anObjectArray1052 = objects_47_;
											}
											if (i_4_ == 1420) {
												class64.anObjectArray1104 = objects_47_;
											}
											if (i_4_ == 1404) {
												class64.anObjectArray1073 = objects_47_;
											}
											if (i_4_ == 1403) {
												class64.anObjectArray1036 = objects_47_;
											}
											if (i_4_ == 1408) {
												class64.anObjectArray997 = objects_47_;
											}
											if (i_4_ == 1424) {
												class64.anObjectArray1014 = objects_47_;
											}
											if (i_4_ == 1406) {
												class64.anObjectArray1012 = objects_47_;
											}
											if (i_4_ == 1425) {
												class64.anObjectArray1092 = objects_47_;
											}
											if (i_4_ == 1410) {
												class64.anObjectArray1066 = objects_47_;
											}
											if (i_4_ == 1405) {
												class64.anObjectArray1053 = objects_47_;
											}
											if (i_4_ == 1409) {
												class64.anObjectArray1116 = objects_47_;
											}
											if (i_4_ == 1411) {
												class64.anObjectArray1093 = objects_47_;
											}
											if (i_4_ == 1401) {
												class64.anObjectArray1022 = objects_47_;
											}
											class64.aBoolean1084 = true;
											if (i_4_ == 1421) {
												class64.anObjectArray1137 = objects_47_;
											}
											if (i_4_ == 1422) {
												class64.anObjectArray1096 = objects_47_;
											}
											if (i_4_ == 1412) {
												class64.anObjectArray1001 = objects_47_;
											}
											if (i_4_ == 1414) {
												class64.anObjectArray1035 = objects_47_;
												class64.anIntArray1101 = is_45_;
											}
											if (i_4_ == 1415) {
												class64.anObjectArray1032 = objects_47_;
												class64.anIntArray1117 = is_45_;
											}
											if (i_4_ == 1417) {
												class64.anObjectArray1040 = objects_47_;
											}
										} else if (i_4_ < 1600) {
											Class64 class64 = bool_30_ ? Class23_Sub4_Sub4.aClass64_2965 : Class61.aClass64_959;
											if (i_4_ == 1500) {
												Class26.anIntArray393[i_1_++] = class64.anInt1120;
											} else if (i_4_ == 1501) {
												Class26.anIntArray393[i_1_++] = class64.anInt1126;
											} else if (i_4_ == 1502) {
												Class26.anIntArray393[i_1_++] = class64.anInt1128;
											} else if (i_4_ == 1503) {
												Class26.anIntArray393[i_1_++] = class64.anInt999;
											} else if (i_4_ == 1504) {
												Class26.anIntArray393[i_1_++] = class64.aBoolean1135 ? 1 : 0;
											} else {
												if (i_4_ != 1505) {
													break;
												}
												Class26.anIntArray393[i_1_++] = class64.anInt1056;
											}
										} else if (i_4_ >= 1700) {
											if (i_4_ >= 1800) {
												if (i_4_ >= 1900) {
													if (i_4_ >= 2600) {
														if (i_4_ >= 2700) {
															if (i_4_ >= 2800) {
																if (i_4_ < 2900) {
																	Class64 class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
																	if (i_4_ == 2800) {
																		Class26.anIntArray393[i_1_++] = Class74.method1313(-82, Class47.method1142(class64, 82));
																	} else if (i_4_ == 2801) {
																		int i_50_ = Class26.anIntArray393[--i_1_];
																		i_50_--;
																		if (class64.aClass16Array1021 != null && class64.aClass16Array1021.length > i_50_ && class64.aClass16Array1021[i_50_] != null) {
																			Class79.aClass16Array1878[i_2_++] = class64.aClass16Array1021[i_50_];
																		} else {
																			Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																		}
																	} else {
																		if (i_4_ != 2802) {
																			break;
																		}
																		if (class64.aClass16_1130 != null) {
																			Class79.aClass16Array1878[i_2_++] = class64.aClass16_1130;
																		} else {
																			Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																		}
																	}
																} else if (i_4_ < 3200) {
																	if (i_4_ == 3100) {
																		RSString class16 = Class79.aClass16Array1878[--i_2_];
																		Class95.method1468(0, -1, class16, Class94.aClass16_1600);
																	} else if (i_4_ == 3101) {
																		i_1_ -= 2;
																		Class23_Sub4_Sub22.method356(0, Class26.anIntArray393[i_1_ + 1], Class26.anIntArray393[i_1_], Class105.aClass38_Sub7_Sub2_1812);
																	} else if (i_4_ == 3103) {
																		Buffer.method444(-7602);
																	} else if (i_4_ == 3104) {
																		Class23_Sub20.anInt2395++;
																		int i_51_ = 0;
																		RSString class16 = Class79.aClass16Array1878[--i_2_];
																		if (class16.method170(false)) {
																			i_51_ = class16.method142(true);
																		}
																		Class23_Sub7.outBuffer.method486(200, 2976);
																		Class23_Sub7.outBuffer.writeIntBE(i_51_, -1137894376);
																	} else if (i_4_ == 3105) {
																		RSString class16 = Class79.aClass16Array1878[--i_2_];
																		Class10.anInt201++;
																		Class23_Sub7.outBuffer.method486(179, 2976);
																		Class23_Sub7.outBuffer.method436(class16.method184(-126), (byte) -108);
																	} else if (i_4_ == 3106) {
																		Class23_Sub4_Sub30.anInt3386++;
																		RSString class16 = Class79.aClass16Array1878[--i_2_];
																		Class23_Sub7.outBuffer.method486(106, 2976);
																		Class23_Sub7.outBuffer.method460((byte) 116, class16.method171(-61) + 1);
																		Class23_Sub7.outBuffer.method446(class16, -104);
																	} else if (i_4_ == 3107) {
																		int i_52_ = Class26.anIntArray393[--i_1_];
																		RSString class16 = Class79.aClass16Array1878[--i_2_];
																		Class92.method1457(i_52_, (byte) -121, class16);
																	} else if (i_4_ == 3108) {
																		i_1_ -= 3;
																		int i_53_ = Class26.anIntArray393[i_1_ - -1];
																		int i_54_ = Class26.anIntArray393[i_1_];
																		int i_55_ = Class26.anIntArray393[i_1_ - -2];
																		Class64 class64 = Class23_Sub24.method905(i_55_, (byte) 111);
																		Class23_Sub4_Sub1.method273(class64, (byte) -114, i_53_, i_54_);
																	} else if (i_4_ == 3109) {
																		Class64 class64 = bool_30_ ? Class23_Sub4_Sub4.aClass64_2965 : Class61.aClass64_959;
																		i_1_ -= 2;
																		int i_56_ = Class26.anIntArray393[i_1_];
																		int i_57_ = Class26.anIntArray393[i_1_ - -1];
																		Class23_Sub4_Sub1.method273(class64, (byte) -105, i_57_, i_56_);
																	} else {
																		if (i_4_ != 3110) {
																			break;
																		}
																		Class23_Sub4_Sub27.anInt3326++;
																		int i_58_ = Class26.anIntArray393[--i_1_];
																		Class23_Sub7.outBuffer.method486(112, 2976);
																		Class23_Sub7.outBuffer.method443(i_58_, (byte) 51);
																	}
																} else if (i_4_ >= 3300) {
																	if (i_4_ >= 3400) {
																		if (i_4_ >= 3500) {
																			if (i_4_ >= 3700) {
																				if (i_4_ < 4000) {
																					if (i_4_ == 3903) {
																						int i_59_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub19.aClass90Array4135[i_59_].method1443(-26124);
																					} else if (i_4_ == 3904) {
																						int i_60_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub19.aClass90Array4135[i_60_].anInt1528;
																					} else if (i_4_ == 3905) {
																						int i_61_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub19.aClass90Array4135[i_61_].anInt1537;
																					} else if (i_4_ == 3906) {
																						int i_62_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub19.aClass90Array4135[i_62_].anInt1547;
																					} else if (i_4_ == 3907) {
																						int i_63_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub19.aClass90Array4135[i_63_].anInt1531;
																					} else if (i_4_ == 3908) {
																						int i_64_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub19.aClass90Array4135[i_64_].anInt1534;
																					} else if (i_4_ == 3910) {
																						int i_65_ = Class26.anIntArray393[--i_1_];
																						int i_66_ = Class23_Sub13_Sub19.aClass90Array4135[i_65_].method1445(224);
																						Class26.anIntArray393[i_1_++] = (i_66_ ^ 0xffffffff) != -1 ? 0 : 1;
																					} else if (i_4_ == 3911) {
																						int i_67_ = Class26.anIntArray393[--i_1_];
																						int i_68_ = Class23_Sub13_Sub19.aClass90Array4135[i_67_].method1445(224);
																						Class26.anIntArray393[i_1_++] = i_68_ == 2 ? 1 : 0;
																					} else if (i_4_ == 3912) {
																						int i_69_ = Class26.anIntArray393[--i_1_];
																						int i_70_ = Class23_Sub13_Sub19.aClass90Array4135[i_69_].method1445(224);
																						Class26.anIntArray393[i_1_++] = i_70_ != 5 ? 0 : 1;
																					} else {
																						if (i_4_ != 3913) {
																							break;
																						}
																						int i_71_ = Class26.anIntArray393[--i_1_];
																						int i_72_ = Class23_Sub13_Sub19.aClass90Array4135[i_71_].method1445(224);
																						Class26.anIntArray393[i_1_++] = i_72_ != 1 ? 0 : 1;
																					}
																				} else if (i_4_ >= 4100) {
																					if (i_4_ >= 4200) {
																						if (i_4_ >= 4300) {
																							if (i_4_ >= 5100) {
																								if (i_4_ < 5200) {
																									if (i_4_ == 5100) {
																										if (Class23_Sub13_Sub8_Sub1.aBooleanArray4492[86]) {
																											Class26.anIntArray393[i_1_++] = 1;
																										} else {
																											Class26.anIntArray393[i_1_++] = 0;
																										}
																									} else if (i_4_ == 5101) {
																										if (!Class23_Sub13_Sub8_Sub1.aBooleanArray4492[82]) {
																											Class26.anIntArray393[i_1_++] = 0;
																										} else {
																											Class26.anIntArray393[i_1_++] = 1;
																										}
																									} else {
																										if (i_4_ != 5102) {
																											break;
																										}
																										if (!Class23_Sub13_Sub8_Sub1.aBooleanArray4492[81]) {
																											Class26.anIntArray393[i_1_++] = 0;
																										} else {
																											Class26.anIntArray393[i_1_++] = 1;
																										}
																									}
																								} else if (i_4_ >= 5300) {
																									if (i_4_ < 5400) {
																										if (i_4_ != 5304) {
																											break;
																										}
																										Class26.anIntArray393[i_1_++] = 0;
																									} else {
																										if (i_4_ >= 5500) {
																											break;
																										}
																										if (i_4_ == 5400) {
																											Class24.anInt361++;
																											i_2_ -= 2;
																											RSString class16 = Class79.aClass16Array1878[i_2_ - -1];
																											int i_73_ = Class26.anIntArray393[--i_1_];
																											RSString class16_74_ = Class79.aClass16Array1878[i_2_];
																											Class23_Sub7.outBuffer.method486(240, 2976);
																											Class23_Sub7.outBuffer.method460((byte) 111, 1 + Class82.method1372(class16_74_, (byte) 51) - -Class82.method1372(class16, (byte) 24));
																											Class23_Sub7.outBuffer.method446(class16_74_, -126);
																											Class23_Sub7.outBuffer.method446(class16, -91);
																											Class23_Sub7.outBuffer.method460((byte) 120, i_73_);
																										} else {
																											if (i_4_ != 5401) {
																												break;
																											}
																											i_1_ -= 2;
																											Class74.aShortArray1339[Class26.anIntArray393[i_1_]] = (short) Class23_Sub4_Sub25.method376(Class26.anIntArray393[1 + i_1_], 4);
																											Class23_Sub4_Sub21.method353((byte) 69);
																											Class23_Sub21.method890((byte) 117);
																											Class23_Sub26.method910(bool);
																											Class7.method94(0);
																											Class4.method60(11980);
																										}
																									}
																								} else if (i_4_ == 5200) {
																									Class23_Sub4_Sub32.method406(-7606, Class26.anIntArray393[--i_1_]);
																								} else if (i_4_ == 5201) {
																									Class26.anIntArray393[i_1_++] = Class23_Sub4_Sub20.method349(16493);
																								} else if (i_4_ == 5202) {
																									Class23_Sub10_Sub2.method581(Class26.anIntArray393[--i_1_], -101);
																								} else if (i_4_ == 5203) {
																									Class38_Sub5.method1068((byte) 71, Class79.aClass16Array1878[--i_2_]);
																								} else if (i_4_ == 5204) {
																									Class79.aClass16Array1878[-1 + i_2_] = Class87_Sub2.method1413(Class79.aClass16Array1878[-1 + i_2_], (byte) 88);
																								} else {
																									if (i_4_ != 5205) {
																										break;
																									}
																									Class23_Sub4_Sub21.method350(-314128180, Class79.aClass16Array1878[--i_2_]);
																								}
																							} else if (i_4_ == 5000) {
																								Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub5.anInt3722;
																							} else if (i_4_ == 5001) {
																								Class23_Sub19.anInt2387++;
																								i_1_ -= 3;
																								Class23_Sub13_Sub5.anInt3722 = Class26.anIntArray393[i_1_];
																								Class87_Sub3.anInt2820 = Class26.anIntArray393[1 + i_1_];
																								Class38_Sub7_Sub1.anInt4368 = Class26.anIntArray393[2 + i_1_];
																								Class23_Sub7.outBuffer.method486(54, 2976);
																								Class23_Sub7.outBuffer.method460((byte) 124, Class23_Sub13_Sub5.anInt3722);
																								Class23_Sub7.outBuffer.method460((byte) 127, Class87_Sub3.anInt2820);
																								Class23_Sub7.outBuffer.method460((byte) 116, Class38_Sub7_Sub1.anInt4368);
																							} else if (i_4_ == 5002) {
																								i_1_ -= 2;
																								Class106.anInt1820++;
																								RSString class16 = Class79.aClass16Array1878[--i_2_];
																								int i_75_ = Class26.anIntArray393[i_1_];
																								int i_76_ = Class26.anIntArray393[1 + i_1_];
																								Class23_Sub7.outBuffer.method486(206, 2976);
																								Class23_Sub7.outBuffer.method436(class16.method184(-83), (byte) -128);
																								Class23_Sub7.outBuffer.method460((byte) 108, -1 + i_75_);
																								Class23_Sub7.outBuffer.method460((byte) 105, i_76_);
																							} else if (i_4_ == 5003) {
																								int i_77_ = Class26.anIntArray393[--i_1_];
																								RSString class16 = null;
																								if (i_77_ < 100) {
																									class16 = Class72.aClass16Array1297[i_77_];
																								}
																								if (class16 == null) {
																									class16 = Class94.aClass16_1600;
																								}
																								Class79.aClass16Array1878[i_2_++] = class16;
																							} else if (i_4_ == 5004) {
																								int i_78_ = Class26.anIntArray393[--i_1_];
																								int i_79_ = -1;
																								if (i_78_ < 100 && Class72.aClass16Array1297[i_78_] != null) {
																									i_79_ = Class27.anIntArray420[i_78_];
																								}
																								Class26.anIntArray393[i_1_++] = i_79_;
																							} else if (i_4_ == 5005) {
																								Class26.anIntArray393[i_1_++] = Class87_Sub3.anInt2820;
																							} else if (i_4_ == 5008) {
																								RSString class16 = Class79.aClass16Array1878[--i_2_];
																								if (class16.method176(Class46.aClass16_714, (byte) -83)) {
																									Class53.method1173(126, class16);
																								} else if (Class23_Sub4_Sub17.anInt3173 != 0 || Class67.anInt1176 != 1 && Class23_Sub4_Sub12.anInt3075 != 1) {
																									RSString class16_80_ = class16.method152(48);
																									Class23_Sub13_Sub2.anInt3678++;
																									int i_81_ = 0;
																									int i_82_ = 0;
																									if (!class16_80_.method176(Class23_Sub4_Sub6.aClass16_2993, (byte) -86)) {
																										if (!class16_80_.method176(Class31.aClass16_492, (byte) -61)) {
																											if (!class16_80_.method176(Class4.aClass16_90, (byte) -86)) {
																												if (class16_80_.method176(Class105.aClass16_1803, (byte) -82)) {
																													i_82_ = 3;
																													class16 = class16.method138((byte) 81, Class105.aClass16_1803.method171(-61));
																												} else if (!class16_80_.method176(Class81.aClass16_1430, (byte) -83)) {
																													if (class16_80_.method176(Class23_Sub4_Sub10.aClass16_3047, (byte) -107)) {
																														class16 = class16.method138((byte) 82, Class23_Sub4_Sub10.aClass16_3047.method171(-61));
																														i_82_ = 5;
																													} else if (!class16_80_.method176(Class23_Sub4_Sub32.aClass16_3416, (byte) -102)) {
																														if (class16_80_.method176(Class23_Sub4_Sub21.aClass16_3253, (byte) -74)) {
																															class16 = class16.method138((byte) 74, Class23_Sub4_Sub21.aClass16_3253.method171(-61));
																															i_82_ = 7;
																														} else if (class16_80_.method176(Class78.aClass16_1421, (byte) -71)) {
																															i_82_ = 8;
																															class16 = class16.method138((byte) 77, Class78.aClass16_1421.method171(-61));
																														} else if (!class16_80_.method176(Class86.aClass16_1858, (byte) -64)) {
																															if (class16_80_.method176(Class23_Sub4_Sub23_Sub1.aClass16_4483, (byte) -67)) {
																																i_82_ = 10;
																																class16 = class16.method138((byte) 125, Class23_Sub4_Sub23_Sub1.aClass16_4483.method171(-61));
																															} else if (!class16_80_.method176(Class23_Sub2.aClass16_2059, (byte) -118)) {
																																if (Class23_Sub13_Sub15.anInt4036 != 0) {
																																	if (class16_80_.method176(Class23_Sub4_Sub6.aClass16_2982, (byte) -83)) {
																																		class16 = class16.method138((byte) 83, Class23_Sub4_Sub6.aClass16_2982.method171(-61));
																																		i_82_ = 0;
																																	} else if (class16_80_.method176(Class31.aClass16_493, (byte) -86)) {
																																		class16 = class16.method138((byte) 95, Class31.aClass16_493.method171(-61));
																																		i_82_ = 1;
																																	} else if (!class16_80_.method176(Class4.aClass16_99, (byte) -127)) {
																																		if (!class16_80_.method176(Class105.aClass16_1809, (byte) -104)) {
																																			if (class16_80_.method176(Class81.aClass16_1436, (byte) -86)) {
																																				class16 = class16.method138((byte) 107, Class81.aClass16_1436.method171(-61));
																																				i_82_ = 4;
																																			} else if (class16_80_.method176(Class23_Sub4_Sub10.aClass16_3057, (byte) -75)) {
																																				i_82_ = 5;
																																				class16 = class16.method138((byte) 74, Class23_Sub4_Sub10.aClass16_3057.method171(-61));
																																			} else if (class16_80_.method176(Class23_Sub4_Sub32.aClass16_3419, (byte) -93)) {
																																				i_82_ = 6;
																																				class16 = class16.method138((byte) 114, Class23_Sub4_Sub32.aClass16_3419.method171(-61));
																																			} else if (class16_80_.method176(Class23_Sub4_Sub21.aClass16_3244, (byte) -116)) {
																																				i_82_ = 7;
																																				class16 = class16.method138((byte) 99, Class23_Sub4_Sub21.aClass16_3244.method171(-61));
																																			} else if (class16_80_.method176(Class78.aClass16_1423, (byte) -82)) {
																																				i_82_ = 8;
																																				class16 = class16.method138((byte) 89, Class78.aClass16_1423.method171(-61));
																																			} else if (class16_80_.method176(Class86.aClass16_1862, (byte) -122)) {
																																				i_82_ = 9;
																																				class16 = class16.method138((byte) 105, Class86.aClass16_1862.method171(-61));
																																			} else if (class16_80_.method176(Class23_Sub4_Sub23_Sub1.aClass16_4486, (byte) -78)) {
																																				i_82_ = 10;
																																				class16 = class16.method138((byte) 126, Class23_Sub4_Sub23_Sub1.aClass16_4486.method171(-61));
																																			} else if (class16_80_.method176(Class23_Sub2.aClass16_2043, (byte) -97)) {
																																				i_82_ = 11;
																																				class16 = class16.method138((byte) 120, Class23_Sub2.aClass16_2043.method171(-61));
																																			}
																																		} else {
																																			class16 = class16.method138((byte) 109, Class105.aClass16_1809.method171(-61));
																																			i_82_ = 3;
																																		}
																																	} else {
																																		class16 = class16.method138((byte) 95, Class4.aClass16_99.method171(-61));
																																		i_82_ = 2;
																																	}
																																}
																															} else {
																																i_82_ = 11;
																																class16 = class16.method138((byte) 117, Class23_Sub2.aClass16_2059.method171(-61));
																															}
																														} else {
																															i_82_ = 9;
																															class16 = class16.method138((byte) 79, Class86.aClass16_1858.method171(-61));
																														}
																													} else {
																														i_82_ = 6;
																														class16 = class16.method138((byte) 104, Class23_Sub4_Sub32.aClass16_3416.method171(-61));
																													}
																												} else {
																													i_82_ = 4;
																													class16 = class16.method138((byte) 69, Class81.aClass16_1430.method171(-61));
																												}
																											} else {
																												i_82_ = 2;
																												class16 = class16.method138((byte) 65, Class4.aClass16_90.method171(-61));
																											}
																										} else {
																											i_82_ = 1;
																											class16 = class16.method138((byte) 72, Class31.aClass16_492.method171(-61));
																										}
																									} else {
																										i_82_ = 0;
																										class16 = class16.method138((byte) 122, Class23_Sub4_Sub6.aClass16_2993.method171(-61));
																									}
																									class16_80_ = class16.method152(48);
																									if (!class16_80_.method176(Class23_Sub4_Sub34.aClass16_3437, (byte) -68)) {
																										if (class16_80_.method176(Class107.aClass16_1834, (byte) -68)) {
																											i_81_ = 2;
																											class16 = class16.method138((byte) 126, Class107.aClass16_1834.method171(-61));
																										} else if (class16_80_.method176(Class48.aClass16_745, (byte) -80)) {
																											class16 = class16.method138((byte) 65, Class48.aClass16_745.method171(-61));
																											i_81_ = 3;
																										} else if (!class16_80_.method176(Class13.aClass16_261, (byte) -72)) {
																											if (!class16_80_.method176(Class42.aClass16_659, (byte) -100)) {
																												if ((Class23_Sub13_Sub15.anInt4036 ^ 0xffffffff) != -1) {
																													if (!class16_80_.method176(Class23_Sub4_Sub34.aClass16_3440, (byte) -84)) {
																														if (class16_80_.method176(Class107.aClass16_1839, (byte) -118)) {
																															class16 = class16.method138((byte) 110, Class107.aClass16_1839.method171(-61));
																															i_81_ = 2;
																														} else if (!class16_80_.method176(Class48.aClass16_746, (byte) -112)) {
																															if (class16_80_.method176(Class13.aClass16_251, (byte) -77)) {
																																class16 = class16.method138((byte) 88, Class13.aClass16_251.method171(-61));
																																i_81_ = 4;
																															} else if (class16_80_.method176(Class42.aClass16_653, (byte) -114)) {
																																i_81_ = 5;
																																class16 = class16.method138((byte) 122, Class42.aClass16_653.method171(-61));
																															}
																														} else {
																															class16 = class16.method138((byte) 124, Class48.aClass16_746.method171(-61));
																															i_81_ = 3;
																														}
																													} else {
																														i_81_ = 1;
																														class16 = class16.method138((byte) 114, Class23_Sub4_Sub34.aClass16_3440.method171(-61));
																													}
																												}
																											} else {
																												class16 = class16.method138((byte) 98, Class42.aClass16_659.method171(-61));
																												i_81_ = 5;
																											}
																										} else {
																											i_81_ = 4;
																											class16 = class16.method138((byte) 110, Class13.aClass16_261.method171(-61));
																										}
																									} else {
																										i_81_ = 1;
																										class16 = class16.method138((byte) 88, Class23_Sub4_Sub34.aClass16_3437.method171(-61));
																									}
																									Class23_Sub7.outBuffer.method486(104, 2976);
																									Class23_Sub7.outBuffer.method460((byte) 106, 0);
																									int i_83_ = Class23_Sub7.outBuffer.position;
																									Class23_Sub7.outBuffer.method460((byte) 104, i_82_);
																									Class23_Sub7.outBuffer.method460((byte) 113, i_81_);
																									Class23_Sub4_Sub14.method321(Class23_Sub7.outBuffer, class16, 0);
																									Class23_Sub7.outBuffer.method477((byte) 21, Class23_Sub7.outBuffer.position - i_83_);
																								}
																							} else if (i_4_ == 5009) {
																								i_2_ -= 2;
																								RSString class16 = Class79.aClass16Array1878[i_2_];
																								RSString class16_84_ = Class79.aClass16Array1878[i_2_ - -1];
																								if ((Class23_Sub4_Sub17.anInt3173 ^ 0xffffffff) != -1 || Class67.anInt1176 != 1 && Class23_Sub4_Sub12.anInt3075 != 1) {
																									Class23_Sub7.outBuffer.method486(69, 2976);
																									Class72.anInt1292++;
																									Class23_Sub7.outBuffer.method460((byte) 108, 0);
																									int i_85_ = Class23_Sub7.outBuffer.position;
																									Class23_Sub7.outBuffer.method436(class16.method184(92), (byte) -112);
																									Class23_Sub4_Sub14.method321(Class23_Sub7.outBuffer, class16_84_, 0);
																									Class23_Sub7.outBuffer.method477((byte) 21, -i_85_ + Class23_Sub7.outBuffer.position);
																								}
																							} else if (i_4_ == 5010) {
																								int i_86_ = Class26.anIntArray393[--i_1_];
																								RSString class16 = null;
																								if (i_86_ < 100) {
																									class16 = Class23_Sub14.aClass16Array2337[i_86_];
																								}
																								if (class16 == null) {
																									class16 = Class94.aClass16_1600;
																								}
																								Class79.aClass16Array1878[i_2_++] = class16;
																							} else if (i_4_ == 5011) {
																								int i_87_ = Class26.anIntArray393[--i_1_];
																								RSString class16 = null;
																								if (i_87_ < 100) {
																									class16 = Class23_Sub16.aClass16Array2357[i_87_];
																								}
																								if (class16 == null) {
																									class16 = Class94.aClass16_1600;
																								}
																								Class79.aClass16Array1878[i_2_++] = class16;
																							} else if (i_4_ == 5012) {
																								int i_88_ = Class26.anIntArray393[--i_1_];
																								int i_89_ = -1;
																								if (i_88_ < 100) {
																									i_89_ = Class23_Sub13_Sub24.anIntArray4279[i_88_];
																								}
																								Class26.anIntArray393[i_1_++] = i_89_;
																							} else if (i_4_ == 5015) {
																								RSString class16;
																								if (Class105.aClass38_Sub7_Sub2_1812 == null || Class105.aClass38_Sub7_Sub2_1812.aClass16_4389 == null) {
																									class16 = Class23_Sub2.aClass16_2064;
																								} else {
																									class16 = Class105.aClass38_Sub7_Sub2_1812.aClass16_4389;
																								}
																								Class79.aClass16Array1878[i_2_++] = class16;
																							} else if (i_4_ == 5016) {
																								Class26.anIntArray393[i_1_++] = Class38_Sub7_Sub1.anInt4368;
																							} else if (i_4_ == 5017) {
																								Class26.anIntArray393[i_1_++] = Class56.anInt888;
																							} else if (i_4_ == 5050) {
																								int i_90_ = Class26.anIntArray393[--i_1_];
																								Class79.aClass16Array1878[i_2_++] = Class23_Sub13_Sub18.method799(i_90_, 1221).aClass16_4030;
																							} else if (i_4_ == 5051) {
																								int i_91_ = Class26.anIntArray393[--i_1_];
																								Class23_Sub13_Sub15 class23_sub13_sub15 = Class23_Sub13_Sub18.method799(i_91_, 1221);
																								if (class23_sub13_sub15.anIntArray4024 == null) {
																									Class26.anIntArray393[i_1_++] = 0;
																								} else {
																									Class26.anIntArray393[i_1_++] = class23_sub13_sub15.anIntArray4024.length;
																								}
																							} else if (i_4_ == 5052) {
																								i_1_ -= 2;
																								int i_92_ = Class26.anIntArray393[i_1_];
																								int i_93_ = Class26.anIntArray393[1 + i_1_];
																								Class23_Sub13_Sub15 class23_sub13_sub15 = Class23_Sub13_Sub18.method799(i_92_, 1221);
																								int i_94_ = class23_sub13_sub15.anIntArray4024[i_93_];
																								Class26.anIntArray393[i_1_++] = i_94_;
																							} else if (i_4_ == 5053) {
																								int i_95_ = Class26.anIntArray393[--i_1_];
																								Class23_Sub13_Sub15 class23_sub13_sub15 = Class23_Sub13_Sub18.method799(i_95_, 1221);
																								if (class23_sub13_sub15.anIntArray4029 == null) {
																									Class26.anIntArray393[i_1_++] = 0;
																								} else {
																									Class26.anIntArray393[i_1_++] = class23_sub13_sub15.anIntArray4029.length;
																								}
																							} else if (i_4_ == 5054) {
																								i_1_ -= 2;
																								int i_96_ = Class26.anIntArray393[i_1_];
																								int i_97_ = Class26.anIntArray393[i_1_ - -1];
																								Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub18.method799(i_96_, 1221).anIntArray4029[i_97_];
																							} else if (i_4_ == 5055) {
																								int i_98_ = Class26.anIntArray393[--i_1_];
																								Class79.aClass16Array1878[i_2_++] = Class38_Sub7_Sub1.method1094(i_98_, 1).method749((byte) 67);
																							} else if (i_4_ == 5056) {
																								int i_99_ = Class26.anIntArray393[--i_1_];
																								Class23_Sub13_Sub12 class23_sub13_sub12 = Class38_Sub7_Sub1.method1094(i_99_, 1);
																								if (class23_sub13_sub12.anIntArray3966 != null) {
																									Class26.anIntArray393[i_1_++] = class23_sub13_sub12.anIntArray3966.length;
																								} else {
																									Class26.anIntArray393[i_1_++] = 0;
																								}
																							} else if (i_4_ == 5057) {
																								i_1_ -= 2;
																								int i_100_ = Class26.anIntArray393[i_1_];
																								int i_101_ = Class26.anIntArray393[i_1_ - -1];
																								Class26.anIntArray393[i_1_++] = Class38_Sub7_Sub1.method1094(i_100_, 1).anIntArray3966[i_101_];
																							} else if (i_4_ == 5058) {
																								Class46.aClass42_712 = new Class42();
																								Class46.aClass42_712.anInt645 = Class26.anIntArray393[--i_1_];
																								Class46.aClass42_712.aClass23_Sub13_Sub12_646 = Class38_Sub7_Sub1.method1094(Class46.aClass42_712.anInt645, 1);
																								Class46.aClass42_712.anIntArray648 = new int[Class46.aClass42_712.aClass23_Sub13_Sub12_646.method753(0)];
																							} else if (i_4_ == 5059) {
																								Class23_Sub7.outBuffer.method486(246, 2976);
																								Class23_Sub7.outBuffer.method460((byte) 126, 0);
																								Class23_Sub26.anInt2467++;
																								int i_102_ = Class23_Sub7.outBuffer.position;
																								Class23_Sub7.outBuffer.method460((byte) 124, 0);
																								Class23_Sub7.outBuffer.method443(Class46.aClass42_712.anInt645, (byte) 51);
																								Class46.aClass42_712.aClass23_Sub13_Sub12_646.method750(Class23_Sub7.outBuffer, 4056, Class46.aClass42_712.anIntArray648);
																								Class23_Sub7.outBuffer.method477((byte) 21, Class23_Sub7.outBuffer.position + -i_102_);
																							} else if (i_4_ == 5060) {
																								Class23_Sub13_Sub25.anInt4282++;
																								RSString class16 = Class79.aClass16Array1878[--i_2_];
																								Class23_Sub7.outBuffer.method486(227, 2976);
																								Class23_Sub7.outBuffer.method460((byte) 117, 0);
																								int i_103_ = Class23_Sub7.outBuffer.position;
																								Class23_Sub7.outBuffer.method436(class16.method184(126), (byte) -123);
																								Class23_Sub7.outBuffer.method443(Class46.aClass42_712.anInt645, (byte) 51);
																								Class46.aClass42_712.aClass23_Sub13_Sub12_646.method750(Class23_Sub7.outBuffer, 4056, Class46.aClass42_712.anIntArray648);
																								Class23_Sub7.outBuffer.method477((byte) 21, -i_103_ + Class23_Sub7.outBuffer.position);
																							} else if (i_4_ == 5061) {
																								Class23_Sub7.outBuffer.method486(246, 2976);
																								Class23_Sub26.anInt2467++;
																								Class23_Sub7.outBuffer.method460((byte) 113, 0);
																								int i_104_ = Class23_Sub7.outBuffer.position;
																								Class23_Sub7.outBuffer.method460((byte) 117, 1);
																								Class23_Sub7.outBuffer.method443(Class46.aClass42_712.anInt645, (byte) 51);
																								Class46.aClass42_712.aClass23_Sub13_Sub12_646.method750(Class23_Sub7.outBuffer, 4056, Class46.aClass42_712.anIntArray648);
																								Class23_Sub7.outBuffer.method477((byte) 21, Class23_Sub7.outBuffer.position - i_104_);
																							} else if (i_4_ == 5062) {
																								i_1_ -= 2;
																								int i_105_ = Class26.anIntArray393[1 + i_1_];
																								int i_106_ = Class26.anIntArray393[i_1_];
																								Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub18.method799(i_106_, 1221).anIntArray4026[i_105_];
																							} else if (i_4_ == 5063) {
																								i_1_ -= 2;
																								int i_107_ = Class26.anIntArray393[i_1_];
																								int i_108_ = Class26.anIntArray393[1 + i_1_];
																								Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub18.method799(i_107_, 1221).anIntArray4017[i_108_];
																							} else if (i_4_ == 5064) {
																								i_1_ -= 2;
																								int i_109_ = Class26.anIntArray393[i_1_];
																								int i_110_ = Class26.anIntArray393[i_1_ + 1];
																								if (i_110_ != -1) {
																									Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub18.method799(i_109_, 1221).method774(i_110_, (byte) -125);
																								} else {
																									Class26.anIntArray393[i_1_++] = -1;
																								}
																							} else if (i_4_ == 5065) {
																								i_1_ -= 2;
																								int i_111_ = Class26.anIntArray393[i_1_];
																								int i_112_ = Class26.anIntArray393[i_1_ - -1];
																								if ((i_112_ ^ 0xffffffff) != 0) {
																									Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub18.method799(i_111_, 1221).method770((byte) -85, i_112_);
																								} else {
																									Class26.anIntArray393[i_1_++] = -1;
																								}
																							} else if (i_4_ == 5066) {
																								int i_113_ = Class26.anIntArray393[--i_1_];
																								Class26.anIntArray393[i_1_++] = Class38_Sub7_Sub1.method1094(i_113_, 1).method753(0);
																							} else if (i_4_ == 5067) {
																								i_1_ -= 2;
																								int i_114_ = Class26.anIntArray393[1 + i_1_];
																								int i_115_ = Class26.anIntArray393[i_1_];
																								int i_116_ = Class38_Sub7_Sub1.method1094(i_115_, 1).method751(0, i_114_);
																								System.out.println("chatphrase_getdynamiccommand=" + i_116_);
																								Class26.anIntArray393[i_1_++] = i_116_;
																							} else if (i_4_ == 5068) {
																								i_1_ -= 2;
																								int i_117_ = Class26.anIntArray393[i_1_];
																								int i_118_ = Class26.anIntArray393[i_1_ - -1];
																								Class46.aClass42_712.anIntArray648[i_117_] = i_118_;
																							} else if (i_4_ == 5069) {
																								i_1_ -= 2;
																								int i_119_ = Class26.anIntArray393[i_1_];
																								int i_120_ = Class26.anIntArray393[1 + i_1_];
																								Class46.aClass42_712.anIntArray648[i_119_] = i_120_;
																							} else {
																								if (i_4_ != 5070) {
																									break;
																								}
																								i_1_ -= 3;
																								int i_121_ = Class26.anIntArray393[i_1_];
																								int i_122_ = Class26.anIntArray393[1 + i_1_];
																								int i_123_ = Class26.anIntArray393[2 + i_1_];
																								Class23_Sub13_Sub12 class23_sub13_sub12 = Class38_Sub7_Sub1.method1094(i_121_, 1);
																								if (class23_sub13_sub12.method751(0, i_122_) != 0) {
																									throw new RuntimeException("bad command");
																								}
																								Class26.anIntArray393[i_1_++] = class23_sub13_sub12.method745(i_122_, -121, i_123_);
																							}
																						} else if (i_4_ == 4200) {
																							int i_124_ = Class26.anIntArray393[--i_1_];
																							Class79.aClass16Array1878[i_2_++] = Class23_Sub13_Sub24.method853(127, i_124_).aClass16_3902;
																						} else if (i_4_ == 4201) {
																							i_1_ -= 2;
																							int i_125_ = Class26.anIntArray393[i_1_];
																							int i_126_ = Class26.anIntArray393[1 + i_1_];
																							Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(117, i_125_);
																							if (i_126_ < 1 || i_126_ > 5 || class23_sub13_sub11.aClass16Array3945[i_126_ - 1] == null) {
																								Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																							} else {
																								Class79.aClass16Array1878[i_2_++] = class23_sub13_sub11.aClass16Array3945[-1 + i_126_];
																							}
																						} else if (i_4_ == 4202) {
																							i_1_ -= 2;
																							int i_127_ = Class26.anIntArray393[1 + i_1_];
																							int i_128_ = Class26.anIntArray393[i_1_];
																							Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(116, i_128_);
																							if (i_127_ < 1 || i_127_ > 5 || class23_sub13_sub11.aClass16Array3910[i_127_ + -1] == null) {
																								Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																							} else {
																								Class79.aClass16Array1878[i_2_++] = class23_sub13_sub11.aClass16Array3910[-1 + i_127_];
																							}
																						} else if (i_4_ == 4203) {
																							int i_129_ = Class26.anIntArray393[--i_1_];
																							Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub24.method853(-25, i_129_).anInt3953;
																						} else if (i_4_ == 4204) {
																							int i_130_ = Class26.anIntArray393[--i_1_];
																							Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub24.method853(123, i_130_).anInt3895 == 1 ? 1 : 0;
																						} else if (i_4_ == 4205) {
																							int i_131_ = Class26.anIntArray393[--i_1_];
																							Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(117, i_131_);
																							if (class23_sub13_sub11.anInt3955 == -1 && class23_sub13_sub11.anInt3961 >= 0) {
																								Class26.anIntArray393[i_1_++] = class23_sub13_sub11.anInt3961;
																							} else {
																								Class26.anIntArray393[i_1_++] = i_131_;
																							}
																						} else if (i_4_ == 4206) {
																							int i_132_ = Class26.anIntArray393[--i_1_];
																							Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-125, i_132_);
																							if (class23_sub13_sub11.anInt3955 < 0 || (class23_sub13_sub11.anInt3961 ^ 0xffffffff) > -1) {
																								Class26.anIntArray393[i_1_++] = i_132_;
																							} else {
																								Class26.anIntArray393[i_1_++] = class23_sub13_sub11.anInt3961;
																							}
																						} else if (i_4_ == 4207) {
																							int i_133_ = Class26.anIntArray393[--i_1_];
																							Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub24.method853(-72, i_133_).aBoolean3908 ? 1 : 0;
																						} else if (i_4_ == 4210) {
																							RSString class16 = Class79.aClass16Array1878[--i_2_];
																							int i_134_ = Class26.anIntArray393[--i_1_];
																							Class23_Sub13_Sub10.method704(i_134_ == 1, class16, (byte) 115);
																							Class26.anIntArray393[i_1_++] = Class1.anInt67;
																						} else if (i_4_ == 4211) {
																							if (Class23_Sub1.aShortArray2007 != null && Class1.anInt67 > Class68.anInt1196) {
																								Class26.anIntArray393[i_1_++] = Class24.method919(65535, Class23_Sub1.aShortArray2007[Class68.anInt1196++]);
																							} else {
																								Class26.anIntArray393[i_1_++] = -1;
																							}
																						} else {
																							if (i_4_ != 4212) {
																								break;
																							}
																							Class68.anInt1196 = 0;
																						}
																					} else if (i_4_ == 4100) {
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						int i_135_ = Class26.anIntArray393[--i_1_];
																						Class79.aClass16Array1878[i_2_++] = Class23_Sub4_Sub14.method322(new RSString[] { class16, Class23_Sub4_Sub23.method360((byte) -9, i_135_) }, -54);
																					} else if (i_4_ == 4101) {
																						i_2_ -= 2;
																						RSString class16 = Class79.aClass16Array1878[i_2_];
																						RSString class16_136_ = Class79.aClass16Array1878[i_2_ + 1];
																						Class79.aClass16Array1878[i_2_++] = Class23_Sub4_Sub14.method322(new RSString[] { class16, class16_136_ }, -52);
																					} else if (i_4_ == 4102) {
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						int i_137_ = Class26.anIntArray393[--i_1_];
																						Class79.aClass16Array1878[i_2_++] = Class23_Sub4_Sub14.method322(new RSString[] { class16, Class23_Sub4_Sub7.method292((byte) -4, i_137_, true) }, -104);
																					} else if (i_4_ == 4103) {
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						Class79.aClass16Array1878[i_2_++] = class16.method152(48);
																					} else if (i_4_ == 4104) {
																						int i_138_ = Class26.anIntArray393[--i_1_];
																						long l = 86400000L * ((long) i_138_ + 11745L);
																						Class31.aCalendar485.setTime(new Date(l));
																						int i_139_ = Class31.aCalendar485.get(5);
																						int i_140_ = Class31.aCalendar485.get(2);
																						int i_141_ = Class31.aCalendar485.get(1);
																						Class79.aClass16Array1878[i_2_++] = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub23.method360((byte) -9, i_139_), Class23_Sub13_Sub10.aClass16_3888, Class38_Sub7.aClass16Array2654[i_140_], Class23_Sub13_Sub10.aClass16_3888, Class23_Sub4_Sub23.method360((byte) -9, i_141_) }, -8);
																					} else if (i_4_ == 4105) {
																						i_2_ -= 2;
																						RSString class16 = Class79.aClass16Array1878[i_2_ - -1];
																						RSString class16_142_ = Class79.aClass16Array1878[i_2_];
																						if (Class105.aClass38_Sub7_Sub2_1812.aClass51_4393 == null || !Class105.aClass38_Sub7_Sub2_1812.aClass51_4393.aBoolean797) {
																							Class79.aClass16Array1878[i_2_++] = class16_142_;
																						} else {
																							Class79.aClass16Array1878[i_2_++] = class16;
																						}
																					} else if (i_4_ == 4106) {
																						int i_143_ = Class26.anIntArray393[--i_1_];
																						Class79.aClass16Array1878[i_2_++] = Class23_Sub4_Sub23.method360((byte) -9, i_143_);
																					} else if (i_4_ == 4107) {
																						i_2_ -= 2;
																						Class26.anIntArray393[i_1_++] = Class79.aClass16Array1878[i_2_].method167(Class79.aClass16Array1878[1 + i_2_], -224);
																					} else if (i_4_ == 4108) {
																						i_1_ -= 2;
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						int i_144_ = Class26.anIntArray393[i_1_];
																						int i_145_ = Class26.anIntArray393[i_1_ + 1];
																						byte[] bs = Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1544(0, 0, i_145_);
																						Class23_Sub13_Sub8_Sub1_Sub1 class23_sub13_sub8_sub1_sub1 = new Class23_Sub13_Sub8_Sub1_Sub1(bs);
																						class23_sub13_sub8_sub1_sub1.method661(Class23_Sub4_Sub1.aClass43Array2881, null);
																						Class26.anIntArray393[i_1_++] = class23_sub13_sub8_sub1_sub1.method669(class16, i_144_);
																					} else if (i_4_ == 4109) {
																						i_1_ -= 2;
																						int i_146_ = Class26.anIntArray393[i_1_ - -1];
																						int i_147_ = Class26.anIntArray393[i_1_];
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						byte[] bs = Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1544(0, 0, i_146_);
																						Class23_Sub13_Sub8_Sub1_Sub1 class23_sub13_sub8_sub1_sub1 = new Class23_Sub13_Sub8_Sub1_Sub1(bs);
																						class23_sub13_sub8_sub1_sub1.method661(Class23_Sub4_Sub1.aClass43Array2881, null);
																						Class26.anIntArray393[i_1_++] = class23_sub13_sub8_sub1_sub1.method667(class16, i_147_);
																					} else if (i_4_ == 4110) {
																						i_2_ -= 2;
																						RSString class16 = Class79.aClass16Array1878[1 + i_2_];
																						RSString class16_148_ = Class79.aClass16Array1878[i_2_];
																						if (Class26.anIntArray393[--i_1_] == 1) {
																							Class79.aClass16Array1878[i_2_++] = class16_148_;
																						} else {
																							Class79.aClass16Array1878[i_2_++] = class16;
																						}
																					} else if (i_4_ == 4111) {
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						Class79.aClass16Array1878[i_2_++] = Class23_Sub13_Sub8.method674(class16);
																					} else if (i_4_ == 4112) {
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						int i_149_ = Class26.anIntArray393[--i_1_];
																						if (i_149_ == -1) {
																							throw new RuntimeException("null char");
																						}
																						Class79.aClass16Array1878[i_2_++] = class16.method165(40, i_149_);
																					} else if (i_4_ == 4113) {
																						int i_150_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub7.method638(i_150_, 159) ? 1 : 0;
																					} else if (i_4_ == 4114) {
																						int i_151_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = !Class32.method966(i_151_, 122) ? 0 : 1;
																					} else if (i_4_ == 4115) {
																						int i_152_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = !Class104.method1524(i_152_, 0) ? 0 : 1;
																					} else if (i_4_ == 4116) {
																						int i_153_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = !Class23_Sub1.method232(i_153_, 107) ? 0 : 1;
																					} else if (i_4_ == 4117) {
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						if (class16 == null) {
																							Class26.anIntArray393[i_1_++] = 0;
																						} else {
																							Class26.anIntArray393[i_1_++] = class16.method171(-61);
																						}
																					} else if (i_4_ == 4118) {
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						i_1_ -= 2;
																						int i_154_ = Class26.anIntArray393[i_1_];
																						int i_155_ = Class26.anIntArray393[1 + i_1_];
																						Class79.aClass16Array1878[i_2_++] = class16.method148(i_155_, i_154_, true);
																					} else if (i_4_ == 4119) {
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						RSString class16_156_ = Class38_Sub6.method1075(class16.method171(-61), 0);
																						boolean bool_157_ = false;
																						for (int i_158_ = 0; (class16.method171(-61) ^ 0xffffffff) < (i_158_ ^ 0xffffffff); i_158_++) {
																							int i_159_ = class16.method166((byte) 105, i_158_);
																							if (i_159_ == 60) {
																								bool_157_ = true;
																							} else if (i_159_ != 62) {
																								if (!bool_157_) {
																									class16_156_.method156(i_159_, -119);
																								}
																							} else {
																								bool_157_ = false;
																							}
																						}
																						class16_156_.method178((byte) -11);
																						Class79.aClass16Array1878[i_2_++] = class16_156_;
																					} else if (i_4_ == 4120) {
																						i_1_ -= 2;
																						RSString class16 = Class79.aClass16Array1878[--i_2_];
																						int i_160_ = Class26.anIntArray393[i_1_ + 1];
																						int i_161_ = Class26.anIntArray393[i_1_];
																						Class26.anIntArray393[i_1_++] = class16.method179((byte) 127, i_160_, i_161_);
																					} else if (i_4_ == 4121) {
																						i_2_ -= 2;
																						RSString class16 = Class79.aClass16Array1878[i_2_];
																						RSString class16_162_ = Class79.aClass16Array1878[1 + i_2_];
																						int i_163_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = class16.method161(-34, i_163_, class16_162_);
																					} else if (i_4_ == 4122) {
																						int i_164_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub23.method847(i_164_, 192);
																					} else {
																						if (i_4_ != 4123) {
																							break;
																						}
																						int i_165_ = Class26.anIntArray393[--i_1_];
																						Class26.anIntArray393[i_1_++] = Class90.method1447(i_165_, 6);
																					}
																				} else if (i_4_ == 4000) {
																					i_1_ -= 2;
																					int i_166_ = Class26.anIntArray393[i_1_];
																					int i_167_ = Class26.anIntArray393[i_1_ - -1];
																					Class26.anIntArray393[i_1_++] = i_166_ - -i_167_;
																				} else if (i_4_ == 4001) {
																					i_1_ -= 2;
																					int i_168_ = Class26.anIntArray393[i_1_];
																					int i_169_ = Class26.anIntArray393[1 + i_1_];
																					Class26.anIntArray393[i_1_++] = i_168_ + -i_169_;
																				} else if (i_4_ == 4002) {
																					i_1_ -= 2;
																					int i_170_ = Class26.anIntArray393[i_1_ + 1];
																					int i_171_ = Class26.anIntArray393[i_1_];
																					Class26.anIntArray393[i_1_++] = i_170_ * i_171_;
																				} else if (i_4_ == 4003) {
																					i_1_ -= 2;
																					int i_172_ = Class26.anIntArray393[i_1_ + 1];
																					int i_173_ = Class26.anIntArray393[i_1_];
																					Class26.anIntArray393[i_1_++] = i_173_ / i_172_;
																				} else if (i_4_ == 4004) {
																					int i_174_ = Class26.anIntArray393[--i_1_];
																					Class26.anIntArray393[i_1_++] = (int) (Math.random() * (double) i_174_);
																				} else if (i_4_ == 4005) {
																					int i_175_ = Class26.anIntArray393[--i_1_];
																					Class26.anIntArray393[i_1_++] = (int) ((double) (i_175_ - -1) * Math.random());
																				} else if (i_4_ == 4006) {
																					i_1_ -= 5;
																					int i_176_ = Class26.anIntArray393[i_1_];
																					int i_177_ = Class26.anIntArray393[1 + i_1_];
																					int i_178_ = Class26.anIntArray393[i_1_ + 4];
																					int i_179_ = Class26.anIntArray393[3 + i_1_];
																					int i_180_ = Class26.anIntArray393[i_1_ - -2];
																					Class26.anIntArray393[i_1_++] = i_176_ - -((i_178_ - i_180_) * (i_177_ - i_176_) / (i_179_ + -i_180_));
																				} else if (i_4_ == 4007) {
																					i_1_ -= 2;
																					long l = (long) Class26.anIntArray393[1 + i_1_];
																					long l_181_ = (long) Class26.anIntArray393[i_1_];
																					Class26.anIntArray393[i_1_++] = (int) (l * l_181_ / 100L + l_181_);
																				} else if (i_4_ == 4008) {
																					i_1_ -= 2;
																					int i_182_ = Class26.anIntArray393[i_1_];
																					int i_183_ = Class26.anIntArray393[i_1_ + 1];
																					Class26.anIntArray393[i_1_++] = Class65.method1230(i_182_, 1 << i_183_);
																				} else if (i_4_ == 4009) {
																					i_1_ -= 2;
																					int i_184_ = Class26.anIntArray393[i_1_ + 1];
																					int i_185_ = Class26.anIntArray393[i_1_];
																					Class26.anIntArray393[i_1_++] = Class24.method919(-1 - (1 << i_184_), i_185_);
																				} else if (i_4_ == 4010) {
																					i_1_ -= 2;
																					int i_186_ = Class26.anIntArray393[i_1_];
																					int i_187_ = Class26.anIntArray393[1 + i_1_];
																					Class26.anIntArray393[i_1_++] = (Class24.method919(i_186_, 1 << i_187_) ^ 0xffffffff) != -1 ? 1 : 0;
																				} else if (i_4_ == 4011) {
																					i_1_ -= 2;
																					int i_188_ = Class26.anIntArray393[1 + i_1_];
																					int i_189_ = Class26.anIntArray393[i_1_];
																					Class26.anIntArray393[i_1_++] = i_189_ % i_188_;
																				} else if (i_4_ == 4012) {
																					i_1_ -= 2;
																					int i_190_ = Class26.anIntArray393[i_1_];
																					int i_191_ = Class26.anIntArray393[1 + i_1_];
																					if ((i_190_ ^ 0xffffffff) == -1) {
																						Class26.anIntArray393[i_1_++] = 0;
																					} else {
																						Class26.anIntArray393[i_1_++] = (int) Math.pow((double) i_190_, (double) i_191_);
																					}
																				} else if (i_4_ == 4013) {
																					i_1_ -= 2;
																					int i_192_ = Class26.anIntArray393[i_1_];
																					int i_193_ = Class26.anIntArray393[1 + i_1_];
																					if (i_192_ == 0) {
																						Class26.anIntArray393[i_1_++] = 0;
																					} else if ((i_193_ ^ 0xffffffff) == -1) {
																						Class26.anIntArray393[i_1_++] = 2147483647;
																					} else {
																						Class26.anIntArray393[i_1_++] = (int) Math.pow((double) i_192_, 1.0 / (double) i_193_);
																					}
																				} else if (i_4_ == 4014) {
																					i_1_ -= 2;
																					int i_194_ = Class26.anIntArray393[1 + i_1_];
																					int i_195_ = Class26.anIntArray393[i_1_];
																					Class26.anIntArray393[i_1_++] = Class24.method919(i_194_, i_195_);
																				} else if (i_4_ == 4015) {
																					i_1_ -= 2;
																					int i_196_ = Class26.anIntArray393[i_1_];
																					int i_197_ = Class26.anIntArray393[i_1_ + 1];
																					Class26.anIntArray393[i_1_++] = Class65.method1230(i_197_, i_196_);
																				} else if (i_4_ == 4016) {
																					i_1_ -= 2;
																					int i_198_ = Class26.anIntArray393[i_1_];
																					int i_199_ = Class26.anIntArray393[1 + i_1_];
																					Class26.anIntArray393[i_1_++] = (i_199_ ^ 0xffffffff) < (i_198_ ^ 0xffffffff) ? i_198_ : i_199_;
																				} else if (i_4_ == 4017) {
																					i_1_ -= 2;
																					int i_200_ = Class26.anIntArray393[i_1_];
																					int i_201_ = Class26.anIntArray393[1 + i_1_];
																					Class26.anIntArray393[i_1_++] = (i_201_ ^ 0xffffffff) <= (i_200_ ^ 0xffffffff) ? i_201_ : i_200_;
																				} else {
																					if (i_4_ != 4018) {
																						break;
																					}
																					i_1_ -= 3;
																					long l = (long) Class26.anIntArray393[i_1_];
																					long l_202_ = (long) Class26.anIntArray393[i_1_ - -1];
																					long l_203_ = (long) Class26.anIntArray393[i_1_ + 2];
																					Class26.anIntArray393[i_1_++] = (int) (l * l_203_ / l_202_);
																				}
																			} else if (i_4_ == 3600) {
																				if ((Class23_Sub4_Sub13.anInt3098 ^ 0xffffffff) == -1) {
																					Class26.anIntArray393[i_1_++] = -2;
																				} else if (Class23_Sub4_Sub13.anInt3098 != 1) {
																					Class26.anIntArray393[i_1_++] = Class45.anInt696;
																				} else {
																					Class26.anIntArray393[i_1_++] = -1;
																				}
																			} else if (i_4_ == 3601) {
																				int i_204_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub13.anInt3098 == 2 && i_204_ < Class45.anInt696) {
																					Class79.aClass16Array1878[i_2_++] = Class23_Sub4_Sub14.aClass16Array3130[i_204_];
																				} else {
																					Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																				}
																			} else if (i_4_ == 3602) {
																				int i_205_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub13.anInt3098 != 2 || i_205_ >= Class45.anInt696) {
																					Class26.anIntArray393[i_1_++] = 0;
																				} else {
																					Class26.anIntArray393[i_1_++] = Class23_Sub10_Sub3.anIntArray3658[i_205_];
																				}
																			} else if (i_4_ == 3603) {
																				int i_206_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub13.anInt3098 != 2 || (i_206_ ^ 0xffffffff) <= (Class45.anInt696 ^ 0xffffffff)) {
																					Class26.anIntArray393[i_1_++] = 0;
																				} else {
																					Class26.anIntArray393[i_1_++] = Class11.anIntArray229[i_206_];
																				}
																			} else if (i_4_ == 3604) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				int i_207_ = Class26.anIntArray393[--i_1_];
																				Class61.method1199(i_207_, false, class16);
																			} else if (i_4_ == 3605) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				Class45.method1132(class16.method184(-26), 32767);
																			} else if (i_4_ == 3606) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				Class23_Sub4_Sub2.method278(class16.method184(117), (byte) -111);
																			} else if (i_4_ == 3607) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				Class2.method52(0, class16.method184(-47));
																			} else if (i_4_ == 3608) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				Class23_Sub19.method883(-118, class16.method184(-102));
																			} else if (i_4_ == 3609) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				if (class16.method176(Class90.aClass16_1543, (byte) -65) || class16.method176(Class23_Sub4_Sub4.aClass16_2953, (byte) -126)) {
																					class16 = class16.method138((byte) 126, 7);
																				}
																				Class26.anIntArray393[i_1_++] = !Class42.method1116(class16, (byte) 56) ? 0 : 1;
																			} else if (i_4_ == 3610) {
																				int i_208_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub13.anInt3098 != 2 || Class45.anInt696 <= i_208_) {
																					Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																				} else {
																					Class79.aClass16Array1878[i_2_++] = Class87_Sub3.aClass16Array2816[i_208_];
																				}
																			} else if (i_4_ == 3611) {
																				if (Class23_Sub4_Sub7.aClass16_3007 != null) {
																					Class79.aClass16Array1878[i_2_++] = Class23_Sub4_Sub7.aClass16_3007.method154((byte) 59);
																				} else {
																					Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																				}
																			} else if (i_4_ == 3612) {
																				if (Class23_Sub4_Sub7.aClass16_3007 == null) {
																					Class26.anIntArray393[i_1_++] = 0;
																				} else {
																					Class26.anIntArray393[i_1_++] = Class63.anInt986;
																				}
																			} else if (i_4_ == 3613) {
																				int i_209_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub7.aClass16_3007 != null && (Class63.anInt986 ^ 0xffffffff) < (i_209_ ^ 0xffffffff)) {
																					Class79.aClass16Array1878[i_2_++] = Class68.aClass23_Sub19Array1186[i_209_].aClass16_2382.method154((byte) 59);
																				} else {
																					Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																				}
																			} else if (i_4_ == 3614) {
																				int i_210_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub7.aClass16_3007 != null && i_210_ < Class63.anInt986) {
																					Class26.anIntArray393[i_1_++] = Class68.aClass23_Sub19Array1186[i_210_].anInt2376;
																				} else {
																					Class26.anIntArray393[i_1_++] = 0;
																				}
																			} else if (i_4_ == 3615) {
																				int i_211_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub7.aClass16_3007 != null && (i_211_ ^ 0xffffffff) > (Class63.anInt986 ^ 0xffffffff)) {
																					Class26.anIntArray393[i_1_++] = Class68.aClass23_Sub19Array1186[i_211_].aByte2391;
																				} else {
																					Class26.anIntArray393[i_1_++] = 0;
																				}
																			} else if (i_4_ == 3616) {
																				Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub24.aByte4280;
																			} else if (i_4_ == 3617) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				Class23_Sub4_Sub32.method404(class16, !bool);
																			} else if (i_4_ == 3618) {
																				Class26.anIntArray393[i_1_++] = Class23_Sub4_Sub15.aByte3146;
																			} else if (i_4_ == 3619) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				Class23_Sub13_Sub21.method828((byte) 92, class16.method184(76));
																			} else if (i_4_ == 3620) {
																				Class23_Sub15.method869(-2415);
																			} else if (i_4_ == 3621) {
																				if ((Class23_Sub4_Sub13.anInt3098 ^ 0xffffffff) == -1) {
																					Class26.anIntArray393[i_1_++] = -1;
																				} else {
																					Class26.anIntArray393[i_1_++] = Class25.anInt383;
																				}
																			} else if (i_4_ == 3622) {
																				int i_212_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub13.anInt3098 != 0 && Class25.anInt383 > i_212_) {
																					Class79.aClass16Array1878[i_2_++] = Class83.method1376(-1, Class23_Sub4_Sub30.aLongArray3383[i_212_]).method154((byte) 59);
																				} else {
																					Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																				}
																			} else if (i_4_ == 3623) {
																				RSString class16 = Class79.aClass16Array1878[--i_2_];
																				if (class16.method176(Class90.aClass16_1543, (byte) -69) || class16.method176(Class23_Sub4_Sub4.aClass16_2953, (byte) -95)) {
																					class16 = class16.method138((byte) 115, 7);
																				}
																				Class26.anIntArray393[i_1_++] = Class13.method124(127, class16) ? 1 : 0;
																			} else if (i_4_ == 3624) {
																				int i_213_ = Class26.anIntArray393[--i_1_];
																				if (Class68.aClass23_Sub19Array1186 == null || i_213_ >= Class63.anInt986 || !Class68.aClass23_Sub19Array1186[i_213_].aClass16_2382.method140(Class105.aClass38_Sub7_Sub2_1812.aClass16_4389, 40)) {
																					Class26.anIntArray393[i_1_++] = 0;
																				} else {
																					Class26.anIntArray393[i_1_++] = 1;
																				}
																			} else if (i_4_ == 3625) {
																				if (Class23_Sub4_Sub4.aClass16_2955 != null) {
																					Class79.aClass16Array1878[i_2_++] = Class23_Sub4_Sub4.aClass16_2955.method154((byte) 59);
																				} else {
																					Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																				}
																			} else if (i_4_ == 3626) {
																				int i_214_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub7.aClass16_3007 == null || i_214_ >= Class63.anInt986) {
																					Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
																				} else {
																					Class79.aClass16Array1878[i_2_++] = Class68.aClass23_Sub19Array1186[i_214_].aClass16_2379;
																				}
																			} else {
																				if (i_4_ != 3627) {
																					break;
																				}
																				int i_215_ = Class26.anIntArray393[--i_1_];
																				if (Class23_Sub4_Sub13.anInt3098 == 2 && (i_215_ ^ 0xffffffff) > (Class45.anInt696 ^ 0xffffffff)) {
																					Class26.anIntArray393[i_1_++] = Class104.aBooleanArray1741[i_215_] ? 1 : 0;
																				} else {
																					Class26.anIntArray393[i_1_++] = 0;
																				}
																			}
																		} else if (i_4_ == 3400) {
																			i_1_ -= 2;
																			int i_216_ = Class26.anIntArray393[i_1_ - -1];
																			int i_217_ = Class26.anIntArray393[i_1_];
																			Class23_Sub13_Sub13 class23_sub13_sub13 = Class23_Sub13_Sub3.method612(i_217_, false);
																			Class79.aClass16Array1878[i_2_++] = class23_sub13_sub13.method764(i_216_, -108);
																		} else {
																			if (i_4_ != 3408) {
																				break;
																			}
																			i_1_ -= 4;
																			int i_218_ = Class26.anIntArray393[i_1_];
																			int i_219_ = Class26.anIntArray393[i_1_ - -2];
																			int i_220_ = Class26.anIntArray393[i_1_ + 1];
																			int i_221_ = Class26.anIntArray393[3 + i_1_];
																			Class23_Sub13_Sub13 class23_sub13_sub13 = Class23_Sub13_Sub3.method612(i_219_, false);
																			if ((i_218_ ^ 0xffffffff) != (class23_sub13_sub13.anInt3999 ^ 0xffffffff) || class23_sub13_sub13.anInt3985 != i_220_) {
																				if (i_220_ != 115) {
																					Class26.anIntArray393[i_1_++] = 0;
																				} else {
																					Class79.aClass16Array1878[i_2_++] = Class40.aClass16_629;
																				}
																			} else if (i_220_ != 115) {
																				Class26.anIntArray393[i_1_++] = class23_sub13_sub13.method760((byte) -75, i_221_);
																			} else {
																				Class79.aClass16Array1878[i_2_++] = class23_sub13_sub13.method764(i_221_, -96);
																			}
																		}
																	} else if (i_4_ == 3300) {
																		Class26.anIntArray393[i_1_++] = Class89.anInt1511;
																	} else if (i_4_ == 3301) {
																		i_1_ -= 2;
																		int i_222_ = Class26.anIntArray393[i_1_];
																		int i_223_ = Class26.anIntArray393[i_1_ - -1];
																		Class26.anIntArray393[i_1_++] = Class68.method1254(i_223_, -1, i_222_);
																	} else if (i_4_ == 3302) {
																		i_1_ -= 2;
																		int i_224_ = Class26.anIntArray393[i_1_ + 1];
																		int i_225_ = Class26.anIntArray393[i_1_];
																		Class26.anIntArray393[i_1_++] = Canvas_Sub1.method43((byte) -18, i_224_, i_225_);
																	} else if (i_4_ == 3303) {
																		i_1_ -= 2;
																		int i_226_ = Class26.anIntArray393[1 + i_1_];
																		int i_227_ = Class26.anIntArray393[i_1_];
																		Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub17.method788((byte) 99, i_227_, i_226_);
																	} else if (i_4_ == 3304) {
																		int i_228_ = Class26.anIntArray393[--i_1_];
																		Class26.anIntArray393[i_1_++] = Class50.method1157(i_228_, true).anInt4189;
																	} else if (i_4_ == 3305) {
																		int i_229_ = Class26.anIntArray393[--i_1_];
																		Class26.anIntArray393[i_1_++] = Class105_Sub1.anIntArray2871[i_229_];
																	} else if (i_4_ == 3306) {
																		int i_230_ = Class26.anIntArray393[--i_1_];
																		Class26.anIntArray393[i_1_++] = Class23_Sub27.anIntArray2482[i_230_];
																	} else if (i_4_ == 3307) {
																		int i_231_ = Class26.anIntArray393[--i_1_];
																		Class26.anIntArray393[i_1_++] = Class51.anIntArray800[i_231_];
																	} else if (i_4_ == 3308) {
																		int i_232_ = Class23_Sub13_Sub11.anInt3916;
																		int i_233_ = (Class105.aClass38_Sub7_Sub2_1812.anInt2674 >> 7) - -Class42.anInt662;
																		int i_234_ = (Class105.aClass38_Sub7_Sub2_1812.anInt2659 >> 7) + Class58.anInt903;
																		Class26.anIntArray393[i_1_++] = (i_233_ << 14) + (i_232_ << 28) - -i_234_;
																	} else if (i_4_ == 3309) {
																		int i_235_ = Class26.anIntArray393[--i_1_];
																		Class26.anIntArray393[i_1_++] = Class24.method919(268433290, i_235_) >> 14;
																	} else if (i_4_ == 3310) {
																		int i_236_ = Class26.anIntArray393[--i_1_];
																		Class26.anIntArray393[i_1_++] = i_236_ >> 28;
																	} else if (i_4_ == 3311) {
																		int i_237_ = Class26.anIntArray393[--i_1_];
																		Class26.anIntArray393[i_1_++] = Class24.method919(i_237_, 16383);
																	} else if (i_4_ == 3312) {
																		Class26.anIntArray393[i_1_++] = !Class75.aBoolean1378 ? 0 : 1;
																	} else if (i_4_ == 3313) {
																		i_1_ -= 2;
																		int i_238_ = 32768 + Class26.anIntArray393[i_1_];
																		int i_239_ = Class26.anIntArray393[1 + i_1_];
																		Class26.anIntArray393[i_1_++] = Class68.method1254(i_239_, -1, i_238_);
																	} else if (i_4_ == 3314) {
																		i_1_ -= 2;
																		int i_240_ = Class26.anIntArray393[i_1_] + 32768;
																		int i_241_ = Class26.anIntArray393[i_1_ - -1];
																		Class26.anIntArray393[i_1_++] = Canvas_Sub1.method43((byte) -18, i_241_, i_240_);
																	} else if (i_4_ == 3315) {
																		i_1_ -= 2;
																		int i_242_ = Class26.anIntArray393[i_1_ - -1];
																		int i_243_ = Class26.anIntArray393[i_1_] - -32768;
																		Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub17.method788((byte) 47, i_243_, i_242_);
																	} else if (i_4_ == 3316) {
																		if (Class23_Sub4_Sub17.anInt3173 < 2) {
																			Class26.anIntArray393[i_1_++] = 0;
																		} else {
																			Class26.anIntArray393[i_1_++] = Class23_Sub4_Sub17.anInt3173;
																		}
																	} else if (i_4_ == 3317) {
																		Class26.anIntArray393[i_1_++] = Class23_Sub13.anInt2316;
																	} else if (i_4_ == 3318) {
																		Class26.anIntArray393[i_1_++] = Class19.anInt321;
																	} else if (i_4_ == 3321) {
																		Class26.anIntArray393[i_1_++] = Class23_Sub13_Sub17.anInt4071;
																	} else if (i_4_ == 3322) {
																		Class26.anIntArray393[i_1_++] = Class36.anInt569;
																	} else if (i_4_ == 3323) {
																		if (Class23_Sub4_Sub36.anInt3470 < 5 || Class23_Sub4_Sub36.anInt3470 > 9) {
																			Class26.anIntArray393[i_1_++] = 0;
																		} else {
																			Class26.anIntArray393[i_1_++] = 1;
																		}
																	} else if (i_4_ == 3324) {
																		if (Class23_Sub4_Sub36.anInt3470 < 5 || Class23_Sub4_Sub36.anInt3470 > 9) {
																			Class26.anIntArray393[i_1_++] = 0;
																		} else {
																			Class26.anIntArray393[i_1_++] = Class23_Sub4_Sub36.anInt3470;
																		}
																	} else if (i_4_ == 3325) {
																		if ((Class30.anInt478 ^ 0xffffffff) < -1) {
																			Class26.anIntArray393[i_1_++] = 1;
																		} else {
																			Class26.anIntArray393[i_1_++] = 0;
																		}
																	} else if (i_4_ == 3326) {
																		Class26.anIntArray393[i_1_++] = Class105.aClass38_Sub7_Sub2_1812.anInt4383;
																	} else if (i_4_ == 3327) {
																		Class26.anIntArray393[i_1_++] = !Class105.aClass38_Sub7_Sub2_1812.aClass51_4393.aBoolean797 ? 0 : 1;
																	} else if (i_4_ == 3328) {
																		Class26.anIntArray393[i_1_++] = Class67.anInt1176;
																	} else {
																		if (i_4_ != 3329) {
																			break;
																		}
																		Class26.anIntArray393[i_1_++] = Class23_Sub4_Sub12.anInt3075;
																	}
																} else if (i_4_ == 3200) {
																	i_1_ -= 3;
																	Class24.method917(Class26.anIntArray393[1 + i_1_], Class26.anIntArray393[i_1_ + 2], (byte) 65, Class26.anIntArray393[i_1_]);
																} else if (i_4_ == 3201) {
																	Class23_Sub13_Sub2.method610(Class26.anIntArray393[--i_1_], (byte) 110);
																} else {
																	if (i_4_ != 3202) {
																		break;
																	}
																	i_1_ -= 2;
																	Class36.method990((byte) 110, Class26.anIntArray393[1 + i_1_], Class26.anIntArray393[i_1_]);
																}
															} else if (i_4_ == 2700) {
																Class64 class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
																Class26.anIntArray393[i_1_++] = class64.anInt1122;
															} else if (i_4_ == 2701) {
																Class64 class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
																if ((class64.anInt1122 ^ 0xffffffff) != 0) {
																	Class26.anIntArray393[i_1_++] = class64.anInt1134;
																} else {
																	Class26.anIntArray393[i_1_++] = 0;
																}
															} else if (i_4_ == 2702) {
																int i_244_ = Class26.anIntArray393[--i_1_];
																Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -99, (long) i_244_);
																if (class23_sub25 == null) {
																	Class26.anIntArray393[i_1_++] = 0;
																} else {
																	Class26.anIntArray393[i_1_++] = 1;
																}
															} else if (i_4_ == 2703) {
																Class64 class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
																if (class64.aClass64Array1131 == null) {
																	Class26.anIntArray393[i_1_++] = 0;
																} else {
																	int i_245_ = class64.aClass64Array1131.length;
																	for (int i_246_ = 0; (i_246_ ^ 0xffffffff) > (class64.aClass64Array1131.length ^ 0xffffffff); i_246_++) {
																		if (class64.aClass64Array1131[i_246_] == null) {
																			i_245_ = i_246_;
																			break;
																		}
																	}
																	Class26.anIntArray393[i_1_++] = i_245_;
																}
															} else {
																if (i_4_ != 2704 && i_4_ != 2705) {
																	break;
																}
																i_1_ -= 2;
																int i_247_ = Class26.anIntArray393[i_1_];
																int i_248_ = Class26.anIntArray393[i_1_ - -1];
																Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -123, (long) i_247_);
																if (class23_sub25 != null && (i_248_ ^ 0xffffffff) == (class23_sub25.anInt2456 ^ 0xffffffff)) {
																	Class26.anIntArray393[i_1_++] = 1;
																} else {
																	Class26.anIntArray393[i_1_++] = 0;
																}
															}
														} else {
															Class64 class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
															if (i_4_ == 2600) {
																Class26.anIntArray393[i_1_++] = class64.anInt1009;
															} else if (i_4_ == 2601) {
																Class26.anIntArray393[i_1_++] = class64.anInt1083;
															} else if (i_4_ == 2602) {
																Class79.aClass16Array1878[i_2_++] = class64.aClass16_1070;
															} else if (i_4_ == 2603) {
																Class26.anIntArray393[i_1_++] = class64.anInt1129;
															} else if (i_4_ == 2604) {
																Class26.anIntArray393[i_1_++] = class64.anInt1088;
															} else if (i_4_ == 2605) {
																Class26.anIntArray393[i_1_++] = class64.anInt1050;
															} else if (i_4_ == 2606) {
																Class26.anIntArray393[i_1_++] = class64.anInt1107;
															} else if (i_4_ == 2607) {
																Class26.anIntArray393[i_1_++] = class64.anInt1000;
															} else if (i_4_ == 2608) {
																Class26.anIntArray393[i_1_++] = class64.anInt1110;
															} else {
																if (i_4_ != 2609) {
																	break;
																}
																Class26.anIntArray393[i_1_++] = class64.anInt1127;
															}
														}
													} else {
														Class64 class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
														if (i_4_ == 2500) {
															Class26.anIntArray393[i_1_++] = class64.anInt1120;
														} else if (i_4_ == 2501) {
															Class26.anIntArray393[i_1_++] = class64.anInt1126;
														} else if (i_4_ == 2502) {
															Class26.anIntArray393[i_1_++] = class64.anInt1128;
														} else if (i_4_ == 2503) {
															Class26.anIntArray393[i_1_++] = class64.anInt999;
														} else if (i_4_ == 2504) {
															Class26.anIntArray393[i_1_++] = class64.aBoolean1135 ? 1 : 0;
														} else {
															if (i_4_ != 2505) {
																break;
															}
															Class26.anIntArray393[i_1_++] = class64.anInt1056;
														}
													}
												} else {
													Class64 class64 = !bool_30_ ? Class61.aClass64_959 : Class23_Sub4_Sub4.aClass64_2965;
													if (i_4_ == 1800) {
														Class26.anIntArray393[i_1_++] = Class74.method1313(121, Class47.method1142(class64, 120));
													} else if (i_4_ == 1801) {
														int i_249_ = Class26.anIntArray393[--i_1_];
														i_249_--;
														if (class64.aClass16Array1021 != null && class64.aClass16Array1021.length > i_249_ && class64.aClass16Array1021[i_249_] != null) {
															Class79.aClass16Array1878[i_2_++] = class64.aClass16Array1021[i_249_];
														} else {
															Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
														}
													} else {
														if (i_4_ != 1802) {
															break;
														}
														if (class64.aClass16_1130 == null) {
															Class79.aClass16Array1878[i_2_++] = Class94.aClass16_1600;
														} else {
															Class79.aClass16Array1878[i_2_++] = class64.aClass16_1130;
														}
													}
												}
											} else {
												Class64 class64 = bool_30_ ? Class23_Sub4_Sub4.aClass64_2965 : Class61.aClass64_959;
												if (i_4_ == 1700) {
													Class26.anIntArray393[i_1_++] = class64.anInt1122;
												} else if (i_4_ == 1701) {
													if ((class64.anInt1122 ^ 0xffffffff) != 0) {
														Class26.anIntArray393[i_1_++] = class64.anInt1134;
													} else {
														Class26.anIntArray393[i_1_++] = 0;
													}
												} else {
													if (i_4_ != 1702) {
														break;
													}
													Class26.anIntArray393[i_1_++] = class64.anInt1005;
												}
											}
										} else {
											Class64 class64 = !bool_30_ ? Class61.aClass64_959 : Class23_Sub4_Sub4.aClass64_2965;
											if (i_4_ == 1600) {
												Class26.anIntArray393[i_1_++] = class64.anInt1009;
											} else if (i_4_ == 1601) {
												Class26.anIntArray393[i_1_++] = class64.anInt1083;
											} else if (i_4_ == 1602) {
												Class79.aClass16Array1878[i_2_++] = class64.aClass16_1070;
											} else if (i_4_ == 1603) {
												Class26.anIntArray393[i_1_++] = class64.anInt1129;
											} else if (i_4_ == 1604) {
												Class26.anIntArray393[i_1_++] = class64.anInt1088;
											} else if (i_4_ == 1605) {
												Class26.anIntArray393[i_1_++] = class64.anInt1050;
											} else if (i_4_ == 1606) {
												Class26.anIntArray393[i_1_++] = class64.anInt1107;
											} else if (i_4_ == 1607) {
												Class26.anIntArray393[i_1_++] = class64.anInt1000;
											} else if (i_4_ == 1608) {
												Class26.anIntArray393[i_1_++] = class64.anInt1110;
											} else {
												if (i_4_ != 1609) {
													break;
												}
												Class26.anIntArray393[i_1_++] = class64.anInt1127;
											}
										}
									} else {
										Class64 class64;
										if (i_4_ < 2000) {
											class64 = bool_30_ ? Class23_Sub4_Sub4.aClass64_2965 : Class61.aClass64_959;
										} else {
											class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
											i_4_ -= 1000;
										}
										if (i_4_ == 1300) {
											int i_250_ = -1 + Class26.anIntArray393[--i_1_];
											if (i_250_ < 0 || i_250_ > 9) {
												i_2_--;
											} else {
												class64.method1220(i_250_, 0, Class79.aClass16Array1878[--i_2_]);
											}
										} else if (i_4_ == 1301) {
											i_1_ -= 2;
											int i_251_ = Class26.anIntArray393[i_1_];
											int i_252_ = Class26.anIntArray393[1 + i_1_];
											class64.aClass64_1121 = Class23_Sub13_Sub8_Sub1.method679(i_251_, i_252_, (byte) -64);
										} else if (i_4_ == 1302) {
											class64.aBoolean1061 = Class26.anIntArray393[--i_1_] == 1;
										} else if (i_4_ == 1303) {
											class64.anInt1041 = Class26.anIntArray393[--i_1_];
										} else if (i_4_ == 1304) {
											class64.anInt1024 = Class26.anIntArray393[--i_1_];
										} else if (i_4_ == 1305) {
											class64.aClass16_1130 = Class79.aClass16Array1878[--i_2_];
										} else if (i_4_ == 1306) {
											class64.aClass16_996 = Class79.aClass16Array1878[--i_2_];
										} else {
											if (i_4_ != 1307) {
												break;
											}
											class64.aClass16Array1021 = null;
										}
									}
								} else {
									Class64 class64;
									if (i_4_ >= 2000) {
										class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
										i_4_ -= 1000;
									} else {
										class64 = !bool_30_ ? Class61.aClass64_959 : Class23_Sub4_Sub4.aClass64_2965;
									}
									Class91.method1450((byte) 29, class64);
									if (i_4_ == 1200 || i_4_ == 1205) {
										i_1_ -= 2;
										int i_253_ = Class26.anIntArray393[i_1_];
										int i_254_ = Class26.anIntArray393[1 + i_1_];
										if ((i_253_ ^ 0xffffffff) == 0) {
											class64.anInt1091 = -1;
											class64.anInt1111 = 1;
											class64.anInt1122 = -1;
										} else {
											class64.anInt1122 = i_253_;
											class64.anInt1134 = i_254_;
											Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-66, i_253_);
											if (i_4_ != 1205) {
												class64.aBoolean1054 = true;
											} else {
												class64.aBoolean1054 = false;
											}
											class64.anInt1110 = class23_sub13_sub11.anInt3947;
											class64.anInt1015 = class23_sub13_sub11.anInt3922;
											class64.anInt1107 = class23_sub13_sub11.anInt3891;
											class64.anInt1000 = class23_sub13_sub11.anInt3897;
											class64.anInt1074 = class23_sub13_sub11.anInt3899;
											class64.anInt1050 = class23_sub13_sub11.anInt3896;
											if ((class64.anInt1018 ^ 0xffffffff) >= -1) {
												if (class64.anInt1112 > 0) {
													class64.anInt1050 = 32 * class64.anInt1050 / class64.anInt1112;
												}
											} else {
												class64.anInt1050 = class64.anInt1050 * 32 / class64.anInt1018;
											}
										}
									} else if (i_4_ == 1201) {
										class64.anInt1111 = 2;
										class64.anInt1091 = Class26.anIntArray393[--i_1_];
									} else if (i_4_ == 1202) {
										class64.anInt1111 = 3;
										class64.anInt1091 = Class105.aClass38_Sub7_Sub2_1812.aClass51_4393.method1167(64);
									} else if (i_4_ == 1203) {
										class64.anInt1111 = 6;
										class64.anInt1091 = Class26.anIntArray393[--i_1_];
									} else {
										if (i_4_ != 1204) {
											break;
										}
										class64.anInt1111 = 5;
										class64.anInt1091 = Class26.anIntArray393[--i_1_];
									}
								}
							} else {
								Class64 class64;
								if (i_4_ >= 2000) {
									class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
									i_4_ -= 1000;
								} else {
									class64 = bool_30_ ? Class23_Sub4_Sub4.aClass64_2965 : Class61.aClass64_959;
								}
								if (i_4_ == 1100) {
									i_1_ -= 2;
									class64.anInt1009 = Class26.anIntArray393[i_1_];
									if (class64.anInt1129 - class64.anInt1128 < class64.anInt1009) {
										class64.anInt1009 = class64.anInt1129 - class64.anInt1128;
									}
									if (class64.anInt1009 < 0) {
										class64.anInt1009 = 0;
									}
									class64.anInt1083 = Class26.anIntArray393[1 + i_1_];
									if ((class64.anInt1083 ^ 0xffffffff) < (-class64.anInt999 + class64.anInt1088 ^ 0xffffffff)) {
										class64.anInt1083 = -class64.anInt999 + class64.anInt1088;
									}
									if ((class64.anInt1083 ^ 0xffffffff) > -1) {
										class64.anInt1083 = 0;
									}
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1101) {
									class64.anInt1033 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1102) {
									class64.aBoolean1081 = Class26.anIntArray393[--i_1_] == 1;
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1103) {
									class64.anInt1127 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1104) {
									class64.anInt1063 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1105) {
									class64.anInt1072 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1106) {
									class64.anInt1002 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1107) {
									class64.aBoolean1071 = Class26.anIntArray393[--i_1_] == 1;
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1108) {
									class64.anInt1111 = 1;
									class64.anInt1091 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1109) {
									i_1_ -= 6;
									class64.anInt1015 = Class26.anIntArray393[i_1_];
									class64.anInt1074 = Class26.anIntArray393[i_1_ + 1];
									class64.anInt1107 = Class26.anIntArray393[2 + i_1_];
									class64.anInt1110 = Class26.anIntArray393[i_1_ + 3];
									class64.anInt1000 = Class26.anIntArray393[4 + i_1_];
									class64.anInt1050 = Class26.anIntArray393[5 + i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1110) {
									int i_255_ = Class26.anIntArray393[--i_1_];
									if ((i_255_ ^ 0xffffffff) != (class64.anInt1006 ^ 0xffffffff)) {
										class64.anInt1006 = i_255_;
										class64.anInt1020 = 0;
										class64.anInt1100 = 0;
										Class91.method1450((byte) 29, class64);
									}
								} else if (i_4_ == 1111) {
									class64.aBoolean1004 = Class26.anIntArray393[--i_1_] == 1;
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1112) {
									RSString class16 = Class79.aClass16Array1878[--i_2_];
									if (!class16.method183(class64.aClass16_1070, (byte) -49)) {
										class64.aClass16_1070 = class16;
										Class91.method1450((byte) 29, class64);
									}
								} else if (i_4_ == 1113) {
									class64.anInt1068 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1114) {
									i_1_ -= 3;
									class64.anInt1133 = Class26.anIntArray393[i_1_];
									class64.anInt1045 = Class26.anIntArray393[1 + i_1_];
									class64.anInt1062 = Class26.anIntArray393[i_1_ + 2];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1115) {
									class64.aBoolean1069 = Class26.anIntArray393[--i_1_] == 1;
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1116) {
									class64.anInt1132 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1117) {
									class64.anInt1087 = Class26.anIntArray393[--i_1_];
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1118) {
									class64.aBoolean1031 = Class26.anIntArray393[--i_1_] == 1;
									Class91.method1450((byte) 29, class64);
								} else if (i_4_ == 1119) {
									class64.aBoolean1141 = Class26.anIntArray393[--i_1_] == 1;
									Class91.method1450((byte) 29, class64);
								} else {
									if (i_4_ != 1120) {
										break;
									}
									i_1_ -= 2;
									class64.anInt1129 = Class26.anIntArray393[i_1_];
									class64.anInt1088 = Class26.anIntArray393[1 + i_1_];
									Class91.method1450((byte) 29, class64);
									if (class64.anInt1003 == 0) {
										Class23_Sub4_Sub21.method351(class64, bool);
									}
								}
							}
						} else {
							Class64 class64;
							if (i_4_ >= 2000) {
								i_4_ -= 1000;
								class64 = Class23_Sub24.method905(Class26.anIntArray393[--i_1_], (byte) 111);
							} else {
								class64 = !bool_30_ ? Class61.aClass64_959 : Class23_Sub4_Sub4.aClass64_2965;
							}
							if (i_4_ == 1000) {
								i_1_ -= 2;
								class64.aByte1151 = (byte) 0;
								class64.anInt1120 = class64.anInt1124 = Class26.anIntArray393[i_1_];
								class64.aByte1142 = (byte) 0;
								class64.anInt1126 = class64.anInt1097 = Class26.anIntArray393[1 + i_1_];
								Class91.method1450((byte) 29, class64);
							} else if (i_4_ == 1001) {
								class64.aByte1034 = (byte) 0;
								i_1_ -= 2;
								class64.anInt1128 = class64.anInt1112 = Class26.anIntArray393[i_1_];
								class64.aByte1085 = (byte) 0;
								class64.anInt1018 = 0;
								class64.anInt999 = class64.anInt1105 = Class26.anIntArray393[i_1_ - -1];
								class64.anInt1076 = 0;
								Class91.method1450((byte) 29, class64);
								if ((class64.anInt1003 ^ 0xffffffff) == -1) {
									Class23_Sub4_Sub21.method351(class64, bool);
								}
							} else {
								if (i_4_ != 1003) {
									break;
								}
								boolean bool_256_ = Class26.anIntArray393[--i_1_] == 1;
								if (bool_256_ != class64.aBoolean1135) {
									class64.aBoolean1135 = bool_256_;
									Class91.method1450((byte) 29, class64);
								}
							}
						}
					}
					throw new IllegalStateException();
				} catch (Exception exception) {
					if (class23_sub13_sub23.aClass16_4251 == null) {
						if ((Class23_Sub8.anInt2250 ^ 0xffffffff) != -1) {
							Class95.method1468(0, -1, Class23_Sub13_Sub18.aClass16_4093, Class94.aClass16_1600);
						}
						Class26.method925(95, exception, "CS2 - scr:" + class23_sub13_sub23.aLong358 + " op:" + i_4_);
					} else {
						RSString class16 = Class38_Sub6.method1075(30, 0);
						class16.method157(oa.aClass16_1253, (byte) 115).method157(class23_sub13_sub23.aClass16_4251, (byte) 95);
						for (int i_257_ = Class92.anInt1566 + -1; (i_257_ ^ 0xffffffff) <= -1; i_257_--)
							class16.method157(Class21.aClass16_341, (byte) 95).method157(Class23_Sub4_Sub36.aClass50Array3463[i_257_].aClass23_Sub13_Sub23_778.aClass16_4251, (byte) 106);
						if (i_4_ == 40) {
							int i_258_ = is_3_[i_5_];
							class16.method157(client.aClass16_1975, (byte) 125).method157(Class23_Sub4_Sub23.method360((byte) -9, i_258_), (byte) 112);
						}
						if ((Class23_Sub8.anInt2250 ^ 0xffffffff) != -1) {
							Class95.method1468(0, -1, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub14.aClass16_3132, class23_sub13_sub23.aClass16_4251 }, -34), Class94.aClass16_1600);
						}
						Class26.method925(95, exception, "CS2 - scr:" + class23_sub13_sub23.aLong358 + " op:" + i_4_ + new String(class16.method147(bool)));
					}
				}
			}
		}
	}
	
	static final void method897(byte b) {
		anInt2425++;
		if (b == 41) {
			for (int i = 0; i < Class23_Sub2.anInt2048; i++) {
				int i_259_ = Class94.anIntArray1603[i];
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_259_];
				int i_260_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
				if ((0x1 & i_260_) != 0) {
					int i_261_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 93);
					int i_262_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-116);
					class38_sub7_sub1.method1086(b + -31, i_261_, i_262_, Class89.anInt1511);
					class38_sub7_sub1.anInt2638 = 300 + Class89.anInt1511;
					class38_sub7_sub1.anInt2708 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-100);
				}
				if ((0x10 & i_260_) != 0) {
					class38_sub7_sub1.aClass16_2670 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
					class38_sub7_sub1.anInt2639 = 100;
				}
				if ((i_260_ & 0x20) != 0) {
					class38_sub7_sub1.anInt2648 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
					class38_sub7_sub1.anInt2692 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(124);
				}
				if ((i_260_ & 0x4) != 0) {
					class38_sub7_sub1.aClass23_Sub13_Sub20_4373 = Class25.method922(false, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(b + 83));
					class38_sub7_sub1.anInt2655 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4148;
					class38_sub7_sub1.anInt2630 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4152;
					class38_sub7_sub1.anInt2641 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4142;
					class38_sub7_sub1.anInt2678 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4143;
					class38_sub7_sub1.anInt2700 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4170;
					class38_sub7_sub1.anInt2691 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4181;
					class38_sub7_sub1.anInt2635 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4144;
					class38_sub7_sub1.anInt2668 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4173;
					class38_sub7_sub1.anInt2653 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4162;
				}
				if ((0x40 & i_260_ ^ 0xffffffff) != -1) {
					class38_sub7_sub1.anInt2686 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(b + 83);
					if ((class38_sub7_sub1.anInt2686 ^ 0xffffffff) == -65536) {
						class38_sub7_sub1.anInt2686 = -1;
					}
				}
				if ((0x80 & i_260_) != 0) {
					class38_sub7_sub1.anInt2710 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
					int i_263_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(120);
					class38_sub7_sub1.anInt2671 = (0xffff & i_263_) + Class89.anInt1511;
					class38_sub7_sub1.anInt2661 = 0;
					if ((class38_sub7_sub1.anInt2710 ^ 0xffffffff) == -65536) {
						class38_sub7_sub1.anInt2710 = -1;
					}
					class38_sub7_sub1.anInt2647 = i_263_ >> 16;
					class38_sub7_sub1.anInt2695 = 0;
					if (class38_sub7_sub1.anInt2671 > Class89.anInt1511) {
						class38_sub7_sub1.anInt2695 = -1;
					}
				}
				if ((0x8 & i_260_) != 0) {
					int i_264_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(b + 84);
					if ((i_264_ ^ 0xffffffff) == -65536) {
						i_264_ = -1;
					}
					int i_265_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(b ^ ~0x6b2875de);
					Class57.method1191(i_264_, class38_sub7_sub1, i_265_, b ^ ~0x29);
				}
				if ((i_260_ & 0x2 ^ 0xffffffff) != -1) {
					int i_266_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(b ^ 0x54);
					int i_267_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 123);
					class38_sub7_sub1.method1086(10, i_266_, i_267_, Class89.anInt1511);
				}
			}
		}
	}
	
	static final void method898(int i) {
		Class23_Sub24.aBoolean2446 = true;
		anInt2426++;
		if (i != 112) {
			anInt2420 = 64;
		}
		Class7.aBoolean170 = true;
	}
	
	Class23_Sub23() {
		/* empty */
	}
}
