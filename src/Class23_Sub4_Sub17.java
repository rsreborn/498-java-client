/* Class23_Sub4_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub17 extends Class23_Sub4
{
	static int[] anIntArray3164;
	static int anInt3165;
	static int anInt3166;
	static int anInt3167 = 1;
	static RSString aClass16_3168 = Class38_Sub6.method1076((byte) 86, "Ladevorgang )2 bitte warten Sie)3");
	static int anInt3169;
	static int[] anIntArray3170 = new int[32768];
	private int anInt3171;
	static int[] anIntArray3172;
	static int anInt3173 = 0;
	static int anInt3174 = 0;
	private int anInt3175 = 1;
	static Class66 aClass66_3176;
	static RSString aClass16_3177 = Class38_Sub6.method1076((byte) 86, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");
	static int anInt3178;
	static int anInt3179;
	static RSString aClass16_3180;
	
	static final boolean method334(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, Class38 class38, int i_7_, boolean bool, long l) {
		for (int i_8_ = i_0_; i_8_ < i_0_ + i_2_; i_8_++) {
			for (int i_9_ = i_1_; i_9_ < i_1_ + i_3_; i_9_++) {
				if (i_8_ < 0 || i_9_ < 0 || i_8_ >= Class105.anInt1802 || i_9_ >= client.anInt1974) {
					return false;
				}
				Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_8_][i_9_];
				if (class23_sub1 != null && class23_sub1.anInt2029 >= 5) {
					return false;
				}
			}
		}
		Class39 class39 = new Class39();
		class39.aLong603 = l;
		class39.anInt598 = i;
		class39.anInt602 = i_4_;
		class39.anInt610 = i_5_;
		class39.anInt608 = i_6_;
		class39.aClass38_615 = class38;
		class39.anInt612 = i_7_;
		class39.anInt601 = i_0_;
		class39.anInt607 = i_1_;
		class39.anInt613 = i_0_ + i_2_ - 1;
		class39.anInt599 = i_1_ + i_3_ - 1;
		for (int i_10_ = i_0_; i_10_ < i_0_ + i_2_; i_10_++) {
			for (int i_11_ = i_1_; i_11_ < i_1_ + i_3_; i_11_++) {
				int i_12_ = 0;
				if (i_10_ > i_0_) {
					i_12_++;
				}
				if (i_10_ < i_0_ + i_2_ - 1) {
					i_12_ += 4;
				}
				if (i_11_ > i_1_) {
					i_12_ += 8;
				}
				if (i_11_ < i_1_ + i_3_ - 1) {
					i_12_ += 2;
				}
				for (int i_13_ = i; i_13_ >= 0; i_13_--) {
					if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_13_][i_10_][i_11_] == null) {
						Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_13_][i_10_][i_11_] = new Class23_Sub1(i_13_, i_10_, i_11_);
					}
				}
				Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_10_][i_11_];
				class23_sub1.aClass39Array2028[class23_sub1.anInt2029] = class39;
				class23_sub1.anIntArray2024[class23_sub1.anInt2029] = i_12_;
				class23_sub1.anInt2040 |= i_12_;
				class23_sub1.anInt2029++;
			}
		}
		if (bool) {
			Class23_Sub4_Sub38.aClass39Array3502[Class23_Sub4.anInt2103++] = class39;
		}
		return true;
	}
	
	final int[][] method258(int i, byte b) {
		anInt3169++;
		if (b != 9) {
			aClass16_3177 = null;
		}
		int[][] is = aClass103_2108.method1518(b ^ ~0x73d3, i);
		if (aClass103_2108.aBoolean1733) {
			int i_14_ = anInt3175 - (-anInt3175 + -1);
			int i_15_ = 65536 / i_14_;
			int i_16_ = anInt3171 + (anInt3171 + 1);
			int i_17_ = 65536 / i_16_;
			int[][][] is_18_ = new int[i_14_][][];
			for (int i_19_ = -anInt3175 + i; i - -anInt3175 >= i_19_; i_19_++) {
				int[][] is_20_ = this.method256(0, (byte) -126, i_19_ & Class23_Sub4_Sub1.anInt2892);
				int i_21_ = 0;
				int[][] is_22_ = new int[3][Class23_Sub4_Sub33.anInt3428];
				int[] is_23_ = is_20_[0];
				int[] is_24_ = is_20_[2];
				int i_25_ = 0;
				int[] is_26_ = is_20_[1];
				int i_27_ = 0;
				for (int i_28_ = -anInt3171; i_28_ <= anInt3171; i_28_++) {
					int i_29_ = i_28_ & Class95.anInt1611;
					i_25_ += is_23_[i_29_];
					i_21_ += is_26_[i_29_];
					i_27_ += is_24_[i_29_];
				}
				int[] is_30_ = is_22_[0];
				int[] is_31_ = is_22_[1];
				int[] is_32_ = is_22_[2];
				int i_33_ = 0;
				while ((Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_33_ ^ 0xffffffff)) {
					is_30_[i_33_] = i_17_ * i_25_ >> 16;
					is_31_[i_33_] = i_21_ * i_17_ >> 16;
					is_32_[i_33_] = i_27_ * i_17_ >> 16;
					int i_34_ = Class95.anInt1611 & -anInt3171 + i_33_;
					i_27_ -= is_24_[i_34_];
					i_25_ -= is_23_[i_34_];
					i_33_++;
					i_21_ -= is_26_[i_34_];
					i_34_ = i_33_ - -anInt3171 & Class95.anInt1611;
					i_21_ += is_26_[i_34_];
					i_25_ += is_23_[i_34_];
					i_27_ += is_24_[i_34_];
				}
				is_18_[i_19_ + anInt3175 - i] = is_22_;
			}
			int[] is_35_ = is[0];
			int[] is_36_ = is[1];
			int[] is_37_ = is[2];
			for (int i_38_ = 0; Class23_Sub4_Sub33.anInt3428 > i_38_; i_38_++) {
				int i_39_ = 0;
				int i_40_ = 0;
				int i_41_ = 0;
				for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_42_++) {
					int[][] is_43_ = is_18_[i_42_];
					i_40_ += is_43_[1][i_38_];
					i_39_ += is_43_[0][i_38_];
					i_41_ += is_43_[2][i_38_];
				}
				is_35_[i_38_] = i_15_ * i_39_ >> 16;
				is_36_[i_38_] = i_40_ * i_15_ >> 16;
				is_37_[i_38_] = i_15_ * i_41_ >> 16;
			}
		}
		return is;
	}
	
	public static void method335(boolean bool) {
		anIntArray3164 = null;
		anIntArray3172 = null;
		if (bool != true) {
			method334(-86, -91, -42, 11, 118, 120, -60, 1, null, 30, false, 47L);
		}
		aClass16_3168 = null;
		aClass66_3176 = null;
		aClass16_3177 = null;
		aClass16_3180 = null;
		anIntArray3170 = null;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_44_) {
		anInt3165++;
		int i_45_ = i;
	while_45_:
		do {
			do {
				if (i_45_ != 0) {
					if (i_45_ != 1) {
						if (i_45_ == 2) {
							break;
						}
						break while_45_;
					}
				} else {
					anInt3171 = class23_sub5.readUByte();
					break while_45_;
				}
				anInt3175 = class23_sub5.readUByte();
				break while_45_;
			} while (false);
			aBoolean2117 = class23_sub5.readUByte() == 1;
		} while (false);
		if (i_44_ != 1000) {
			method335(true);
		}
	}
	
	final int[] method260(int i, int i_46_) {
		if (i != 0) {
			anInt3179 = -103;
		}
		int[] is = aClass99_2115.method1500(i_46_, (byte) -125);
		if (aClass99_2115.aBoolean1681) {
			int i_47_ = anInt3175 + (anInt3175 - -1);
			int i_48_ = 65536 / i_47_;
			int[][] is_49_ = new int[i_47_][];
			int i_50_ = anInt3171 - (-anInt3171 - 1);
			int i_51_ = 65536 / i_50_;
			for (int i_52_ = i_46_ - anInt3175; i_52_ <= i_46_ - -anInt3175; i_52_++) {
				int[] is_53_ = this.method261(Class23_Sub4_Sub1.anInt2892 & i_52_, 0, (byte) 18);
				int[] is_54_ = new int[Class23_Sub4_Sub33.anInt3428];
				int i_55_ = 0;
				for (int i_56_ = -anInt3171; (i_56_ ^ 0xffffffff) >= (anInt3171 ^ 0xffffffff); i_56_++)
					i_55_ += is_53_[i_56_ & Class95.anInt1611];
				int i_57_ = 0;
				while (Class23_Sub4_Sub33.anInt3428 > i_57_) {
					is_54_[i_57_] = i_51_ * i_55_ >> 16;
					i_55_ -= is_53_[Class95.anInt1611 & -anInt3171 + i_57_];
					i_57_++;
					i_55_ += is_53_[Class95.anInt1611 & anInt3171 + i_57_];
				}
				is_49_[-i_46_ + anInt3175 + i_52_] = is_54_;
			}
			for (int i_58_ = 0; (i_58_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_58_++) {
				int i_59_ = 0;
				for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_47_ ^ 0xffffffff); i_60_++)
					i_59_ += is_49_[i_60_][i_58_];
				is[i_58_] = i_59_ * i_48_ >> 16;
			}
		}
		anInt3166++;
		return is;
	}
	
	public Class23_Sub4_Sub17() {
		super(1, false);
		anInt3171 = 1;
	}
	
	static {
		anIntArray3164 = new int[] { 1, -1, -1, 1 };
		anIntArray3172 = new int[1000];
		anInt3179 = 0;
		aClass16_3180 = Class38_Sub6.method1076((byte) 86, "::fpson");
	}
}
