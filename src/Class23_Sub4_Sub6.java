/* Class23_Sub4_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public class Class23_Sub4_Sub6 extends Class23_Sub4
{
	static int anInt2978;
	static int[] anIntArray2979;
	static int anInt2980;
	static RSString aClass16_2981;
	static RSString aClass16_2982;
	private int anInt2983 = 4096;
	static int anInt2984;
	private static RSString aClass16_2985;
	static int anInt2986;
	static int anInt2987;
	static Font aFont2988;
	static int anInt2989;
	static Class29 aClass29_2990;
	static RSString aClass16_2991;
	private static RSString aClass16_2992 = Class38_Sub6.method1076((byte) 86, "Try again in 60 secs)3)3)3");
	static RSString aClass16_2993;
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		if (i_0_ != 1000) {
			aClass16_2991 = null;
		}
		anInt2984++;
		if (i == 0) {
			anInt2983 = class23_sub5.readShortBE();
		}
	}
	
	public Class23_Sub4_Sub6() {
		super(1, true);
	}
	
	static final void method287(Class23_Sub13_Sub8 class23_sub13_sub8, Class23_Sub13_Sub8 class23_sub13_sub8_1_, int i) {
		anInt2978++;
		if (Class71_Sub2.aBoolean2736) {
			Class23_Sub13_Sub3.method613(class23_sub13_sub8_1_, (byte) 121, class23_sub13_sub8);
		} else {
			if (i <= 111) {
				anIntArray2979 = null;
			}
			if (Class49.anInt756 == 0 || Class49.anInt756 == 5) {
				int i_2_ = 20;
				int i_3_ = 253 - i_2_;
				class23_sub13_sub8.method666(Class102.aClass16_1709, 382, -i_2_ + 245, 16777215, -1);
				Class20.method215(230, i_3_, 304, 34, 9179409);
				Class20.method215(231, 1 + i_3_, 302, 32, 0);
				Class20.method222(232, 2 + i_3_, Class71_Sub1_Sub1.anInt4415 * 3, 30, 9179409);
				Class20.method222(Class71_Sub1_Sub1.anInt4415 * 3 + 232, 2 + i_3_, 300 - 3 * Class71_Sub1_Sub1.anInt4415, 30, 0);
				class23_sub13_sub8.method666(Class23_Sub2.aClass16_2050, 382, 276 + -i_2_, 16777215, -1);
			}
			if (Class49.anInt756 == 20) {
				int i_4_ = 211;
				Class13.aClass43_255.method1119(382 - Class13.aClass43_255.anInt669 / 2, -(Class13.aClass43_255.anInt671 / 2) + 271);
				class23_sub13_sub8.method666(Class23_Sub2.aClass16_2060, 382, i_4_, 16776960, 0);
				i_4_ += 15;
				class23_sub13_sub8.method666(Class23_Sub2.aClass16_2061, 382, i_4_, 16776960, 0);
				i_4_ += 15;
				class23_sub13_sub8.method666(Class23_Sub2.aClass16_2063, 382, i_4_, 16776960, 0);
				i_4_ += 15;
				i_4_ += 10;
				class23_sub13_sub8.method650(Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub26.aClass16_2468, Class23_Sub13_Sub8.method674(Class23_Sub2.aClass16_2064) }, -107), 272, i_4_, 16777215, 0);
				i_4_ += 15;
				class23_sub13_sub8.method650(Class23_Sub4_Sub14.method322(new RSString[] { Class97.aClass16_1642, Class23_Sub2.aClass16_2065.method155((byte) 59) }, -75), 274, i_4_, 16777215, 0);
				i_4_ += 15;
			}
			if (Class49.anInt756 == 10) {
				Class13.aClass43_255.method1119(202, 171);
				if ((Class23_Sub4_Sub37.anInt3489 ^ 0xffffffff) == -1) {
					int i_5_ = 251;
					int i_6_ = 302;
					int i_7_ = 291;
					class23_sub13_sub8.method666(oa.aClass16_1250, 382, i_5_, 16776960, 0);
					Class42.aClass43_650.method1119(-73 + i_6_, i_7_ + -20);
					class23_sub13_sub8.method665(Class87_Sub4.aClass16_2833, -73 + i_6_, -20 + i_7_, 144, 40, 16777215, 0, 1, 1, 0);
					i_6_ = 462;
					Class42.aClass43_650.method1119(-73 + i_6_, -20 + i_7_);
					class23_sub13_sub8.method665(Class23_Sub4_Sub1.aClass16_2906, -73 + i_6_, i_7_ + -20, 144, 40, 16777215, 0, 1, 1, 0);
					i_5_ += 30;
				} else if (Class23_Sub4_Sub37.anInt3489 == 2) {
					int i_8_ = 211;
					class23_sub13_sub8.method666(Class23_Sub2.aClass16_2060, 382, i_8_, 16776960, 0);
					int i_9_ = 302;
					i_8_ += 15;
					class23_sub13_sub8.method666(Class23_Sub2.aClass16_2061, 382, i_8_, 16776960, 0);
					int i_10_ = 321;
					i_8_ += 15;
					class23_sub13_sub8.method666(Class23_Sub2.aClass16_2063, 382, i_8_, 16776960, 0);
					boolean bool;
					if ((Class38_Sub7_Sub2.anInt4413 ^ 0xffffffff) == -1 && Class89.anInt1511 % 40 < 20 && Class23_Sub13_Sub25.aBoolean4294) {
						bool = true;
					} else {
						bool = false;
					}
					i_8_ += 15;
					i_8_ += 10;
					class23_sub13_sub8.method650(Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub26.aClass16_2468, Class23_Sub13_Sub8.method674(Class23_Sub2.aClass16_2064), !bool ? Class23_Sub2.aClass16_2062 : Class95.aClass16_1621 }, -56), 272, i_8_, 16777215, 0);
					if (Class38_Sub7_Sub2.anInt4413 != 1 || Class89.anInt1511 % 40 >= 20 || !Class23_Sub13_Sub25.aBoolean4294) {
						bool = false;
					} else {
						bool = true;
					}
					i_8_ += 15;
					class23_sub13_sub8.method650(Class23_Sub4_Sub14.method322(new RSString[] { Class97.aClass16_1642, Class23_Sub2.aClass16_2065.method155((byte) 59), bool ? Class95.aClass16_1621 : Class23_Sub2.aClass16_2062 }, -98), 274, i_8_, 16777215, 0);
					i_8_ += 15;
					Class42.aClass43_650.method1119(-73 + i_9_, -20 + i_10_);
					class23_sub13_sub8.method666(RSString.aClass16_1949, i_9_, i_10_ + 5, 16777215, 0);
					i_9_ = 462;
					Class42.aClass43_650.method1119(i_9_ - 73, -20 + i_10_);
					class23_sub13_sub8.method666(Class23_Sub4_Sub27.aClass16_3338, i_9_, 5 + i_10_, 16777215, 0);
				} else if (Class23_Sub4_Sub37.anInt3489 == 3) {
					int i_11_ = 236;
					int i_12_ = 382;
					class23_sub13_sub8.method666(Class87_Sub3.aClass16_2823, 382, 211, 16776960, 0);
					int i_13_ = 321;
					class23_sub13_sub8.method666(Class23_Sub4_Sub2.aClass16_2913, 382, i_11_, 16777215, 0);
					i_11_ += 15;
					class23_sub13_sub8.method666(Class23_Sub13.aClass16_2306, 382, i_11_, 16777215, 0);
					i_11_ += 15;
					class23_sub13_sub8.method666(Class88.aClass16_1505, 382, i_11_, 16777215, 0);
					i_11_ += 15;
					class23_sub13_sub8.method666(Class23_Sub16.aClass16_2354, 382, i_11_, 16777215, 0);
					i_11_ += 15;
					Class42.aClass43_650.method1119(-73 + i_12_, -20 + i_13_);
					class23_sub13_sub8.method666(Class23_Sub4_Sub27.aClass16_3338, i_12_, i_13_ - -5, 16777215, 0);
				}
			}
			if (Class23_Sub4_Sub29.anInt3369 != 1) {
				if ((Class23_Sub13_Sub19.anInt4123 ^ 0xffffffff) < -1) {
					Class23_Sub4_Sub1.method270((byte) 120, Class23_Sub13_Sub19.anInt4123);
					Class23_Sub13_Sub19.anInt4123 = 0;
				}
				Class23_Sub4_Sub22.method358(27442);
			}
			Class67.aClass43Array1171[!Class23_Sub13_Sub16.aBoolean4043 ? 0 : 1].method1119(725, 463);
			if (Class49.anInt756 > 5 && Class47.anInt741 != 2) {
				if (Class23_Sub16.aClass43_2352 == null) {
					Class23_Sub16.aClass43_2352 = Class23_Sub13_Sub9.method688(Class59.anInt935, Class92.aClass105_Sub1_1561, 0, 0);
				}
				if (Class23_Sub16.aClass43_2352 != null) {
					int i_14_ = 5;
					int i_15_ = 463;
					Class23_Sub16.aClass43_2352.method1119(i_14_, i_15_);
					int i_16_ = 100;
					int i_17_ = 35;
					class23_sub13_sub8.method666(Class23_Sub4_Sub14.method322(new RSString[] { Class90.aClass16_1539, Class97.aClass16_1647, Class23_Sub4_Sub23.method360((byte) -9, Class19.anInt321) }, -30), i_16_ / 2 + i_14_, i_17_ / 2 + i_15_ - 2, 16777215, 0);
					if (Class23.aClass53_347 != null) {
						class23_sub13_sub8_1_.method666(Class23_Sub14.aClass16_2326, i_14_ + i_16_ / 2, i_15_ + (i_17_ / 2 + 12), 16777215, 0);
					} else {
						class23_sub13_sub8_1_.method666(Class23_Sub4_Sub11.aClass16_3068, i_14_ + i_16_ / 2, i_17_ / 2 + (i_15_ - -12), 16777215, 0);
					}
				}
			}
		}
	}
	
	public static void method288(int i) {
		aClass16_2991 = null;
		aClass29_2990 = null;
		if (i == -31116) {
			aClass16_2992 = null;
			aFont2988 = null;
			anIntArray2979 = null;
			aClass16_2985 = null;
			aClass16_2981 = null;
			aClass16_2993 = null;
			aClass16_2982 = null;
		}
	}
	
	final int[] method260(int i, int i_18_) {
		anInt2987++;
		int[] is = aClass99_2115.method1500(i_18_, (byte) -112);
		if (aClass99_2115.aBoolean1681) {
			int[] is_19_ = this.method261(-1 + i_18_ & Class23_Sub4_Sub1.anInt2892, 0, (byte) 18);
			int[] is_20_ = this.method261(i_18_, 0, (byte) 18);
			int[] is_21_ = this.method261(Class23_Sub4_Sub1.anInt2892 & 1 + i_18_, 0, (byte) 18);
			for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_22_++) {
				int i_23_ = (is_21_[i_22_] - is_19_[i_22_]) * anInt2983;
				int i_24_ = anInt2983 * (is_20_[Class95.anInt1611 & i_22_ - -1] - is_20_[-1 + i_22_ & Class95.anInt1611]);
				int i_25_ = i_24_ >> 12;
				int i_26_ = i_23_ >> 12;
				int i_27_ = i_26_ * i_26_ >> 12;
				int i_28_ = i_25_ * i_25_ >> 12;
				int i_29_ = (int) (Math.sqrt((double) ((float) (4096 + i_28_ + i_27_) / 4096.0F)) * 4096.0);
				int i_30_ = i_29_ != 0 ? 16777216 / i_29_ : 0;
				is[i_22_] = -i_30_ + 4096;
			}
		}
		if (i != 0) {
			return null;
		}
		return is;
	}
	
	static {
		anInt2989 = -1;
		anInt2986 = 0;
		aClass16_2981 = aClass16_2992;
		aClass16_2985 = Class38_Sub6.method1076((byte) 86, "yellow:");
		aClass16_2991 = Class38_Sub6.method1076((byte) 86, "scrollbar");
		aClass16_2982 = aClass16_2985;
		aClass16_2993 = aClass16_2985;
	}
}
