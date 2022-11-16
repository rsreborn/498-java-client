/* Class71_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class71_Sub3 extends Class71
{
	static Canvas aCanvas2740;
	static int anInt2741 = 0;
	static int anInt2742 = 0;
	static RSString aClass16_2743;
	private static RSString aClass16_2744 = Class38_Sub6.method1076((byte) 86, "You are standing in a members)2only area)3");
	static Class105 aClass105_2745;
	static int anInt2746;
	static int anInt2747;
	static int anInt2748;
	
	static final void method1287(int i) {
		Class23_Sub13_Sub20.anInt4172 = i;
		for (int i_0_ = 0; i_0_ < Class105.anInt1802; i_0_++) {
			for (int i_1_ = 0; i_1_ < client.anInt1974; i_1_++) {
				if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_] == null) {
					Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_] = new Class23_Sub1(i, i_0_, i_1_);
				}
			}
		}
	}
	
	static final int method1288(int i, int i_2_, int i_3_) {
		if (i > -121) {
			return 20;
		}
		anInt2748++;
		int i_4_ = i_3_ + i_2_ * 57;
		i_4_ ^= i_4_ << 13;
		int i_5_ = 1376312589 + (15731 * (i_4_ * i_4_) + 789221) * i_4_ & 0x7fffffff;
		return i_5_ >> 19 & 0xff;
	}
	
	public static void method1289(int i) {
		aClass16_2744 = null;
		if (i == -789436973) {
			aClass16_2743 = null;
			aClass105_2745 = null;
			aCanvas2740 = null;
		}
	}
	
	static {
		aClass16_2743 = aClass16_2744;
	}
}
