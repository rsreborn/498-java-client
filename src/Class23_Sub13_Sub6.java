/* Class23_Sub13_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub6 extends Class23_Sub13
{
	protected int anInt3725 = 0;
	static int anInt3726;
	static int anInt3727;
	static int anInt3728 = 0;
	static Class5 aClass5_3729;
	static int anInt3730;
	static int anInt3731;
	static int anInt3732;
	static RSString aClass16_3733 = Class38_Sub6.method1076((byte) 86, "title_mute");
	static int anInt3734;
	static int anInt3735;
	static boolean aBoolean3736;
	static RSString aClass16_3737;
	static int[] anIntArray3738;
	
	static final void method628(boolean bool) {
		if (bool != true) {
			anIntArray3738 = null;
		}
		anInt3732++;
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}
	
	final void method629(byte b, Buffer class23_sub5) {
		for (;;) {
			int i = class23_sub5.readByte();
			if (i == 0) {
				break;
			}
			method633(i, class23_sub5, -104);
		}
		if (b > -14) {
			aClass16_3733 = null;
		}
		anInt3727++;
	}
	
	public static void method630(byte b) {
		aClass5_3729 = null;
		aClass16_3737 = null;
		if (b >= -22) {
			anInt3734 = -113;
		}
		anIntArray3738 = null;
		aClass16_3733 = null;
	}
	
	static final boolean method631(int i, int i_0_, int i_1_, int i_2_, Class38 class38, int i_3_, long l, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (class38 == null) {
			return true;
		}
		return Class23_Sub4_Sub17.method334(i, i_4_, i_5_, i_6_ - i_4_ + 1, i_7_ - i_5_ + 1, i_0_, i_1_, i_2_, class38, i_3_, true, l);
	}
	
	static final void method632(int i, byte b, int i_8_, int[] is, int i_9_) {
		i_9_--;
		if (b == -30) {
			anInt3730++;
			int i_10_ = -7 + --i;
			while (i_10_ > i_9_) {
				is[++i_9_] = i_8_;
				is[++i_9_] = i_8_;
				is[++i_9_] = i_8_;
				is[++i_9_] = i_8_;
				is[++i_9_] = i_8_;
				is[++i_9_] = i_8_;
				is[++i_9_] = i_8_;
				is[++i_9_] = i_8_;
			}
			while ((i ^ 0xffffffff) < (i_9_ ^ 0xffffffff))
				is[++i_9_] = i_8_;
		}
	}
	
	private final void method633(int i, Buffer class23_sub5, int i_11_) {
		anInt3726++;
		if (i == 5) {
			anInt3725 = class23_sub5.readShortBE();
		}
		if (i_11_ > -41) {
			method628(true);
		}
	}
	
	static {
		aClass5_3729 = new Class5(64);
		aClass16_3737 = Class38_Sub6.method1076((byte) 86, "overlay)3dat");
		anInt3734 = 0;
		aBoolean3736 = false;
		anIntArray3738 = new int[50];
	}
}
