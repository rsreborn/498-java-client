/* Class23_Sub13_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub24 extends Class23_Sub13
{
	protected int anInt4263;
	protected int anInt4264;
	static int anInt4265;
	static int anInt4266;
	static Class81 aClass81_4267 = new Class81(5);
	protected int anInt4268;
	static int anInt4269;
	protected int anInt4270;
	static int anInt4271;
	private int anInt4272 = -1;
	static int anInt4273;
	private int anInt4274 = 0;
	static int anInt4275;
	static RSString aClass16_4276 = Class38_Sub6.method1076((byte) 86, ":");
	static RSString aClass16_4277;
	static int[] anIntArray4278 = new int[2000];
	static int[] anIntArray4279;
	static byte aByte4280;
	static RSString aClass16_4281;
	
	public static void method848(byte b) {
		anIntArray4279 = null;
		if (b != -117) {
			method853(99, -77);
		}
		aClass16_4277 = null;
		aClass16_4281 = null;
		aClass16_4276 = null;
		anIntArray4278 = null;
		aClass81_4267 = null;
	}
	
	private final void method849(int i, byte b) {
		anInt4271++;
		double d = (double) ((i & 0xfff906) >> 16) / 256.0;
		double d_0_ = (double) (0xff & i) / 256.0;
		double d_1_ = (double) (i >> 8 & 0xff) / 256.0;
		if (b < 9) {
			aClass16_4281 = null;
		}
		double d_2_ = d;
		double d_3_ = d;
		if (d_2_ > d_1_) {
			d_2_ = d_1_;
		}
		if (d_0_ < d_2_) {
			d_2_ = d_0_;
		}
		double d_4_ = 0.0;
		if (d_1_ > d_3_) {
			d_3_ = d_1_;
		}
		double d_5_ = 0.0;
		if (d_0_ > d_3_) {
			d_3_ = d_0_;
		}
		double d_6_ = (d_3_ + d_2_) / 2.0;
		anInt4264 = (int) (256.0 * d_6_);
		if (d_2_ != d_3_) {
			if (d_3_ == d) {
				d_5_ = (-d_0_ + d_1_) / (-d_2_ + d_3_);
			} else if (d_3_ == d_1_) {
				d_5_ = (d_0_ - d) / (-d_2_ + d_3_) + 2.0;
			} else if (d_3_ == d_0_) {
				d_5_ = (-d_1_ + d) / (d_3_ - d_2_) + 4.0;
			}
			if (d_6_ < 0.5) {
				d_4_ = (d_3_ - d_2_) / (d_2_ + d_3_);
			}
			if (d_6_ >= 0.5) {
				d_4_ = (-d_2_ + d_3_) / (2.0 - d_3_ - d_2_);
			}
		}
		if (d_6_ > 0.5) {
			anInt4268 = (int) (512.0 * ((1.0 - d_6_) * d_4_));
		} else {
			anInt4268 = (int) (d_4_ * d_6_ * 512.0);
		}
		anInt4270 = (int) (256.0 * d_4_);
		if (anInt4270 < 0) {
			anInt4270 = 0;
		} else if (anInt4270 > 255) {
			anInt4270 = 255;
		}
		if (anInt4264 >= 0) {
			if (anInt4264 > 255) {
				anInt4264 = 255;
			}
		} else {
			anInt4264 = 0;
		}
		if (anInt4268 < 1) {
			anInt4268 = 1;
		}
		d_5_ /= 6.0;
		anInt4263 = (int) ((double) anInt4268 * d_5_);
	}
	
	private final void method850(int i, int i_7_, int i_8_, Buffer class23_sub5) {
		anInt4269++;
		if (i == 1) {
			anInt4274 = class23_sub5.getTriByte(111);
			method849(anInt4274, (byte) 29);
		} else if (i != 2) {
			if (i == 3) {
				class23_sub5.getUShortBE();
			}
		} else {
			anInt4272 = class23_sub5.getUShortBE();
			if (anInt4272 == 65535) {
				anInt4272 = -1;
			}
		}
		if (i_8_ != -1) {
			method849(80, (byte) -24);
		}
	}
	
	final void method851(int i, int i_9_, Buffer class23_sub5) {
		if (i_9_ != -29710) {
			method848((byte) 99);
		}
		for (;;) {
			int i_10_ = class23_sub5.readUByte();
			if (i_10_ == 0) {
				break;
			}
			method850(i_10_, i, -1, class23_sub5);
		}
		anInt4265++;
	}
	
	static final int method852(int i, int i_11_, int i_12_) {
		if (i_12_ > i) {
			int i_13_ = i;
			i = i_12_;
			i_12_ = i_13_;
		}
		if (i_11_ <= 65) {
			return 48;
		}
		anInt4266++;
		int i_14_;
		for (/**/; i_12_ != 0; i_12_ = i_14_) {
			i_14_ = i % i_12_;
			i = i_12_;
		}
		return i;
	}
	
	static final ItemDefinition method853(int i, int i_15_) {
		int i_16_ = 44 / ((i - 56) / 60);
		anInt4273++;
		ItemDefinition class23_sub13_sub11 = (ItemDefinition) Class1.aClass5_58.method62(-62, (long) i_15_);
		if (class23_sub13_sub11 != null) {
			return class23_sub13_sub11;
		}
		byte[] bs = Class39.aClass105_620.method1544(Class23_Sub4_Sub4.method285(-21502, i_15_), 0, Class87_Sub4.method1423(i_15_, (byte) -99));
		class23_sub13_sub11 = new ItemDefinition();
		class23_sub13_sub11.id = i_15_;
		if (bs != null) {
			class23_sub13_sub11.method734(new Buffer(bs), (byte) 99);
		}
		class23_sub13_sub11.method733(-1025);
		if ((class23_sub13_sub11.anInt3955 ^ 0xffffffff) != 0) {
			class23_sub13_sub11.method727(127, method853(123, class23_sub13_sub11.anInt3955), method853(-116, class23_sub13_sub11.anInt3961));
		}
		if (class23_sub13_sub11.anInt3915 != -1) {
			class23_sub13_sub11.method740(method853(-80, class23_sub13_sub11.anInt3915), method853(123, class23_sub13_sub11.lendId), (byte) -22);
		}
		if (!Class23_Sub4_Sub27.aBoolean3341 && class23_sub13_sub11.isMembers) {
			class23_sub13_sub11.isUnnoted = false;
			class23_sub13_sub11.anInt3943 = 0;
			class23_sub13_sub11.aClass16Array3945 = null;
			class23_sub13_sub11.name = Class87_Sub1.aClass16_2789;
			class23_sub13_sub11.aClass16Array3910 = null;
		}
		Class1.aClass5_58.method67((long) i_15_, class23_sub13_sub11, true);
		return class23_sub13_sub11;
	}
	
	static {
		anInt4275 = 0;
		aClass16_4281 = null;
		anIntArray4279 = new int[100];
		aClass16_4277 = Class38_Sub6.method1076((byte) 86, "VOLL");
	}
}
