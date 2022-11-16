/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class104
{
	private static RSString aClass16_1734;
	static int anInt1735;
	static int anInt1736;
	static RSString aClass16_1737 = Class38_Sub6.method1076((byte) 86, "Ung-Ultiger Benutzername");
	static RSString aClass16_1738;
	static RSString aClass16_1739 = Class38_Sub6.method1076((byte) 86, "<col=c0ff00>");
	static RSString aClass16_1740;
	static boolean[] aBooleanArray1741;
	protected int anInt1742;
	protected int anInt1743;
	protected int anInt1744;
	static int anInt1745;
	static int anInt1746;
	static int anInt1747;
	static RSString aClass16_1748;
	static int anInt1749;
	protected boolean aBoolean1750 = true;
	protected int anInt1751;
	protected int anInt1752;
	protected int anInt1753;
	
	static final boolean method1524(int i, int i_0_) {
		anInt1746++;
		if (i_0_ != 0) {
			return true;
		}
		if ((i < 97 || i > 122) && (i < 65 || i > 90)) {
			return false;
		}
		return true;
	}
	
	static final Class23_Sub2 method1525(int i, int i_1_, Class105 class105) {
		anInt1735++;
		byte[] bs = class105.method1532(i_1_, 18808);
		if (bs == null) {
			return null;
		}
		if (i != 15) {
			method1524(-25, -6);
		}
		return new Class23_Sub2(bs);
	}
	
	static final void method1526(int i, int i_2_, byte b, int i_3_, int i_4_, int i_5_, int i_6_) {
		Class50.anInt776 = 0;
		anInt1745++;
		for (int i_7_ = -1; i_7_ < Class23_Sub4_Sub18.anInt3191 + Class23_Sub4_Sub11.anInt3067; i_7_++) {
			Class38_Sub7 class38_sub7;
			if (i_7_ == -1) {
				class38_sub7 = Class105.aClass38_Sub7_Sub2_1812;
			} else if (Class23_Sub4_Sub11.anInt3067 <= i_7_) {
				class38_sub7 = Class31.aClass38_Sub7_Sub1Array483[Class23_Sub4_Sub17.anIntArray3170[-Class23_Sub4_Sub11.anInt3067 + i_7_]];
			} else {
				class38_sub7 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[Class23_Sub13_Sub3.anIntArray3700[i_7_]];
			}
			if (class38_sub7 != null && class38_sub7.method1082((byte) -108)) {
				if (class38_sub7 instanceof Class38_Sub7_Sub1) {
					Class23_Sub13_Sub20 class23_sub13_sub20 = ((Class38_Sub7_Sub1) class38_sub7).aClass23_Sub13_Sub20_4373;
					if (class23_sub13_sub20.anIntArray4153 != null) {
						class23_sub13_sub20 = class23_sub13_sub20.method813(674);
					}
					if (class23_sub13_sub20 == null) {
						continue;
					}
				}
				if (i_7_ >= Class23_Sub4_Sub11.anInt3067) {
					Class23_Sub13_Sub20 class23_sub13_sub20 = ((Class38_Sub7_Sub1) class38_sub7).aClass23_Sub13_Sub20_4373;
					if (class23_sub13_sub20.anIntArray4153 != null) {
						class23_sub13_sub20 = class23_sub13_sub20.method813(b ^ ~0x2e1);
					}
					if (class23_sub13_sub20.anInt4164 >= 0 && (class23_sub13_sub20.anInt4164 ^ 0xffffffff) > (Class106.aClass23_Sub13_Sub10Array1829.length ^ 0xffffffff)) {
						Class54.method1177(i >> 1, b + 68, i_3_, i_5_ >> 1, i_6_, class38_sub7, 15 + class38_sub7.method1081((byte) -41));
						if (Class23_Sub4_Sub6.anInt2989 > -1) {
							Class106.aClass23_Sub13_Sub10Array1829[class23_sub13_sub20.anInt4164].method694(Class23_Sub4_Sub6.anInt2989 + (i_4_ + -12), -30 + (Class97.anInt1645 + i_2_));
						}
					}
					Class10[] class10s = Class23_Sub27.aClass10Array2488;
					for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (class10s.length ^ 0xffffffff); i_8_++) {
						Class10 class10 = class10s[i_8_];
						if (class10 != null && class10.anInt203 == 1 && (class10.anInt209 ^ 0xffffffff) == (Class23_Sub4_Sub17.anIntArray3170[i_7_ + -Class23_Sub4_Sub11.anInt3067] ^ 0xffffffff) && Class89.anInt1511 % 20 < 10) {
							Class54.method1177(i >> 1, 0, i_3_, i_5_ >> 1, i_6_, class38_sub7, 15 + class38_sub7.method1081((byte) -41));
							if ((Class23_Sub4_Sub6.anInt2989 ^ 0xffffffff) < 0) {
								Class23_Sub13_Sub4.aClass23_Sub13_Sub10Array3718[class10.anInt205].method694(i_4_ + Class23_Sub4_Sub6.anInt2989 + -12, -28 + i_2_ + Class97.anInt1645);
							}
						}
					}
				} else {
					Class38_Sub7_Sub2 class38_sub7_sub2 = (Class38_Sub7_Sub2) class38_sub7;
					int i_9_ = 30;
					if ((class38_sub7_sub2.anInt4401 ^ 0xffffffff) != 0 || (class38_sub7_sub2.anInt4394 ^ 0xffffffff) != 0) {
						Class54.method1177(i >> 1, 0, i_3_, i_5_ >> 1, i_6_, class38_sub7, class38_sub7.method1081((byte) -41) - -15);
						if ((Class23_Sub4_Sub6.anInt2989 ^ 0xffffffff) < 0) {
							if ((class38_sub7_sub2.anInt4401 ^ 0xffffffff) != 0) {
								Class23_Sub25.aClass23_Sub13_Sub10Array2460[class38_sub7_sub2.anInt4401].method694(-12 + Class23_Sub4_Sub6.anInt2989 + i_4_, -i_9_ + (Class97.anInt1645 + i_2_));
								i_9_ += 25;
							}
							if (class38_sub7_sub2.anInt4394 != -1) {
								Class106.aClass23_Sub13_Sub10Array1829[class38_sub7_sub2.anInt4394].method694(-12 + Class23_Sub4_Sub6.anInt2989 + i_4_, i_2_ + (Class97.anInt1645 + -i_9_));
								i_9_ += 25;
							}
						}
					}
					if (i_7_ >= 0) {
						int i_10_ = 0;
						for (Class10[] class10s = Class23_Sub27.aClass10Array2488; (class10s.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
							Class10 class10 = class10s[i_10_];
							if (class10 != null && class10.anInt203 == 10 && (class10.anInt209 ^ 0xffffffff) == (Class23_Sub13_Sub3.anIntArray3700[i_7_] ^ 0xffffffff)) {
								Class54.method1177(i >> 1, 0, i_3_, i_5_ >> 1, i_6_, class38_sub7, class38_sub7.method1081((byte) -41) - -15);
								if ((Class23_Sub4_Sub6.anInt2989 ^ 0xffffffff) < 0) {
									Class23_Sub13_Sub4.aClass23_Sub13_Sub10Array3718[class10.anInt205].method694(i_4_ + (Class23_Sub4_Sub6.anInt2989 + -12), Class97.anInt1645 + i_2_ + -i_9_);
								}
							}
						}
					}
				}
				if (class38_sub7.aClass16_2670 != null && (Class23_Sub4_Sub11.anInt3067 <= i_7_ || (Class23_Sub13_Sub5.anInt3722 ^ 0xffffffff) == -1 || Class23_Sub13_Sub5.anInt3722 == 3 || Class23_Sub13_Sub5.anInt3722 == 1 && Class42.method1116(((Class38_Sub7_Sub2) class38_sub7).aClass16_4389, (byte) 56))) {
					Class54.method1177(i >> 1, b + 68, i_3_, i_5_ >> 1, i_6_, class38_sub7, class38_sub7.method1081((byte) -41));
					if (Class23_Sub4_Sub6.anInt2989 > -1 && Class50.anInt776 < Class55.anInt875) {
						Class55.anIntArray878[Class50.anInt776] = CacheIndex.aClass23_Sub13_Sub8_240.method649(class38_sub7.aClass16_2670) / 2;
						Class55.anIntArray877[Class50.anInt776] = CacheIndex.aClass23_Sub13_Sub8_240.anInt3811;
						Class55.anIntArray885[Class50.anInt776] = Class23_Sub4_Sub6.anInt2989;
						Class55.anIntArray883[Class50.anInt776] = Class97.anInt1645;
						Class55.anIntArray880[Class50.anInt776] = class38_sub7.anInt2713;
						Class55.anIntArray882[Class50.anInt776] = class38_sub7.anInt2701;
						Class55.anIntArray876[Class50.anInt776] = class38_sub7.anInt2639;
						Class55.aClass16Array884[Class50.anInt776] = class38_sub7.aClass16_2670;
						Class50.anInt776++;
					}
				}
				if ((Class89.anInt1511 ^ 0xffffffff) > (class38_sub7.anInt2638 ^ 0xffffffff)) {
					Class54.method1177(i >> 1, 0, i_3_, i_5_ >> 1, i_6_, class38_sub7, class38_sub7.method1081((byte) -41) + 15);
					if ((Class23_Sub4_Sub6.anInt2989 ^ 0xffffffff) < 0) {
						Class20.method222(Class23_Sub4_Sub6.anInt2989 + i_4_ + -15, -3 + i_2_ - -Class97.anInt1645, class38_sub7.anInt2708, 5, 65280);
						Class20.method222(class38_sub7.anInt2708 + -15 + (i_4_ + Class23_Sub4_Sub6.anInt2989), -3 + i_2_ + Class97.anInt1645, 30 - class38_sub7.anInt2708, 5, 16711680);
					}
				}
				for (int i_11_ = 0; i_11_ < 4; i_11_++) {
					if (class38_sub7.anIntArray2687[i_11_] > Class89.anInt1511) {
						Class54.method1177(i >> 1, 0, i_3_, i_5_ >> 1, i_6_, class38_sub7, class38_sub7.method1081((byte) -41) / 2);
						if (Class23_Sub4_Sub6.anInt2989 > -1) {
							if (i_11_ == 1) {
								Class97.anInt1645 -= 20;
							}
							if (i_11_ == 2) {
								Class23_Sub4_Sub6.anInt2989 -= 15;
								Class97.anInt1645 -= 10;
							}
							if (i_11_ == 3) {
								Class23_Sub4_Sub6.anInt2989 += 15;
								Class97.anInt1645 -= 10;
							}
							Class78_Sub2.aClass23_Sub13_Sub10Array2765[class38_sub7.anIntArray2652[i_11_]].method694(-12 + (Class23_Sub4_Sub6.anInt2989 + i_4_), Class97.anInt1645 + (i_2_ - 12));
							client.aClass23_Sub13_Sub8_1978.method666(Class23_Sub4_Sub23.method360((byte) -9, class38_sub7.anIntArray2669[i_11_]), i_4_ + Class23_Sub4_Sub6.anInt2989 - 1, 3 + i_2_ - -Class97.anInt1645, 16777215, 0);
						}
					}
				}
			}
		}
		int i_12_ = 0;
		if (b != -68) {
			method1528(-112, 0, 116, -22, -73, true, 69);
		}
		for (/**/; (i_12_ ^ 0xffffffff) > (Class50.anInt776 ^ 0xffffffff); i_12_++) {
			int i_13_ = Class55.anIntArray883[i_12_];
			int i_14_ = Class55.anIntArray885[i_12_];
			int i_15_ = Class55.anIntArray877[i_12_];
			boolean bool = true;
			int i_16_ = Class55.anIntArray878[i_12_];
			while (bool) {
				bool = false;
				for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_17_++) {
					if ((i_13_ + 2 ^ 0xffffffff) < (-Class55.anIntArray877[i_17_] + Class55.anIntArray883[i_17_] ^ 0xffffffff) && (i_13_ + -i_15_ ^ 0xffffffff) > (2 + Class55.anIntArray883[i_17_] ^ 0xffffffff) && (Class55.anIntArray878[i_17_] + Class55.anIntArray885[i_17_] ^ 0xffffffff) < (i_14_ + -i_16_ ^ 0xffffffff) && -Class55.anIntArray878[i_17_] + Class55.anIntArray885[i_17_] < i_16_ + i_14_ && Class55.anIntArray883[i_17_] - Class55.anIntArray877[i_17_] < i_13_) {
						i_13_ = Class55.anIntArray883[i_17_] + -Class55.anIntArray877[i_17_];
						bool = true;
					}
				}
			}
			Class23_Sub4_Sub6.anInt2989 = Class55.anIntArray885[i_12_];
			Class97.anInt1645 = Class55.anIntArray883[i_12_] = i_13_;
			RSString class16 = Class55.aClass16Array884[i_12_];
			if ((Class14.anInt275 ^ 0xffffffff) != -1) {
				CacheIndex.aClass23_Sub13_Sub8_240.method666(class16, Class23_Sub4_Sub6.anInt2989 + i_4_, Class97.anInt1645 + i_2_, 16776960, 0);
			} else {
				int i_18_ = 16776960;
				if (Class55.anIntArray880[i_12_] < 6) {
					i_18_ = Class23_Sub13_Sub8_Sub1.anIntArray4496[Class55.anIntArray880[i_12_]];
				}
				if (Class55.anIntArray880[i_12_] == 6) {
					i_18_ = Class23_Sub13_Sub26.anInt4297 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Class55.anIntArray880[i_12_] == 7) {
					i_18_ = Class23_Sub13_Sub26.anInt4297 % 20 >= 10 ? 65535 : 255;
				}
				if (Class55.anIntArray880[i_12_] == 8) {
					i_18_ = Class23_Sub13_Sub26.anInt4297 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Class55.anIntArray880[i_12_] == 9) {
					int i_19_ = -Class55.anIntArray876[i_12_] + 150;
					if (i_19_ < 50) {
						i_18_ = 1280 * i_19_ + 16711680;
					} else if (i_19_ >= 100) {
						if (i_19_ < 150) {
							i_18_ = 65280 + (-500 + i_19_ * 5);
						}
					} else {
						i_18_ = 16776960 + -((-50 + i_19_) * 327680);
					}
				}
				if (Class55.anIntArray880[i_12_] == 10) {
					int i_20_ = 150 - Class55.anIntArray876[i_12_];
					if (i_20_ < 50) {
						i_18_ = 16711680 + i_20_ * 5;
					} else if (i_20_ < 100) {
						i_18_ = 16711935 - (i_20_ * 327680 - 16384000);
					} else if (i_20_ < 150) {
						i_18_ = -((i_20_ + -100) * 5) + (-32768000 + 327680 * i_20_) + 255;
					}
				}
				if (Class55.anIntArray880[i_12_] == 11) {
					int i_21_ = -Class55.anIntArray876[i_12_] + 150;
					if (i_21_ < 50) {
						i_18_ = -(327685 * i_21_) + 16777215;
					} else if (i_21_ >= 100) {
						if (i_21_ < 150) {
							i_18_ = 16777215 - (i_21_ * 327680 - 32768000);
						}
					} else {
						i_18_ = i_21_ * 327685 + -16318970;
					}
				}
				if (Class55.anIntArray882[i_12_] == 0) {
					CacheIndex.aClass23_Sub13_Sub8_240.method666(class16, Class23_Sub4_Sub6.anInt2989 + i_4_, i_2_ + Class97.anInt1645, i_18_, 0);
				}
				if (Class55.anIntArray882[i_12_] == 1) {
					CacheIndex.aClass23_Sub13_Sub8_240.method657(class16, i_4_ + Class23_Sub4_Sub6.anInt2989, i_2_ + Class97.anInt1645, i_18_, 0, Class23_Sub13_Sub26.anInt4297);
				}
				if (Class55.anIntArray882[i_12_] == 2) {
					CacheIndex.aClass23_Sub13_Sub8_240.method655(class16, Class23_Sub4_Sub6.anInt2989 + i_4_, Class97.anInt1645 + i_2_, i_18_, 0, Class23_Sub13_Sub26.anInt4297);
				}
				if (Class55.anIntArray882[i_12_] == 3) {
					CacheIndex.aClass23_Sub13_Sub8_240.method670(class16, i_4_ + Class23_Sub4_Sub6.anInt2989, i_2_ + Class97.anInt1645, i_18_, 0, Class23_Sub13_Sub26.anInt4297, 150 + -Class55.anIntArray876[i_12_]);
				}
				if (Class55.anIntArray882[i_12_] == 4) {
					int i_22_ = (150 - Class55.anIntArray876[i_12_]) * (CacheIndex.aClass23_Sub13_Sub8_240.method649(class16) + 100) / 150;
					Class20.method204(i_4_ + (Class23_Sub4_Sub6.anInt2989 + -50), i_2_, 50 + Class23_Sub4_Sub6.anInt2989 + i_4_, i_2_ + i);
					CacheIndex.aClass23_Sub13_Sub8_240.method650(class16, 50 + (Class23_Sub4_Sub6.anInt2989 + i_4_) + -i_22_, i_2_ + Class97.anInt1645, i_18_, 0);
					Class20.method210(i_4_, i_2_, i_5_ + i_4_, i + i_2_);
				}
				if (Class55.anIntArray882[i_12_] == 5) {
					int i_23_ = 0;
					int i_24_ = -Class55.anIntArray876[i_12_] + 150;
					Class20.method204(i_4_, -1 + Class97.anInt1645 + (i_2_ - CacheIndex.aClass23_Sub13_Sub8_240.anInt3811), i_4_ + i_5_, 5 + Class97.anInt1645 + i_2_);
					if (i_24_ >= 25) {
						if (i_24_ > 125) {
							i_23_ = i_24_ - 125;
						}
					} else {
						i_23_ = i_24_ - 25;
					}
					CacheIndex.aClass23_Sub13_Sub8_240.method666(class16, i_4_ - -Class23_Sub4_Sub6.anInt2989, Class97.anInt1645 + i_2_ - -i_23_, i_18_, 0);
					Class20.method210(i_4_, i_2_, i_4_ - -i_5_, i_2_ + i);
				}
			}
		}
	}
	
	public static void method1527(boolean bool) {
		if (bool != false) {
			method1527(false);
		}
		aClass16_1738 = null;
		aClass16_1748 = null;
		aClass16_1739 = null;
		aClass16_1737 = null;
		aClass16_1734 = null;
		aClass16_1740 = null;
		aBooleanArray1741 = null;
	}
	
	static final void method1528(int i, int i_25_, int i_26_, int i_27_, int i_28_, boolean bool, int i_29_) {
		if (-i_29_ + i_28_ >= Class23_Sub13_Sub6.anInt3728 && Class35.anInt554 >= i_28_ + i_29_ && Class88.anInt1503 <= -i_29_ + i_25_ && i_25_ + i_29_ <= Class23_Sub4_Sub33.anInt3435) {
			Class106.method1577(i, i_25_, i_26_, i_27_, -80, i_28_, i_29_);
		} else {
			Class23_Sub19.method882((byte) 83, i_26_, i_25_, i, i_28_, i_27_, i_29_);
		}
		if (bool != true) {
			aBooleanArray1741 = null;
		}
		anInt1749++;
	}
	
	static final void method1529(int i) {
		anInt1736++;
		Class23_Sub20.aClass23_Sub13_Sub10_Sub1_2402.method705(0, 0);
		Class23_Sub7.aClass23_Sub13_Sub10_Sub1_2216.method705(382, 0);
		Class69.aClass43_1220.method1119(-(Class69.aClass43_1220.anInt669 / 2) + 382, 18);
		if (i > -97) {
			aClass16_1738 = null;
		}
	}
	
	static final void method1530(int i) {
		Class23_Sub13_Sub10.aByteArrayArrayArray3872 = null;
		Class23_Sub4_Sub3.anIntArray2947 = null;
		Class38_Sub7.aByteArrayArrayArray2690 = null;
		anInt1747++;
		Class23_Sub4_Sub30.aByteArrayArrayArray3385 = null;
		Class23_Sub13_Sub14.anIntArray4016 = null;
		Class23_Sub4_Sub22.aByteArrayArrayArray3257 = null;
		if (i >= -62) {
			aClass16_1734 = null;
		}
		Class23_Sub4_Sub18.aByteArrayArrayArray3198 = null;
		Class23_Sub12.anIntArray2302 = null;
		Class38_Sub3.anIntArray2515 = null;
		Class54.anIntArrayArrayArray861 = null;
		Class58.anIntArray910 = null;
	}
	
	static int method1531(int i, int i_30_) {
		return i ^ i_30_;
	}
	
	Class104(int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, boolean bool) {
		anInt1752 = i;
		anInt1753 = i_33_;
		anInt1751 = i_34_;
		anInt1744 = i_31_;
		anInt1743 = i_32_;
		anInt1742 = i_35_;
		aBoolean1750 = bool;
	}
	
	static {
		aClass16_1738 = Class38_Sub6.method1076((byte) 86, "<col=00ff80>");
		aClass16_1734 = Class38_Sub6.method1076((byte) 86, "Allocating memory");
		aClass16_1740 = Class38_Sub6.method1076((byte) 86, "Speicher wird zugewiesen)3");
		aBooleanArray1741 = new boolean[200];
		aClass16_1748 = aClass16_1734;
	}
}
