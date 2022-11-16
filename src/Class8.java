/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class8
{
	static int anInt171;
	static oa anOa172 = new oa(4096);
	static int anInt173;
	private static RSString aClass16_174;
	static int anInt175 = 0;
	static RSString aClass16_176;
	static int anInt177;
	static Class89 aClass89_178;
	static int anInt179;
	static int anInt180;
	
	static final void method96(Class23_Sub1 class23_sub1, boolean bool) {
		Class73.aClass89_1316.method1439(80, class23_sub1);
		for (;;) {
			Class23_Sub1 class23_sub1_0_ = (Class23_Sub1) Class73.aClass89_1316.method1436(-105);
			if (class23_sub1_0_ == null) {
				break;
			}
			if (class23_sub1_0_.aBoolean2036) {
				int i = class23_sub1_0_.anInt2020;
				int i_1_ = class23_sub1_0_.anInt2018;
				int i_2_ = class23_sub1_0_.anInt2041;
				int i_3_ = class23_sub1_0_.anInt2017;
				Class23_Sub1[][] class23_sub1s = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_2_];
				if (class23_sub1_0_.aBoolean2021) {
					if (bool) {
						if (i_2_ > 0) {
							Class23_Sub1 class23_sub1_4_ = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_2_ - 1][i][i_1_];
							if (class23_sub1_4_ != null && class23_sub1_4_.aBoolean2036) {
								continue;
							}
						}
						if (i <= Canvas_Sub1.anInt51 && i > Class23_Sub4_Sub37.anInt3493) {
							Class23_Sub1 class23_sub1_5_ = class23_sub1s[i - 1][i_1_];
							if (class23_sub1_5_ != null && class23_sub1_5_.aBoolean2036 && (class23_sub1_5_.aBoolean2021 || (class23_sub1_0_.anInt2040 & 0x1) == 0)) {
								continue;
							}
						}
						if (i >= Canvas_Sub1.anInt51 && i < Class23_Sub4_Sub7.anInt3004 - 1) {
							Class23_Sub1 class23_sub1_6_ = class23_sub1s[i + 1][i_1_];
							if (class23_sub1_6_ != null && class23_sub1_6_.aBoolean2036 && (class23_sub1_6_.aBoolean2021 || (class23_sub1_0_.anInt2040 & 0x4) == 0)) {
								continue;
							}
						}
						if (i_1_ <= Class23_Sub4_Sub33.anInt3425 && i_1_ > Class23_Sub1.anInt2006) {
							Class23_Sub1 class23_sub1_7_ = class23_sub1s[i][i_1_ - 1];
							if (class23_sub1_7_ != null && class23_sub1_7_.aBoolean2036 && (class23_sub1_7_.aBoolean2021 || (class23_sub1_0_.anInt2040 & 0x8) == 0)) {
								continue;
							}
						}
						if (i_1_ >= Class23_Sub4_Sub33.anInt3425 && i_1_ < Class23_Sub24.anInt2448 - 1) {
							Class23_Sub1 class23_sub1_8_ = class23_sub1s[i][i_1_ + 1];
							if (class23_sub1_8_ != null && class23_sub1_8_.aBoolean2036 && (class23_sub1_8_.aBoolean2021 || (class23_sub1_0_.anInt2040 & 0x2) == 0)) {
								continue;
							}
						}
					} else {
						bool = true;
					}
					class23_sub1_0_.aBoolean2021 = false;
					if (class23_sub1_0_.aClass23_Sub1_2022 != null) {
						Class23_Sub1 class23_sub1_9_ = class23_sub1_0_.aClass23_Sub1_2022;
						if (class23_sub1_9_.aClass104_2025 != null) {
							if (!Class19.method199(0, i, i_1_)) {
								Class23_Sub7.method495(class23_sub1_9_.aClass104_2025, 0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i, i_1_, false);
							} else {
								Class23_Sub7.method495(class23_sub1_9_.aClass104_2025, 0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i, i_1_, true);
							}
						} else if (class23_sub1_9_.aClass52_2023 != null) {
							if (!Class19.method199(0, i, i_1_)) {
								Class23_Sub13_Sub13.method759(class23_sub1_9_.aClass52_2023, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i, i_1_, false);
							} else {
								Class23_Sub13_Sub13.method759(class23_sub1_9_.aClass52_2023, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i, i_1_, true);
							}
						}
						Class83 class83 = class23_sub1_9_.aClass83_2031;
						if (class83 != null) {
							class83.aClass38_1463.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class83.anInt1457 - Class17.anInt311, class83.anInt1469 - Class61.anInt956, class83.anInt1465 - Class23_Sub4_Sub23.anInt3281, class83.aLong1473);
						}
						for (int i_10_ = 0; i_10_ < class23_sub1_9_.anInt2029; i_10_++) {
							Class39 class39 = class23_sub1_9_.aClass39Array2028[i_10_];
							if (class39 != null) {
								class39.aClass38_615.method995(class39.anInt612, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class39.anInt602 - Class17.anInt311, class39.anInt608 - Class61.anInt956, class39.anInt610 - Class23_Sub4_Sub23.anInt3281, class39.aLong603);
							}
						}
					}
					boolean bool_11_ = false;
					if (class23_sub1_0_.aClass104_2025 != null) {
						if (!Class19.method199(i_3_, i, i_1_)) {
							bool_11_ = true;
							if (class23_sub1_0_.aClass104_2025.anInt1743 != 12345678 || Class23_Sub13_Sub9.aBoolean3858 && i_2_ <= Class71_Sub3.anInt2742) {
								Class23_Sub7.method495(class23_sub1_0_.aClass104_2025, i_3_, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i, i_1_, false);
							}
						} else {
							Class23_Sub7.method495(class23_sub1_0_.aClass104_2025, i_3_, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i, i_1_, true);
						}
					} else if (class23_sub1_0_.aClass52_2023 != null) {
						if (!Class19.method199(i_3_, i, i_1_)) {
							bool_11_ = true;
							Class23_Sub13_Sub13.method759(class23_sub1_0_.aClass52_2023, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i, i_1_, false);
						} else {
							Class23_Sub13_Sub13.method759(class23_sub1_0_.aClass52_2023, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i, i_1_, true);
						}
					}
					int i_12_ = 0;
					int i_13_ = 0;
					Class83 class83 = class23_sub1_0_.aClass83_2031;
					Class24 class24 = class23_sub1_0_.aClass24_2038;
					if (class83 != null || class24 != null) {
						if (Canvas_Sub1.anInt51 == i) {
							i_12_++;
						} else if (Canvas_Sub1.anInt51 < i) {
							i_12_ += 2;
						}
						if (Class23_Sub4_Sub33.anInt3425 == i_1_) {
							i_12_ += 3;
						} else if (Class23_Sub4_Sub33.anInt3425 > i_1_) {
							i_12_ += 6;
						}
						i_13_ = Class23_Sub1.anIntArray2039[i_12_];
						class23_sub1_0_.anInt2013 = Class25.anIntArray382[i_12_];
					}
					if (class83 != null) {
						if ((class83.anInt1461 & Class11.anIntArray224[i_12_]) != 0) {
							if (class83.anInt1461 == 16) {
								class23_sub1_0_.anInt2015 = 3;
								class23_sub1_0_.anInt2027 = Class54.anIntArray858[i_12_];
								class23_sub1_0_.anInt2014 = 3 - class23_sub1_0_.anInt2027;
							} else if (class83.anInt1461 == 32) {
								class23_sub1_0_.anInt2015 = 6;
								class23_sub1_0_.anInt2027 = Class71.anIntArray1271[i_12_];
								class23_sub1_0_.anInt2014 = 6 - class23_sub1_0_.anInt2027;
							} else if (class83.anInt1461 == 64) {
								class23_sub1_0_.anInt2015 = 12;
								class23_sub1_0_.anInt2027 = Class50.anIntArray774[i_12_];
								class23_sub1_0_.anInt2014 = 12 - class23_sub1_0_.anInt2027;
							} else {
								class23_sub1_0_.anInt2015 = 9;
								class23_sub1_0_.anInt2027 = Class26.anIntArray398[i_12_];
								class23_sub1_0_.anInt2014 = 9 - class23_sub1_0_.anInt2027;
							}
						} else {
							class23_sub1_0_.anInt2015 = 0;
						}
						if ((class83.anInt1461 & i_13_) != 0 && !Class21.method226(i_3_, i, i_1_, class83.anInt1461)) {
							class83.aClass38_1463.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class83.anInt1457 - Class17.anInt311, class83.anInt1469 - Class61.anInt956, class83.anInt1465 - Class23_Sub4_Sub23.anInt3281, class83.aLong1473);
						}
						if ((class83.anInt1472 & i_13_) != 0 && !Class21.method226(i_3_, i, i_1_, class83.anInt1472)) {
							class83.aClass38_1468.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class83.anInt1457 - Class17.anInt311, class83.anInt1469 - Class61.anInt956, class83.anInt1465 - Class23_Sub4_Sub23.anInt3281, class83.aLong1473);
						}
					}
					if (class24 != null && !Class23_Sub13_Sub19.method811(i_3_, i, i_1_, class24.aClass38_367.method999())) {
						if ((class24.anInt378 & i_13_) != 0) {
							class24.aClass38_367.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class24.anInt366 - Class17.anInt311 + class24.anInt375, class24.anInt370 - Class61.anInt956, class24.anInt363 - Class23_Sub4_Sub23.anInt3281 + class24.anInt371, class24.aLong364);
						} else if (class24.anInt378 == 256) {
							int i_14_ = class24.anInt366 - Class17.anInt311;
							int i_15_ = class24.anInt370 - Class61.anInt956;
							int i_16_ = class24.anInt363 - Class23_Sub4_Sub23.anInt3281;
							int i_17_ = class24.anInt374;
							int i_18_;
							if (i_17_ == 1 || i_17_ == 2) {
								i_18_ = -i_14_;
							} else {
								i_18_ = i_14_;
							}
							int i_19_;
							if (i_17_ == 2 || i_17_ == 3) {
								i_19_ = -i_16_;
							} else {
								i_19_ = i_16_;
							}
							if (i_19_ < i_18_) {
								class24.aClass38_367.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i_14_ + class24.anInt375, i_15_, i_16_ + class24.anInt371, class24.aLong364);
							} else if (class24.aClass38_369 != null) {
								class24.aClass38_369.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i_14_, i_15_, i_16_, class24.aLong364);
							}
						}
					}
					if (bool_11_) {
						Class69 class69 = class23_sub1_0_.aClass69_2034;
						if (class69 != null) {
							class69.aClass38_1219.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class69.anInt1221 - Class17.anInt311, class69.anInt1213 - Class61.anInt956, class69.anInt1210 - Class23_Sub4_Sub23.anInt3281, class69.aLong1209);
						}
						Class46 class46 = class23_sub1_0_.aClass46_2026;
						if (class46 != null && class46.anInt709 == 0) {
							if (class46.aClass38_702 != null) {
								class46.aClass38_702.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class46.anInt705 - Class17.anInt311, class46.anInt703 - Class61.anInt956, class46.anInt706 - Class23_Sub4_Sub23.anInt3281, class46.aLong711);
							}
							if (class46.aClass38_718 != null) {
								class46.aClass38_718.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class46.anInt705 - Class17.anInt311, class46.anInt703 - Class61.anInt956, class46.anInt706 - Class23_Sub4_Sub23.anInt3281, class46.aLong711);
							}
							if (class46.aClass38_704 != null) {
								class46.aClass38_704.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class46.anInt705 - Class17.anInt311, class46.anInt703 - Class61.anInt956, class46.anInt706 - Class23_Sub4_Sub23.anInt3281, class46.aLong711);
							}
						}
					}
					int i_20_ = class23_sub1_0_.anInt2040;
					if (i_20_ != 0) {
						if (i < Canvas_Sub1.anInt51 && (i_20_ & 0x4) != 0) {
							Class23_Sub1 class23_sub1_21_ = class23_sub1s[i + 1][i_1_];
							if (class23_sub1_21_ != null && class23_sub1_21_.aBoolean2036) {
								Class73.aClass89_1316.method1439(-109, class23_sub1_21_);
							}
						}
						if (i_1_ < Class23_Sub4_Sub33.anInt3425 && (i_20_ & 0x2) != 0) {
							Class23_Sub1 class23_sub1_22_ = class23_sub1s[i][i_1_ + 1];
							if (class23_sub1_22_ != null && class23_sub1_22_.aBoolean2036) {
								Class73.aClass89_1316.method1439(120, class23_sub1_22_);
							}
						}
						if (i > Canvas_Sub1.anInt51 && (i_20_ & 0x1) != 0) {
							Class23_Sub1 class23_sub1_23_ = class23_sub1s[i - 1][i_1_];
							if (class23_sub1_23_ != null && class23_sub1_23_.aBoolean2036) {
								Class73.aClass89_1316.method1439(-122, class23_sub1_23_);
							}
						}
						if (i_1_ > Class23_Sub4_Sub33.anInt3425 && (i_20_ & 0x8) != 0) {
							Class23_Sub1 class23_sub1_24_ = class23_sub1s[i][i_1_ - 1];
							if (class23_sub1_24_ != null && class23_sub1_24_.aBoolean2036) {
								Class73.aClass89_1316.method1439(-112, class23_sub1_24_);
							}
						}
					}
				}
				if (class23_sub1_0_.anInt2015 != 0) {
					boolean bool_25_ = true;
					for (int i_26_ = 0; i_26_ < class23_sub1_0_.anInt2029; i_26_++) {
						if (class23_sub1_0_.aClass39Array2028[i_26_].anInt614 != Class73.anInt1321 && (class23_sub1_0_.anIntArray2024[i_26_] & class23_sub1_0_.anInt2015) == class23_sub1_0_.anInt2027) {
							bool_25_ = false;
							break;
						}
					}
					if (bool_25_) {
						Class83 class83 = class23_sub1_0_.aClass83_2031;
						if (!Class21.method226(i_3_, i, i_1_, class83.anInt1461)) {
							class83.aClass38_1463.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class83.anInt1457 - Class17.anInt311, class83.anInt1469 - Class61.anInt956, class83.anInt1465 - Class23_Sub4_Sub23.anInt3281, class83.aLong1473);
						}
						class23_sub1_0_.anInt2015 = 0;
					}
				}
				if (class23_sub1_0_.aBoolean2033) {
					try {
						int i_27_ = class23_sub1_0_.anInt2029;
						class23_sub1_0_.aBoolean2033 = false;
						int i_28_ = 0;
					while_10_:
						for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
							Class39 class39 = class23_sub1_0_.aClass39Array2028[i_29_];
							if (class39.anInt614 != Class73.anInt1321) {
								for (int i_30_ = class39.anInt601; i_30_ <= class39.anInt613; i_30_++) {
									for (int i_31_ = class39.anInt607; i_31_ <= class39.anInt599; i_31_++) {
										Class23_Sub1 class23_sub1_32_ = class23_sub1s[i_30_][i_31_];
										if (class23_sub1_32_.aBoolean2021) {
											class23_sub1_0_.aBoolean2033 = true;
											continue while_10_;
										}
										if (class23_sub1_32_.anInt2015 != 0) {
											int i_33_ = 0;
											if (i_30_ > class39.anInt601) {
												i_33_++;
											}
											if (i_30_ < class39.anInt613) {
												i_33_ += 4;
											}
											if (i_31_ > class39.anInt607) {
												i_33_ += 8;
											}
											if (i_31_ < class39.anInt599) {
												i_33_ += 2;
											}
											if ((i_33_ & class23_sub1_32_.anInt2015) == class23_sub1_0_.anInt2014) {
												class23_sub1_0_.aBoolean2033 = true;
												continue while_10_;
											}
										}
									}
								}
								Class23_Sub17.aClass39Array2362[i_28_++] = class39;
								int i_34_ = Canvas_Sub1.anInt51 - class39.anInt601;
								int i_35_ = class39.anInt613 - Canvas_Sub1.anInt51;
								if (i_35_ > i_34_) {
									i_34_ = i_35_;
								}
								int i_36_ = Class23_Sub4_Sub33.anInt3425 - class39.anInt607;
								int i_37_ = class39.anInt599 - Class23_Sub4_Sub33.anInt3425;
								if (i_37_ > i_36_) {
									class39.anInt611 = i_34_ + i_37_;
								} else {
									class39.anInt611 = i_34_ + i_36_;
								}
							}
						}
						while (i_28_ > 0) {
							int i_38_ = -50;
							int i_39_ = -1;
							for (int i_40_ = 0; i_40_ < i_28_; i_40_++) {
								Class39 class39 = Class23_Sub17.aClass39Array2362[i_40_];
								if (class39.anInt614 != Class73.anInt1321) {
									if (class39.anInt611 > i_38_) {
										i_38_ = class39.anInt611;
										i_39_ = i_40_;
									} else if (class39.anInt611 == i_38_) {
										int i_41_ = class39.anInt602 - Class17.anInt311;
										int i_42_ = class39.anInt610 - Class23_Sub4_Sub23.anInt3281;
										int i_43_ = Class23_Sub17.aClass39Array2362[i_39_].anInt602 - Class17.anInt311;
										int i_44_ = Class23_Sub17.aClass39Array2362[i_39_].anInt610 - Class23_Sub4_Sub23.anInt3281;
										if (i_41_ * i_41_ + i_42_ * i_42_ > i_43_ * i_43_ + i_44_ * i_44_) {
											i_39_ = i_40_;
										}
									}
								}
							}
							if (i_39_ == -1) {
								break;
							}
							Class39 class39 = Class23_Sub17.aClass39Array2362[i_39_];
							class39.anInt614 = Class73.anInt1321;
							if (!Class23_Sub4_Sub15.method327(i_3_, class39.anInt601, class39.anInt613, class39.anInt607, class39.anInt599, class39.aClass38_615.method999())) {
								class39.aClass38_615.method995(class39.anInt612, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class39.anInt602 - Class17.anInt311, class39.anInt608 - Class61.anInt956, class39.anInt610 - Class23_Sub4_Sub23.anInt3281, class39.aLong603);
							}
							for (int i_45_ = class39.anInt601; i_45_ <= class39.anInt613; i_45_++) {
								for (int i_46_ = class39.anInt607; i_46_ <= class39.anInt599; i_46_++) {
									Class23_Sub1 class23_sub1_47_ = class23_sub1s[i_45_][i_46_];
									if (class23_sub1_47_.anInt2015 != 0) {
										Class73.aClass89_1316.method1439(-98, class23_sub1_47_);
									} else if ((i_45_ != i || i_46_ != i_1_) && class23_sub1_47_.aBoolean2036) {
										Class73.aClass89_1316.method1439(23, class23_sub1_47_);
									}
								}
							}
						}
						if (class23_sub1_0_.aBoolean2033) {
							continue;
						}
					} catch (Exception exception) {
						class23_sub1_0_.aBoolean2033 = false;
					}
				}
				if (class23_sub1_0_.aBoolean2036 && class23_sub1_0_.anInt2015 == 0) {
					if (i <= Canvas_Sub1.anInt51 && i > Class23_Sub4_Sub37.anInt3493) {
						Class23_Sub1 class23_sub1_48_ = class23_sub1s[i - 1][i_1_];
						if (class23_sub1_48_ != null && class23_sub1_48_.aBoolean2036) {
							continue;
						}
					}
					if (i >= Canvas_Sub1.anInt51 && i < Class23_Sub4_Sub7.anInt3004 - 1) {
						Class23_Sub1 class23_sub1_49_ = class23_sub1s[i + 1][i_1_];
						if (class23_sub1_49_ != null && class23_sub1_49_.aBoolean2036) {
							continue;
						}
					}
					if (i_1_ <= Class23_Sub4_Sub33.anInt3425 && i_1_ > Class23_Sub1.anInt2006) {
						Class23_Sub1 class23_sub1_50_ = class23_sub1s[i][i_1_ - 1];
						if (class23_sub1_50_ != null && class23_sub1_50_.aBoolean2036) {
							continue;
						}
					}
					if (i_1_ >= Class23_Sub4_Sub33.anInt3425 && i_1_ < Class23_Sub24.anInt2448 - 1) {
						Class23_Sub1 class23_sub1_51_ = class23_sub1s[i][i_1_ + 1];
						if (class23_sub1_51_ != null && class23_sub1_51_.aBoolean2036) {
							continue;
						}
					}
					class23_sub1_0_.aBoolean2036 = false;
					Class11.anInt221--;
					Class46 class46 = class23_sub1_0_.aClass46_2026;
					if (class46 != null && class46.anInt709 != 0) {
						if (class46.aClass38_702 != null) {
							class46.aClass38_702.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class46.anInt705 - Class17.anInt311, class46.anInt703 - Class61.anInt956 - class46.anInt709, class46.anInt706 - Class23_Sub4_Sub23.anInt3281, class46.aLong711);
						}
						if (class46.aClass38_718 != null) {
							class46.aClass38_718.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class46.anInt705 - Class17.anInt311, class46.anInt703 - Class61.anInt956 - class46.anInt709, class46.anInt706 - Class23_Sub4_Sub23.anInt3281, class46.aLong711);
						}
						if (class46.aClass38_704 != null) {
							class46.aClass38_704.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class46.anInt705 - Class17.anInt311, class46.anInt703 - Class61.anInt956 - class46.anInt709, class46.anInt706 - Class23_Sub4_Sub23.anInt3281, class46.aLong711);
						}
					}
					if (class23_sub1_0_.anInt2013 != 0) {
						Class24 class24 = class23_sub1_0_.aClass24_2038;
						if (class24 != null && !Class23_Sub13_Sub19.method811(i_3_, i, i_1_, class24.aClass38_367.method999())) {
							if ((class24.anInt378 & class23_sub1_0_.anInt2013) != 0) {
								class24.aClass38_367.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class24.anInt366 - Class17.anInt311 + class24.anInt375, class24.anInt370 - Class61.anInt956, class24.anInt363 - Class23_Sub4_Sub23.anInt3281 + class24.anInt371, class24.aLong364);
							} else if (class24.anInt378 == 256) {
								int i_52_ = class24.anInt366 - Class17.anInt311;
								int i_53_ = class24.anInt370 - Class61.anInt956;
								int i_54_ = class24.anInt363 - Class23_Sub4_Sub23.anInt3281;
								int i_55_ = class24.anInt374;
								int i_56_;
								if (i_55_ == 1 || i_55_ == 2) {
									i_56_ = -i_52_;
								} else {
									i_56_ = i_52_;
								}
								int i_57_;
								if (i_55_ == 2 || i_55_ == 3) {
									i_57_ = -i_54_;
								} else {
									i_57_ = i_54_;
								}
								if (i_57_ >= i_56_) {
									class24.aClass38_367.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i_52_ + class24.anInt375, i_53_, i_54_ + class24.anInt371, class24.aLong364);
								} else if (class24.aClass38_369 != null) {
									class24.aClass38_369.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, i_52_, i_53_, i_54_, class24.aLong364);
								}
							}
						}
						Class83 class83 = class23_sub1_0_.aClass83_2031;
						if (class83 != null) {
							if ((class83.anInt1472 & class23_sub1_0_.anInt2013) != 0 && !Class21.method226(i_3_, i, i_1_, class83.anInt1472)) {
								class83.aClass38_1468.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class83.anInt1457 - Class17.anInt311, class83.anInt1469 - Class61.anInt956, class83.anInt1465 - Class23_Sub4_Sub23.anInt3281, class83.aLong1473);
							}
							if ((class83.anInt1461 & class23_sub1_0_.anInt2013) != 0 && !Class21.method226(i_3_, i, i_1_, class83.anInt1461)) {
								class83.aClass38_1463.method995(0, Class25.anInt381, Class23_Sub4_Sub6.anInt2980, Class58.anInt906, Class87.anInt1495, class83.anInt1457 - Class17.anInt311, class83.anInt1469 - Class61.anInt956, class83.anInt1465 - Class23_Sub4_Sub23.anInt3281, class83.aLong1473);
							}
						}
					}
					if (i_2_ < Class23_Sub4_Sub18.anInt3196 - 1) {
						Class23_Sub1 class23_sub1_58_ = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_2_ + 1][i][i_1_];
						if (class23_sub1_58_ != null && class23_sub1_58_.aBoolean2036) {
							Class73.aClass89_1316.method1439(126, class23_sub1_58_);
						}
					}
					if (i < Canvas_Sub1.anInt51) {
						Class23_Sub1 class23_sub1_59_ = class23_sub1s[i + 1][i_1_];
						if (class23_sub1_59_ != null && class23_sub1_59_.aBoolean2036) {
							Class73.aClass89_1316.method1439(107, class23_sub1_59_);
						}
					}
					if (i_1_ < Class23_Sub4_Sub33.anInt3425) {
						Class23_Sub1 class23_sub1_60_ = class23_sub1s[i][i_1_ + 1];
						if (class23_sub1_60_ != null && class23_sub1_60_.aBoolean2036) {
							Class73.aClass89_1316.method1439(-113, class23_sub1_60_);
						}
					}
					if (i > Canvas_Sub1.anInt51) {
						Class23_Sub1 class23_sub1_61_ = class23_sub1s[i - 1][i_1_];
						if (class23_sub1_61_ != null && class23_sub1_61_.aBoolean2036) {
							Class73.aClass89_1316.method1439(67, class23_sub1_61_);
						}
					}
					if (i_1_ > Class23_Sub4_Sub33.anInt3425) {
						Class23_Sub1 class23_sub1_62_ = class23_sub1s[i][i_1_ - 1];
						if (class23_sub1_62_ != null && class23_sub1_62_.aBoolean2036) {
							Class73.aClass89_1316.method1439(50, class23_sub1_62_);
						}
					}
				}
			}
		}
	}
	
	public static void method97(int i) {
		aClass16_176 = null;
		if (i > 38) {
			aClass89_178 = null;
			aClass16_174 = null;
			anOa172 = null;
		}
	}
	
	static final void method98(int i) {
		for (int i_63_ = 0; i_63_ < Class71_Sub3.anInt2741; i_63_++) {
			Class23_Sub17.anIntArray2368[i_63_]--;
			if (Class23_Sub17.anIntArray2368[i_63_] < -10) {
				Class71_Sub3.anInt2741--;
				for (int i_64_ = i_63_; Class71_Sub3.anInt2741 > i_64_; i_64_++) {
					Class58.anIntArray904[i_64_] = Class58.anIntArray904[i_64_ - -1];
					Class91.aClass18Array1554[i_64_] = Class91.aClass18Array1554[i_64_ - -1];
					Class23_Sub13_Sub6.anIntArray3738[i_64_] = Class23_Sub13_Sub6.anIntArray3738[1 + i_64_];
					Class23_Sub17.anIntArray2368[i_64_] = Class23_Sub17.anIntArray2368[1 + i_64_];
					Class88.anIntArray1497[i_64_] = Class88.anIntArray1497[i_64_ - -1];
				}
				i_63_--;
			} else {
				Class18 class18 = Class91.aClass18Array1554[i_63_];
				if (class18 == null) {
					class18 = Class18.method195(Class30.aClass105_Sub1_475, Class58.anIntArray904[i_63_], 0);
					if (class18 == null) {
						continue;
					}
					Class23_Sub17.anIntArray2368[i_63_] += class18.method194();
					Class91.aClass18Array1554[i_63_] = class18;
				}
				if ((Class23_Sub17.anIntArray2368[i_63_] ^ 0xffffffff) > -1) {
					int i_65_;
					if ((Class88.anIntArray1497[i_63_] ^ 0xffffffff) == -1) {
						i_65_ = Class23_Sub4_Sub2.anInt2920;
					} else {
						int i_66_ = (0xff & Class88.anIntArray1497[i_63_]) * 128;
						int i_67_ = 0xff & Class88.anIntArray1497[i_63_] >> 16;
						int i_68_ = 64 + i_67_ * 128 + -Class105.aClass38_Sub7_Sub2_1812.anInt2674;
						if (i_68_ < 0) {
							i_68_ = -i_68_;
						}
						int i_69_ = 0xff & Class88.anIntArray1497[i_63_] >> 8;
						int i_70_ = 128 * i_69_ + (64 - Class105.aClass38_Sub7_Sub2_1812.anInt2659);
						if ((i_70_ ^ 0xffffffff) > -1) {
							i_70_ = -i_70_;
						}
						int i_71_ = -128 + (i_70_ + i_68_);
						if ((i_71_ ^ 0xffffffff) < (i_66_ ^ 0xffffffff)) {
							Class23_Sub17.anIntArray2368[i_63_] = -100;
							continue;
						}
						if ((i_71_ ^ 0xffffffff) > -1) {
							i_71_ = 0;
						}
						i_65_ = Class94.anInt1604 * (i_66_ + -i_71_) / i_66_;
					}
					if ((i_65_ ^ 0xffffffff) < -1) {
						Class23_Sub6_Sub1 class23_sub6_sub1 = class18.method196().method493(Class83.aClass45_1462);
						Class23_Sub10_Sub1 class23_sub10_sub1 = Class23_Sub10_Sub1.method510(class23_sub6_sub1, 100, i_65_);
						class23_sub10_sub1.method536(-1 + Class23_Sub13_Sub6.anIntArray3738[i_63_]);
						Class23_Sub7.aClass23_Sub10_Sub4_2201.method590(class23_sub10_sub1);
					}
					Class23_Sub17.anIntArray2368[i_63_] = -100;
				}
			}
		}
		if (i >= 104) {
			if (Class105.aBoolean1806 && !Class23_Sub4_Sub19.method343((byte) -37)) {
				if (Class21.anInt342 != 0 && Class83.anInt1460 != -1) {
					Class23_Sub13_Sub16.method778(Class83.anInt1460, Class29.aClass105_Sub1_457, 1, 0, Class21.anInt342, false);
				}
				Class105.aBoolean1806 = false;
			} else if ((Class21.anInt342 ^ 0xffffffff) != -1 && Class83.anInt1460 != -1 && !Class23_Sub4_Sub19.method343((byte) -37)) {
				Class23_Sub7.outBuffer.method486(144, 2976);
				Class23_Sub7.outBuffer.writeIntBE(Class83.anInt1460, -1137894376);
				Class27.anInt408++;
				Class83.anInt1460 = -1;
			}
			anInt173++;
		}
	}
	
	static {
		aClass16_174 = Class38_Sub6.method1076((byte) 86, "Prepared sound engine");
		anInt177 = 0;
		aClass16_176 = aClass16_174;
		anInt180 = 0;
		aClass89_178 = new Class89();
	}
}
