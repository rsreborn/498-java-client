/* Class23_Sub4_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub10 extends Class23_Sub4
{
	static int anInt3042;
	static int anInt3043;
	private int[] anIntArray3044 = new int[257];
	private static RSString aClass16_3045 = Class38_Sub6.method1076((byte) 86, "white:");
	static int anInt3046;
	static RSString aClass16_3047 = aClass16_3045;
	static RSString aClass16_3048;
	static int anInt3049;
	static RSString aClass16_3050 = Class38_Sub6.method1076((byte) 86, " )2> ");
	private int[][] anIntArrayArray3051;
	static int anInt3052;
	static int anInt3053;
	static int anInt3054;
	static int anInt3055;
	static Class81 aClass81_3056;
	static RSString aClass16_3057;
	static int anInt3058;
	static int anInt3059;
	static int anInt3060;
	static int anInt3061;
	static int[] anIntArray3062;
	
	final int[][] method258(int i, byte b) {
		anInt3052++;
		int[][] is = aClass103_2108.method1518(b + -29668, i);
		if (aClass103_2108.aBoolean1733) {
			int[] is_0_ = this.method261(i, 0, (byte) 18);
			int[] is_1_ = is[2];
			int[] is_2_ = is[0];
			int[] is_3_ = is[1];
			for (int i_4_ = 0; Class23_Sub4_Sub33.anInt3428 > i_4_; i_4_++) {
				int i_5_ = is_0_[i_4_] >> 4;
				if (i_5_ < 0) {
					i_5_ = 0;
				}
				if (i_5_ > 256) {
					i_5_ = 256;
				}
				i_5_ = anIntArray3044[i_5_];
				is_2_[i_4_] = Class24.method919(16711680, i_5_) >> 12;
				is_3_[i_4_] = Class24.method919(i_5_ >> 4, 4080);
				is_1_[i_4_] = Class24.method919(4080, i_5_ << 4);
			}
		}
		if (b != 9) {
			anIntArray3062 = null;
		}
		return is;
	}
	
	final void method265(int i) {
		anInt3058++;
		if (i != -21746) {
			anInt3049 = -120;
		}
		if (anIntArrayArray3051 == null) {
			method301(i ^ ~0x649e, 1);
		}
		method303((byte) -119);
	}
	
	private final void method301(int i, int i_6_) {
		anInt3042++;
	while_24_:
		do {
			if ((i_6_ ^ 0xffffffff) != -1) {
				int i_7_ = i_6_;
			while_23_:
				do {
				while_22_:
					do {
					while_21_:
						do {
						while_20_:
							do {
								do {
									if (i_7_ != 1) {
										if (i_7_ != 2) {
											if (i_7_ != 3) {
												if (i_7_ != 4) {
													if (i_7_ != 5) {
														if (i_7_ != 6) {
															break while_23_;
														}
													} else {
														break while_21_;
													}
													break while_22_;
												}
											} else {
												break;
											}
											break while_20_;
										}
									} else {
										anIntArrayArray3051 = new int[2][4];
										anIntArrayArray3051[0][0] = 0;
										anIntArrayArray3051[0][3] = 0;
										anIntArrayArray3051[0][1] = 0;
										anIntArrayArray3051[1][1] = 4096;
										anIntArrayArray3051[0][2] = 0;
										anIntArrayArray3051[1][0] = 4096;
										anIntArrayArray3051[1][3] = 4096;
										anIntArrayArray3051[1][2] = 4096;
										break while_24_;
									}
									anIntArrayArray3051 = new int[8][4];
									anIntArrayArray3051[0][3] = 2361;
									anIntArrayArray3051[0][1] = 2650;
									anIntArrayArray3051[0][2] = 2602;
									anIntArrayArray3051[1][3] = 1558;
									anIntArrayArray3051[2][3] = 1413;
									anIntArrayArray3051[1][1] = 2313;
									anIntArrayArray3051[3][3] = 947;
									anIntArrayArray3051[1][2] = 1799;
									anIntArrayArray3051[0][0] = 0;
									anIntArrayArray3051[4][3] = 722;
									anIntArrayArray3051[2][2] = 1734;
									anIntArrayArray3051[3][2] = 1220;
									anIntArrayArray3051[5][3] = 1766;
									anIntArrayArray3051[6][3] = 915;
									anIntArrayArray3051[4][2] = 963;
									anIntArrayArray3051[1][0] = 2867;
									anIntArrayArray3051[2][1] = 2618;
									anIntArrayArray3051[5][2] = 2152;
									anIntArrayArray3051[3][1] = 2296;
									anIntArrayArray3051[6][2] = 1060;
									anIntArrayArray3051[7][3] = 1140;
									anIntArrayArray3051[2][0] = 3072;
									anIntArrayArray3051[3][0] = 3276;
									anIntArrayArray3051[7][2] = 1413;
									anIntArrayArray3051[4][1] = 2072;
									anIntArrayArray3051[5][1] = 2730;
									anIntArrayArray3051[4][0] = 3481;
									anIntArrayArray3051[5][0] = 3686;
									anIntArrayArray3051[6][0] = 3891;
									anIntArrayArray3051[6][1] = 2232;
									anIntArrayArray3051[7][0] = 4096;
									anIntArrayArray3051[7][1] = 1686;
									break while_24_;
								} while (false);
								anIntArrayArray3051 = new int[7][4];
								anIntArrayArray3051[0][1] = 0;
								anIntArrayArray3051[0][3] = 4096;
								anIntArrayArray3051[1][3] = 4096;
								anIntArrayArray3051[1][1] = 0;
								anIntArrayArray3051[2][3] = 0;
								anIntArrayArray3051[0][0] = 0;
								anIntArrayArray3051[1][0] = 663;
								anIntArrayArray3051[3][3] = 0;
								anIntArrayArray3051[0][2] = 0;
								anIntArrayArray3051[4][3] = 0;
								anIntArrayArray3051[2][1] = 0;
								anIntArrayArray3051[3][1] = 4096;
								anIntArrayArray3051[5][3] = 4096;
								anIntArrayArray3051[1][2] = 4096;
								anIntArrayArray3051[2][0] = 1363;
								anIntArrayArray3051[4][1] = 4096;
								anIntArrayArray3051[2][2] = 4096;
								anIntArrayArray3051[3][2] = 4096;
								anIntArrayArray3051[5][1] = 4096;
								anIntArrayArray3051[6][1] = 0;
								anIntArrayArray3051[3][0] = 2048;
								anIntArrayArray3051[4][0] = 2727;
								anIntArrayArray3051[5][0] = 3411;
								anIntArrayArray3051[6][3] = 4096;
								anIntArrayArray3051[4][2] = 0;
								anIntArrayArray3051[6][0] = 4096;
								anIntArrayArray3051[5][2] = 0;
								anIntArrayArray3051[6][2] = 0;
								break while_24_;
							} while (false);
							anIntArrayArray3051 = new int[6][4];
							anIntArrayArray3051[0][0] = 0;
							anIntArrayArray3051[1][0] = 1843;
							anIntArrayArray3051[0][3] = 0;
							anIntArrayArray3051[1][3] = 1493;
							anIntArrayArray3051[0][2] = 0;
							anIntArrayArray3051[2][0] = 2457;
							anIntArrayArray3051[0][1] = 0;
							anIntArrayArray3051[1][2] = 0;
							anIntArrayArray3051[1][1] = 0;
							anIntArrayArray3051[2][2] = 0;
							anIntArrayArray3051[3][0] = 2781;
							anIntArrayArray3051[3][2] = 1124;
							anIntArrayArray3051[4][0] = 3481;
							anIntArrayArray3051[2][3] = 2939;
							anIntArrayArray3051[2][1] = 0;
							anIntArrayArray3051[3][1] = 0;
							anIntArrayArray3051[5][0] = 4096;
							anIntArrayArray3051[4][2] = 3084;
							anIntArrayArray3051[5][2] = 4096;
							anIntArrayArray3051[3][3] = 3565;
							anIntArrayArray3051[4][3] = 4031;
							anIntArrayArray3051[5][3] = 4096;
							anIntArrayArray3051[4][1] = 546;
							anIntArrayArray3051[5][1] = 4096;
							break while_24_;
						} while (false);
						anIntArrayArray3051 = new int[16][4];
						anIntArrayArray3051[0][2] = 192;
						anIntArrayArray3051[0][0] = 0;
						anIntArrayArray3051[1][0] = 155;
						anIntArrayArray3051[0][1] = 80;
						anIntArrayArray3051[1][2] = 449;
						anIntArrayArray3051[0][3] = 321;
						anIntArrayArray3051[2][0] = 389;
						anIntArrayArray3051[2][2] = 690;
						anIntArrayArray3051[1][3] = 562;
						anIntArrayArray3051[3][2] = 995;
						anIntArrayArray3051[3][0] = 671;
						anIntArrayArray3051[2][3] = 803;
						anIntArrayArray3051[4][2] = 1397;
						anIntArrayArray3051[1][1] = 321;
						anIntArrayArray3051[2][1] = 578;
						anIntArrayArray3051[5][2] = 1429;
						anIntArrayArray3051[4][0] = 897;
						anIntArrayArray3051[3][3] = 1140;
						anIntArrayArray3051[6][2] = 1461;
						anIntArrayArray3051[3][1] = 947;
						anIntArrayArray3051[5][0] = 1175;
						anIntArrayArray3051[7][2] = 1525;
						anIntArrayArray3051[4][3] = 1509;
						anIntArrayArray3051[6][0] = 1368;
						anIntArrayArray3051[5][3] = 1413;
						anIntArrayArray3051[4][1] = 1285;
						anIntArrayArray3051[7][0] = 1507;
						anIntArrayArray3051[6][3] = 1333;
						anIntArrayArray3051[5][1] = 1525;
						anIntArrayArray3051[8][0] = 1736;
						anIntArrayArray3051[9][0] = 2088;
						anIntArrayArray3051[6][1] = 1734;
						anIntArrayArray3051[7][1] = 1413;
						anIntArrayArray3051[10][0] = 2355;
						anIntArrayArray3051[8][2] = 1590;
						anIntArrayArray3051[8][1] = 1108;
						anIntArrayArray3051[11][0] = 2691;
						anIntArrayArray3051[7][3] = 1702;
						anIntArrayArray3051[9][1] = 1766;
						anIntArrayArray3051[8][3] = 2056;
						anIntArrayArray3051[9][2] = 2056;
						anIntArrayArray3051[10][2] = 2586;
						anIntArrayArray3051[10][1] = 2409;
						anIntArrayArray3051[9][3] = 2666;
						anIntArrayArray3051[12][0] = 3031;
						anIntArrayArray3051[11][1] = 3116;
						anIntArrayArray3051[13][0] = 3522;
						anIntArrayArray3051[14][0] = 3727;
						anIntArrayArray3051[15][0] = 4096;
						anIntArrayArray3051[11][2] = 3148;
						anIntArrayArray3051[10][3] = 3276;
						anIntArrayArray3051[12][1] = 3806;
						anIntArrayArray3051[13][1] = 3437;
						anIntArrayArray3051[12][2] = 3710;
						anIntArrayArray3051[13][2] = 3421;
						anIntArrayArray3051[14][1] = 3116;
						anIntArrayArray3051[15][1] = 2377;
						anIntArrayArray3051[14][2] = 3148;
						anIntArrayArray3051[11][3] = 3228;
						anIntArrayArray3051[12][3] = 3196;
						anIntArrayArray3051[13][3] = 3019;
						anIntArrayArray3051[14][3] = 3228;
						anIntArrayArray3051[15][2] = 2505;
						anIntArrayArray3051[15][3] = 2746;
						break while_24_;
					} while (false);
					anIntArrayArray3051 = new int[4][4];
					anIntArrayArray3051[0][3] = 0;
					anIntArrayArray3051[0][1] = 0;
					anIntArrayArray3051[0][2] = 4096;
					anIntArrayArray3051[1][3] = 0;
					anIntArrayArray3051[1][2] = 4096;
					anIntArrayArray3051[1][1] = 4096;
					anIntArrayArray3051[0][0] = 2048;
					anIntArrayArray3051[1][0] = 2867;
					anIntArrayArray3051[2][3] = 0;
					anIntArrayArray3051[2][2] = 4096;
					anIntArrayArray3051[3][3] = 0;
					anIntArrayArray3051[3][2] = 0;
					anIntArrayArray3051[2][1] = 4096;
					anIntArrayArray3051[3][1] = 4096;
					anIntArrayArray3051[2][0] = 3276;
					anIntArrayArray3051[3][0] = 4096;
					break while_24_;
				} while (false);
				throw new RuntimeException("Invalid gradient preset");
			}
		} while (false);
		if (i != 12399) {
			method303((byte) 111);
		}
	}
	
	static final void method302(int i, int i_8_, Class105_Sub1 class105_sub1) {
		anInt3053++;
		if (i_8_ != 5) {
			anInt3046 = 93;
		}
		if (Class89.aClass23_Sub5_1514 != null) {
			Class89.aClass23_Sub5_1514.position = 5 + 8 * i;
			int i_9_ = Class89.aClass23_Sub5_1514.method472(i_8_ + -4);
			int i_10_ = Class89.aClass23_Sub5_1514.method472(i_8_ + -43);
			class105_sub1.method1566(i_10_, 39, i_9_);
		} else {
			Class28.method939(0, 6024, true, 255, (byte) 0, null, 255);
			Class54.aClass105_Sub1Array853[i] = class105_sub1;
		}
	}
	
	public Class23_Sub4_Sub10() {
		super(1, false);
	}
	
	private final void method303(byte b) {
		anInt3054++;
		if (b > -62) {
			method301(-86, -45);
		}
		int i = anIntArrayArray3051.length;
		if ((i ^ 0xffffffff) < -1) {
			for (int i_11_ = 0; i_11_ < 257; i_11_++) {
				int i_12_ = 0;
				int i_13_ = i_11_ << 4;
				for (int i_14_ = 0; i_14_ < i; i_14_++) {
					if (i_13_ < anIntArrayArray3051[i_14_][0]) {
						break;
					}
					i_12_++;
				}
				int i_15_;
				int i_16_;
				int i_17_;
				if (i_12_ >= i) {
					int[] is = anIntArrayArray3051[i + -1];
					i_15_ = is[3];
					i_16_ = is[1];
					i_17_ = is[2];
				} else {
					int[] is = anIntArrayArray3051[i_12_];
					if ((i_12_ ^ 0xffffffff) < -1) {
						int[] is_18_ = anIntArrayArray3051[-1 + i_12_];
						int i_19_ = (-is_18_[0] + i_13_ << 12) / (is[0] - is_18_[0]);
						int i_20_ = -i_19_ + 4096;
						i_15_ = is[3] * i_19_ - -(is_18_[3] * i_20_) >> 12;
						i_16_ = is[1] * i_19_ - -(is_18_[1] * i_20_) >> 12;
						i_17_ = is_18_[2] * i_20_ + is[2] * i_19_ >> 12;
					} else {
						i_16_ = is[1];
						i_17_ = is[2];
						i_15_ = is[3];
					}
				}
				i_16_ >>= 4;
				i_15_ >>= 4;
				if (i_15_ < 0) {
					i_15_ = 0;
				} else if (i_15_ > 255) {
					i_15_ = 255;
				}
				if (i_16_ >= 0) {
					if (i_16_ > 255) {
						i_16_ = 255;
					}
				} else {
					i_16_ = 0;
				}
				i_17_ >>= 4;
				if ((i_17_ ^ 0xffffffff) > -1) {
					i_17_ = 0;
				} else if (i_17_ > 255) {
					i_17_ = 255;
				}
				anIntArray3044[i_11_] = Class65.method1230(Class65.method1230(i_16_ << 16, i_17_ << 8), i_15_);
			}
		}
	}
	
	final void method255(Buffer class23_sub5, int i, int i_21_) {
		if (i_21_ == 1000) {
			if (i == 0) {
				int i_22_ = class23_sub5.readByte();
				if ((i_22_ ^ 0xffffffff) != -1) {
					method301(12399, i_22_);
				} else {
					anIntArrayArray3051 = new int[class23_sub5.readByte()][4];
					for (int i_23_ = 0; i_23_ < anIntArrayArray3051.length; i_23_++) {
						anIntArrayArray3051[i_23_][0] = class23_sub5.readShortBE();
						anIntArrayArray3051[i_23_][1] = class23_sub5.readByte() << 4;
						anIntArrayArray3051[i_23_][2] = class23_sub5.readByte() << 4;
						anIntArrayArray3051[i_23_][3] = class23_sub5.readByte() << 4;
					}
				}
			}
			anInt3043++;
		}
	}
	
	public static void method304(int i) {
		aClass16_3057 = null;
		aClass16_3048 = null;
		if (i != 4096) {
			anIntArray3062 = null;
		}
		anIntArray3062 = null;
		aClass16_3050 = null;
		aClass81_3056 = null;
		aClass16_3045 = null;
		aClass16_3047 = null;
	}
	
	static {
		anInt3049 = -1;
		aClass16_3057 = aClass16_3045;
		aClass16_3048 = Class38_Sub6.method1076((byte) 86, "(Y");
		anInt3059 = 0;
		anInt3055 = 1;
		aClass81_3056 = new Class81(500);
		anInt3060 = -1;
		anInt3061 = 0;
		anIntArray3062 = new int[] { 16, 32, 64, 128 };
	}
}
