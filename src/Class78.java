/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

abstract class Class78
{
	static int anInt1407;
	private static RSString aClass16_1408;
	static int anInt1409;
	static CacheFileChannel[] aClass29Array1410;
	static short aShort1411 = 320;
	static RSString aClass16_1412;
	protected int anInt1413;
	protected Image anImage1414;
	protected int anInt1415;
	protected int[] anIntArray1416;
	static int anInt1417;
	static int anInt1418;
	static int anInt1419;
	static int anInt1420;
	static RSString aClass16_1421;
	static int anInt1422;
	static RSString aClass16_1423;
	
	abstract void method1342(int i, Graphics graphics, int i_0_, int i_1_);
	
	static final void method1343(int i, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, int i_6_, Class72[] class72s, int i_7_, int i_8_, byte[] bs) {
		if (i_8_ != -1137131194) {
			anInt1417 = 8;
		}
		anInt1407++;
		int i_9_ = -1;
		Buffer class23_sub5 = new Buffer(bs);
		for (;;) {
			int i_10_ = class23_sub5.method432((byte) 113);
			if ((i_10_ ^ 0xffffffff) == -1) {
				break;
			}
			i_9_ += i_10_;
			int i_11_ = 0;
			for (;;) {
				int i_12_ = class23_sub5.method432((byte) 16);
				if ((i_12_ ^ 0xffffffff) == -1) {
					break;
				}
				i_11_ += -1 + i_12_;
				int i_13_ = 0x3f & i_11_;
				int i_14_ = (0xff5 & i_11_) >> 6;
				int i_15_ = class23_sub5.method461(-1797813752);
				int i_16_ = 0x3 & i_15_;
				int i_17_ = i_15_ >> 2;
				int i_18_ = i_11_ >> 12;
				if ((i_6_ ^ 0xffffffff) == (i_18_ ^ 0xffffffff) && i_4_ <= i_14_ && i_14_ < i_4_ - -8 && i_13_ >= i_3_ && (8 + i_3_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
					Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_9_, -21035);
					int i_19_ = Class23_Sub13_Sub3.method614(class23_sub13_sub7.anInt3754, true, i_13_ & 0x7, i_14_ & 0x7, i_2_, class23_sub13_sub7.anInt3752, i_16_) + i_5_;
					int i_20_ = i_7_ - -Class23_Sub20.method887(i_14_ & 0x7, i_16_, 0x7 & i_13_, class23_sub13_sub7.anInt3752, class23_sub13_sub7.anInt3754, i_2_, (byte) -111);
					if ((i_19_ ^ 0xffffffff) < -1 && i_20_ > 0 && i_19_ < 103 && i_20_ < 103) {
						Class72 class72 = null;
						if (!bool) {
							int i_21_ = i;
							if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[1][i_19_][i_20_] & 0x2) == 2) {
								i_21_--;
							}
							if (i_21_ >= 0) {
								class72 = class72s[i_21_];
							}
						}
						Class35.method984(i_20_, class72, i_16_ - -i_2_ & 0x3, Class7.aBoolean170, i, !bool, i_17_, -115, i, i_19_, bool, i_9_);
					}
				}
			}
		}
	}
	
	static final void method1344(RSString class16, RSString class16_22_, int i, RSString class16_23_, int i_24_) {
		anInt1419++;
		Class89.method1433(i, i_24_, class16_22_, class16, class16_23_, (byte) -123);
	}
	
	abstract void method1345(int i, int i_25_, byte b, int i_26_, Graphics graphics, int i_27_);
	
	abstract void method1346(Component component, int i, int i_28_, int i_29_);
	
	final void method1347(byte b) {
		if (b > -65) {
			aClass16_1408 = null;
		}
		Class20.method202(anIntArray1416, anInt1415, anInt1413);
		anInt1409++;
	}
	
	static final void method1348(int i, int i_30_, int i_31_) {
		Class23_Sub13_Sub14 class23_sub13_sub14 = Class23_Sub13_Sub8_Sub1.method681(i_30_, false);
		anInt1422++;
		int i_32_ = class23_sub13_sub14.anInt4011;
		int i_33_ = class23_sub13_sub14.anInt4010;
		int i_34_ = class23_sub13_sub14.anInt4015;
		if (i != 0) {
			method1349(-80);
		}
		int i_35_ = Class23_Sub4_Sub20.anIntArray3235[i_33_ + -i_34_];
		if ((i_31_ ^ 0xffffffff) > -1 || i_35_ < i_31_) {
			i_31_ = 0;
		}
		i_35_ <<= i_34_;
		Class23_Sub4_Sub26.anIntArray3323[i_32_] = Class65.method1230(Class24.method919(i_35_ ^ 0xffffffff, Class23_Sub4_Sub26.anIntArray3323[i_32_]), Class24.method919(i_31_ << i_34_, i_35_));
	}
	
	public static void method1349(int i) {
		aClass16_1423 = null;
		int i_36_ = 107 % ((i - -40) / 35);
		aClass16_1412 = null;
		aClass16_1408 = null;
		aClass16_1421 = null;
		aClass29Array1410 = null;
	}
	
	static final void method1350(Class105 class105, Class105 class105_37_, int i) {
		anInt1418++;
		Class81.aClass105_1427 = class105;
		Class23_Sub19.aClass105_2386 = class105_37_;
		if (i != 1949) {
			anInt1417 = 39;
		}
	}
	
	protected Class78() {
		/* empty */
	}
	
	static {
		aClass16_1408 = Class38_Sub6.method1076((byte) 86, "flash3:");
		aClass29Array1410 = new CacheFileChannel[26];
		aClass16_1412 = Class38_Sub6.method1076((byte) 86, "Musik)2Engine vorbereitet)3");
		anInt1417 = 0;
		aClass16_1421 = aClass16_1408;
		aClass16_1423 = aClass16_1408;
	}
}
