/* Class23_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub7 extends Class23
{
	protected int anInt2194;
	static int anInt2195;
	static Class29 aClass29_2196;
	protected int anInt2197;
	protected Class23_Sub10_Sub1 aClass23_Sub10_Sub1_2198;
	protected int anInt2199;
	static RSString aClass16_2200;
	static Class23_Sub10_Sub4 aClass23_Sub10_Sub4_2201;
	static Class23_Sub5_Sub1 aClass23_Sub5_Sub1_2202;
	static RSString aClass16_2203 = Class38_Sub6.method1076((byte) 86, "<img=1>");
	protected int anInt2204;
	protected int anInt2205;
	static int anInt2206;
	protected int anInt2207;
	protected int anInt2208;
	protected Class47 aClass47_2209;
	protected int anInt2210;
	protected Class23_Sub6_Sub1 aClass23_Sub6_Sub1_2211;
	protected int anInt2212;
	static int anInt2213;
	protected int anInt2214;
	protected int anInt2215;
	static Class23_Sub13_Sub10_Sub1 aClass23_Sub13_Sub10_Sub1_2216;
	protected int anInt2217;
	protected int anInt2218;
	static int anInt2219;
	protected int anInt2220;
	static int anInt2221;
	protected int anInt2222;
	protected int anInt2223;
	protected Class23_Sub2 aClass23_Sub2_2224;
	protected int anInt2225;
	static RSString aClass16_2226;
	
	public static void method494(int i) {
		aClass23_Sub13_Sub10_Sub1_2216 = null;
		aClass16_2226 = null;
		aClass29_2196 = null;
		if (i != -1) {
			aClass23_Sub5_Sub1_2202 = null;
		}
		aClass16_2200 = null;
		aClass16_2203 = null;
		aClass23_Sub10_Sub4_2201 = null;
		aClass23_Sub5_Sub1_2202 = null;
	}
	
	static final void method495(Class104 class104, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool) {
		int i_7_;
		int i_6_ = i_7_ = (i_4_ << 7) - Class17.anInt311;
		int i_9_;
		int i_8_ = i_9_ = (i_5_ << 7) - Class23_Sub4_Sub23.anInt3281;
		int i_11_;
		int i_10_ = i_11_ = i_6_ + 128;
		int i_13_;
		int i_12_ = i_13_ = i_8_ + 128;
		int i_14_ = Class17.anIntArrayArrayArray301[i][i_4_][i_5_] - Class61.anInt956;
		int i_15_ = Class17.anIntArrayArrayArray301[i][i_4_ + 1][i_5_] - Class61.anInt956;
		int i_16_ = Class17.anIntArrayArrayArray301[i][i_4_ + 1][i_5_ + 1] - Class61.anInt956;
		int i_17_ = Class17.anIntArrayArrayArray301[i][i_4_][i_5_ + 1] - Class61.anInt956;
		int i_18_ = i_8_ * i_2_ + i_6_ * i_3_ >> 16;
		i_8_ = i_8_ * i_3_ - i_6_ * i_2_ >> 16;
		i_6_ = i_18_;
		i_18_ = i_14_ * i_1_ - i_8_ * i_0_ >> 16;
		i_8_ = i_14_ * i_0_ + i_8_ * i_1_ >> 16;
		i_14_ = i_18_;
		if (i_8_ >= 50) {
			i_18_ = i_9_ * i_2_ + i_10_ * i_3_ >> 16;
			i_9_ = i_9_ * i_3_ - i_10_ * i_2_ >> 16;
			i_10_ = i_18_;
			i_18_ = i_15_ * i_1_ - i_9_ * i_0_ >> 16;
			i_9_ = i_15_ * i_0_ + i_9_ * i_1_ >> 16;
			i_15_ = i_18_;
			if (i_9_ >= 50) {
				i_18_ = i_12_ * i_2_ + i_11_ * i_3_ >> 16;
				i_12_ = i_12_ * i_3_ - i_11_ * i_2_ >> 16;
				i_11_ = i_18_;
				i_18_ = i_16_ * i_1_ - i_12_ * i_0_ >> 16;
				i_12_ = i_16_ * i_0_ + i_12_ * i_1_ >> 16;
				i_16_ = i_18_;
				if (i_12_ >= 50) {
					i_18_ = i_13_ * i_2_ + i_7_ * i_3_ >> 16;
					i_13_ = i_13_ * i_3_ - i_7_ * i_2_ >> 16;
					i_7_ = i_18_;
					i_18_ = i_17_ * i_1_ - i_13_ * i_0_ >> 16;
					i_13_ = i_17_ * i_0_ + i_13_ * i_1_ >> 16;
					i_17_ = i_18_;
					if (i_13_ >= 50) {
						int i_19_ = Class76.anInt1383 + (i_6_ << 9) / i_8_;
						int i_20_ = Class76.anInt1392 + (i_14_ << 9) / i_8_;
						int i_21_ = Class76.anInt1383 + (i_10_ << 9) / i_9_;
						int i_22_ = Class76.anInt1392 + (i_15_ << 9) / i_9_;
						int i_23_ = Class76.anInt1383 + (i_11_ << 9) / i_12_;
						int i_24_ = Class76.anInt1392 + (i_16_ << 9) / i_12_;
						int i_25_ = Class76.anInt1383 + (i_7_ << 9) / i_13_;
						int i_26_ = Class76.anInt1392 + (i_17_ << 9) / i_13_;
						Class76.anInt1390 = 0;
						if ((i_23_ - i_25_) * (i_22_ - i_26_) - (i_24_ - i_26_) * (i_21_ - i_25_) > 0) {
							if (Class23_Sub13_Sub9.aBoolean3858 && Class23_Sub13_Sub4.method623(Class23_Sub4_Sub11.anInt3071 + Class76.anInt1383, Class38_Sub2.anInt2503 + Class76.anInt1392, i_24_, i_26_, i_22_, i_23_, i_25_, i_21_)) {
								Class87_Sub1.anInt2788 = i_4_;
								Class23_Sub10_Sub2.anInt3595 = i_5_;
							}
							if (!bool) {
								Class76.aBoolean1398 = false;
								if (i_23_ < 0 || i_25_ < 0 || i_21_ < 0 || i_23_ > Class76.anInt1384 || i_25_ > Class76.anInt1384 || i_21_ > Class76.anInt1384) {
									Class76.aBoolean1398 = true;
								}
								if (class104.anInt1751 == -1) {
									if (class104.anInt1743 != 12345678) {
										Class76.method1333(i_24_, i_26_, i_22_, i_23_, i_25_, i_21_, class104.anInt1743, class104.anInt1753, class104.anInt1744);
									}
								} else if (!Class23_Sub24.aBoolean2446) {
									if (class104.aBoolean1750) {
										Class76.method1327(i_24_, i_26_, i_22_, i_23_, i_25_, i_21_, class104.anInt1743, class104.anInt1753, class104.anInt1744, i_6_, i_10_, i_7_, i_14_, i_15_, i_17_, i_8_, i_9_, i_13_, class104.anInt1751);
									} else {
										Class76.method1327(i_24_, i_26_, i_22_, i_23_, i_25_, i_21_, class104.anInt1743, class104.anInt1753, class104.anInt1744, i_11_, i_7_, i_10_, i_16_, i_17_, i_15_, i_12_, i_13_, i_9_, class104.anInt1751);
									}
								} else {
									int i_27_ = Class76.anInterface1_1399.method4(class104.anInt1751, (byte) 50);
									Class76.method1333(i_24_, i_26_, i_22_, i_23_, i_25_, i_21_, Class23_Sub13_Sub16.method782(i_27_, class104.anInt1743), Class23_Sub13_Sub16.method782(i_27_, class104.anInt1753), Class23_Sub13_Sub16.method782(i_27_, class104.anInt1744));
								}
							}
						}
						if ((i_19_ - i_21_) * (i_26_ - i_22_) - (i_20_ - i_22_) * (i_25_ - i_21_) > 0) {
							if (Class23_Sub13_Sub9.aBoolean3858 && Class23_Sub13_Sub4.method623(Class23_Sub4_Sub11.anInt3071 + Class76.anInt1383, Class38_Sub2.anInt2503 + Class76.anInt1392, i_20_, i_22_, i_26_, i_19_, i_21_, i_25_)) {
								Class87_Sub1.anInt2788 = i_4_;
								Class23_Sub10_Sub2.anInt3595 = i_5_;
							}
							if (!bool) {
								Class76.aBoolean1398 = false;
								if (i_19_ < 0 || i_21_ < 0 || i_25_ < 0 || i_19_ > Class76.anInt1384 || i_21_ > Class76.anInt1384 || i_25_ > Class76.anInt1384) {
									Class76.aBoolean1398 = true;
								}
								if (class104.anInt1751 == -1) {
									if (class104.anInt1752 != 12345678) {
										Class76.method1333(i_20_, i_22_, i_26_, i_19_, i_21_, i_25_, class104.anInt1752, class104.anInt1744, class104.anInt1753);
									}
								} else if (!Class23_Sub24.aBoolean2446) {
									Class76.method1327(i_20_, i_22_, i_26_, i_19_, i_21_, i_25_, class104.anInt1752, class104.anInt1744, class104.anInt1753, i_6_, i_10_, i_7_, i_14_, i_15_, i_17_, i_8_, i_9_, i_13_, class104.anInt1751);
								} else {
									int i_28_ = Class76.anInterface1_1399.method4(class104.anInt1751, (byte) 50);
									Class76.method1333(i_20_, i_22_, i_26_, i_19_, i_21_, i_25_, Class23_Sub13_Sub16.method782(i_28_, class104.anInt1752), Class23_Sub13_Sub16.method782(i_28_, class104.anInt1744), Class23_Sub13_Sub16.method782(i_28_, class104.anInt1753));
								}
							}
						}
					}
				}
			}
		}
	}
	
	final void method496(byte b) {
		aClass23_Sub10_Sub1_2198 = null;
		aClass23_Sub2_2224 = null;
		aClass23_Sub6_Sub1_2211 = null;
		anInt2219++;
		if (b != -53) {
			anInt2212 = -13;
		}
		aClass47_2209 = null;
	}
	
	Class23_Sub7() {
		/* empty */
	}
	
	static {
		aClass16_2200 = Class38_Sub6.method1076((byte) 86, "<col=ffff00>");
		anInt2213 = 0;
		aClass16_2226 = Class38_Sub6.method1076((byte) 86, "<)4col>");
		aClass23_Sub5_Sub1_2202 = new Class23_Sub5_Sub1(5000);
	}
}
