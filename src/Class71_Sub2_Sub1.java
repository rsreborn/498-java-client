/* Class71_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71_Sub2_Sub1 extends Class71_Sub2
{
	static int anInt4465;
	static int anInt4466;
	static int anInt4467;
	static int anInt4468;
	static RSString aClass16_4469 = Class38_Sub6.method1076((byte) 86, "Sie haben gerade eine andere Welt verlassen)3");
	static Class89 aClass89_4470 = new Class89();
	static int anInt4471;
	private static RSString aClass16_4472 = Class38_Sub6.method1076((byte) 86, "No reply from loginserver)3");
	static int[] anIntArray4473;
	static RSString aClass16_4474 = aClass16_4472;
	static int anInt4475;
	
	static final void method1281(byte b, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int[] is, int i_5_, int i_6_, byte[] bs) {
		anInt4468++;
		i_3_ = ((0xff00ff & i_3_) * i & ~0xff00ff) + (i * (i_3_ & 0xff00) & 0xff0000) >> 8;
		i = -i + 256;
		int i_7_ = -i_5_;
		if (b != -16) {
			method1281((byte) 0, -60, -22, -87, -17, 105, 115, null, -91, -96, null);
		}
		for (/**/; i_7_ < 0; i_7_++) {
			for (int i_8_ = -i_2_; i_8_ < 0; i_8_++) {
				if (bs[i_4_++] == 0) {
					i_1_++;
				} else {
					int i_9_ = is[i_1_];
					is[i_1_++] = (Class24.method919(16711680, i * Class24.method919(i_9_, 65280)) + Class24.method919(i * Class24.method919(16711935, i_9_), -16711936) >> 8) - -i_3_;
				}
			}
			i_4_ += i_6_;
			i_1_ += i_0_;
		}
	}
	
	static final void method1282(int i, Class64[] class64s, int i_10_) {
		for (int i_11_ = i; (class64s.length ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
			Class64 class64 = class64s[i_11_];
			if (class64 != null) {
				if ((class64.anInt1003 ^ 0xffffffff) == -1) {
					if (class64.aClass64Array1131 != null) {
						method1282(0, class64.aClass64Array1131, i_10_);
					}
					Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) 104, (long) class64.anInt1098);
					if (class23_sub25 != null) {
						Class23_Sub13_Sub13.method757(class23_sub25.anInt2456, i_10_, false);
					}
				}
				if (i_10_ == 0 && class64.anObjectArray1119 != null) {
					Class23_Sub9 class23_sub9 = new Class23_Sub9();
					class23_sub9.aClass64_2263 = class64;
					class23_sub9.anObjectArray2274 = class64.anObjectArray1119;
					Class91.method1452(class23_sub9, (byte) -95);
				}
				if (i_10_ == 1 && class64.anObjectArray1014 != null) {
					if (class64.anInt1005 >= 0) {
						Class64 class64_12_ = Class23_Sub24.method905(class64.anInt1098, (byte) 111);
						if (class64_12_ == null || class64_12_.aClass64Array1131 == null || (class64.anInt1005 ^ 0xffffffff) <= (class64_12_.aClass64Array1131.length ^ 0xffffffff) || class64_12_.aClass64Array1131[class64.anInt1005] != class64) {
							continue;
						}
					}
					Class23_Sub9 class23_sub9 = new Class23_Sub9();
					class23_sub9.anObjectArray2274 = class64.anObjectArray1014;
					class23_sub9.aClass64_2263 = class64;
					Class91.method1452(class23_sub9, (byte) -91);
				}
			}
		}
		anInt4466++;
	}
	
	static final void method1283(Class64[] class64s, int i, int i_13_) {
		anInt4471++;
		if (i_13_ == -22561) {
			for (int i_14_ = 0; class64s.length > i_14_; i_14_++) {
				Class64 class64 = class64s[i_14_];
				if (class64 != null && (i ^ 0xffffffff) == (class64.anInt1056 ^ 0xffffffff) && (!class64.aBoolean1017 || !Class10.method109(true, class64))) {
					if (class64.anInt1003 == 0) {
						if (!class64.aBoolean1017 && Class10.method109(true, class64) && Class42.aClass64_663 != class64) {
							continue;
						}
						method1283(class64s, class64.anInt1098, -22561);
						if (class64.aClass64Array1131 != null) {
							method1283(class64.aClass64Array1131, class64.anInt1098, i_13_);
						}
						Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -111, (long) class64.anInt1098);
						if (class23_sub25 != null) {
							Class87_Sub4.method1427(class23_sub25.anInt2456, false);
						}
					}
					if (class64.anInt1003 == 6) {
						if (class64.anInt1006 != -1 || (class64.anInt1118 ^ 0xffffffff) != 0) {
							boolean bool = Class23_Sub13_Sub15.method776(true, class64);
							int i_15_;
							if (!bool) {
								i_15_ = class64.anInt1006;
							} else {
								i_15_ = class64.anInt1118;
							}
							if (i_15_ != -1) {
								Class23_Sub13_Sub22 class23_sub13_sub22 = Class7.method90(i_15_, (byte) 93);
								if (class23_sub13_sub22 != null) {
									class64.anInt1020 += Class23_Sub25.anInt2459;
									while (class23_sub13_sub22.anIntArray4204[class64.anInt1100] < class64.anInt1020) {
										class64.anInt1020 -= class23_sub13_sub22.anIntArray4204[class64.anInt1100];
										class64.anInt1100++;
										if (class64.anInt1100 >= class23_sub13_sub22.anIntArray4203.length) {
											class64.anInt1100 -= class23_sub13_sub22.anInt4223;
											if ((class64.anInt1100 ^ 0xffffffff) > -1 || class23_sub13_sub22.anIntArray4203.length <= class64.anInt1100) {
												class64.anInt1100 = 0;
											}
										}
										Class91.method1450((byte) 29, class64);
									}
								}
							}
						}
						if (class64.anInt1090 != 0 && !class64.aBoolean1017) {
							int i_16_ = class64.anInt1090 >> 16;
							i_16_ *= Class23_Sub25.anInt2459;
							class64.anInt1107 = i_16_ + class64.anInt1107 & 0x7ff;
							int i_17_ = class64.anInt1090 << 16 >> 16;
							i_17_ *= Class23_Sub25.anInt2459;
							class64.anInt1110 = i_17_ + class64.anInt1110 & 0x7ff;
							Class91.method1450((byte) 29, class64);
						}
					}
				}
			}
		}
	}
	
	static final void method1284(int i, int i_18_) {
		anInt4467++;
		Class91.anInt1556 = i / i_18_;
	}
	
	static final Class105_Sub1 method1285(byte b, int i, boolean bool, boolean bool_19_, boolean bool_20_) {
		if (b < 126) {
			method1284(73, -75);
		}
		Class13 class13 = null;
		anInt4465++;
		if (Class23_Sub4_Sub6.aClass29_2990 != null) {
			class13 = new Class13(i, Class23_Sub4_Sub6.aClass29_2990, Class78.aClass29Array1410[i], 1000000);
		}
		return new Class105_Sub1(class13, Class73.aClass13_1318, i, bool_20_, bool_19_, bool);
	}
	
	public static void method1286(byte b) {
		anIntArray4473 = null;
		aClass16_4469 = null;
		if (b != 62) {
			method1282(-52, null, -118);
		}
		aClass16_4472 = null;
		aClass89_4470 = null;
		aClass16_4474 = null;
	}
}
