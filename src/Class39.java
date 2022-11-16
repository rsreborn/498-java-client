/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class39
{
	static int anInt597;
	protected int anInt598;
	protected int anInt599;
	static RSString aClass16_600 = Class38_Sub6.method1076((byte) 86, ")3runescape)3com");
	protected int anInt601;
	protected int anInt602;
	protected long aLong603 = 0L;
	static int anInt604;
	static volatile int anInt605 = 0;
	static int anInt606;
	protected int anInt607;
	protected int anInt608;
	static Class32 aClass32_609;
	protected int anInt610;
	protected int anInt611;
	protected int anInt612;
	protected int anInt613;
	protected int anInt614;
	protected Class38 aClass38_615;
	private static RSString aClass16_616;
	static RSString aClass16_617;
	static int[] anIntArray618;
	static RSString aClass16_619;
	static Class105 aClass105_620;
	
	public static void method1102(int i) {
		aClass32_609 = null;
		aClass16_616 = null;
		aClass105_620 = null;
		aClass16_617 = null;
		if (i == 0) {
			aClass16_619 = null;
			anIntArray618 = null;
			aClass16_600 = null;
		}
	}
	
	static final void method1103(int i, int i_0_, int i_1_, int i_2_, Class38 class38, long l, Class38 class38_3_, Class38 class38_4_) {
		Class46 class46 = new Class46();
		class46.aClass38_704 = class38;
		class46.anInt705 = i_0_ * 128 + 64;
		class46.anInt706 = i_1_ * 128 + 64;
		class46.anInt703 = i_2_;
		class46.aLong711 = l;
		class46.aClass38_702 = class38_3_;
		class46.aClass38_718 = class38_4_;
		int i_5_ = 0;
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_];
		if (class23_sub1 != null) {
			for (int i_6_ = 0; i_6_ < class23_sub1.anInt2029; i_6_++) {
				Class39 class39 = class23_sub1.aClass39Array2028[i_6_];
				if ((class39.aLong603 & 0x400000L) == 4194304L) {
					int i_7_ = class39.aClass38_615.method999();
					if (i_7_ != -32768 && i_7_ < i_5_) {
						i_5_ = i_7_;
					}
				}
			}
		}
		class46.anInt709 = -i_5_;
		if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_] == null) {
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_] = new Class23_Sub1(i, i_0_, i_1_);
		}
		Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_].aClass46_2026 = class46;
	}
	
	static final void method1104(boolean bool, int i) {
		anInt597++;
		Class23_Sub17 class23_sub17 = (Class23_Sub17) Class23_Sub4_Sub7.anOa2997.a((byte) 122, (long) i);
		if (bool != false) {
			method1103(-96, 122, 115, -40, null, 22L, null, null);
		}
		if (class23_sub17 != null) {
			class23_sub17.method228(0);
		}
	}
	
	static {
		anInt604 = -1;
		anInt606 = 0;
		aClass16_616 = Class38_Sub6.method1076((byte) 86, "Checking for updates )2 ");
		aClass16_617 = aClass16_616;
		aClass32_609 = new Class32();
		aClass16_619 = Class38_Sub6.method1076((byte) 86, "");
	}
}
