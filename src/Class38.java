/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class38
{
	static Class81 aClass81_581 = new Class81(30);
	static int anInt582;
	static int anInt583;
	static Class5 aClass5_584;
	static int anInt585;
	static RSString aClass16_586 = Class38_Sub6.method1076((byte) 86, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");
	static int anInt587;
	static int anInt588;
	static Interface1 anInterface1_589;
	private static RSString aClass16_590;
	static Class59[][] aClass59ArrayArray591;
	static int anInt592;
	static RSString aClass16_593;
	static short aShort594;
	static int[] anIntArray595;
	static int[] anIntArray596;
	
	void method992(Class38 class38_0_, int i, int i_1_, int i_2_, boolean bool) {
		anInt588++;
	}
	
	static final boolean method993(int i, int i_3_, int i_4_, int i_5_, int i_6_, Class38 class38, int i_7_, long l, boolean bool) {
		if (class38 == null) {
			return true;
		}
		int i_8_ = i_3_ - i_6_;
		int i_9_ = i_4_ - i_6_;
		int i_10_ = i_3_ + i_6_;
		int i_11_ = i_4_ + i_6_;
		if (bool) {
			if (i_7_ > 640 && i_7_ < 1408) {
				i_11_ += 128;
			}
			if (i_7_ > 1152 && i_7_ < 1920) {
				i_10_ += 128;
			}
			if (i_7_ > 1664 || i_7_ < 384) {
				i_9_ -= 128;
			}
			if (i_7_ > 128 && i_7_ < 896) {
				i_8_ -= 128;
			}
		}
		i_8_ /= 128;
		i_9_ /= 128;
		i_10_ /= 128;
		i_11_ /= 128;
		return Class23_Sub4_Sub17.method334(i, i_8_, i_9_, i_10_ - i_8_ + 1, i_11_ - i_9_ + 1, i_3_, i_4_, i_5_, class38, i_7_, true, l);
	}
	
	Class38 method994(int i, int i_12_, int i_13_) {
		anInt585++;
		return this;
	}
	
	abstract void method995(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, long l);
	
	public static void method996(int i) {
		if (i != 128) {
			method1000(null, -64, 125, 47, 111, -57, -12);
		}
		anIntArray596 = null;
		aClass16_586 = null;
		anIntArray595 = null;
		aClass59ArrayArray591 = null;
		aClass16_593 = null;
		aClass16_590 = null;
		aClass5_584 = null;
		anInterface1_589 = null;
		aClass81_581 = null;
	}
	
	static final Class23_Sub13_Sub10_Sub1[] method997(byte b) {
		if (b > -117) {
			return null;
		}
		Class23_Sub13_Sub10_Sub1[] class23_sub13_sub10_sub1s = new Class23_Sub13_Sub10_Sub1[Class23_Sub4_Sub20.anInt3229];
		for (int i = 0; Class23_Sub4_Sub20.anInt3229 > i; i++) {
			int i_21_ = Class105.anIntArray1766[i] * Class79.anIntArray1875[i];
			byte[] bs = Class23_Sub13_Sub23.aByteArrayArray4243[i];
			int[] is = new int[i_21_];
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
				is[i_22_] = Class23_Sub4_Sub1.anIntArray2890[Class24.method919(bs[i_22_], 255)];
			class23_sub13_sub10_sub1s[i] = new Class23_Sub13_Sub10_Sub1(Class23_Sub12.anInt2301, Class23_Sub13_Sub15.anInt4033, Class23_Sub23.anIntArray2417[i], Class23_Sub13_Sub2.anIntArray3679[i], Class79.anIntArray1875[i], Class105.anIntArray1766[i], is);
		}
		anInt582++;
		Class23_Sub13_Sub9.method684(true);
		return class23_sub13_sub10_sub1s;
	}
	
	boolean method998() {
		anInt583++;
		return false;
	}
	
	abstract int method999();
	
	static final Class38_Sub1 method1000(Class38_Sub1 class38_sub1, int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		anInt587++;
		long l = (long) i_26_;
		Class38_Sub1 class38_sub1_28_ = (Class38_Sub1) Class23_Sub4_Sub3.aClass81_2946.method1366(l, (byte) 106);
		if (class38_sub1_28_ == null) {
			Class38_Sub4 class38_sub4 = Class38_Sub4.method1060(Class69.aClass105_Sub1_1211, i_26_, 0);
			if (class38_sub4 == null) {
				return null;
			}
			class38_sub1_28_ = class38_sub4.method1064(64, 768, -50, -10, -50);
			Class23_Sub4_Sub3.aClass81_2946.method1365(i_25_ ^ ~0x275, l, class38_sub1_28_);
		}
		int i_29_ = class38_sub1.method1001();
		int i_30_ = class38_sub1.method1010();
		int i_31_ = class38_sub1.method1014();
		int i_32_ = class38_sub1.method1016();
		class38_sub1_28_ = class38_sub1_28_.method1005(true, true);
		if ((i_24_ ^ 0xffffffff) != -1) {
			class38_sub1_28_.method1004(i_24_);
		}
		Class38_Sub1_Sub1 class38_sub1_sub1 = (Class38_Sub1_Sub1) class38_sub1_28_;
		if (Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_29_ + i, i_31_ + i_23_, (byte) 120) != i_27_ || i_27_ != Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_30_ + i, i_32_ + i_23_, (byte) 119)) {
			for (int i_33_ = 0; (class38_sub1_sub1.anInt4312 ^ 0xffffffff) < (i_33_ ^ 0xffffffff); i_33_++)
				class38_sub1_sub1.anIntArray4308[i_33_] += Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, class38_sub1_sub1.anIntArray4330[i_33_] + i, i_23_ + class38_sub1_sub1.anIntArray4309[i_33_], (byte) 99) + -i_27_;
			class38_sub1_sub1.aBoolean4321 = false;
		}
		if (i_25_ != -630) {
			anIntArray595 = null;
		}
		return class38_sub1_28_;
	}
	
	public Class38() {
		/* empty */
	}
	
	static {
		aClass5_584 = new Class5(64);
		aClass16_590 = Class38_Sub6.method1076((byte) 86, "Login server offline)3");
		aClass16_593 = aClass16_590;
		aShort594 = (short) 32767;
		anInt592 = 4;
		aClass59ArrayArray591 = new Class59[anInt592][500];
		anIntArray595 = new int[anInt592];
		anIntArray596 = new int[128];
	}
}
