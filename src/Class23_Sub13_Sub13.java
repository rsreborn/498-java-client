/* Class23_Sub13_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub13 extends Class23_Sub13
{
	private oa anOa3983;
	static int anInt3984;
	protected int anInt3985;
	static int anInt3986;
	static Class43[] aClass43Array3987;
	private RSString aClass16_3988 = Class73.aClass16_1322;
	static RSString aClass16_3989;
	static int anInt3990;
	static int anInt3991;
	static int anInt3992;
	private static RSString aClass16_3993 = Class38_Sub6.method1076((byte) 86, "Account locked as we suspect it has been stolen)3");
	private int anInt3994;
	static int anInt3995;
	static int[] anIntArray3996;
	static int anInt3997;
	static int anInt3998;
	protected int anInt3999;
	static int anInt4000;
	
	static final void method757(int i, int i_0_, boolean bool) {
		anInt3991++;
		if (Class17.method189(-10924, i)) {
			if (bool != false) {
				aClass16_3993 = null;
			}
			Class71_Sub2_Sub1.method1282(0, Class23_Sub4_Sub28.aClass64ArrayArray3350[i], i_0_);
		}
	}
	
	private final void method758(Buffer class23_sub5, int i, int i_1_) {
		if (i_1_ != 1) {
			if (i_1_ != 2) {
				if (i_1_ == 3) {
					aClass16_3988 = class23_sub5.method426(2);
				} else if (i_1_ != 4) {
					if (i_1_ == 5 || i_1_ == 6) {
						int i_2_ = class23_sub5.method476((byte) -125);
						anOa3983 = new oa(RuntimeException_Sub1.method1586((byte) -26, i_2_));
						for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
							int i_4_ = class23_sub5.method472(i ^ 0x67);
							Class23 class23;
							if (i_1_ != 5) {
								class23 = new Class23_Sub20(class23_sub5.method472(104));
							} else {
								class23 = new Class23_Sub26(class23_sub5.method426(i ^ 0x7));
							}
							anOa3983.a(class23, (byte) -14, (long) i_4_);
						}
					}
				} else {
					anInt3994 = class23_sub5.method472(i + -30);
				}
			} else {
				anInt3985 = class23_sub5.method461(i + -1797813757);
			}
		} else {
			anInt3999 = class23_sub5.method461(-1797813752);
		}
		anInt4000++;
		if (i != 5) {
			method757(-120, 16, false);
		}
	}
	
	static final void method759(Class52 class52, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool) {
		int i_10_ = class52.anIntArray824.length;
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			int i_12_ = class52.anIntArray824[i_11_] - Class17.anInt311;
			int i_13_ = class52.anIntArray825[i_11_] - Class61.anInt956;
			int i_14_ = class52.anIntArray820[i_11_] - Class23_Sub4_Sub23.anInt3281;
			int i_15_ = i_14_ * i_6_ + i_12_ * i_7_ >> 16;
			i_14_ = i_14_ * i_7_ - i_12_ * i_6_ >> 16;
			i_12_ = i_15_;
			i_15_ = i_13_ * i_5_ - i_14_ * i >> 16;
			i_14_ = i_13_ * i + i_14_ * i_5_ >> 16;
			i_13_ = i_15_;
			if (i_14_ < 50) {
				return;
			}
			if (class52.anIntArray822 != null) {
				Class52.anIntArray821[i_11_] = i_12_;
				Class52.anIntArray812[i_11_] = i_13_;
				Class52.anIntArray814[i_11_] = i_14_;
			}
			Class52.anIntArray830[i_11_] = Class76.anInt1383 + (i_12_ << 9) / i_14_;
			Class52.anIntArray818[i_11_] = Class76.anInt1392 + (i_13_ << 9) / i_14_;
		}
		Class76.anInt1390 = 0;
		i_10_ = class52.anIntArray811.length;
		for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
			int i_17_ = class52.anIntArray811[i_16_];
			int i_18_ = class52.anIntArray819[i_16_];
			int i_19_ = class52.anIntArray810[i_16_];
			int i_20_ = Class52.anIntArray830[i_17_];
			int i_21_ = Class52.anIntArray830[i_18_];
			int i_22_ = Class52.anIntArray830[i_19_];
			int i_23_ = Class52.anIntArray818[i_17_];
			int i_24_ = Class52.anIntArray818[i_18_];
			int i_25_ = Class52.anIntArray818[i_19_];
			if ((i_20_ - i_21_) * (i_25_ - i_24_) - (i_23_ - i_24_) * (i_22_ - i_21_) > 0) {
				if (Class23_Sub13_Sub9.aBoolean3858 && Class23_Sub13_Sub4.method623(Class23_Sub4_Sub11.anInt3071 + Class76.anInt1383, Class38_Sub2.anInt2503 + Class76.anInt1392, i_23_, i_24_, i_25_, i_20_, i_21_, i_22_)) {
					Class87_Sub1.anInt2788 = i_8_;
					Class23_Sub10_Sub2.anInt3595 = i_9_;
				}
				if (!bool) {
					Class76.aBoolean1398 = false;
					if (i_20_ < 0 || i_21_ < 0 || i_22_ < 0 || i_20_ > Class76.anInt1384 || i_21_ > Class76.anInt1384 || i_22_ > Class76.anInt1384) {
						Class76.aBoolean1398 = true;
					}
					if (class52.anIntArray822 == null || class52.anIntArray822[i_16_] == -1) {
						if (class52.anIntArray813[i_16_] != 12345678) {
							Class76.method1333(i_23_, i_24_, i_25_, i_20_, i_21_, i_22_, class52.anIntArray813[i_16_], class52.anIntArray828[i_16_], class52.anIntArray816[i_16_]);
						}
					} else if (!Class23_Sub24.aBoolean2446) {
						if (class52.aBoolean817) {
							Class76.method1327(i_23_, i_24_, i_25_, i_20_, i_21_, i_22_, class52.anIntArray813[i_16_], class52.anIntArray828[i_16_], class52.anIntArray816[i_16_], Class52.anIntArray821[0], Class52.anIntArray821[1], Class52.anIntArray821[3], Class52.anIntArray812[0], Class52.anIntArray812[1], Class52.anIntArray812[3], Class52.anIntArray814[0], Class52.anIntArray814[1], Class52.anIntArray814[3], class52.anIntArray822[i_16_]);
						} else {
							Class76.method1327(i_23_, i_24_, i_25_, i_20_, i_21_, i_22_, class52.anIntArray813[i_16_], class52.anIntArray828[i_16_], class52.anIntArray816[i_16_], Class52.anIntArray821[i_17_], Class52.anIntArray821[i_18_], Class52.anIntArray821[i_19_], Class52.anIntArray812[i_17_], Class52.anIntArray812[i_18_], Class52.anIntArray812[i_19_], Class52.anIntArray814[i_17_], Class52.anIntArray814[i_18_], Class52.anIntArray814[i_19_], class52.anIntArray822[i_16_]);
						}
					} else {
						int i_26_ = Class76.anInterface1_1399.method4(class52.anIntArray822[i_16_], (byte) 50);
						Class76.method1333(i_23_, i_24_, i_25_, i_20_, i_21_, i_22_, Class23_Sub13_Sub16.method782(i_26_, class52.anIntArray813[i_16_]), Class23_Sub13_Sub16.method782(i_26_, class52.anIntArray828[i_16_]), Class23_Sub13_Sub16.method782(i_26_, class52.anIntArray816[i_16_]));
					}
				}
			}
		}
	}
	
	final int method760(byte b, int i) {
		anInt3997++;
		if (anOa3983 == null) {
			return anInt3994;
		}
		if (b >= -40) {
			method760((byte) -74, -1);
		}
		Class23_Sub20 class23_sub20 = (Class23_Sub20) anOa3983.a((byte) -114, (long) i);
		if (class23_sub20 == null) {
			return anInt3994;
		}
		return class23_sub20.anInt2394;
	}
	
	final void method761(byte b, Buffer class23_sub5) {
		if (b <= 39) {
			aClass16_3993 = null;
		}
		for (;;) {
			int i = class23_sub5.method461(-1797813752);
			if (i == 0) {
				break;
			}
			method758(class23_sub5, 5, i);
		}
		anInt3995++;
	}
	
	static final int method762(byte b, int i, int i_27_, int i_28_) {
		if (i > 243) {
			i_28_ >>= 4;
		} else if (i <= 217) {
			if (i <= 192) {
				if (i > 179) {
					i_28_ >>= 1;
				}
			} else {
				i_28_ >>= 2;
			}
		} else {
			i_28_ >>= 3;
		}
		if (b != 69) {
			return -53;
		}
		anInt3984++;
		return (i >> 1) + ((i_27_ >> 2 << 10) + (i_28_ >> 5 << 7));
	}
	
	public static void method763(int i) {
		aClass43Array3987 = null;
		if (i != 0) {
			aClass43Array3987 = null;
		}
		anIntArray3996 = null;
		aClass16_3989 = null;
		aClass16_3993 = null;
	}
	
	final RSString method764(int i, int i_29_) {
		anInt3998++;
		if (anOa3983 == null) {
			return aClass16_3988;
		}
		Class23_Sub26 class23_sub26 = (Class23_Sub26) anOa3983.a((byte) 122, (long) i);
		if (i_29_ > -81) {
			return null;
		}
		if (class23_sub26 == null) {
			return aClass16_3988;
		}
		return class23_sub26.aClass16_2472;
	}
	
	static {
		aClass16_3989 = aClass16_3993;
	}
}
