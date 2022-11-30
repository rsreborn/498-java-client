/* Class23_Sub4_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class23_Sub4_Sub23 extends Class23_Sub4
{
	protected int anInt3272;
	static int anInt3273;
	private int anInt3274 = -1;
	static RSString aClass16_3275 = Class38_Sub6.method1076((byte) 86, ":duelstake:");
	static int anInt3276;
	protected int[] anIntArray3277;
	static int anInt3278;
	static int anInt3279;
	static int anInt3280 = 0;
	static int anInt3281;
	static int[] anIntArray3282;
	static int anInt3283;
	protected int anInt3284;
	static int[] anIntArray3285;
	static int anInt3286;
	static int anInt3287;
	static RSString aClass16_3288;
	static volatile int anInt3289 = 0;
	static int anInt3290;
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		if (i == 0) {
			anInt3274 = class23_sub5.readShortBE();
		}
		if (i_0_ == 1000) {
			anInt3290++;
		}
	}
	
	static final RSString method360(byte b, int i) {
		if (b != -9) {
			method362(-17);
		}
		anInt3273++;
		return Class23_Sub24.method903(false, 10, b ^ 0x5b17, i);
	}
	
	final void method254(int i) {
		anInt3276++;
		super.method254(i);
		anIntArray3277 = null;
	}
	
	int[][] method258(int i, byte b) {
		anInt3278++;
		if (b != 9) {
			method258(-9, (byte) -13);
		}
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (aClass103_2108.aBoolean1733 && method361(88)) {
			int[] is_1_ = is[0];
			int[] is_2_ = is[1];
			int[] is_3_ = is[2];
			int i_4_ = anInt3284 * ((Class102.anInt1706 ^ 0xffffffff) != (anInt3272 ^ 0xffffffff) ? anInt3272 * i / Class102.anInt1706 : i);
			if (Class23_Sub4_Sub33.anInt3428 == anInt3284) {
				for (int i_5_ = 0; Class23_Sub4_Sub33.anInt3428 > i_5_; i_5_++) {
					int i_6_ = anIntArray3277[i_4_++];
					is_3_[i_5_] = Class24.method919(i_6_ << 4, 4080);
					is_2_[i_5_] = Class24.method919(i_6_ >> 4, 4080);
					is_1_[i_5_] = Class24.method919(16711680, i_6_) >> 12;
				}
			} else {
				for (int i_7_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
					int i_8_ = i_7_ * anInt3284 / Class23_Sub4_Sub33.anInt3428;
					int i_9_ = anIntArray3277[i_8_ + i_4_];
					is_3_[i_7_] = Class24.method919(255, i_9_) << 4;
					is_2_[i_7_] = Class24.method919(i_9_, 65280) >> 4;
					is_1_[i_7_] = Class24.method919(4080, i_9_ >> 12);
				}
			}
		}
		return is;
	}
	
	final boolean method361(int i) {
		if (i < 86) {
			anInt3279 = 65;
		}
		anInt3286++;
		if (anIntArray3277 != null) {
			return true;
		}
		if ((anInt3274 ^ 0xffffffff) <= -1) {
			Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1 = Class63.method1209(anInt3274, Class53.aClass105_847, 0);
			class23_sub13_sub10_sub1.method717();
			anInt3284 = class23_sub13_sub10_sub1.anInt3873;
			anInt3272 = class23_sub13_sub10_sub1.anInt3869;
			anIntArray3277 = class23_sub13_sub10_sub1.anIntArray4502;
			return true;
		}
		return false;
	}
	
	public Class23_Sub4_Sub23() {
		super(0, false);
	}
	
	public static void method362(int i) {
		aClass16_3288 = null;
		anIntArray3285 = null;
		aClass16_3275 = null;
		if (i != 10) {
			method360((byte) -50, 17);
		}
		anIntArray3282 = null;
	}
	
	final int method262(int i) {
		anInt3287++;
		int i_10_ = 118 % ((57 - i) / 63);
		return anInt3274;
	}
	
	static {
		aClass16_3288 = Class38_Sub6.method1076((byte) 86, ")4l");
	}
}
