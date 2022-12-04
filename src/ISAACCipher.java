/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ISAACCipher
{
	static int anInt1222 = -1;
	static RSString aClass16_1223;
	private int[] anIntArray1224;
	private static RSString aClass16_1225;
	private int anInt1226;
	static int anInt1227 = 0;
	static int anInt1228;
	static int anInt1229;
	static int anInt1230;
	static RSString aClass16_1231;
	private int anInt1232;
	static int anInt1233;
	private int[] anIntArray1234;
	static RSString aClass16_1235 = Class38_Sub6.method1076((byte) 86, "Fallen lassen");
	private int anInt1236;
	static int anInt1237;
	static int anInt1238;
	static int anInt1239;
	static int anInt1240;
	private int anInt1241;
	
	static final void method1259(int i) {
		anInt1229++;
		if (i != -1) {
			aClass16_1225 = null;
		}
		for (Class23_Sub23 class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1437(-9); class23_sub23 != null; class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1431((byte) -89)) {
			if (class23_sub23.anInt2437 == -1) {
				class23_sub23.anInt2429 = 0;
				Class23_Sub4_Sub20.method346(-21619, class23_sub23);
			} else {
				class23_sub23.method228(0);
			}
		}
	}
	
	public static void method1260(int i) {
		aClass16_1223 = null;
		aClass16_1231 = null;
		aClass16_1225 = null;
		aClass16_1235 = null;
		if (i != -31834) {
			method1260(-72);
		}
	}
	
	final int method1261(int i) {
		if ((anInt1236-- ^ 0xffffffff) == -1) {
			method1262(false);
			anInt1236 = 255;
		}
		if (i != 256) {
			method1263((byte) 70);
		}
		anInt1237++;
		return anIntArray1224[anInt1236];
	}
	
	private final void method1262(boolean bool) {
		anInt1233++;
		anInt1226 += ++anInt1241;
		if (bool == false) {
			for (int i = 0; i < 256; i++) {
				int i_0_ = anIntArray1234[i];
				if ((i & 0x2 ^ 0xffffffff) != -1) {
					if ((0x1 & i ^ 0xffffffff) == -1) {
						anInt1232 ^= anInt1232 << 2;
					} else {
						anInt1232 ^= anInt1232 >>> 16;
					}
				} else if ((0x1 & i) != 0) {
					anInt1232 ^= anInt1232 >>> 6;
				} else {
					anInt1232 ^= anInt1232 << 13;
				}
				anInt1232 += anIntArray1234[i + 128 & 0xff];
				int i_1_;
				anIntArray1234[i] = i_1_ = anIntArray1234[Class24.method919(1020, i_0_) >> 2] - -anInt1232 + anInt1226;
				anIntArray1224[i] = anInt1226 = anIntArray1234[Class24.method919(1020, i_1_ >> 8) >> 2] - -i_0_;
			}
		}
	}
	
	private final void method1263(byte b) {
		anInt1228++;
		if (b == -3) {
			int i_2_;
			int i_3_;
			int i_4_;
			int i_5_;
			int i_6_;
			int i_7_;
			int i_8_;
			int i = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = i_8_ = -1640531527;
			for (int i_9_ = 0; i_9_ < 4; i_9_++) {
				i ^= i_2_ << 11;
				i_4_ += i;
				i_2_ += i_3_;
				i_2_ ^= i_3_ >>> 2;
				i_5_ += i_2_;
				i_3_ += i_4_;
				i_3_ ^= i_4_ << 8;
				i_4_ += i_5_;
				i_4_ ^= i_5_ >>> 16;
				i_7_ += i_4_;
				i_6_ += i_3_;
				i_5_ += i_6_;
				i_5_ ^= i_6_ << 10;
				i_6_ += i_7_;
				i_6_ ^= i_7_ >>> 4;
				i += i_6_;
				i_8_ += i_5_;
				i_7_ += i_8_;
				i_7_ ^= i_8_ << 8;
				i_8_ += i;
				i_2_ += i_7_;
				i_8_ ^= i >>> 9;
				i += i_2_;
				i_3_ += i_8_;
			}
			for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
				i_5_ += anIntArray1224[4 + i_10_];
				i_7_ += anIntArray1224[i_10_ - -6];
				i += anIntArray1224[i_10_];
				i_2_ += anIntArray1224[1 + i_10_];
				i_3_ += anIntArray1224[2 + i_10_];
				i_4_ += anIntArray1224[i_10_ + 3];
				i ^= i_2_ << 11;
				i_6_ += anIntArray1224[5 + i_10_];
				i_8_ += anIntArray1224[i_10_ + 7];
				i_2_ += i_3_;
				i_4_ += i;
				i_2_ ^= i_3_ >>> 2;
				i_3_ += i_4_;
				i_3_ ^= i_4_ << 8;
				i_6_ += i_3_;
				i_5_ += i_2_;
				i_4_ += i_5_;
				i_4_ ^= i_5_ >>> 16;
				i_7_ += i_4_;
				i_5_ += i_6_;
				i_5_ ^= i_6_ << 10;
				i_6_ += i_7_;
				i_8_ += i_5_;
				i_6_ ^= i_7_ >>> 4;
				i_7_ += i_8_;
				i_7_ ^= i_8_ << 8;
				i_2_ += i_7_;
				i += i_6_;
				i_8_ += i;
				i_8_ ^= i >>> 9;
				i_3_ += i_8_;
				i += i_2_;
				anIntArray1234[i_10_] = i;
				anIntArray1234[1 + i_10_] = i_2_;
				anIntArray1234[2 + i_10_] = i_3_;
				anIntArray1234[i_10_ - -3] = i_4_;
				anIntArray1234[4 + i_10_] = i_5_;
				anIntArray1234[i_10_ + 5] = i_6_;
				anIntArray1234[6 + i_10_] = i_7_;
				anIntArray1234[7 + i_10_] = i_8_;
			}
			for (int i_11_ = 0; i_11_ < 256; i_11_ += 8) {
				i_5_ += anIntArray1234[4 + i_11_];
				i_4_ += anIntArray1234[3 + i_11_];
				i_8_ += anIntArray1234[i_11_ - -7];
				i_7_ += anIntArray1234[6 + i_11_];
				i_3_ += anIntArray1234[2 + i_11_];
				i_2_ += anIntArray1234[i_11_ + 1];
				i += anIntArray1234[i_11_];
				i ^= i_2_ << 11;
				i_2_ += i_3_;
				i_6_ += anIntArray1234[5 + i_11_];
				i_2_ ^= i_3_ >>> 2;
				i_5_ += i_2_;
				i_4_ += i;
				i_3_ += i_4_;
				i_3_ ^= i_4_ << 8;
				i_4_ += i_5_;
				i_4_ ^= i_5_ >>> 16;
				i_7_ += i_4_;
				i_6_ += i_3_;
				i_5_ += i_6_;
				i_5_ ^= i_6_ << 10;
				i_6_ += i_7_;
				i_8_ += i_5_;
				i_6_ ^= i_7_ >>> 4;
				i_7_ += i_8_;
				i_7_ ^= i_8_ << 8;
				i += i_6_;
				i_2_ += i_7_;
				i_8_ += i;
				i_8_ ^= i >>> 9;
				i_3_ += i_8_;
				i += i_2_;
				anIntArray1234[i_11_] = i;
				anIntArray1234[1 + i_11_] = i_2_;
				anIntArray1234[2 + i_11_] = i_3_;
				anIntArray1234[3 + i_11_] = i_4_;
				anIntArray1234[i_11_ + 4] = i_5_;
				anIntArray1234[i_11_ - -5] = i_6_;
				anIntArray1234[i_11_ - -6] = i_7_;
				anIntArray1234[7 + i_11_] = i_8_;
			}
			method1262(false);
			anInt1236 = 256;
		}
	}
	
	static final void method1264(int i, int i_12_, int i_13_, int i_14_, byte b) {
		anInt1240++;
		if (b > -5) {
			method1259(9);
		}
		if ((i_13_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)) {
			for (int i_15_ = i_13_; (i_15_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_15_++)
				Class4.anIntArrayArray98[i_15_][i_14_] = i;
		} else {
			for (int i_16_ = i_12_; (i_13_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++)
				Class4.anIntArrayArray98[i_16_][i_14_] = i;
		}
	}
	
	private ISAACCipher() {
		/* empty */
	}
	
	ISAACCipher(int[] is) {
		anIntArray1224 = new int[256];
		anIntArray1234 = new int[256];
		for (int i = 0; (is.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			anIntArray1224[i] = is[i];
		method1263((byte) -3);
	}
	
	static {
		aClass16_1223 = Class38_Sub6.method1076((byte) 86, "Keine Antwort vom Anmelde)2Server)3");
		aClass16_1225 = Class38_Sub6.method1076((byte) 86, "Please check your message)2centre for details)3");
		aClass16_1231 = aClass16_1225;
	}
}
