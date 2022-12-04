/* Class105_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class105_Sub1 extends Class105
{
	private volatile boolean[] aBooleanArray2852;
	static int anInt2853;
	static int anInt2854;
	static int anInt2855;
	static RSString aClass16_2856 = Class38_Sub6.method1076((byte) 86, ")1j");
	private int anInt2857;
	private int anInt2858;
	private int anInt2859;
	private volatile boolean aBoolean2860 = false;
	static int anInt2861;
	static RSString aClass16_2862;
	static int anInt2863;
	private boolean aBoolean2864 = false;
	static int anInt2865;
	private Class13 aClass13_2866;
	static RSString aClass16_2867;
	static int anInt2868;
	static RSString aClass16_2869;
	static int anInt2870;
	static int[] anIntArray2871;
	static int anInt2872;
	private static RSString aClass16_2873 = Class38_Sub6.method1076((byte) 86, "Started 3d library");
	static int anInt2874;
	private Class13 aClass13_2875;
	private int anInt2876 = -1;
	static RSString aClass16_2877;
	static int anInt2878;
	
	Class105_Sub1(Class13 class13, Class13 class13_0_, int i, boolean bool, boolean bool_1_, boolean bool_2_) {
		super(bool, bool_1_);
		anInt2859 = i;
		aBoolean2864 = bool_2_;
		aClass13_2875 = class13;
		aClass13_2866 = class13_0_;
		Class23_Sub4_Sub10.method302(anInt2859, 5, this);
	}
	
	final void method1547(int i, byte b) {
		anInt2878++;
		if (this.method1564(i, -1)) {
			Class23_Sub13_Sub15.method777(-5, i, anInt2859);
			if (b <= 64) {
				method1552(false, -7);
			}
		}
	}
	
	final void method1566(int i, int i_3_, int i_4_) {
		anInt2857 = i_4_;
		anInt2858 = i;
		anInt2872++;
		if (aClass13_2866 == null) {
			Class28.method939(anInt2857, 6024, true, anInt2859, (byte) 0, this, 255);
		} else {
			Class23_Sub14.method865(aClass13_2866, 122, anInt2859, this);
		}
		if (i_3_ < 26) {
			method1573(true);
		}
	}
	
	public static void method1567(boolean bool) {
		aClass16_2877 = null;
		aClass16_2869 = null;
		aClass16_2862 = null;
		if (bool != false) {
			aClass16_2867 = null;
		}
		anIntArray2871 = null;
		aClass16_2867 = null;
		aClass16_2873 = null;
		aClass16_2856 = null;
	}
	
	static final void method1568(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		Class23_Sub13_Sub26.anInt4297++;
		Class23_Sub4_Sub26.method378((byte) 107, true);
		Class23_Sub13_Sub25.method854((byte) 14, true);
		anInt2868++;
		Class23_Sub4_Sub26.method378((byte) 71, false);
		Class23_Sub13_Sub25.method854((byte) 84, false);
		Class65.method1231(60);
		Class50.method1159((byte) 32);
		if (!Buffer.aBoolean2159) {
			int i_9_ = Class23_Sub4_Sub37.anInt3492;
			int i_10_ = 0x7ff & Class35.anInt550 + Class23_Sub4_Sub2.anInt2923;
			if (i_9_ < Class24.anInt365 / 256) {
				i_9_ = Class24.anInt365 / 256;
			}
			if (Class23_Sub5_Sub1.aBooleanArray3531[4] && 128 + Class79.anIntArray1890[4] > i_9_) {
				i_9_ = Class79.anIntArray1890[4] + 128;
			}
			Class59.method1195(Class2.anInt82, i_9_, -50 + Class23_Sub4_Sub22.method359(ItemDefinition.anInt3916, Class105.aClass38_Sub7_Sub2_1812.anInt2674, Class105.aClass38_Sub7_Sub2_1812.anInt2659, (byte) -33), i_10_, 3 * i_9_ + 600, -31127, Class23_Sub4_Sub26.anInt3318, i_6_);
		}
		int i_11_;
		if (Buffer.aBoolean2159) {
			i_11_ = Class7.method92(false);
		} else {
			i_11_ = Class40.method1107(-175122297);
		}
		int i_12_ = Class23_Sub13_Sub1.anInt3673;
		int i_13_ = Class23_Sub23.anInt2424;
		int i_14_ = Class53.anInt838;
		int i_15_ = Class10.anInt208;
		int i_16_ = Class23_Sub4_Sub17.anInt3178;
		for (int i_17_ = 0; i_17_ < 5; i_17_++) {
			if (Class23_Sub5_Sub1.aBooleanArray3531[i_17_]) {
				int i_18_ = (int) ((double) (1 + Class38_Sub5.anIntArray2597[i_17_] * 2) * Math.random() - (double) Class38_Sub5.anIntArray2597[i_17_] + Math.sin((double) Class23_Sub4_Sub14.anIntArray3128[i_17_] * ((double) Class78_Sub2.anIntArray2768[i_17_] / 100.0)) * (double) Class79.anIntArray1890[i_17_]);
				if (i_17_ == 2) {
					Class53.anInt838 += i_18_;
				}
				if (i_17_ == 3) {
					Class10.anInt208 = i_18_ + Class10.anInt208 & 0x7ff;
				}
				if (i_17_ == 0) {
					Class23_Sub13_Sub1.anInt3673 += i_18_;
				}
				if (i_17_ == 4) {
					Class23_Sub4_Sub17.anInt3178 += i_18_;
					if (Class23_Sub4_Sub17.anInt3178 < 128) {
						Class23_Sub4_Sub17.anInt3178 = 128;
					}
					if (Class23_Sub4_Sub17.anInt3178 > 383) {
						Class23_Sub4_Sub17.anInt3178 = 383;
					}
				}
				if (i_17_ == 1) {
					Class23_Sub23.anInt2424 += i_18_;
				}
			}
		}
		Class20.method210(i_5_, i_7_, i_5_ - -i, i_7_ - -i_6_);
		Class76.method1318();
		int i_19_ = Class102.anInt1701;
		int i_20_ = Class23_Sub4_Sub14.anInt3126;
		if (i_5_ > i_20_ || (i_20_ ^ 0xffffffff) <= (i_5_ - -i ^ 0xffffffff) || i_19_ < i_7_ || (i_19_ ^ 0xffffffff) <= (i_6_ + i_7_ ^ 0xffffffff)) {
			Class99.aBoolean1673 = false;
			oa.anInt1243 = 0;
		} else {
			int i_21_ = Class46.anInt715;
			oa.anInt1243 = 0;
			Class99.aBoolean1673 = true;
			int i_22_ = Class23_Sub4_Sub7.anInt3023;
			int i_23_ = Class23_Sub4_Sub35.anInt3459;
			client.anInt1973 = (Class102.anInt1701 + -i_7_) * (-i_23_ + i_22_) / i_6_ - -i_23_;
			int i_24_ = Class21.anInt335;
			Class23_Sub13_Sub10.anInt3878 = (i_24_ - i_21_) * (-i_5_ + Class23_Sub4_Sub14.anInt3126) / i + i_21_;
		}
		Class48.method1150((byte) 97);
		Class20.method222(i_5_, i_7_, i, i_6_, 0);
		Class42.method1114(Class23_Sub13_Sub1.anInt3673, Class23_Sub23.anInt2424, Class53.anInt838, Class23_Sub4_Sub17.anInt3178, Class10.anInt208, i_11_, null, null, null, null, null, null, 0, (byte) 0);
		Class48.method1150((byte) 123);
		Class23_Sub4_Sub36.method414();
		Class104.method1526(i_6_, i_7_, (byte) -68, 256, i_5_, i, 256);
		Class27.method927(256, i_7_, i_5_, i, i_6_, -2265, 256);
		((Class86) Class76.anInterface1_1399).method1400(Class23_Sub25.anInt2459, true);
		Class23_Sub13_Sub4.method621(i, i_7_, i_6_, -2, i_5_);
		Class23_Sub13_Sub1.anInt3673 = i_12_;
		Class23_Sub4_Sub17.anInt3178 = i_16_;
		Class10.anInt208 = i_15_;
		Class23_Sub23.anInt2424 = i_13_;
		Class53.anInt838 = i_14_;
		if (Class23_Sub4_Sub32.aBoolean3413 && (Class97.method1487(true, false, false) ^ 0xffffffff) == -1) {
			Class23_Sub4_Sub32.aBoolean3413 = false;
		}
		if (Class23_Sub4_Sub32.aBoolean3413) {
			Class20.method222(i_5_, i_7_, i, i_6_, 0);
			Class23_Sub4_Sub29.method386(Class64.aClass16_1139, false, false);
		}
		if (!Class23_Sub4_Sub32.aBoolean3413 && !Class53.aBoolean840 && (i_20_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff) && (i_20_ ^ 0xffffffff) > (i_5_ + i ^ 0xffffffff) && (i_19_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff) && i_19_ < i_7_ - -i_6_) {
			Class23_Sub4_Sub2.method275(i_7_, i_6_, i_20_, i_5_, (byte) 37, i, i_19_);
		}
		if (i_8_ != 1920) {
			aClass16_2877 = null;
		}
	}
	
	final void method1569(boolean bool, int i, Class13 class13, byte[] bs, int i_25_) {
		anInt2863++;
		int i_26_ = -41 / ((-21 - i_25_) / 59);
		if (class13 != aClass13_2866) {
			if (!bool && i == anInt2876) {
				aBoolean2860 = true;
			}
			if (bs == null || bs.length <= 2) {
				aBooleanArray2852[i] = false;
				if (aBoolean2864 || bool) {
					Class28.method939(anIntArray1781[i], 6024, bool, i, (byte) 2, this, anInt2859);
				}
			} else {
				Class23_Sub4_Sub27.aCRC32_3337.reset();
				Class23_Sub4_Sub27.aCRC32_3337.update(bs, 0, -2 + bs.length);
				int i_27_ = (int) Class23_Sub4_Sub27.aCRC32_3337.getValue();
				int i_28_ = (0xff00 & bs[bs.length + -2] << 8) - -(bs[bs.length + -1] & 0xff);
				if (anIntArray1781[i] != i_27_ || (i_28_ ^ 0xffffffff) != (anIntArray1787[i] ^ 0xffffffff)) {
					aBooleanArray2852[i] = false;
					if (aBoolean2864 || bool) {
						Class28.method939(anIntArray1781[i], 6024, bool, i, (byte) 2, this, anInt2859);
					}
				} else {
					aBooleanArray2852[i] = true;
					if (bool) {
						anObjectArray1786[i] = Class23_Sub13_Sub12.method746(bs, true, false);
					}
				}
			}
		} else {
			if (aBoolean2860) {
				throw new RuntimeException();
			}
			if (bs == null) {
				Class28.method939(anInt2857, 6024, true, anInt2859, (byte) 0, this, 255);
			} else {
				Class23_Sub4_Sub27.aCRC32_3337.reset();
				Class23_Sub4_Sub27.aCRC32_3337.update(bs, 0, bs.length);
				int i_29_ = (int) Class23_Sub4_Sub27.aCRC32_3337.getValue();
				if ((i_29_ ^ 0xffffffff) != (anInt2857 ^ 0xffffffff)) {
					Class28.method939(anInt2857, 6024, true, anInt2859, (byte) 0, this, 255);
				} else {
					Buffer class23_sub5;
					try {
						class23_sub5 = new Buffer(Class69.method1258(0, bs));
					} catch (RuntimeException runtimeexception) {
						Class28.method939(anInt2857, 6024, true, anInt2859, (byte) 0, this, 255);
						return;
					}
					int i_30_ = class23_sub5.readUByte();
					if (i_30_ != 5 && i_30_ != 6) {
						Class28.method939(anInt2857, 6024, true, anInt2859, (byte) 0, this, 255);
					} else {
						int i_31_ = 0;
						if (i_30_ >= 6) {
							i_31_ = class23_sub5.readUIntBE();
						}
						if ((anInt2858 ^ 0xffffffff) != (i_31_ ^ 0xffffffff)) {
							Class28.method939(anInt2857, 6024, true, anInt2859, (byte) 0, this, 255);
						} else {
							this.method1551((byte) -98, bs);
							method1573(true);
						}
					}
				}
			}
		}
	}
	
	final void method1570(boolean bool, int i, boolean bool_32_, boolean bool_33_, byte[] bs) {
		if (bool_32_ != true) {
			method1572(112);
		}
		anInt2853++;
		if (!bool) {
			bs[-2 + bs.length] = (byte) (anIntArray1787[i] >> 8);
			bs[bs.length + -1] = (byte) anIntArray1787[i];
			if (aClass13_2875 != null) {
				Class63.method1212(0, i, aClass13_2875, bs);
				aBooleanArray2852[i] = true;
			}
			if (bool_33_) {
				anObjectArray1786[i] = Class23_Sub13_Sub12.method746(bs, true, false);
			}
		} else {
			if (aBoolean2860) {
				throw new RuntimeException();
			}
			if (aClass13_2866 != null) {
				Class63.method1212(0, anInt2859, aClass13_2866, bs);
			}
			this.method1551((byte) -98, bs);
			method1573(bool_32_);
		}
	}
	
	final int method1571(int i) {
		anInt2855++;
		if (i != 31890) {
			aBoolean2860 = true;
		}
		if (aBoolean2860) {
			return 100;
		}
		if (anObjectArray1786 != null) {
			return 99;
		}
		int i_34_ = Class23_Sub13_Sub15.method773(anInt2859, 255, i + -31889);
		if (i_34_ >= 100) {
			i_34_ = 99;
		}
		return i_34_;
	}
	
	static final boolean method1572(int i) {
		anInt2874++;
		synchronized (Class39.aClass32_609) {
			if (Class103.anInt1724 == Class23_Sub4_Sub7.anInt3011) {
				return false;
			}
			Class88.anInt1506 = Class38.anIntArray596[Class103.anInt1724];
			if (i != 25014) {
				return false;
			}
			Class53.anInt833 = Class23_Sub13_Sub5.anIntArray3719[Class103.anInt1724];
			Class103.anInt1724 = 0x7f & 1 + Class103.anInt1724;
			return true;
		}
	}
	
	private final void method1573(boolean bool) {
		aBooleanArray2852 = new boolean[anObjectArray1786.length];
		for (int i = 0; (i ^ 0xffffffff) > (aBooleanArray2852.length ^ 0xffffffff); i++)
			aBooleanArray2852[i] = false;
		if (bool != true) {
			method1571(-24);
		}
		anInt2870++;
		if (aClass13_2875 == null) {
			aBoolean2860 = true;
		} else {
			anInt2876 = -1;
			for (int i = 0; (i ^ 0xffffffff) > (aBooleanArray2852.length ^ 0xffffffff); i++) {
				if (anIntArray1754[i] > 0) {
					Class38_Sub7_Sub2.method1100(91, i, aClass13_2875, this);
					anInt2876 = i;
				}
			}
			if ((anInt2876 ^ 0xffffffff) == 0) {
				aBoolean2860 = true;
			}
		}
	}
	
	final int method1539(int i, int i_35_) {
		anInt2865++;
		if (!this.method1564(i, -1)) {
			return 0;
		}
		if (anObjectArray1786[i] != null) {
			return 100;
		}
		if (aBooleanArray2852[i]) {
			return 100;
		}
		if (i_35_ != -13574) {
			method1572(27);
		}
		return Class23_Sub13_Sub15.method773(i, anInt2859, 1);
	}
	
	final void method1552(boolean bool, int i) {
		anInt2861++;
		if (bool != false) {
			method1567(true);
		}
		if (this.method1564(i, -1)) {
			if (aClass13_2875 != null && aBooleanArray2852 != null && aBooleanArray2852[i]) {
				Class23_Sub14.method865(aClass13_2875, 111, i, this);
			} else {
				Class28.method939(anIntArray1781[i], 6024, true, i, (byte) 2, this, anInt2859);
			}
		}
	}
	
	static {
		anIntArray2871 = new int[25];
		anInt2854 = 0;
		aClass16_2869 = Class38_Sub6.method1076((byte) 86, "null");
		aClass16_2867 = Class38_Sub6.method1076((byte) 86, "(U");
		aClass16_2877 = null;
		aClass16_2862 = aClass16_2873;
	}
}
