/* Class38_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38_Sub6 extends Class38
{
	static int anInt2607;
	private int anInt2608 = 0;
	static int anInt2609;
	private Class23_Sub13_Sub22 aClass23_Sub13_Sub22_2610;
	static int anInt2611;
	protected int anInt2612;
	static Class105_Sub1 aClass105_Sub1_2613;
	static int anInt2614;
	private int anInt2615 = -32768;
	static RSString aClass16_2616;
	private int anInt2617;
	static byte[] aByteArray2618 = { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
	protected int anInt2619;
	static int anInt2620;
	protected int anInt2621;
	protected boolean aBoolean2622;
	static int anInt2623;
	protected int anInt2624;
	private int anInt2625 = 0;
	protected int anInt2626;
	static int anInt2627;
	
	static final RSString method1075(int i, int i_0_) {
		RSString class16 = new RSString();
		class16.anInt1896 = i_0_;
		class16.aByteArray1906 = new byte[i];
		anInt2620++;
		return class16;
	}
	
	static final RSString method1076(byte b, String string) {
		anInt2609++;
		byte[] bs = string.getBytes();
		if (b != 86) {
			aClass105_Sub1_2613 = null;
		}
		int i = bs.length;
		int i_1_ = 0;
		RSString class16 = new RSString();
		class16.aByteArray1906 = new byte[i];
		while (i_1_ < i) {
			int i_2_ = bs[i_1_++] & 0xff;
			if (i_2_ <= 45 && i_2_ >= 40) {
				if (i <= i_1_) {
					break;
				}
				int i_3_ = bs[i_1_++] & 0xff;
				class16.aByteArray1906[class16.anInt1896++] = (byte) (-1720 + i_2_ * 43 + i_3_ + -48);
			} else if (i_2_ != 0) {
				class16.aByteArray1906[class16.anInt1896++] = (byte) i_2_;
			}
		}
		class16.method178((byte) -11);
		return class16.method175(112);
	}
	
	final void method995(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, long l) {
		anInt2627++;
		Class38_Sub1 class38_sub1 = method1078(50);
		if (class38_sub1 != null) {
			class38_sub1.method995(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, l);
			anInt2615 = class38_sub1.method999();
		}
	}
	
	public static void method1077(byte b) {
		aByteArray2618 = null;
		aClass16_2616 = null;
		aClass105_Sub1_2613 = null;
		if (b < 73) {
			method1077((byte) 57);
		}
	}
	
	private final Class38_Sub1 method1078(int i) {
		anInt2611++;
		Class23_Sub13_Sub17 class23_sub13_sub17 = Class23_Sub13_Sub21.method827(anInt2617, (byte) -125);
		Class38_Sub1 class38_sub1;
		if (aBoolean2622) {
			class38_sub1 = class23_sub13_sub17.method787(-1, (byte) 95);
		} else {
			class38_sub1 = class23_sub13_sub17.method787(anInt2608, (byte) 95);
		}
		if (class38_sub1 == null) {
			return null;
		}
		int i_11_ = 41 % ((-17 - i) / 32);
		return class38_sub1;
	}
	
	final int method999() {
		anInt2614++;
		return anInt2615;
	}
	
	final void method1079(int i, int i_12_) {
		anInt2607++;
		if (!aBoolean2622) {
			anInt2625 += i;
			if (i_12_ != -2) {
				method999();
			}
			while (aClass23_Sub13_Sub22_2610.anIntArray4204[anInt2608] < anInt2625) {
				anInt2625 -= aClass23_Sub13_Sub22_2610.anIntArray4204[anInt2608];
				anInt2608++;
				if ((anInt2608 ^ 0xffffffff) <= (aClass23_Sub13_Sub22_2610.anIntArray4203.length ^ 0xffffffff)) {
					aBoolean2622 = true;
					break;
				}
			}
		}
	}
	
	static final void method1080(int i, int i_13_, Class82[] class82s, int i_14_) {
		anInt2623++;
		if ((i_14_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
			int i_15_ = -1 + i;
			int i_16_ = (i_14_ + i) / 2;
			int i_17_ = 1 + i_14_;
			Class82 class82 = class82s[i_16_];
			class82s[i_16_] = class82s[i];
			class82s[i] = class82;
			while ((i_17_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) {
				boolean bool = true;
				do {
					i_17_--;
					for (int i_18_ = 0; i_18_ < 4; i_18_++) {
						int i_19_;
						int i_20_;
						if (Class88.anIntArray1507[i_18_] != 2) {
							if (Class88.anIntArray1507[i_18_] != 1) {
								if (Class88.anIntArray1507[i_18_] == 3) {
									i_20_ = !class82s[i_17_].aBoolean1450 ? 0 : 1;
									i_19_ = !class82.aBoolean1450 ? 0 : 1;
								} else {
									i_20_ = class82s[i_17_].anInt1451;
									i_19_ = class82.anInt1451;
								}
							} else {
								i_20_ = class82s[i_17_].anInt1447;
								i_19_ = class82.anInt1447;
								if (i_20_ == -1 && Class23_Sub20.anIntArray2401[i_18_] == 1) {
									i_20_ = 2001;
								}
								if (i_19_ == -1 && Class23_Sub20.anIntArray2401[i_18_] == 1) {
									i_19_ = 2001;
								}
							}
						} else {
							i_19_ = class82.anInt1448;
							i_20_ = class82s[i_17_].anInt1448;
						}
						if (i_20_ == i_19_) {
							if (i_18_ == 3) {
								bool = false;
							}
						} else {
							if ((Class23_Sub20.anIntArray2401[i_18_] != 1 || (i_19_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff)) && ((Class23_Sub20.anIntArray2401[i_18_] ^ 0xffffffff) != -1 || (i_19_ ^ 0xffffffff) >= (i_20_ ^ 0xffffffff))) {
								bool = false;
							}
							break;
						}
					}
				} while (bool);
				bool = true;
				do {
					i_15_++;
					for (int i_21_ = 0; i_21_ < 4; i_21_++) {
						int i_22_;
						int i_23_;
						if (Class88.anIntArray1507[i_21_] == 2) {
							i_23_ = class82s[i_15_].anInt1448;
							i_22_ = class82.anInt1448;
						} else if (Class88.anIntArray1507[i_21_] == 1) {
							i_22_ = class82.anInt1447;
							i_23_ = class82s[i_15_].anInt1447;
							if ((i_22_ ^ 0xffffffff) == 0 && Class23_Sub20.anIntArray2401[i_21_] == 1) {
								i_22_ = 2001;
							}
							if ((i_23_ ^ 0xffffffff) == 0 && Class23_Sub20.anIntArray2401[i_21_] == 1) {
								i_23_ = 2001;
							}
						} else if (Class88.anIntArray1507[i_21_] != 3) {
							i_23_ = class82s[i_15_].anInt1451;
							i_22_ = class82.anInt1451;
						} else {
							i_22_ = class82.aBoolean1450 ? 1 : 0;
							i_23_ = class82s[i_15_].aBoolean1450 ? 1 : 0;
						}
						if (i_23_ == i_22_) {
							if (i_21_ == 3) {
								bool = false;
							}
						} else {
							if ((Class23_Sub20.anIntArray2401[i_21_] != 1 || i_22_ <= i_23_) && ((Class23_Sub20.anIntArray2401[i_21_] ^ 0xffffffff) != -1 || (i_22_ ^ 0xffffffff) <= (i_23_ ^ 0xffffffff))) {
								bool = false;
							}
							break;
						}
					}
				} while (bool);
				if ((i_17_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) {
					Class82 class82_24_ = class82s[i_15_];
					class82s[i_15_] = class82s[i_17_];
					class82s[i_17_] = class82_24_;
				}
			}
			method1080(i, i_13_, class82s, i_17_);
			method1080(1 + i_17_, 0, class82s, i_14_);
		}
		if (i_13_ != 0) {
			method1080(-91, -77, null, -92);
		}
	}
	
	Class38_Sub6(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		aBoolean2622 = false;
		anInt2617 = i;
		anInt2626 = i_26_;
		anInt2624 = i_28_;
		anInt2619 = i_25_;
		anInt2621 = i_27_;
		anInt2612 = i_29_ + i_30_;
		int i_31_ = Class23_Sub13_Sub21.method827(anInt2617, (byte) -111).anInt4059;
		if (i_31_ == -1) {
			aBoolean2622 = true;
		} else {
			aBoolean2622 = false;
			aClass23_Sub13_Sub22_2610 = Class7.method90(i_31_, (byte) 97);
		}
	}
	
	static {
		aClass16_2616 = method1076((byte) 86, "Bitte starten Sie eine Mitgliedschaft");
	}
}
