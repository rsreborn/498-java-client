/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class69
{
	static Class106 aClass106_1206;
	static int anInt1207;
	static int anInt1208;
	protected long aLong1209;
	protected int anInt1210;
	static Class105_Sub1 aClass105_Sub1_1211;
	static long aLong1212;
	protected int anInt1213;
	static Class105_Sub1 aClass105_Sub1_1214;
	static RSString aClass16_1215;
	static int anInt1216;
	static RSString aClass16_1217 = Class38_Sub6.method1076((byte) 86, "document)3cookie=(R");
	static int anInt1218;
	protected Class38 aClass38_1219;
	static Class43 aClass43_1220;
	protected int anInt1221;
	
	public static void method1256(int i) {
		if (i != -1686910681) {
			aClass105_Sub1_1211 = null;
		}
		aClass16_1215 = null;
		aClass105_Sub1_1214 = null;
		aClass105_Sub1_1211 = null;
		aClass106_1206 = null;
		aClass16_1217 = null;
		aClass43_1220 = null;
	}
	
	static final void method1257(boolean bool) {
		anInt1207++;
		int i = (Class105.aClass38_Sub7_Sub2_1812.anInt2674 >> 7) + Class42.anInt662;
		int i_0_ = (Class105.aClass38_Sub7_Sub2_1812.anInt2659 >> 7) - -Class58.anInt903;
		Class23_Sub4_Sub39.anInt3519 = 0;
		if (i >= 3053 && i <= 3156 && i_0_ >= 3056 && i_0_ <= 3136) {
			Class23_Sub4_Sub39.anInt3519 = 1;
		}
		if (i >= 3072 && i <= 3118 && i_0_ >= 9492 && i_0_ <= 9535) {
			Class23_Sub4_Sub39.anInt3519 = 1;
		}
		if (Class23_Sub4_Sub39.anInt3519 == 1 && i >= 3139 && i <= 3199 && i_0_ >= 3008 && i_0_ <= 3062) {
			Class23_Sub4_Sub39.anInt3519 = 0;
		}
		if (bool != true) {
			aLong1212 = -59L;
		}
	}
	
	static final byte[] method1258(int i, byte[] bs) {
		Buffer class23_sub5 = new Buffer(bs);
		anInt1208++;
		int i_1_ = class23_sub5.method461(-1797813752);
		int i_2_ = class23_sub5.method472(i + 111);
		if (i_2_ < i || (Class23_Sub4_Sub36.anInt3466 ^ 0xffffffff) != -1 && (Class23_Sub4_Sub36.anInt3466 ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
			throw new RuntimeException();
		}
		if ((i_1_ ^ 0xffffffff) != -1) {
			int i_3_ = class23_sub5.method472(i ^ 0x6c);
			if (i_3_ < 0 || (Class23_Sub4_Sub36.anInt3466 ^ 0xffffffff) != -1 && i_3_ > Class23_Sub4_Sub36.anInt3466) {
				throw new RuntimeException();
			}
			byte[] bs_4_ = new byte[i_3_];
			if (i_1_ == 1) {
				Class85.method1395(bs_4_, i_3_, bs, i_2_, 9);
			} else {
				Class17.aClass102_309.method1516(bs_4_, false, class23_sub5);
			}
			return bs_4_;
		}
		byte[] bs_5_ = new byte[i_2_];
		class23_sub5.method450(i_2_, bs_5_, i ^ 0x70, 0);
		return bs_5_;
	}
	
	static {
		aLong1212 = 0L;
		aClass16_1215 = Class38_Sub6.method1076((byte) 86, "hint_headicons");
		anInt1218 = -1;
	}
}
