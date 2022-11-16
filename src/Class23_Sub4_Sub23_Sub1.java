/* Class23_Sub4_Sub23_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub23_Sub1 extends Class23_Sub4_Sub23
{
	static int anInt4476;
	static CacheArchive aClass105_Sub1_4477;
	static boolean[] aBooleanArray4478;
	static int anInt4479;
	static int anInt4480;
	static int anInt4481;
	static RSString aClass16_4482 = Class38_Sub6.method1076((byte) 86, "runes");
	static RSString aClass16_4483;
	private static RSString aClass16_4484 = Class38_Sub6.method1076((byte) 86, "glow2:");
	static int anInt4485;
	static RSString aClass16_4486;
	
	public static void method363(int i) {
		aClass16_4486 = null;
		aClass105_Sub1_4477 = null;
		aClass16_4482 = null;
		aClass16_4483 = null;
		aClass16_4484 = null;
		if (i != -29876505) {
			aClass16_4482 = null;
		}
		aBooleanArray4478 = null;
	}
	
	static final Class23_Sub4 method364(byte b, Buffer class23_sub5) {
		anInt4476++;
		class23_sub5.method461(-1797813752);
		int i = class23_sub5.method461(-1797813752);
		Class23_Sub4 class23_sub4 = Class63.method1213((byte) 93, i);
		class23_sub4.anInt2118 = class23_sub5.method461(-1797813752);
		int i_0_ = class23_sub5.method461(-1797813752);
		int i_1_ = 87 % ((b - 20) / 36);
		for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
			int i_3_ = class23_sub5.method461(-1797813752);
			class23_sub4.method255(class23_sub5, i_3_, 1000);
		}
		class23_sub4.method265(-21746);
		return class23_sub4;
	}
	
	final int[][] method258(int i, byte b) {
		anInt4480++;
		if (b != 9) {
			return null;
		}
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (aClass103_2108.aBoolean1733 && this.method361(118)) {
			int[] is_4_ = is[1];
			int[] is_5_ = is[0];
			int[] is_6_ = is[2];
			int i_7_ = anInt3272 * (i % anInt3272);
			for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_8_++) {
				int i_9_ = anIntArray3277[i_8_ % anInt3284 + i_7_];
				is_6_[i_8_] = Class24.method919(i_9_ << 4, 4080);
				is_4_[i_8_] = Class24.method919(65280, i_9_) >> 4;
				is_5_[i_8_] = Class24.method919(i_9_ >> 12, 4080);
			}
		}
		return is;
	}
	
	static final void method365(byte b) {
		anInt4485++;
		Class40.aClass5_625.method68(0);
		if (b > -23) {
			aBooleanArray4478 = null;
		}
	}
	
	static final void method366(int i) {
		Class23_Sub4_Sub7.anOa2997 = new oa(i);
		anInt4481++;
	}
	
	static final void method367(int i, int i_10_, int i_11_, Class64 class64) {
		anInt4479++;
		if (Class106.anInt1819 == 0 || Class106.anInt1819 == 3) {
			i -= class64.anInt999 / 2;
			i_10_ -= class64.anInt1128 / 2;
			int i_12_ = Class35.anInt550 - -Class23_Sub4_Sub16.anInt3162 & 0x7ff;
			int i_13_ = Class76.anIntArray1395[i_12_];
			i_13_ = i_13_ * (Class38_Sub7_Sub2.anInt4410 + 256) >> 8;
			int i_14_ = Class76.anIntArray1386[i_12_];
			int i_15_ = -36 / ((31 - i_11_) / 40);
			i_14_ = i_14_ * (Class38_Sub7_Sub2.anInt4410 - -256) >> 8;
			int i_16_ = i * i_13_ + -(i_14_ * i_10_) >> 11;
			int i_17_ = i_14_ * i - -(i_13_ * i_10_) >> 11;
			int i_18_ = Class105.aClass38_Sub7_Sub2_1812.anInt2674 - -i_17_ >> 7;
			int i_19_ = Class105.aClass38_Sub7_Sub2_1812.anInt2659 + -i_16_ >> 7;
			boolean bool = Class5.method66(0, i_19_, 1, i_18_, true, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
			if (bool) {
				Class23_Sub7.outBuffer.writeByte(i_10_);
				Class23_Sub7.outBuffer.writeByte(i);
				Class23_Sub7.outBuffer.method443(Class35.anInt550, (byte) 51);
				Class23_Sub7.outBuffer.writeByte(57);
				Class23_Sub7.outBuffer.writeByte(Class23_Sub4_Sub16.anInt3162);
				Class23_Sub7.outBuffer.writeByte(Class38_Sub7_Sub2.anInt4410);
				Class23_Sub7.outBuffer.writeByte(89);
				Class23_Sub7.outBuffer.method443(Class105.aClass38_Sub7_Sub2_1812.anInt2674, (byte) 51);
				Class23_Sub7.outBuffer.method443(Class105.aClass38_Sub7_Sub2_1812.anInt2659, (byte) 51);
				Class23_Sub7.outBuffer.writeByte(Class78.anInt1417);
				Class23_Sub7.outBuffer.writeByte(63);
			}
		}
	}
	
	static {
		aBooleanArray4478 = new boolean[100];
		aClass16_4483 = aClass16_4484;
		aClass16_4486 = aClass16_4484;
	}
}
