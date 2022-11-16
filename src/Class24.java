/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class24
{
	static int anInt361;
	static int anInt362 = 0;
	protected int anInt363;
	protected long aLong364 = 0L;
	static int anInt365 = 0;
	protected int anInt366;
	protected Class38 aClass38_367;
	static int anInt368;
	protected Class38 aClass38_369;
	protected int anInt370;
	protected int anInt371;
	static int[] anIntArray372 = new int[100];
	static int anInt373;
	protected int anInt374;
	protected int anInt375;
	static boolean[] aBooleanArray376 = { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };
	static int anInt377;
	protected int anInt378;
	
	static final Class23_Sub13_Sub10[] method915(int i) {
		anInt377++;
		int i_0_ = 33 % ((i - 26) / 38);
		Class23_Sub13_Sub10[] class23_sub13_sub10s = new Class23_Sub13_Sub10[Class23_Sub4_Sub20.anInt3229];
		for (int i_1_ = 0; i_1_ < Class23_Sub4_Sub20.anInt3229; i_1_++) {
			int i_2_ = Class105.anIntArray1766[i_1_] * Class79.anIntArray1875[i_1_];
			byte[] bs = Class23_Sub13_Sub23.aByteArrayArray4243[i_1_];
			int[] is = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				is[i_3_] = Class23_Sub4_Sub1.anIntArray2890[method919(255, bs[i_3_])];
			class23_sub13_sub10s[i_1_] = new Class23_Sub13_Sub10_Sub1(Class23_Sub12.anInt2301, Class23_Sub13_Sub15.anInt4033, Class23_Sub23.anIntArray2417[i_1_], Class23_Sub13_Sub2.anIntArray3679[i_1_], Class79.anIntArray1875[i_1_], Class105.anIntArray1766[i_1_], is);
		}
		Class23_Sub13_Sub9.method684(true);
		return class23_sub13_sub10s;
	}
	
	public static void method916(int i) {
		anIntArray372 = null;
		aBooleanArray376 = null;
		if (i != 0) {
			anInt362 = -89;
		}
	}
	
	static final void method917(int i, int i_4_, byte b, int i_5_) {
		anInt368++;
		if (b != 65) {
			anIntArray372 = null;
		}
		if ((Class23_Sub4_Sub2.anInt2920 ^ 0xffffffff) != -1 && i != 0 && Class71_Sub3.anInt2741 < 50 && (i_5_ ^ 0xffffffff) != 0) {
			Class58.anIntArray904[Class71_Sub3.anInt2741] = i_5_;
			Class23_Sub13_Sub6.anIntArray3738[Class71_Sub3.anInt2741] = i;
			Class23_Sub17.anIntArray2368[Class71_Sub3.anInt2741] = i_4_;
			Class91.aClass18Array1554[Class71_Sub3.anInt2741] = null;
			Class88.anIntArray1497[Class71_Sub3.anInt2741] = 0;
			Class71_Sub3.anInt2741++;
		}
	}
	
	static final int method918(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = -Class76.anIntArray1395[i * 1024 / i_9_] + 65536 >> 1;
		if (i_8_ != 0) {
			return 40;
		}
		anInt373++;
		return (i_6_ * i_10_ >> 16) + (i_7_ * (65536 - i_10_) >> 16);
	}
	
	static int method919(int i, int i_11_) {
		return i & i_11_;
	}
}
