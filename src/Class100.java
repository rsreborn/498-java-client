/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class100
{
	static RSString aClass16_1682;
	static int anInt1683;
	static RSString aClass16_1684;
	static int anInt1685;
	static int anInt1686 = 0;
	static RSString aClass16_1687;
	static int anInt1688;
	
	static final void method1502(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		Class59 class59 = new Class59();
		class59.anInt941 = i_1_ / 128;
		class59.anInt914 = i_2_ / 128;
		class59.anInt923 = i_3_ / 128;
		class59.anInt936 = i_4_ / 128;
		class59.anInt948 = i_0_;
		class59.anInt947 = i_1_;
		class59.anInt929 = i_2_;
		class59.anInt944 = i_3_;
		class59.anInt930 = i_4_;
		class59.anInt927 = i_5_;
		class59.anInt922 = i_6_;
		Class38.aClass59ArrayArray591[i][Class38.anIntArray595[i]++] = class59;
	}
	
	static final void method1503(int i, int i_7_, int i_8_, int i_9_, boolean bool, int i_10_) {
		if (bool != true) {
			aClass16_1682 = null;
		}
		anInt1685++;
		int i_11_ = Class23_Sub4_Sub32.method405(72, Class88.anInt1503, i, Class23_Sub4_Sub33.anInt3435);
		int i_12_ = Class23_Sub4_Sub32.method405(92, Class88.anInt1503, i_9_, Class23_Sub4_Sub33.anInt3435);
		int i_13_ = Class23_Sub4_Sub32.method405(69, Class23_Sub13_Sub6.anInt3728, i_7_, Class35.anInt554);
		int i_14_ = Class23_Sub4_Sub32.method405(107, Class23_Sub13_Sub6.anInt3728, i_10_, Class35.anInt554);
		for (int i_15_ = i_11_; (i_15_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff); i_15_++)
			Class23_Sub13_Sub6.method632(i_14_, (byte) -30, i_8_, Class4.anIntArrayArray98[i_15_], i_13_);
	}
	
	static final int method1504(int i, int i_16_) {
		anInt1688++;
		int i_17_ = 0;
		if ((i_16_ ^ 0xffffffff) > -1 || i_16_ >= 65536) {
			i_16_ >>>= 16;
			i_17_ += 16;
		}
		if (i_16_ >= 256) {
			i_16_ >>>= 8;
			i_17_ += 8;
		}
		if (i_16_ >= 16) {
			i_16_ >>>= 4;
			i_17_ += 4;
		}
		if (i_16_ >= 4) {
			i_16_ >>>= 2;
			i_17_ += 2;
		}
		if (i != 8) {
			return 5;
		}
		if (i_16_ >= 1) {
			i_17_++;
			i_16_ >>>= 1;
		}
		return i_16_ + i_17_;
	}
	
	public static void method1505(byte b) {
		aClass16_1682 = null;
		aClass16_1684 = null;
		aClass16_1687 = null;
		if (b >= -126) {
			aClass16_1684 = null;
		}
	}
	
	static {
		aClass16_1684 = Class38_Sub6.method1076((byte) 86, "<col=ff0000>");
		aClass16_1682 = Class38_Sub6.method1076((byte) 86, " steht bereits auf Ihrer Ignorieren)2Liste(Q");
		aClass16_1687 = Class38_Sub6.method1076((byte) 86, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");
	}
}
