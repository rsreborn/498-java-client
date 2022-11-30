/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class72
{
	static int anInt1282;
	static int anInt1283;
	static int anInt1284;
	static int anInt1285;
	static Class89 aClass89_1286 = new Class89();
	private int anInt1287;
	static int anInt1288;
	static int anInt1289;
	protected int[][] anIntArrayArray1290;
	private int anInt1291;
	static int anInt1292;
	private int anInt1293;
	static RSString aClass16_1294 = Class38_Sub6.method1076((byte) 86, ":clan:");
	static int anInt1295;
	static int anInt1296;
	static RSString[] aClass16Array1297 = new RSString[100];
	static int anInt1298;
	static int anInt1299;
	static int anInt1300;
	static RSString aClass16_1301;
	static int anInt1302;
	static Class43_Sub1[] aClass43_Sub1Array1303;
	static int anInt1304;
	static int anInt1305;
	static int anInt1306;
	private int anInt1307;
	static int anInt1308;
	static int anInt1309;
	static boolean aBoolean1310;
	static RSString aClass16_1311;
	static RSString aClass16_1312 = Class38_Sub6.method1076((byte) 86, "Ablegen");
	static int anInt1313;
	private static RSString aClass16_1314;
	
	final boolean method1290(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, byte b) {
		anInt1306++;
		if (i_3_ > 1) {
			if (method1294((byte) -41, i, i_2_, i_4_, i_3_, i_1_, i_3_, i_6_, i_0_)) {
				return true;
			}
			return method1304(i_5_, i_3_, i_6_, i_0_, i_4_, i_3_, 115, i_2_, i_1_, i);
		}
		if (b != -124) {
			return true;
		}
		int i_7_ = -1 + i_2_ + i_0_;
		int i_8_ = i_6_ + i - 1;
		if (i_0_ <= i_1_ && i_7_ >= i_1_ && i_4_ >= i && i_4_ <= i_8_) {
			return true;
		}
		if ((i_0_ + -1 ^ 0xffffffff) == (i_1_ ^ 0xffffffff) && i <= i_4_ && (i_4_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff) && (0x8 & anIntArrayArray1290[i_1_ + -anInt1291][i_4_ + -anInt1307]) == 0 && (0x8 & i_5_ ^ 0xffffffff) == -1) {
			return true;
		}
		if (i_1_ == 1 + i_7_ && i <= i_4_ && i_8_ >= i_4_ && (anIntArrayArray1290[-anInt1291 + i_1_][-anInt1307 + i_4_] & 0x80) == 0 && (0x2 & i_5_ ^ 0xffffffff) == -1) {
			return true;
		}
		if (-1 + i == i_4_ && i_0_ <= i_1_ && i_7_ >= i_1_ && (0x2 & anIntArrayArray1290[i_1_ + -anInt1291][-anInt1307 + i_4_]) == 0 && (0x4 & i_5_ ^ 0xffffffff) == -1) {
			return true;
		}
		if (i_4_ == i_8_ + 1 && (i_0_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff) && (i_7_ ^ 0xffffffff) <= (i_1_ ^ 0xffffffff) && (anIntArrayArray1290[-anInt1291 + i_1_][-anInt1307 + i_4_] & 0x20) == 0 && (0x1 & i_5_ ^ 0xffffffff) == -1) {
			return true;
		}
		return false;
	}
	
	static final int[] method1291(int i, int[] is) {
		anInt1308++;
		if (is == null) {
			return null;
		}
		int[] is_9_ = new int[is.length];
		Class3.method55(is, 0, is_9_, i, is.length);
		return is_9_;
	}
	
	final void method1292(byte b, int i, int i_10_) {
		anInt1298++;
		int i_11_ = -108 % ((43 - b) / 57);
		i_10_ -= anInt1291;
		i -= anInt1307;
		anIntArrayArray1290[i_10_][i] = Class65.method1230(anIntArrayArray1290[i_10_][i], 2097152);
	}
	
	final void method1293(boolean bool, int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		i -= anInt1307;
		int i_16_ = i_14_;
		i_15_ -= anInt1291;
		if (bool) {
			i_16_ += 131072;
		}
		anInt1282++;
		for (int i_17_ = i_15_; (i_13_ + i_15_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
			if (i_17_ >= 0 && i_17_ < anInt1293) {
				for (int i_18_ = i; i_18_ < i - -i_12_; i_18_++) {
					if (i_18_ >= 0 && anInt1287 > i_18_) {
						method1296(i_17_, i_16_, false, i_18_);
					}
				}
			}
		}
	}
	
	private final boolean method1294(byte b, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		anInt1288++;
		if (b != -41) {
			return false;
		}
		if (i_22_ >= i_19_ + i_25_ || i_21_ + i_22_ <= i_25_) {
			return false;
		}
		if (i - -i_24_ <= i_20_ || i_20_ - -i_23_ <= i) {
			return false;
		}
		return true;
	}
	
	final void method1295(boolean bool, boolean bool_26_, int i, int i_27_, int i_28_, int i_29_) {
		anInt1295++;
		if (bool == true) {
			i_29_ -= anInt1307;
			i -= anInt1291;
			if ((i_27_ ^ 0xffffffff) == -1) {
				if (i_28_ == 0) {
					method1302((byte) -71, i_29_, i, 128);
					method1302((byte) -124, i_29_, -1 + i, 8);
				}
				if (i_28_ == 1) {
					method1302((byte) -97, i_29_, i, 2);
					method1302((byte) -128, 1 + i_29_, i, 32);
				}
				if (i_28_ == 2) {
					method1302((byte) -22, i_29_, i, 8);
					method1302((byte) -109, i_29_, 1 + i, 128);
				}
				if (i_28_ == 3) {
					method1302((byte) -72, i_29_, i, 32);
					method1302((byte) -49, i_29_ + -1, i, 2);
				}
			}
			if (i_27_ == 1 || i_27_ == 3) {
				if (i_28_ == 0) {
					method1302((byte) -48, i_29_, i, 1);
					method1302((byte) -29, 1 + i_29_, i + -1, 16);
				}
				if (i_28_ == 1) {
					method1302((byte) -3, i_29_, i, 4);
					method1302((byte) -82, 1 + i_29_, 1 + i, 64);
				}
				if (i_28_ == 2) {
					method1302((byte) -9, i_29_, i, 16);
					method1302((byte) -47, -1 + i_29_, 1 + i, 1);
				}
				if (i_28_ == 3) {
					method1302((byte) -6, i_29_, i, 64);
					method1302((byte) -81, -1 + i_29_, i - 1, 4);
				}
			}
			if (i_27_ == 2) {
				if (i_28_ == 0) {
					method1302((byte) -29, i_29_, i, 130);
					method1302((byte) -24, i_29_, -1 + i, 8);
					method1302((byte) -2, 1 + i_29_, i, 32);
				}
				if (i_28_ == 1) {
					method1302((byte) -42, i_29_, i, 10);
					method1302((byte) -68, i_29_ - -1, i, 32);
					method1302((byte) -60, i_29_, 1 + i, 128);
				}
				if (i_28_ == 2) {
					method1302((byte) -38, i_29_, i, 40);
					method1302((byte) -71, i_29_, i + 1, 128);
					method1302((byte) -55, -1 + i_29_, i, 2);
				}
				if (i_28_ == 3) {
					method1302((byte) -113, i_29_, i, 160);
					method1302((byte) -45, -1 + i_29_, i, 2);
					method1302((byte) -118, i_29_, -1 + i, 8);
				}
			}
			if (bool_26_) {
				if ((i_27_ ^ 0xffffffff) == -1) {
					if (i_28_ == 0) {
						method1302((byte) -6, i_29_, i, 65536);
						method1302((byte) -60, i_29_, i - 1, 4096);
					}
					if (i_28_ == 1) {
						method1302((byte) -23, i_29_, i, 1024);
						method1302((byte) -68, 1 + i_29_, i, 16384);
					}
					if (i_28_ == 2) {
						method1302((byte) -68, i_29_, i, 4096);
						method1302((byte) -23, i_29_, 1 + i, 65536);
					}
					if (i_28_ == 3) {
						method1302((byte) -8, i_29_, i, 16384);
						method1302((byte) -70, -1 + i_29_, i, 1024);
					}
				}
				if (i_27_ == 1 || i_27_ == 3) {
					if (i_28_ == 0) {
						method1302((byte) -47, i_29_, i, 512);
						method1302((byte) -52, 1 + i_29_, i + -1, 8192);
					}
					if (i_28_ == 1) {
						method1302((byte) -124, i_29_, i, 2048);
						method1302((byte) -16, 1 + i_29_, 1 + i, 32768);
					}
					if (i_28_ == 2) {
						method1302((byte) -67, i_29_, i, 8192);
						method1302((byte) -35, i_29_ + -1, 1 + i, 512);
					}
					if (i_28_ == 3) {
						method1302((byte) -111, i_29_, i, 32768);
						method1302((byte) -56, i_29_ - 1, i - 1, 2048);
					}
				}
				if (i_27_ == 2) {
					if (i_28_ == 0) {
						method1302((byte) -73, i_29_, i, 66560);
						method1302((byte) -83, i_29_, -1 + i, 4096);
						method1302((byte) -28, 1 + i_29_, i, 16384);
					}
					if (i_28_ == 1) {
						method1302((byte) -39, i_29_, i, 5120);
						method1302((byte) -20, i_29_ - -1, i, 16384);
						method1302((byte) -22, i_29_, i - -1, 65536);
					}
					if (i_28_ == 2) {
						method1302((byte) -25, i_29_, i, 20480);
						method1302((byte) -61, i_29_, 1 + i, 65536);
						method1302((byte) -60, i_29_ + -1, i, 1024);
					}
					if (i_28_ == 3) {
						method1302((byte) -4, i_29_, i, 81920);
						method1302((byte) -96, -1 + i_29_, i, 1024);
						method1302((byte) -126, i_29_, -1 + i, 4096);
					}
				}
			}
		}
	}
	
	private final void method1296(int i, int i_30_, boolean bool, int i_31_) {
		if (bool == false) {
			anIntArrayArray1290[i][i_31_] = Class65.method1230(anIntArrayArray1290[i][i_31_], i_30_);
			anInt1289++;
		}
	}
	
	final void method1297(int i, int i_32_, int i_33_) {
		anInt1296++;
		i_33_ -= anInt1307;
		int i_34_ = -22 % ((i_32_ - 16) / 58);
		i -= anInt1291;
		anIntArrayArray1290[i][i_33_] = Class65.method1230(anIntArrayArray1290[i][i_33_], 262144);
	}
	
	final void method1298(int i) {
		anInt1313++;
		if (i <= 93) {
			method1298(103);
		}
		for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (anInt1293 ^ 0xffffffff); i_35_++) {
			for (int i_36_ = 0; anInt1287 > i_36_; i_36_++) {
				if (i_35_ != 0 && i_36_ != 0 && (-5 + anInt1293 ^ 0xffffffff) < (i_35_ ^ 0xffffffff) && (i_36_ ^ 0xffffffff) > (-5 + anInt1287 ^ 0xffffffff)) {
					anIntArrayArray1290[i_35_][i_36_] = 16777216;
				} else {
					anIntArrayArray1290[i_35_][i_36_] = 16777215;
				}
			}
		}
	}
	
	final void method1299(int i, int i_37_, int i_38_, boolean bool, int i_39_, int i_40_, int i_41_) {
		anInt1283++;
		i -= anInt1291;
		i_41_ -= anInt1307;
		if (i_38_ != 31317) {
			anInt1293 = 95;
		}
		int i_42_ = 256;
		if (i_40_ == 1 || i_40_ == 3) {
			int i_43_ = i_37_;
			i_37_ = i_39_;
			i_39_ = i_43_;
		}
		if (bool) {
			i_42_ += 131072;
		}
		for (int i_44_ = i; (i + i_37_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++) {
			if ((i_44_ ^ 0xffffffff) <= -1 && anInt1293 > i_44_) {
				for (int i_45_ = i_41_; i_45_ < i_39_ + i_41_; i_45_++) {
					if (i_45_ >= 0 && (i_45_ ^ 0xffffffff) > (anInt1287 ^ 0xffffffff)) {
						method1302((byte) -38, i_45_, i_44_, i_42_);
					}
				}
			}
		}
	}
	
	public static void method1300(int i) {
		if (i != 0) {
			aClass16_1314 = null;
		}
		aClass16Array1297 = null;
		aClass16_1311 = null;
		aClass16_1294 = null;
		aClass16_1314 = null;
		aClass16_1312 = null;
		aClass89_1286 = null;
		aClass16_1301 = null;
		aClass43_Sub1Array1303 = null;
	}
	
	static final void method1301(int i, Buffer class23_sub5, int i_46_, int i_47_, boolean bool, int i_48_, byte b, int i_49_, int i_50_) {
		if (b < -114) {
			anInt1285++;
			if ((i_47_ ^ 0xffffffff) <= -1 && i_47_ < 104 && (i ^ 0xffffffff) <= -1 && i < 104) {
				if (!bool) {
					Class23_Sub4_Sub30.aByteArrayArrayArray3379[i_46_][i_47_][i] = (byte) 0;
				}
				for (;;) {
					int i_51_ = class23_sub5.readByte();
					if ((i_51_ ^ 0xffffffff) == -1) {
						if (bool) {
							Class17.anIntArrayArrayArray301[0][i_47_][i] = Class23_Sub4_Sub12.anIntArrayArrayArray3080[0][i_47_][i];
						} else {
							if ((i_46_ ^ 0xffffffff) == -1) {
								Class17.anIntArrayArrayArray301[0][i_47_][i] = 8 * -Class23_Sub4_Sub22.method354(-118, i + (556238 + i_50_), i_48_ + (i_47_ + 932731));
							} else {
								Class17.anIntArrayArrayArray301[i_46_][i_47_][i] = Class17.anIntArrayArrayArray301[-1 + i_46_][i_47_][i] + -240;
								break;
							}
							break;
						}
						break;
					}
					if (i_51_ == 1) {
						int i_52_ = class23_sub5.readByte();
						if (bool) {
							Class17.anIntArrayArrayArray301[0][i_47_][i] = Class23_Sub4_Sub12.anIntArrayArrayArray3080[0][i_47_][i] + i_52_ * 8;
						} else {
							if (i_52_ == 1) {
								i_52_ = 0;
							}
							if ((i_46_ ^ 0xffffffff) == -1) {
								Class17.anIntArrayArrayArray301[0][i_47_][i] = 8 * -i_52_;
							} else {
								Class17.anIntArrayArrayArray301[i_46_][i_47_][i] = Class17.anIntArrayArrayArray301[-1 + i_46_][i_47_][i] + -(i_52_ * 8);
								break;
							}
							break;
						}
						break;
					}
					if (i_51_ <= 49) {
						Class23_Sub4_Sub18.aByteArrayArrayArray3198[i_46_][i_47_][i] = class23_sub5.method452(-16933672);
						Class23_Sub4_Sub30.aByteArrayArrayArray3385[i_46_][i_47_][i] = (byte) ((i_51_ - 2) / 4);
						Class23_Sub4_Sub22.aByteArrayArrayArray3257[i_46_][i_47_][i] = (byte) Class24.method919(3, -2 + (i_51_ + i_49_));
					} else if (i_51_ <= 81) {
						if (!bool) {
							Class23_Sub4_Sub30.aByteArrayArrayArray3379[i_46_][i_47_][i] = (byte) (i_51_ + -49);
						}
					} else {
						Class23_Sub13_Sub10.aByteArrayArrayArray3872[i_46_][i_47_][i] = (byte) (i_51_ - 81);
					}
				}
			} else {
				for (;;) {
					int i_53_ = class23_sub5.readByte();
					if (i_53_ == 0) {
						break;
					}
					if (i_53_ == 1) {
						class23_sub5.readByte();
						break;
					}
					if (i_53_ <= 49) {
						class23_sub5.readByte();
					}
				}
			}
		}
	}
	
	private final void method1302(byte b, int i, int i_54_, int i_55_) {
		anIntArrayArray1290[i_54_][i] = Class24.method919(anIntArrayArray1290[i_54_][i], i_55_ ^ 0xffffffff);
		if (b >= -1) {
			anInt1307 = 54;
		}
		anInt1309++;
	}
	
	final boolean method1303(int i, byte b, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_) {
		anInt1305++;
		if (i_61_ != 1) {
			if (i >= i_57_ && i <= -1 + (i_57_ + i_61_) && i_58_ >= i_58_ && (i_58_ ^ 0xffffffff) >= (-1 + (i_58_ + i_61_) ^ 0xffffffff)) {
				return true;
			}
		} else if ((i ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && i_56_ == i_58_) {
			return true;
		}
		i -= anInt1291;
		i_58_ -= anInt1307;
		i_57_ -= anInt1291;
		i_56_ -= anInt1307;
		if (b < 52) {
			aClass89_1286 = null;
		}
		if (i_61_ == 1) {
			if (i_60_ == 6 || i_60_ == 7) {
				if (i_60_ == 7) {
					i_59_ = i_59_ - -2 & 0x3;
				}
				if (i_59_ == 0) {
					if ((i_57_ ^ 0xffffffff) == (1 + i ^ 0xffffffff) && (i_56_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff) && (0x80 & anIntArrayArray1290[i_57_][i_56_]) == 0) {
						return true;
					}
					if ((i ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && (i_56_ ^ 0xffffffff) == (i_58_ - 1 ^ 0xffffffff) && (anIntArrayArray1290[i_57_][i_56_] & 0x2 ^ 0xffffffff) == -1) {
						return true;
					}
				} else if (i_59_ == 1) {
					if ((i_57_ ^ 0xffffffff) == (-1 + i ^ 0xffffffff) && i_56_ == i_58_ && (0x8 & anIntArrayArray1290[i_57_][i_56_] ^ 0xffffffff) == -1) {
						return true;
					}
					if ((i_57_ ^ 0xffffffff) == (i ^ 0xffffffff) && i_56_ == i_58_ - 1 && (anIntArrayArray1290[i_57_][i_56_] & 0x2) == 0) {
						return true;
					}
				} else if (i_59_ == 2) {
					if ((i + -1 ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && (i_58_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (anIntArrayArray1290[i_57_][i_56_] & 0x8) == 0) {
						return true;
					}
					if ((i ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && (i_58_ + 1 ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (0x20 & anIntArrayArray1290[i_57_][i_56_] ^ 0xffffffff) == -1) {
						return true;
					}
				} else if (i_59_ == 3) {
					if ((1 + i ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && (i_56_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff) && (0x80 & anIntArrayArray1290[i_57_][i_56_]) == 0) {
						return true;
					}
					if ((i ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && i_56_ == i_58_ - -1 && (0x20 & anIntArrayArray1290[i_57_][i_56_]) == 0) {
						return true;
					}
				}
			}
			if (i_60_ == 8) {
				if (i == i_57_ && (i_56_ ^ 0xffffffff) == (i_58_ - -1 ^ 0xffffffff) && (anIntArrayArray1290[i_57_][i_56_] & 0x20) == 0) {
					return true;
				}
				if ((i ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && -1 + i_58_ == i_56_ && (0x2 & anIntArrayArray1290[i_57_][i_56_]) == 0) {
					return true;
				}
				if (i_57_ == i + -1 && i_56_ == i_58_ && (0x8 & anIntArrayArray1290[i_57_][i_56_] ^ 0xffffffff) == -1) {
					return true;
				}
				if ((i_57_ ^ 0xffffffff) == (i + 1 ^ 0xffffffff) && i_56_ == i_58_ && (anIntArrayArray1290[i_57_][i_56_] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			int i_62_ = i_61_ + i_57_ - 1;
			int i_63_ = -1 + (i_56_ - -i_61_);
			if (i_60_ == 6 || i_60_ == 7) {
				if (i_60_ == 7) {
					i_59_ = 0x3 & 2 + i_59_;
				}
				if ((i_59_ ^ 0xffffffff) == -1) {
					if (i + 1 == i_57_ && i_58_ >= i_56_ && (i_58_ ^ 0xffffffff) >= (i_63_ ^ 0xffffffff) && (anIntArrayArray1290[i_57_][i_58_] & 0x80) == 0) {
						return true;
					}
					if ((i ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) && i <= i_62_ && (-i_61_ + i_58_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (0x2 & anIntArrayArray1290[i][i_63_]) == 0) {
						return true;
					}
				} else if (i_59_ != 1) {
					if (i_59_ == 2) {
						if ((i_57_ ^ 0xffffffff) == (i - i_61_ ^ 0xffffffff) && i_56_ <= i_58_ && i_58_ <= i_63_ && (0x8 & anIntArrayArray1290[i_62_][i_58_] ^ 0xffffffff) == -1) {
							return true;
						}
						if (i_57_ <= i && (i_62_ ^ 0xffffffff) <= (i ^ 0xffffffff) && i_58_ - -1 == i_56_ && (0x20 & anIntArrayArray1290[i][i_56_] ^ 0xffffffff) == -1) {
							return true;
						}
					} else if (i_59_ == 3) {
						if (1 + i == i_57_ && i_56_ <= i_58_ && i_58_ <= i_63_ && (0x80 & anIntArrayArray1290[i_57_][i_58_] ^ 0xffffffff) == -1) {
							return true;
						}
						if (i >= i_57_ && i <= i_62_ && (1 + i_58_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (anIntArrayArray1290[i][i_56_] & 0x20) == 0) {
							return true;
						}
					}
				} else {
					if (-i_61_ + i == i_57_ && i_58_ >= i_56_ && i_63_ >= i_58_ && (anIntArrayArray1290[i_62_][i_58_] & 0x8) == 0) {
						return true;
					}
					if (i_57_ <= i && (i_62_ ^ 0xffffffff) <= (i ^ 0xffffffff) && -i_61_ + i_58_ == i_56_ && (anIntArrayArray1290[i][i_63_] & 0x2) == 0) {
						return true;
					}
				}
			}
			if (i_60_ == 8) {
				if (i_57_ <= i && (i ^ 0xffffffff) >= (i_62_ ^ 0xffffffff) && 1 + i_58_ == i_56_ && (anIntArrayArray1290[i][i_56_] & 0x20) == 0) {
					return true;
				}
				if ((i_57_ ^ 0xffffffff) >= (i ^ 0xffffffff) && (i ^ 0xffffffff) >= (i_62_ ^ 0xffffffff) && (i_56_ ^ 0xffffffff) == (-i_61_ + i_58_ ^ 0xffffffff) && (0x2 & anIntArrayArray1290[i][i_63_]) == 0) {
					return true;
				}
				if (i_57_ == -i_61_ + i && i_58_ >= i_56_ && i_58_ <= i_63_ && (0x8 & anIntArrayArray1290[i_62_][i_58_]) == 0) {
					return true;
				}
				if ((1 + i ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && i_56_ <= i_58_ && i_63_ >= i_58_ && (anIntArrayArray1290[i_57_][i_58_] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	private final boolean method1304(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_) {
		anInt1299++;
		int i_73_ = i_67_ + i_64_;
		int i_74_ = i_71_ + i_68_;
		int i_75_ = i_70_ + i_66_;
		int i_76_ = i_65_ + i_72_;
		if (i_66_ <= i_71_ && i_71_ < i_75_) {
			if (i_72_ == i_73_ && (i & 0x4) == 0) {
				int i_77_ = i_71_;
				for (int i_78_ = i_75_ < i_74_ ? i_75_ : i_74_; i_78_ > i_77_; i_77_++) {
					if ((anIntArrayArray1290[i_77_ - anInt1291][-1 + -anInt1307 + i_73_] & 0x2) == 0) {
						return true;
					}
				}
			} else if (i_76_ == i_67_ && (i & 0x1) == 0) {
				int i_79_ = i_71_;
				for (int i_80_ = i_74_ <= i_75_ ? i_74_ : i_75_; (i_79_ ^ 0xffffffff) > (i_80_ ^ 0xffffffff); i_79_++) {
					if ((anIntArrayArray1290[-anInt1291 + i_79_][-anInt1307 + i_67_] & 0x20 ^ 0xffffffff) == -1) {
						return true;
					}
				}
			}
		} else if (i_66_ < i_74_ && i_75_ >= i_74_) {
			if ((i_73_ ^ 0xffffffff) == (i_72_ ^ 0xffffffff) && (0x4 & i ^ 0xffffffff) == -1) {
				for (int i_81_ = i_66_; (i_74_ ^ 0xffffffff) < (i_81_ ^ 0xffffffff); i_81_++) {
					if ((anIntArrayArray1290[i_81_ - anInt1291][-1 + (-anInt1307 + i_73_)] & 0x2 ^ 0xffffffff) == -1) {
						return true;
					}
				}
			} else if ((i_76_ ^ 0xffffffff) == (i_67_ ^ 0xffffffff) && (0x1 & i) == 0) {
				for (int i_82_ = i_66_; i_74_ > i_82_; i_82_++) {
					if ((anIntArrayArray1290[i_82_ + -anInt1291][-anInt1307 + i_67_] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (i_67_ < i_72_ || i_67_ >= i_76_) {
			if (i_73_ > i_72_ && i_76_ >= i_73_) {
				if (i_74_ == i_66_ && (i & 0x8) == 0) {
					for (int i_83_ = i_72_; i_83_ < i_73_; i_83_++) {
						if ((anIntArrayArray1290[-1 + (i_74_ + -anInt1291)][-anInt1307 + i_83_] & 0x8 ^ 0xffffffff) == -1) {
							return true;
						}
					}
				} else if ((i_71_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff) && (0x2 & i) == 0) {
					for (int i_84_ = i_72_; i_73_ > i_84_; i_84_++) {
						if ((anIntArrayArray1290[-anInt1291 + i_71_][-anInt1307 + i_84_] & 0x80 ^ 0xffffffff) == -1) {
							return true;
						}
					}
				}
			}
		} else if ((i_66_ ^ 0xffffffff) != (i_74_ ^ 0xffffffff) || (0x8 & i ^ 0xffffffff) != -1) {
			if ((i_71_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff) && (i & 0x2) == 0) {
				int i_85_ = i_67_;
				for (int i_86_ = i_73_ <= i_76_ ? i_73_ : i_76_; i_85_ < i_86_; i_85_++) {
					if ((0x80 & anIntArrayArray1290[i_71_ - anInt1291][i_85_ - anInt1307] ^ 0xffffffff) == -1) {
						return true;
					}
				}
			}
		} else {
			int i_87_ = i_67_;
			for (int i_88_ = i_73_ > i_76_ ? i_76_ : i_73_; i_88_ > i_87_; i_87_++) {
				if ((anIntArrayArray1290[-anInt1291 + i_74_ - 1][-anInt1307 + i_87_] & 0x8) == 0) {
					return true;
				}
			}
		}
		if (i_69_ <= 112) {
			return false;
		}
		return false;
	}
	
	final boolean method1305(byte b, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_) {
		anInt1284++;
		if (i_92_ != 1) {
			if ((i_90_ ^ 0xffffffff) <= (i_93_ ^ 0xffffffff) && (i_90_ ^ 0xffffffff) >= (i_92_ + (i_93_ - 1) ^ 0xffffffff) && (i_94_ ^ 0xffffffff) <= (i_94_ ^ 0xffffffff) && (i_94_ ^ 0xffffffff) >= (i_94_ + (i_92_ - 1) ^ 0xffffffff)) {
				return true;
			}
		} else if ((i_93_ ^ 0xffffffff) == (i_90_ ^ 0xffffffff) && i_94_ == i_91_) {
			return true;
		}
		i_91_ -= anInt1307;
		i_90_ -= anInt1291;
		i_94_ -= anInt1307;
		i_93_ -= anInt1291;
		if (i_92_ == 1) {
			if (i == 0) {
				if ((i_89_ ^ 0xffffffff) == -1) {
					if ((i_93_ ^ 0xffffffff) == (i_90_ - 1 ^ 0xffffffff) && (i_94_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff)) {
						return true;
					}
					if ((i_90_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && (1 + i_94_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (0x12c0120 & anIntArrayArray1290[i_93_][i_91_] ^ 0xffffffff) == -1) {
						return true;
					}
					if (i_93_ == i_90_ && (i_94_ - 1 ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (anIntArrayArray1290[i_93_][i_91_] & 0x12c0102) == 0) {
						return true;
					}
				} else if (i_89_ != 1) {
					if (i_89_ != 2) {
						if (i_89_ == 3) {
							if (i_93_ == i_90_ && -1 + i_94_ == i_91_) {
								return true;
							}
							if ((i_93_ ^ 0xffffffff) == (-1 + i_90_ ^ 0xffffffff) && (i_94_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (0x12c0108 & anIntArrayArray1290[i_93_][i_91_] ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i_93_ ^ 0xffffffff) == (1 + i_90_ ^ 0xffffffff) && (i_94_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (anIntArrayArray1290[i_93_][i_91_] & 0x12c0180 ^ 0xffffffff) == -1) {
								return true;
							}
						}
					} else {
						if ((1 + i_90_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && i_94_ == i_91_) {
							return true;
						}
						if (i_90_ == i_93_ && (1 + i_94_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (0x12c0120 & anIntArrayArray1290[i_93_][i_91_]) == 0) {
							return true;
						}
						if (i_93_ == i_90_ && (i_91_ ^ 0xffffffff) == (i_94_ - 1 ^ 0xffffffff) && (anIntArrayArray1290[i_93_][i_91_] & 0x12c0102 ^ 0xffffffff) == -1) {
							return true;
						}
					}
				} else {
					if (i_93_ == i_90_ && (i_94_ - -1 ^ 0xffffffff) == (i_91_ ^ 0xffffffff)) {
						return true;
					}
					if ((i_93_ ^ 0xffffffff) == (i_90_ + -1 ^ 0xffffffff) && i_91_ == i_94_ && (0x12c0108 & anIntArrayArray1290[i_93_][i_91_] ^ 0xffffffff) == -1) {
						return true;
					}
					if ((i_93_ ^ 0xffffffff) == (1 + i_90_ ^ 0xffffffff) && i_94_ == i_91_ && (0x12c0180 & anIntArrayArray1290[i_93_][i_91_]) == 0) {
						return true;
					}
				}
			}
			if (i == 2) {
				if ((i_89_ ^ 0xffffffff) != -1) {
					if (i_89_ != 1) {
						if (i_89_ == 2) {
							if ((-1 + i_90_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && i_94_ == i_91_ && (0x12c0108 & anIntArrayArray1290[i_93_][i_91_] ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_90_ == i_93_ && 1 + i_94_ == i_91_ && (0x12c0120 & anIntArrayArray1290[i_93_][i_91_]) == 0) {
								return true;
							}
							if (1 + i_90_ == i_93_ && (i_91_ ^ 0xffffffff) == (i_94_ ^ 0xffffffff)) {
								return true;
							}
							if ((i_93_ ^ 0xffffffff) == (i_90_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) == (-1 + i_94_ ^ 0xffffffff)) {
								return true;
							}
						} else if (i_89_ == 3) {
							if ((-1 + i_90_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && i_91_ == i_94_) {
								return true;
							}
							if (i_90_ == i_93_ && (i_91_ ^ 0xffffffff) == (i_94_ + 1 ^ 0xffffffff) && (0x12c0120 & anIntArrayArray1290[i_93_][i_91_] ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i_93_ ^ 0xffffffff) == (1 + i_90_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) == (i_94_ ^ 0xffffffff) && (anIntArrayArray1290[i_93_][i_91_] & 0x12c0180 ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_90_ == i_93_ && -1 + i_94_ == i_91_) {
								return true;
							}
						}
					} else {
						if ((i_93_ ^ 0xffffffff) == (i_90_ + -1 ^ 0xffffffff) && i_91_ == i_94_ && (0x12c0108 & anIntArrayArray1290[i_93_][i_91_] ^ 0xffffffff) == -1) {
							return true;
						}
						if (i_93_ == i_90_ && (i_91_ ^ 0xffffffff) == (1 + i_94_ ^ 0xffffffff)) {
							return true;
						}
						if (1 + i_90_ == i_93_ && i_91_ == i_94_) {
							return true;
						}
						if (i_93_ == i_90_ && i_94_ - 1 == i_91_ && (anIntArrayArray1290[i_93_][i_91_] & 0x12c0102) == 0) {
							return true;
						}
					}
				} else {
					if ((i_90_ - 1 ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && i_91_ == i_94_) {
						return true;
					}
					if ((i_90_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) == (1 + i_94_ ^ 0xffffffff)) {
						return true;
					}
					if ((i_93_ ^ 0xffffffff) == (i_90_ - -1 ^ 0xffffffff) && (i_91_ ^ 0xffffffff) == (i_94_ ^ 0xffffffff) && (0x12c0180 & anIntArrayArray1290[i_93_][i_91_] ^ 0xffffffff) == -1) {
						return true;
					}
					if (i_93_ == i_90_ && (i_94_ - 1 ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (anIntArrayArray1290[i_93_][i_91_] & 0x12c0102) == 0) {
						return true;
					}
				}
			}
			if (i == 9) {
				if ((i_93_ ^ 0xffffffff) == (i_90_ ^ 0xffffffff) && i_91_ == 1 + i_94_ && (anIntArrayArray1290[i_93_][i_91_] & 0x20) == 0) {
					return true;
				}
				if (i_93_ == i_90_ && (i_91_ ^ 0xffffffff) == (-1 + i_94_ ^ 0xffffffff) && (anIntArrayArray1290[i_93_][i_91_] & 0x2) == 0) {
					return true;
				}
				if ((i_93_ ^ 0xffffffff) == (-1 + i_90_ ^ 0xffffffff) && i_91_ == i_94_ && (0x8 & anIntArrayArray1290[i_93_][i_91_]) == 0) {
					return true;
				}
				if ((i_90_ + 1 ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) == (i_94_ ^ 0xffffffff) && (0x80 & anIntArrayArray1290[i_93_][i_91_] ^ 0xffffffff) == -1) {
					return true;
				}
			}
		} else {
			int i_95_ = i_93_ - (-i_92_ + 1);
			int i_96_ = -1 + i_91_ - -i_92_;
			if (i == 0) {
				if (i_89_ == 0) {
					if (i_90_ - i_92_ == i_93_ && i_94_ >= i_91_ && (i_94_ ^ 0xffffffff) >= (i_96_ ^ 0xffffffff)) {
						return true;
					}
					if ((i_90_ ^ 0xffffffff) <= (i_93_ ^ 0xffffffff) && i_95_ >= i_90_ && (i_91_ ^ 0xffffffff) == (1 + i_94_ ^ 0xffffffff) && (anIntArrayArray1290[i_90_][i_91_] & 0x12c0120) == 0) {
						return true;
					}
					if ((i_90_ ^ 0xffffffff) <= (i_93_ ^ 0xffffffff) && (i_95_ ^ 0xffffffff) <= (i_90_ ^ 0xffffffff) && (-i_92_ + i_94_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (anIntArrayArray1290[i_90_][i_96_] & 0x12c0102) == 0) {
						return true;
					}
				} else if (i_89_ == 1) {
					if (i_90_ >= i_93_ && i_95_ >= i_90_ && i_94_ - -1 == i_91_) {
						return true;
					}
					if ((i_93_ ^ 0xffffffff) == (-i_92_ + i_90_ ^ 0xffffffff) && i_94_ >= i_91_ && (i_96_ ^ 0xffffffff) <= (i_94_ ^ 0xffffffff) && (0x12c0108 & anIntArrayArray1290[i_95_][i_94_]) == 0) {
						return true;
					}
					if ((i_93_ ^ 0xffffffff) == (1 + i_90_ ^ 0xffffffff) && i_94_ >= i_91_ && i_96_ >= i_94_ && (anIntArrayArray1290[i_93_][i_94_] & 0x12c0180) == 0) {
						return true;
					}
				} else if (i_89_ == 2) {
					if ((i_93_ ^ 0xffffffff) == (1 + i_90_ ^ 0xffffffff) && i_91_ <= i_94_ && (i_94_ ^ 0xffffffff) >= (i_96_ ^ 0xffffffff)) {
						return true;
					}
					if (i_93_ <= i_90_ && i_95_ >= i_90_ && i_94_ - -1 == i_91_ && (0x12c0120 & anIntArrayArray1290[i_90_][i_91_] ^ 0xffffffff) == -1) {
						return true;
					}
					if ((i_90_ ^ 0xffffffff) <= (i_93_ ^ 0xffffffff) && (i_90_ ^ 0xffffffff) >= (i_95_ ^ 0xffffffff) && (i_94_ + -i_92_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (0x12c0102 & anIntArrayArray1290[i_90_][i_96_] ^ 0xffffffff) == -1) {
						return true;
					}
				} else if (i_89_ == 3) {
					if ((i_93_ ^ 0xffffffff) >= (i_90_ ^ 0xffffffff) && (i_90_ ^ 0xffffffff) >= (i_95_ ^ 0xffffffff) && i_91_ == -i_92_ + i_94_) {
						return true;
					}
					if ((-i_92_ + i_90_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) >= (i_94_ ^ 0xffffffff) && i_94_ <= i_96_ && (anIntArrayArray1290[i_95_][i_94_] & 0x12c0108) == 0) {
						return true;
					}
					if ((1 + i_90_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && i_91_ <= i_94_ && i_96_ >= i_94_ && (anIntArrayArray1290[i_93_][i_94_] & 0x12c0180 ^ 0xffffffff) == -1) {
						return true;
					}
				}
			}
			if (i == 2) {
				if ((i_89_ ^ 0xffffffff) == -1) {
					if ((i_90_ - i_92_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) >= (i_94_ ^ 0xffffffff) && i_94_ <= i_96_) {
						return true;
					}
					if (i_93_ <= i_90_ && i_90_ <= i_95_ && (i_91_ ^ 0xffffffff) == (1 + i_94_ ^ 0xffffffff)) {
						return true;
					}
					if ((i_93_ ^ 0xffffffff) == (1 + i_90_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) >= (i_94_ ^ 0xffffffff) && i_94_ <= i_96_ && (0x12c0180 & anIntArrayArray1290[i_93_][i_94_] ^ 0xffffffff) == -1) {
						return true;
					}
					if (i_93_ <= i_90_ && (i_95_ ^ 0xffffffff) <= (i_90_ ^ 0xffffffff) && (-i_92_ + i_94_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (anIntArrayArray1290[i_90_][i_96_] & 0x12c0102 ^ 0xffffffff) == -1) {
						return true;
					}
				} else if (i_89_ == 1) {
					if ((-i_92_ + i_90_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff) && i_94_ >= i_91_ && (i_94_ ^ 0xffffffff) >= (i_96_ ^ 0xffffffff) && (anIntArrayArray1290[i_95_][i_94_] & 0x12c0108) == 0) {
						return true;
					}
					if ((i_90_ ^ 0xffffffff) <= (i_93_ ^ 0xffffffff) && i_95_ >= i_90_ && (i_91_ ^ 0xffffffff) == (1 + i_94_ ^ 0xffffffff)) {
						return true;
					}
					if (i_90_ + 1 == i_93_ && i_91_ <= i_94_ && (i_94_ ^ 0xffffffff) >= (i_96_ ^ 0xffffffff)) {
						return true;
					}
					if (i_90_ >= i_93_ && (i_95_ ^ 0xffffffff) <= (i_90_ ^ 0xffffffff) && (i_94_ + -i_92_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (0x12c0102 & anIntArrayArray1290[i_90_][i_96_] ^ 0xffffffff) == -1) {
						return true;
					}
				} else if (i_89_ != 2) {
					if (i_89_ == 3) {
						if (i_90_ + -i_92_ == i_93_ && i_94_ >= i_91_ && i_94_ <= i_96_) {
							return true;
						}
						if ((i_93_ ^ 0xffffffff) >= (i_90_ ^ 0xffffffff) && (i_95_ ^ 0xffffffff) <= (i_90_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) == (1 + i_94_ ^ 0xffffffff) && (anIntArrayArray1290[i_90_][i_91_] & 0x12c0120 ^ 0xffffffff) == -1) {
							return true;
						}
						if (1 + i_90_ == i_93_ && (i_94_ ^ 0xffffffff) <= (i_91_ ^ 0xffffffff) && i_96_ >= i_94_ && (0x12c0180 & anIntArrayArray1290[i_93_][i_94_]) == 0) {
							return true;
						}
						if ((i_90_ ^ 0xffffffff) <= (i_93_ ^ 0xffffffff) && i_90_ <= i_95_ && (i_91_ ^ 0xffffffff) == (-i_92_ + i_94_ ^ 0xffffffff)) {
							return true;
						}
					}
				} else {
					if (i_93_ == i_90_ + -i_92_ && (i_91_ ^ 0xffffffff) >= (i_94_ ^ 0xffffffff) && i_96_ >= i_94_ && (anIntArrayArray1290[i_95_][i_94_] & 0x12c0108) == 0) {
						return true;
					}
					if (i_90_ >= i_93_ && i_90_ <= i_95_ && (1 + i_94_ ^ 0xffffffff) == (i_91_ ^ 0xffffffff) && (0x12c0120 & anIntArrayArray1290[i_90_][i_91_]) == 0) {
						return true;
					}
					if (1 + i_90_ == i_93_ && (i_94_ ^ 0xffffffff) <= (i_91_ ^ 0xffffffff) && i_96_ >= i_94_) {
						return true;
					}
					if (i_93_ <= i_90_ && (i_90_ ^ 0xffffffff) >= (i_95_ ^ 0xffffffff) && i_91_ == -i_92_ + i_94_) {
						return true;
					}
				}
			}
			if (i == 9) {
				if (i_90_ >= i_93_ && (i_90_ ^ 0xffffffff) >= (i_95_ ^ 0xffffffff) && (i_91_ ^ 0xffffffff) == (1 + i_94_ ^ 0xffffffff) && (anIntArrayArray1290[i_90_][i_91_] & 0x12c0120 ^ 0xffffffff) == -1) {
					return true;
				}
				if (i_90_ >= i_93_ && i_95_ >= i_90_ && i_91_ == -i_92_ + i_94_ && (0x12c0102 & anIntArrayArray1290[i_90_][i_96_]) == 0) {
					return true;
				}
				if (-i_92_ + i_90_ == i_93_ && (i_94_ ^ 0xffffffff) <= (i_91_ ^ 0xffffffff) && i_96_ >= i_94_ && (0x12c0108 & anIntArrayArray1290[i_95_][i_94_] ^ 0xffffffff) == -1) {
					return true;
				}
				if (i_93_ == i_90_ + 1 && (i_94_ ^ 0xffffffff) <= (i_91_ ^ 0xffffffff) && i_96_ >= i_94_ && (anIntArrayArray1290[i_93_][i_94_] & 0x12c0180 ^ 0xffffffff) == -1) {
					return true;
				}
			}
		}
		int i_97_ = -4 / ((b - -14) / 38);
		return false;
	}
	
	static final void method1306(int i, int i_98_, int i_99_, int i_100_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_98_][i_99_];
		if (class23_sub1 != null) {
			Class24 class24 = class23_sub1.aClass24_2038;
			if (class24 != null) {
				class24.anInt375 = class24.anInt375 * i_100_ / 16;
				class24.anInt371 = class24.anInt371 * i_100_ / 16;
			}
		}
	}
	
	static final RSString method1307(long l, int i, byte b, boolean bool) {
		anInt1302++;
		if (i < 2 || i > 36) {
			throw new IllegalArgumentException("Invalid radix:" + i);
		}
		int i_101_ = 1;
		long l_102_ = l / (long) i;
		if (b != 43) {
			aClass16_1314 = null;
		}
		while ((l_102_ ^ 0xffffffffffffffffL) != -1L) {
			l_102_ /= (long) i;
			i_101_++;
		}
		int i_103_ = i_101_;
		if (l < 0L || bool) {
			i_103_++;
		}
		byte[] bs = new byte[i_103_];
		if ((l ^ 0xffffffffffffffffL) <= -1L) {
			if (bool) {
				bs[0] = (byte) 43;
			}
		} else {
			bs[0] = (byte) 45;
		}
		for (int i_104_ = 0; (i_101_ ^ 0xffffffff) < (i_104_ ^ 0xffffffff); i_104_++) {
			int i_105_ = (int) (l % (long) i);
			l /= (long) i;
			if (i_105_ < 0) {
				i_105_ = -i_105_;
			}
			if (i_105_ > 9) {
				i_105_ += 39;
			}
			bs[-1 + i_103_ + -i_104_] = (byte) (48 + i_105_);
		}
		RSString class16 = new RSString();
		class16.anInt1896 = i_103_;
		class16.aByteArray1906 = bs;
		return class16;
	}
	
	Class72(int i, int i_106_) {
		anInt1293 = i;
		anInt1307 = 0;
		anInt1287 = i_106_;
		anIntArrayArray1290 = new int[anInt1293][anInt1287];
		anInt1291 = 0;
		method1298(122);
	}
	
	final void method1308(int i, int i_107_, int i_108_) {
		i_107_ -= anInt1307;
		anInt1304++;
		if (i_108_ != 7446) {
			anIntArrayArray1290 = null;
		}
		i -= anInt1291;
		anIntArrayArray1290[i][i_107_] = Class24.method919(anIntArrayArray1290[i][i_107_], -262145);
	}
	
	final void method1309(boolean bool, int i, int i_109_, int i_110_, int i_111_, int i_112_) {
		anInt1300++;
		i_111_ -= anInt1291;
		i -= anInt1307;
		if ((i_112_ ^ 0xffffffff) == -1) {
			if (i_109_ == 0) {
				method1296(i_111_, 128, false, i);
				method1296(i_111_ - 1, 8, false, i);
			}
			if (i_109_ == 1) {
				method1296(i_111_, 2, false, i);
				method1296(i_111_, 32, false, i + 1);
			}
			if (i_109_ == 2) {
				method1296(i_111_, 8, false, i);
				method1296(1 + i_111_, 128, false, i);
			}
			if (i_109_ == 3) {
				method1296(i_111_, 32, false, i);
				method1296(i_111_, 2, false, i - 1);
			}
		}
		if (i_112_ == 1 || i_112_ == 3) {
			if ((i_109_ ^ 0xffffffff) == -1) {
				method1296(i_111_, 1, false, i);
				method1296(i_111_ + -1, 16, false, 1 + i);
			}
			if (i_109_ == 1) {
				method1296(i_111_, 4, false, i);
				method1296(1 + i_111_, 64, false, i - -1);
			}
			if (i_109_ == 2) {
				method1296(i_111_, 16, false, i);
				method1296(1 + i_111_, 1, false, -1 + i);
			}
			if (i_109_ == 3) {
				method1296(i_111_, 64, false, i);
				method1296(i_111_ - 1, 4, false, i - 1);
			}
		}
		int i_113_ = 24 % ((i_110_ - -63) / 49);
		if (i_112_ == 2) {
			if ((i_109_ ^ 0xffffffff) == -1) {
				method1296(i_111_, 130, false, i);
				method1296(-1 + i_111_, 8, false, i);
				method1296(i_111_, 32, false, 1 + i);
			}
			if (i_109_ == 1) {
				method1296(i_111_, 10, false, i);
				method1296(i_111_, 32, false, i + 1);
				method1296(1 + i_111_, 128, false, i);
			}
			if (i_109_ == 2) {
				method1296(i_111_, 40, false, i);
				method1296(1 + i_111_, 128, false, i);
				method1296(i_111_, 2, false, -1 + i);
			}
			if (i_109_ == 3) {
				method1296(i_111_, 160, false, i);
				method1296(i_111_, 2, false, -1 + i);
				method1296(-1 + i_111_, 8, false, i);
			}
		}
		if (bool) {
			if ((i_112_ ^ 0xffffffff) == -1) {
				if ((i_109_ ^ 0xffffffff) == -1) {
					method1296(i_111_, 65536, false, i);
					method1296(i_111_ + -1, 4096, false, i);
				}
				if (i_109_ == 1) {
					method1296(i_111_, 1024, false, i);
					method1296(i_111_, 16384, false, 1 + i);
				}
				if (i_109_ == 2) {
					method1296(i_111_, 4096, false, i);
					method1296(i_111_ + 1, 65536, false, i);
				}
				if (i_109_ == 3) {
					method1296(i_111_, 16384, false, i);
					method1296(i_111_, 1024, false, i - 1);
				}
			}
			if (i_112_ == 1 || i_112_ == 3) {
				if (i_109_ == 0) {
					method1296(i_111_, 512, false, i);
					method1296(-1 + i_111_, 8192, false, i - -1);
				}
				if (i_109_ == 1) {
					method1296(i_111_, 2048, false, i);
					method1296(i_111_ + 1, 32768, false, i - -1);
				}
				if (i_109_ == 2) {
					method1296(i_111_, 8192, false, i);
					method1296(i_111_ - -1, 512, false, -1 + i);
				}
				if (i_109_ == 3) {
					method1296(i_111_, 32768, false, i);
					method1296(i_111_ - 1, 2048, false, -1 + i);
				}
			}
			if (i_112_ == 2) {
				if (i_109_ == 0) {
					method1296(i_111_, 66560, false, i);
					method1296(-1 + i_111_, 4096, false, i);
					method1296(i_111_, 16384, false, 1 + i);
				}
				if (i_109_ == 1) {
					method1296(i_111_, 5120, false, i);
					method1296(i_111_, 16384, false, 1 + i);
					method1296(i_111_ - -1, 65536, false, i);
				}
				if (i_109_ == 2) {
					method1296(i_111_, 20480, false, i);
					method1296(i_111_ + 1, 65536, false, i);
					method1296(i_111_, 1024, false, i - 1);
				}
				if (i_109_ == 3) {
					method1296(i_111_, 81920, false, i);
					method1296(i_111_, 1024, false, -1 + i);
					method1296(-1 + i_111_, 4096, false, i);
				}
			}
		}
	}
	
	static {
		aBoolean1310 = false;
		aClass16_1314 = Class38_Sub6.method1076((byte) 86, "Loading config )2 ");
		aClass16_1311 = aClass16_1314;
		aClass16_1301 = Class38_Sub6.method1076((byte) 86, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");
	}
}
