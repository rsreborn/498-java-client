/* Class23_Sub13_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub15 extends Class23_Sub13
{
	protected int[] anIntArray4017;
	static Class89 aClass89_4018;
	static int anInt4019;
	static int anInt4020;
	static RSString aClass16_4021 = Class38_Sub6.method1076((byte) 86, "Ihr Spielkonto wurde deaktiviert)3");
	static int anInt4022;
	static int anInt4023;
	protected int[] anIntArray4024;
	static int anInt4025;
	protected int[] anIntArray4026;
	static int anInt4027;
	static int anInt4028;
	protected int[] anIntArray4029;
	protected RSString aClass16_4030;
	static int anInt4031;
	static RSString aClass16_4032;
	static int anInt4033;
	static int anInt4034;
	static RSString aClass16_4035;
	static int anInt4036;
	
	public static void method769(int i) {
		aClass16_4032 = null;
		aClass89_4018 = null;
		aClass16_4021 = null;
		aClass16_4035 = null;
		if (i != 0) {
			aClass89_4018 = null;
		}
	}
	
	final int method770(byte b, int i) {
		anInt4023++;
		if (anIntArray4029 == null) {
			return -1;
		}
		if (b >= -1) {
			method775(75, null);
		}
		for (int i_0_ = 0; i_0_ < anIntArray4029.length; i_0_++) {
			if (i == anIntArray4017[i_0_]) {
				return anIntArray4029[i_0_];
			}
		}
		return -1;
	}
	
	static final void method771(Class105 class105, byte b) {
		if (b <= 103) {
			method777(-67, -105, -5);
		}
		anInt4020++;
		Class71.aClass105_1281 = class105;
		Class23_Sub13_Sub25.anInt4289 = Class71.aClass105_1281.method1558(26143, 4);
	}
	
	private final void method772(int i, int i_1_, Buffer class23_sub5) {
		if (i_1_ > 8) {
			if (i == 1) {
				aClass16_4030 = class23_sub5.method426(2);
			} else if (i != 2) {
				if (i == 3) {
					int i_2_ = class23_sub5.readByte();
					anIntArray4029 = new int[i_2_];
					anIntArray4017 = new int[i_2_];
					for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
						anIntArray4029[i_3_] = class23_sub5.readShortBE();
						int i_4_ = class23_sub5.readByte();
						if (i_4_ != 0) {
							anIntArray4017[i_3_] = i_4_;
						} else {
							anIntArray4017[i_3_] = -1;
						}
					}
				}
			} else {
				int i_5_ = class23_sub5.readByte();
				anIntArray4024 = new int[i_5_];
				anIntArray4026 = new int[i_5_];
				for (int i_6_ = 0; (i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
					anIntArray4024[i_6_] = class23_sub5.readShortBE();
					int i_7_ = class23_sub5.readByte();
					if (i_7_ != 0) {
						anIntArray4026[i_6_] = i_7_;
					} else {
						anIntArray4026[i_6_] = -1;
					}
				}
			}
			anInt4022++;
		}
	}
	
	static final int method773(int i, int i_8_, int i_9_) {
		anInt4025++;
		long l = (long) (i + (i_8_ << 16));
		if (i_9_ != 1) {
			method777(96, -65, -99);
		}
		if (Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894 == null || (l ^ 0xffffffffffffffffL) != (Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.aLong358 ^ 0xffffffffffffffffL)) {
			return 0;
		}
		return 1 + 99 * Class23_Sub4_Sub9.aClass23_Sub5_3035.position / (-Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.aByte4302 + Class23_Sub4_Sub9.aClass23_Sub5_3035.payload.length);
	}
	
	final int method774(int i, byte b) {
		anInt4028++;
		if (anIntArray4024 == null) {
			return -1;
		}
		int i_10_ = 119 % ((-82 - b) / 43);
		for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (anIntArray4024.length ^ 0xffffffff); i_11_++) {
			if (i == anIntArray4026[i_11_]) {
				return anIntArray4024[i_11_];
			}
		}
		return -1;
	}
	
	final void method775(int i, Buffer class23_sub5) {
		for (;;) {
			int i_12_ = class23_sub5.readByte();
			if (i_12_ == 0) {
				break;
			}
			method772(i_12_, i ^ 0xd79, class23_sub5);
		}
		if (i == 3342) {
			anInt4027++;
		}
	}
	
	static final boolean method776(boolean bool, Class64 class64) {
		anInt4031++;
		if (bool != true) {
			return true;
		}
		if (class64.anIntArray1114 == null) {
			return false;
		}
		for (int i = 0; (class64.anIntArray1114.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			int i_13_ = Class17_Sub1.method192(-26, i, class64);
			int i_14_ = class64.anIntArray1010[i];
			if (class64.anIntArray1114[i] == 2) {
				if (i_13_ >= i_14_) {
					return false;
				}
			} else if (class64.anIntArray1114[i] != 3) {
				if (class64.anIntArray1114[i] == 4) {
					if ((i_14_ ^ 0xffffffff) == (i_13_ ^ 0xffffffff)) {
						return false;
					}
				} else if (i_14_ != i_13_) {
					return false;
				}
			} else if ((i_14_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff)) {
				return false;
			}
		}
		return true;
	}
	
	static final void method777(int i, int i_15_, int i_16_) {
		anInt4019++;
		long l = (long) (i_15_ + (i_16_ << 16));
		if (i != -5) {
			aClass89_4018 = null;
		}
		Class23_Sub13_Sub26 class23_sub13_sub26 = (Class23_Sub13_Sub26) Class29.anOa451.a((byte) -94, l);
		if (class23_sub13_sub26 != null) {
			Class23_Sub4_Sub39.aClass27_3520.method934(0, class23_sub13_sub26);
		}
	}
	
	static {
		aClass89_4018 = new Class89();
		aClass16_4032 = Class38_Sub6.method1076((byte) 86, "Startseite auf (WSpielkonto wiederherstellen(W)3");
		aClass16_4035 = Class38_Sub6.method1076((byte) 86, "(Udns");
		anInt4034 = 0;
		anInt4036 = 0;
	}
}
