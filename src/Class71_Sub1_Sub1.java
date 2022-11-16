/* Class71_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71_Sub1_Sub1 extends Class71_Sub1
{
	static RSString aClass16_4414;
	static int anInt4415;
	static RSString aClass16_4416;
	private static RSString aClass16_4417 = Class38_Sub6.method1076((byte) 86, "");
	static RSString aClass16_4418;
	static RSString aClass16_4419;
	static RSString aClass16_4420;
	static int anInt4421;
	static RSString aClass16_4422;
	static RSString aClass16_4423;
	static RSString aClass16_4424;
	static RSString aClass16_4425;
	static int anInt4426;
	static RSString aClass16_4427;
	static int anInt4428;
	static RSString aClass16_4429;
	static RSString aClass16_4430;
	static Class23_Sub13_Sub8_Sub1_Sub1 aClass23_Sub13_Sub8_Sub1_Sub1_4431;
	static RSString aClass16_4432;
	static RSString aClass16_4433;
	static RSString aClass16_4434;
	static RSString aClass16_4435;
	static int anInt4436;
	static RSString aClass16_4437;
	static RSString aClass16_4438;
	static RSString aClass16_4439;
	static RSString aClass16_4440;
	static RSString aClass16_4441 = aClass16_4417;
	static RSString aClass16_4442;
	static RSString aClass16_4443 = aClass16_4417;
	static RSString aClass16_4444;
	static RSString aClass16_4445;
	static RSString aClass16_4446;
	static RSString aClass16_4447;
	static RSString aClass16_4448;
	static int anInt4449;
	static RSString aClass16_4450;
	static int anInt4451;
	static RSString aClass16_4452;
	static RSString aClass16_4453 = aClass16_4417;
	static RSString aClass16_4454;
	static RSString aClass16_4455 = aClass16_4417;
	static RSString aClass16_4456;
	static int anInt4457;
	static RSString aClass16_4458;
	static RSString aClass16_4459;
	static RSString aClass16_4460;
	static RSString aClass16_4461;
	static RSString aClass16_4462;
	private static RSString aClass16_4463;
	private static RSString aClass16_4464;
	
	static final void method1271(byte b, Buffer class23_sub5) {
		if (b != -126) {
			aClass16_4454 = null;
		}
		anInt4451++;
		if (Class23_Sub7.aClass29_2196 != null) {
			try {
				Class23_Sub7.aClass29_2196.method948(0L, -11320);
				Class23_Sub7.aClass29_2196.method955(class23_sub5.position, class23_sub5.payload, b + 125, 24);
			} catch (Exception exception) {
				/* empty */
			}
		}
		class23_sub5.position += 24;
	}
	
	static final void method1272(byte b, int i) {
		anInt4428++;
		if (i >= 0) {
			int i_0_ = Class38_Sub2.anIntArray2502[i];
			int i_1_ = Class23_Sub4_Sub31.anIntArray3399[i];
			int i_2_ = Class38_Sub5.aShortArray2603[i];
			int i_3_ = (int) Class82.aLongArray1456[i];
			if (i_2_ >= 2000) {
				i_2_ -= 2000;
			}
			long l = Class82.aLongArray1456[i];
			if (i_2_ == 50) {
				Class23_Sub13_Sub19.anInt4131++;
				Class23_Sub7.outBuffer.method486(233, 2976);
				Class23_Sub7.outBuffer.method463(b + -16, i_0_);
				Class23_Sub7.outBuffer.method427(i_3_, b ^ 0x51c26906);
				Class23_Sub7.outBuffer.writeIntBE(i_1_);
				Class23_Sub4_Sub38.anInt3500 = 0;
				Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
				Class24.anInt362 = i_0_;
			}
			if (i_2_ == 1004) {
				Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
				Class23_Sub7.anInt2213 = 2;
				Class51.anInt798 = 0;
				Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_3_];
				if (class38_sub7_sub1 != null) {
					Class23_Sub13_Sub20 class23_sub13_sub20 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373;
					if (class23_sub13_sub20.anIntArray4153 != null) {
						class23_sub13_sub20 = class23_sub13_sub20.method813(674);
					}
					if (class23_sub13_sub20 != null) {
						Class23_Sub13_Sub18.anInt4084++;
						Class23_Sub7.outBuffer.method486(237, 2976);
						Class23_Sub7.outBuffer.method443(class23_sub13_sub20.anInt4159, (byte) 51);
					}
				}
			}
			if (i_2_ == 25) {
				Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
				if (class38_sub7_sub2 != null) {
					Class82.anInt1441++;
					Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class51.anInt798 = 0;
					Class23_Sub7.anInt2213 = 2;
					Class23_Sub7.outBuffer.method486(214, 2976);
					Class23_Sub7.outBuffer.method463(-33, i_3_);
				}
			}
			if (i_2_ == 11) {
				Class23_Sub4_Sub15.anInt3145++;
				Class23_Sub7.outBuffer.method486(60, 2976);
				Class23_Sub7.outBuffer.writeIntBE(i_1_);
				Class23_Sub7.outBuffer.method443(i_3_, (byte) 51);
				Class23_Sub7.outBuffer.method463(108, i_0_);
				Class23_Sub4_Sub38.anInt3500 = 0;
				Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
				Class24.anInt362 = i_0_;
			}
			if (i_2_ == 39) {
				Class23_Sub13_Sub16.method779(true, i_0_, l, i_1_);
				Class23_Sub12.anInt2294++;
				Class23_Sub7.outBuffer.method486(28, 2976);
				Class23_Sub7.outBuffer.method430(i_0_ - -Class42.anInt662, 14982);
				Class23_Sub7.outBuffer.method463(127, i_1_ + Class58.anInt903);
				Class23_Sub7.outBuffer.method427((int) (l >>> 32) & 0x7fffffff, -1371695448);
			}
			if (i_2_ == 10) {
				Class23_Sub13_Sub16.method779(true, i_0_, l, i_1_);
				Class23_Sub10_Sub3.anInt3654++;
				Class23_Sub7.outBuffer.method486(217, b + 3058);
				Class23_Sub7.outBuffer.method443(Class58.anInt903 + i_1_, (byte) 51);
				Class23_Sub7.outBuffer.method443(i_0_ - -Class42.anInt662, (byte) 51);
				Class23_Sub7.outBuffer.method430((int) (l >>> 32) & 0x7fffffff, b + 15064);
			}
			if (i_2_ == 1001) {
				Class23_Sub13_Sub10.anInt3871++;
				Class23_Sub13_Sub16.method779(true, i_0_, l, i_1_);
				Class23_Sub7.outBuffer.method486(152, b + 3058);
				Class23_Sub7.outBuffer.method427(0x7fffffff & (int) (l >>> 32), -1371695448);
				Class23_Sub7.outBuffer.method430(Class42.anInt662 + i_0_, 14982);
				Class23_Sub7.outBuffer.method427(i_1_ + Class58.anInt903, b ^ 0x51c26906);
			}
			if (i_2_ == 33) {
				Class78.anInt1420++;
				boolean bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
				if (!bool) {
					bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
				}
				Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
				Class51.anInt798 = 0;
				Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
				Class23_Sub7.anInt2213 = 2;
				Class23_Sub7.outBuffer.method486(189, 2976);
				Class23_Sub7.outBuffer.method427(Class42.anInt662 + i_0_, -1371695448);
				Class23_Sub7.outBuffer.method463(-59, i_1_ + Class58.anInt903);
				Class23_Sub7.outBuffer.method427(i_3_, b + -1371695366);
			}
			if (i_2_ == 28) {
				Class100.anInt1683++;
				Class23_Sub7.outBuffer.method486(243, 2976);
				Class23_Sub7.outBuffer.writeIntBE(i_1_);
				Class23_Sub7.outBuffer.method463(-59, i_3_);
				Class23_Sub7.outBuffer.method427(i_0_, -1371695448);
				Class23_Sub4_Sub38.anInt3500 = 0;
				Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
				Class24.anInt362 = i_0_;
			}
			if (i_2_ == 1005) {
				Class23_Sub7.anInt2213 = 2;
				Class23_Sub13_Sub2.anInt3682++;
				Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
				Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
				Class51.anInt798 = 0;
				Class23_Sub7.outBuffer.method486(88, 2976);
				Class23_Sub7.outBuffer.method463(105, i_3_);
			}
			if (i_2_ == 34) {
				boolean bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
				CacheFileChannel.anInt439++;
				if (!bool) {
					bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
				}
				Class23_Sub7.anInt2213 = 2;
				Class51.anInt798 = 0;
				Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
				Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
				Class23_Sub7.outBuffer.method486(169, 2976);
				Class23_Sub7.outBuffer.method430(Class42.anInt662 + i_0_, 14982);
				Class23_Sub7.outBuffer.method443(i_1_ - -Class58.anInt903, (byte) 51);
				Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
			}
			if (i_2_ == 1) {
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_3_];
				if (class38_sub7_sub1 != null) {
					Class5.method66(0, class38_sub7_sub1.anIntArray2694[0], 2, class38_sub7_sub1.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					Class51.anInt798 = 0;
					Class23_Sub7.anInt2213 = 2;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class5.anInt106++;
					Class23_Sub7.outBuffer.method486(241, 2976);
					Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
				}
			}
			if (i_2_ == 19 || i_2_ == 1002) {
				Class23_Sub4_Sub27.method380(Class98.aClass16Array1655[i], (byte) -55, i_0_, i_1_, i_3_);
			}
			if (i_2_ == 48) {
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_3_];
				if (class38_sub7_sub1 != null) {
					Class5.method66(0, class38_sub7_sub1.anIntArray2694[0], 2, class38_sub7_sub1.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					Class23_Sub7.anInt2213 = 2;
					Class23_Sub12.anInt2293++;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class51.anInt798 = 0;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class23_Sub7.outBuffer.method486(239, 2976);
					Class23_Sub7.outBuffer.method443(i_3_, (byte) 51);
				}
			}
			if (i_2_ == 2) {
				Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
				if (class38_sub7_sub2 != null) {
					Class23_Sub23.anInt2422++;
					Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					Class51.anInt798 = 0;
					Class23_Sub7.anInt2213 = 2;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class23_Sub7.outBuffer.method486(185, 2976);
					Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
				}
			}
			if (i_2_ == 8) {
				Class44.anInt677++;
				Class23_Sub7.outBuffer.method486(157, b + 3058);
				Class23_Sub7.outBuffer.method430(i_3_, b ^ ~0x3ad7);
				Class23_Sub7.outBuffer.method430(i_0_, b ^ ~0x3ad7);
				Class23_Sub7.outBuffer.method439((byte) -101, i_1_);
				Class23_Sub4_Sub38.anInt3500 = 0;
				Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
				Class24.anInt362 = i_0_;
			}
			if (i_2_ == 47) {
				Class23_Sub12.anInt2303++;
				Class23_Sub7.outBuffer.method486(170, b + 3058);
				Class23_Sub7.outBuffer.method430(i_0_, 14982);
				Class23_Sub7.outBuffer.method463(b + 190, i_3_);
				Class23_Sub7.outBuffer.method439((byte) -79, i_1_);
				Class23_Sub4_Sub38.anInt3500 = 0;
				Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
				Class24.anInt362 = i_0_;
			}
			if (i_2_ == 45) {
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_3_];
				if (class38_sub7_sub1 != null) {
					Class23_Sub4_Sub12.anInt3090++;
					Class5.method66(0, class38_sub7_sub1.anIntArray2694[0], 2, class38_sub7_sub1.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class23_Sub7.anInt2213 = 2;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class51.anInt798 = 0;
					Class23_Sub7.outBuffer.method486(197, 2976);
					Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
				}
			}
			if (i_2_ == 5) {
				Class23_Sub10_Sub3.method585(Class23_Sub13_Sub11.anInt3916, i_0_, i_1_);
			}
			if (i_2_ == 20) {
				Class23_Sub7.outBuffer.method486(57, 2976);
				Class23_Sub7.outBuffer.method463(-33, i_3_);
				Class23_Sub7.outBuffer.method463(77, i_0_);
				Class23_Sub7.outBuffer.method445(i_1_, (byte) 66);
				Class23_Sub4_Sub38.anInt3500 = 0;
				Class70.anInt1230++;
				Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
				Class24.anInt362 = i_0_;
			}
			if (i_2_ == 1007) {
				Class64 class64 = Class23_Sub24.method905(i_1_, (byte) 111);
				if (class64 == null || (class64.anIntArray1147[i_0_] ^ 0xffffffff) > -100001) {
					Class23_Sub4_Sub15.anInt3141++;
					Class23_Sub7.outBuffer.method486(254, b ^ ~0xbf1);
					Class23_Sub7.outBuffer.method443(i_3_, (byte) 51);
				} else {
					Class95.method1468(0, -1, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub23.method360((byte) -9, class64.anIntArray1147[i_0_]), Class87_Sub3.aClass16_2821, Class23_Sub13_Sub24.method853(b ^ ~0x2b, i_3_).aClass16_3902 }, b ^ 0x5f), Class23_Sub4_Sub38.aClass16_3509);
				}
				Class23_Sub4_Sub38.anInt3500 = 0;
				Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
				Class24.anInt362 = i_0_;
			}
			if (i_2_ == 4) {
				Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
				if (class38_sub7_sub2 != null) {
					Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class51.anInt798 = 0;
					Class63.anInt993++;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class23_Sub7.anInt2213 = 2;
					Class23_Sub7.outBuffer.method486(242, 2976);
					Class23_Sub7.outBuffer.method430(i_3_, 14982);
				}
			}
			if (i_2_ == 57) {
				Class23_Sub7.outBuffer.method486(180, 2976);
				CacheFileChannel.anInt442++;
				Class23_Sub7.outBuffer.writeIntBE(i_1_);
				Class64 class64 = Class23_Sub24.method905(i_1_, (byte) 111);
				if (class64.anIntArrayArray1058 != null && class64.anIntArrayArray1058[0][0] == 5) {
					int i_4_ = class64.anIntArrayArray1058[0][1];
					Class23_Sub4_Sub26.anIntArray3323[i_4_] = 1 - Class23_Sub4_Sub26.anIntArray3323[i_4_];
					method1276(16428, i_4_);
				}
			}
			if (i_2_ == 17) {
				Class23_Sub13_Sub3.anInt3693++;
				boolean bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
				if (!bool) {
					bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
				}
				Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
				Class51.anInt798 = 0;
				Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
				Class23_Sub7.anInt2213 = 2;
				Class23_Sub7.outBuffer.method486(109, 2976);
				Class23_Sub7.outBuffer.method463(125, Class58.anInt903 + i_1_);
				Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
				Class23_Sub7.outBuffer.method427(i_0_ - -Class42.anInt662, b ^ 0x51c26906);
			}
			if (i_2_ == 37) {
				Class71.anInt1276++;
				Class23_Sub13_Sub16.method779(true, i_0_, l, i_1_);
				Class23_Sub7.outBuffer.method486(67, 2976);
				Class23_Sub7.outBuffer.method430(Class42.anInt662 + i_0_, b ^ ~0x3ad7);
				Class23_Sub7.outBuffer.method427(i_1_ - -Class58.anInt903, -1371695448);
				Class23_Sub7.outBuffer.method443(0x7fffffff & (int) (l >>> 32), (byte) 51);
			}
			if (i_2_ == 43) {
				Class105.anInt1777++;
				boolean bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
				if (!bool) {
					bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
				}
				Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
				Class51.anInt798 = 0;
				Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
				Class23_Sub7.anInt2213 = 2;
				Class23_Sub7.outBuffer.method486(89, b + 3058);
				Class23_Sub7.outBuffer.method430(i_3_, b ^ ~0x3ad7);
				Class23_Sub7.outBuffer.method430(Class42.anInt662 + i_0_, 14982);
				Class23_Sub7.outBuffer.method430(i_1_ + Class58.anInt903, 14982);
				Class23_Sub7.outBuffer.method427(Class27.anInt411, -1371695448);
				Class23_Sub7.outBuffer.method439((byte) -111, Class49.anInt759);
				Class23_Sub7.outBuffer.method430(Class17.anInt302, b + 15064);
			}
			if (i_2_ == 35) {
				Class71.anInt1273++;
				boolean bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
				if (!bool) {
					bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
				}
				Class51.anInt798 = 0;
				Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
				Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
				Class23_Sub7.anInt2213 = 2;
				Class23_Sub7.outBuffer.method486(55, 2976);
				Class23_Sub7.outBuffer.method481(Class7.anInt169, (byte) -67);
				Class23_Sub7.outBuffer.method430(i_0_ + Class42.anInt662, 14982);
				Class23_Sub7.outBuffer.method463(102, Class58.anInt903 + i_1_);
				Class23_Sub7.outBuffer.method430(Class23_Sub13_Sub14.anInt4013, 14982);
				Class23_Sub7.outBuffer.method443(i_3_, (byte) 51);
			}
			if (i_2_ == 13) {
				Buffer.method444(-7602);
			}
			if (i_2_ == 40) {
				Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
				if (class38_sub7_sub2 != null) {
					Class23_Sub21.anInt2407++;
					Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class23_Sub7.anInt2213 = 2;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class51.anInt798 = 0;
					Class23_Sub7.outBuffer.method486(61, 2976);
					Class23_Sub7.outBuffer.writeIntBE(Class49.anInt759);
					Class23_Sub7.outBuffer.method443(Class27.anInt411, (byte) 51);
					Class23_Sub7.outBuffer.method427(Class17.anInt302, b ^ 0x51c26906);
					Class23_Sub7.outBuffer.method463(-83, i_3_);
				}
			}
			if (i_2_ == 32) {
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_3_];
				if (class38_sub7_sub1 != null) {
					RuntimeException_Sub1.anInt1846++;
					Class5.method66(0, class38_sub7_sub1.anIntArray2694[0], 2, class38_sub7_sub1.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					Class51.anInt798 = 0;
					Class23_Sub7.anInt2213 = 2;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class23_Sub7.outBuffer.method486(58, 2976);
					Class23_Sub7.outBuffer.method430(Class27.anInt411, 14982);
					Class23_Sub7.outBuffer.method445(Class49.anInt759, (byte) 66);
					Class23_Sub7.outBuffer.method463(-113, Class17.anInt302);
					Class23_Sub7.outBuffer.method430(i_3_, 14982);
				}
			}
			if (i_2_ == 15 && Class23_Sub13_Sub14.aClass64_4007 == null) {
				Class7.method95((byte) 104, i_0_, i_1_);
				Class23_Sub13_Sub14.aClass64_4007 = Class23_Sub13_Sub8_Sub1.method679(i_1_, i_0_, (byte) -35);
				Class91.method1450((byte) 29, Class23_Sub13_Sub14.aClass64_4007);
			}
			if (i_2_ == 30) {
				Class64 class64 = Class23_Sub24.method905(i_1_, (byte) 111);
				boolean bool = true;
				if ((class64.anInt1149 ^ 0xffffffff) < -1) {
					bool = Class38_Sub7_Sub1.method1092(class64, b + 287);
				}
				if (bool) {
					CacheFileChannel.anInt442++;
					Class23_Sub7.outBuffer.method486(180, b + 3058);
					Class23_Sub7.outBuffer.writeIntBE(i_1_);
				}
			}
			if (i_2_ == 18) {
				Class23_Sub4_Sub36.method415(1);
				Class64 class64 = Class23_Sub24.method905(i_1_, (byte) 111);
				Class49.anInt759 = i_1_;
				Class17.anInt302 = i_0_;
				Class38_Sub7_Sub1.anInt4374 = 1;
				Class27.anInt411 = i_3_;
				Class91.method1450((byte) 29, class64);
				Class23_Sub13_Sub24.aClass16_4281 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, Class23_Sub13_Sub24.method853(-117, i_3_).aClass16_3902, Class23_Sub4_Sub1.aClass16_2896 }, -99);
				if (Class23_Sub13_Sub24.aClass16_4281 == null) {
					Class23_Sub13_Sub24.aClass16_4281 = Class23_Sub4_Sub30.aClass16_3378;
				}
			} else if (i_2_ == 9) {
				Class64 class64 = Class23_Sub13_Sub8_Sub1.method679(i_1_, i_0_, (byte) -56);
				if (class64 != null) {
					Class23_Sub4_Sub36.method415(b ^ ~0x50);
					Class23_Sub4_Sub18.method339(5087, Class74.method1313(-34, Class47.method1142(class64, 117)), i_1_, i_0_);
					Class38_Sub7_Sub1.anInt4374 = 0;
					Class49.aClass16_764 = Class99.method1497((byte) -126, class64);
					if (Class49.aClass16_764 == null) {
						Class49.aClass16_764 = Class27.aClass16_409;
					}
					if (!class64.aBoolean1017) {
						Class23_Sub13_Sub4.aClass16_3714 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub35.aClass16_3458, class64.aClass16_1019, Class23_Sub4_Sub1.aClass16_2896 }, -64);
					} else {
						Class23_Sub13_Sub4.aClass16_3714 = Class23_Sub4_Sub14.method322(new RSString[] { class64.aClass16_1130, Class23_Sub4_Sub1.aClass16_2896 }, -74);
					}
				}
			} else {
				if (i_2_ == 12) {
					Class23_Sub13_Sub13.anInt3986++;
					boolean bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
					if (!bool) {
						bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					}
					Class51.anInt798 = 0;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class23_Sub7.anInt2213 = 2;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class23_Sub7.outBuffer.method486(141, b ^ ~0xbf1);
					Class23_Sub7.outBuffer.method463(b ^ 0x5, Class58.anInt903 + i_1_);
					Class23_Sub7.outBuffer.method463(94, i_3_);
					Class23_Sub7.outBuffer.method427(Class42.anInt662 + i_0_, -1371695448);
				}
				if (i_2_ == 44) {
					Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
					if (class38_sub7_sub2 != null) {
						Class23_Sub13_Sub17.anInt4075++;
						Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Class23_Sub7.anInt2213 = 2;
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class51.anInt798 = 0;
						Class23_Sub7.outBuffer.method486(228, 2976);
						Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
					}
				}
				if (i_2_ == 58) {
					Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_3_];
					if (class38_sub7_sub1 != null) {
						Class5.method66(0, class38_sub7_sub1.anIntArray2694[0], 2, class38_sub7_sub1.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Class23_Sub7.anInt2213 = 2;
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class51.anInt798 = 0;
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Class25.anInt387++;
						Class23_Sub7.outBuffer.method486(182, 2976);
						Class23_Sub7.outBuffer.method463(-82, i_3_);
					}
				}
				if (i_2_ == 42 && Class23_Sub13_Sub16.method779(true, i_0_, l, i_1_)) {
					Class23_Sub7.outBuffer.method486(191, 2976);
					Class23_Sub7.outBuffer.method443(Class23_Sub13_Sub14.anInt4013, (byte) 51);
					Class23_Sub13_Sub11.anInt3912++;
					Class23_Sub7.outBuffer.method430(Class58.anInt903 + i_1_, 14982);
					Class23_Sub7.outBuffer.writeIntBE(Class7.anInt169);
					Class23_Sub7.outBuffer.method443(i_0_ - -Class42.anInt662, (byte) 51);
					Class23_Sub7.outBuffer.method430((int) (l >>> 32) & 0x7fffffff, b + 15064);
				}
				if (i_2_ == 1003) {
					Class23_Sub4_Sub15.anInt3141++;
					Class51.anInt798 = 0;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class23_Sub7.anInt2213 = 2;
					Class23_Sub7.outBuffer.method486(254, 2976);
					Class23_Sub7.outBuffer.method443(i_3_, (byte) 51);
				}
				if (i_2_ == 23) {
					Class23_Sub7.outBuffer.method486(180, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_1_);
					CacheFileChannel.anInt442++;
					Class64 class64 = Class23_Sub24.method905(i_1_, (byte) 111);
					if (class64.anIntArrayArray1058 != null && class64.anIntArrayArray1058[0][0] == 5) {
						int i_5_ = class64.anIntArrayArray1058[0][1];
						if (class64.anIntArray1010[0] != Class23_Sub4_Sub26.anIntArray3323[i_5_]) {
							Class23_Sub4_Sub26.anIntArray3323[i_5_] = class64.anIntArray1010[0];
							method1276(b + 16510, i_5_);
						}
					}
				}
				if (i_2_ == 29) {
					Class23_Sub4_Sub8.anInt3032++;
					Class23_Sub13_Sub16.method779(true, i_0_, l, i_1_);
					Class23_Sub7.outBuffer.method486(50, b + 3058);
					Class23_Sub7.outBuffer.method427(i_0_ + Class42.anInt662, b ^ 0x51c26906);
					Class23_Sub7.outBuffer.method443(0x7fffffff & (int) (l >>> 32), (byte) 51);
					Class23_Sub7.outBuffer.method443(i_1_ + Class58.anInt903, (byte) 51);
				}
				if (i_2_ == 41) {
					Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
					if (class38_sub7_sub2 != null) {
						Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class23_Sub13_Sub13.anInt3992++;
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Class51.anInt798 = 0;
						Class23_Sub7.anInt2213 = 2;
						Class23_Sub7.outBuffer.method486(105, 2976);
						Class23_Sub7.outBuffer.method443(i_3_, (byte) 51);
					}
				}
				if (i_2_ == 6) {
					Class23_Sub7.outBuffer.method486(20, b ^ ~0xbf1);
					Class5.anInt109++;
					Class23_Sub7.outBuffer.method430(i_3_, 14982);
					Class23_Sub7.outBuffer.method443(i_0_, (byte) 51);
					Class23_Sub7.outBuffer.method481(i_1_, (byte) -67);
					Class23_Sub4_Sub38.anInt3500 = 0;
					Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
					Class24.anInt362 = i_0_;
				}
				if (i_2_ == 49) {
					Class63.anInt981++;
					Class23_Sub7.outBuffer.method486(108, 2976);
					Class23_Sub7.outBuffer.method443(Class23_Sub13_Sub14.anInt4013, (byte) 51);
					Class23_Sub7.outBuffer.method463(118, i_0_);
					Class23_Sub7.outBuffer.writeIntBE(i_1_);
					Class23_Sub7.outBuffer.method481(Class7.anInt169, (byte) -67);
				}
				if (b != -82) {
					aClass16_4432 = null;
				}
				if (i_2_ == 16) {
					Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
					if (class38_sub7_sub2 != null) {
						Class23_Sub24.anInt2453++;
						Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Class51.anInt798 = 0;
						Class23_Sub7.anInt2213 = 2;
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class23_Sub7.outBuffer.method486(52, 2976);
						Class23_Sub7.outBuffer.method430(i_3_, 14982);
					}
				}
				if (i_2_ == 46) {
					Class23_Sub2.anInt2068++;
					boolean bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
					if (!bool) {
						bool = Class5.method66(0, i_1_, 2, i_0_, false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
					}
					Class23_Sub7.anInt2213 = 2;
					Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
					Class51.anInt798 = 0;
					Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
					Class23_Sub7.outBuffer.method486(85, 2976);
					Class23_Sub7.outBuffer.method430(i_3_, b + 15064);
					Class23_Sub7.outBuffer.method430(Class58.anInt903 + i_1_, 14982);
					Class23_Sub7.outBuffer.method443(i_0_ - -Class42.anInt662, (byte) 51);
				}
				if (i_2_ == 51) {
					Class23_Sub7.outBuffer.method486(145, 2976);
					Class23_Sub7.outBuffer.method481(i_1_, (byte) -67);
					Class23_Sub7.outBuffer.method463(b + -29, i_3_);
					Class23_Sub7.outBuffer.method430(i_0_, 14982);
					Class23_Sub4_Sub38.anInt3500 = 0;
					Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
					Class23_Sub21.anInt2406++;
					Class24.anInt362 = i_0_;
				}
				if (i_2_ == 38) {
					Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
					if (class38_sub7_sub2 != null) {
						Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Class23_Sub7.anInt2213 = 2;
						Class19.anInt326++;
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class51.anInt798 = 0;
						Class23_Sub7.outBuffer.method486(139, b + 3058);
						Class23_Sub7.outBuffer.method443(i_3_, (byte) 51);
						Class23_Sub7.outBuffer.method445(Class7.anInt169, (byte) 66);
						Class23_Sub7.outBuffer.method443(Class23_Sub13_Sub14.anInt4013, (byte) 51);
					}
				}
				if (i_2_ == 24) {
					Class23_Sub7.outBuffer.method486(251, b + 3058);
					Class23_Sub7.outBuffer.method427(i_0_, -1371695448);
					Class83.anInt1466++;
					Class23_Sub7.outBuffer.writeIntBE(Class7.anInt169);
					Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
					Class23_Sub7.outBuffer.method445(i_1_, (byte) 66);
					Class23_Sub7.outBuffer.method463(115, Class23_Sub13_Sub14.anInt4013);
					Class23_Sub4_Sub38.anInt3500 = 0;
					Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
					Class24.anInt362 = i_0_;
				}
				if (i_2_ == 26) {
					Class25.anInt390++;
					Class23_Sub7.outBuffer.method486(188, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_1_);
					Class23_Sub7.outBuffer.method463(118, i_3_);
					Class23_Sub7.outBuffer.method427(i_0_, b + -1371695366);
					Class23_Sub7.outBuffer.method430(Class27.anInt411, 14982);
					Class23_Sub7.outBuffer.method443(Class17.anInt302, (byte) 51);
					Class23_Sub7.outBuffer.method439((byte) -123, Class49.anInt759);
					Class23_Sub4_Sub38.anInt3500 = 0;
					Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
					Class24.anInt362 = i_0_;
				}
				if (i_2_ == 21) {
					Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_3_];
					if (class38_sub7_sub1 != null) {
						Class5.method66(0, class38_sub7_sub1.anIntArray2694[0], 2, class38_sub7_sub1.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Class70.anInt1239++;
						Class23_Sub7.anInt2213 = 2;
						Class51.anInt798 = 0;
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Class23_Sub7.outBuffer.method486(248, 2976);
						Class23_Sub7.outBuffer.method463(b + 205, i_3_);
						Class23_Sub7.outBuffer.method463(83, Class23_Sub13_Sub14.anInt4013);
						Class23_Sub7.outBuffer.method445(Class7.anInt169, (byte) 66);
					}
				}
				if (i_2_ == 7) {
					Class23_Sub7.outBuffer.method486(236, 2976);
					Class81.anInt1438++;
					Class23_Sub7.outBuffer.method430(i_0_, 14982);
					Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
					Class23_Sub7.outBuffer.method445(i_1_, (byte) 66);
					Class23_Sub4_Sub38.anInt3500 = 0;
					Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
					Class24.anInt362 = i_0_;
				}
				if (i_2_ == 3) {
					Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
					if (class38_sub7_sub2 != null) {
						Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Class23_Sub4_Sub19.anInt3214++;
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Class51.anInt798 = 0;
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class23_Sub7.anInt2213 = 2;
						Class23_Sub7.outBuffer.method486(249, 2976);
						Class23_Sub7.outBuffer.method427(i_3_, -1371695448);
					}
				}
				if (i_2_ == 14 && Class23_Sub13_Sub16.method779(true, i_0_, l, i_1_)) {
					Class23_Sub7.outBuffer.method486(122, 2976);
					Class23_Sub7.outBuffer.method443(Class42.anInt662 + i_0_, (byte) 51);
					Class23_Sub7.outBuffer.method443(Class17.anInt302, (byte) 51);
					Class23_Sub7.outBuffer.method481(Class49.anInt759, (byte) -67);
					Class23_Sub7.outBuffer.method430(Class27.anInt411, b ^ ~0x3ad7);
					Class23_Sub7.outBuffer.method427(i_1_ - -Class58.anInt903, -1371695448);
					Class31.anInt490++;
					Class23_Sub7.outBuffer.method430(0x7fffffff & (int) (l >>> 32), b ^ ~0x3ad7);
				}
				if (i_2_ == 31) {
					Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_3_];
					if (class38_sub7_sub1 != null) {
						Class5.method66(0, class38_sub7_sub1.anIntArray2694[0], 2, class38_sub7_sub1.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Class51.anInt798 = 0;
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class23_Sub7.anInt2213 = 2;
						Class23_Sub13_Sub9.anInt3852++;
						Class23_Sub7.outBuffer.method486(82, b + 3058);
						Class23_Sub7.outBuffer.method427(i_3_, b + -1371695366);
					}
				}
				if (i_2_ == 22) {
					Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
					if (class38_sub7_sub2 != null) {
						Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
						Class23_Sub7.anInt2213 = 2;
						Class82.anInt1446++;
						Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
						Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
						Class51.anInt798 = 0;
						Class23_Sub7.outBuffer.method486(245, 2976);
						Class23_Sub7.outBuffer.method443(i_3_, (byte) 51);
					}
				}
				if (i_2_ == 36) {
					RuntimeException_Sub1.anInt1853++;
					Class23_Sub7.outBuffer.method486(133, 2976);
					Class23_Sub7.outBuffer.method439((byte) -128, i_1_);
					Class23_Sub7.outBuffer.method443(i_0_, (byte) 51);
					Class23_Sub7.outBuffer.method427(i_3_, b ^ 0x51c26906);
					Class23_Sub4_Sub38.anInt3500 = 0;
					Class32.aClass64_502 = Class23_Sub24.method905(i_1_, (byte) 111);
					Class24.anInt362 = i_0_;
				}
				if (Class38_Sub7_Sub1.anInt4374 != 0) {
					Class38_Sub7_Sub1.anInt4374 = 0;
					Class91.method1450((byte) 29, Class23_Sub24.method905(Class49.anInt759, (byte) 111));
				}
				if (Class23_Sub13_Sub7.aBoolean3792) {
					Class23_Sub4_Sub36.method415(1);
				}
				if (Class32.aClass64_502 != null && Class23_Sub4_Sub38.anInt3500 == 0) {
					Class91.method1450((byte) 29, Class32.aClass64_502);
				}
			}
		}
	}
	
	static final Class43_Sub1[] method1273(int i, Class105 class105, boolean bool, int i_6_) {
		anInt4426++;
		if (bool != true) {
			method1275((byte) 121);
		}
		if (!Class23_Sub4_Sub29.method385(class105, 0, i, i_6_)) {
			return null;
		}
		return Class23_Sub4.method263(112);
	}
	
	static final void method1274(int i) {
		Class23_Sub4_Sub10.anInt3061 = 0;
		Class23_Sub2.anInt2048 = 0;
		anInt4436++;
		Class23_Sub4_Sub26.method379(7028);
		Class23_Sub13_Sub19.method809(false);
		Class23_Sub23.method897((byte) 41);
		if (i == 7966) {
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (Class23_Sub4_Sub10.anInt3061 ^ 0xffffffff); i_7_++) {
				int i_8_ = Class54.anIntArray857[i_7_];
				if ((Class89.anInt1511 ^ 0xffffffff) != (Class31.aClass38_Sub7_Sub1Array483[i_8_].anInt2698 ^ 0xffffffff)) {
					Class31.aClass38_Sub7_Sub1Array483[i_8_].aClass23_Sub13_Sub20_4373 = null;
					Class31.aClass38_Sub7_Sub1Array483[i_8_] = null;
				}
			}
			if ((Class23_Sub4_Sub2.anInt2925 ^ 0xffffffff) != (Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position ^ 0xffffffff)) {
				throw new RuntimeException("gnp1 pos:" + Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position + " psize:" + Class23_Sub4_Sub2.anInt2925);
			}
			for (int i_9_ = 0; (Class23_Sub4_Sub18.anInt3191 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
				if (Class31.aClass38_Sub7_Sub1Array483[Class23_Sub4_Sub17.anIntArray3170[i_9_]] == null) {
					throw new RuntimeException("gnp2 pos:" + i_9_ + " size:" + Class23_Sub4_Sub18.anInt3191);
				}
			}
		}
	}
	
	public static void method1275(byte b) {
		aClass16_4429 = null;
		aClass16_4417 = null;
		aClass16_4445 = null;
		aClass16_4447 = null;
		aClass16_4441 = null;
		aClass16_4460 = null;
		aClass16_4420 = null;
		aClass16_4450 = null;
		aClass16_4454 = null;
		aClass16_4439 = null;
		aClass16_4418 = null;
		aClass16_4455 = null;
		aClass16_4453 = null;
		aClass16_4463 = null;
		aClass16_4414 = null;
		aClass16_4462 = null;
		aClass16_4442 = null;
		aClass16_4443 = null;
		aClass16_4423 = null;
		aClass16_4435 = null;
		aClass16_4444 = null;
		aClass16_4427 = null;
		aClass16_4461 = null;
		aClass16_4425 = null;
		aClass16_4434 = null;
		aClass16_4416 = null;
		aClass16_4456 = null;
		aClass16_4446 = null;
		if (b < 74) {
			method1275((byte) 26);
		}
		aClass16_4438 = null;
		aClass16_4464 = null;
		aClass23_Sub13_Sub8_Sub1_Sub1_4431 = null;
		aClass16_4437 = null;
		aClass16_4432 = null;
		aClass16_4440 = null;
		aClass16_4422 = null;
		aClass16_4448 = null;
		aClass16_4424 = null;
		aClass16_4419 = null;
		aClass16_4452 = null;
		aClass16_4433 = null;
		aClass16_4430 = null;
		aClass16_4459 = null;
		aClass16_4458 = null;
	}
	
	static final void method1276(int i, int i_10_) {
		anInt4421++;
		client.method36((byte) 102);
		Class23_Sub27.method914(25);
		int i_11_ = Class35.method978(-50, i_10_).anInt3725;
		if ((i_11_ ^ 0xffffffff) != -1) {
			if (i != 16428) {
				method1273(-2, null, true, 65);
			}
			int i_12_ = Class23_Sub4_Sub26.anIntArray3323[i_10_];
			if (i_11_ == 1) {
				Class23_Sub14.anInt2336 = i_12_;
				if (Class23_Sub14.anInt2336 == 1) {
					Class76.method1326(0.9F);
				}
				if (Class23_Sub14.anInt2336 == 2) {
					Class76.method1326(0.8F);
				}
				if (Class23_Sub14.anInt2336 == 3) {
					Class76.method1326(0.7F);
				}
				if (Class23_Sub14.anInt2336 == 4) {
					Class76.method1326(0.6F);
				}
				Class23_Sub21.method890((byte) 127);
			}
			if (i_11_ == 3) {
				int i_13_ = 0;
				if ((i_12_ ^ 0xffffffff) == -1) {
					i_13_ = 255;
				}
				if (i_12_ == 1) {
					i_13_ = 192;
				}
				if (i_12_ == 2) {
					i_13_ = 128;
				}
				if (i_12_ == 3) {
					i_13_ = 64;
				}
				if (i_12_ == 4) {
					i_13_ = 0;
				}
				if (i_13_ != Class21.anInt342) {
					if (Class21.anInt342 == 0 && Class83.anInt1460 != -1) {
						Class23_Sub13_Sub16.method778(Class83.anInt1460, CacheFileChannel.aClass105_Sub1_457, 1, 0, i_13_, false);
						Class105.aBoolean1806 = false;
					} else if ((i_13_ ^ 0xffffffff) != -1) {
						Class65.method1229(i_13_, 110);
					} else {
						Class23_Sub13_Sub9.method689(false);
						Class105.aBoolean1806 = false;
					}
					Class21.anInt342 = i_13_;
				}
			}
			if (i_11_ == 6) {
				Class14.anInt275 = i_12_;
			}
			if (i_11_ == 4) {
				if (i_12_ == 0) {
					Class23_Sub4_Sub2.anInt2920 = 127;
				}
				if (i_12_ == 1) {
					Class23_Sub4_Sub2.anInt2920 = 96;
				}
				if (i_12_ == 2) {
					Class23_Sub4_Sub2.anInt2920 = 64;
				}
				if (i_12_ == 3) {
					Class23_Sub4_Sub2.anInt2920 = 32;
				}
				if (i_12_ == 4) {
					Class23_Sub4_Sub2.anInt2920 = 0;
				}
			}
			if (i_11_ == 5) {
				Class95.anInt1612 = i_12_;
			}
			if (i_11_ == 9) {
				Class75.anInt1376 = i_12_;
			}
			if (i_11_ == 10) {
				if (i_12_ == 0) {
					Class94.anInt1604 = 127;
				}
				if (i_12_ == 1) {
					Class94.anInt1604 = 96;
				}
				if (i_12_ == 2) {
					Class94.anInt1604 = 64;
				}
				if (i_12_ == 3) {
					Class94.anInt1604 = 32;
				}
				if (i_12_ == 4) {
					Class94.anInt1604 = 0;
				}
			}
		}
	}
	
	static {
		aClass16_4430 = aClass16_4417;
		aClass16_4420 = aClass16_4417;
		aClass16_4418 = aClass16_4417;
		anInt4415 = 10;
		aClass16_4446 = aClass16_4417;
		aClass16_4416 = aClass16_4417;
		aClass16_4452 = aClass16_4417;
		aClass16_4424 = aClass16_4417;
		aClass16_4423 = aClass16_4417;
		aClass16_4427 = aClass16_4417;
		aClass16_4440 = aClass16_4417;
		aClass16_4434 = aClass16_4417;
		aClass16_4422 = aClass16_4417;
		aClass16_4437 = aClass16_4417;
		aClass16_4445 = aClass16_4417;
		aClass16_4456 = aClass16_4417;
		aClass16_4425 = aClass16_4417;
		anInt4457 = -1;
		aClass16_4450 = aClass16_4417;
		aClass16_4461 = aClass16_4417;
		aClass16_4448 = aClass16_4417;
		aClass16_4432 = aClass16_4417;
		aClass16_4447 = aClass16_4417;
		aClass16_4454 = aClass16_4417;
		aClass16_4438 = aClass16_4417;
		aClass16_4459 = aClass16_4417;
		aClass16_4435 = aClass16_4417;
		aClass16_4442 = aClass16_4417;
		aClass16_4419 = aClass16_4417;
		aClass16_4463 = Class38_Sub6.method1076((byte) 86, "Continue");
		aClass16_4444 = aClass16_4417;
		aClass16_4439 = aClass16_4417;
		aClass16_4429 = aClass16_4417;
		aClass16_4433 = aClass16_4417;
		aClass16_4414 = aClass16_4417;
		aClass16_4464 = Class38_Sub6.method1076((byte) 86, "Examine");
		aClass16_4462 = aClass16_4464;
		aClass16_4458 = aClass16_4463;
		aClass16_4460 = aClass16_4417;
	}
}
