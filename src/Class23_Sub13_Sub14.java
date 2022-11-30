/* Class23_Sub13_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub14 extends Class23_Sub13
{
	static int[] anIntArray4001;
	static int anInt4002 = 0;
	private static RSString aClass16_4003;
	static RSString aClass16_4004 = Class38_Sub6.method1076((byte) 86, "Begeben Sie sich in ein freies Gebiet)1 um");
	static RSString aClass16_4005;
	static int anInt4006;
	static Class64 aClass64_4007;
	static int anInt4008;
	static RSString aClass16_4009;
	protected int anInt4010;
	protected int anInt4011;
	static int anInt4012;
	static int anInt4013;
	static int anInt4014;
	protected int anInt4015;
	static int[] anIntArray4016;
	
	private final void method765(int i, int i_0_, Buffer class23_sub5) {
		if (i_0_ == 1) {
			anInt4011 = class23_sub5.readShortBE();
			anInt4015 = class23_sub5.readByte();
			anInt4010 = class23_sub5.readByte();
		}
		if (i != -18449) {
			anIntArray4016 = null;
		}
		anInt4012++;
	}
	
	final void method766(Buffer class23_sub5, int i) {
		if (i != 2) {
			aClass16_4003 = null;
		}
		for (;;) {
			int i_1_ = class23_sub5.readByte();
			if ((i_1_ ^ 0xffffffff) == -1) {
				break;
			}
			method765(-18449, i_1_, class23_sub5);
		}
		anInt4014++;
	}
	
	static final void method767(int i, int i_2_, int i_3_, int i_4_, Class38 class38, Class38 class38_5_, int i_6_, int i_7_, int i_8_, int i_9_, long l) {
		if (class38 != null) {
			Class24 class24 = new Class24();
			class24.aLong364 = l;
			class24.anInt366 = i_2_ * 128 + 64;
			class24.anInt363 = i_3_ * 128 + 64;
			class24.anInt370 = i_4_;
			class24.aClass38_367 = class38;
			class24.aClass38_369 = class38_5_;
			class24.anInt378 = i_6_;
			class24.anInt374 = i_7_;
			class24.anInt375 = i_8_;
			class24.anInt371 = i_9_;
			for (int i_10_ = i; i_10_ >= 0; i_10_--) {
				if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_10_][i_2_][i_3_] == null) {
					Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_10_][i_2_][i_3_] = new Class23_Sub1(i_10_, i_2_, i_3_);
				}
			}
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_2_][i_3_].aClass24_2038 = class24;
		}
	}
	
	public static void method768(byte b) {
		aClass64_4007 = null;
		aClass16_4003 = null;
		anIntArray4016 = null;
		aClass16_4005 = null;
		if (b != 24) {
			method767(-77, 117, 74, -113, null, null, -98, 6, -115, -46, -33L);
		}
		aClass16_4004 = null;
		anIntArray4001 = null;
		aClass16_4009 = null;
	}
	
	static {
		anIntArray4001 = new int[] { 1, 0, 0, 0, 1, 0, 2 };
		aClass16_4005 = Class38_Sub6.method1076((byte) 86, "gelb:");
		aClass16_4003 = Class38_Sub6.method1076((byte) 86, "wishes to trade with you)3");
		aClass64_4007 = null;
		anInt4013 = -1;
		aClass16_4009 = aClass16_4003;
	}
}
