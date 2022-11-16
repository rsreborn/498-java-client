/* Class23_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub21 extends Class23
{
	protected int anInt2405;
	static int anInt2406;
	static int anInt2407;
	protected RSString[] aClass16Array2408;
	static int anInt2409;
	static int[][] anIntArrayArray2410 = new int[5][5000];
	protected RSString aClass16_2411;
	protected int anInt2412;
	static int anInt2413;
	static int anInt2414;
	protected int anInt2415;
	
	public static void method889(int i) {
		anIntArrayArray2410 = null;
		if (i != 2) {
			method891(18);
		}
	}
	
	static final void method890(byte b) {
		anInt2414++;
		if (b <= 78) {
			anIntArrayArray2410 = null;
		}
		Class23_Sub2.aClass5_2053.method68(0);
	}
	
	static final void method891(int i) {
		if (i != 1) {
			anIntArrayArray2410 = null;
		}
		anInt2409++;
		for (;;) {
			Class23_Sub14 class23_sub14;
			synchronized (Class23_Sub13_Sub15.aClass89_4018) {
				class23_sub14 = (Class23_Sub14) Class23_Sub4_Sub33.aClass89_3436.method1436(-109);
			}
			if (class23_sub14 == null) {
				break;
			}
			class23_sub14.aClass105_Sub1_2321.method1569(false, (int) class23_sub14.aLong358, class23_sub14.aClass13_2322, class23_sub14.aByteArray2333, -102);
		}
	}
	
	Class23_Sub21() {
		/* empty */
	}
	
	static final void method892(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (i_3_ != 0) {
			method890((byte) -19);
		}
		anInt2413++;
		if (i >= 1 && i_1_ >= 1 && i <= 102 && i_1_ <= 102) {
			if (Class7.aBoolean170 && (0x2 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[0][i][i_1_] ^ 0xffffffff) == -1) {
				int i_7_ = i_5_;
				if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[i_5_][i][i_1_] & 0x8 ^ 0xffffffff) != -1) {
					i_7_ = 0;
				}
				if ((Class23_Sub4_Sub7.anInt3025 ^ 0xffffffff) != (i_7_ ^ 0xffffffff)) {
					return;
				}
			}
			int i_8_ = i_5_;
			if (i_8_ < 3 && (Class23_Sub4_Sub30.aByteArrayArrayArray3379[1][i][i_1_] & 0x2) == 2) {
				i_8_++;
			}
			Class23_Sub13_Sub25.method857(i, Class4.aClass72Array85[i_5_], -99, i_4_, i_8_, i_1_, i_5_);
			if ((i_0_ ^ 0xffffffff) <= -1) {
				Class35.method984(i_1_, Class4.aClass72Array85[i_5_], i_6_, false, i_5_, false, i_2_, -117, i_8_, i, false, i_0_);
			}
		}
	}
}
