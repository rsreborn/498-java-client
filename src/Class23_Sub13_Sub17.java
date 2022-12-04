/* Class23_Sub13_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub17 extends Class23_Sub13
{
	private short[] aShortArray4050;
	protected int anInt4051;
	private short[] aShortArray4052;
	static int anInt4053;
	protected boolean aBoolean4054;
	static int anInt4055;
	static RSString aClass16_4056;
	private int anInt4057;
	private int anInt4058 = 128;
	protected int anInt4059;
	private int anInt4060;
	private static RSString aClass16_4061 = Class38_Sub6.method1076((byte) 86, "Please enter your username)3");
	private int anInt4062;
	static RSString aClass16_4063;
	static int anInt4064;
	static int anInt4065;
	static Class89 aClass89_4066;
	private int anInt4067;
	private short[] aShortArray4068;
	static Class105_Sub1 aClass105_Sub1_4069;
	private short[] aShortArray4070;
	static int anInt4071;
	static short[] aShortArray4072;
	static int anInt4073;
	static int anInt4074;
	static int anInt4075;
	private int anInt4076;
	static int anInt4077;
	
	final void method786(byte b, Buffer class23_sub5) {
		for (;;) {
			int i = class23_sub5.readUByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method791(class23_sub5, i, 114);
		}
		anInt4074++;
		if (b <= 5) {
			aClass16_4056 = null;
		}
	}
	
	final Class38_Sub1 method787(int i, byte b) {
		anInt4073++;
		Class38_Sub1 class38_sub1 = (Class38_Sub1) Class23_Sub14.aClass81_2325.method1366((long) anInt4051, (byte) 122);
		if (class38_sub1 == null) {
			Class38_Sub4 class38_sub4 = Class38_Sub4.method1060(Class81.aClass105_1427, anInt4062, 0);
			if (class38_sub4 == null) {
				return null;
			}
			if (aShortArray4068 != null) {
				for (int i_0_ = 0; aShortArray4068.length > i_0_; i_0_++)
					class38_sub4.method1065(aShortArray4068[i_0_], aShortArray4052[i_0_]);
			}
			if (aShortArray4050 != null) {
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (aShortArray4050.length ^ 0xffffffff); i_1_++)
					class38_sub4.method1043(aShortArray4050[i_1_], aShortArray4070[i_1_]);
			}
			class38_sub1 = class38_sub4.method1064(64 - -anInt4057, 850 - -anInt4060, -30, -50, -30);
			Class23_Sub14.aClass81_2325.method1365(b ^ 0x5f, (long) anInt4051, class38_sub1);
		}
		Class38_Sub1 class38_sub1_2_;
		if (anInt4059 == -1 || i == -1) {
			class38_sub1_2_ = class38_sub1.method1005(true, true);
		} else {
			class38_sub1_2_ = Class7.method90(anInt4059, (byte) 122).method832(class38_sub1, i, true);
		}
		if (anInt4058 != 128 || anInt4076 != 128) {
			class38_sub1_2_.method1002(anInt4058, anInt4076, anInt4058);
		}
		if (anInt4067 != 0) {
			if (anInt4067 == 90) {
				class38_sub1_2_.method1009();
			}
			if (anInt4067 == 180) {
				class38_sub1_2_.method1006();
			}
			if (anInt4067 == 270) {
				class38_sub1_2_.method1007();
			}
		}
		if (b != 95) {
			method788((byte) -106, 63, -12);
		}
		return class38_sub1_2_;
	}
	
	static final int method788(byte b, int i, int i_3_) {
		Class23_Sub17 class23_sub17 = (Class23_Sub17) Class23_Sub4_Sub7.anOa2997.a((byte) -53, (long) i);
		anInt4055++;
		if (class23_sub17 == null) {
			return 0;
		}
		if ((i_3_ ^ 0xffffffff) == 0) {
			return 0;
		}
		int i_4_ = 0;
		int i_5_ = 116 % ((b - -34) / 46);
		for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (class23_sub17.anIntArray2364.length ^ 0xffffffff); i_6_++) {
			if (class23_sub17.anIntArray2373[i_6_] == i_3_) {
				i_4_ += class23_sub17.anIntArray2364[i_6_];
			}
		}
		return i_4_;
	}
	
	static final Class23_Sub13_Sub10_Sub1 method789(int i) {
		anInt4053++;
		int i_7_ = Class79.anIntArray1875[0] * Class105.anIntArray1766[0];
		byte[] bs = Class23_Sub13_Sub23.aByteArrayArray4243[0];
		int[] is = new int[i_7_];
		int i_8_ = 0;
		if (i > -79) {
			aClass105_Sub1_4069 = null;
		}
		for (/**/; i_7_ > i_8_; i_8_++)
			is[i_8_] = Class23_Sub4_Sub1.anIntArray2890[Class24.method919(255, bs[i_8_])];
		Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1 = new Class23_Sub13_Sub10_Sub1(Class23_Sub12.anInt2301, Class23_Sub13_Sub15.anInt4033, Class23_Sub23.anIntArray2417[0], Class23_Sub13_Sub2.anIntArray3679[0], Class79.anIntArray1875[0], Class105.anIntArray1766[0], is);
		Class23_Sub13_Sub9.method684(true);
		return class23_sub13_sub10_sub1;
	}
	
	public static void method790(int i) {
		aClass16_4061 = null;
		aClass105_Sub1_4069 = null;
		aClass16_4063 = null;
		if (i != 0) {
			method789(38);
		}
		aClass89_4066 = null;
		aShortArray4072 = null;
		aClass16_4056 = null;
	}
	
	public Class23_Sub13_Sub17() {
		anInt4057 = 0;
		anInt4059 = -1;
		anInt4060 = 0;
		aBoolean4054 = false;
		anInt4067 = 0;
		anInt4076 = 128;
	}
	
	private final void method791(Buffer class23_sub5, int i, int i_9_) {
		if (i == 1) {
			anInt4062 = class23_sub5.getUShortBE();
		} else if (i != 2) {
			if (i == 4) {
				anInt4058 = class23_sub5.getUShortBE();
			} else if (i != 5) {
				if (i == 6) {
					anInt4067 = class23_sub5.getUShortBE();
				} else if (i == 7) {
					anInt4057 = class23_sub5.readUByte();
				} else if (i != 8) {
					if (i != 9) {
						if (i != 40) {
							if (i == 41) {
								int i_10_ = class23_sub5.readUByte();
								aShortArray4050 = new short[i_10_];
								aShortArray4070 = new short[i_10_];
								for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
									aShortArray4050[i_11_] = (short) class23_sub5.getUShortBE();
									aShortArray4070[i_11_] = (short) class23_sub5.getUShortBE();
								}
							}
						} else {
							int i_12_ = class23_sub5.readUByte();
							aShortArray4068 = new short[i_12_];
							aShortArray4052 = new short[i_12_];
							for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_13_++) {
								aShortArray4068[i_13_] = (short) class23_sub5.getUShortBE();
								aShortArray4052[i_13_] = (short) class23_sub5.getUShortBE();
							}
						}
					} else {
						aBoolean4054 = true;
					}
				} else {
					anInt4060 = class23_sub5.readUByte();
				}
			} else {
				anInt4076 = class23_sub5.getUShortBE();
			}
		} else {
			anInt4059 = class23_sub5.getUShortBE();
		}
		anInt4064++;
		if (i_9_ <= 98) {
			aBoolean4054 = true;
		}
	}
	
	static {
		aClass16_4056 = aClass16_4061;
		aClass16_4063 = Class38_Sub6.method1076((byte) 86, "Ung-Ultige Session)2ID)3");
		anInt4071 = 0;
		aShortArray4072 = new short[256];
		aClass89_4066 = new Class89();
		anInt4077 = 0;
	}
}
