/* Class23_Sub13_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub21 extends Class23_Sub13
{
	static RSString aClass16_4186;
	static RSString aClass16_4187;
	static int anInt4188;
	protected int anInt4189 = 0;
	private static RSString aClass16_4190;
	static long aLong4191;
	static int anInt4192;
	static Class105 aClass105_4193;
	private static RSString aClass16_4194 = Class38_Sub6.method1076((byte) 86, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	static int anInt4195;
	static int anInt4196;
	static RSString aClass16_4197;
	static int anInt4198;
	private static RSString aClass16_4199;
	static RSString aClass16_4200;
	static RSString aClass16_4201;
	
	private final void method826(int i, int i_0_, Buffer class23_sub5) {
		if (i_0_ == i) {
			anInt4189 = class23_sub5.method476((byte) -115);
		}
		anInt4188++;
	}
	
	static final Class23_Sub13_Sub17 method827(int i, byte b) {
		anInt4192++;
		Class23_Sub13_Sub17 class23_sub13_sub17 = (Class23_Sub13_Sub17) Class38.aClass5_584.method62(122, (long) i);
		if (class23_sub13_sub17 != null) {
			return class23_sub13_sub17;
		}
		byte[] bs = Class23_Sub19.aClass105_2386.method1544(Class25.method923(i, 255), 0, Class23_Sub13_Sub5.method627(true, i));
		class23_sub13_sub17 = new Class23_Sub13_Sub17();
		class23_sub13_sub17.anInt4051 = i;
		if (bs != null) {
			class23_sub13_sub17.method786((byte) 89, new Buffer(bs));
		}
		Class38.aClass5_584.method67((long) i, class23_sub13_sub17, true);
		if (b > -104) {
			return null;
		}
		return class23_sub13_sub17;
	}
	
	static final void method828(byte b, long l) {
		anInt4195++;
		if ((l ^ 0xffffffffffffffffL) != -1L) {
			Class23_Sub7.outBuffer.method486(244, 2976);
			if (b >= 51) {
				Class29.anInt446++;
				Class23_Sub7.outBuffer.method436(l, (byte) -124);
			}
		}
	}
	
	final void method829(Buffer class23_sub5, int i) {
		for (;;) {
			int i_1_ = class23_sub5.method461(-1797813752);
			if ((i_1_ ^ 0xffffffff) == -1) {
				break;
			}
			method826(2, i_1_, class23_sub5);
		}
		anInt4198++;
		if (i != 128) {
			method830(-44, 82, -50, 29, null, 2L, true);
		}
	}
	
	static final void method830(int i, int i_2_, int i_3_, int i_4_, Class38 class38, long l, boolean bool) {
		if (class38 != null) {
			Class69 class69 = new Class69();
			class69.aClass38_1219 = class38;
			class69.anInt1221 = i_2_ * 128 + 64;
			class69.anInt1210 = i_3_ * 128 + 64;
			class69.anInt1213 = i_4_;
			class69.aLong1209 = l;
			if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_2_][i_3_] == null) {
				Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_2_][i_3_] = new Class23_Sub1(i, i_2_, i_3_);
			}
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_2_][i_3_].aClass69_2034 = class69;
		}
	}
	
	public static void method831(int i) {
		if (i != 128) {
			aClass105_4193 = null;
		}
		aClass105_4193 = null;
		aClass16_4194 = null;
		aClass16_4199 = null;
		aClass16_4187 = null;
		aClass16_4200 = null;
		aClass16_4190 = null;
		aClass16_4186 = null;
		aClass16_4201 = null;
		aClass16_4197 = null;
	}
	
	static {
		aClass16_4187 = Class38_Sub6.method1076((byte) 86, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");
		aClass16_4199 = Class38_Sub6.method1076((byte) 86, "Drop");
		aClass16_4197 = aClass16_4194;
		aClass16_4186 = aClass16_4199;
		aClass16_4190 = Class38_Sub6.method1076((byte) 86, "Loaded textures");
		aClass16_4200 = aClass16_4190;
		aClass16_4201 = Class38_Sub6.method1076((byte) 86, "Bitte geben Sie Ihren Benutzernamen ein)3");
	}
}
