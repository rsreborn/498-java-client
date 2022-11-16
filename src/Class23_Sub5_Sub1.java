/* Class23_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub5_Sub1 extends Buffer
{
	static Class81 aClass81_3527;
	static int anInt3528;
	static int anInt3529;
	static int anInt3530;
	static boolean[] aBooleanArray3531 = new boolean[5];
	static int anInt3532;
	private Class70 aClass70_3533;
	static int anInt3534;
	static int anInt3535;
	static RSString aClass16_3536;
	static int anInt3537;
	static int anInt3538;
	static int anInt3539;
	private int anInt3540;
	static int anInt3541;
	private static RSString aClass16_3542 = Class38_Sub6.method1076((byte) 86, "Please wait 5 minutes before trying again)3");
	static int[] anIntArray3543;
	
	public static void method484(boolean bool) {
		aClass81_3527 = null;
		aClass16_3542 = null;
		if (bool != false) {
			aClass16_3536 = null;
		}
		aBooleanArray3531 = null;
		anIntArray3543 = null;
		aClass16_3536 = null;
	}
	
	final void method485(int i) {
		anInt3538++;
		position = (7 + anInt3540) / 8;
		if (i > -23) {
			aClass81_3527 = null;
		}
	}
	
	final void method486(int i, int i_0_) {
		payload[position++] = (byte) (aClass70_3533.method1261(Class104.method1531(i_0_, 2720)) + i);
		if (i_0_ == 2976) {
			anInt3530++;
		}
	}
	
	final void method487(int i) {
		anInt3540 = 8 * position;
		anInt3537++;
		if (i != 0) {
			method485(40);
		}
	}
	
	final int method488(int i, int i_1_) {
		anInt3532++;
		if (i != 1693770787) {
			method487(47);
		}
		return -anInt3540 + i_1_ * 8;
	}
	
	final int method489(byte b, int i) {
		if (b <= 109) {
			method484(true);
		}
		anInt3528++;
		int i_2_ = anInt3540 >> 3;
		int i_3_ = 0;
		int i_4_ = 8 + -(anInt3540 & 0x7);
		anInt3540 += i;
		for (/**/; i > i_4_; i_4_ = 8) {
			i_3_ += (Class23_Sub8.anIntArray2245[i_4_] & payload[i_2_++]) << -i_4_ + i;
			i -= i_4_;
		}
		if (i == i_4_) {
			i_3_ += Class23_Sub8.anIntArray2245[i_4_] & payload[i_2_];
		} else {
			i_3_ += payload[i_2_] >> -i + i_4_ & Class23_Sub8.anIntArray2245[i];
		}
		return i_3_;
	}
	
	final void method490(int i, int i_5_, int i_6_, byte[] bs) {
		if (i < -28) {
			for (int i_7_ = 0; i_5_ > i_7_; i_7_++)
				bs[i_6_ + i_7_] = (byte) (payload[position++] + -aClass70_3533.method1261(256));
			anInt3529++;
		}
	}
	
	Class23_Sub5_Sub1(int i) {
		super(i);
	}
	
	final int method491(byte b) {
		if (b != 47) {
			method488(-18, -51);
		}
		anInt3534++;
		return payload[position++] + -aClass70_3533.method1261(256) & 0xff;
	}
	
	final void isaacCipher(byte b, int[] is) {
		anInt3535++;
		if (b < -96) {
			aClass70_3533 = new Class70(is);
		}
	}
	
	static {
		anInt3541 = 0;
		aClass16_3536 = aClass16_3542;
		aClass81_3527 = new Class81(50);
	}
}
