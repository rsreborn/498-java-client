/* Class23_Sub4_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub20 extends Class23_Sub4
{
	static int anInt3228;
	static int anInt3229;
	static RSString aClass16_3230 = Class38_Sub6.method1076((byte) 86, " <col=ffff00>");
	static int anInt3231;
	static int anInt3232;
	static int anInt3233;
	static int anInt3234;
	static int[] anIntArray3235 = new int[32];
	static int anInt3236;
	static RSString aClass16_3237;
	static int anInt3238;
	private int anInt3239 = 4096;
	
	static final void method346(int i, Class23_Sub23 class23_sub23) {
		long l = 0L;
		anInt3228++;
		int i_0_ = 0;
		if (class23_sub23.anInt2438 == 0) {
			l = client.method35(class23_sub23.anInt2423, class23_sub23.anInt2430, class23_sub23.anInt2433);
		}
		if (class23_sub23.anInt2438 == 1) {
			l = Class23_Sub13_Sub3.method611(class23_sub23.anInt2423, class23_sub23.anInt2430, class23_sub23.anInt2433);
		}
		if (class23_sub23.anInt2438 == 2) {
			l = Class87_Sub3.method1416(class23_sub23.anInt2423, class23_sub23.anInt2430, class23_sub23.anInt2433);
		}
		if (class23_sub23.anInt2438 == 3) {
			l = Class107.method1584(class23_sub23.anInt2423, class23_sub23.anInt2430, class23_sub23.anInt2433);
		}
		if (i == -21619) {
			int i_1_ = -1;
			int i_2_ = 0;
			if (l != 0L) {
				i_1_ = 0x7fffffff & (int) (l >>> 32);
				i_0_ = 0x1f & (int) l >> 14;
				i_2_ = 0x3 & (int) l >> 20;
			}
			class23_sub23.anInt2431 = i_2_;
			class23_sub23.anInt2434 = i_0_;
			class23_sub23.anInt2418 = i_1_;
		}
	}
	
	private Class23_Sub4_Sub20(int i) {
		super(0, true);
		anInt3239 = i;
	}
	
	final int[] method260(int i, int i_3_) {
		int[] is = aClass99_2115.method1500(i_3_, (byte) -127);
		anInt3234++;
		if (i != 0) {
			return null;
		}
		if (aClass99_2115.aBoolean1681) {
			Class3.method53(is, 0, Class23_Sub4_Sub33.anInt3428, anInt3239);
		}
		return is;
	}
	
	static final void method347(int i, byte[] bs) {
		int i_4_ = 0;
		if (i != 23095) {
			aClass16_3237 = null;
		}
		while (i_4_ < bs.length) {
			int i_5_ = 64 * (0xff & bs[i_4_++]) + -Class102.anInt1702;
			int i_6_ = -Class29.anInt445 + (0xff & bs[i_4_++]) * 64;
			if ((i_5_ ^ 0xffffffff) >= -1 || (i_6_ ^ 0xffffffff) >= -1 || ISAACCipher.anInt1238 <= i_5_ - -64 || Class38_Sub7.anInt2697 <= 64 + i_6_) {
				for (int i_7_ = -4096; i_7_ < 0; i_7_++) {
					int i_8_ = bs[i_4_++];
					if (i_8_ != 0) {
						i_4_++;
					}
				}
			} else {
				int i_9_ = i_5_ >> 6;
				int i_10_ = -1 + (-i_6_ + Class38_Sub7.anInt2697) >> 6;
				for (int i_11_ = 0; i_11_ < 64; i_11_++) {
					for (int i_12_ = -64; (i_12_ ^ 0xffffffff) > -1; i_12_++) {
						byte b = bs[i_4_++];
						if (b != 0) {
							if (Class55.aByteArrayArrayArray879[i_9_][i_10_] == null) {
								Class55.aByteArrayArrayArray879[i_9_][i_10_] = new byte[4096];
							}
							Class55.aByteArrayArrayArray879[i_9_][i_10_][(-(i_12_ + 1) << 6) + i_11_] = b;
							byte b_13_ = bs[i_4_++];
							if (ObjectDefinition.aByteArrayArrayArray3750[i_9_][i_10_] == null) {
								ObjectDefinition.aByteArrayArrayArray3750[i_9_][i_10_] = new byte[4096];
							}
							ObjectDefinition.aByteArrayArrayArray3750[i_9_][i_10_][(-(1 + i_12_) << 6) - -i_11_] = b_13_;
						}
					}
				}
			}
		}
		anInt3231++;
	}
	
	public static void method348(byte b) {
		aClass16_3237 = null;
		anIntArray3235 = null;
		aClass16_3230 = null;
		if (b != 59) {
			method349(-33);
		}
	}
	
	public Class23_Sub4_Sub20() {
		this(4096);
	}
	
	final void method255(Buffer class23_sub5, int i, int i_14_) {
		if (i_14_ != 1000) {
			aClass16_3237 = null;
		}
		int i_15_ = i;
		if ((i_15_ ^ 0xffffffff) == -1) {
			anInt3239 = (class23_sub5.readUByte() << 12) / 255;
		}
		anInt3233++;
	}
	
	static final int method349(int i) {
		anInt3236++;
		if (Class23_Sub4_Sub4.aDouble2969 == 3.0) {
			return 37;
		}
		if (Class23_Sub4_Sub4.aDouble2969 == 4.0) {
			return 50;
		}
		if (i != 16493) {
			return 95;
		}
		if (Class23_Sub4_Sub4.aDouble2969 == 6.0) {
			return 75;
		}
		return 100;
	}
	
	static {
		int i = 2;
		for (int i_16_ = 0; i_16_ < 32; i_16_++) {
			anIntArray3235[i_16_] = i + -1;
			i += i;
		}
		aClass16_3237 = Class38_Sub6.method1076((byte) 86, "(U4");
	}
}
