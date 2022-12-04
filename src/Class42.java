/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class42
{
	static int anInt644;
	protected int anInt645;
	protected Class23_Sub13_Sub12 aClass23_Sub13_Sub12_646;
	static int anInt647;
	protected int[] anIntArray648;
	static oa anOa649 = new oa(32);
	static Class43 aClass43_650;
	static RSString aClass16_651 = Class38_Sub6.method1076((byte) 86, "<col=80ff00>");
	static RSString aClass16_652;
	static RSString aClass16_653;
	private static RSString aClass16_654 = Class38_Sub6.method1076((byte) 86, "slide:");
	static short[] aShortArray655;
	private static RSString aClass16_656 = Class38_Sub6.method1076((byte) 86, "K");
	static RSString aClass16_657;
	static Class89 aClass89_658;
	static RSString aClass16_659;
	static int anInt660;
	static Class5 aClass5_661;
	static int anInt662;
	static Class64 aClass64_663;
	
	public static void method1113(int i) {
		aClass16_653 = null;
		anOa649 = null;
		aClass16_654 = null;
		aClass64_663 = null;
		aClass16_657 = null;
		aClass43_650 = null;
		aClass16_659 = null;
		aClass5_661 = null;
		aShortArray655 = null;
		aClass89_658 = null;
		aClass16_651 = null;
		aClass16_656 = null;
		if (i != 15380) {
			method1115((byte) 60);
		}
		aClass16_652 = null;
	}
	
	static final void method1114(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte[][][] bs, int[] is, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int i_9_, byte b) {
		if (i < 0) {
			i = 0;
		} else if (i >= Class105.anInt1802 * 128) {
			i = Class105.anInt1802 * 128 - 1;
		}
		if (i_1_ < 0) {
			i_1_ = 0;
		} else if (i_1_ >= client.anInt1974 * 128) {
			i_1_ = client.anInt1974 * 128 - 1;
		}
		Class25.anInt381 = Class76.anIntArray1386[i_2_];
		Class23_Sub4_Sub6.anInt2980 = Class76.anIntArray1395[i_2_];
		Class58.anInt906 = Class76.anIntArray1386[i_3_];
		Class87.anInt1495 = Class76.anIntArray1395[i_3_];
		Class17.anInt311 = i;
		Class61.anInt956 = i_0_;
		Class23_Sub4_Sub23.anInt3281 = i_1_;
		Canvas_Sub1.anInt51 = i / 128;
		Class23_Sub4_Sub33.anInt3425 = i_1_ / 128;
		Class23_Sub4_Sub17.anInt3174 = i_4_;
		Class23_Sub4_Sub37.anInt3493 = Canvas_Sub1.anInt51 - Class23_Sub4_Sub15.anInt3138;
		if (Class23_Sub4_Sub37.anInt3493 < 0) {
			Class23_Sub4_Sub37.anInt3493 = 0;
		}
		Class23_Sub1.anInt2006 = Class23_Sub4_Sub33.anInt3425 - Class23_Sub4_Sub15.anInt3138;
		if (Class23_Sub1.anInt2006 < 0) {
			Class23_Sub1.anInt2006 = 0;
		}
		Class23_Sub4_Sub7.anInt3004 = Canvas_Sub1.anInt51 + Class23_Sub4_Sub15.anInt3138;
		if (Class23_Sub4_Sub7.anInt3004 > Class105.anInt1802) {
			Class23_Sub4_Sub7.anInt3004 = Class105.anInt1802;
		}
		Class23_Sub24.anInt2448 = Class23_Sub4_Sub33.anInt3425 + Class23_Sub4_Sub15.anInt3138;
		if (Class23_Sub24.anInt2448 > client.anInt1974) {
			Class23_Sub24.anInt2448 = client.anInt1974;
		}
		int i_10_ = 3500;
		for (int i_11_ = 0; i_11_ < Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138 + 2; i_11_++) {
			for (int i_12_ = 0; i_12_ < Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138 + 2; i_12_++) {
				int i_13_ = (i_11_ - Class23_Sub4_Sub15.anInt3138 << 7) - (Class17.anInt311 & 0x7f);
				int i_14_ = (i_12_ - Class23_Sub4_Sub15.anInt3138 << 7) - (Class23_Sub4_Sub23.anInt3281 & 0x7f);
				int i_15_ = Canvas_Sub1.anInt51 - Class23_Sub4_Sub15.anInt3138 + i_11_;
				int i_16_ = Class23_Sub4_Sub33.anInt3425 - Class23_Sub4_Sub15.anInt3138 + i_12_;
				if (i_15_ >= 0 && i_16_ >= 0 && i_15_ < Class105.anInt1802 && i_16_ < client.anInt1974) {
					int i_17_;
					if (Class23_Sub4_Sub35.anIntArrayArrayArray3461 != null) {
						i_17_ = Class23_Sub4_Sub35.anIntArrayArrayArray3461[0][i_15_][i_16_] - Class61.anInt956 + 128;
					} else {
						i_17_ = Class23_Sub4_Sub12.anIntArrayArrayArray3080[0][i_15_][i_16_] - Class61.anInt956 + 128;
					}
					int i_18_ = Class23_Sub4_Sub12.anIntArrayArrayArray3080[3][i_15_][i_16_] - Class61.anInt956 - 1000;
					oa.aBooleanArrayArray1263[i_11_][i_12_] = Class1.method47(i_13_, i_18_, i_17_, i_14_, i_10_);
				} else {
					oa.aBooleanArrayArray1263[i_11_][i_12_] = false;
				}
			}
		}
		for (int i_19_ = 0; i_19_ < Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138 + 1; i_19_++) {
			for (int i_20_ = 0; i_20_ < Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138 + 1; i_20_++)
				Class94.aBooleanArrayArray1608[i_19_][i_20_] = oa.aBooleanArrayArray1263[i_19_][i_20_] || oa.aBooleanArrayArray1263[i_19_ + 1][i_20_] || oa.aBooleanArrayArray1263[i_19_][i_20_ + 1] || oa.aBooleanArrayArray1263[i_19_ + 1][i_20_ + 1];
		}
		Class35.anIntArray548 = is;
		Class81.anIntArray1433 = is_5_;
		Class23_Sub4_Sub23.anIntArray3285 = is_6_;
		Class23_Sub4_Sub33.anIntArray3427 = is_7_;
		Class82.anIntArray1455 = is_8_;
		Class32.method963();
		Class23_Sub13_Sub16.method785(i, i_0_, i_1_, bs, i_9_, b);
	}
	
	static final void method1115(byte b) {
		anInt647++;
		try {
			if (Buffer.loginStage == 0) {
				if (Class23_Sub24.aClass34_2440 != null) {
					Class23_Sub24.aClass34_2440.method976(false);
					Class23_Sub24.aClass34_2440 = null;
				}
				ObjectDefinition.anInt3781 = 0;
				Class23_Sub9.aClass60_2269 = null;
				Buffer.loginStage = 1;
				Class23_Sub4_Sub7.aBoolean3012 = false;
			}
			if (Buffer.loginStage == 1) {
				if (Class23_Sub9.aClass60_2269 == null) {
					Class23_Sub9.aClass60_2269 = Class23_Sub4_Sub3.aClass9_2939.method105(Class23_Sub4_Sub34.aString3444, Class23_Sub4_Sub27.anInt3328, 47);
				}
				if (Class23_Sub9.aClass60_2269.anInt951 == 2) {
					throw new IOException();
				}
				if (Class23_Sub9.aClass60_2269.anInt951 == 1) {
					Class23_Sub24.aClass34_2440 = new Class34((Socket) Class23_Sub9.aClass60_2269.anObject955, Class23_Sub4_Sub3.aClass9_2939);
					Buffer.loginStage = 2;
					Class23_Sub9.aClass60_2269 = null;
				}
			}
			if (Buffer.loginStage == 2) {
				long l = Class88.aLong1501 = Class23_Sub2.aClass16_2064.method184(-101);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.pos = 0;
				Class23_Sub7.aClass23_Sub5_Sub1_2202.writeByte(14);
				int i = (int) (l >> 16 & 0x1fL);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.writeByte(i);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.putInt(498, -1137894376);
				Class23_Sub24.aClass34_2440.method977(30000, 6, 0, Class23_Sub7.aClass23_Sub5_Sub1_2202.payload);
				Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos = 0;
				Buffer.loginStage = 3;
			}
			if (Buffer.loginStage == 3) {
				if (Class29.aClass6_471 != null) {
					Class29.aClass6_471.method77(256);
				}
				if (Class97.aClass6_1646 != null) {
					Class97.aClass6_1646.method77(256);
				}
				int i = Class23_Sub24.aClass34_2440.method971((byte) 10);
				if (Class29.aClass6_471 != null) {
					Class29.aClass6_471.method77(256);
				}
				if (Class97.aClass6_1646 != null) {
					Class97.aClass6_1646.method77(256);
				}
				if (i != 0) {
					Class83.method1379(true, i);
					return;
				}
				Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos = 0;
				Buffer.loginStage = 4;
			}
			if (Buffer.loginStage == 4) {
				if (Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos < 8) {
					int i = Class23_Sub24.aClass34_2440.read(b ^ 0x41);
					if (-Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos + 8 < i) {
						i = -Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos + 8;
					}
					if ((i ^ 0xffffffff) < -1) {
						Class23_Sub24.aClass34_2440.method974(i, 106, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload);
						Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos += i;
					}
				}
				if (Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos == 8) {
					Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos = 0;
					Class87.aLong1489 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.readLong(-116);
					Buffer.loginStage = 5;
				}
			}
			if (Buffer.loginStage == 5) {
				Class23_Sub7.aClass23_Sub5_Sub1_2202.pos = 0;
				int[] is = new int[4];
				is[3] = (int) Class87.aLong1489;
				is[1] = (int) (9.9999999E7 * Math.random());
				is[2] = (int) (Class87.aLong1489 >> 32);
				is[0] = (int) (9.9999999E7 * Math.random());
				Class23_Sub7.aClass23_Sub5_Sub1_2202.writeByte(10);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.putInt(is[0], -1137894376);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.putInt(is[1], -1137894376);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.putInt(is[2], -1137894376);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.putInt(is[3], b ^ 0x43d2e3e7);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.putLong(Class23_Sub2.aClass16_2064.method184(b ^ 0x6c), (byte) -126);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.method446(Class23_Sub2.aClass16_2065, -113);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.encrypt(117, Class33.rsaKey, Class2.rsaModulus);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.pos = 0;
				if (Class49.anInt756 == 40) {
					Class23_Sub8.aClass23_Sub5_Sub1_2230.writeByte(18);
				} else {
					Class23_Sub8.aClass23_Sub5_Sub1_2230.writeByte(16);
				}
				Class23_Sub8.aClass23_Sub5_Sub1_2230.writeByte(137 + Class23_Sub7.aClass23_Sub5_Sub1_2202.pos - -Class82.method1372(Class105_Sub1.aClass16_2877, (byte) 38));
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(498, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.writeByte(!Class7.aBoolean170 ? 0 : 1);
				Buffer.method470((byte) -126, Class23_Sub8.aClass23_Sub5_Sub1_2230);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.method446(Class105_Sub1.aClass16_2877, -99);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub13_Sub9.anInt3857, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub7.aClass105_Sub1_3024.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub8.aClass105_Sub1_3031.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub26.aClass105_Sub1_3317.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class89.aClass105_Sub1_1509.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class30.aClass105_Sub1_475.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class38_Sub6.aClass105_Sub1_2613.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class29.aClass105_Sub1_457.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class69.aClass105_Sub1_1211.anInt1799, b + -1137894375);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class92.aClass105_Sub1_1561.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class67.aClass105_Sub1_1181.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub27.aClass105_Sub1_3339.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub1.aClass105_Sub1_2037.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class69.aClass105_Sub1_1214.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(oa.aClass105_Sub1_1247.anInt1799, b ^ 0x43d2e3e7);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub37.aClass105_Sub1_3490.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub13_Sub19.aClass105_Sub1_4118.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class29.aClass105_Sub1_470.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub13_Sub3.aClass105_Sub1_3699.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub13_Sub17.aClass105_Sub1_4069.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub13.aClass105_Sub1_3116.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class38_Sub7_Sub2.aClass105_Sub1_4409.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub17.aClass105_Sub1_2366.anInt1799, b + -1137894375);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub8.aClass105_Sub1_3030.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class23_Sub4_Sub25.aClass105_Sub1_3302.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.putInt(Class5.aClass105_Sub1_118.anInt1799, -1137894376);
				Class23_Sub8.aClass23_Sub5_Sub1_2230.method438(0, 71, Class23_Sub7.aClass23_Sub5_Sub1_2202.payload, Class23_Sub7.aClass23_Sub5_Sub1_2202.pos);
				Class23_Sub24.aClass34_2440.method977(30000, Class23_Sub8.aClass23_Sub5_Sub1_2230.pos, 0, Class23_Sub8.aClass23_Sub5_Sub1_2230.payload);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.method492((byte) -127, is);
				System.out.println("hmmm?");
				/*
				 * isaacSeed
				 */
                for (int i = 0; i < 4; i++)
					is[i] += 50;
				Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method492((byte) -99, is);
				System.out.println("set loginStage to 6.");
				Buffer.loginStage = 6;
			}
			if (Buffer.loginStage == 6 && Class23_Sub24.aClass34_2440.read(-55) > 0) {
				System.out.println("Loginstage is 6 and there are bytes in the buffer.");
				int i = Class23_Sub24.aClass34_2440.method971((byte) 10);
				System.out.println("returncode = "+i);
				if (i != 21 || Class49.anInt756 != 20) {
					if (i == 2) {
						Buffer.loginStage = 9;
					} else {
						if (i == 15 && Class49.anInt756 == 40) {
							Class81.method1368((byte) 41);
							return;
						}
						if (i != 23 || Class105_Sub1.anInt2854 >= 1) {
							Class83.method1379(true, i);
							return;
						}
						Class105_Sub1.anInt2854++;
						Buffer.loginStage = 0;
					}
				} else {
					Buffer.loginStage = 7;
				}
			}
			if (Buffer.loginStage == 7 && (Class23_Sub24.aClass34_2440.read(-73) ^ 0xffffffff) < -1) {
				Class48.anInt744 = 60 * (Class23_Sub24.aClass34_2440.method971((byte) 10) + 3);
				Buffer.loginStage = 8;
			}
			if (Buffer.loginStage == 8) {
				ObjectDefinition.anInt3781 = 0;
				Class28.method937(Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub23.method360((byte) -9, Class48.anInt744 / 60), Class36.aClass16_570 }, -49), Class74.aClass16_1340, Class57.aClass16_898, (byte) 98);
				if (--Class48.anInt744 <= 0) {
					Buffer.loginStage = 0;
				}
				return;
			}
			if (Buffer.loginStage == 9 && Class23_Sub24.aClass34_2440.read(-76) >= 9) {
				Class23_Sub4_Sub17.anInt3173 = Class23_Sub24.aClass34_2440.method971((byte) 10);
				System.out.println("rights = "+Class23_Sub4_Sub17.anInt3173);
				Class23_Sub4_Sub36.anInt3470 = Class23_Sub24.aClass34_2440.method971((byte) 10);
				System.out.println("x1 = "+Class23_Sub4_Sub36.anInt3470);
				Class67.anInt1176 = Class23_Sub24.aClass34_2440.method971((byte) 10);
				System.out.println("x2 = "+Class67.anInt1176);
				Class23_Sub4_Sub12.anInt3075 = Class23_Sub24.aClass34_2440.method971((byte) 10);
				System.out.println("x3 = "+Class23_Sub4_Sub12.anInt3075);
				Class23_Sub4_Sub30.aBoolean3380 = Class23_Sub24.aClass34_2440.method971((byte) 10) == 1;
				System.out.println("x4 = "+Class23_Sub4_Sub30.aBoolean3380);
				Class23_Sub4_Sub10.anInt3049 = Class23_Sub24.aClass34_2440.method971((byte) 10);
				Class23_Sub4_Sub10.anInt3049 <<= 8;
				Class23_Sub4_Sub10.anInt3049 += Class23_Sub24.aClass34_2440.method971((byte) 10);
				System.out.println("x5 = "+Class23_Sub4_Sub10.anInt3049);
				Class30.anInt478 = Class23_Sub24.aClass34_2440.method971((byte) 10);
				System.out.println("x6 = "+Class30.anInt478);
				Class23_Sub24.aClass34_2440.method974(1, b ^ ~0x76, 0, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload);
				Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos = 0;
				Class23_Sub13_Sub24.anInt4275 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method491((byte) 47);
				System.out.println("x7 = "+Class23_Sub13_Sub24.anInt4275);
				Class23_Sub24.aClass34_2440.method974(2, 110, 0, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload);
				Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos = 0;
				Class23_Sub4_Sub2.anInt2925 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.getUShortBE();
				System.out.println("x8 = "+Class23_Sub4_Sub2.anInt2925);
				Buffer.loginStage = 10;
			}
			if (Buffer.loginStage == 10) {
				if (Class23_Sub24.aClass34_2440.read(b ^ 0xc) >= Class23_Sub4_Sub2.anInt2925) {
					Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.pos = 0;
					Class23_Sub24.aClass34_2440.method974(Class23_Sub4_Sub2.anInt2925, 119, 0, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload);
					Class23_Sub19.method878(0);
					Class23_Sub4_Sub23.anInt3279 = -1;
					Class23_Sub4_Sub31.constructMapRegion(false, -73);
					Class23_Sub13_Sub24.anInt4275 = -1;
				}
				return;
			}
			ObjectDefinition.anInt3781++;
			if (ObjectDefinition.anInt3781 > 2000) {
				if (Class105_Sub1.anInt2854 < 1) {
					if ((Class23_Sub13.anInt2320 ^ 0xffffffff) == (Class23_Sub4_Sub27.anInt3328 ^ 0xffffffff)) {
						Class23_Sub4_Sub27.anInt3328 = Class38_Sub2.anInt2498;
					} else {
						Class23_Sub4_Sub27.anInt3328 = Class23_Sub13.anInt2320;
					}
					Class105_Sub1.anInt2854++;
					Buffer.loginStage = 0;
				} else {
					Class83.method1379(true, -3);
					return;
				}
				return;
			}
		} catch (IOException ioexception) {
			if (Class105_Sub1.anInt2854 < 1) {
				Class105_Sub1.anInt2854++;
				if ((Class23_Sub13.anInt2320 ^ 0xffffffff) != (Class23_Sub4_Sub27.anInt3328 ^ 0xffffffff)) {
					Class23_Sub4_Sub27.anInt3328 = Class23_Sub13.anInt2320;
				} else {
					Class23_Sub4_Sub27.anInt3328 = Class38_Sub2.anInt2498;
				}
				Buffer.loginStage = 0;
			} else {
				Class83.method1379(true, -2);
				return;
			}
			return;
		}
		if (b != -1) {
			method1114(-86, 99, -20, 69, 10, 108, null, null, null, null, null, null, -39, (byte) -102);
		}
	}
	
	static final boolean method1116(RSString class16, byte b) {
		anInt644++;
		if (class16 == null) {
			return false;
		}
		for (int i = 0; (i ^ 0xffffffff) > (Class45.anInt696 ^ 0xffffffff); i++) {
			if (class16.method140(Class23_Sub4_Sub14.aClass16Array3130[i], 40)) {
				return true;
			}
		}
		if (class16.method140(Class105.aClass38_Sub7_Sub2_1812.aClass16_4389, 40)) {
			return true;
		}
		if (b != 56) {
			method1114(-43, 104, -97, 92, 15, 5, null, null, null, null, null, null, 19, (byte) 113);
		}
		return false;
	}
	
	static {
		aClass16_653 = aClass16_654;
		aClass16_659 = aClass16_654;
		aClass16_652 = aClass16_656;
		aClass16_657 = aClass16_656;
		aClass89_658 = new Class89();
		aClass5_661 = new Class5(16);
	}
}
