/* Class23_Sub4_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub25 extends Class23_Sub4
{
	static Class105_Sub1 aClass105_Sub1_3302;
	static int anInt3303;
	static RSString aClass16_3304;
	static int anInt3305;
	static int anInt3306 = 0;
	static int anInt3307;
	private boolean aBoolean3308 = true;
	static int anInt3309;
	private boolean aBoolean3310 = true;
	static int anInt3311;
	static int anInt3312;
	static int anInt3313;
	static RSString aClass16_3314;
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		anInt3307++;
		if (i_0_ != 1000) {
			aClass16_3314 = null;
		}
		int i_1_ = i;
	while_102_:
		do {
			do {
				if (i_1_ != 0) {
					if (i_1_ != 1) {
						if (i_1_ == 2) {
							break;
						}
						break while_102_;
					}
				} else {
					aBoolean3310 = class23_sub5.readByte() == 1;
					return;
				}
				aBoolean3308 = class23_sub5.readByte() == 1;
				return;
			} while (false);
			aBoolean2117 = class23_sub5.readByte() == 1;
		} while (false);
	}
	
	final int[] method260(int i, int i_2_) {
		anInt3312++;
		int[] is = aClass99_2115.method1500(i_2_, (byte) -126);
		if (i != 0) {
			return null;
		}
		if (aClass99_2115.aBoolean1681) {
			int[] is_3_ = this.method261(!aBoolean3308 ? i_2_ : Class23_Sub4_Sub1.anInt2892 - i_2_, 0, (byte) 18);
			if (aBoolean3310) {
				for (int i_4_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
					is[i_4_] = is_3_[Class95.anInt1611 - i_4_];
			} else {
				Class3.method55(is_3_, 0, is, 0, Class23_Sub4_Sub33.anInt3428);
			}
		}
		return is;
	}
	
	final int[][] method258(int i, byte b) {
		anInt3305++;
		if (b != 9) {
			method373(null, -37);
		}
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (aClass103_2108.aBoolean1733) {
			int[][] is_5_ = this.method256(0, (byte) -120, !aBoolean3308 ? i : -i + Class23_Sub4_Sub1.anInt2892);
			int[] is_6_ = is_5_[1];
			int[] is_7_ = is_5_[2];
			int[] is_8_ = is_5_[0];
			int[] is_9_ = is[1];
			int[] is_10_ = is[0];
			int[] is_11_ = is[2];
			if (!aBoolean3310) {
				for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_12_++) {
					is_10_[i_12_] = is_8_[i_12_];
					is_9_[i_12_] = is_6_[i_12_];
					is_11_[i_12_] = is_7_[i_12_];
				}
			} else {
				for (int i_13_ = 0; Class23_Sub4_Sub33.anInt3428 > i_13_; i_13_++) {
					is_10_[i_13_] = is_8_[Class95.anInt1611 + -i_13_];
					is_9_[i_13_] = is_6_[Class95.anInt1611 + -i_13_];
					is_11_[i_13_] = is_7_[-i_13_ + Class95.anInt1611];
				}
			}
		}
		return is;
	}
	
	public Class23_Sub4_Sub25() {
		super(1, false);
	}
	
	static final void method373(Class105 class105, int i) {
		if (i < -115) {
			Class17.aClass105_310 = class105;
			Class23_Sub10_Sub2.anInt3604 = Class17.aClass105_310.method1558(26143, 16);
			anInt3313++;
		}
	}
	
	public static void method374(int i) {
		aClass16_3314 = null;
		aClass105_Sub1_3302 = null;
		aClass16_3304 = null;
		if (i != -2) {
			method375(119, 66, -34);
		}
	}
	
	static final void method375(int i, int i_14_, int i_15_) {
		for (int i_16_ = 0; i_16_ < Class23_Sub4_Sub18.anInt3196; i_16_++) {
			for (int i_17_ = 0; i_17_ < Class105.anInt1802; i_17_++) {
				for (int i_18_ = 0; i_18_ < client.anInt1974; i_18_++) {
					Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_16_][i_17_][i_18_];
					if (class23_sub1 != null) {
						Class83 class83 = class23_sub1.aClass83_2031;
						if (class83 != null && class83.aClass38_1463.method998()) {
							Class23_Sub4_Sub30.method391(class83.aClass38_1463, i_16_, i_17_, i_18_, 1, 1);
							if (class83.aClass38_1468 != null && class83.aClass38_1468.method998()) {
								Class23_Sub4_Sub30.method391(class83.aClass38_1468, i_16_, i_17_, i_18_, 1, 1);
								class83.aClass38_1463.method992(class83.aClass38_1468, 0, 0, 0, false);
								class83.aClass38_1468 = class83.aClass38_1468.method994(i, i_14_, i_15_);
							}
							class83.aClass38_1463 = class83.aClass38_1463.method994(i, i_14_, i_15_);
						}
						for (int i_19_ = 0; i_19_ < class23_sub1.anInt2029; i_19_++) {
							Class39 class39 = class23_sub1.aClass39Array2028[i_19_];
							if (class39 != null && class39.aClass38_615.method998()) {
								Class23_Sub4_Sub30.method391(class39.aClass38_615, i_16_, i_17_, i_18_, class39.anInt613 - class39.anInt601 + 1, class39.anInt599 - class39.anInt607 + 1);
								class39.aClass38_615 = class39.aClass38_615.method994(i, i_14_, i_15_);
							}
						}
						Class69 class69 = class23_sub1.aClass69_2034;
						if (class69 != null && class69.aClass38_1219.method998()) {
							Class23_Sub1.method234(class69.aClass38_1219, i_16_, i_17_, i_18_);
							class69.aClass38_1219 = class69.aClass38_1219.method994(i, i_14_, i_15_);
						}
					}
				}
			}
		}
	}
	
	static final int method376(int i, int i_20_) {
		anInt3303++;
		if (i_20_ != 4) {
			anInt3306 = -106;
		}
		double d = (double) (i & 0xff) / 256.0;
		double d_21_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_22_ = (double) ((i & 0xffb3ea) >> 16) / 256.0;
		double d_23_ = d_22_;
		double d_24_ = d_22_;
		if (d_23_ < d_21_) {
			d_23_ = d_21_;
		}
		double d_25_ = 0.0;
		if (d_23_ < d) {
			d_23_ = d;
		}
		double d_26_ = 0.0;
		if (d_21_ < d_24_) {
			d_24_ = d_21_;
		}
		if (d < d_24_) {
			d_24_ = d;
		}
		double d_27_ = (d_24_ + d_23_) / 2.0;
		if (d_24_ != d_23_) {
			if (d_27_ < 0.5) {
				d_26_ = (d_23_ - d_24_) / (d_23_ + d_24_);
			}
			if (d_23_ == d_22_) {
				d_25_ = (-d + d_21_) / (d_23_ - d_24_);
			} else if (d_21_ != d_23_) {
				if (d == d_23_) {
					d_25_ = (-d_21_ + d_22_) / (d_23_ - d_24_) + 4.0;
				}
			} else {
				d_25_ = (-d_22_ + d) / (d_23_ - d_24_) + 2.0;
			}
			if (d_27_ >= 0.5) {
				d_26_ = (-d_24_ + d_23_) / (-d_23_ + 2.0 - d_24_);
			}
		}
		d_25_ /= 6.0;
		int i_28_ = (int) (d_25_ * 256.0);
		int i_29_ = (int) (d_27_ * 256.0);
		if ((i_29_ ^ 0xffffffff) > -1) {
			i_29_ = 0;
		} else if (i_29_ > 255) {
			i_29_ = 255;
		}
		int i_30_ = (int) (256.0 * d_26_);
		if ((i_30_ ^ 0xffffffff) <= -1) {
			if (i_30_ > 255) {
				i_30_ = 255;
			}
		} else {
			i_30_ = 0;
		}
		if (i_29_ <= 243) {
			if (i_29_ <= 217) {
				if (i_29_ <= 192) {
					if (i_29_ > 179) {
						i_30_ >>= 1;
					}
				} else {
					i_30_ >>= 2;
				}
			} else {
				i_30_ >>= 3;
			}
		} else {
			i_30_ >>= 4;
		}
		return (i_28_ >> 2 << 10) + ((i_30_ >> 5 << 7) + (i_29_ >> 1));
	}
	
	static {
		aClass16_3304 = Class38_Sub6.method1076((byte) 86, "Fertigkeit)2");
		anInt3309 = 7759444;
		anInt3311 = 0;
		aClass16_3314 = Class38_Sub6.method1076((byte) 86, "::autoshadow on");
	}
}
