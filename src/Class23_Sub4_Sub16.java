/* Class23_Sub4_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub16 extends Class23_Sub4
{
	static int anInt3148;
	private int anInt3149;
	private int[] anIntArray3150 = new int[3];
	static int anInt3151;
	static Class23_Sub24 aClass23_Sub24_3152;
	static int anInt3153;
	private int anInt3154;
	private int anInt3155 = 4096;
	static int anInt3156;
	static int anInt3157;
	private int anInt3158;
	static RSString aClass16_3159 = Class38_Sub6.method1076((byte) 86, "nicht hergestellt werden)3");
	static int anInt3160;
	static byte[] aByteArray3161;
	static int anInt3162;
	static byte[][] aByteArrayArray3163;
	
	static final void method329(byte b) {
		anInt3160++;
		int i = 95 / ((b - -32) / 58);
		Class23_Sub4_Sub18.aClass5_3195.method68(0);
	}
	
	public Class23_Sub4_Sub16() {
		super(1, false);
		anInt3154 = 409;
		anInt3149 = 4096;
		anInt3158 = 4096;
	}
	
	static final void method330(short[] ses, byte b, RSString[] class16s) {
		if (b == -9) {
			anInt3148++;
			Class38_Sub2.method1034(0, false, class16s, -1 + class16s.length, ses);
		}
	}
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		anInt3156++;
		int i_1_ = i;
	while_44_:
		do {
		while_43_:
			do {
			while_42_:
				do {
					do {
						if ((i_1_ ^ 0xffffffff) != -1) {
							if (i_1_ != 1) {
								if (i_1_ != 2) {
									if (i_1_ != 3) {
										if (i_1_ == 4) {
											break while_43_;
										}
										break while_44_;
									}
								} else {
									break;
								}
								break while_42_;
							}
						} else {
							anInt3154 = class23_sub5.getUShortBE();
							break while_44_;
						}
						anInt3155 = class23_sub5.getUShortBE();
						break while_44_;
					} while (false);
					anInt3158 = class23_sub5.getUShortBE();
					break while_44_;
				} while (false);
				anInt3149 = class23_sub5.getUShortBE();
				break while_44_;
			} while (false);
			int i_2_ = class23_sub5.getTriByte(120);
			anIntArray3150[1] = Class24.method919(i_2_ >> 4, 4080);
			anIntArray3150[2] = Class24.method919(255, i_2_) >> 12;
			anIntArray3150[0] = Class24.method919(i_2_ << 4, 267386880);
		} while (false);
		if (i_0_ != 1000) {
			aByteArray3161 = null;
		}
	}
	
	final int[][] method258(int i, byte b) {
		if (b != 9) {
			method332(-53, -32, -13);
		}
		anInt3151++;
		int[][] is = aClass103_2108.method1518(b + -29668, i);
		if (aClass103_2108.aBoolean1733) {
			int[][] is_3_ = this.method256(0, (byte) -111, i);
			int[] is_4_ = is_3_[0];
			int[] is_5_ = is_3_[2];
			int[] is_6_ = is_3_[1];
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int[] is_9_ = is[2];
			for (int i_10_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
				int i_11_ = is_4_[i_10_];
				int i_12_ = i_11_ + -anIntArray3150[0];
				if (i_12_ < 0) {
					i_12_ = -i_12_;
				}
				if (i_12_ > anInt3154) {
					is_7_[i_10_] = i_11_;
					is_8_[i_10_] = is_6_[i_10_];
					is_9_[i_10_] = is_5_[i_10_];
				} else {
					int i_13_ = is_6_[i_10_];
					i_12_ = i_13_ - anIntArray3150[1];
					if (i_12_ < 0) {
						i_12_ = -i_12_;
					}
					if (anInt3154 < i_12_) {
						is_7_[i_10_] = i_11_;
						is_8_[i_10_] = i_13_;
						is_9_[i_10_] = is_5_[i_10_];
					} else {
						int i_14_ = is_5_[i_10_];
						i_12_ = -anIntArray3150[2] + i_14_;
						if ((i_12_ ^ 0xffffffff) > -1) {
							i_12_ = -i_12_;
						}
						if ((i_12_ ^ 0xffffffff) < (anInt3154 ^ 0xffffffff)) {
							is_7_[i_10_] = i_11_;
							is_8_[i_10_] = i_13_;
							is_9_[i_10_] = i_14_;
						} else {
							is_7_[i_10_] = anInt3149 * i_11_ >> 12;
							is_8_[i_10_] = i_13_ * anInt3158 >> 12;
							is_9_[i_10_] = i_14_ * anInt3155 >> 12;
						}
					}
				}
			}
		}
		return is;
	}
	
	public static void method331(int i) {
		aByteArrayArray3163 = null;
		aByteArray3161 = null;
		aClass16_3159 = null;
		aClass23_Sub24_3152 = null;
		if (i < 12) {
			aByteArrayArray3163 = null;
		}
	}
	
	static final int method332(int i, int i_15_, int i_16_) {
		int i_17_ = i_15_ >> 31 & i_16_ - i;
		anInt3157++;
		return (i_15_ + (i_15_ >>> 31)) % i_16_ - -i_17_;
	}
	
	static final void method333(int i, int i_18_) {
		Class87_Sub4.anInt2837 = -1;
		Class46.anInt708 = 1;
		if (i == -257) {
			Class23_Sub13_Sub5.anInt3720 = i_18_;
			anInt3153++;
			Class23_Sub9.anInt2257 = 0;
			Class87.aClass105_1496 = null;
			Class59.anInt931 = -1;
			Class23_Sub4_Sub7.aBoolean3018 = false;
		}
	}
	
	static {
		aClass23_Sub24_3152 = new Class23_Sub24(0, 0);
		aByteArray3161 = new byte[32896];
		int i = 0;
		for (int i_19_ = 0; i_19_ < 256; i_19_++) {
			for (int i_20_ = 0; (i_20_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff); i_20_++)
				aByteArray3161[i++] = (byte) (int) (255.0 / Math.sqrt((double) ((float) (i_19_ * i_19_ + (i_20_ * i_20_ + 65535)) / 65535.0F)));
		}
		anInt3162 = 0;
		aByteArrayArray3163 = new byte[50][];
	}
}
