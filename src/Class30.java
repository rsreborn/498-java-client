/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class30
{
	static int anInt472;
	static int anInt473;
	static RSString aClass16_474;
	static CacheArchive aClass105_Sub1_475;
	private static RSString aClass16_476;
	static int anInt477;
	static int anInt478 = 0;
	static int anInt479;
	static int anInt480;
	
	static final void method956(Class64 class64, byte b, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i_0_ * i_0_ + i_1_ * i_1_;
		anInt479++;
		if (i_4_ <= 360000) {
			int i_5_ = Math.min(class64.anInt1128 / 2, class64.anInt999 / 2);
			if (b == -100) {
				if (i_5_ * i_5_ >= i_4_) {
					Class5.method63(class64, i, i_0_, 90, i_1_, Class23_Sub1.aClass23_Sub13_Sub10Array2009[i_3_], i_2_);
				} else {
					i_5_ -= 10;
					int i_6_ = 0x7ff & Class23_Sub4_Sub16.anInt3162 + Class35.anInt550;
					int i_7_ = Class76.anIntArray1386[i_6_];
					i_7_ = i_7_ * 256 / (256 + Class38_Sub7_Sub2.anInt4410);
					int i_8_ = Class76.anIntArray1395[i_6_];
					i_8_ = 256 * i_8_ / (Class38_Sub7_Sub2.anInt4410 - -256);
					int i_9_ = -(i_7_ * i_1_) + i_0_ * i_8_ >> 16;
					int i_10_ = i_0_ * i_7_ + i_1_ * i_8_ >> 16;
					double d = Math.atan2((double) i_10_, (double) i_9_);
					int i_11_ = (int) ((double) i_5_ * Math.sin(d));
					int i_12_ = (int) ((double) i_5_ * Math.cos(d));
					((Class23_Sub13_Sub10_Sub1) Class23_Sub14.aClass23_Sub13_Sub10Array2332[i_3_]).method706(class64.anInt1128 / 2 + (i_2_ - (-i_11_ - -10)), -i_12_ + (i - -(class64.anInt999 / 2)) - 10, 20, 20, 15, 15, d, 256);
				}
			}
		}
	}
	
	static final void method957(byte b, Class105 class105, Interface2 interface2, Class105 class105_13_) {
		int i = 93 / ((-15 - b) / 61);
		Class23_Sub13_Sub23.anInterface2_4248 = interface2;
		anInt472++;
		CacheIndex.aClass105_265 = class105_13_;
		Class23_Sub4_Sub14.aClass105_3119 = class105;
	}
	
	static final void method958(byte b) {
		Class23_Sub4_Sub6.aFont2988 = null;
		anInt480++;
		CacheIndex.aFontMetrics267 = null;
		Class23_Sub27.anImage2481 = null;
		if (b != 11) {
			method959(-108);
		}
	}
	
	public static void method959(int i) {
		aClass16_474 = null;
		aClass16_476 = null;
		if (i == 2) {
			aClass105_Sub1_475 = null;
		}
	}
	
	static {
		aClass16_476 = Class38_Sub6.method1076((byte) 86, "Service unavailable)3");
		aClass16_474 = aClass16_476;
	}
}
