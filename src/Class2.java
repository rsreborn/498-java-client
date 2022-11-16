/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class2
{
	static int anInt68;
	static int anInt69;
	static BigInteger aBigInteger70 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	static int anInt71;
	static int anInt72;
	static RSString aClass16_73;
	static int anInt74 = 0;
	private static RSString aClass16_75;
	static RSString aClass16_76;
	static RSString aClass16_77;
	static RSString aClass16_78 = Class38_Sub6.method1076((byte) 86, ":duelfriend:");
	static int anInt79;
	private static RSString aClass16_80;
	static RSString aClass16_81;
	static int anInt82;
	static RSString aClass16_83;
	private static RSString aClass16_84;
	
	public static void method48(int i) {
		aClass16_75 = null;
		aClass16_77 = null;
		aClass16_73 = null;
		aClass16_81 = null;
		if (i != 32) {
			method48(65);
		}
		aClass16_83 = null;
		aClass16_76 = null;
		aClass16_84 = null;
		aClass16_78 = null;
		aClass16_80 = null;
		aBigInteger70 = null;
	}
	
	static final void method49(int i, int i_0_, boolean bool, Class64 class64, int i_1_) {
		anInt69++;
		if (bool != false) {
			aClass16_78 = null;
		}
		Class48.method1150((byte) 80);
		Class20.method210(i_1_, i, class64.anInt1128 + i_1_, class64.anInt999 + i);
		if (Class106.anInt1819 != 2 && Class106.anInt1819 != 5) {
			int i_2_ = Class35.anInt550 - -Class23_Sub4_Sub16.anInt3162 & 0x7ff;
			int i_3_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + 464;
			int i_4_ = 48 + Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32;
			((Class23_Sub13_Sub10_Sub1) Class53.aClass23_Sub13_Sub10_841).method722(i_1_, i, class64.anInt1128, class64.anInt999, i_4_, i_3_, i_2_, 256 - -Class38_Sub7_Sub2.anInt4410, class64.anIntArray1064, class64.anIntArray1109);
			for (int i_5_ = 0; (Class23_Sub5_Sub1.anInt3541 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				int i_6_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32) + (Class102.anIntArray1704[i_5_] * 4 + 2);
				int i_7_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + (2 + oa.anIntArray1251[i_5_] * 4);
				Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(Class23_Sub4_Sub17.anIntArray3172[i_5_], -21035);
				if (class23_sub13_sub7.anIntArray3746 != null) {
					class23_sub13_sub7 = class23_sub13_sub7.method646(176743434);
					if (class23_sub13_sub7 == null || class23_sub13_sub7.anInt3751 == -1) {
						continue;
					}
				}
				Class5.method63(class64, i, i_7_, 90, i_6_, Class23_Sub10_Sub2.aClass23_Sub13_Sub10Array3609[class23_sub13_sub7.anInt3751], i_1_);
			}
			for (int i_8_ = 0; i_8_ < 104; i_8_++) {
				for (int i_9_ = 0; i_9_ < 104; i_9_++) {
					Class89 class89 = Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_8_][i_9_];
					if (class89 != null) {
						int i_10_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + 2 + i_9_ * 4;
						int i_11_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32) + 2 + i_8_ * 4;
						Class5.method63(class64, i, i_10_, 90, i_11_, client.aClass23_Sub13_Sub10Array1971[0], i_1_);
					}
				}
			}
			for (int i_12_ = 0; (Class23_Sub4_Sub18.anInt3191 ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[Class23_Sub4_Sub17.anIntArray3170[i_12_]];
				if (class38_sub7_sub1 != null && class38_sub7_sub1.method1082((byte) -108)) {
					Class23_Sub13_Sub20 class23_sub13_sub20 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373;
					if (class23_sub13_sub20 != null && class23_sub13_sub20.anIntArray4153 != null) {
						class23_sub13_sub20 = class23_sub13_sub20.method813(674);
					}
					if (class23_sub13_sub20 != null && class23_sub13_sub20.aBoolean4154 && class23_sub13_sub20.aBoolean4169) {
						int i_13_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + class38_sub7_sub1.anInt2659 / 32;
						int i_14_ = class38_sub7_sub1.anInt2674 / 32 - Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32;
						Class5.method63(class64, i, i_13_, 90, i_14_, client.aClass23_Sub13_Sub10Array1971[1], i_1_);
					}
				}
			}
			for (int i_15_ = 0; (Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
				Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[Class23_Sub13_Sub3.anIntArray3700[i_15_]];
				if (class38_sub7_sub2 != null && class38_sub7_sub2.method1082((byte) -108)) {
					int i_16_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32) + class38_sub7_sub2.anInt2674 / 32;
					boolean bool_17_ = false;
					int i_18_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + class38_sub7_sub2.anInt2659 / 32;
					long l = class38_sub7_sub2.aClass16_4389.method184(-85);
					for (int i_19_ = 0; i_19_ < Class45.anInt696; i_19_++) {
						if (l == Class68.aLongArray1187[i_19_] && (Class23_Sub10_Sub3.anIntArray3658[i_19_] ^ 0xffffffff) != -1) {
							bool_17_ = true;
							break;
						}
					}
					boolean bool_20_ = false;
					if (Class105.aClass38_Sub7_Sub2_1812.anInt4398 != 0 && class38_sub7_sub2.anInt4398 != 0 && (class38_sub7_sub2.anInt4398 ^ 0xffffffff) == (Class105.aClass38_Sub7_Sub2_1812.anInt4398 ^ 0xffffffff)) {
						bool_20_ = true;
					}
					if (bool_17_) {
						Class5.method63(class64, i, i_18_, 90, i_16_, client.aClass23_Sub13_Sub10Array1971[3], i_1_);
					} else if (!bool_20_) {
						Class5.method63(class64, i, i_18_, 90, i_16_, client.aClass23_Sub13_Sub10Array1971[2], i_1_);
					} else {
						Class5.method63(class64, i, i_18_, 90, i_16_, client.aClass23_Sub13_Sub10Array1971[4], i_1_);
					}
				}
			}
			Class10[] class10s = Class23_Sub27.aClass10Array2488;
			for (int i_21_ = 0; (class10s.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
				Class10 class10 = class10s[i_21_];
				if (class10 != null && (class10.anInt203 ^ 0xffffffff) != -1 && Class89.anInt1511 % 20 < 10) {
					if (class10.anInt203 == 1 && (class10.anInt209 ^ 0xffffffff) <= -1 && (Class31.aClass38_Sub7_Sub1Array483.length ^ 0xffffffff) < (class10.anInt209 ^ 0xffffffff)) {
						Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[class10.anInt209];
						if (class38_sub7_sub1 != null) {
							int i_22_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + class38_sub7_sub1.anInt2659 / 32;
							int i_23_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32) + class38_sub7_sub1.anInt2674 / 32;
							Class30.method956(class64, (byte) -100, i, i_22_, i_23_, i_1_, class10.anInt205);
						}
					}
					if (class10.anInt203 == 2) {
						int i_24_ = (-Class42.anInt662 + class10.anInt211) * 4 + 2 + -(Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32);
						int i_25_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + 2 + 4 * (-Class58.anInt903 + class10.anInt212);
						Class30.method956(class64, (byte) -100, i, i_25_, i_24_, i_1_, class10.anInt205);
					}
					if (class10.anInt203 == 10 && (class10.anInt209 ^ 0xffffffff) <= -1 && (Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932.length ^ 0xffffffff) < (class10.anInt209 ^ 0xffffffff)) {
						Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[class10.anInt209];
						if (class38_sub7_sub2 != null) {
							int i_26_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + class38_sub7_sub2.anInt2659 / 32;
							int i_27_ = class38_sub7_sub2.anInt2674 / 32 + -(Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32);
							Class30.method956(class64, (byte) -100, i, i_26_, i_27_, i_1_, class10.anInt205);
						}
					}
				}
			}
			if (Class23_Sub13_Sub17.anInt4077 != 0) {
				int i_28_ = 2 + (4 * Class23_Sub13_Sub17.anInt4077 - Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32);
				int i_29_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + (2 + Class23_Sub13_Sub18.anInt4078 * 4);
				Class5.method63(class64, i, i_29_, 90, i_28_, Class23_Sub13_Sub8_Sub1.aClass23_Sub13_Sub10_4494, i_1_);
			}
			Class20.method222(class64.anInt1128 / 2 + (i_1_ + -1), i + (class64.anInt999 / 2 - 1), 3, 3, 16777215);
		} else {
			Class20.method216(i_1_, i, 0, class64.anIntArray1064, class64.anIntArray1109);
		}
		Class36.aBooleanArray571[i_0_] = true;
	}
	
	static final void method50(int i, Buffer class23_sub5, int i_30_, Class9 class9) {
		anInt71++;
		int i_31_ = -115 / ((10 - i_30_) / 40);
		Class23_Sub27 class23_sub27 = new Class23_Sub27();
		class23_sub27.anInt2486 = class23_sub5.method461(-1797813752);
		class23_sub27.anInt2478 = class23_sub5.method472(-48);
		class23_sub27.aClass60Array2477 = new Class60[class23_sub27.anInt2486];
		class23_sub27.aByteArrayArrayArray2476 = new byte[class23_sub27.anInt2486][][];
		class23_sub27.anIntArray2474 = new int[class23_sub27.anInt2486];
		class23_sub27.aClass60Array2484 = new Class60[class23_sub27.anInt2486];
		class23_sub27.anIntArray2485 = new int[class23_sub27.anInt2486];
		class23_sub27.anIntArray2480 = new int[class23_sub27.anInt2486];
		for (int i_32_ = 0; (class23_sub27.anInt2486 ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
			try {
				int i_33_ = class23_sub5.method461(-1797813752);
				if ((i_33_ ^ 0xffffffff) != -1 && i_33_ != 1 && i_33_ != 2) {
					if (i_33_ == 3 || i_33_ == 4) {
						String string = new String(class23_sub5.method426(2).method147(true));
						String string_34_ = new String(class23_sub5.method426(2).method147(true));
						int i_35_ = class23_sub5.method461(-1797813752);
						String[] strings = new String[i_35_];
						for (int i_36_ = 0; i_35_ > i_36_; i_36_++)
							strings[i_36_] = new String(class23_sub5.method426(2).method147(true));
						byte[][] bs = new byte[i_35_][];
						if (i_33_ == 3) {
							for (int i_37_ = 0; i_35_ > i_37_; i_37_++) {
								int i_38_ = class23_sub5.method472(-25);
								bs[i_37_] = new byte[i_38_];
								class23_sub5.method450(i_38_, bs[i_37_], 96, 0);
							}
						}
						class23_sub27.anIntArray2485[i_32_] = i_33_;
						Class[] var_classes = new Class[i_35_];
						for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff); i_39_++)
							var_classes[i_39_] = Class23_Sub4_Sub37.method417(strings[i_39_], (byte) -65);
						class23_sub27.aClass60Array2477[i_32_] = class9.method106(string_34_, var_classes, Class23_Sub4_Sub37.method417(string, (byte) -65), 2);
						class23_sub27.aByteArrayArrayArray2476[i_32_] = bs;
					}
				} else {
					String string = new String(class23_sub5.method426(2).method147(true));
					int i_40_ = 0;
					String string_41_ = new String(class23_sub5.method426(2).method147(true));
					if (i_33_ == 1) {
						i_40_ = class23_sub5.method472(116);
					}
					class23_sub27.anIntArray2485[i_32_] = i_33_;
					class23_sub27.anIntArray2474[i_32_] = i_40_;
					class23_sub27.aClass60Array2484[i_32_] = class9.method107(Class23_Sub4_Sub37.method417(string, (byte) -65), -99, string_41_);
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class23_sub27.anIntArray2480[i_32_] = -1;
			} catch (SecurityException securityexception) {
				class23_sub27.anIntArray2480[i_32_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class23_sub27.anIntArray2480[i_32_] = -3;
			} catch (Exception exception) {
				class23_sub27.anIntArray2480[i_32_] = -4;
			} catch (Throwable throwable) {
				class23_sub27.anIntArray2480[i_32_] = -5;
			}
		}
		Class72.aClass89_1286.method1439(61, class23_sub27);
	}
	
	static final void method51(RSString class16, int i) {
		anInt72++;
		if (Class23_Sub4_Sub3.aClass9_2939.anApplet188 != null) {
			try {
				RSString class16_42_ = Class75.aClass16_1374.method172(i ^ ~0x3e73, Class23_Sub4_Sub3.aClass9_2939.anApplet188);
				RSString class16_43_ = Class38_Sub7.aClass16_2705.method172(i ^ ~0x3e73, Class23_Sub4_Sub3.aClass9_2939.anApplet188);
				RSString class16_44_ = Class23_Sub4_Sub14.method322(new RSString[] { class16_42_, Class17.aClass16_306, class16, Class87_Sub3.aClass16_2825, class16_43_ }, -108);
				if (class16.method171(-61) == i) {
					class16_44_ = Class23_Sub4_Sub14.method322(new RSString[] { class16_44_, Class99.aClass16_1672 }, i + -48);
				} else {
					class16_44_ = Class23_Sub4_Sub14.method322(new RSString[] { class16_44_, Class34.aClass16_540, Class23_Sub13_Sub11.method729((byte) 86, 94608000000L + Class94.method1466(22624)), Class6.aClass16_141, Class79.method1361(-16309, 94608000L) }, -60);
				}
				Class23_Sub4_Sub14.method322(new RSString[] { Class69.aClass16_1217, class16_44_, Class5.aClass16_113 }, -55).method143(0, Class23_Sub4_Sub3.aClass9_2939.anApplet188);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}
	
	static final void method52(int i, long l) {
		anInt68++;
		if ((l ^ 0xffffffffffffffffL) != -1L) {
			if (Class25.anInt383 >= 100) {
				Class95.method1468(0, i ^ 0xffffffff, Class23_Sub4_Sub4.aClass16_2963, Class23_Sub4_Sub38.aClass16_3509);
			} else {
				RSString class16 = Class83.method1376(-1, l).method154((byte) 59);
				for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > (Class25.anInt383 ^ 0xffffffff); i_45_++) {
					if (l == Class23_Sub4_Sub30.aLongArray3383[i_45_]) {
						Class95.method1468(0, -1, Class23_Sub4_Sub14.method322(new RSString[] { class16, Class81.aClass16_1431 }, -19), Class23_Sub4_Sub38.aClass16_3509);
						return;
					}
				}
				for (int i_46_ = i; (i_46_ ^ 0xffffffff) > (Class45.anInt696 ^ 0xffffffff); i_46_++) {
					if ((l ^ 0xffffffffffffffffL) == (Class68.aLongArray1187[i_46_] ^ 0xffffffffffffffffL)) {
						Class95.method1468(0, -1, Class23_Sub4_Sub14.method322(new RSString[] { oa.aClass16_1258, class16, Class55.aClass16_864 }, -90), Class23_Sub4_Sub38.aClass16_3509);
						return;
					}
				}
				if (class16.method183(Class105.aClass38_Sub7_Sub2_1812.aClass16_4389, (byte) -49)) {
					Class95.method1468(0, -1, Class45.aClass16_693, Class23_Sub4_Sub38.aClass16_3509);
				} else {
					Class14.anInt284++;
					Class23_Sub4_Sub30.aLongArray3383[Class25.anInt383] = l;
					Applet_Sub1.aClass16Array10[Class25.anInt383++] = Class83.method1376(i + -1, l);
					Class75.anInt1372 = Class23_Sub10_Sub2.anInt3589;
					Class23_Sub7.outBuffer.method486(137, i + 2976);
					Class23_Sub7.outBuffer.method436(l, (byte) -123);
				}
			}
		}
	}
	
	static {
		aClass16_75 = Class38_Sub6.method1076((byte) 86, "M");
		anInt79 = 0;
		aClass16_77 = Class38_Sub6.method1076((byte) 86, "Bitte geben Sie Ihr Passwort ein)3");
		aClass16_80 = Class38_Sub6.method1076((byte) 86, "Close");
		aClass16_84 = Class38_Sub6.method1076((byte) 86, "Bad session id)3");
		aClass16_76 = aClass16_75;
		aClass16_83 = aClass16_75;
		aClass16_81 = aClass16_84;
		aClass16_73 = aClass16_80;
	}
}
