/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class74
{
	static int anInt1328;
	protected int anInt1329;
	protected int[][] anIntArrayArray1330 = new int[6][258];
	static int anInt1331;
	protected int anInt1332 = 0;
	protected int anInt1333;
	protected int anInt1334;
	protected int[][] anIntArrayArray1335 = new int[6][258];
	protected int[] anIntArray1336;
	protected int anInt1337;
	protected int anInt1338;
	static short[] aShortArray1339;
	static RSString aClass16_1340;
	protected byte[] aByteArray1341 = new byte[256];
	protected int anInt1342;
	static RSString aClass16_1343;
	protected int[][] anIntArrayArray1344 = new int[6][258];
	protected byte[][] aByteArrayArray1345;
	private static RSString aClass16_1346 = Class38_Sub6.method1076((byte) 86, "Your profile will be transferred in:");
	protected int anInt1347;
	protected byte aByte1348;
	protected byte[] aByteArray1349;
	protected int anInt1350;
	protected int anInt1351;
	protected int anInt1352;
	static RSString aClass16_1353;
	protected int anInt1354;
	static RSString aClass16_1355;
	protected byte[] aByteArray1356;
	protected int[] anIntArray1357 = new int[16];
	static int anInt1358;
	protected int[] anIntArray1359;
	static RSString aClass16_1360;
	static long aLong1361;
	protected boolean[] aBooleanArray1362;
	protected boolean[] aBooleanArray1363;
	private static RSString aClass16_1364;
	protected int anInt1365;
	protected int[] anIntArray1366;
	protected byte[] aByteArray1367;
	protected int anInt1368;
	protected byte[] aByteArray1369;
	protected byte[] aByteArray1370;
	protected int anInt1371;
	
	static final int method1313(int i, int i_0_) {
		anInt1358++;
		int i_1_ = 116 / ((33 - i) / 51);
		return (i_0_ & 0x1fd8e) >> 11;
	}
	
	static final void method1314(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt1328++;
		if (i_4_ < 128 || i_8_ < 128 || i_4_ > 13056 || i_8_ > 13056) {
			Class23_Sub4_Sub6.anInt2989 = -1;
			Class97.anInt1645 = -1;
		} else {
			int i_9_ = -i_2_ + Class23_Sub4_Sub22.method359(ItemDefinition.anInt3916, i_4_, i_8_, (byte) -123);
			i_4_ -= Class23_Sub13_Sub1.anInt3673;
			i_8_ -= Class53.anInt838;
			i_9_ -= Class23_Sub23.anInt2424;
			int i_10_ = Class76.anIntArray1386[Class23_Sub4_Sub17.anInt3178];
			int i_11_ = Class76.anIntArray1395[Class10.anInt208];
			int i_12_ = Class76.anIntArray1386[Class10.anInt208];
			int i_13_ = i_11_ * i_4_ + i_8_ * i_12_ >> 16;
			int i_14_ = Class76.anIntArray1395[Class23_Sub4_Sub17.anInt3178];
			i_8_ = i_8_ * i_11_ + -(i_4_ * i_12_) >> 16;
			i_4_ = i_13_;
			i_13_ = -(i_8_ * i_10_) + i_14_ * i_9_ >> 16;
			i_8_ = i_14_ * i_8_ + i_9_ * i_10_ >> 16;
			i_9_ = i_13_;
			if (i_6_ != -16734) {
				method1315(true);
			}
			if (i_8_ < 50) {
				Class23_Sub4_Sub6.anInt2989 = -1;
				Class97.anInt1645 = -1;
			} else {
				Class23_Sub4_Sub6.anInt2989 = i_7_ - -((i_4_ << 9) / i_8_);
				Class97.anInt1645 = i - -((i_9_ << 9) / i_8_);
			}
		}
	}
	
	public static void method1315(boolean bool) {
		aClass16_1340 = null;
		aClass16_1355 = null;
		aClass16_1364 = null;
		if (bool != false) {
			aClass16_1360 = null;
		}
		aClass16_1360 = null;
		aClass16_1353 = null;
		aShortArray1339 = null;
		aClass16_1346 = null;
		aClass16_1343 = null;
	}
	
	Class74() {
		anInt1337 = 0;
		aBooleanArray1362 = new boolean[16];
		aByteArrayArray1345 = new byte[6][258];
		aBooleanArray1363 = new boolean[256];
		aByteArray1367 = new byte[18002];
		anIntArray1336 = new int[6];
		aByteArray1369 = new byte[4096];
		anIntArray1366 = new int[256];
		anIntArray1359 = new int[257];
		aByteArray1370 = new byte[18002];
	}
	
	static {
		aClass16_1340 = aClass16_1346;
		aClass16_1343 = Class38_Sub6.method1076((byte) 86, "Bitte laden Sie die Seite neu)3");
		aClass16_1360 = Class38_Sub6.method1076((byte) 86, "(U2");
		aClass16_1364 = Class38_Sub6.method1076((byte) 86, "Connecting to server)3)3)3");
		aClass16_1353 = aClass16_1364;
		aClass16_1355 = Class38_Sub6.method1076((byte) 86, "headicons_prayer");
	}
}
